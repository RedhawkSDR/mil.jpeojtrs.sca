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
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.Partitioning#getParts <em>Parts</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.Partitioning#getComponentPlacement <em>Component Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getPartitioning()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='partitioning' qualified='false'"
 * @generated
 */
public interface Partitioning<C extends ComponentPlacement<?>> extends EObject {

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' attribute list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getPartitioning_Parts()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='parts:0'"
	 * @generated
	 */
	FeatureMap getParts();

	/**
	 * Returns the value of the '<em><b>Component Placement</b></em>' containment reference list.
	 * The list contents are of type {@link C}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Placement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Placement</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getPartitioning_ComponentPlacement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentplacement' group='#parts:0'"
	 * @generated
	 */
	EList<C> getComponentPlacement();

} // Partitioning
