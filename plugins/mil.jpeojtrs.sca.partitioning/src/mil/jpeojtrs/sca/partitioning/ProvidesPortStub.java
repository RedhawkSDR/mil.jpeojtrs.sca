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

import mil.jpeojtrs.sca.scd.Provides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Port Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPortStub()
 * @model extendedMetaData="kind='elementOnly' name='providesportstub' qualified='false'"
 * @generated
 */
public interface ProvidesPortStub extends ConnectionTarget {

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPortStub_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference.
	 * @see #setProvides(Provides)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPortStub_Provides()
	 * @model transient="true"
	 *        extendedMetaData="kind='attribute' name='provides'"
	 * @generated
	 */
	Provides getProvides();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getProvides <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' reference.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(Provides value);

} // ProvidesPortStub
