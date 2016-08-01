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
package mil.jpeojtrs.sca.dcd.impl;

import mil.jpeojtrs.sca.dcd.CompositePartOfDevice;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DcdConnectInterface;
import mil.jpeojtrs.sca.dcd.DcdConnections;
import mil.jpeojtrs.sca.dcd.DcdDocumentRoot;
import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DcdPartitioning;
import mil.jpeojtrs.sca.dcd.DcdProvidesPort;
import mil.jpeojtrs.sca.dcd.DcdUsesPort;
import mil.jpeojtrs.sca.dcd.DeployOnDevice;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg;
import mil.jpeojtrs.sca.dcd.DevicePkgFile;
import mil.jpeojtrs.sca.dcd.DomainManager;
import mil.jpeojtrs.sca.dcd.FileSystemName;
import mil.jpeojtrs.sca.dcd.FileSystemNames;
import mil.jpeojtrs.sca.dcd.util.DcdValidator;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.validator.AdvancedEObjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcdPackageImpl extends EPackageImpl implements DcdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdComponentPlacementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdComponentInstantiationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdPartitioningEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdComponentInstantiationRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdConnectInterfaceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdUsesPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdProvidesPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdConnectionsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositePartOfDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcdDocumentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployOnDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceConfigurationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagerSoftPkgEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePkgFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemNameEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemNamesEClass = null;

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
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DcdPackageImpl() {
		super(eNS_URI, DcdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DcdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DcdPackage initGen() {
		if (isInited)
			return (DcdPackage) EPackage.Registry.INSTANCE.getEPackage(DcdPackage.eNS_URI);

		// Obtain or create and register package
		DcdPackageImpl theDcdPackage = (DcdPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DcdPackageImpl
			? EPackage.Registry.INSTANCE.get(eNS_URI) : new DcdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DpdPackage.eINSTANCE.eClass();
		PartitioningPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDcdPackage.createPackageContents();

		// Initialize created meta-data
		theDcdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDcdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DcdPackage.eNS_URI, theDcdPackage);
		return theDcdPackage;
	}

	public static DcdPackage init() {
		// END GENERATED CODE
		final DcdPackage retVal = DcdPackageImpl.initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			private final AdvancedEObjectValidator validator = new AdvancedEObjectValidator(DcdValidator.INSTANCE);

			@Override
			public EValidator getEValidator() {
				return this.validator;
			}
		});

		return retVal;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdComponentPlacement() {
		return dcdComponentPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdComponentPlacement_DeployDevice() {
		return (EReference) dcdComponentPlacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdComponentPlacement_CompositePartOfDevice() {
		return (EReference) dcdComponentPlacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdComponentPlacement_DevicePkgFile() {
		return (EReference) dcdComponentPlacementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdComponentPlacement_ParentDevice() {
		return (EReference) dcdComponentPlacementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdComponentInstantiation() {
		return dcdComponentInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdPartitioning() {
		return dcdPartitioningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdComponentInstantiationRef() {
		return dcdComponentInstantiationRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdConnectInterface() {
		return dcdConnectInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdUsesPort() {
		return dcdUsesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdProvidesPort() {
		return dcdProvidesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdConnections() {
		return dcdConnectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositePartOfDevice() {
		return compositePartOfDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositePartOfDevice_Component() {
		return (EReference) compositePartOfDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositePartOfDevice_RefID() {
		return (EAttribute) compositePartOfDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDcdDocumentRoot() {
		return dcdDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDcdDocumentRoot_Mixed() {
		return (EAttribute) dcdDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdDocumentRoot_XMLNSPrefixMap() {
		return (EReference) dcdDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdDocumentRoot_XSISchemaLocation() {
		return (EReference) dcdDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDcdDocumentRoot_Deviceconfiguration() {
		return (EReference) dcdDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployOnDevice() {
		return deployOnDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployOnDevice_Component() {
		return (EReference) deployOnDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployOnDevice_RefID() {
		return (EAttribute) deployOnDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceConfiguration() {
		return deviceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConfiguration_Description() {
		return (EAttribute) deviceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_DeviceManagerSoftPkg() {
		return (EReference) deviceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_ComponentFiles() {
		return (EReference) deviceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_Partitioning() {
		return (EReference) deviceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_Connections() {
		return (EReference) deviceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_DomainManager() {
		return (EReference) deviceConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_FileSystemNames() {
		return (EReference) deviceConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConfiguration_Id() {
		return (EAttribute) deviceConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConfiguration_Name() {
		return (EAttribute) deviceConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagerSoftPkg() {
		return deviceManagerSoftPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagerSoftPkg_LocalFile() {
		return (EReference) deviceManagerSoftPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagerSoftPkg_SoftPkg() {
		return (EReference) deviceManagerSoftPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevicePkgFile() {
		return devicePkgFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevicePkgFile_LocalFile() {
		return (EReference) devicePkgFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevicePkgFile_Type() {
		return (EAttribute) devicePkgFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevicePkgFile_DevicePkg() {
		return (EReference) devicePkgFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainManager() {
		return domainManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainManager_NamingService() {
		return (EReference) domainManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainManager_StringifiedObjectRef() {
		return (EAttribute) domainManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileSystemName() {
		return fileSystemNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSystemName_DeviceID() {
		return (EAttribute) fileSystemNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSystemName_MountName() {
		return (EAttribute) fileSystemNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileSystemNames() {
		return fileSystemNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileSystemNames_FileSystemName() {
		return (EReference) fileSystemNamesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdFactory getDcdFactory() {
		return (DcdFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dcdComponentPlacementEClass = createEClass(DCD_COMPONENT_PLACEMENT);
		createEReference(dcdComponentPlacementEClass, DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE);
		createEReference(dcdComponentPlacementEClass, DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE);
		createEReference(dcdComponentPlacementEClass, DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE);
		createEReference(dcdComponentPlacementEClass, DCD_COMPONENT_PLACEMENT__PARENT_DEVICE);

		dcdComponentInstantiationEClass = createEClass(DCD_COMPONENT_INSTANTIATION);

		dcdPartitioningEClass = createEClass(DCD_PARTITIONING);

		dcdComponentInstantiationRefEClass = createEClass(DCD_COMPONENT_INSTANTIATION_REF);

		dcdConnectInterfaceEClass = createEClass(DCD_CONNECT_INTERFACE);

		dcdUsesPortEClass = createEClass(DCD_USES_PORT);

		dcdProvidesPortEClass = createEClass(DCD_PROVIDES_PORT);

		dcdConnectionsEClass = createEClass(DCD_CONNECTIONS);

		compositePartOfDeviceEClass = createEClass(COMPOSITE_PART_OF_DEVICE);
		createEReference(compositePartOfDeviceEClass, COMPOSITE_PART_OF_DEVICE__COMPONENT);
		createEAttribute(compositePartOfDeviceEClass, COMPOSITE_PART_OF_DEVICE__REF_ID);

		dcdDocumentRootEClass = createEClass(DCD_DOCUMENT_ROOT);
		createEAttribute(dcdDocumentRootEClass, DCD_DOCUMENT_ROOT__MIXED);
		createEReference(dcdDocumentRootEClass, DCD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dcdDocumentRootEClass, DCD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dcdDocumentRootEClass, DCD_DOCUMENT_ROOT__DEVICECONFIGURATION);

		deployOnDeviceEClass = createEClass(DEPLOY_ON_DEVICE);
		createEReference(deployOnDeviceEClass, DEPLOY_ON_DEVICE__COMPONENT);
		createEAttribute(deployOnDeviceEClass, DEPLOY_ON_DEVICE__REF_ID);

		deviceConfigurationEClass = createEClass(DEVICE_CONFIGURATION);
		createEAttribute(deviceConfigurationEClass, DEVICE_CONFIGURATION__DESCRIPTION);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__COMPONENT_FILES);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__PARTITIONING);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__CONNECTIONS);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__DOMAIN_MANAGER);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES);
		createEAttribute(deviceConfigurationEClass, DEVICE_CONFIGURATION__ID);
		createEAttribute(deviceConfigurationEClass, DEVICE_CONFIGURATION__NAME);

		deviceManagerSoftPkgEClass = createEClass(DEVICE_MANAGER_SOFT_PKG);
		createEReference(deviceManagerSoftPkgEClass, DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE);
		createEReference(deviceManagerSoftPkgEClass, DEVICE_MANAGER_SOFT_PKG__SOFT_PKG);

		devicePkgFileEClass = createEClass(DEVICE_PKG_FILE);
		createEReference(devicePkgFileEClass, DEVICE_PKG_FILE__LOCAL_FILE);
		createEAttribute(devicePkgFileEClass, DEVICE_PKG_FILE__TYPE);
		createEReference(devicePkgFileEClass, DEVICE_PKG_FILE__DEVICE_PKG);

		domainManagerEClass = createEClass(DOMAIN_MANAGER);
		createEReference(domainManagerEClass, DOMAIN_MANAGER__NAMING_SERVICE);
		createEAttribute(domainManagerEClass, DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF);

		fileSystemNameEClass = createEClass(FILE_SYSTEM_NAME);
		createEAttribute(fileSystemNameEClass, FILE_SYSTEM_NAME__DEVICE_ID);
		createEAttribute(fileSystemNameEClass, FILE_SYSTEM_NAME__MOUNT_NAME);

		fileSystemNamesEClass = createEClass(FILE_SYSTEM_NAMES);
		createEReference(fileSystemNamesEClass, FILE_SYSTEM_NAMES__FILE_SYSTEM_NAME);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PartitioningPackage thePartitioningPackage = (PartitioningPackage) EPackage.Registry.INSTANCE.getEPackage(PartitioningPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		PrfPackage thePrfPackage = (PrfPackage) EPackage.Registry.INSTANCE.getEPackage(PrfPackage.eNS_URI);
		SpdPackage theSpdPackage = (SpdPackage) EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		DpdPackage theDpdPackage = (DpdPackage) EPackage.Registry.INSTANCE.getEPackage(DpdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(thePartitioningPackage.getComponentPlacement());
		EGenericType g2 = createEGenericType(this.getDcdComponentInstantiation());
		g1.getETypeArguments().add(g2);
		dcdComponentPlacementEClass.getEGenericSuperTypes().add(g1);
		dcdComponentInstantiationEClass.getESuperTypes().add(thePartitioningPackage.getComponentInstantiation());
		g1 = createEGenericType(thePartitioningPackage.getPartitioning());
		g2 = createEGenericType(this.getDcdComponentPlacement());
		g1.getETypeArguments().add(g2);
		dcdPartitioningEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getComponentInstantiationRef());
		g2 = createEGenericType(this.getDcdComponentInstantiation());
		g1.getETypeArguments().add(g2);
		dcdComponentInstantiationRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getConnectInterface());
		g2 = createEGenericType(this.getDcdComponentInstantiationRef());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDcdUsesPort());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDcdProvidesPort());
		g1.getETypeArguments().add(g2);
		dcdConnectInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getUsesPort());
		g2 = createEGenericType(this.getDcdComponentInstantiationRef());
		g1.getETypeArguments().add(g2);
		dcdUsesPortEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getProvidesPort());
		g2 = createEGenericType(this.getDcdComponentInstantiationRef());
		g1.getETypeArguments().add(g2);
		dcdProvidesPortEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getConnections());
		g2 = createEGenericType(this.getDcdConnectInterface());
		g1.getETypeArguments().add(g2);
		dcdConnectionsEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(dcdComponentPlacementEClass, DcdComponentPlacement.class, "DcdComponentPlacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcdComponentPlacement_DeployDevice(), this.getDeployOnDevice(), null, "deployDevice", null, 0, 1, DcdComponentPlacement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcdComponentPlacement_CompositePartOfDevice(), this.getCompositePartOfDevice(), null, "compositePartOfDevice", null, 0, 1,
			DcdComponentPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(getDcdComponentPlacement_DevicePkgFile(), this.getDevicePkgFile(), null, "devicePkgFile", null, 0, 1, DcdComponentPlacement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcdComponentPlacement_ParentDevice(), this.getDcdComponentInstantiation(), null, "parentDevice", null, 0, 1,
			DcdComponentPlacement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
			IS_ORDERED);

		initEClass(dcdComponentInstantiationEClass, DcdComponentInstantiation.class, "DcdComponentInstantiation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcdPartitioningEClass, DcdPartitioning.class, "DcdPartitioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcdComponentInstantiationRefEClass, DcdComponentInstantiationRef.class, "DcdComponentInstantiationRef", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcdConnectInterfaceEClass, DcdConnectInterface.class, "DcdConnectInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcdUsesPortEClass, DcdUsesPort.class, "DcdUsesPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcdProvidesPortEClass, DcdProvidesPort.class, "DcdProvidesPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcdConnectionsEClass, DcdConnections.class, "DcdConnections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositePartOfDeviceEClass, CompositePartOfDevice.class, "CompositePartOfDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositePartOfDevice_Component(), this.getDcdComponentInstantiation(), null, "component", null, 0, 1, CompositePartOfDevice.class,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositePartOfDevice_RefID(), theEcorePackage.getEString(), "refID", null, 1, 1, CompositePartOfDevice.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcdDocumentRootEClass, DcdDocumentRoot.class, "DcdDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcdDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcdDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcdDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null,
			IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcdDocumentRoot_Deviceconfiguration(), this.getDeviceConfiguration(), null, "deviceconfiguration", null, 0, -2, null, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(deployOnDeviceEClass, DeployOnDevice.class, "DeployOnDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployOnDevice_Component(), this.getDcdComponentInstantiation(), null, "component", null, 0, 1, DeployOnDevice.class, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployOnDevice_RefID(), theEcorePackage.getEString(), "refID", null, 1, 1, DeployOnDevice.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceConfigurationEClass, DeviceConfiguration.class, "DeviceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceConfiguration_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, DeviceConfiguration.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfiguration_DeviceManagerSoftPkg(), this.getDeviceManagerSoftPkg(), null, "deviceManagerSoftPkg", null, 1, 1,
			DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(getDeviceConfiguration_ComponentFiles(), thePartitioningPackage.getComponentFiles(), null, "componentFiles", null, 0, 1,
			DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(getDeviceConfiguration_Partitioning(), this.getDcdPartitioning(), null, "partitioning", null, 0, 1, DeviceConfiguration.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfiguration_Connections(), this.getDcdConnections(), null, "connections", null, 0, 1, DeviceConfiguration.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfiguration_DomainManager(), this.getDomainManager(), null, "domainManager", null, 1, 1, DeviceConfiguration.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfiguration_FileSystemNames(), this.getFileSystemNames(), null, "fileSystemNames", null, 0, 1, DeviceConfiguration.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceConfiguration_Id(), thePrfPackage.getDceUUID(), "id", null, 1, 1, DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceConfiguration_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagerSoftPkgEClass, DeviceManagerSoftPkg.class, "DeviceManagerSoftPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagerSoftPkg_LocalFile(), thePartitioningPackage.getLocalFile(), null, "localFile", null, 1, 1, DeviceManagerSoftPkg.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagerSoftPkg_SoftPkg(), theSpdPackage.getSoftPkg(), null, "softPkg", null, 0, 1, DeviceManagerSoftPkg.class, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(devicePkgFileEClass, DevicePkgFile.class, "DevicePkgFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevicePkgFile_LocalFile(), thePartitioningPackage.getLocalFile(), null, "localFile", null, 1, 1, DevicePkgFile.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevicePkgFile_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, DevicePkgFile.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevicePkgFile_DevicePkg(), theDpdPackage.getDevicePkg(), null, "devicePkg", null, 0, 1, DevicePkgFile.class, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(domainManagerEClass, DomainManager.class, "DomainManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainManager_NamingService(), thePartitioningPackage.getNamingService(), null, "namingService", null, 0, 1, DomainManager.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainManager_StringifiedObjectRef(), theXMLTypePackage.getString(), "stringifiedObjectRef", null, 0, 1, DomainManager.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSystemNameEClass, FileSystemName.class, "FileSystemName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileSystemName_DeviceID(), theXMLTypePackage.getString(), "deviceID", null, 1, 1, FileSystemName.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSystemName_MountName(), theXMLTypePackage.getString(), "mountName", null, 1, 1, FileSystemName.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSystemNamesEClass, FileSystemNames.class, "FileSystemNames", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileSystemNames_FileSystemName(), this.getFileSystemName(), null, "fileSystemName", null, 1, -1, FileSystemNames.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addAnnotation(dcdComponentPlacementEClass, source, new String[] { "name", "componentplacement", "kind", "elementOnly" });
		addAnnotation(getDcdComponentPlacement_DeployDevice(), source, new String[] { "kind", "element", "name", "deployondevice" });
		addAnnotation(getDcdComponentPlacement_CompositePartOfDevice(), source, new String[] { "kind", "element", "name", "compositepartofdevice" });
		addAnnotation(getDcdComponentPlacement_DevicePkgFile(), source, new String[] { "kind", "element", "name", "devicepkgfile" });
		addAnnotation(getDcdComponentPlacement_ParentDevice(), source, new String[] { "kind", "attribute", "name", "parentDevice" });
		addAnnotation(dcdComponentInstantiationEClass, source, new String[] { "name", "componentinstantiation", "kind", "elementOnly", "qualified", "false" });
		addAnnotation(dcdPartitioningEClass, source, new String[] { "name", "partitioning", "kind", "elementOnly", "qualified", "false" });
		addAnnotation(dcdComponentInstantiationRefEClass, source, new String[] { "name", "componentinstantiationref", "kind", "elementOnly" });
		addAnnotation(dcdConnectInterfaceEClass, source, new String[] { "name", "connectinterface", "kind", "elementOnly" });
		addAnnotation(dcdUsesPortEClass, source, new String[] { "name", "usesport", "kind", "elementOnly" });
		addAnnotation(dcdProvidesPortEClass, source, new String[] { "name", "providesport", "kind", "elementOnly" });
		addAnnotation(dcdConnectionsEClass, source, new String[] { "name", "connections", "kind", "elementOnly" });
		addAnnotation(compositePartOfDeviceEClass, source, new String[] { "name", "compositepartofdevice", "kind", "empty" });
		addAnnotation(getCompositePartOfDevice_Component(), source, new String[] { "kind", "attribute", "name", "component" });
		addAnnotation(getCompositePartOfDevice_RefID(), source, new String[] { "kind", "attribute", "name", "refid" });
		addAnnotation(dcdDocumentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDcdDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDcdDocumentRoot_XMLNSPrefixMap(), source, new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDcdDocumentRoot_XSISchemaLocation(), source, new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDcdDocumentRoot_Deviceconfiguration(), source,
			new String[] { "kind", "element", "name", "deviceconfiguration", "namespace", "##targetNamespace" });
		addAnnotation(deployOnDeviceEClass, source, new String[] { "name", "deployondevice", "kind", "empty" });
		addAnnotation(getDeployOnDevice_Component(), source, new String[] { "kind", "attribute", "name", "component" });
		addAnnotation(getDeployOnDevice_RefID(), source, new String[] { "kind", "attribute", "name", "refid" });
		addAnnotation(deviceConfigurationEClass, source, new String[] { "name", "deviceconfiguration", "kind", "elementOnly" });
		addAnnotation(getDeviceConfiguration_Description(), source, new String[] { "kind", "element", "name", "description" });
		addAnnotation(getDeviceConfiguration_DeviceManagerSoftPkg(), source, new String[] { "kind", "element", "name", "devicemanagersoftpkg" });
		addAnnotation(getDeviceConfiguration_ComponentFiles(), source, new String[] { "kind", "element", "name", "componentfiles" });
		addAnnotation(getDeviceConfiguration_Partitioning(), source, new String[] { "kind", "element", "name", "partitioning" });
		addAnnotation(getDeviceConfiguration_Connections(), source, new String[] { "kind", "element", "name", "connections" });
		addAnnotation(getDeviceConfiguration_DomainManager(), source, new String[] { "kind", "element", "name", "domainmanager" });
		addAnnotation(getDeviceConfiguration_FileSystemNames(), source, new String[] { "kind", "element", "name", "filesystemnames" });
		addAnnotation(getDeviceConfiguration_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getDeviceConfiguration_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(deviceManagerSoftPkgEClass, source, new String[] { "name", "devicemanagersoftpkg", "kind", "elementOnly" });
		addAnnotation(getDeviceManagerSoftPkg_LocalFile(), source, new String[] { "kind", "element", "name", "localfile" });
		addAnnotation(getDeviceManagerSoftPkg_SoftPkg(), source, new String[] { "kind", "attribute", "name", "softPkg" });
		addAnnotation(devicePkgFileEClass, source, new String[] { "name", "devicepkgfile", "kind", "elementOnly" });
		addAnnotation(getDevicePkgFile_LocalFile(), source, new String[] { "kind", "element", "name", "localfile" });
		addAnnotation(getDevicePkgFile_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(domainManagerEClass, source, new String[] { "name", "domainmanager", "kind", "elementOnly" });
		addAnnotation(getDomainManager_NamingService(), source, new String[] { "kind", "element", "name", "namingservice" });
		addAnnotation(getDomainManager_StringifiedObjectRef(), source, new String[] { "kind", "element", "name", "stringifiedobjectref" });
		addAnnotation(fileSystemNameEClass, source, new String[] { "name", "filesystemname", "kind", "empty" });
		addAnnotation(getFileSystemName_DeviceID(), source, new String[] { "kind", "attribute", "name", "deviceid" });
		addAnnotation(getFileSystemName_MountName(), source, new String[] { "kind", "attribute", "name", "mountname" });
		addAnnotation(fileSystemNamesEClass, source, new String[] { "name", "filesystemnames", "kind", "elementOnly" });
		addAnnotation(getFileSystemNames_FileSystemName(), source, new String[] { "kind", "element", "name", "filesystemname" });
	}

} //DcdPackageImpl
