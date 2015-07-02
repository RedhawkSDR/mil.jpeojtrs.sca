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
package mil.jpeojtrs.sca.dcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.FileSystemName#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.FileSystemName#getMountName <em>Mount Name</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getFileSystemName()
 * @model extendedMetaData="name='filesystemname' kind='empty'"
 * @generated
 */
public interface FileSystemName extends EObject {

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getFileSystemName_DeviceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='deviceid'"
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.FileSystemName#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>Mount Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mount Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Name</em>' attribute.
	 * @see #setMountName(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getFileSystemName_MountName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mountname'"
	 * @generated
	 */
	String getMountName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.FileSystemName#getMountName <em>Mount Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Name</em>' attribute.
	 * @see #getMountName()
	 * @generated
	 */
	void setMountName(String value);

} // FileSystemName
