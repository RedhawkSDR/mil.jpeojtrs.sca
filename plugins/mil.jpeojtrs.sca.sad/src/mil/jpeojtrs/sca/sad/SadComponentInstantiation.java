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

import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.Requirements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getFindComponent <em>Find Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getDeviceRequires <em>Device Requires</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadComponentInstantiation()
 * @model extendedMetaData="name='componentinstantiation' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface SadComponentInstantiation extends ComponentInstantiation {

	/**
	 * Returns the value of the '<em><b>Find Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Component</em>' containment reference.
	 * @see #setFindComponent(FindComponent)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadComponentInstantiation_FindComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='findcomponent' namespace='##targetNamespace'"
	 * @generated
	 */
	FindComponent getFindComponent();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getFindComponent <em>Find Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Component</em>' containment reference.
	 * @see #getFindComponent()
	 * @generated
	 */
	void setFindComponent(FindComponent value);

	/**
	 * Returns the value of the '<em><b>Device Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Gets the {@link Requirements} that an executable device must have for this component instance to be executed on
	 * it.
	 * </p>
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Requires</em>' containment reference.
	 * @see #setDeviceRequires(Requirements)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadComponentInstantiation_DeviceRequires()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devicerequires' namespace='##targetNamespace'"
	 * @generated
	 */
	Requirements getDeviceRequires();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getDeviceRequires <em>Device Requires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Requires</em>' containment reference.
	 * @see #getDeviceRequires()
	 * @generated
	 */
	void setDeviceRequires(Requirements value);

} // ComponentInstantiation
