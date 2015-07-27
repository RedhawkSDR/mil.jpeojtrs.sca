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
package mil.jpeojtrs.sca.partitioning.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.ComponentFiles;
import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.DevComponentFile;
import mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DomComponentFile;
import mil.jpeojtrs.sca.partitioning.DomainFinder;
import mil.jpeojtrs.sca.partitioning.DomainFinderType;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.FindByStub;
import mil.jpeojtrs.sca.partitioning.FindByStubContainer;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.LoggingConfig;
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesDeviceStub;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitioningFactoryImpl extends EFactoryImpl implements PartitioningFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartitioningFactory init() {
		try {
			PartitioningFactory thePartitioningFactory = (PartitioningFactory) EPackage.Registry.INSTANCE.getEFactory(PartitioningPackage.eNS_URI);
			if (thePartitioningFactory != null) {
				return thePartitioningFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartitioningFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitioningFactoryImpl() {
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
		case PartitioningPackage.DOM_COMPONENT_FILE:
			return createDomComponentFile();
		case PartitioningPackage.DEV_COMPONENT_FILE:
			return createDevComponentFile();
		case PartitioningPackage.COMPONENT_FILE_REF:
			return createComponentFileRef();
		case PartitioningPackage.COMPONENT_FILES:
			return createComponentFiles();
		case PartitioningPackage.COMPONENT_PROPERTIES:
			return createComponentProperties();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE:
			return createComponentSupportedInterface();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE_STUB:
			return createComponentSupportedInterfaceStub();
		case PartitioningPackage.DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return createDeviceThatLoadedThisComponentRef();
		case PartitioningPackage.DEVICE_USED_BY_THIS_COMPONENT_REF:
			return createDeviceUsedByThisComponentRef();
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION:
			return createDeviceUsedByApplication();
		case PartitioningPackage.DOMAIN_FINDER:
			return createDomainFinder();
		case PartitioningPackage.FIND_BY:
			return createFindBy();
		case PartitioningPackage.FIND_BY_STUB:
			return createFindByStub();
		case PartitioningPackage.FIND_BY_STUB_CONTAINER:
			return createFindByStubContainer();
		case PartitioningPackage.LOCAL_FILE:
			return createLocalFile();
		case PartitioningPackage.LOGGING_CONFIG:
			return createLoggingConfig();
		case PartitioningPackage.NAMING_SERVICE:
			return createNamingService();
		case PartitioningPackage.PROVIDES_PORT_STUB:
			return createProvidesPortStub();
		case PartitioningPackage.USES_PORT_STUB:
			return createUsesPortStub();
		case PartitioningPackage.USES_DEVICE_STUB:
			return createUsesDeviceStub();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PartitioningPackage.DOMAIN_FINDER_TYPE:
			return createDomainFinderTypeFromString(eDataType, initialValue);
		case PartitioningPackage.DOMAIN_FINDER_TYPE_OBJECT:
			return createDomainFinderTypeObjectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PartitioningPackage.DOMAIN_FINDER_TYPE:
			return convertDomainFinderTypeToString(eDataType, instanceValue);
		case PartitioningPackage.DOMAIN_FINDER_TYPE_OBJECT:
			return convertDomainFinderTypeObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomComponentFile createDomComponentFile() {
		DomComponentFileImpl domComponentFile = new DomComponentFileImpl();
		return domComponentFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevComponentFile createDevComponentFile() {
		DevComponentFileImpl devComponentFile = new DevComponentFileImpl();
		return devComponentFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFileRef createComponentFileRef() {
		ComponentFileRefImpl componentFileRef = new ComponentFileRefImpl();
		return componentFileRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFiles createComponentFiles() {
		ComponentFilesImpl componentFiles = new ComponentFilesImpl();
		return componentFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentProperties createComponentProperties() {
		ComponentPropertiesImpl componentProperties = new ComponentPropertiesImpl();
		return componentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSupportedInterface createComponentSupportedInterface() {
		ComponentSupportedInterfaceImpl componentSupportedInterface = new ComponentSupportedInterfaceImpl();
		return componentSupportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSupportedInterfaceStub createComponentSupportedInterfaceStub() {
		ComponentSupportedInterfaceStubImpl componentSupportedInterfaceStub = new ComponentSupportedInterfaceStubImpl();
		return componentSupportedInterfaceStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceThatLoadedThisComponentRef createDeviceThatLoadedThisComponentRef() {
		DeviceThatLoadedThisComponentRefImpl deviceThatLoadedThisComponentRef = new DeviceThatLoadedThisComponentRefImpl();
		return deviceThatLoadedThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUsedByThisComponentRef createDeviceUsedByThisComponentRef() {
		DeviceUsedByThisComponentRefImpl deviceUsedByThisComponentRef = new DeviceUsedByThisComponentRefImpl();
		return deviceUsedByThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsedByApplication createDeviceUsedByApplication() {
		DeviceUsedByApplicationImpl deviceUsedByApplication = new DeviceUsedByApplicationImpl();
		return deviceUsedByApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainFinder createDomainFinder() {
		DomainFinderImpl domainFinder = new DomainFinderImpl();
		return domainFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindBy createFindBy() {
		FindByImpl findBy = new FindByImpl();
		return findBy;
	}

	/**
	 * @since 2.0
	 */
	@Override
	public FindBy createFindByDomainManager() {
		FindBy findBy = createFindBy();
		DomainFinder domainFinder = createDomainFinder();
		domainFinder.setType(DomainFinderType.DOMAINMANAGER);
		findBy.setDomainFinder(domainFinder);
		return findBy;
	}

	/**
	 * @since 2.0
	 */
	@Override
	public FindBy createFindByEventChannel(String name) {
		FindBy findBy = createFindBy();
		DomainFinder domainFinder = createDomainFinder();
		domainFinder.setName(name);
		domainFinder.setType(DomainFinderType.EVENTCHANNEL);
		findBy.setDomainFinder(domainFinder);
		return findBy;
	}

	/**
	 * @since 2.0
	 */
	@Override
	public FindBy createFindByFileManager() {
		FindBy findBy = createFindBy();
		DomainFinder domainFinder = createDomainFinder();
		domainFinder.setType(DomainFinderType.FILEMANAGER);
		findBy.setDomainFinder(domainFinder);
		return findBy;
	}

	/**
	 * @since 2.0
	 */
	@Override
	public FindBy createFindByNamingServiceName(String name) {
		FindBy findBy = createFindBy();
		NamingService namingService = createNamingService();
		namingService.setName(name);
		findBy.setNamingService(namingService);
		return findBy;
	}

	/**
	 * @since 2.0
	 */
	public FindBy createFindByServiceName(String name) {
		FindBy findBy = createFindBy();
		DomainFinder domainFinder = createDomainFinder();
		domainFinder.setName(name);
		domainFinder.setType(DomainFinderType.SERVICENAME);
		findBy.setDomainFinder(domainFinder);
		return findBy;
	}

	/**
	 * @since 2.0
	 */
	public FindBy createFindByServiceType(String type) {
		FindBy findBy = createFindBy();
		DomainFinder domainFinder = createDomainFinder();
		domainFinder.setName(type);
		domainFinder.setType(DomainFinderType.SERVICETYPE);
		findBy.setDomainFinder(domainFinder);
		return findBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindByStub createFindByStub() {
		FindByStubImpl findByStub = new FindByStubImpl();
		return findByStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindByStubContainer createFindByStubContainer() {
		FindByStubContainerImpl findByStubContainer = new FindByStubContainerImpl();
		return findByStubContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalFile createLocalFile() {
		LocalFileImpl localFile = new LocalFileImpl();
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfig createLoggingConfig() {
		LoggingConfigImpl loggingConfig = new LoggingConfigImpl();
		return loggingConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingService createNamingService() {
		NamingServiceImpl namingService = new NamingServiceImpl();
		return namingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidesPortStub createProvidesPortStub() {
		ProvidesPortStubImpl providesPortStub = new ProvidesPortStubImpl();
		return providesPortStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsesPortStub createUsesPortStub() {
		UsesPortStubImpl usesPortStub = new UsesPortStubImpl();
		return usesPortStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceStub createUsesDeviceStub() {
		UsesDeviceStubImpl usesDeviceStub = new UsesDeviceStubImpl();
		return usesDeviceStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFinderType createDomainFinderTypeFromString(EDataType eDataType, String initialValue) {
		DomainFinderType result = DomainFinderType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainFinderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFinderType createDomainFinderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDomainFinderTypeFromString(PartitioningPackage.Literals.DOMAIN_FINDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainFinderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDomainFinderTypeToString(PartitioningPackage.Literals.DOMAIN_FINDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartitioningPackage getPartitioningPackage() {
		return (PartitioningPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartitioningPackage getPackage() {
		return PartitioningPackage.eINSTANCE;
	}

} //PartitioningFactoryImpl
