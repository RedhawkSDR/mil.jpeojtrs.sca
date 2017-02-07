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
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.DomComponentFile;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.sad.*;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.ExternalProperties;
import mil.jpeojtrs.sca.sad.ExternalProperty;
import mil.jpeojtrs.sca.sad.FindComponent;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadConnectInterface;
import mil.jpeojtrs.sca.sad.SadConnections;
import mil.jpeojtrs.sca.sad.SadDocumentRoot;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadPartitioning;
import mil.jpeojtrs.sca.sad.SadProvidesPort;
import mil.jpeojtrs.sca.sad.SadUsesPort;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import java.math.BigInteger;
import java.util.Collection;
import java.util.UUID;

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
public class SadFactoryImpl extends EFactoryImpl implements SadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SadFactory init() {
		try {
			SadFactory theSadFactory = (SadFactory) EPackage.Registry.INSTANCE.getEFactory(SadPackage.eNS_URI);
			if (theSadFactory != null) {
				return theSadFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadFactoryImpl() {
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
		case SadPackage.ASSEMBLY_CONTROLLER:
			return createAssemblyController();
		case SadPackage.SAD_COMPONENT_INSTANTIATION:
			return createSadComponentInstantiation();
		case SadPackage.SAD_COMPONENT_INSTANTIATION_REF:
			return createSadComponentInstantiationRef();
		case SadPackage.SAD_USES_PORT:
			return createSadUsesPort();
		case SadPackage.SAD_PROVIDES_PORT:
			return createSadProvidesPort();
		case SadPackage.SAD_CONNECT_INTERFACE:
			return createSadConnectInterface();
		case SadPackage.SAD_CONNECTIONS:
			return createSadConnections();
		case SadPackage.COMPONENT_RESOURCE_FACTORY_REF:
			return createComponentResourceFactoryRef();
		case SadPackage.EXTERNAL_PORTS:
			return createExternalPorts();
		case SadPackage.EXTERNAL_PROPERTIES:
			return createExternalProperties();
		case SadPackage.EXTERNAL_PROPERTY:
			return createExternalProperty();
		case SadPackage.FIND_COMPONENT:
			return createFindComponent();
		case SadPackage.HOST_COLLOCATION:
			return createHostCollocation();
		case SadPackage.PORT:
			return createPort();
		case SadPackage.SAD_PARTITIONING:
			return createSadPartitioning();
		case SadPackage.SAD_COMPONENT_PLACEMENT:
			return createSadComponentPlacement();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES:
			return createResourceFactoryProperties();
		case SadPackage.SAD_DOCUMENT_ROOT:
			return createSadDocumentRoot();
		case SadPackage.SOFTWARE_ASSEMBLY:
			return createSoftwareAssembly();
		case SadPackage.USES_DEVICE_DEPENDENCIES:
			return createUsesDeviceDependencies();
		case SadPackage.USES_DEVICE_REF:
			return createUsesDeviceRef();
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
	public AssemblyController createAssemblyController() {
		AssemblyControllerImpl assemblyController = new AssemblyControllerImpl();
		return assemblyController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadComponentInstantiation createSadComponentInstantiation() {
		SadComponentInstantiationImpl sadComponentInstantiation = new SadComponentInstantiationImpl();
		return sadComponentInstantiation;
	}

	/**
	 * @since 3.1
	 */
	@Override
	public SadComponentInstantiation createSadComponentInstantiation(String id, BigInteger startOrder, String usageName, String namingServiceName) {
		SadComponentInstantiation sadComponentInstantiation = createSadComponentInstantiation();
		sadComponentInstantiation.setId(id);
		sadComponentInstantiation.setStartOrder(startOrder);
		sadComponentInstantiation.setUsageName(usageName);
		FindComponent findComponent = createFindComponent();
		sadComponentInstantiation.setFindComponent(findComponent);
		NamingService namingSerivce = PartitioningFactory.eINSTANCE.createNamingService();
		findComponent.setNamingService(namingSerivce);
		namingSerivce.setName(namingServiceName);
		return sadComponentInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadComponentInstantiationRef createSadComponentInstantiationRef() {
		SadComponentInstantiationRefImpl sadComponentInstantiationRef = new SadComponentInstantiationRefImpl();
		return sadComponentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadUsesPort createSadUsesPort() {
		SadUsesPortImpl sadUsesPort = new SadUsesPortImpl();
		return sadUsesPort;
	}

	/**
	 * @since 3.0
	 */
	@Override
	public SadUsesPort createSadUsesPort(String usesIdentifier, String componentRefId) {
		SadUsesPort usesPort = createSadUsesPort();
		usesPort.setUsesIdentifier(usesIdentifier);
		SadComponentInstantiationRef compInstanceRef = createSadComponentInstantiationRef();
		compInstanceRef.setRefid(componentRefId);
		usesPort.setComponentInstantiationRef(compInstanceRef);
		return usesPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadProvidesPort createSadProvidesPort() {
		SadProvidesPortImpl sadProvidesPort = new SadProvidesPortImpl();
		return sadProvidesPort;
	}

	/**
	 * @since 3.1
	 */
	@Override
	public SadProvidesPort createSadProvidesPort(String providesIdentifier, String componentRefId) {
		SadProvidesPort providesPort = createSadProvidesPort();
		providesPort.setProvidesIdentifier(providesIdentifier);
		SadComponentInstantiationRef compInstanceRef = createSadComponentInstantiationRef();
		compInstanceRef.setRefid(componentRefId);
		providesPort.setComponentInstantiationRef(compInstanceRef);
		return providesPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadConnectInterface createSadConnectInterface() {
		SadConnectInterfaceImpl sadConnectInterface = new SadConnectInterfaceImpl();
		return sadConnectInterface;
	}

	/**
	 * @since 3.1
	 */
	@Override
	public SadConnectInterface createSadConnectInterface(String connectionId, String usesPortName, String usesComponentInstanceId, String providesPortName,
		String providesComponentInstanceId) {
		SadConnectInterface sadConnectInterface = createSadConnectInterface();
		SadUsesPort usesPort = createSadUsesPort(usesPortName, usesComponentInstanceId);
		sadConnectInterface.setUsesPort(usesPort);
		SadProvidesPort providesPort = createSadProvidesPort(providesPortName, providesComponentInstanceId);
		sadConnectInterface.setProvidesPort(providesPort);
		return sadConnectInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadConnections createSadConnections() {
		SadConnectionsImpl sadConnections = new SadConnectionsImpl();
		return sadConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentResourceFactoryRef createComponentResourceFactoryRef() {
		ComponentResourceFactoryRefImpl componentResourceFactoryRef = new ComponentResourceFactoryRefImpl();
		return componentResourceFactoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalPorts createExternalPorts() {
		ExternalPortsImpl externalPorts = new ExternalPortsImpl();
		return externalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalProperties createExternalProperties() {
		ExternalPropertiesImpl externalProperties = new ExternalPropertiesImpl();
		return externalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalProperty createExternalProperty() {
		ExternalPropertyImpl externalProperty = new ExternalPropertyImpl();
		return externalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindComponent createFindComponent() {
		FindComponentImpl findComponent = new FindComponentImpl();
		return findComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostCollocation createHostCollocation() {
		HostCollocationImpl hostCollocation = new HostCollocationImpl();
		return hostCollocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadPartitioning createSadPartitioning() {
		SadPartitioningImpl sadPartitioning = new SadPartitioningImpl();
		return sadPartitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadComponentPlacement createSadComponentPlacement() {
		SadComponentPlacementImpl sadComponentPlacement = new SadComponentPlacementImpl();
		return sadComponentPlacement;
	}

	/**
	 * @since 3.1
	 */
	@Override
	public SadComponentPlacement createSadComponentPlacement(ComponentFileRef componentFileRef, Collection<SadComponentInstantiation> instances) {
		SadComponentPlacement sadComponentPlacement = createSadComponentPlacement();
		sadComponentPlacement.setComponentFileRef(componentFileRef);
		sadComponentPlacement.getComponentInstantiation().addAll(instances);
		return sadComponentPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceFactoryProperties createResourceFactoryProperties() {
		ResourceFactoryPropertiesImpl resourceFactoryProperties = new ResourceFactoryPropertiesImpl();
		return resourceFactoryProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadDocumentRoot createSadDocumentRoot() {
		SadDocumentRootImpl sadDocumentRoot = new SadDocumentRootImpl();
		return sadDocumentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareAssembly createSoftwareAssembly() {
		SoftwareAssemblyImpl softwareAssembly = new SoftwareAssemblyImpl();
		return softwareAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceDependencies createUsesDeviceDependencies() {
		UsesDeviceDependenciesImpl usesDeviceDependencies = new UsesDeviceDependenciesImpl();
		return usesDeviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceRef createUsesDeviceRef() {
		UsesDeviceRefImpl usesDeviceRef = new UsesDeviceRefImpl();
		return usesDeviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadPackage getSadPackage() {
		return (SadPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SadPackage getPackage() {
		return SadPackage.eINSTANCE;
	}

	@Override
	public DomComponentFile createComponentFile() {
		return PartitioningFactory.eINSTANCE.createDomComponentFile();
	}

	/**
	 * @since 3.1
	 */
	@Override
	public DomComponentFile createComponentFile(String idPrefix, String localFileName) {
		DomComponentFile componentFile = createComponentFile();
		componentFile.setId(idPrefix + "_" + UUID.randomUUID().toString());
		componentFile.setType("SPD");
		LocalFile localFile = PartitioningFactory.eINSTANCE.createLocalFile();
		componentFile.setLocalFile(localFile);
		localFile.setName(localFileName);
		return componentFile;
	}

} //SadFactoryImpl
