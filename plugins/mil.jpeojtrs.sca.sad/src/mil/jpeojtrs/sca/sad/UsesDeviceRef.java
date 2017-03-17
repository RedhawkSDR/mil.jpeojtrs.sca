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

import mil.jpeojtrs.sca.spd.UsesDevice;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Device Ref</b></em>'.
 * @since 4.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getRefid <em>Refid</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice <em>Uses Device</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getUsesDeviceRef()
 * @model
 * @generated
 */
public interface UsesDeviceRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refid</em>' attribute.
	 * @see #setRefid(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getUsesDeviceRef_Refid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='refid'"
	 * @generated
	 */
	String getRefid();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getRefid <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refid</em>' attribute.
	 * @see #getRefid()
	 * @generated
	 */
	void setRefid(String value);

	/**
	 * Returns the value of the '<em><b>Uses Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Device</em>' reference.
	 * @see #setUsesDevice(UsesDevice)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getUsesDeviceRef_UsesDevice()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	UsesDevice getUsesDevice();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice <em>Uses Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Device</em>' reference.
	 * @see #getUsesDevice()
	 * @generated
	 */
	void setUsesDevice(UsesDevice value);

} // UsesDeviceRef
