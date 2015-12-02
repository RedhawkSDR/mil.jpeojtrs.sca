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

import mil.jpeojtrs.sca.partitioning.DevComponentFile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @noimplement This interface is not intended to be implemented by clients.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dcd.DcdPackage
 * @generated
 */
public interface DcdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcdFactory eINSTANCE = mil.jpeojtrs.sca.dcd.impl.DcdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Placement</em>'.
	 * @generated
	 */
	DcdComponentPlacement createDcdComponentPlacement();

	/**
	 * Returns a new object of class '<em>Component Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation</em>'.
	 * @generated
	 */
	DcdComponentInstantiation createDcdComponentInstantiation();

	/**
	 * Creates a new component instantiation.
	 * @param id
	 * @param usageName
	 * @return
	 * @since 3.1
	 */
	DcdComponentInstantiation createDcdComponentInstantiation(String id, String usageName);

	/**
	 * Returns a new object of class '<em>Partitioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partitioning</em>'.
	 * @generated
	 */
	DcdPartitioning createDcdPartitioning();

	/**
	 * Returns a new object of class '<em>Component Instantiation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation Ref</em>'.
	 * @generated
	 */
	DcdComponentInstantiationRef createDcdComponentInstantiationRef();

	/**
	 * Returns a new object of class '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Interface</em>'.
	 * @generated
	 */
	DcdConnectInterface createDcdConnectInterface();

	/**
	 * Returns a new object of class '<em>Uses Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Port</em>'.
	 * @generated
	 */
	DcdUsesPort createDcdUsesPort();

	/**
	 * Returns a new object of class '<em>Provides Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Port</em>'.
	 * @generated
	 */
	DcdProvidesPort createDcdProvidesPort();

	/**
	 * Returns a new object of class '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connections</em>'.
	 * @generated
	 */
	DcdConnections createDcdConnections();

	/**
	 * Returns a new object of class '<em>Composite Part Of Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Part Of Device</em>'.
	 * @generated
	 */
	CompositePartOfDevice createCompositePartOfDevice();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DcdDocumentRoot createDcdDocumentRoot();

	/**
	 * Returns a new object of class '<em>Deploy On Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploy On Device</em>'.
	 * @generated
	 */
	DeployOnDevice createDeployOnDevice();

	/**
	 * Returns a new object of class '<em>Device Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Configuration</em>'.
	 * @generated
	 */
	DeviceConfiguration createDeviceConfiguration();

	/**
	 * Returns a new object of class '<em>Device Manager Soft Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Manager Soft Pkg</em>'.
	 * @generated
	 */
	DeviceManagerSoftPkg createDeviceManagerSoftPkg();

	/**
	 * Returns a new object of class '<em>Device Pkg File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Pkg File</em>'.
	 * @generated
	 */
	DevicePkgFile createDevicePkgFile();

	/**
	 * Returns a new object of class '<em>Domain Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Manager</em>'.
	 * @generated
	 */
	DomainManager createDomainManager();

	/**
	 * Returns a new object of class '<em>File System Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System Name</em>'.
	 * @generated
	 */
	FileSystemName createFileSystemName();

	/**
	 * Returns a new object of class '<em>File System Names</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System Names</em>'.
	 * @generated
	 */
	FileSystemNames createFileSystemNames();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DcdPackage getDcdPackage();

	/**
	 * Creates a new component file.
	 * @return
	 */
	DevComponentFile createComponentFile();

	/**
	 * Creates a new component file.
	 * @param idPrefix The prefix to the ID (will be suffixed with a UUID)
	 * @param localFileName
	 * @return
	 * @since 3.1
	 */
	DevComponentFile createComponentFile(String idPrefix, String localFileName);

} //DcdFactory
