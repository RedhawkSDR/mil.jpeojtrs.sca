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
package mil.jpeojtrs.sca.spd;

import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Descriptor#getLocalfile <em>Localfile</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Descriptor#getComponent <em>Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Descriptor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDescriptor()
 * @model extendedMetaData="name='descriptor' kind='elementOnly'"
 * @generated
 */
public interface Descriptor extends EObject {

	/**
	 * Returns the value of the '<em><b>Localfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localfile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localfile</em>' containment reference.
	 * @see #setLocalfile(LocalFile)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDescriptor_Localfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalFile getLocalfile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Descriptor#getLocalfile <em>Localfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localfile</em>' containment reference.
	 * @see #getLocalfile()
	 * @generated
	 */
	void setLocalfile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(SoftwareComponent)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDescriptor_Component()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	SoftwareComponent getComponent();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Descriptor#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(SoftwareComponent value);

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
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDescriptor_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Descriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Descriptor
