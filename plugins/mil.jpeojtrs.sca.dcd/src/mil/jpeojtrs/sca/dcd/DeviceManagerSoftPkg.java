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

import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.spd.SoftPkg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Manager Soft Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg <em>Soft Pkg</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceManagerSoftPkg()
 * @model extendedMetaData="name='devicemanagersoftpkg' kind='elementOnly'"
 * @generated
 */
public interface DeviceManagerSoftPkg extends EObject {

	/**
	 * Returns the value of the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local File</em>' containment reference.
	 * @see #setLocalFile(LocalFile)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceManagerSoftPkg_LocalFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile'"
	 * @generated
	 */
	LocalFile getLocalFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getLocalFile <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File</em>' containment reference.
	 * @see #getLocalFile()
	 * @generated
	 */
	void setLocalFile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Pkg</em>' reference.
	 * @see #setSoftPkg(SoftPkg)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceManagerSoftPkg_SoftPkg()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='softPkg'"
	 * @generated
	 */
	SoftPkg getSoftPkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg <em>Soft Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Pkg</em>' reference.
	 * @see #getSoftPkg()
	 * @generated
	 */
	void setSoftPkg(SoftPkg value);

} // DeviceManagerSoftPkg
