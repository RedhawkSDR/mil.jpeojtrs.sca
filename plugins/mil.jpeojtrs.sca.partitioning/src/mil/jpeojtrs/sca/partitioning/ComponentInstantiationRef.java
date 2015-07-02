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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getRefid <em>Refid</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiationRef()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='componentinstantiationref' qualified='false'"
 * @generated
 */
public interface ComponentInstantiationRef< R extends ComponentInstantiation > extends EObject {

	/**
	 * Returns the value of the '<em><b>Instantiation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation</em>' reference.
	 * @see #setInstantiation(ComponentInstantiation)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiationRef_Instantiation()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='instantiation'"
	 * @generated
	 */
	R getInstantiation();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation <em>Instantiation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation</em>' reference.
	 * @see #getInstantiation()
	 * @generated
	 */
	void setInstantiation(R value);

	/**
	 * Returns the value of the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refid</em>' attribute.
	 * @see #setRefid(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiationRef_Refid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='refid'"
	 * @generated
	 */
	String getRefid();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getRefid <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refid</em>' attribute.
	 * @see #getRefid()
	 * @generated
	 */
	void setRefid(String value);

} // ComponentInstantiationRef
