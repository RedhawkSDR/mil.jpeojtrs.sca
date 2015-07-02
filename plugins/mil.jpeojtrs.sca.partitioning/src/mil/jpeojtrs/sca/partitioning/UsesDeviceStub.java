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

import mil.jpeojtrs.sca.spd.UsesDevice;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Device Stub</b></em>'.
 * @since 2.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesDevice <em>Uses Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getProvidesPortStubs <em>Provides Port Stubs</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesPortStubs <em>Uses Port Stubs</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesDeviceStub()
 * @model extendedMetaData="kind='elementOnly' name='deviceportstub' qualified='false'"
 * @generated
 */
public interface UsesDeviceStub extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Device</em>' reference.
	 * @see #setUsesDevice(UsesDevice)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesDeviceStub_UsesDevice()
	 * @model
	 * @generated
	 */
	UsesDevice getUsesDevice();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesDevice <em>Uses Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Device</em>' reference.
	 * @see #getUsesDevice()
	 * @generated
	 */
	void setUsesDevice(UsesDevice value);

	/**
	 * Returns the value of the '<em><b>Provides Port Stubs</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Port Stubs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Port Stubs</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesDeviceStub_ProvidesPortStubs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidesPortStub> getProvidesPortStubs();

	/**
	 * Returns the value of the '<em><b>Uses Port Stubs</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.UsesPortStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Port Stubs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Port Stubs</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesDeviceStub_UsesPortStubs()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsesPortStub> getUsesPortStubs();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(ComponentSupportedInterfaceStub)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getUsesDeviceStub_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceports'"
	 * @generated
	 */
	ComponentSupportedInterfaceStub getInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ComponentSupportedInterfaceStub value);

} // UsesDeviceStub
