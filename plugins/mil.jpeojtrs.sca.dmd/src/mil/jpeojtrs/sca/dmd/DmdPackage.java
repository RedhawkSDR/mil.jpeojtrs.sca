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
package mil.jpeojtrs.sca.dmd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dmd.DmdFactory
 * @model kind="package"
 * @generated
 */
public interface DmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmd";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/dmd";
	String FILE_EXTENSION = ".dmd.xml";
	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	String eNS_PREFIX = "";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.dmd.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmdPackage eINSTANCE = mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.DmdDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdDocumentRootImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDmdDocumentRoot()
	 * @generated
	 */
	int DMD_DOCUMENT_ROOT = 0;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMD_DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Domainmanagerconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMD_DOCUMENT_ROOT__DOMAINMANAGERCONFIGURATION = 3;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMD_DOCUMENT_ROOT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.DomainFinderImpl <em>Domain Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.DomainFinderImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDomainFinder()
	 * @generated
	 */
	int DOMAIN_FINDER = 1;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FINDER__NAME = 0;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FINDER__TYPE = 1;
	/**
	 * The number of structural features of the '<em>Domain Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FINDER_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl <em>Domain Manager Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDomainManagerConfiguration()
	 * @generated
	 */
	int DOMAIN_MANAGER_CONFIGURATION = 2;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Domain Manager Soft Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG = 1;
	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_CONFIGURATION__SERVICES = 2;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_CONFIGURATION__ID = 3;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_CONFIGURATION__NAME = 4;
	/**
	 * The number of structural features of the '<em>Domain Manager Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_CONFIGURATION_FEATURE_COUNT = 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerSoftPkgImpl <em>Domain Manager Soft Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.DomainManagerSoftPkgImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDomainManagerSoftPkg()
	 * @generated
	 */
	int DOMAIN_MANAGER_SOFT_PKG = 3;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_SOFT_PKG__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_SOFT_PKG__SOFT_PKG = 1;
	/**
	 * The number of structural features of the '<em>Domain Manager Soft Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_SOFT_PKG_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.FindByImpl <em>Find By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.FindByImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getFindBy()
	 * @generated
	 */
	int FIND_BY = 4;
	/**
	 * The feature id for the '<em><b>Name Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY__NAME_SERVICE = 0;
	/**
	 * The feature id for the '<em><b>Stringified Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY__STRINGIFIED_OBJECT_REF = 1;
	/**
	 * The feature id for the '<em><b>Domain Finder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY__DOMAIN_FINDER = 2;
	/**
	 * The number of structural features of the '<em>Find By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.LocalFileImpl <em>Local File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.LocalFileImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getLocalFile()
	 * @generated
	 */
	int LOCAL_FILE = 5;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FILE__NAME = 0;
	/**
	 * The number of structural features of the '<em>Local File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FILE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.NamingServiceImpl <em>Naming Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.NamingServiceImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getNamingService()
	 * @generated
	 */
	int NAMING_SERVICE = 6;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_SERVICE__NAME = 0;
	/**
	 * The number of structural features of the '<em>Naming Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_SERVICE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.ServiceImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;
	/**
	 * The feature id for the '<em><b>Uses Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__USES_IDENTIFIER = 0;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FIND_BY = 1;
	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dmd.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.impl.ServicesImpl
	 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 8;
	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__SERVICE = 0;
	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.DmdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DmdDocumentRoot
	 * @generated
	 */
	EClass getDmdDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getMixed()
	 * @see #getDmdDocumentRoot()
	 * @generated
	 */
	EAttribute getDmdDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getXMLNSPrefixMap()
	 * @see #getDmdDocumentRoot()
	 * @generated
	 */
	EReference getDmdDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getXSISchemaLocation()
	 * @see #getDmdDocumentRoot()
	 * @generated
	 */
	EReference getDmdDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getDomainmanagerconfiguration <em>Domainmanagerconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domainmanagerconfiguration</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DmdDocumentRoot#getDomainmanagerconfiguration()
	 * @see #getDmdDocumentRoot()
	 * @generated
	 */
	EReference getDmdDocumentRoot_Domainmanagerconfiguration();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.DomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Finder</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainFinder
	 * @generated
	 */
	EClass getDomainFinder();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.DomainFinder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainFinder#getName()
	 * @see #getDomainFinder()
	 * @generated
	 */
	EAttribute getDomainFinder_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.DomainFinder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainFinder#getType()
	 * @see #getDomainFinder()
	 * @generated
	 */
	EAttribute getDomainFinder_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration <em>Domain Manager Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Manager Configuration</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration
	 * @generated
	 */
	EClass getDomainManagerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDescription()
	 * @see #getDomainManagerConfiguration()
	 * @generated
	 */
	EAttribute getDomainManagerConfiguration_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDomainManagerSoftPkg <em>Domain Manager Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Manager Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDomainManagerSoftPkg()
	 * @see #getDomainManagerConfiguration()
	 * @generated
	 */
	EReference getDomainManagerConfiguration_DomainManagerSoftPkg();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getServices()
	 * @see #getDomainManagerConfiguration()
	 * @generated
	 */
	EReference getDomainManagerConfiguration_Services();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getId()
	 * @see #getDomainManagerConfiguration()
	 * @generated
	 */
	EAttribute getDomainManagerConfiguration_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getName()
	 * @see #getDomainManagerConfiguration()
	 * @generated
	 */
	EAttribute getDomainManagerConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg <em>Domain Manager Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Manager Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg
	 * @generated
	 */
	EClass getDomainManagerSoftPkg();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getLocalFile()
	 * @see #getDomainManagerSoftPkg()
	 * @generated
	 */
	EReference getDomainManagerSoftPkg_LocalFile();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getSoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getSoftPkg()
	 * @see #getDomainManagerSoftPkg()
	 * @generated
	 */
	EReference getDomainManagerSoftPkg_SoftPkg();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.FindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.dmd.FindBy
	 * @generated
	 */
	EClass getFindBy();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.FindBy#getNameService <em>Name Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Service</em>'.
	 * @see mil.jpeojtrs.sca.dmd.FindBy#getNameService()
	 * @see #getFindBy()
	 * @generated
	 */
	EReference getFindBy_NameService();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.FindBy#getStringifiedObjectRef <em>Stringified Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stringified Object Ref</em>'.
	 * @see mil.jpeojtrs.sca.dmd.FindBy#getStringifiedObjectRef()
	 * @see #getFindBy()
	 * @generated
	 */
	EAttribute getFindBy_StringifiedObjectRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.FindBy#getDomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Finder</em>'.
	 * @see mil.jpeojtrs.sca.dmd.FindBy#getDomainFinder()
	 * @see #getFindBy()
	 * @generated
	 */
	EReference getFindBy_DomainFinder();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dmd.LocalFile
	 * @generated
	 */
	EClass getLocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.LocalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dmd.LocalFile#getName()
	 * @see #getLocalFile()
	 * @generated
	 */
	EAttribute getLocalFile_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.NamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Naming Service</em>'.
	 * @see mil.jpeojtrs.sca.dmd.NamingService
	 * @generated
	 */
	EClass getNamingService();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.NamingService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dmd.NamingService#getName()
	 * @see #getNamingService()
	 * @generated
	 */
	EAttribute getNamingService_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see mil.jpeojtrs.sca.dmd.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dmd.Service#getUsesIdentifier <em>Uses Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Identifier</em>'.
	 * @see mil.jpeojtrs.sca.dmd.Service#getUsesIdentifier()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_UsesIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dmd.Service#getFindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.dmd.Service#getFindBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_FindBy();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dmd.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see mil.jpeojtrs.sca.dmd.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.dmd.Services#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see mil.jpeojtrs.sca.dmd.Services#getService()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Service();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmdFactory getDmdFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.DmdDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdDocumentRootImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDmdDocumentRoot()
		 * @generated
		 */
		EClass DMD_DOCUMENT_ROOT = eINSTANCE.getDmdDocumentRoot();
		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMD_DOCUMENT_ROOT__MIXED = eINSTANCE.getDmdDocumentRoot_Mixed();
		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDmdDocumentRoot_XMLNSPrefixMap();
		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDmdDocumentRoot_XSISchemaLocation();
		/**
		 * The meta object literal for the '<em><b>Domainmanagerconfiguration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMD_DOCUMENT_ROOT__DOMAINMANAGERCONFIGURATION = eINSTANCE.getDmdDocumentRoot_Domainmanagerconfiguration();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.DomainFinderImpl <em>Domain Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.DomainFinderImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDomainFinder()
		 * @generated
		 */
		EClass DOMAIN_FINDER = eINSTANCE.getDomainFinder();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FINDER__NAME = eINSTANCE.getDomainFinder_Name();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FINDER__TYPE = eINSTANCE.getDomainFinder_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl <em>Domain Manager Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDomainManagerConfiguration()
		 * @generated
		 */
		EClass DOMAIN_MANAGER_CONFIGURATION = eINSTANCE.getDomainManagerConfiguration();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION = eINSTANCE.getDomainManagerConfiguration_Description();
		/**
		 * The meta object literal for the '<em><b>Domain Manager Soft Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG = eINSTANCE.getDomainManagerConfiguration_DomainManagerSoftPkg();
		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MANAGER_CONFIGURATION__SERVICES = eINSTANCE.getDomainManagerConfiguration_Services();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MANAGER_CONFIGURATION__ID = eINSTANCE.getDomainManagerConfiguration_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MANAGER_CONFIGURATION__NAME = eINSTANCE.getDomainManagerConfiguration_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerSoftPkgImpl <em>Domain Manager Soft Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.DomainManagerSoftPkgImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getDomainManagerSoftPkg()
		 * @generated
		 */
		EClass DOMAIN_MANAGER_SOFT_PKG = eINSTANCE.getDomainManagerSoftPkg();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MANAGER_SOFT_PKG__LOCAL_FILE = eINSTANCE.getDomainManagerSoftPkg_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Soft Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MANAGER_SOFT_PKG__SOFT_PKG = eINSTANCE.getDomainManagerSoftPkg_SoftPkg();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.FindByImpl <em>Find By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.FindByImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getFindBy()
		 * @generated
		 */
		EClass FIND_BY = eINSTANCE.getFindBy();
		/**
		 * The meta object literal for the '<em><b>Name Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY__NAME_SERVICE = eINSTANCE.getFindBy_NameService();
		/**
		 * The meta object literal for the '<em><b>Stringified Object Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_BY__STRINGIFIED_OBJECT_REF = eINSTANCE.getFindBy_StringifiedObjectRef();
		/**
		 * The meta object literal for the '<em><b>Domain Finder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY__DOMAIN_FINDER = eINSTANCE.getFindBy_DomainFinder();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.LocalFileImpl <em>Local File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.LocalFileImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getLocalFile()
		 * @generated
		 */
		EClass LOCAL_FILE = eINSTANCE.getLocalFile();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_FILE__NAME = eINSTANCE.getLocalFile_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.NamingServiceImpl <em>Naming Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.NamingServiceImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getNamingService()
		 * @generated
		 */
		EClass NAMING_SERVICE = eINSTANCE.getNamingService();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMING_SERVICE__NAME = eINSTANCE.getNamingService_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.ServiceImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();
		/**
		 * The meta object literal for the '<em><b>Uses Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__USES_IDENTIFIER = eINSTANCE.getService_UsesIdentifier();
		/**
		 * The meta object literal for the '<em><b>Find By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__FIND_BY = eINSTANCE.getService_FindBy();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dmd.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dmd.impl.ServicesImpl
		 * @see mil.jpeojtrs.sca.dmd.impl.DmdPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();
		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__SERVICE = eINSTANCE.getServices_Service();

	}

} // DmdPackage
