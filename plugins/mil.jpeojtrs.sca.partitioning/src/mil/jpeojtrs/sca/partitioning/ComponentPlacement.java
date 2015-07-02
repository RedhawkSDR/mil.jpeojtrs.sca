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
 * A representation of the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentFileRef <em>Component File Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentInstantiation <em>Component Instantiation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentPlacement()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='componentplacement' qualified='false'"
 * @generated
 */
public interface ComponentPlacement< I extends ComponentInstantiation > extends EObject {

	/**
	 * Returns the value of the '<em><b>Component File Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component File Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component File Ref</em>' containment reference.
	 * @see #setComponentFileRef(ComponentFileRef)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentPlacement_ComponentFileRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentfileref'"
	 * @generated
	 */
	ComponentFileRef getComponentFileRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentFileRef <em>Component File Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component File Ref</em>' containment reference.
	 * @see #getComponentFileRef()
	 * @generated
	 */
	void setComponentFileRef(ComponentFileRef value);

	/**
	 * Returns the value of the '<em><b>Component Instantiation</b></em>' containment reference list.
	 * It is bidirectional and its opposite is '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instantiation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instantiation</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentPlacement_ComponentInstantiation()
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getPlacement
	 * @model opposite="placement" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentinstantiation'"
	 * @generated
	 */
	EList<I> getComponentInstantiation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentPlacement_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

} // ComponentPlacement
