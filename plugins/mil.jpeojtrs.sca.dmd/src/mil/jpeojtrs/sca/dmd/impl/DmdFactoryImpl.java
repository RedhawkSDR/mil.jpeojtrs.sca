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
package mil.jpeojtrs.sca.dmd.impl;

import mil.jpeojtrs.sca.dmd.DmdDocumentRoot;
import mil.jpeojtrs.sca.dmd.DmdFactory;
import mil.jpeojtrs.sca.dmd.DmdPackage;
import mil.jpeojtrs.sca.dmd.DomainFinder;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg;
import mil.jpeojtrs.sca.dmd.FindBy;
import mil.jpeojtrs.sca.dmd.LocalFile;
import mil.jpeojtrs.sca.dmd.NamingService;
import mil.jpeojtrs.sca.dmd.Service;
import mil.jpeojtrs.sca.dmd.Services;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmdFactoryImpl extends EFactoryImpl implements DmdFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DmdFactory init() {
		try {
			DmdFactory theDmdFactory = (DmdFactory)EPackage.Registry.INSTANCE.getEFactory("http://sca.jpeojtrs.mil/dmd"); 
			if (theDmdFactory != null) {
				return theDmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DmdPackage.DMD_DOCUMENT_ROOT: return createDmdDocumentRoot();
			case DmdPackage.DOMAIN_FINDER: return createDomainFinder();
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION: return createDomainManagerConfiguration();
			case DmdPackage.DOMAIN_MANAGER_SOFT_PKG: return createDomainManagerSoftPkg();
			case DmdPackage.FIND_BY: return createFindBy();
			case DmdPackage.LOCAL_FILE: return createLocalFile();
			case DmdPackage.NAMING_SERVICE: return createNamingService();
			case DmdPackage.SERVICE: return createService();
			case DmdPackage.SERVICES: return createServices();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmdDocumentRoot createDmdDocumentRoot() {
		DmdDocumentRootImpl dmdDocumentRoot = new DmdDocumentRootImpl();
		return dmdDocumentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFinder createDomainFinder() {
		DomainFinderImpl domainFinder = new DomainFinderImpl();
		return domainFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManagerConfiguration createDomainManagerConfiguration() {
		DomainManagerConfigurationImpl domainManagerConfiguration = new DomainManagerConfigurationImpl();
		return domainManagerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManagerSoftPkg createDomainManagerSoftPkg() {
		DomainManagerSoftPkgImpl domainManagerSoftPkg = new DomainManagerSoftPkgImpl();
		return domainManagerSoftPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindBy createFindBy() {
		FindByImpl findBy = new FindByImpl();
		return findBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile createLocalFile() {
		LocalFileImpl localFile = new LocalFileImpl();
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingService createNamingService() {
		NamingServiceImpl namingService = new NamingServiceImpl();
		return namingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmdPackage getDmdPackage() {
		return (DmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DmdPackage getPackage() {
		return DmdPackage.eINSTANCE;
	}

} //DmdFactoryImpl
