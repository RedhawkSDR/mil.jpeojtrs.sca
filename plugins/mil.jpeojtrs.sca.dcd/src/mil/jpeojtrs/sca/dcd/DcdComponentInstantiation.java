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
package mil.jpeojtrs.sca.dcd;

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
 *   <li>{@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiation#getDeployerRequires <em>Deployer Requires</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentInstantiation()
 * @model extendedMetaData="name='componentinstantiation' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface DcdComponentInstantiation extends ComponentInstantiation {

	/**
	 * Returns the value of the '<em><b>Deployer Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Gets the {@link Requirements} that a component instance must have for it to be executed on this device.
	 * </p>
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployer Requires</em>' containment reference.
	 * @see #setDeployerRequires(Requirements)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentInstantiation_DeployerRequires()
	 * @model containment="true"
	 *        extendedMetaData="name='deployerrequires' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Requirements getDeployerRequires();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiation#getDeployerRequires <em>Deployer Requires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployer Requires</em>' containment reference.
	 * @see #getDeployerRequires()
	 * @generated
	 */
	void setDeployerRequires(Requirements value);
} // DcdComponentInstantiation
