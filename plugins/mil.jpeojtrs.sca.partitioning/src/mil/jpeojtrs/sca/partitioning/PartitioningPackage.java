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
package mil.jpeojtrs.sca.partitioning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import mil.jpeojtrs.sca.prf.PrfPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @noimplement This interface is not intended to be implemented by clients.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.partitioning.PartitioningFactory
 * @model kind="package"
 * @generated
 */
public interface PartitioningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partitioning";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/partitioning";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partitioning";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartitioningPackage eINSTANCE = mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl <em>Component File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentFile()
	 * @generated
	 */
	int COMPONENT_FILE = 0;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE__ID = 1;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE__SOFT_PKG = 2;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE__TYPE = 3;
	/**
	 * The number of structural features of the '<em>Component File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.DomComponentFileImpl <em>Dom Component File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.DomComponentFileImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomComponentFile()
	 * @generated
	 */
	int DOM_COMPONENT_FILE = 1;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_COMPONENT_FILE__LOCAL_FILE = COMPONENT_FILE__LOCAL_FILE;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_COMPONENT_FILE__ID = COMPONENT_FILE__ID;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_COMPONENT_FILE__SOFT_PKG = COMPONENT_FILE__SOFT_PKG;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_COMPONENT_FILE__TYPE = COMPONENT_FILE__TYPE;
	/**
	 * The number of structural features of the '<em>Dom Component File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_COMPONENT_FILE_FEATURE_COUNT = COMPONENT_FILE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.DevComponentFileImpl <em>Dev Component File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.DevComponentFileImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDevComponentFile()
	 * @generated
	 */
	int DEV_COMPONENT_FILE = 2;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_COMPONENT_FILE__LOCAL_FILE = COMPONENT_FILE__LOCAL_FILE;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_COMPONENT_FILE__ID = COMPONENT_FILE__ID;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_COMPONENT_FILE__SOFT_PKG = COMPONENT_FILE__SOFT_PKG;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_COMPONENT_FILE__TYPE = COMPONENT_FILE__TYPE;
	/**
	 * The number of structural features of the '<em>Dev Component File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_COMPONENT_FILE_FEATURE_COUNT = COMPONENT_FILE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileRefImpl <em>Component File Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentFileRefImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentFileRef()
	 * @generated
	 */
	int COMPONENT_FILE_REF = 3;
	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE_REF__FILE = 0;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE_REF__REFID = 1;
	/**
	 * The number of structural features of the '<em>Component File Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILE_REF_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFilesImpl <em>Component Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentFilesImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentFiles()
	 * @generated
	 */
	int COMPONENT_FILES = 4;
	/**
	 * The feature id for the '<em><b>Component File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILES__COMPONENT_FILE = 0;
	/**
	 * The number of structural features of the '<em>Component Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FILES_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl <em>Component Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentInstantiation()
	 * @generated
	 */
	int COMPONENT_INSTANTIATION = 5;
	/**
	 * The feature id for the '<em><b>Usage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__USAGE_NAME = 0;
	/**
	 * The feature id for the '<em><b>Component Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES = 1;
	/**
	 * The feature id for the '<em><b>Affinity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__AFFINITY = 2;
	/**
	 * The feature id for the '<em><b>Logging Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__LOGGING_CONFIG = 3;
	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__PROVIDES = 4;
	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__USES = 5;
	/**
	 * The feature id for the '<em><b>Interface Stub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__INTERFACE_STUB = 6;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__ID = 7;
	/**
	 * The feature id for the '<em><b>Placement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__PLACEMENT = 8;
	/**
	 * The feature id for the '<em><b>Impl ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__IMPL_ID = 9;
	/**
	 * The feature id for the '<em><b>Start Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__START_ORDER = 10;
	/**
	 * The number of structural features of the '<em>Component Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_FEATURE_COUNT = 11;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationRefImpl <em>Component Instantiation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationRefImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentInstantiationRef()
	 * @generated
	 */
	int COMPONENT_INSTANTIATION_REF = 6;
	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_REF__INSTANTIATION = 0;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_REF__REFID = 1;
	/**
	 * The number of structural features of the '<em>Component Instantiation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_REF_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl <em>Component Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentPlacement()
	 * @generated
	 */
	int COMPONENT_PLACEMENT = 7;
	/**
	 * The feature id for the '<em><b>Component File Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PLACEMENT__COMPONENT_FILE_REF = 0;
	/**
	 * The feature id for the '<em><b>Component Instantiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION = 1;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PLACEMENT__NAME = 2;
	/**
	 * The number of structural features of the '<em>Component Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PLACEMENT_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl <em>Component Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentProperties()
	 * @generated
	 */
	int COMPONENT_PROPERTIES = 8;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTIES__PROPERTIES = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTIES__SIMPLE_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTIES__STRUCT_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Struct Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Component Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTIES_FEATURE_COUNT = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl <em>Component Supported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentSupportedInterface()
	 * @generated
	 */
	int COMPONENT_SUPPORTED_INTERFACE = 9;
	/**
	 * The feature id for the '<em><b>Supported Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER = 0;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF = 1;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = 2;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF = 3;
	/**
	 * The feature id for the '<em><b>Device Used By Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION = 4;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__FIND_BY = 5;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE__INTERFACE = 6;
	/**
	 * The number of structural features of the '<em>Component Supported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE_FEATURE_COUNT = 7;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.ConnectionTarget <em>Connection Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ConnectionTarget
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getConnectionTarget()
	 * @generated
	 */
	int CONNECTION_TARGET = 13;
	/**
	 * The number of structural features of the '<em>Connection Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET_FEATURE_COUNT = 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceStubImpl <em>Component Supported Interface Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceStubImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentSupportedInterfaceStub()
	 * @generated
	 */
	int COMPONENT_SUPPORTED_INTERFACE_STUB = 10;
	/**
	 * The number of structural features of the '<em>Component Supported Interface Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUPPORTED_INTERFACE_STUB_FEATURE_COUNT = CONNECTION_TARGET_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl <em>Connect Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getConnectInterface()
	 * @generated
	 */
	int CONNECT_INTERFACE = 11;
	/**
	 * The feature id for the '<em><b>Uses Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__USES_PORT = 0;
	/**
	 * The feature id for the '<em><b>Provides Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__PROVIDES_PORT = 1;
	/**
	 * The feature id for the '<em><b>Component Supported Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE = 2;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__FIND_BY = 3;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__ID = 4;
	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__SOURCE = 5;
	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE__TARGET = 6;
	/**
	 * The number of structural features of the '<em>Connect Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_INTERFACE_FEATURE_COUNT = 7;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ConnectionsImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getConnections()
	 * @generated
	 */
	int CONNECTIONS = 12;
	/**
	 * The feature id for the '<em><b>Connect Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__CONNECT_INTERFACE = 0;
	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.DeviceThatLoadedThisComponentRefImpl <em>Device That Loaded This Component Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.DeviceThatLoadedThisComponentRefImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDeviceThatLoadedThisComponentRef()
	 * @generated
	 */
	int DEVICE_THAT_LOADED_THIS_COMPONENT_REF = 14;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_THAT_LOADED_THIS_COMPONENT_REF__REFID = 0;
	/**
	 * The number of structural features of the '<em>Device That Loaded This Component Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_THAT_LOADED_THIS_COMPONENT_REF_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByThisComponentRefImpl <em>Device Used By This Component Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByThisComponentRefImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDeviceUsedByThisComponentRef()
	 * @generated
	 */
	int DEVICE_USED_BY_THIS_COMPONENT_REF = 15;
	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_USED_BY_THIS_COMPONENT_REF__REF_ID = 0;
	/**
	 * The feature id for the '<em><b>Uses Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_USED_BY_THIS_COMPONENT_REF__USES_REF_ID = 1;
	/**
	 * The number of structural features of the '<em>Device Used By This Component Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_USED_BY_THIS_COMPONENT_REF_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByApplicationImpl <em>Device Used By Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByApplicationImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDeviceUsedByApplication()
	 * @generated
	 */
	int DEVICE_USED_BY_APPLICATION = 16;
	/**
	 * The feature id for the '<em><b>Uses Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_USED_BY_APPLICATION__USES_REF_ID = 0;
	/**
	 * The number of structural features of the '<em>Device Used By Application</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_USED_BY_APPLICATION_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.DomainFinderImpl <em>Domain Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.DomainFinderImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomainFinder()
	 * @generated
	 */
	int DOMAIN_FINDER = 17;
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
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.FindByImpl <em>Find By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.FindByImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getFindBy()
	 * @generated
	 */
	int FIND_BY = 18;
	/**
	 * The feature id for the '<em><b>Naming Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY__NAMING_SERVICE = 0;
	/**
	 * The feature id for the '<em><b>Domain Finder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY__DOMAIN_FINDER = 1;
	/**
	 * The number of structural features of the '<em>Find By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl <em>Find By Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getFindByStub()
	 * @generated
	 */
	int FIND_BY_STUB = 19;
	/**
	 * The feature id for the '<em><b>Naming Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB__NAMING_SERVICE = CONNECTION_TARGET_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Domain Finder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB__DOMAIN_FINDER = CONNECTION_TARGET_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB__PROVIDES = CONNECTION_TARGET_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB__USES = CONNECTION_TARGET_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB__INTERFACE = CONNECTION_TARGET_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Find By Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB_FEATURE_COUNT = CONNECTION_TARGET_FEATURE_COUNT + 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubContainerImpl <em>Find By Stub Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.FindByStubContainerImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getFindByStubContainer()
	 * @generated
	 */
	int FIND_BY_STUB_CONTAINER = 20;
	/**
	 * The feature id for the '<em><b>Stubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB_CONTAINER__STUBS = 0;
	/**
	 * The number of structural features of the '<em>Find By Stub Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_STUB_CONTAINER_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.LocalFileImpl <em>Local File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.LocalFileImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getLocalFile()
	 * @generated
	 */
	int LOCAL_FILE = 21;
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
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.LoggingConfigImpl <em>Logging Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.LoggingConfigImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getLoggingConfig()
	 * @generated
	 */
	int LOGGING_CONFIG = 22;
	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIG__URI = 0;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIG__LEVEL = 1;
	/**
	 * The number of structural features of the '<em>Logging Config</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIG_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.NamingServiceImpl <em>Naming Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.NamingServiceImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getNamingService()
	 * @generated
	 */
	int NAMING_SERVICE = 23;
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
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl <em>Partitioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getPartitioning()
	 * @generated
	 */
	int PARTITIONING = 24;
	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIONING__PARTS = 0;
	/**
	 * The feature id for the '<em><b>Component Placement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIONING__COMPONENT_PLACEMENT = 1;
	/**
	 * The number of structural features of the '<em>Partitioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIONING_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl <em>Provides Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getProvidesPort()
	 * @generated
	 */
	int PROVIDES_PORT = 25;
	/**
	 * The feature id for the '<em><b>Provides Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT__PROVIDES_IDENTIFIER = 0;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT__COMPONENT_INSTANTIATION_REF = 1;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = 2;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = 3;
	/**
	 * The feature id for the '<em><b>Device Used By Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT__DEVICE_USED_BY_APPLICATION = 4;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT__FIND_BY = 5;
	/**
	 * The number of structural features of the '<em>Provides Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT_FEATURE_COUNT = 6;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortStubImpl <em>Provides Port Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.ProvidesPortStubImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getProvidesPortStub()
	 * @generated
	 */
	int PROVIDES_PORT_STUB = 26;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT_STUB__NAME = CONNECTION_TARGET_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT_STUB__PROVIDES = CONNECTION_TARGET_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Provides Port Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PORT_STUB_FEATURE_COUNT = CONNECTION_TARGET_FEATURE_COUNT + 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.RequirementsImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 27;
	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REQUIRES = 0;
	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.RequiresImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 28;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ID = 0;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__VALUE = 1;
	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl <em>Uses Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getUsesPort()
	 * @generated
	 */
	int USES_PORT = 29;
	/**
	 * The feature id for the '<em><b>Uses Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT__USES_IDENTIFIER = 0;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT__COMPONENT_INSTANTIATION_REF = 1;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = 2;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = 3;
	/**
	 * The feature id for the '<em><b>Device Used By Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT__DEVICE_USED_BY_APPLICATION = 4;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT__FIND_BY = 5;
	/**
	 * The number of structural features of the '<em>Uses Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT_FEATURE_COUNT = 6;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl <em>Uses Port Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getUsesPortStub()
	 * @generated
	 */
	int USES_PORT_STUB = 30;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT_STUB__NAME = 0;
	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT_STUB__USES = 1;
	/**
	 * The feature id for the '<em><b>Supported Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT_STUB__SUPPORTED_IDENTIFIER = 2;
	/**
	 * The number of structural features of the '<em>Uses Port Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PORT_STUB_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl <em>Uses Device Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getUsesDeviceStub()
	 * @generated
	 */
	int USES_DEVICE_STUB = 31;
	/**
	 * The feature id for the '<em><b>Uses Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_STUB__USES_DEVICE = 0;
	/**
	 * The feature id for the '<em><b>Provides Port Stubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_STUB__PROVIDES_PORT_STUBS = 1;
	/**
	 * The feature id for the '<em><b>Uses Port Stubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_STUB__USES_PORT_STUBS = 2;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_STUB__INTERFACE = 3;
	/**
	 * The number of structural features of the '<em>Uses Device Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_STUB_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.partitioning.DomainFinderType <em>Domain Finder Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinderType
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomainFinderType()
	 * @generated
	 */
	int DOMAIN_FINDER_TYPE = 32;
	/**
	 * The meta object id for the '<em>Domain Finder Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinderType
	 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomainFinderTypeObject()
	 * @generated
	 */
	int DOMAIN_FINDER_TYPE_OBJECT = 33;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentFile <em>Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile
	 * @generated
	 */
	EClass getComponentFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile#getLocalFile()
	 * @see #getComponentFile()
	 * @generated
	 */
	EReference getComponentFile_LocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile#getId()
	 * @see #getComponentFile()
	 * @generated
	 */
	EAttribute getComponentFile_Id();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg()
	 * @see #getComponentFile()
	 * @generated
	 */
	EReference getComponentFile_SoftPkg();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile#getType()
	 * @see #getComponentFile()
	 * @generated
	 */
	EAttribute getComponentFile_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.DomComponentFile <em>Dom Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dom Component File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DomComponentFile
	 * @generated
	 */
	EClass getDomComponentFile();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.DevComponentFile <em>Dev Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev Component File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DevComponentFile
	 * @generated
	 */
	EClass getDevComponentFile();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef <em>Component File Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component File Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFileRef
	 * @generated
	 */
	EClass getComponentFileRef();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile()
	 * @see #getComponentFileRef()
	 * @generated
	 */
	EReference getComponentFileRef_File();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFileRef#getRefid()
	 * @see #getComponentFileRef()
	 * @generated
	 */
	EAttribute getComponentFileRef_Refid();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentFiles <em>Component Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Files</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFiles
	 * @generated
	 */
	EClass getComponentFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentFiles#getComponentFile <em>Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFiles#getComponentFile()
	 * @see #getComponentFiles()
	 * @generated
	 */
	EReference getComponentFiles_ComponentFile();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation
	 * @generated
	 */
	EClass getComponentInstantiation();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUsageName <em>Usage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUsageName()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EAttribute getComponentInstantiation_UsageName();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getComponentProperties <em>Component Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Properties</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getComponentProperties()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_ComponentProperties();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getAffinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affinity</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getAffinity()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_Affinity();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getLoggingConfig <em>Logging Config</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logging Config</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getLoggingConfig()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_LoggingConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getProvides()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUses()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getInterfaceStub <em>Interface Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Stub</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getInterfaceStub()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_InterfaceStub();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getId()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EAttribute getComponentInstantiation_Id();

	/**
	 * Returns the meta object for the container reference '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Placement</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getPlacement()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_Placement();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getImplID <em>Impl ID</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl ID</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getImplID()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EAttribute getComponentInstantiation_ImplID();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getStartOrder <em>Start Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Order</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getStartOrder()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EAttribute getComponentInstantiation_StartOrder();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef
	 * @generated
	 */
	EClass getComponentInstantiationRef();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiation</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation()
	 * @see #getComponentInstantiationRef()
	 * @generated
	 */
	EReference getComponentInstantiationRef_Instantiation();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getRefid()
	 * @see #getComponentInstantiationRef()
	 * @generated
	 */
	EAttribute getComponentInstantiationRef_Refid();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Placement</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement
	 * @generated
	 */
	EClass getComponentPlacement();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentFileRef <em>Component File Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component File Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentFileRef()
	 * @see #getComponentPlacement()
	 * @generated
	 */
	EReference getComponentPlacement_ComponentFileRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instantiation</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentInstantiation()
	 * @see #getComponentPlacement()
	 * @generated
	 */
	EReference getComponentPlacement_ComponentInstantiation();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement#getName()
	 * @see #getComponentPlacement()
	 * @generated
	 */
	EAttribute getComponentPlacement_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties <em>Component Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Properties</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties
	 * @generated
	 */
	EClass getComponentProperties();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties#getProperties()
	 * @see #getComponentProperties()
	 * @generated
	 */
	EAttribute getComponentProperties_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties#getSimpleRef()
	 * @see #getComponentProperties()
	 * @generated
	 */
	EReference getComponentProperties_SimpleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties#getSimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties#getSimpleSequenceRef()
	 * @see #getComponentProperties()
	 * @generated
	 */
	EReference getComponentProperties_SimpleSequenceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties#getStructRef()
	 * @see #getComponentProperties()
	 * @generated
	 */
	EReference getComponentProperties_StructRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties#getStructSequenceRef <em>Struct Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties#getStructSequenceRef()
	 * @see #getComponentProperties()
	 * @generated
	 */
	EReference getComponentProperties_StructSequenceRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface <em>Component Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Supported Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface
	 * @generated
	 */
	EClass getComponentSupportedInterface();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getSupportedIdentifier <em>Supported Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Identifier</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getSupportedIdentifier()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EAttribute getComponentSupportedInterface_SupportedIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getComponentInstantiationRef()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EReference getComponentSupportedInterface_ComponentInstantiationRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device That Loaded This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceThatLoadedThisComponentRef()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EReference getComponentSupportedInterface_DeviceThatLoadedThisComponentRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Used By This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByThisComponentRef()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EReference getComponentSupportedInterface_DeviceUsedByThisComponentRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByApplication <em>Device Used By Application</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Used By Application</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByApplication()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EReference getComponentSupportedInterface_DeviceUsedByApplication();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getFindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getFindBy()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EReference getComponentSupportedInterface_FindBy();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface()
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	EReference getComponentSupportedInterface_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub <em>Component Supported Interface Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Supported Interface Stub</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub
	 * @generated
	 */
	EClass getComponentSupportedInterfaceStub();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface
	 * @generated
	 */
	EClass getConnectInterface();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getUsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses Port</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getUsesPort()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EReference getConnectInterface_UsesPort();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provides Port</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getProvidesPort()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EReference getConnectInterface_ProvidesPort();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getComponentSupportedInterface <em>Component Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Supported Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getComponentSupportedInterface()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EReference getConnectInterface_ComponentSupportedInterface();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getFindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getFindBy()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EReference getConnectInterface_FindBy();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getId()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EAttribute getConnectInterface_Id();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EReference getConnectInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget()
	 * @see #getConnectInterface()
	 * @generated
	 */
	EReference getConnectInterface_Target();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Connections
	 * @generated
	 */
	EClass getConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.Connections#getConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connect Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Connections#getConnectInterface()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_ConnectInterface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ConnectionTarget <em>Connection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Target</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectionTarget
	 * @generated
	 */
	EClass getConnectionTarget();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device That Loaded This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef
	 * @generated
	 */
	EClass getDeviceThatLoadedThisComponentRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef#getRefid()
	 * @see #getDeviceThatLoadedThisComponentRef()
	 * @generated
	 */
	EAttribute getDeviceThatLoadedThisComponentRef_Refid();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Used By This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef
	 * @generated
	 */
	EClass getDeviceUsedByThisComponentRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef#getRefId()
	 * @see #getDeviceUsedByThisComponentRef()
	 * @generated
	 */
	EAttribute getDeviceUsedByThisComponentRef_RefId();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef#getUsesRefId <em>Uses Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Ref Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef#getUsesRefId()
	 * @see #getDeviceUsedByThisComponentRef()
	 * @generated
	 */
	EAttribute getDeviceUsedByThisComponentRef_UsesRefId();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication <em>Device Used By Application</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Used By Application</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication
	 * @generated
	 */
	EClass getDeviceUsedByApplication();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication#getUsesRefId <em>Uses Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Ref Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication#getUsesRefId()
	 * @see #getDeviceUsedByApplication()
	 * @generated
	 */
	EAttribute getDeviceUsedByApplication_UsesRefId();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.DomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Finder</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinder
	 * @generated
	 */
	EClass getDomainFinder();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.DomainFinder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinder#getName()
	 * @see #getDomainFinder()
	 * @generated
	 */
	EAttribute getDomainFinder_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.DomainFinder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinder#getType()
	 * @see #getDomainFinder()
	 * @generated
	 */
	EAttribute getDomainFinder_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.FindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindBy
	 * @generated
	 */
	EClass getFindBy();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.FindBy#getNamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Naming Service</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindBy#getNamingService()
	 * @see #getFindBy()
	 * @generated
	 */
	EReference getFindBy_NamingService();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.FindBy#getDomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Finder</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindBy#getDomainFinder()
	 * @see #getFindBy()
	 * @generated
	 */
	EReference getFindBy_DomainFinder();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.FindByStub <em>Find By Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find By Stub</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub
	 * @generated
	 */
	EClass getFindByStub();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getNamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Naming Service</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub#getNamingService()
	 * @see #getFindByStub()
	 * @generated
	 */
	EReference getFindByStub_NamingService();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getDomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Finder</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub#getDomainFinder()
	 * @see #getFindByStub()
	 * @generated
	 */
	EReference getFindByStub_DomainFinder();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub#getProvides()
	 * @see #getFindByStub()
	 * @generated
	 */
	EReference getFindByStub_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub#getUses()
	 * @see #getFindByStub()
	 * @generated
	 */
	EReference getFindByStub_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub#getInterface()
	 * @see #getFindByStub()
	 * @generated
	 */
	EReference getFindByStub_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.FindByStubContainer <em>Find By Stub Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find By Stub Container</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStubContainer
	 * @generated
	 */
	EClass getFindByStubContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.FindByStubContainer#getStubs <em>Stubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stubs</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStubContainer#getStubs()
	 * @see #getFindByStubContainer()
	 * @generated
	 */
	EReference getFindByStubContainer_Stubs();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.LocalFile
	 * @generated
	 */
	EClass getLocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.LocalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.LocalFile#getName()
	 * @see #getLocalFile()
	 * @generated
	 */
	EAttribute getLocalFile_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.LoggingConfig <em>Logging Config</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging Config</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.LoggingConfig
	 * @generated
	 */
	EClass getLoggingConfig();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.LoggingConfig#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.LoggingConfig#getUri()
	 * @see #getLoggingConfig()
	 * @generated
	 */
	EAttribute getLoggingConfig_Uri();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.LoggingConfig#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.LoggingConfig#getLevel()
	 * @see #getLoggingConfig()
	 * @generated
	 */
	EAttribute getLoggingConfig_Level();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.NamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Naming Service</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.NamingService
	 * @generated
	 */
	EClass getNamingService();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.NamingService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.NamingService#getName()
	 * @see #getNamingService()
	 * @generated
	 */
	EAttribute getNamingService_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.Partitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partitioning</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Partitioning
	 * @generated
	 */
	EClass getPartitioning();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.partitioning.Partitioning#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parts</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Partitioning#getParts()
	 * @see #getPartitioning()
	 * @generated
	 */
	EAttribute getPartitioning_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.Partitioning#getComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Placement</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Partitioning#getComponentPlacement()
	 * @see #getPartitioning()
	 * @generated
	 */
	EReference getPartitioning_ComponentPlacement();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Port</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort
	 * @generated
	 */
	EClass getProvidesPort();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getProvidesIdentifier <em>Provides Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Identifier</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort#getProvidesIdentifier()
	 * @see #getProvidesPort()
	 * @generated
	 */
	EAttribute getProvidesPort_ProvidesIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort#getComponentInstantiationRef()
	 * @see #getProvidesPort()
	 * @generated
	 */
	EReference getProvidesPort_ComponentInstantiationRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device That Loaded This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceThatLoadedThisComponentRef()
	 * @see #getProvidesPort()
	 * @generated
	 */
	EReference getProvidesPort_DeviceThatLoadedThisComponentRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Used By This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceUsedByThisComponentRef()
	 * @see #getProvidesPort()
	 * @generated
	 */
	EReference getProvidesPort_DeviceUsedByThisComponentRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceUsedByApplication <em>Device Used By Application</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Used By Application</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceUsedByApplication()
	 * @see #getProvidesPort()
	 * @generated
	 */
	EReference getProvidesPort_DeviceUsedByApplication();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getFindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort#getFindBy()
	 * @see #getProvidesPort()
	 * @generated
	 */
	EReference getProvidesPort_FindBy();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub <em>Provides Port Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Port Stub</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPortStub
	 * @generated
	 */
	EClass getProvidesPortStub();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getName()
	 * @see #getProvidesPortStub()
	 * @generated
	 */
	EAttribute getProvidesPortStub_Name();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provides</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPortStub#getProvides()
	 * @see #getProvidesPortStub()
	 * @generated
	 */
	EReference getProvidesPortStub_Provides();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Requirements
	 * @generated
	 */
	EClass getRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.Requirements#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Requirements#getRequires()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Requires();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.Requires#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Requires#getId()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.Requires#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.Requires#getValue()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_Value();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.UsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Port</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort
	 * @generated
	 */
	EClass getUsesPort();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.UsesPort#getUsesIdentifier <em>Uses Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Identifier</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort#getUsesIdentifier()
	 * @see #getUsesPort()
	 * @generated
	 */
	EAttribute getUsesPort_UsesIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.UsesPort#getComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort#getComponentInstantiationRef()
	 * @see #getUsesPort()
	 * @generated
	 */
	EReference getUsesPort_ComponentInstantiationRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.UsesPort#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device That Loaded This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort#getDeviceThatLoadedThisComponentRef()
	 * @see #getUsesPort()
	 * @generated
	 */
	EReference getUsesPort_DeviceThatLoadedThisComponentRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.UsesPort#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Used By This Component Ref</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort#getDeviceUsedByThisComponentRef()
	 * @see #getUsesPort()
	 * @generated
	 */
	EReference getUsesPort_DeviceUsedByThisComponentRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.UsesPort#getDeviceUsedByApplication <em>Device Used By Application</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Used By Application</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort#getDeviceUsedByApplication()
	 * @see #getUsesPort()
	 * @generated
	 */
	EReference getUsesPort_DeviceUsedByApplication();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.UsesPort#getFindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Find By</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort#getFindBy()
	 * @see #getUsesPort()
	 * @generated
	 */
	EReference getUsesPort_FindBy();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub <em>Uses Port Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Port Stub</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPortStub
	 * @generated
	 */
	EClass getUsesPortStub();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPortStub#getName()
	 * @see #getUsesPortStub()
	 * @generated
	 */
	EAttribute getUsesPortStub_Name();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPortStub#getUses()
	 * @see #getUsesPortStub()
	 * @generated
	 */
	EReference getUsesPortStub_Uses();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub#getSupportedIdentifier <em>Supported Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Identifier</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPortStub#getSupportedIdentifier()
	 * @see #getUsesPortStub()
	 * @generated
	 */
	EAttribute getUsesPortStub_SupportedIdentifier();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub <em>Uses Device Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Device Stub</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesDeviceStub
	 * @generated
	 */
	EClass getUsesDeviceStub();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesDevice <em>Uses Device</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses Device</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesDevice()
	 * @see #getUsesDeviceStub()
	 * @generated
	 */
	EReference getUsesDeviceStub_UsesDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getProvidesPortStubs <em>Provides Port Stubs</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides Port Stubs</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getProvidesPortStubs()
	 * @see #getUsesDeviceStub()
	 * @generated
	 */
	EReference getUsesDeviceStub_ProvidesPortStubs();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesPortStubs <em>Uses Port Stubs</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Port Stubs</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getUsesPortStubs()
	 * @see #getUsesDeviceStub()
	 * @generated
	 */
	EReference getUsesDeviceStub_UsesPortStubs();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.UsesDeviceStub#getInterface()
	 * @see #getUsesDeviceStub()
	 * @generated
	 */
	EReference getUsesDeviceStub_Interface();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.partitioning.DomainFinderType <em>Domain Finder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Domain Finder Type</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinderType
	 * @generated
	 */
	EEnum getDomainFinderType();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.partitioning.DomainFinderType <em>Domain Finder Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Domain Finder Type Object</em>'.
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinderType
	 * @model instanceClass="mil.jpeojtrs.sca.partitioning.DomainFinderType"
	 *        extendedMetaData="name='domainfindertype:object' baseType='domainfindertype' qualified='false'"
	 * @generated
	 */
	EDataType getDomainFinderTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartitioningFactory getPartitioningFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * @noimplement This interface is not intended to be implemented by clients.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl <em>Component File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentFile()
		 * @generated
		 */
		EClass COMPONENT_FILE = eINSTANCE.getComponentFile();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FILE__LOCAL_FILE = eINSTANCE.getComponentFile_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_FILE__ID = eINSTANCE.getComponentFile_Id();
		/**
		 * The meta object literal for the '<em><b>Soft Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FILE__SOFT_PKG = eINSTANCE.getComponentFile_SoftPkg();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_FILE__TYPE = eINSTANCE.getComponentFile_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.DomComponentFileImpl <em>Dom Component File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.DomComponentFileImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomComponentFile()
		 * @generated
		 */
		EClass DOM_COMPONENT_FILE = eINSTANCE.getDomComponentFile();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.DevComponentFileImpl <em>Dev Component File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.DevComponentFileImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDevComponentFile()
		 * @generated
		 */
		EClass DEV_COMPONENT_FILE = eINSTANCE.getDevComponentFile();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileRefImpl <em>Component File Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentFileRefImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentFileRef()
		 * @generated
		 */
		EClass COMPONENT_FILE_REF = eINSTANCE.getComponentFileRef();
		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FILE_REF__FILE = eINSTANCE.getComponentFileRef_File();
		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_FILE_REF__REFID = eINSTANCE.getComponentFileRef_Refid();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFilesImpl <em>Component Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentFilesImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentFiles()
		 * @generated
		 */
		EClass COMPONENT_FILES = eINSTANCE.getComponentFiles();
		/**
		 * The meta object literal for the '<em><b>Component File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FILES__COMPONENT_FILE = eINSTANCE.getComponentFiles_ComponentFile();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl <em>Component Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentInstantiation()
		 * @generated
		 */
		EClass COMPONENT_INSTANTIATION = eINSTANCE.getComponentInstantiation();
		/**
		 * The meta object literal for the '<em><b>Usage Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANTIATION__USAGE_NAME = eINSTANCE.getComponentInstantiation_UsageName();
		/**
		 * The meta object literal for the '<em><b>Component Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES = eINSTANCE.getComponentInstantiation_ComponentProperties();
		/**
		 * The meta object literal for the '<em><b>Affinity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		* @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__AFFINITY = eINSTANCE.getComponentInstantiation_Affinity();
		/**
		 * The meta object literal for the '<em><b>Logging Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		* @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__LOGGING_CONFIG = eINSTANCE.getComponentInstantiation_LoggingConfig();
		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__PROVIDES = eINSTANCE.getComponentInstantiation_Provides();
		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__USES = eINSTANCE.getComponentInstantiation_Uses();
		/**
		 * The meta object literal for the '<em><b>Interface Stub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__INTERFACE_STUB = eINSTANCE.getComponentInstantiation_InterfaceStub();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANTIATION__ID = eINSTANCE.getComponentInstantiation_Id();
		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__PLACEMENT = eINSTANCE.getComponentInstantiation_Placement();
		/**
		 * The meta object literal for the '<em><b>Impl ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 1.1
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANTIATION__IMPL_ID = eINSTANCE.getComponentInstantiation_ImplID();
		/**
		 * The meta object literal for the '<em><b>Start Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANTIATION__START_ORDER = eINSTANCE.getComponentInstantiation_StartOrder();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationRefImpl <em>Component Instantiation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationRefImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentInstantiationRef()
		 * @generated
		 */
		EClass COMPONENT_INSTANTIATION_REF = eINSTANCE.getComponentInstantiationRef();
		/**
		 * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION_REF__INSTANTIATION = eINSTANCE.getComponentInstantiationRef_Instantiation();
		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANTIATION_REF__REFID = eINSTANCE.getComponentInstantiationRef_Refid();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl <em>Component Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentPlacement()
		 * @generated
		 */
		EClass COMPONENT_PLACEMENT = eINSTANCE.getComponentPlacement();
		/**
		 * The meta object literal for the '<em><b>Component File Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PLACEMENT__COMPONENT_FILE_REF = eINSTANCE.getComponentPlacement_ComponentFileRef();
		/**
		 * The meta object literal for the '<em><b>Component Instantiation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION = eINSTANCE.getComponentPlacement_ComponentInstantiation();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PLACEMENT__NAME = eINSTANCE.getComponentPlacement_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl <em>Component Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentProperties()
		 * @generated
		 */
		EClass COMPONENT_PROPERTIES = eINSTANCE.getComponentProperties();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTIES__PROPERTIES = eINSTANCE.getComponentProperties_Properties();
		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTIES__SIMPLE_REF = eINSTANCE.getComponentProperties_SimpleRef();
		/**
		 * The meta object literal for the '<em><b>Simple Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF = eINSTANCE.getComponentProperties_SimpleSequenceRef();
		/**
		 * The meta object literal for the '<em><b>Struct Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTIES__STRUCT_REF = eINSTANCE.getComponentProperties_StructRef();
		/**
		 * The meta object literal for the '<em><b>Struct Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF = eINSTANCE.getComponentProperties_StructSequenceRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl <em>Component Supported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentSupportedInterface()
		 * @generated
		 */
		EClass COMPONENT_SUPPORTED_INTERFACE = eINSTANCE.getComponentSupportedInterface();
		/**
		 * The meta object literal for the '<em><b>Supported Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER = eINSTANCE.getComponentSupportedInterface_SupportedIdentifier();
		/**
		 * The meta object literal for the '<em><b>Component Instantiation Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF = eINSTANCE.getComponentSupportedInterface_ComponentInstantiationRef();
		/**
		 * The meta object literal for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = eINSTANCE.getComponentSupportedInterface_DeviceThatLoadedThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Device Used By This Component Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF = eINSTANCE.getComponentSupportedInterface_DeviceUsedByThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Device Used By Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION = eINSTANCE.getComponentSupportedInterface_DeviceUsedByApplication();
		/**
		 * The meta object literal for the '<em><b>Find By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUPPORTED_INTERFACE__FIND_BY = eINSTANCE.getComponentSupportedInterface_FindBy();
		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUPPORTED_INTERFACE__INTERFACE = eINSTANCE.getComponentSupportedInterface_Interface();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceStubImpl <em>Component Supported Interface Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceStubImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getComponentSupportedInterfaceStub()
		 * @generated
		 */
		EClass COMPONENT_SUPPORTED_INTERFACE_STUB = eINSTANCE.getComponentSupportedInterfaceStub();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl <em>Connect Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getConnectInterface()
		 * @generated
		 */
		EClass CONNECT_INTERFACE = eINSTANCE.getConnectInterface();
		/**
		 * The meta object literal for the '<em><b>Uses Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_INTERFACE__USES_PORT = eINSTANCE.getConnectInterface_UsesPort();
		/**
		 * The meta object literal for the '<em><b>Provides Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_INTERFACE__PROVIDES_PORT = eINSTANCE.getConnectInterface_ProvidesPort();
		/**
		 * The meta object literal for the '<em><b>Component Supported Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE = eINSTANCE.getConnectInterface_ComponentSupportedInterface();
		/**
		 * The meta object literal for the '<em><b>Find By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_INTERFACE__FIND_BY = eINSTANCE.getConnectInterface_FindBy();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_INTERFACE__ID = eINSTANCE.getConnectInterface_Id();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_INTERFACE__SOURCE = eINSTANCE.getConnectInterface_Source();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_INTERFACE__TARGET = eINSTANCE.getConnectInterface_Target();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ConnectionsImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getConnections()
		 * @generated
		 */
		EClass CONNECTIONS = eINSTANCE.getConnections();
		/**
		 * The meta object literal for the '<em><b>Connect Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__CONNECT_INTERFACE = eINSTANCE.getConnections_ConnectInterface();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.ConnectionTarget <em>Connection Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.ConnectionTarget
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getConnectionTarget()
		 * @generated
		 */
		EClass CONNECTION_TARGET = eINSTANCE.getConnectionTarget();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.DeviceThatLoadedThisComponentRefImpl <em>Device That Loaded This Component Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.DeviceThatLoadedThisComponentRefImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDeviceThatLoadedThisComponentRef()
		 * @generated
		 */
		EClass DEVICE_THAT_LOADED_THIS_COMPONENT_REF = eINSTANCE.getDeviceThatLoadedThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_THAT_LOADED_THIS_COMPONENT_REF__REFID = eINSTANCE.getDeviceThatLoadedThisComponentRef_Refid();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByThisComponentRefImpl <em>Device Used By This Component Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByThisComponentRefImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDeviceUsedByThisComponentRef()
		 * @generated
		 */
		EClass DEVICE_USED_BY_THIS_COMPONENT_REF = eINSTANCE.getDeviceUsedByThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_USED_BY_THIS_COMPONENT_REF__REF_ID = eINSTANCE.getDeviceUsedByThisComponentRef_RefId();
		/**
		 * The meta object literal for the '<em><b>Uses Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_USED_BY_THIS_COMPONENT_REF__USES_REF_ID = eINSTANCE.getDeviceUsedByThisComponentRef_UsesRefId();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByApplicationImpl <em>Device Used By Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByApplicationImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDeviceUsedByApplication()
		 * @generated
		 */
		EClass DEVICE_USED_BY_APPLICATION = eINSTANCE.getDeviceUsedByApplication();
		/**
		 * The meta object literal for the '<em><b>Uses Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_USED_BY_APPLICATION__USES_REF_ID = eINSTANCE.getDeviceUsedByApplication_UsesRefId();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.DomainFinderImpl <em>Domain Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.DomainFinderImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomainFinder()
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
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.FindByImpl <em>Find By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.FindByImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getFindBy()
		 * @generated
		 */
		EClass FIND_BY = eINSTANCE.getFindBy();
		/**
		 * The meta object literal for the '<em><b>Naming Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY__NAMING_SERVICE = eINSTANCE.getFindBy_NamingService();
		/**
		 * The meta object literal for the '<em><b>Domain Finder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY__DOMAIN_FINDER = eINSTANCE.getFindBy_DomainFinder();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl <em>Find By Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getFindByStub()
		 * @generated
		 */
		EClass FIND_BY_STUB = eINSTANCE.getFindByStub();
		/**
		 * The meta object literal for the '<em><b>Naming Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY_STUB__NAMING_SERVICE = eINSTANCE.getFindByStub_NamingService();
		/**
		 * The meta object literal for the '<em><b>Domain Finder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY_STUB__DOMAIN_FINDER = eINSTANCE.getFindByStub_DomainFinder();
		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY_STUB__PROVIDES = eINSTANCE.getFindByStub_Provides();
		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY_STUB__USES = eINSTANCE.getFindByStub_Uses();
		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY_STUB__INTERFACE = eINSTANCE.getFindByStub_Interface();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubContainerImpl <em>Find By Stub Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.FindByStubContainerImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getFindByStubContainer()
		 * @generated
		 */
		EClass FIND_BY_STUB_CONTAINER = eINSTANCE.getFindByStubContainer();
		/**
		 * The meta object literal for the '<em><b>Stubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_BY_STUB_CONTAINER__STUBS = eINSTANCE.getFindByStubContainer_Stubs();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.LocalFileImpl <em>Local File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.LocalFileImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getLocalFile()
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
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.LoggingConfigImpl <em>Logging Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.LoggingConfigImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getLoggingConfig()
		 * @generated
		 */
		EClass LOGGING_CONFIG = eINSTANCE.getLoggingConfig();
		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIG__URI = eINSTANCE.getLoggingConfig_Uri();
		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIG__LEVEL = eINSTANCE.getLoggingConfig_Level();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.NamingServiceImpl <em>Naming Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.NamingServiceImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getNamingService()
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
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl <em>Partitioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getPartitioning()
		 * @generated
		 */
		EClass PARTITIONING = eINSTANCE.getPartitioning();
		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITIONING__PARTS = eINSTANCE.getPartitioning_Parts();
		/**
		 * The meta object literal for the '<em><b>Component Placement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITIONING__COMPONENT_PLACEMENT = eINSTANCE.getPartitioning_ComponentPlacement();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl <em>Provides Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getProvidesPort()
		 * @generated
		 */
		EClass PROVIDES_PORT = eINSTANCE.getProvidesPort();
		/**
		 * The meta object literal for the '<em><b>Provides Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_PORT__PROVIDES_IDENTIFIER = eINSTANCE.getProvidesPort_ProvidesIdentifier();
		/**
		 * The meta object literal for the '<em><b>Component Instantiation Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PORT__COMPONENT_INSTANTIATION_REF = eINSTANCE.getProvidesPort_ComponentInstantiationRef();
		/**
		 * The meta object literal for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = eINSTANCE.getProvidesPort_DeviceThatLoadedThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Device Used By This Component Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = eINSTANCE.getProvidesPort_DeviceUsedByThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Device Used By Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PORT__DEVICE_USED_BY_APPLICATION = eINSTANCE.getProvidesPort_DeviceUsedByApplication();
		/**
		 * The meta object literal for the '<em><b>Find By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PORT__FIND_BY = eINSTANCE.getProvidesPort_FindBy();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortStubImpl <em>Provides Port Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.ProvidesPortStubImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getProvidesPortStub()
		 * @generated
		 */
		EClass PROVIDES_PORT_STUB = eINSTANCE.getProvidesPortStub();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_PORT_STUB__NAME = eINSTANCE.getProvidesPortStub_Name();
		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PORT_STUB__PROVIDES = eINSTANCE.getProvidesPortStub_Provides();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.RequirementsImpl <em>Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.2
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.RequirementsImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getRequirements()
		 * @generated
		 */
		EClass REQUIREMENTS = eINSTANCE.getRequirements();
		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 2.2
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__REQUIRES = eINSTANCE.getRequirements_Requires();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.2
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.RequiresImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.2
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES__ID = eINSTANCE.getRequires_Id();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.2
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES__VALUE = eINSTANCE.getRequires_Value();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl <em>Uses Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getUsesPort()
		 * @generated
		 */
		EClass USES_PORT = eINSTANCE.getUsesPort();
		/**
		 * The meta object literal for the '<em><b>Uses Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_PORT__USES_IDENTIFIER = eINSTANCE.getUsesPort_UsesIdentifier();
		/**
		 * The meta object literal for the '<em><b>Component Instantiation Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_PORT__COMPONENT_INSTANTIATION_REF = eINSTANCE.getUsesPort_ComponentInstantiationRef();
		/**
		 * The meta object literal for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = eINSTANCE.getUsesPort_DeviceThatLoadedThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Device Used By This Component Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = eINSTANCE.getUsesPort_DeviceUsedByThisComponentRef();
		/**
		 * The meta object literal for the '<em><b>Device Used By Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_PORT__DEVICE_USED_BY_APPLICATION = eINSTANCE.getUsesPort_DeviceUsedByApplication();
		/**
		 * The meta object literal for the '<em><b>Find By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_PORT__FIND_BY = eINSTANCE.getUsesPort_FindBy();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl <em>Uses Port Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getUsesPortStub()
		 * @generated
		 */
		EClass USES_PORT_STUB = eINSTANCE.getUsesPortStub();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_PORT_STUB__NAME = eINSTANCE.getUsesPortStub_Name();
		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_PORT_STUB__USES = eINSTANCE.getUsesPortStub_Uses();
		/**
		 * The meta object literal for the '<em><b>Supported Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_PORT_STUB__SUPPORTED_IDENTIFIER = eINSTANCE.getUsesPortStub_SupportedIdentifier();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl <em>Uses Device Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getUsesDeviceStub()
		 * @generated
		 */
		EClass USES_DEVICE_STUB = eINSTANCE.getUsesDeviceStub();
		/**
		 * The meta object literal for the '<em><b>Uses Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE_STUB__USES_DEVICE = eINSTANCE.getUsesDeviceStub_UsesDevice();
		/**
		 * The meta object literal for the '<em><b>Provides Port Stubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE_STUB__PROVIDES_PORT_STUBS = eINSTANCE.getUsesDeviceStub_ProvidesPortStubs();
		/**
		 * The meta object literal for the '<em><b>Uses Port Stubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE_STUB__USES_PORT_STUBS = eINSTANCE.getUsesDeviceStub_UsesPortStubs();
		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE_STUB__INTERFACE = eINSTANCE.getUsesDeviceStub_Interface();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.partitioning.DomainFinderType <em>Domain Finder Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.DomainFinderType
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomainFinderType()
		 * @generated
		 */
		EEnum DOMAIN_FINDER_TYPE = eINSTANCE.getDomainFinderType();
		/**
		 * The meta object literal for the '<em>Domain Finder Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.partitioning.DomainFinderType
		 * @see mil.jpeojtrs.sca.partitioning.impl.PartitioningPackageImpl#getDomainFinderTypeObject()
		 * @generated
		 */
		EDataType DOMAIN_FINDER_TYPE_OBJECT = eINSTANCE.getDomainFinderTypeObject();

	}

} //PartitioningPackage
