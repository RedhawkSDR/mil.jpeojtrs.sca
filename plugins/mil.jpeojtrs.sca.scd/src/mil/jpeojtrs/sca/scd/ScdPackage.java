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
package mil.jpeojtrs.sca.scd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see mil.jpeojtrs.sca.scd.ScdFactory
 * @model kind="package"
 * @generated
 */
public interface ScdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scd";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/scd";
	String FILE_EXTENSION = ".scd.xml";
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
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.scd.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScdPackage eINSTANCE = mil.jpeojtrs.sca.scd.impl.ScdPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.ComponentFeaturesImpl <em>Component Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.ComponentFeaturesImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getComponentFeatures()
	 * @generated
	 */
	int COMPONENT_FEATURES = 0;
	/**
	 * The feature id for the '<em><b>Supports Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURES__SUPPORTS_INTERFACE = 0;
	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURES__PORTS = 1;
	/**
	 * The number of structural features of the '<em>Component Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURES_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.ComponentRepIdImpl <em>Component Rep Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.ComponentRepIdImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getComponentRepId()
	 * @generated
	 */
	int COMPONENT_REP_ID = 1;
	/**
	 * The feature id for the '<em><b>Repid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REP_ID__REPID = 0;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REP_ID__INTERFACE = 1;
	/**
	 * The number of structural features of the '<em>Component Rep Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REP_ID_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.InheritsInterfaceImpl <em>Inherits Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.InheritsInterfaceImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getInheritsInterface()
	 * @generated
	 */
	int INHERITS_INTERFACE = 2;
	/**
	 * The feature id for the '<em><b>Repid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_INTERFACE__REPID = 0;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_INTERFACE__INTERFACE = 1;
	/**
	 * The number of structural features of the '<em>Inherits Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_INTERFACE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.InterfaceImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;
	/**
	 * The feature id for the '<em><b>Inherits Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INHERITS_INTERFACES = 0;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 1;
	/**
	 * The feature id for the '<em><b>Repid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REPID = 2;
	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.InterfacesImpl <em>Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.InterfacesImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getInterfaces()
	 * @generated
	 */
	int INTERFACES = 4;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES__INTERFACE = 0;
	/**
	 * The number of structural features of the '<em>Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.LocalFileImpl <em>Local File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.LocalFileImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getLocalFile()
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
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.PortsImpl <em>Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.PortsImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPorts()
	 * @generated
	 */
	int PORTS = 6;
	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__GROUP = 0;
	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__PROVIDES = 1;
	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__USES = 2;
	/**
	 * The number of structural features of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.PortTypeContainerImpl <em>Port Type Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.PortTypeContainerImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPortTypeContainer()
	 * @generated
	 */
	int PORT_TYPE_CONTAINER = 7;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_CONTAINER__TYPE = 0;
	/**
	 * The number of structural features of the '<em>Port Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_CONTAINER_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.PropertyFileImpl <em>Property File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.PropertyFileImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPropertyFile()
	 * @generated
	 */
	int PROPERTY_FILE = 8;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__TYPE = 1;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__PROPERTIES = 2;
	/**
	 * The number of structural features of the '<em>Property File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.AbstractPortImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getAbstractPort()
	 * @generated
	 */
	int ABSTRACT_PORT = 10;
	/**
	 * The feature id for the '<em><b>Port Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__PORT_TYPE = 0;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__NAME = 1;
	/**
	 * The feature id for the '<em><b>Rep ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__REP_ID = 2;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__INTERFACE = 3;
	/**
	 * The number of structural features of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.ProvidesImpl <em>Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.ProvidesImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getProvides()
	 * @generated
	 */
	int PROVIDES = 9;
	/**
	 * The feature id for the '<em><b>Port Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__PORT_TYPE = ABSTRACT_PORT__PORT_TYPE;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__NAME = ABSTRACT_PORT__NAME;
	/**
	 * The feature id for the '<em><b>Rep ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__REP_ID = ABSTRACT_PORT__REP_ID;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__INTERFACE = ABSTRACT_PORT__INTERFACE;
	/**
	 * The feature id for the '<em><b>Provides Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__PROVIDES_NAME = ABSTRACT_PORT_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.ScdDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.ScdDocumentRootImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getScdDocumentRoot()
	 * @generated
	 */
	int SCD_DOCUMENT_ROOT = 11;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCD_DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Softwarecomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCD_DOCUMENT_ROOT__SOFTWARECOMPONENT = 3;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCD_DOCUMENT_ROOT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getSoftwareComponent()
	 * @generated
	 */
	int SOFTWARE_COMPONENT = 12;
	/**
	 * The feature id for the '<em><b>Corba Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__CORBA_VERSION = 0;
	/**
	 * The feature id for the '<em><b>Component Rep ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__COMPONENT_REP_ID = 1;
	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__COMPONENT_TYPE = 2;
	/**
	 * The feature id for the '<em><b>Component Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__COMPONENT_FEATURES = 3;
	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__INTERFACES = 4;
	/**
	 * The feature id for the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__PROPERTY_FILE = 5;
	/**
	 * The feature id for the '<em><b>Rep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__REP_ID = 6;
	/**
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = 7;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl <em>Supports Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getSupportsInterface()
	 * @generated
	 */
	int SUPPORTS_INTERFACE = 13;
	/**
	 * The feature id for the '<em><b>Rep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_INTERFACE__REP_ID = 0;
	/**
	 * The feature id for the '<em><b>Supports Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_INTERFACE__SUPPORTS_NAME = 1;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_INTERFACE__ID = 2;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_INTERFACE__INTERFACE = 3;
	/**
	 * The number of structural features of the '<em>Supports Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_INTERFACE_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.impl.UsesImpl
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getUses()
	 * @generated
	 */
	int USES = 14;
	/**
	 * The feature id for the '<em><b>Port Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__PORT_TYPE = ABSTRACT_PORT__PORT_TYPE;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__NAME = ABSTRACT_PORT__NAME;
	/**
	 * The feature id for the '<em><b>Rep ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__REP_ID = ABSTRACT_PORT__REP_ID;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__INTERFACE = ABSTRACT_PORT__INTERFACE;
	/**
	 * The feature id for the '<em><b>Uses Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__USES_NAME = ABSTRACT_PORT_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.PortType
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 15;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.scd.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.ComponentType
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 16;
	/**
	 * The meta object id for the '<em>Port Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.PortType
	 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPortTypeObject()
	 * @generated
	 */
	int PORT_TYPE_OBJECT = 17;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.ComponentFeatures <em>Component Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Features</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentFeatures
	 * @generated
	 */
	EClass getComponentFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.scd.ComponentFeatures#getSupportsInterface <em>Supports Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supports Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentFeatures#getSupportsInterface()
	 * @see #getComponentFeatures()
	 * @generated
	 */
	EReference getComponentFeatures_SupportsInterface();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.ComponentFeatures#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentFeatures#getPorts()
	 * @see #getComponentFeatures()
	 * @generated
	 */
	EReference getComponentFeatures_Ports();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.ComponentRepId <em>Component Rep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Rep Id</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentRepId
	 * @generated
	 */
	EClass getComponentRepId();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.ComponentRepId#getRepid <em>Repid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repid</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentRepId#getRepid()
	 * @see #getComponentRepId()
	 * @generated
	 */
	EAttribute getComponentRepId_Repid();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.scd.ComponentRepId#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentRepId#getInterface()
	 * @see #getComponentRepId()
	 * @generated
	 */
	EReference getComponentRepId_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.InheritsInterface <em>Inherits Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherits Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.InheritsInterface
	 * @generated
	 */
	EClass getInheritsInterface();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.InheritsInterface#getRepid <em>Repid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repid</em>'.
	 * @see mil.jpeojtrs.sca.scd.InheritsInterface#getRepid()
	 * @see #getInheritsInterface()
	 * @generated
	 */
	EAttribute getInheritsInterface_Repid();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.scd.InheritsInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.InheritsInterface#getInterface()
	 * @see #getInheritsInterface()
	 * @generated
	 */
	EReference getInheritsInterface_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.scd.Interface#getInheritsInterfaces <em>Inherits Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inherits Interfaces</em>'.
	 * @see mil.jpeojtrs.sca.scd.Interface#getInheritsInterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InheritsInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.scd.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.Interface#getRepid <em>Repid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repid</em>'.
	 * @see mil.jpeojtrs.sca.scd.Interface#getRepid()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Repid();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.Interfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces</em>'.
	 * @see mil.jpeojtrs.sca.scd.Interfaces
	 * @generated
	 */
	EClass getInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.scd.Interfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.Interfaces#getInterface()
	 * @see #getInterfaces()
	 * @generated
	 */
	EReference getInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.scd.LocalFile
	 * @generated
	 */
	EClass getLocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.LocalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.scd.LocalFile#getName()
	 * @see #getLocalFile()
	 * @generated
	 */
	EAttribute getLocalFile_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports</em>'.
	 * @see mil.jpeojtrs.sca.scd.Ports
	 * @generated
	 */
	EClass getPorts();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.scd.Ports#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see mil.jpeojtrs.sca.scd.Ports#getGroup()
	 * @see #getPorts()
	 * @generated
	 */
	EAttribute getPorts_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.scd.Ports#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see mil.jpeojtrs.sca.scd.Ports#getProvides()
	 * @see #getPorts()
	 * @generated
	 */
	EReference getPorts_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.scd.Ports#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see mil.jpeojtrs.sca.scd.Ports#getUses()
	 * @see #getPorts()
	 * @generated
	 */
	EReference getPorts_Uses();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.PortTypeContainer <em>Port Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Container</em>'.
	 * @see mil.jpeojtrs.sca.scd.PortTypeContainer
	 * @generated
	 */
	EClass getPortTypeContainer();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.PortTypeContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.scd.PortTypeContainer#getType()
	 * @see #getPortTypeContainer()
	 * @generated
	 */
	EAttribute getPortTypeContainer_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.PropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.scd.PropertyFile
	 * @generated
	 */
	EClass getPropertyFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.PropertyFile#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.scd.PropertyFile#getLocalFile()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EReference getPropertyFile_LocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.PropertyFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.scd.PropertyFile#getType()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EAttribute getPropertyFile_Type();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.scd.PropertyFile#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.scd.PropertyFile#getProperties()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EReference getPropertyFile_Properties();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides</em>'.
	 * @see mil.jpeojtrs.sca.scd.Provides
	 * @generated
	 */
	EClass getProvides();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.Provides#getProvidesName <em>Provides Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Name</em>'.
	 * @see mil.jpeojtrs.sca.scd.Provides#getProvidesName()
	 * @see #getProvides()
	 * @generated
	 */
	EAttribute getProvides_ProvidesName();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port</em>'.
	 * @see mil.jpeojtrs.sca.scd.AbstractPort
	 * @generated
	 */
	EClass getAbstractPort();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.scd.AbstractPort#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Type</em>'.
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#getPortType()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EReference getAbstractPort_PortType();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.AbstractPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#getName()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.AbstractPort#getRepID <em>Rep ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rep ID</em>'.
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#getRepID()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_RepID();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.scd.AbstractPort#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#getInterface()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EReference getAbstractPort_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot
	 * @generated
	 */
	EClass getScdDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot#getMixed()
	 * @see #getScdDocumentRoot()
	 * @generated
	 */
	EAttribute getScdDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot#getXMLNSPrefixMap()
	 * @see #getScdDocumentRoot()
	 * @generated
	 */
	EReference getScdDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot#getXSISchemaLocation()
	 * @see #getScdDocumentRoot()
	 * @generated
	 */
	EReference getScdDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#getSoftwarecomponent <em>Softwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Softwarecomponent</em>'.
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot#getSoftwarecomponent()
	 * @see #getScdDocumentRoot()
	 * @generated
	 */
	EReference getScdDocumentRoot_Softwarecomponent();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getCorbaVersion <em>Corba Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corba Version</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getCorbaVersion()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_CorbaVersion();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentRepID <em>Component Rep ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Rep ID</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentRepID()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_ComponentRepID();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentType()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_ComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentFeatures <em>Component Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Features</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentFeatures()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_ComponentFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getInterfaces()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getPropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getPropertyFile()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_PropertyFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId <em>Rep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rep Id</em>'.
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_RepId();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.SupportsInterface <em>Supports Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supports Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface
	 * @generated
	 */
	EClass getSupportsInterface();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getRepId <em>Rep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rep Id</em>'.
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#getRepId()
	 * @see #getSupportsInterface()
	 * @generated
	 */
	EAttribute getSupportsInterface_RepId();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getSupportsName <em>Supports Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Name</em>'.
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#getSupportsName()
	 * @see #getSupportsInterface()
	 * @generated
	 */
	EAttribute getSupportsInterface_SupportsName();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#getId()
	 * @see #getSupportsInterface()
	 * @generated
	 */
	EAttribute getSupportsInterface_Id();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#getInterface()
	 * @see #getSupportsInterface()
	 * @generated
	 */
	EReference getSupportsInterface_Interface();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.scd.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see mil.jpeojtrs.sca.scd.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.scd.Uses#getUsesName <em>Uses Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Name</em>'.
	 * @see mil.jpeojtrs.sca.scd.Uses#getUsesName()
	 * @see #getUses()
	 * @generated
	 */
	EAttribute getUses_UsesName();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.scd.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see mil.jpeojtrs.sca.scd.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.scd.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see mil.jpeojtrs.sca.scd.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.scd.PortType <em>Port Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Type Object</em>'.
	 * @see mil.jpeojtrs.sca.scd.PortType
	 * @model instanceClass="mil.jpeojtrs.sca.scd.PortType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getPortTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScdFactory getScdFactory();

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
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.ComponentFeaturesImpl <em>Component Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.ComponentFeaturesImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getComponentFeatures()
		 * @generated
		 */
		EClass COMPONENT_FEATURES = eINSTANCE.getComponentFeatures();

		/**
		 * The meta object literal for the '<em><b>Supports Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FEATURES__SUPPORTS_INTERFACE = eINSTANCE.getComponentFeatures_SupportsInterface();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FEATURES__PORTS = eINSTANCE.getComponentFeatures_Ports();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.ComponentRepIdImpl <em>Component Rep Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.ComponentRepIdImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getComponentRepId()
		 * @generated
		 */
		EClass COMPONENT_REP_ID = eINSTANCE.getComponentRepId();

		/**
		 * The meta object literal for the '<em><b>Repid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REP_ID__REPID = eINSTANCE.getComponentRepId_Repid();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REP_ID__INTERFACE = eINSTANCE.getComponentRepId_Interface();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.InheritsInterfaceImpl <em>Inherits Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.InheritsInterfaceImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getInheritsInterface()
		 * @generated
		 */
		EClass INHERITS_INTERFACE = eINSTANCE.getInheritsInterface();

		/**
		 * The meta object literal for the '<em><b>Repid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITS_INTERFACE__REPID = eINSTANCE.getInheritsInterface_Repid();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITS_INTERFACE__INTERFACE = eINSTANCE.getInheritsInterface_Interface();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.InterfaceImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Inherits Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INHERITS_INTERFACES = eINSTANCE.getInterface_InheritsInterfaces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Repid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__REPID = eINSTANCE.getInterface_Repid();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.InterfacesImpl <em>Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.InterfacesImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getInterfaces()
		 * @generated
		 */
		EClass INTERFACES = eINSTANCE.getInterfaces();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES__INTERFACE = eINSTANCE.getInterfaces_Interface();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.LocalFileImpl <em>Local File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.LocalFileImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getLocalFile()
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
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.PortsImpl <em>Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.PortsImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPorts()
		 * @generated
		 */
		EClass PORTS = eINSTANCE.getPorts();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTS__GROUP = eINSTANCE.getPorts_Group();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTS__PROVIDES = eINSTANCE.getPorts_Provides();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTS__USES = eINSTANCE.getPorts_Uses();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.PortTypeContainerImpl <em>Port Type Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.PortTypeContainerImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPortTypeContainer()
		 * @generated
		 */
		EClass PORT_TYPE_CONTAINER = eINSTANCE.getPortTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_CONTAINER__TYPE = eINSTANCE.getPortTypeContainer_Type();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.PropertyFileImpl <em>Property File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.PropertyFileImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPropertyFile()
		 * @generated
		 */
		EClass PROPERTY_FILE = eINSTANCE.getPropertyFile();

		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE__LOCAL_FILE = eINSTANCE.getPropertyFile_LocalFile();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILE__TYPE = eINSTANCE.getPropertyFile_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE__PROPERTIES = eINSTANCE.getPropertyFile_Properties();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.ProvidesImpl <em>Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.ProvidesImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getProvides()
		 * @generated
		 */
		EClass PROVIDES = eINSTANCE.getProvides();

		/**
		 * The meta object literal for the '<em><b>Provides Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES__PROVIDES_NAME = eINSTANCE.getProvides_ProvidesName();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.AbstractPortImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getAbstractPort()
		 * @generated
		 */
		EClass ABSTRACT_PORT = eINSTANCE.getAbstractPort();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PORT__PORT_TYPE = eINSTANCE.getAbstractPort_PortType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__NAME = eINSTANCE.getAbstractPort_Name();

		/**
		 * The meta object literal for the '<em><b>Rep ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__REP_ID = eINSTANCE.getAbstractPort_RepID();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PORT__INTERFACE = eINSTANCE.getAbstractPort_Interface();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.ScdDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.ScdDocumentRootImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getScdDocumentRoot()
		 * @generated
		 */
		EClass SCD_DOCUMENT_ROOT = eINSTANCE.getScdDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCD_DOCUMENT_ROOT__MIXED = eINSTANCE.getScdDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getScdDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getScdDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Softwarecomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCD_DOCUMENT_ROOT__SOFTWARECOMPONENT = eINSTANCE.getScdDocumentRoot_Softwarecomponent();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getSoftwareComponent()
		 * @generated
		 */
		EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Corba Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__CORBA_VERSION = eINSTANCE.getSoftwareComponent_CorbaVersion();

		/**
		 * The meta object literal for the '<em><b>Component Rep ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__COMPONENT_REP_ID = eINSTANCE.getSoftwareComponent_ComponentRepID();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__COMPONENT_TYPE = eINSTANCE.getSoftwareComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Component Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__COMPONENT_FEATURES = eINSTANCE.getSoftwareComponent_ComponentFeatures();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__INTERFACES = eINSTANCE.getSoftwareComponent_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Property File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__PROPERTY_FILE = eINSTANCE.getSoftwareComponent_PropertyFile();

		/**
		 * The meta object literal for the '<em><b>Rep Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__REP_ID = eINSTANCE.getSoftwareComponent_RepId();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl <em>Supports Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getSupportsInterface()
		 * @generated
		 */
		EClass SUPPORTS_INTERFACE = eINSTANCE.getSupportsInterface();

		/**
		 * The meta object literal for the '<em><b>Rep Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTS_INTERFACE__REP_ID = eINSTANCE.getSupportsInterface_RepId();

		/**
		 * The meta object literal for the '<em><b>Supports Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTS_INTERFACE__SUPPORTS_NAME = eINSTANCE.getSupportsInterface_SupportsName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTS_INTERFACE__ID = eINSTANCE.getSupportsInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTS_INTERFACE__INTERFACE = eINSTANCE.getSupportsInterface_Interface();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.impl.UsesImpl
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '<em><b>Uses Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES__USES_NAME = eINSTANCE.getUses_UsesName();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.PortType
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.scd.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.ComponentType
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em>Port Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.scd.PortType
		 * @see mil.jpeojtrs.sca.scd.impl.ScdPackageImpl#getPortTypeObject()
		 * @generated
		 */
		EDataType PORT_TYPE_OBJECT = eINSTANCE.getPortTypeObject();

		@Deprecated
		EAttribute PROVIDES__REP_ID = ABSTRACT_PORT__REP_ID;
		
		@Deprecated
		EAttribute USES__REP_ID = ABSTRACT_PORT__REP_ID;

	}

} // ScdPackage
