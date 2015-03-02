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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage
 * @generated
 */
public interface PartitioningFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartitioningFactory eINSTANCE = mil.jpeojtrs.sca.partitioning.impl.PartitioningFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dom Component File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dom Component File</em>'.
	 * @generated
	 */
	DomComponentFile createDomComponentFile();

	/**
	 * Returns a new object of class '<em>Dev Component File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dev Component File</em>'.
	 * @generated
	 */
	DevComponentFile createDevComponentFile();

	/**
	 * Returns a new object of class '<em>Component File Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component File Ref</em>'.
	 * @generated
	 */
	ComponentFileRef createComponentFileRef();

	/**
	 * Returns a new object of class '<em>Component Files</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Files</em>'.
	 * @generated
	 */
	ComponentFiles createComponentFiles();

	/**
	 * Returns a new object of class '<em>Component Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation</em>'.
	 * @generated
	 */
	ComponentInstantiation createComponentInstantiation();

	/**
	 * Returns a new object of class '<em>Component Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Properties</em>'.
	 * @generated
	 */
	ComponentProperties createComponentProperties();

	/**
	 * Returns a new object of class '<em>Component Supported Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Supported Interface</em>'.
	 * @generated
	 */
	ComponentSupportedInterface createComponentSupportedInterface();

	/**
	 * Returns a new object of class '<em>Component Supported Interface Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Supported Interface Stub</em>'.
	 * @generated
	 */
	ComponentSupportedInterfaceStub createComponentSupportedInterfaceStub();

	/**
	 * Returns a new object of class '<em>Device That Loaded This Component Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device That Loaded This Component Ref</em>'.
	 * @generated
	 */
	DeviceThatLoadedThisComponentRef createDeviceThatLoadedThisComponentRef();

	/**
	 * Returns a new object of class '<em>Device Used By This Component Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Used By This Component Ref</em>'.
	 * @generated
	 */
	DeviceUsedByThisComponentRef createDeviceUsedByThisComponentRef();

	/**
	 * Returns a new object of class '<em>Device Used By Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Used By Application</em>'.
	 * @generated
	 * @since 2.0
	 */
	DeviceUsedByApplication createDeviceUsedByApplication();

	/**
	 * Returns a new object of class '<em>Domain Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Finder</em>'.
	 * @generated
	 */
	DomainFinder createDomainFinder();

	/**
	 * Returns a new object of class '<em>Find By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find By</em>'.
	 * @generated
	 */
	FindBy createFindBy();

	/**
	 * A utility method that returns a new FindBy configured to find the domain manager
	 * @return The FindBy instance
	 * @since 2.0
	 */
	FindBy createFindByDomainManager();

	/**
	 * A utility method that returns a new FindBy configured to search the domain for an event channel with a
	 * particular name.
	 * @param name The event channel name
	 * @return The FindBy instance
	 * @since 2.0
	 */
	FindBy createFindByEventChannel(String name);

	/**
	 * A utility method that returns a new FindBy configured to find the file manager
	 * @return The FindBy instance
	 * @since 2.0
	 */
	FindBy createFindByFileManager();

	/**
	 * A utility method that returns a new FindBy configured to use the naming service for a particular name.
	 * @param name The name of the object to find via the naming service.
	 * @return The FindBy instance
	 * @since 2.0
	 */
	FindBy createFindByNamingServiceName(String name);

	/**
	 * A utility method that returns a new FindBy configured to search the domain for a service with a particular name.
	 * @param name The name of the service to find in the domain
	 * @return The FindBy instance
	 * @since 2.0
	 */
	FindBy createFindByServiceName(String name);

	/**
	 * A utility method that returns a new FindBy configured to search the domain for a service with a particular IDL type.
	 * @param type The IDL type of the service to find in the domain
	 * @return The FindBy instance
	 * @since 2.0
	 */
	FindBy createFindByServiceType(String type);

	/**
	 * Returns a new object of class '<em>Find By Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find By Stub</em>'.
	 * @generated
	 */
	FindByStub createFindByStub();

	/**
	 * Returns a new object of class '<em>Find By Stub Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find By Stub Container</em>'.
	 * @generated
	 */
	FindByStubContainer createFindByStubContainer();

	/**
	 * Returns a new object of class '<em>Local File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local File</em>'.
	 * @generated
	 */
	LocalFile createLocalFile();

	/**
	 * Returns a new object of class '<em>Naming Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming Service</em>'.
	 * @generated
	 */
	NamingService createNamingService();

	/**
	 * Returns a new object of class '<em>Provides Port Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Port Stub</em>'.
	 * @generated
	 */
	ProvidesPortStub createProvidesPortStub();

	/**
	 * Returns a new object of class '<em>Uses Port Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Port Stub</em>'.
	 * @generated
	 */
	UsesPortStub createUsesPortStub();

	/**
	 * Returns a new object of class '<em>Uses Device Stub</em>'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Device Stub</em>'.
	 * @generated
	 */
	UsesDeviceStub createUsesDeviceStub();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PartitioningPackage getPartitioningPackage();

} //PartitioningFactory
