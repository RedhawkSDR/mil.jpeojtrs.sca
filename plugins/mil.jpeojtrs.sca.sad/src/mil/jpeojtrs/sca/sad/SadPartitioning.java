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
package mil.jpeojtrs.sca.sad;

import mil.jpeojtrs.sca.partitioning.Partitioning;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.SadPartitioning#getHostCollocation <em>Host Collocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadPartitioning()
 * @model extendedMetaData="name='partitioning' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface SadPartitioning extends Partitioning<SadComponentPlacement> {

	/**
	 * Returns the value of the '<em><b>Host Collocation</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.sad.HostCollocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Collocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Collocation</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadPartitioning_HostCollocation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hostcollocation' group='#parts:0'"
	 * @generated
	 */
	EList<HostCollocation> getHostCollocation();

} // Partitioning
