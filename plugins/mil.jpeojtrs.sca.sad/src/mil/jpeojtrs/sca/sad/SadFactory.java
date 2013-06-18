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
package mil.jpeojtrs.sca.sad;

import mil.jpeojtrs.sca.partitioning.DomComponentFile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @noimplement This interface is not intended to be implemented by clients.
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
	 * Returns a new object of class '<em>Provides Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Port</em>'.
	 * @generated
	 */
	SadProvidesPort createSadProvidesPort();

	/**
	 * Returns a new object of class '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Interface</em>'.
	 * @generated
	 */
	SadConnectInterface createSadConnectInterface();

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
	 * 
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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SadPackage getSadPackage();

	/**
	 * Helper method to create compentfile files that are to be referenced from an SAD
	 * @return DomComponentFile
	 */
	DomComponentFile createComponentFile();

} //SadFactory
