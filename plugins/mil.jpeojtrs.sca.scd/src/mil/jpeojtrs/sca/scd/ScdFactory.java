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
package mil.jpeojtrs.sca.scd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.scd.ScdPackage
 * @generated
 */
public interface ScdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScdFactory eINSTANCE = mil.jpeojtrs.sca.scd.impl.ScdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Features</em>'.
	 * @generated
	 */
	ComponentFeatures createComponentFeatures();

	/**
	 * Returns a new object of class '<em>Component Rep Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Rep Id</em>'.
	 * @generated
	 */
	ComponentRepId createComponentRepId();

	/**
	 * Returns a new object of class '<em>Inherits Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherits Interface</em>'.
	 * @generated
	 */
	InheritsInterface createInheritsInterface();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	// END GENERATED CODE

	/**
	 * Returns a new object of class '<em>Interface</em>' initialized with the specified repid.
	 * @since 4.0
	 */
	Interface createInterface(String repid);

	// BEGIN GENERATED CODE

	/**
	 * Returns a new object of class '<em>Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaces</em>'.
	 * @generated
	 */
	Interfaces createInterfaces();

	/**
	 * Returns a new object of class '<em>Local File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local File</em>'.
	 * @generated
	 */
	LocalFile createLocalFile();

	/**
	 * Returns a new object of class '<em>Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ports</em>'.
	 * @generated
	 */
	Ports createPorts();

	/**
	 * Returns a new object of class '<em>Port Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type Container</em>'.
	 * @generated
	 */
	PortTypeContainer createPortTypeContainer();

	/**
	 * Returns a new object of class '<em>Property File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property File</em>'.
	 * @generated
	 */
	PropertyFile createPropertyFile();

	/**
	 * Returns a new object of class '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides</em>'.
	 * @generated
	 */
	Provides createProvides();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	ScdDocumentRoot createScdDocumentRoot();

	/**
	 * Returns a new object of class '<em>Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Component</em>'.
	 * @generated
	 */
	SoftwareComponent createSoftwareComponent();

	/**
	 * Returns a new object of class '<em>Supports Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supports Interface</em>'.
	 * @generated
	 */
	SupportsInterface createSupportsInterface();

	/**
	 * Returns a new object of class '<em>Uses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses</em>'.
	 * @generated
	 */
	Uses createUses();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScdPackage getScdPackage();

	/**
	 * Creates the port type container.
	 * 
	 * @param type the type
	 * 
	 * @return the port type container
	 */
	PortTypeContainer createPortTypeContainer(PortType type);

} // ScdFactory
