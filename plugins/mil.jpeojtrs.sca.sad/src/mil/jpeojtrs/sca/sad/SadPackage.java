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
package mil.jpeojtrs.sca.sad;

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.prf.PrfPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.SadFactory
 * @model kind="package"
 * @generated
 */
public interface SadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sad";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/sad";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sad";
	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.sad.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SadPackage eINSTANCE = mil.jpeojtrs.sca.sad.impl.SadPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.AssemblyControllerImpl <em>Assembly Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.AssemblyControllerImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getAssemblyController()
	 * @generated
	 */
	int ASSEMBLY_CONTROLLER = 0;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF = 0;
	/**
	 * The number of structural features of the '<em>Assembly Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTROLLER_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationImpl <em>Component Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadComponentInstantiation()
	 * @generated
	 */
	int SAD_COMPONENT_INSTANTIATION = 1;
	/**
	 * The feature id for the '<em><b>Usage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__USAGE_NAME = PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME;
	/**
	 * The feature id for the '<em><b>Component Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES = PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES;
	/**
	 * The feature id for the '<em><b>Affinity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__AFFINITY = PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY;
	/**
	 * The feature id for the '<em><b>Logging Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__LOGGING_CONFIG = PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG;
	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__PROVIDES = PartitioningPackage.COMPONENT_INSTANTIATION__PROVIDES;
	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__USES = PartitioningPackage.COMPONENT_INSTANTIATION__USES;
	/**
	 * The feature id for the '<em><b>Interface Stub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__INTERFACE_STUB = PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__ID = PartitioningPackage.COMPONENT_INSTANTIATION__ID;
	/**
	 * The feature id for the '<em><b>Placement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__PLACEMENT = PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT;
	/**
	 * The feature id for the '<em><b>Impl ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__IMPL_ID = PartitioningPackage.COMPONENT_INSTANTIATION__IMPL_ID;
	/**
	 * The feature id for the '<em><b>Start Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__START_ORDER = PartitioningPackage.COMPONENT_INSTANTIATION__START_ORDER;
	/**
	 * The feature id for the '<em><b>Find Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT = PartitioningPackage.COMPONENT_INSTANTIATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Device Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION__DEVICE_REQUIRES = PartitioningPackage.COMPONENT_INSTANTIATION_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Component Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION_FEATURE_COUNT = PartitioningPackage.COMPONENT_INSTANTIATION_FEATURE_COUNT + 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationRefImpl <em>Component Instantiation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationRefImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadComponentInstantiationRef()
	 * @generated
	 */
	int SAD_COMPONENT_INSTANTIATION_REF = 2;
	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION_REF__INSTANTIATION = PartitioningPackage.COMPONENT_INSTANTIATION_REF__INSTANTIATION;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION_REF__REFID = PartitioningPackage.COMPONENT_INSTANTIATION_REF__REFID;
	/**
	 * The number of structural features of the '<em>Component Instantiation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_INSTANTIATION_REF_FEATURE_COUNT = PartitioningPackage.COMPONENT_INSTANTIATION_REF_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadUsesPortImpl <em>Uses Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadUsesPortImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadUsesPort()
	 * @generated
	 */
	int SAD_USES_PORT = 3;
	/**
	 * The feature id for the '<em><b>Uses Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT__USES_IDENTIFIER = PartitioningPackage.USES_PORT__USES_IDENTIFIER;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT__COMPONENT_INSTANTIATION_REF = PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Device Used By Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT__DEVICE_USED_BY_APPLICATION = PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT__FIND_BY = PartitioningPackage.USES_PORT__FIND_BY;
	/**
	 * The number of structural features of the '<em>Uses Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_USES_PORT_FEATURE_COUNT = PartitioningPackage.USES_PORT_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadProvidesPortImpl <em>Provides Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadProvidesPortImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadProvidesPort()
	 * @generated
	 */
	int SAD_PROVIDES_PORT = 4;
	/**
	 * The feature id for the '<em><b>Provides Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT__PROVIDES_IDENTIFIER = PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT__COMPONENT_INSTANTIATION_REF = PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF;
	/**
	 * The feature id for the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF = PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF = PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF;
	/**
	 * The feature id for the '<em><b>Device Used By Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT__DEVICE_USED_BY_APPLICATION = PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_APPLICATION;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT__FIND_BY = PartitioningPackage.PROVIDES_PORT__FIND_BY;
	/**
	 * The number of structural features of the '<em>Provides Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PROVIDES_PORT_FEATURE_COUNT = PartitioningPackage.PROVIDES_PORT_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadConnectInterfaceImpl <em>Connect Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadConnectInterfaceImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadConnectInterface()
	 * @generated
	 */
	int SAD_CONNECT_INTERFACE = 5;
	/**
	 * The feature id for the '<em><b>Uses Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__USES_PORT = PartitioningPackage.CONNECT_INTERFACE__USES_PORT;
	/**
	 * The feature id for the '<em><b>Provides Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__PROVIDES_PORT = PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT;
	/**
	 * The feature id for the '<em><b>Component Supported Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE = PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE;
	/**
	 * The feature id for the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__FIND_BY = PartitioningPackage.CONNECT_INTERFACE__FIND_BY;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__ID = PartitioningPackage.CONNECT_INTERFACE__ID;
	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__SOURCE = PartitioningPackage.CONNECT_INTERFACE__SOURCE;
	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE__TARGET = PartitioningPackage.CONNECT_INTERFACE__TARGET;
	/**
	 * The number of structural features of the '<em>Connect Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECT_INTERFACE_FEATURE_COUNT = PartitioningPackage.CONNECT_INTERFACE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadConnectionsImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadConnections()
	 * @generated
	 */
	int SAD_CONNECTIONS = 6;
	/**
	 * The feature id for the '<em><b>Connect Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECTIONS__CONNECT_INTERFACE = PartitioningPackage.CONNECTIONS__CONNECT_INTERFACE;
	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_CONNECTIONS_FEATURE_COUNT = PartitioningPackage.CONNECTIONS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl <em>Component Resource Factory Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getComponentResourceFactoryRef()
	 * @generated
	 */
	int COMPONENT_RESOURCE_FACTORY_REF = 7;
	/**
	 * The feature id for the '<em><b>Resource Factory Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES = 0;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_FACTORY_REF__REFID = 1;
	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_FACTORY_REF__COMPONENT = 2;
	/**
	 * The number of structural features of the '<em>Component Resource Factory Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_FACTORY_REF_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.ExternalPortsImpl <em>External Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.ExternalPortsImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getExternalPorts()
	 * @generated
	 */
	int EXTERNAL_PORTS = 8;
	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PORTS__PORT = 0;
	/**
	 * The number of structural features of the '<em>External Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PORTS_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertiesImpl <em>External Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.ExternalPropertiesImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getExternalProperties()
	 * @generated
	 */
	int EXTERNAL_PROPERTIES = 9;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROPERTIES__PROPERTIES = 0;
	/**
	 * The number of structural features of the '<em>External Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROPERTIES_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl <em>External Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getExternalProperty()
	 * @generated
	 */
	int EXTERNAL_PROPERTY = 10;
	/**
	 * The feature id for the '<em><b>Comp Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROPERTY__COMP_REF_ID = 0;
	/**
	 * The feature id for the '<em><b>Prop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROPERTY__PROP_ID = 1;
	/**
	 * The feature id for the '<em><b>External Prop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROPERTY__EXTERNAL_PROP_ID = 2;
	/**
	 * The number of structural features of the '<em>External Property</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROPERTY_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.FindComponentImpl <em>Find Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.FindComponentImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getFindComponent()
	 * @generated
	 */
	int FIND_COMPONENT = 11;
	/**
	 * The feature id for the '<em><b>Component Resource Factory Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF = 0;
	/**
	 * The feature id for the '<em><b>Naming Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_COMPONENT__NAMING_SERVICE = 1;
	/**
	 * The number of structural features of the '<em>Find Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_COMPONENT_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.HostCollocationImpl <em>Host Collocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.HostCollocationImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getHostCollocation()
	 * @generated
	 */
	int HOST_COLLOCATION = 12;
	/**
	 * The feature id for the '<em><b>Component Placement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_COLLOCATION__COMPONENT_PLACEMENT = 0;
	/**
	 * The feature id for the '<em><b>Uses Device Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_COLLOCATION__USES_DEVICE_REF = 1;
	/**
	 * The feature id for the '<em><b>Reservation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_COLLOCATION__RESERVATION = 2;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_COLLOCATION__ID = 3;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_COLLOCATION__NAME = 4;
	/**
	 * The number of structural features of the '<em>Host Collocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_COLLOCATION_FEATURE_COUNT = 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.PortImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Uses Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__USES_IDENTIFIER = 1;
	/**
	 * The feature id for the '<em><b>Provides Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROVIDES_IDENTIFIER = 2;
	/**
	 * The feature id for the '<em><b>Supported Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SUPPORTED_IDENTIFIER = 3;
	/**
	 * The feature id for the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT_INSTANTIATION_REF = 4;
	/**
	 * The feature id for the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTERNAL_NAME = 5;
	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 6;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadPartitioningImpl <em>Partitioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadPartitioningImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadPartitioning()
	 * @generated
	 */
	int SAD_PARTITIONING = 14;
	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PARTITIONING__PARTS = PartitioningPackage.PARTITIONING__PARTS;
	/**
	 * The feature id for the '<em><b>Component Placement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PARTITIONING__COMPONENT_PLACEMENT = PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT;
	/**
	 * The feature id for the '<em><b>Host Collocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PARTITIONING__HOST_COLLOCATION = PartitioningPackage.PARTITIONING_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Partitioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_PARTITIONING_FEATURE_COUNT = PartitioningPackage.PARTITIONING_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadComponentPlacementImpl <em>Component Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadComponentPlacementImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadComponentPlacement()
	 * @generated
	 */
	int SAD_COMPONENT_PLACEMENT = 15;
	/**
	 * The feature id for the '<em><b>Component File Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_PLACEMENT__COMPONENT_FILE_REF = PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF;
	/**
	 * The feature id for the '<em><b>Component Instantiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION = PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_PLACEMENT__NAME = PartitioningPackage.COMPONENT_PLACEMENT__NAME;
	/**
	 * The number of structural features of the '<em>Component Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_COMPONENT_PLACEMENT_FEATURE_COUNT = PartitioningPackage.COMPONENT_PLACEMENT_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.ReservationImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 16;
	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__KIND = 0;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__VALUE = 1;
	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl <em>Resource Factory Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getResourceFactoryProperties()
	 * @generated
	 */
	int RESOURCE_FACTORY_PROPERTIES = 17;
	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES__GROUP = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES__STRUCT_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Struct Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Factory Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES__FACTORY_REF = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 5;
	/**
	 * The number of structural features of the '<em>Resource Factory Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_PROPERTIES_FEATURE_COUNT = PrfPackage.PROPERTY_REF_CONTAINER_FEATURE_COUNT + 6;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SadDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SadDocumentRootImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadDocumentRoot()
	 * @generated
	 */
	int SAD_DOCUMENT_ROOT = 18;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Softwareassembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_DOCUMENT_ROOT__SOFTWAREASSEMBLY = 3;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAD_DOCUMENT_ROOT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl <em>Software Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSoftwareAssembly()
	 * @generated
	 */
	int SOFTWARE_ASSEMBLY = 19;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Component Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__COMPONENT_FILES = 1;
	/**
	 * The feature id for the '<em><b>Partitioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__PARTITIONING = 2;
	/**
	 * The feature id for the '<em><b>Assembly Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER = 3;
	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__CONNECTIONS = 4;
	/**
	 * The feature id for the '<em><b>External Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__EXTERNAL_PORTS = 5;
	/**
	 * The feature id for the '<em><b>External Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES = 6;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__ID = 7;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__NAME = 8;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__VERSION = 9;
	/**
	 * The feature id for the '<em><b>Uses Device Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES = 10;
	/**
	 * The number of structural features of the '<em>Software Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ASSEMBLY_FEATURE_COUNT = 11;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceDependenciesImpl <em>Uses Device Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.UsesDeviceDependenciesImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getUsesDeviceDependencies()
	 * @generated
	 */
	int USES_DEVICE_DEPENDENCIES = 20;
	/**
	 * The feature id for the '<em><b>Usesdevice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_DEPENDENCIES__USESDEVICE = 0;
	/**
	 * The number of structural features of the '<em>Uses Device Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceRefImpl <em>Uses Device Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.impl.UsesDeviceRefImpl
	 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getUsesDeviceRef()
	 * @generated
	 */
	int USES_DEVICE_REF = 21;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_REF__REFID = 0;
	/**
	 * The feature id for the '<em><b>Uses Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_REF__USES_DEVICE = 1;
	/**
	 * The number of structural features of the '<em>Uses Device Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_REF_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.AssemblyController <em>Assembly Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Controller</em>'.
	 * @see mil.jpeojtrs.sca.sad.AssemblyController
	 * @generated
	 */
	EClass getAssemblyController();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.AssemblyController#getComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.AssemblyController#getComponentInstantiationRef()
	 * @see #getAssemblyController()
	 * @generated
	 */
	EReference getAssemblyController_ComponentInstantiationRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadComponentInstantiation
	 * @generated
	 */
	EClass getSadComponentInstantiation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getFindComponent <em>Find Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Find Component</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadComponentInstantiation#getFindComponent()
	 * @see #getSadComponentInstantiation()
	 * @generated
	 */
	EReference getSadComponentInstantiation_FindComponent();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getDeviceRequires <em>Device Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Requires</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadComponentInstantiation#getDeviceRequires()
	 * @see #getSadComponentInstantiation()
	 * @generated
	 */
	EReference getSadComponentInstantiation_DeviceRequires();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadComponentInstantiationRef
	 * @generated
	 */
	EClass getSadComponentInstantiationRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadUsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Port</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadUsesPort
	 * @generated
	 */
	EClass getSadUsesPort();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Port</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadProvidesPort
	 * @generated
	 */
	EClass getSadProvidesPort();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Interface</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadConnectInterface
	 * @generated
	 */
	EClass getSadConnectInterface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadConnections
	 * @generated
	 */
	EClass getSadConnections();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef <em>Component Resource Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Resource Factory Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef
	 * @generated
	 */
	EClass getComponentResourceFactoryRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getResourceFactoryProperties <em>Resource Factory Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Factory Properties</em>'.
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getResourceFactoryProperties()
	 * @see #getComponentResourceFactoryRef()
	 * @generated
	 */
	EReference getComponentResourceFactoryRef_ResourceFactoryProperties();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getRefid()
	 * @see #getComponentResourceFactoryRef()
	 * @generated
	 */
	EAttribute getComponentResourceFactoryRef_Refid();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent()
	 * @see #getComponentResourceFactoryRef()
	 * @generated
	 */
	EReference getComponentResourceFactoryRef_Component();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.ExternalPorts <em>External Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ports</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalPorts
	 * @generated
	 */
	EClass getExternalPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.ExternalPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalPorts#getPort()
	 * @see #getExternalPorts()
	 * @generated
	 */
	EReference getExternalPorts_Port();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.ExternalProperties <em>External Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Properties</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalProperties
	 * @generated
	 */
	EClass getExternalProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.ExternalProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalProperties#getProperties()
	 * @see #getExternalProperties()
	 * @generated
	 */
	EReference getExternalProperties_Properties();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.ExternalProperty <em>External Property</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Property</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalProperty
	 * @generated
	 */
	EClass getExternalProperty();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.ExternalProperty#getCompRefID <em>Comp Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp Ref ID</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalProperty#getCompRefID()
	 * @see #getExternalProperty()
	 * @generated
	 */
	EAttribute getExternalProperty_CompRefID();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.ExternalProperty#getPropID <em>Prop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop ID</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalProperty#getPropID()
	 * @see #getExternalProperty()
	 * @generated
	 */
	EAttribute getExternalProperty_PropID();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.ExternalProperty#getExternalPropID <em>External Prop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Prop ID</em>'.
	 * @see mil.jpeojtrs.sca.sad.ExternalProperty#getExternalPropID()
	 * @see #getExternalProperty()
	 * @generated
	 */
	EAttribute getExternalProperty_ExternalPropID();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.FindComponent <em>Find Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Component</em>'.
	 * @see mil.jpeojtrs.sca.sad.FindComponent
	 * @generated
	 */
	EClass getFindComponent();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.FindComponent#getComponentResourceFactoryRef <em>Component Resource Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Resource Factory Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.FindComponent#getComponentResourceFactoryRef()
	 * @see #getFindComponent()
	 * @generated
	 */
	EReference getFindComponent_ComponentResourceFactoryRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.FindComponent#getNamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Naming Service</em>'.
	 * @see mil.jpeojtrs.sca.sad.FindComponent#getNamingService()
	 * @see #getFindComponent()
	 * @generated
	 */
	EReference getFindComponent_NamingService();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.HostCollocation <em>Host Collocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Collocation</em>'.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation
	 * @generated
	 */
	EClass getHostCollocation();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.HostCollocation#getComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Placement</em>'.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation#getComponentPlacement()
	 * @see #getHostCollocation()
	 * @generated
	 */
	EReference getHostCollocation_ComponentPlacement();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.HostCollocation#getUsesDeviceRef <em>Uses Device Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Device Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation#getUsesDeviceRef()
	 * @see #getHostCollocation()
	 * @generated
	 */
	EReference getHostCollocation_UsesDeviceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.HostCollocation#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reservation</em>'.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation#getReservation()
	 * @see #getHostCollocation()
	 * @generated
	 */
	EReference getHostCollocation_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.HostCollocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation#getId()
	 * @see #getHostCollocation()
	 * @generated
	 */
	EAttribute getHostCollocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.HostCollocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation#getName()
	 * @see #getHostCollocation()
	 * @generated
	 */
	EAttribute getHostCollocation_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Port#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port#getDescription()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Description();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Port#getUsesIdentifier <em>Uses Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Identifier</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port#getUsesIdentifier()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_UsesIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Port#getProvidesIdentifier <em>Provides Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Identifier</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port#getProvidesIdentifier()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_ProvidesIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Port#getSupportedIdentifier <em>Supported Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Identifier</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port#getSupportedIdentifier()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_SupportedIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.Port#getComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instantiation Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port#getComponentInstantiationRef()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_ComponentInstantiationRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Port#getExternalName <em>External Name</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Name</em>'.
	 * @see mil.jpeojtrs.sca.sad.Port#getExternalName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_ExternalName();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadPartitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partitioning</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadPartitioning
	 * @generated
	 */
	EClass getSadPartitioning();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.SadPartitioning#getHostCollocation <em>Host Collocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Collocation</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadPartitioning#getHostCollocation()
	 * @see #getSadPartitioning()
	 * @generated
	 */
	EReference getSadPartitioning_HostCollocation();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Placement</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadComponentPlacement
	 * @generated
	 */
	EClass getSadComponentPlacement();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see mil.jpeojtrs.sca.sad.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Reservation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see mil.jpeojtrs.sca.sad.Reservation#getKind()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.Reservation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.sad.Reservation#getValue()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Value();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties <em>Resource Factory Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Factory Properties</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties
	 * @generated
	 */
	EClass getResourceFactoryProperties();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getGroup()
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	EAttribute getResourceFactoryProperties_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleRef()
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	EReference getResourceFactoryProperties_SimpleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleSequenceRef()
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	EReference getResourceFactoryProperties_SimpleSequenceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructRef()
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	EReference getResourceFactoryProperties_StructRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructSequenceRef <em>Struct Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructSequenceRef()
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	EReference getResourceFactoryProperties_StructSequenceRef();

	/**
	 * Returns the meta object for the container reference '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getFactoryRef <em>Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getFactoryRef()
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	EReference getResourceFactoryProperties_FactoryRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot
	 * @generated
	 */
	EClass getSadDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot#getMixed()
	 * @see #getSadDocumentRoot()
	 * @generated
	 */
	EAttribute getSadDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot#getXMLNSPrefixMap()
	 * @see #getSadDocumentRoot()
	 * @generated
	 */
	EReference getSadDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot#getXSISchemaLocation()
	 * @see #getSadDocumentRoot()
	 * @generated
	 */
	EReference getSadDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#getSoftwareassembly <em>Softwareassembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Softwareassembly</em>'.
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot#getSoftwareassembly()
	 * @see #getSadDocumentRoot()
	 * @generated
	 */
	EReference getSadDocumentRoot_Softwareassembly();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly <em>Software Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Assembly</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly
	 * @generated
	 */
	EClass getSoftwareAssembly();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getDescription()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EAttribute getSoftwareAssembly_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentFiles <em>Component Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Files</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentFiles()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_ComponentFiles();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getPartitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partitioning</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getPartitioning()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_Partitioning();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getAssemblyController <em>Assembly Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Controller</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getAssemblyController()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_AssemblyController();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connections</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getConnections()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalPorts <em>External Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Ports</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalPorts()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_ExternalPorts();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalProperties <em>External Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Properties</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalProperties()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_ExternalProperties();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getId()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EAttribute getSoftwareAssembly_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getName()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EAttribute getSoftwareAssembly_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getVersion()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EAttribute getSoftwareAssembly_Version();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getUsesDeviceDependencies <em>Uses Device Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses Device Dependencies</em>'.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getUsesDeviceDependencies()
	 * @see #getSoftwareAssembly()
	 * @generated
	 */
	EReference getSoftwareAssembly_UsesDeviceDependencies();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.UsesDeviceDependencies <em>Uses Device Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Device Dependencies</em>'.
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceDependencies
	 * @generated
	 */
	EClass getUsesDeviceDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.sad.UsesDeviceDependencies#getUsesdevice <em>Usesdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usesdevice</em>'.
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceDependencies#getUsesdevice()
	 * @see #getUsesDeviceDependencies()
	 * @generated
	 */
	EReference getUsesDeviceDependencies_Usesdevice();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef <em>Uses Device Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Device Ref</em>'.
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceRef
	 * @generated
	 */
	EClass getUsesDeviceRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceRef#getRefid()
	 * @see #getUsesDeviceRef()
	 * @generated
	 */
	EAttribute getUsesDeviceRef_Refid();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice <em>Uses Device</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses Device</em>'.
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice()
	 * @see #getUsesDeviceRef()
	 * @generated
	 */
	EReference getUsesDeviceRef_UsesDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SadFactory getSadFactory();

	String FILE_EXTENSION = ".sad.xml";

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.AssemblyControllerImpl <em>Assembly Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.AssemblyControllerImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getAssemblyController()
		 * @generated
		 */
		EClass ASSEMBLY_CONTROLLER = eINSTANCE.getAssemblyController();
		/**
		 * The meta object literal for the '<em><b>Component Instantiation Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF = eINSTANCE.getAssemblyController_ComponentInstantiationRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationImpl <em>Component Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadComponentInstantiation()
		 * @generated
		 */
		EClass SAD_COMPONENT_INSTANTIATION = eINSTANCE.getSadComponentInstantiation();
		/**
		 * The meta object literal for the '<em><b>Find Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT = eINSTANCE.getSadComponentInstantiation_FindComponent();
		/**
		 * The meta object literal for the '<em><b>Device Requires</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAD_COMPONENT_INSTANTIATION__DEVICE_REQUIRES = eINSTANCE.getSadComponentInstantiation_DeviceRequires();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationRefImpl <em>Component Instantiation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationRefImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadComponentInstantiationRef()
		 * @generated
		 */
		EClass SAD_COMPONENT_INSTANTIATION_REF = eINSTANCE.getSadComponentInstantiationRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadUsesPortImpl <em>Uses Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadUsesPortImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadUsesPort()
		 * @generated
		 */
		EClass SAD_USES_PORT = eINSTANCE.getSadUsesPort();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadProvidesPortImpl <em>Provides Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadProvidesPortImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadProvidesPort()
		 * @generated
		 */
		EClass SAD_PROVIDES_PORT = eINSTANCE.getSadProvidesPort();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadConnectInterfaceImpl <em>Connect Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadConnectInterfaceImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadConnectInterface()
		 * @generated
		 */
		EClass SAD_CONNECT_INTERFACE = eINSTANCE.getSadConnectInterface();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadConnectionsImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadConnections()
		 * @generated
		 */
		EClass SAD_CONNECTIONS = eINSTANCE.getSadConnections();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl <em>Component Resource Factory Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getComponentResourceFactoryRef()
		 * @generated
		 */
		EClass COMPONENT_RESOURCE_FACTORY_REF = eINSTANCE.getComponentResourceFactoryRef();
		/**
		 * The meta object literal for the '<em><b>Resource Factory Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES = eINSTANCE.getComponentResourceFactoryRef_ResourceFactoryProperties();
		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESOURCE_FACTORY_REF__REFID = eINSTANCE.getComponentResourceFactoryRef_Refid();
		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESOURCE_FACTORY_REF__COMPONENT = eINSTANCE.getComponentResourceFactoryRef_Component();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.ExternalPortsImpl <em>External Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.ExternalPortsImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getExternalPorts()
		 * @generated
		 */
		EClass EXTERNAL_PORTS = eINSTANCE.getExternalPorts();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_PORTS__PORT = eINSTANCE.getExternalPorts_Port();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertiesImpl <em>External Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.ExternalPropertiesImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getExternalProperties()
		 * @generated
		 */
		EClass EXTERNAL_PROPERTIES = eINSTANCE.getExternalProperties();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_PROPERTIES__PROPERTIES = eINSTANCE.getExternalProperties_Properties();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl <em>External Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getExternalProperty()
		 * @generated
		 */
		EClass EXTERNAL_PROPERTY = eINSTANCE.getExternalProperty();
		/**
		 * The meta object literal for the '<em><b>Comp Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_PROPERTY__COMP_REF_ID = eINSTANCE.getExternalProperty_CompRefID();
		/**
		 * The meta object literal for the '<em><b>Prop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_PROPERTY__PROP_ID = eINSTANCE.getExternalProperty_PropID();
		/**
		 * The meta object literal for the '<em><b>External Prop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_PROPERTY__EXTERNAL_PROP_ID = eINSTANCE.getExternalProperty_ExternalPropID();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.FindComponentImpl <em>Find Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.FindComponentImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getFindComponent()
		 * @generated
		 */
		EClass FIND_COMPONENT = eINSTANCE.getFindComponent();
		/**
		 * The meta object literal for the '<em><b>Component Resource Factory Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF = eINSTANCE.getFindComponent_ComponentResourceFactoryRef();
		/**
		 * The meta object literal for the '<em><b>Naming Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIND_COMPONENT__NAMING_SERVICE = eINSTANCE.getFindComponent_NamingService();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.HostCollocationImpl <em>Host Collocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.HostCollocationImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getHostCollocation()
		 * @generated
		 */
		EClass HOST_COLLOCATION = eINSTANCE.getHostCollocation();
		/**
		 * The meta object literal for the '<em><b>Component Placement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_COLLOCATION__COMPONENT_PLACEMENT = eINSTANCE.getHostCollocation_ComponentPlacement();
		/**
		 * The meta object literal for the '<em><b>Uses Device Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_COLLOCATION__USES_DEVICE_REF = eINSTANCE.getHostCollocation_UsesDeviceRef();
		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_COLLOCATION__RESERVATION = eINSTANCE.getHostCollocation_Reservation();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_COLLOCATION__ID = eINSTANCE.getHostCollocation_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_COLLOCATION__NAME = eINSTANCE.getHostCollocation_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.PortImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DESCRIPTION = eINSTANCE.getPort_Description();
		/**
		 * The meta object literal for the '<em><b>Uses Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__USES_IDENTIFIER = eINSTANCE.getPort_UsesIdentifier();
		/**
		 * The meta object literal for the '<em><b>Provides Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PROVIDES_IDENTIFIER = eINSTANCE.getPort_ProvidesIdentifier();
		/**
		 * The meta object literal for the '<em><b>Supported Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SUPPORTED_IDENTIFIER = eINSTANCE.getPort_SupportedIdentifier();
		/**
		 * The meta object literal for the '<em><b>Component Instantiation Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMPONENT_INSTANTIATION_REF = eINSTANCE.getPort_ComponentInstantiationRef();
		/**
		 * The meta object literal for the '<em><b>External Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__EXTERNAL_NAME = eINSTANCE.getPort_ExternalName();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadPartitioningImpl <em>Partitioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadPartitioningImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadPartitioning()
		 * @generated
		 */
		EClass SAD_PARTITIONING = eINSTANCE.getSadPartitioning();
		/**
		 * The meta object literal for the '<em><b>Host Collocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAD_PARTITIONING__HOST_COLLOCATION = eINSTANCE.getSadPartitioning_HostCollocation();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadComponentPlacementImpl <em>Component Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadComponentPlacementImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadComponentPlacement()
		 * @generated
		 */
		EClass SAD_COMPONENT_PLACEMENT = eINSTANCE.getSadComponentPlacement();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.ReservationImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();
		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__KIND = eINSTANCE.getReservation_Kind();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__VALUE = eINSTANCE.getReservation_Value();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl <em>Resource Factory Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getResourceFactoryProperties()
		 * @generated
		 */
		EClass RESOURCE_FACTORY_PROPERTIES = eINSTANCE.getResourceFactoryProperties();
		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FACTORY_PROPERTIES__GROUP = eINSTANCE.getResourceFactoryProperties_Group();
		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF = eINSTANCE.getResourceFactoryProperties_SimpleRef();
		/**
		 * The meta object literal for the '<em><b>Simple Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF = eINSTANCE.getResourceFactoryProperties_SimpleSequenceRef();
		/**
		 * The meta object literal for the '<em><b>Struct Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FACTORY_PROPERTIES__STRUCT_REF = eINSTANCE.getResourceFactoryProperties_StructRef();
		/**
		 * The meta object literal for the '<em><b>Struct Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF = eINSTANCE.getResourceFactoryProperties_StructSequenceRef();
		/**
		 * The meta object literal for the '<em><b>Factory Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FACTORY_PROPERTIES__FACTORY_REF = eINSTANCE.getResourceFactoryProperties_FactoryRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SadDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SadDocumentRootImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSadDocumentRoot()
		 * @generated
		 */
		EClass SAD_DOCUMENT_ROOT = eINSTANCE.getSadDocumentRoot();
		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAD_DOCUMENT_ROOT__MIXED = eINSTANCE.getSadDocumentRoot_Mixed();
		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getSadDocumentRoot_XMLNSPrefixMap();
		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getSadDocumentRoot_XSISchemaLocation();
		/**
		 * The meta object literal for the '<em><b>Softwareassembly</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAD_DOCUMENT_ROOT__SOFTWAREASSEMBLY = eINSTANCE.getSadDocumentRoot_Softwareassembly();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl <em>Software Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getSoftwareAssembly()
		 * @generated
		 */
		EClass SOFTWARE_ASSEMBLY = eINSTANCE.getSoftwareAssembly();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ASSEMBLY__DESCRIPTION = eINSTANCE.getSoftwareAssembly_Description();
		/**
		 * The meta object literal for the '<em><b>Component Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__COMPONENT_FILES = eINSTANCE.getSoftwareAssembly_ComponentFiles();
		/**
		 * The meta object literal for the '<em><b>Partitioning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__PARTITIONING = eINSTANCE.getSoftwareAssembly_Partitioning();
		/**
		 * The meta object literal for the '<em><b>Assembly Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER = eINSTANCE.getSoftwareAssembly_AssemblyController();
		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__CONNECTIONS = eINSTANCE.getSoftwareAssembly_Connections();
		/**
		 * The meta object literal for the '<em><b>External Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__EXTERNAL_PORTS = eINSTANCE.getSoftwareAssembly_ExternalPorts();
		/**
		 * The meta object literal for the '<em><b>External Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 2.3
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES = eINSTANCE.getSoftwareAssembly_ExternalProperties();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ASSEMBLY__ID = eINSTANCE.getSoftwareAssembly_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ASSEMBLY__NAME = eINSTANCE.getSoftwareAssembly_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ASSEMBLY__VERSION = eINSTANCE.getSoftwareAssembly_Version();
		/**
		 * The meta object literal for the '<em><b>Uses Device Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES = eINSTANCE.getSoftwareAssembly_UsesDeviceDependencies();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceDependenciesImpl <em>Uses Device Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.UsesDeviceDependenciesImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getUsesDeviceDependencies()
		 * @generated
		 */
		EClass USES_DEVICE_DEPENDENCIES = eINSTANCE.getUsesDeviceDependencies();
		/**
		 * The meta object literal for the '<em><b>Usesdevice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE_DEPENDENCIES__USESDEVICE = eINSTANCE.getUsesDeviceDependencies_Usesdevice();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceRefImpl <em>Uses Device Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.sad.impl.UsesDeviceRefImpl
		 * @see mil.jpeojtrs.sca.sad.impl.SadPackageImpl#getUsesDeviceRef()
		 * @generated
		 */
		EClass USES_DEVICE_REF = eINSTANCE.getUsesDeviceRef();
		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_DEVICE_REF__REFID = eINSTANCE.getUsesDeviceRef_Refid();
		/**
		 * The meta object literal for the '<em><b>Uses Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * @since 4.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE_REF__USES_DEVICE = eINSTANCE.getUsesDeviceRef_UsesDevice();

	}

} //SadPackage
