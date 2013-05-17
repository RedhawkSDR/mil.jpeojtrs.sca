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
package mil.jpeojtrs.sca.dpd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Pkg Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkgRef()
 * @model extendedMetaData="name='devicepkgref' kind='elementOnly'"
 * @generated
 */
public interface DevicePkgRef extends EObject {

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
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkgRef_LocalFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalFile getLocalFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getLocalFile <em>Local File</em>}' containment reference.
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
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkgRef_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // DevicePkgRef
