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
package mil.jpeojtrs.sca.partitioning;

import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Port Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getUses <em>Uses</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesPortStub()
 * @model
 * @generated
 */
public interface UsesPortStub extends EObject {

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesPortStub_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(Uses)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesPortStub_Uses()
	 * @model transient="true"
	 *        extendedMetaData="kind='attribute' name='uses'"
	 * @generated
	 */
	Uses getUses();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Uses value);

	/**
	 * Returns the value of the '<em><b>Supported Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Identifier</em>' attribute.
	 * @see #setSupportedIdentifier(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesPortStub_SupportedIdentifier()
	 * @model extendedMetaData="kind='attribute' name='supportedIdentifier'"
	 * @generated
	 */
	String getSupportedIdentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getSupportedIdentifier <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Identifier</em>' attribute.
	 * @see #getSupportedIdentifier()
	 * @generated
	 */
	void setSupportedIdentifier(String value);

} // UsesPortStub
