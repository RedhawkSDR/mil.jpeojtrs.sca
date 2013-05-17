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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.Connections#getConnectInterface <em>Connect Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnections()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='connections' qualified='false'"
 * @generated
 */
public interface Connections<CI extends ConnectInterface<?, ?, ?>> extends EObject {

	/**
	 * Returns the value of the '<em><b>Connect Interface</b></em>' containment reference list.
	 * The list contents are of type {@link CI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Interface</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnections_ConnectInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectinterface'"
	 * @generated
	 */
	EList<CI> getConnectInterface();

} // Connections
