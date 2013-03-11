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
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.validator.AdvancedEObjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmdPackageImpl extends EPackageImpl implements DmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmdDocumentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainFinderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainManagerConfigurationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainManagerSoftPkgEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findByEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingServiceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmdPackageImpl() {
		super(eNS_URI, DmdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DmdPackage initGen() {
		if (isInited) return (DmdPackage)EPackage.Registry.INSTANCE.getEPackage(DmdPackage.eNS_URI);

		// Obtain or create and register package
		DmdPackageImpl theDmdPackage = (DmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpdPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDmdPackage.createPackageContents();

		// Initialize created meta-data
		theDmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DmdPackage.eNS_URI, theDmdPackage);
		return theDmdPackage;
	}

	public static DmdPackage init() {
		final DmdPackage retVal = DmdPackageImpl.initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			AdvancedEObjectValidator validator = new AdvancedEObjectValidator();
			public EValidator getEValidator() {
				return this.validator;
			}
		});

		return retVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmdDocumentRoot() {
		return dmdDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmdDocumentRoot_Mixed() {
		return (EAttribute)dmdDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmdDocumentRoot_XMLNSPrefixMap() {
		return (EReference)dmdDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmdDocumentRoot_XSISchemaLocation() {
		return (EReference)dmdDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmdDocumentRoot_Domainmanagerconfiguration() {
		return (EReference)dmdDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainFinder() {
		return domainFinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainFinder_Name() {
		return (EAttribute)domainFinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainFinder_Type() {
		return (EAttribute)domainFinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainManagerConfiguration() {
		return domainManagerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainManagerConfiguration_Description() {
		return (EAttribute)domainManagerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainManagerConfiguration_DomainManagerSoftPkg() {
		return (EReference)domainManagerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainManagerConfiguration_Services() {
		return (EReference)domainManagerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainManagerConfiguration_Id() {
		return (EAttribute)domainManagerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainManagerConfiguration_Name() {
		return (EAttribute)domainManagerConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainManagerSoftPkg() {
		return domainManagerSoftPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainManagerSoftPkg_LocalFile() {
		return (EReference)domainManagerSoftPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainManagerSoftPkg_SoftPkg() {
		return (EReference)domainManagerSoftPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindBy() {
		return findByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindBy_NameService() {
		return (EReference)findByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindBy_StringifiedObjectRef() {
		return (EAttribute)findByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindBy_DomainFinder() {
		return (EReference)findByEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalFile() {
		return localFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalFile_Name() {
		return (EAttribute)localFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingService() {
		return namingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamingService_Name() {
		return (EAttribute)namingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_UsesIdentifier() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_FindBy() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServices_Service() {
		return (EReference)servicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmdFactory getDmdFactory() {
		return (DmdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dmdDocumentRootEClass = createEClass(DMD_DOCUMENT_ROOT);
		createEAttribute(dmdDocumentRootEClass, DMD_DOCUMENT_ROOT__MIXED);
		createEReference(dmdDocumentRootEClass, DMD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dmdDocumentRootEClass, DMD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dmdDocumentRootEClass, DMD_DOCUMENT_ROOT__DOMAINMANAGERCONFIGURATION);

		domainFinderEClass = createEClass(DOMAIN_FINDER);
		createEAttribute(domainFinderEClass, DOMAIN_FINDER__NAME);
		createEAttribute(domainFinderEClass, DOMAIN_FINDER__TYPE);

		domainManagerConfigurationEClass = createEClass(DOMAIN_MANAGER_CONFIGURATION);
		createEAttribute(domainManagerConfigurationEClass, DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION);
		createEReference(domainManagerConfigurationEClass, DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG);
		createEReference(domainManagerConfigurationEClass, DOMAIN_MANAGER_CONFIGURATION__SERVICES);
		createEAttribute(domainManagerConfigurationEClass, DOMAIN_MANAGER_CONFIGURATION__ID);
		createEAttribute(domainManagerConfigurationEClass, DOMAIN_MANAGER_CONFIGURATION__NAME);

		domainManagerSoftPkgEClass = createEClass(DOMAIN_MANAGER_SOFT_PKG);
		createEReference(domainManagerSoftPkgEClass, DOMAIN_MANAGER_SOFT_PKG__LOCAL_FILE);
		createEReference(domainManagerSoftPkgEClass, DOMAIN_MANAGER_SOFT_PKG__SOFT_PKG);

		findByEClass = createEClass(FIND_BY);
		createEReference(findByEClass, FIND_BY__NAME_SERVICE);
		createEAttribute(findByEClass, FIND_BY__STRINGIFIED_OBJECT_REF);
		createEReference(findByEClass, FIND_BY__DOMAIN_FINDER);

		localFileEClass = createEClass(LOCAL_FILE);
		createEAttribute(localFileEClass, LOCAL_FILE__NAME);

		namingServiceEClass = createEClass(NAMING_SERVICE);
		createEAttribute(namingServiceEClass, NAMING_SERVICE__NAME);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__USES_IDENTIFIER);
		createEReference(serviceEClass, SERVICE__FIND_BY);

		servicesEClass = createEClass(SERVICES);
		createEReference(servicesEClass, SERVICES__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		PrfPackage thePrfPackage = (PrfPackage)EPackage.Registry.INSTANCE.getEPackage(PrfPackage.eNS_URI);
		SpdPackage theSpdPackage = (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dmdDocumentRootEClass, DmdDocumentRoot.class, "DmdDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmdDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmdDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmdDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmdDocumentRoot_Domainmanagerconfiguration(), this.getDomainManagerConfiguration(), null, "domainmanagerconfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(domainFinderEClass, DomainFinder.class, "DomainFinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainFinder_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DomainFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainFinder_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, DomainFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainManagerConfigurationEClass, DomainManagerConfiguration.class, "DomainManagerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainManagerConfiguration_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, DomainManagerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainManagerConfiguration_DomainManagerSoftPkg(), this.getDomainManagerSoftPkg(), null, "domainManagerSoftPkg", null, 1, 1, DomainManagerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainManagerConfiguration_Services(), this.getServices(), null, "services", null, 0, 1, DomainManagerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainManagerConfiguration_Id(), thePrfPackage.getDceUUID(), "id", null, 1, 1, DomainManagerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainManagerConfiguration_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DomainManagerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainManagerSoftPkgEClass, DomainManagerSoftPkg.class, "DomainManagerSoftPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainManagerSoftPkg_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, DomainManagerSoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainManagerSoftPkg_SoftPkg(), theSpdPackage.getSoftPkg(), null, "softPkg", null, 0, 1, DomainManagerSoftPkg.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(findByEClass, FindBy.class, "FindBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFindBy_NameService(), this.getNamingService(), null, "nameService", null, 0, 1, FindBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindBy_StringifiedObjectRef(), theXMLTypePackage.getString(), "stringifiedObjectRef", null, 0, 1, FindBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFindBy_DomainFinder(), this.getDomainFinder(), null, "domainFinder", null, 0, 1, FindBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localFileEClass, LocalFile.class, "LocalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalFile_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LocalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namingServiceEClass, NamingService.class, "NamingService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamingService_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, NamingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_UsesIdentifier(), theXMLTypePackage.getString(), "usesIdentifier", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_FindBy(), this.getFindBy(), null, "findBy", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServices_Service(), this.getService(), null, "service", null, 1, -1, Services.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (dmdDocumentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDmdDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDmdDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDmdDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDmdDocumentRoot_Domainmanagerconfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domainmanagerconfiguration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (domainFinderEClass, 
		   source, 
		   new String[] {
			 "name", "domainfinder",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDomainFinder_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getDomainFinder_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });			
		addAnnotation
		  (domainManagerConfigurationEClass, 
		   source, 
		   new String[] {
			 "name", "domainmanagerconfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDomainManagerConfiguration_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDomainManagerConfiguration_DomainManagerSoftPkg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domainmanagersoftpkg",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDomainManagerConfiguration_Services(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "services",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDomainManagerConfiguration_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDomainManagerConfiguration_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (domainManagerSoftPkgEClass, 
		   source, 
		   new String[] {
			 "name", "domainmanagersoftpkg",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDomainManagerSoftPkg_LocalFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainManagerSoftPkg_SoftPkg(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "softPkg"
		   });		
		addAnnotation
		  (findByEClass, 
		   source, 
		   new String[] {
			 "name", "findby",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFindBy_NameService(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "namingservice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFindBy_StringifiedObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stringifiedobjectref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFindBy_DomainFinder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domainfinder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (localFileEClass, 
		   source, 
		   new String[] {
			 "name", "localfile",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLocalFile_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (namingServiceEClass, 
		   source, 
		   new String[] {
			 "name", "namingservice",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNamingService_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "name", "service",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getService_UsesIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usesidentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_FindBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "findby",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (servicesEClass, 
		   source, 
		   new String[] {
			 "name", "services",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServices_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace"
		   });
	}

} //DmdPackageImpl
