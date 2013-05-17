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
package mil.jpeojtrs.sca.dcd;

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;

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
 * @see mil.jpeojtrs.sca.dcd.DcdFactory
 * @model kind="package"
 * @generated
 */
public interface DcdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dcd";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/dcd";
	String FILE_EXTENSION = ".dcd.xml";
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
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.dcd.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcdPackage eINSTANCE = mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl <em>Component Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdComponentPlacement()
	 * @generated
	 */
	int DCD_COMPONENT_PLACEMENT = 0;
	/**
	 * The feature id for the '<em><b>Component File Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__COMPONENT_FILE_REF = PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF;
	/**
	 * The feature id for the '<em><b>Component Instantiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION = PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__NAME = PartitioningPackage.COMPONENT_PLACEMENT__NAME;
	/**
	 * The feature id for the '<em><b>Deploy Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE = PartitioningPackage.COMPONENT_PLACEMENT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Composite Part Of Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE = PartitioningPackage.COMPONENT_PLACEMENT_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Device Pkg File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE = PartitioningPackage.COMPONENT_PLACEMENT_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Parent Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT__PARENT_DEVICE = PartitioningPackage.COMPONENT_PLACEMENT_FEATURE_COUNT + 3;
	/**
	 * The number of structural features of the '<em>Component Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_PLACEMENT_FEATURE_COUNT = PartitioningPackage.COMPONENT_PLACEMENT_FEATURE_COUNT + 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationImpl <em>Component Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdComponentInstantiation()
	 * @generated
	 */
	int DCD_COMPONENT_INSTANTIATION = 1;
	/**
	 * The feature id for the '<em><b>Usage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__USAGE_NAME = PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME;
	/**
	 * The feature id for the '<em><b>Component Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES = PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES;
	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__PROVIDES = PartitioningPackage.COMPONENT_INSTANTIATION__PROVIDES;
	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__USES = PartitioningPackage.COMPONENT_INSTANTIATION__USES;
	/**
	 * The feature id for the '<em><b>Interface Stub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__INTERFACE_STUB = PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__ID = PartitioningPackage.COMPONENT_INSTANTIATION__ID;
	/**
	 * The feature id for the '<em><b>Placement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION__PLACEMENT = PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT;
	/**
	 * The number of structural features of the '<em>Component Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION_FEATURE_COUNT = PartitioningPackage.COMPONENT_INSTANTIATION_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdPartitioningImpl <em>Partitioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPartitioningImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdPartitioning()
	 * @generated
	 */
	int DCD_PARTITIONING = 2;
	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PARTITIONING__PARTS = PartitioningPackage.PARTITIONING__PARTS;
	/**
	 * The feature id for the '<em><b>Component Placement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PARTITIONING__COMPONENT_PLACEMENT = PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT;
	/**
	 * The number of structural features of the '<em>Partitioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PARTITIONING_FEATURE_COUNT = PartitioningPackage.PARTITIONING_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationRefImpl <em>Component Instantiation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationRefImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdComponentInstantiationRef()
	 * @generated
	 */
	int DCD_COMPONENT_INSTANTIATION_REF = 3;
	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION_REF__INSTANTIATION = PartitioningPackage.COMPONENT_INSTANTIATION_REF__INSTANTIATION;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION_REF__REFID = PartitioningPackage.COMPONENT_INSTANTIATION_REF__REFID;
	/**
	 * The number of structural features of the '<em>Component Instantiation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_COMPONENT_INSTANTIATION_REF_FEATURE_COUNT = PartitioningPackage.COMPONENT_INSTANTIATION_REF_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdConnectInterfaceImpl <em>Connect Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdConnectInterfaceImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdConnectInterface()
	 * @generated
	 */
	int DCD_CONNECT_INTERFACE = 4;
	/**
	 * The feature id for the '<em><b>Uses Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__USES_PORT = PartitioningPackage.CONNECT_INTERFACE__USES_PORT;
	/**
	 * The feature id for the '<em><b>Provides Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__PROVIDES_PORT = PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT;
	/**
	 * The feature id for the '<em><b>Component Supported Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE = PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__FIND_BY = PartitioningPackage.CONNECT_INTERFACE__FIND_BY;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__ID = PartitioningPackage.CONNECT_INTERFACE__ID;
	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__SOURCE = PartitioningPackage.CONNECT_INTERFACE__SOURCE;
	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE__TARGET = PartitioningPackage.CONNECT_INTERFACE__TARGET;
	/**
	 * The number of structural features of the '<em>Connect Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECT_INTERFACE_FEATURE_COUNT = PartitioningPackage.CONNECT_INTERFACE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdUsesPortImpl <em>Uses Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdUsesPortImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdUsesPort()
	 * @generated
	 */
	int DCD_USES_PORT = 5;
	/**
	 * The feature id for the '<em><b>Uses Indentifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_USES_PORT__USES_INDENTIFIER = PartitioningPackage.USES_PORT__USES_INDENTIFIER;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_USES_PORT__COMPONENT_INSTANTIATION_REF = PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_USES_PORT__FIND_BY = PartitioningPackage.USES_PORT__FIND_BY;
	/**
	 * The number of structural features of the '<em>Uses Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_USES_PORT_FEATURE_COUNT = PartitioningPackage.USES_PORT_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdProvidesPortImpl <em>Provides Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdProvidesPortImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdProvidesPort()
	 * @generated
	 */
	int DCD_PROVIDES_PORT = 6;
	/**
	 * The feature id for the '<em><b>Provides Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PROVIDES_PORT__PROVIDES_IDENTIFIER = PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PROVIDES_PORT__COMPONENT_INSTANTIATION_REF = PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PROVIDES_PORT__FIND_BY = PartitioningPackage.PROVIDES_PORT__FIND_BY;
	/**
	 * The number of structural features of the '<em>Provides Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_PROVIDES_PORT_FEATURE_COUNT = PartitioningPackage.PROVIDES_PORT_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdConnectionsImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdConnections()
	 * @generated
	 */
	int DCD_CONNECTIONS = 7;
	/**
	 * The feature id for the '<em><b>Connect Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECTIONS__CONNECT_INTERFACE = PartitioningPackage.CONNECTIONS__CONNECT_INTERFACE;
	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_CONNECTIONS_FEATURE_COUNT = PartitioningPackage.CONNECTIONS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.CompositePartOfDeviceImpl <em>Composite Part Of Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.CompositePartOfDeviceImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getCompositePartOfDevice()
	 * @generated
	 */
	int COMPOSITE_PART_OF_DEVICE = 8;
	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PART_OF_DEVICE__COMPONENT = 0;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PART_OF_DEVICE__REF_ID = 1;
	/**
	 * The number of structural features of the '<em>Composite Part Of Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PART_OF_DEVICE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdDocumentRootImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdDocumentRoot()
	 * @generated
	 */
	int DCD_DOCUMENT_ROOT = 9;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Deviceconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_DOCUMENT_ROOT__DEVICECONFIGURATION = 3;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCD_DOCUMENT_ROOT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DeployOnDeviceImpl <em>Deploy On Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DeployOnDeviceImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDeployOnDevice()
	 * @generated
	 */
	int DEPLOY_ON_DEVICE = 10;
	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_ON_DEVICE__COMPONENT = 0;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_ON_DEVICE__REF_ID = 1;
	/**
	 * The number of structural features of the '<em>Deploy On Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_ON_DEVICE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl <em>Device Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDeviceConfiguration()
	 * @generated
	 */
	int DEVICE_CONFIGURATION = 11;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Device Manager Soft Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG = 1;
	/**
	 * The feature id for the '<em><b>Component Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__COMPONENT_FILES = 2;
	/**
	 * The feature id for the '<em><b>Partitioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__PARTITIONING = 3;
	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__CONNECTIONS = 4;
	/**
	 * The feature id for the '<em><b>Domain Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__DOMAIN_MANAGER = 5;
	/**
	 * The feature id for the '<em><b>File System Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES = 6;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__ID = 7;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__NAME = 8;
	/**
	 * The number of structural features of the '<em>Device Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_FEATURE_COUNT = 9;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DeviceManagerSoftPkgImpl <em>Device Manager Soft Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DeviceManagerSoftPkgImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDeviceManagerSoftPkg()
	 * @generated
	 */
	int DEVICE_MANAGER_SOFT_PKG = 12;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGER_SOFT_PKG__SOFT_PKG = 1;
	/**
	 * The number of structural features of the '<em>Device Manager Soft Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGER_SOFT_PKG_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DevicePkgFileImpl <em>Device Pkg File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DevicePkgFileImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDevicePkgFile()
	 * @generated
	 */
	int DEVICE_PKG_FILE = 13;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_FILE__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_FILE__TYPE = 1;
	/**
	 * The feature id for the '<em><b>Device Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_FILE__DEVICE_PKG = 2;
	/**
	 * The number of structural features of the '<em>Device Pkg File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_FILE_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.DomainManagerImpl <em>Domain Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.DomainManagerImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDomainManager()
	 * @generated
	 */
	int DOMAIN_MANAGER = 14;
	/**
	 * The feature id for the '<em><b>Naming Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__NAMING_SERVICE = 0;
	/**
	 * The feature id for the '<em><b>Stringified Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF = 1;
	/**
	 * The number of structural features of the '<em>Domain Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.FileSystemNameImpl <em>File System Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.FileSystemNameImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getFileSystemName()
	 * @generated
	 */
	int FILE_SYSTEM_NAME = 15;
	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_NAME__DEVICE_ID = 0;
	/**
	 * The feature id for the '<em><b>Mount Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_NAME__MOUNT_NAME = 1;
	/**
	 * The number of structural features of the '<em>File System Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_NAME_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dcd.impl.FileSystemNamesImpl <em>File System Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.impl.FileSystemNamesImpl
	 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getFileSystemNames()
	 * @generated
	 */
	int FILE_SYSTEM_NAMES = 16;
	/**
	 * The feature id for the '<em><b>File System Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_NAMES__FILE_SYSTEM_NAME = 0;
	/**
	 * The number of structural features of the '<em>File System Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_NAMES_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Placement</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement
	 * @generated
	 */
	EClass getDcdComponentPlacement();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDeployDevice <em>Deploy Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy Device</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDeployDevice()
	 * @see #getDcdComponentPlacement()
	 * @generated
	 */
	EReference getDcdComponentPlacement_DeployDevice();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getCompositePartOfDevice <em>Composite Part Of Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Part Of Device</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getCompositePartOfDevice()
	 * @see #getDcdComponentPlacement()
	 * @generated
	 */
	EReference getDcdComponentPlacement_CompositePartOfDevice();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDevicePkgFile <em>Device Pkg File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Pkg File</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDevicePkgFile()
	 * @see #getDcdComponentPlacement()
	 * @generated
	 */
	EReference getDcdComponentPlacement_DevicePkgFile();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice <em>Parent Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Device</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice()
	 * @see #getDcdComponentPlacement()
	 * @generated
	 */
	EReference getDcdComponentPlacement_ParentDevice();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentInstantiation
	 * @generated
	 */
	EClass getDcdComponentInstantiation();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdPartitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partitioning</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdPartitioning
	 * @generated
	 */
	EClass getDcdPartitioning();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef
	 * @generated
	 */
	EClass getDcdComponentInstantiationRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Interface</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdConnectInterface
	 * @generated
	 */
	EClass getDcdConnectInterface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdUsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Port</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdUsesPort
	 * @generated
	 */
	EClass getDcdUsesPort();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Port</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdProvidesPort
	 * @generated
	 */
	EClass getDcdProvidesPort();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdConnections
	 * @generated
	 */
	EClass getDcdConnections();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice <em>Composite Part Of Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Part Of Device</em>'.
	 * @see mil.jpeojtrs.sca.dcd.CompositePartOfDevice
	 * @generated
	 */
	EClass getCompositePartOfDevice();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent()
	 * @see #getCompositePartOfDevice()
	 * @generated
	 */
	EReference getCompositePartOfDevice_Component();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getRefID()
	 * @see #getCompositePartOfDevice()
	 * @generated
	 */
	EAttribute getCompositePartOfDevice_RefID();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DcdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdDocumentRoot
	 * @generated
	 */
	EClass getDcdDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getMixed()
	 * @see #getDcdDocumentRoot()
	 * @generated
	 */
	EAttribute getDcdDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getXMLNSPrefixMap()
	 * @see #getDcdDocumentRoot()
	 * @generated
	 */
	EReference getDcdDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getXSISchemaLocation()
	 * @see #getDcdDocumentRoot()
	 * @generated
	 */
	EReference getDcdDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getDeviceconfiguration <em>Deviceconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviceconfiguration</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DcdDocumentRoot#getDeviceconfiguration()
	 * @see #getDcdDocumentRoot()
	 * @generated
	 */
	EReference getDcdDocumentRoot_Deviceconfiguration();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice <em>Deploy On Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy On Device</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeployOnDevice
	 * @generated
	 */
	EClass getDeployOnDevice();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent()
	 * @see #getDeployOnDevice()
	 * @generated
	 */
	EReference getDeployOnDevice_Component();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeployOnDevice#getRefID()
	 * @see #getDeployOnDevice()
	 * @generated
	 */
	EAttribute getDeployOnDevice_RefID();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration <em>Device Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Configuration</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration
	 * @generated
	 */
	EClass getDeviceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDescription()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EAttribute getDeviceConfiguration_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDeviceManagerSoftPkg <em>Device Manager Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Manager Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDeviceManagerSoftPkg()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_DeviceManagerSoftPkg();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getComponentFiles <em>Component Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Files</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getComponentFiles()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_ComponentFiles();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getPartitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partitioning</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getPartitioning()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_Partitioning();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connections</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getConnections()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDomainManager <em>Domain Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Manager</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDomainManager()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_DomainManager();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getFileSystemNames <em>File System Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File System Names</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getFileSystemNames()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_FileSystemNames();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getId()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EAttribute getDeviceConfiguration_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration#getName()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EAttribute getDeviceConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg <em>Device Manager Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Manager Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg
	 * @generated
	 */
	EClass getDeviceManagerSoftPkg();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getLocalFile()
	 * @see #getDeviceManagerSoftPkg()
	 * @generated
	 */
	EReference getDeviceManagerSoftPkg_LocalFile();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg()
	 * @see #getDeviceManagerSoftPkg()
	 * @generated
	 */
	EReference getDeviceManagerSoftPkg_SoftPkg();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile <em>Device Pkg File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Pkg File</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile
	 * @generated
	 */
	EClass getDevicePkgFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile#getLocalFile()
	 * @see #getDevicePkgFile()
	 * @generated
	 */
	EReference getDevicePkgFile_LocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile#getType()
	 * @see #getDevicePkgFile()
	 * @generated
	 */
	EAttribute getDevicePkgFile_Type();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg <em>Device Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg()
	 * @see #getDevicePkgFile()
	 * @generated
	 */
	EReference getDevicePkgFile_DevicePkg();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.DomainManager <em>Domain Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Manager</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DomainManager
	 * @generated
	 */
	EClass getDomainManager();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dcd.DomainManager#getNamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Naming Service</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DomainManager#getNamingService()
	 * @see #getDomainManager()
	 * @generated
	 */
	EReference getDomainManager_NamingService();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.DomainManager#getStringifiedObjectRef <em>Stringified Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stringified Object Ref</em>'.
	 * @see mil.jpeojtrs.sca.dcd.DomainManager#getStringifiedObjectRef()
	 * @see #getDomainManager()
	 * @generated
	 */
	EAttribute getDomainManager_StringifiedObjectRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.FileSystemName <em>File System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Name</em>'.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemName
	 * @generated
	 */
	EClass getFileSystemName();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.FileSystemName#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemName#getDeviceID()
	 * @see #getFileSystemName()
	 * @generated
	 */
	EAttribute getFileSystemName_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dcd.FileSystemName#getMountName <em>Mount Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Name</em>'.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemName#getMountName()
	 * @see #getFileSystemName()
	 * @generated
	 */
	EAttribute getFileSystemName_MountName();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dcd.FileSystemNames <em>File System Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Names</em>'.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemNames
	 * @generated
	 */
	EClass getFileSystemNames();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.dcd.FileSystemNames#getFileSystemName <em>File System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File System Name</em>'.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemNames#getFileSystemName()
	 * @see #getFileSystemNames()
	 * @generated
	 */
	EReference getFileSystemNames_FileSystemName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DcdFactory getDcdFactory();

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
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl <em>Component Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdComponentPlacement()
		 * @generated
		 */
		EClass DCD_COMPONENT_PLACEMENT = eINSTANCE.getDcdComponentPlacement();
		/**
		 * The meta object literal for the '<em><b>Deploy Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE = eINSTANCE.getDcdComponentPlacement_DeployDevice();
		/**
		 * The meta object literal for the '<em><b>Composite Part Of Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE = eINSTANCE.getDcdComponentPlacement_CompositePartOfDevice();
		/**
		 * The meta object literal for the '<em><b>Device Pkg File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE = eINSTANCE.getDcdComponentPlacement_DevicePkgFile();
		/**
		 * The meta object literal for the '<em><b>Parent Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_COMPONENT_PLACEMENT__PARENT_DEVICE = eINSTANCE.getDcdComponentPlacement_ParentDevice();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationImpl <em>Component Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdComponentInstantiation()
		 * @generated
		 */
		EClass DCD_COMPONENT_INSTANTIATION = eINSTANCE.getDcdComponentInstantiation();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdPartitioningImpl <em>Partitioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPartitioningImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdPartitioning()
		 * @generated
		 */
		EClass DCD_PARTITIONING = eINSTANCE.getDcdPartitioning();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationRefImpl <em>Component Instantiation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationRefImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdComponentInstantiationRef()
		 * @generated
		 */
		EClass DCD_COMPONENT_INSTANTIATION_REF = eINSTANCE.getDcdComponentInstantiationRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdConnectInterfaceImpl <em>Connect Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdConnectInterfaceImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdConnectInterface()
		 * @generated
		 */
		EClass DCD_CONNECT_INTERFACE = eINSTANCE.getDcdConnectInterface();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdUsesPortImpl <em>Uses Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdUsesPortImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdUsesPort()
		 * @generated
		 */
		EClass DCD_USES_PORT = eINSTANCE.getDcdUsesPort();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdProvidesPortImpl <em>Provides Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdProvidesPortImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdProvidesPort()
		 * @generated
		 */
		EClass DCD_PROVIDES_PORT = eINSTANCE.getDcdProvidesPort();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdConnectionsImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdConnections()
		 * @generated
		 */
		EClass DCD_CONNECTIONS = eINSTANCE.getDcdConnections();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.CompositePartOfDeviceImpl <em>Composite Part Of Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.CompositePartOfDeviceImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getCompositePartOfDevice()
		 * @generated
		 */
		EClass COMPOSITE_PART_OF_DEVICE = eINSTANCE.getCompositePartOfDevice();
		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PART_OF_DEVICE__COMPONENT = eINSTANCE.getCompositePartOfDevice_Component();
		/**
		 * The meta object literal for the '<em><b>Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_PART_OF_DEVICE__REF_ID = eINSTANCE.getCompositePartOfDevice_RefID();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DcdDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdDocumentRootImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDcdDocumentRoot()
		 * @generated
		 */
		EClass DCD_DOCUMENT_ROOT = eINSTANCE.getDcdDocumentRoot();
		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCD_DOCUMENT_ROOT__MIXED = eINSTANCE.getDcdDocumentRoot_Mixed();
		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDcdDocumentRoot_XMLNSPrefixMap();
		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDcdDocumentRoot_XSISchemaLocation();
		/**
		 * The meta object literal for the '<em><b>Deviceconfiguration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCD_DOCUMENT_ROOT__DEVICECONFIGURATION = eINSTANCE.getDcdDocumentRoot_Deviceconfiguration();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DeployOnDeviceImpl <em>Deploy On Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DeployOnDeviceImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDeployOnDevice()
		 * @generated
		 */
		EClass DEPLOY_ON_DEVICE = eINSTANCE.getDeployOnDevice();
		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY_ON_DEVICE__COMPONENT = eINSTANCE.getDeployOnDevice_Component();
		/**
		 * The meta object literal for the '<em><b>Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_ON_DEVICE__REF_ID = eINSTANCE.getDeployOnDevice_RefID();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl <em>Device Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDeviceConfiguration()
		 * @generated
		 */
		EClass DEVICE_CONFIGURATION = eINSTANCE.getDeviceConfiguration();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONFIGURATION__DESCRIPTION = eINSTANCE.getDeviceConfiguration_Description();
		/**
		 * The meta object literal for the '<em><b>Device Manager Soft Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG = eINSTANCE.getDeviceConfiguration_DeviceManagerSoftPkg();
		/**
		 * The meta object literal for the '<em><b>Component Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__COMPONENT_FILES = eINSTANCE.getDeviceConfiguration_ComponentFiles();
		/**
		 * The meta object literal for the '<em><b>Partitioning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__PARTITIONING = eINSTANCE.getDeviceConfiguration_Partitioning();
		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__CONNECTIONS = eINSTANCE.getDeviceConfiguration_Connections();
		/**
		 * The meta object literal for the '<em><b>Domain Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__DOMAIN_MANAGER = eINSTANCE.getDeviceConfiguration_DomainManager();
		/**
		 * The meta object literal for the '<em><b>File System Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES = eINSTANCE.getDeviceConfiguration_FileSystemNames();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONFIGURATION__ID = eINSTANCE.getDeviceConfiguration_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONFIGURATION__NAME = eINSTANCE.getDeviceConfiguration_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DeviceManagerSoftPkgImpl <em>Device Manager Soft Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DeviceManagerSoftPkgImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDeviceManagerSoftPkg()
		 * @generated
		 */
		EClass DEVICE_MANAGER_SOFT_PKG = eINSTANCE.getDeviceManagerSoftPkg();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE = eINSTANCE.getDeviceManagerSoftPkg_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Soft Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGER_SOFT_PKG__SOFT_PKG = eINSTANCE.getDeviceManagerSoftPkg_SoftPkg();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DevicePkgFileImpl <em>Device Pkg File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DevicePkgFileImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDevicePkgFile()
		 * @generated
		 */
		EClass DEVICE_PKG_FILE = eINSTANCE.getDevicePkgFile();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PKG_FILE__LOCAL_FILE = eINSTANCE.getDevicePkgFile_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG_FILE__TYPE = eINSTANCE.getDevicePkgFile_Type();
		/**
		 * The meta object literal for the '<em><b>Device Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PKG_FILE__DEVICE_PKG = eINSTANCE.getDevicePkgFile_DevicePkg();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.DomainManagerImpl <em>Domain Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.DomainManagerImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getDomainManager()
		 * @generated
		 */
		EClass DOMAIN_MANAGER = eINSTANCE.getDomainManager();
		/**
		 * The meta object literal for the '<em><b>Naming Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MANAGER__NAMING_SERVICE = eINSTANCE.getDomainManager_NamingService();
		/**
		 * The meta object literal for the '<em><b>Stringified Object Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF = eINSTANCE.getDomainManager_StringifiedObjectRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.FileSystemNameImpl <em>File System Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.FileSystemNameImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getFileSystemName()
		 * @generated
		 */
		EClass FILE_SYSTEM_NAME = eINSTANCE.getFileSystemName();
		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM_NAME__DEVICE_ID = eINSTANCE.getFileSystemName_DeviceID();
		/**
		 * The meta object literal for the '<em><b>Mount Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM_NAME__MOUNT_NAME = eINSTANCE.getFileSystemName_MountName();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dcd.impl.FileSystemNamesImpl <em>File System Names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dcd.impl.FileSystemNamesImpl
		 * @see mil.jpeojtrs.sca.dcd.impl.DcdPackageImpl#getFileSystemNames()
		 * @generated
		 */
		EClass FILE_SYSTEM_NAMES = eINSTANCE.getFileSystemNames();
		/**
		 * The meta object literal for the '<em><b>File System Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SYSTEM_NAMES__FILE_SYSTEM_NAME = eINSTANCE.getFileSystemNames_FileSystemName();

	}

} // DcdPackage
