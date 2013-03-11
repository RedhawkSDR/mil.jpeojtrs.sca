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
package mil.jpeojtrs.sca.dcd;

import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.partitioning.LocalFile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Pkg File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The devicepkgfile element is used to refer to a device package file that contains the hardware
 * device definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg <em>Device Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDevicePkgFile()
 * @model extendedMetaData="name='devicepkgfile' kind='elementOnly'"
 * @generated
 */
public interface DevicePkgFile extends EObject {

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
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDevicePkgFile_LocalFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile'"
	 * @generated
	 */
	LocalFile getLocalFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getLocalFile <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File</em>' containment reference.
	 * @see #getLocalFile()
	 * @generated
	 */
	void setLocalFile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDevicePkgFile_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Device Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Pkg</em>' reference.
	 * @see #setDevicePkg(DevicePkg)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDevicePkgFile_DevicePkg()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	DevicePkg getDevicePkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg <em>Device Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Pkg</em>' reference.
	 * @see #getDevicePkg()
	 * @generated
	 */
	void setDevicePkg(DevicePkg value);

} // DevicePkgFile
