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
import mil.jpeojtrs.sca.partitioning.DevComponentFile;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
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
public class DcdFactoryImpl extends EFactoryImpl implements DcdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DcdFactory init() {
		try
		{
			DcdFactory theDcdFactory = (DcdFactory)EPackage.Registry.INSTANCE.getEFactory(DcdPackage.eNS_URI);
			if (theDcdFactory != null)
			{
				return theDcdFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DcdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case DcdPackage.DCD_COMPONENT_PLACEMENT: return createDcdComponentPlacement();
			case DcdPackage.DCD_COMPONENT_INSTANTIATION: return createDcdComponentInstantiation();
			case DcdPackage.DCD_PARTITIONING: return createDcdPartitioning();
			case DcdPackage.DCD_COMPONENT_INSTANTIATION_REF: return createDcdComponentInstantiationRef();
			case DcdPackage.DCD_CONNECT_INTERFACE: return createDcdConnectInterface();
			case DcdPackage.DCD_USES_PORT: return createDcdUsesPort();
			case DcdPackage.DCD_PROVIDES_PORT: return createDcdProvidesPort();
			case DcdPackage.DCD_CONNECTIONS: return createDcdConnections();
			case DcdPackage.COMPOSITE_PART_OF_DEVICE: return createCompositePartOfDevice();
			case DcdPackage.DCD_DOCUMENT_ROOT: return createDcdDocumentRoot();
			case DcdPackage.DEPLOY_ON_DEVICE: return createDeployOnDevice();
			case DcdPackage.DEVICE_CONFIGURATION: return createDeviceConfiguration();
			case DcdPackage.DEVICE_MANAGER_SOFT_PKG: return createDeviceManagerSoftPkg();
			case DcdPackage.DEVICE_PKG_FILE: return createDevicePkgFile();
			case DcdPackage.DOMAIN_MANAGER: return createDomainManager();
			case DcdPackage.FILE_SYSTEM_NAME: return createFileSystemName();
			case DcdPackage.FILE_SYSTEM_NAMES: return createFileSystemNames();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdComponentPlacement createDcdComponentPlacement() {
		DcdComponentPlacementImpl dcdComponentPlacement = new DcdComponentPlacementImpl();
		return dcdComponentPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdComponentInstantiation createDcdComponentInstantiation() {
		DcdComponentInstantiationImpl dcdComponentInstantiation = new DcdComponentInstantiationImpl();
		return dcdComponentInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdPartitioning createDcdPartitioning() {
		DcdPartitioningImpl dcdPartitioning = new DcdPartitioningImpl();
		return dcdPartitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdComponentInstantiationRef createDcdComponentInstantiationRef() {
		DcdComponentInstantiationRefImpl dcdComponentInstantiationRef = new DcdComponentInstantiationRefImpl();
		return dcdComponentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdConnectInterface createDcdConnectInterface() {
		DcdConnectInterfaceImpl dcdConnectInterface = new DcdConnectInterfaceImpl();
		return dcdConnectInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdUsesPort createDcdUsesPort() {
		DcdUsesPortImpl dcdUsesPort = new DcdUsesPortImpl();
		return dcdUsesPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdProvidesPort createDcdProvidesPort() {
		DcdProvidesPortImpl dcdProvidesPort = new DcdProvidesPortImpl();
		return dcdProvidesPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdConnections createDcdConnections() {
		DcdConnectionsImpl dcdConnections = new DcdConnectionsImpl();
		return dcdConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositePartOfDevice createCompositePartOfDevice() {
		CompositePartOfDeviceImpl compositePartOfDevice = new CompositePartOfDeviceImpl();
		return compositePartOfDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdDocumentRoot createDcdDocumentRoot() {
		DcdDocumentRootImpl dcdDocumentRoot = new DcdDocumentRootImpl();
		return dcdDocumentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployOnDevice createDeployOnDevice() {
		DeployOnDeviceImpl deployOnDevice = new DeployOnDeviceImpl();
		return deployOnDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConfiguration createDeviceConfiguration() {
		DeviceConfigurationImpl deviceConfiguration = new DeviceConfigurationImpl();
		return deviceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagerSoftPkg createDeviceManagerSoftPkg() {
		DeviceManagerSoftPkgImpl deviceManagerSoftPkg = new DeviceManagerSoftPkgImpl();
		return deviceManagerSoftPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevicePkgFile createDevicePkgFile() {
		DevicePkgFileImpl devicePkgFile = new DevicePkgFileImpl();
		return devicePkgFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainManager createDomainManager() {
		DomainManagerImpl domainManager = new DomainManagerImpl();
		return domainManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileSystemName createFileSystemName() {
		FileSystemNameImpl fileSystemName = new FileSystemNameImpl();
		return fileSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileSystemNames createFileSystemNames() {
		FileSystemNamesImpl fileSystemNames = new FileSystemNamesImpl();
		return fileSystemNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdPackage getDcdPackage() {
		return (DcdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DcdPackage getPackage() {
		return DcdPackage.eINSTANCE;
	}

	@Override
	public DevComponentFile createComponentFile() {
	    return PartitioningFactory.eINSTANCE.createDevComponentFile();
    }

} //DcdFactoryImpl
