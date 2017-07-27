/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad;

import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.DomComponentFile;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.SadPackage
 * @generated
 */
public interface SadFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SadFactory eINSTANCE = mil.jpeojtrs.sca.sad.impl.SadFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assembly Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Controller</em>'.
	 * @generated
	 */
	AssemblyController createAssemblyController();

	/**
	 * Returns a new object of class '<em>Component Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation</em>'.
	 * @generated
	 */
	SadComponentInstantiation createSadComponentInstantiation();

	/**
	 * Creates a new component instantiation.
	 * @param id
	 * @param startOrder
	 * @param usageName
	 * @param namingServiceName
	 * @return
	 * @since 3.1
	 */
	SadComponentInstantiation createSadComponentInstantiation(String id, BigInteger startOrder, String usageName, String namingServiceName);

	/**
	 * Returns a new object of class '<em>Component Instantiation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation Ref</em>'.
	 * @generated
	 */
	SadComponentInstantiationRef createSadComponentInstantiationRef();

	/**
	 * Returns a new object of class '<em>Uses Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Port</em>'.
	 * @generated
	 */
	SadUsesPort createSadUsesPort();

	/**
	 * A utility method that returns a new SadUsesPort for a specific component's port.
	 * @param usesIdentifier The identifier of the uses port
	 * @param componentRefId The component instance's ID in the SoftwareAssembly
	 * @return
	 * @since 3.0
	 */
	SadUsesPort createSadUsesPort(String usesIdentifier, String componentRefId);

	/**
	 * Returns a new object of class '<em>Provides Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Port</em>'.
	 * @generated
	 */
	SadProvidesPort createSadProvidesPort();

	/**
	 * A utility method that returns a new SadUsesPort for a specific component's port.
	 * @param providesIdentifier The identifier of the provides port
	 * @param componentRefId The component instance's ID in the SoftwareAssembly
	 * @return
	 * @since 3.1
	 */
	SadProvidesPort createSadProvidesPort(String providesIdentifier, String componentRefId);

	/**
	 * Returns a new object of class '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Interface</em>'.
	 * @generated
	 */
	SadConnectInterface createSadConnectInterface();

	/**
	 * Creates a SAD connect interface between ports of two component instances.
	 * @param connectionId
	 * @param usesPortName
	 * @param usesComponentInstanceId
	 * @param providesPortName
	 * @param providesComponentInstanceId
	 * @return
	 * @since 3.1
	 */
	SadConnectInterface createSadConnectInterface(String connectionId, String usesPortName, String usesComponentInstanceId, String providesPortName,
		String providesComponentInstanceId);

	/**
	 * Returns a new object of class '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connections</em>'.
	 * @generated
	 */
	SadConnections createSadConnections();

	/**
	 * Returns a new object of class '<em>Component Resource Factory Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Resource Factory Ref</em>'.
	 * @generated
	 */
	ComponentResourceFactoryRef createComponentResourceFactoryRef();

	/**
	 * Returns a new object of class '<em>External Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ports</em>'.
	 * @generated
	 */
	ExternalPorts createExternalPorts();

	/**
	 * Returns a new object of class '<em>External Properties</em>'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Properties</em>'.
	 * @generated
	 */
	ExternalProperties createExternalProperties();

	/**
	 * Returns a new object of class '<em>External Property</em>'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Property</em>'.
	 * @generated
	 */
	ExternalProperty createExternalProperty();

	/**
	 * Returns a new object of class '<em>Find Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Component</em>'.
	 * @generated
	 */
	FindComponent createFindComponent();

	/**
	 * Returns a new object of class '<em>Host Collocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Collocation</em>'.
	 * @generated
	 */
	HostCollocation createHostCollocation();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Partitioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partitioning</em>'.
	 * @generated
	 */
	SadPartitioning createSadPartitioning();

	/**
	 * Returns a new object of class '<em>Component Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Placement</em>'.
	 * @generated
	 */
	SadComponentPlacement createSadComponentPlacement();

	/**
	 * Returns a new object of class '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation</em>'.
	 * @generated
	 */
	Reservation createReservation();

	/**
	 * Creates a new component placement.
	 * @param componentFileRef
	 * @param instances
	 * @return
	 * @since 3.1
	 */
	SadComponentPlacement createSadComponentPlacement(ComponentFileRef componentFileRef, Collection<SadComponentInstantiation> instances);

	/**
	 * Returns a new object of class '<em>Resource Factory Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Factory Properties</em>'.
	 * @generated
	 */
	ResourceFactoryProperties createResourceFactoryProperties();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	SadDocumentRoot createSadDocumentRoot();

	/**
	 * Returns a new object of class '<em>Software Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Assembly</em>'.
	 * @generated
	 */
	SoftwareAssembly createSoftwareAssembly();

	/**
	 * Returns a new object of class '<em>Uses Device Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Device Dependencies</em>'.
	 * @generated
	 */
	UsesDeviceDependencies createUsesDeviceDependencies();

	/**
	 * Returns a new object of class '<em>Uses Device Ref</em>'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Device Ref</em>'.
	 * @generated
	 */
	UsesDeviceRef createUsesDeviceRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SadPackage getSadPackage();

	/**
	 * Create a new component file.
	 * @return
	 */
	DomComponentFile createComponentFile();

	/**
	 * Create a new component file.
	 * @param idPrefix The prefix to the ID (will be suffixed with a UUID)
	 * @param localFileName
	 * @return
	 * @since 3.1
	 */
	DomComponentFile createComponentFile(String idPrefix, String localFileName);

} //SadFactory
