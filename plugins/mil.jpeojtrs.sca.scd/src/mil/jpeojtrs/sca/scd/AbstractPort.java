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
 * A representation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getPortType <em>Port Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getRepID <em>Rep ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getAbstractPort()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPort extends EObject {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getAbstractPort_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.AbstractPort#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.scd.PortTypeContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getAbstractPort_PortType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='porttype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PortTypeContainer> getPortType();

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
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getAbstractPort_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" transient="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.AbstractPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rep ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repid attribute is the unique repository id of the interface, which has formats specified in the CORBA specification. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rep ID</em>' attribute.
	 * @see #setRepID(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getAbstractPort_RepID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='repid'"
	 * @generated
	 */
	String getRepID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.AbstractPort#getRepID <em>Rep ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep ID</em>' attribute.
	 * @see #getRepID()
	 * @generated
	 */
	void setRepID(String value);

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
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getAbstractPort_Interface()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.AbstractPort#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isBiDirectional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AbstractPort getSibling();

} // AbstractPort
