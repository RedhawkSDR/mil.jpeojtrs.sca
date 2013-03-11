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
package mil.jpeojtrs.sca.dmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dmd.DmdPackage
 * @generated
 */
public interface DmdFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmdFactory eINSTANCE = mil.jpeojtrs.sca.dmd.impl.DmdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DmdDocumentRoot createDmdDocumentRoot();

	/**
	 * Returns a new object of class '<em>Domain Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Finder</em>'.
	 * @generated
	 */
	DomainFinder createDomainFinder();

	/**
	 * Returns a new object of class '<em>Domain Manager Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Manager Configuration</em>'.
	 * @generated
	 */
	DomainManagerConfiguration createDomainManagerConfiguration();

	/**
	 * Returns a new object of class '<em>Domain Manager Soft Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Manager Soft Pkg</em>'.
	 * @generated
	 */
	DomainManagerSoftPkg createDomainManagerSoftPkg();

	/**
	 * Returns a new object of class '<em>Find By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find By</em>'.
	 * @generated
	 */
	FindBy createFindBy();

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
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services</em>'.
	 * @generated
	 */
	Services createServices();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmdPackage getDmdPackage();

} //DmdFactory
