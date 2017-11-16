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
package mil.jpeojtrs.sca.cf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see mil.jpeojtrs.sca.cf.CfFactory
 * @model kind="package"
 * @generated
 */
public interface CfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///mil/jpeojtrs/sca/cf.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mil.jpeojtrs.sca.cf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfPackage eINSTANCE = mil.jpeojtrs.sca.cf.impl.CfPackageImpl.init();

	/**
	 * The meta object id for the '{@link CF.AggregateDeviceOperations <em>Aggregate Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregateDeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregateDeviceOperations()
	 * @generated
	 */
	int AGGREGATE_DEVICE_OPERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Aggregate Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_DEVICE_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.AggregateDevice <em>Aggregate Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregateDevice
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregateDevice()
	 * @generated
	 */
	int AGGREGATE_DEVICE = 0;

	/**
	 * The number of structural features of the '<em>Aggregate Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_DEVICE_FEATURE_COUNT = AGGREGATE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.LifeCycleOperations <em>Life Cycle Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LifeCycleOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLifeCycleOperations()
	 * @generated
	 */
	int LIFE_CYCLE_OPERATIONS = 34;

	/**
	 * The number of structural features of the '<em>Life Cycle Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.ResourceOperations <em>Resource Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getResourceOperations()
	 * @generated
	 */
	int RESOURCE_OPERATIONS = 57;

	/**
	 * The number of structural features of the '<em>Resource Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATIONS_FEATURE_COUNT = LIFE_CYCLE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.DeviceOperations <em>Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDeviceOperations()
	 * @generated
	 */
	int DEVICE_OPERATIONS = 19;

	/**
	 * The number of structural features of the '<em>Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATIONS_FEATURE_COUNT = RESOURCE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.LoadableDeviceOperations <em>Loadable Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LoadableDeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLoadableDeviceOperations()
	 * @generated
	 */
	int LOADABLE_DEVICE_OPERATIONS = 36;

	/**
	 * The number of structural features of the '<em>Loadable Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE_DEVICE_OPERATIONS_FEATURE_COUNT = DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.ExecutableDeviceOperations <em>Executable Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getExecutableDeviceOperations()
	 * @generated
	 */
	int EXECUTABLE_DEVICE_OPERATIONS = 25;

	/**
	 * The number of structural features of the '<em>Executable Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_DEVICE_OPERATIONS_FEATURE_COUNT = LOADABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AggregateExecutableDeviceOperations <em>Aggregate Executable Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregateExecutableDeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregateExecutableDeviceOperations()
	 * @generated
	 */
	int AGGREGATE_EXECUTABLE_DEVICE_OPERATIONS = 3;

	/**
	 * The number of structural features of the '<em>Aggregate Executable Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXECUTABLE_DEVICE_OPERATIONS_FEATURE_COUNT = EXECUTABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AggregateExecutableDevice <em>Aggregate Executable Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregateExecutableDevice
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregateExecutableDevice()
	 * @generated
	 */
	int AGGREGATE_EXECUTABLE_DEVICE = 2;

	/**
	 * The number of structural features of the '<em>Aggregate Executable Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXECUTABLE_DEVICE_FEATURE_COUNT = AGGREGATE_EXECUTABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AggregateLoadableDeviceOperations <em>Aggregate Loadable Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregateLoadableDeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregateLoadableDeviceOperations()
	 * @generated
	 */
	int AGGREGATE_LOADABLE_DEVICE_OPERATIONS = 5;

	/**
	 * The number of structural features of the '<em>Aggregate Loadable Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_LOADABLE_DEVICE_OPERATIONS_FEATURE_COUNT = LOADABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AggregateLoadableDevice <em>Aggregate Loadable Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregateLoadableDevice
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregateLoadableDevice()
	 * @generated
	 */
	int AGGREGATE_LOADABLE_DEVICE = 4;

	/**
	 * The number of structural features of the '<em>Aggregate Loadable Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_LOADABLE_DEVICE_FEATURE_COUNT = AGGREGATE_LOADABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AggregatePlainDeviceOperations <em>Aggregate Plain Device Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregatePlainDeviceOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregatePlainDeviceOperations()
	 * @generated
	 */
	int AGGREGATE_PLAIN_DEVICE_OPERATIONS = 7;

	/**
	 * The number of structural features of the '<em>Aggregate Plain Device Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_PLAIN_DEVICE_OPERATIONS_FEATURE_COUNT = DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AggregatePlainDevice <em>Aggregate Plain Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AggregatePlainDevice
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAggregatePlainDevice()
	 * @generated
	 */
	int AGGREGATE_PLAIN_DEVICE = 6;

	/**
	 * The number of structural features of the '<em>Aggregate Plain Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_PLAIN_DEVICE_FEATURE_COUNT = AGGREGATE_PLAIN_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.AllocationManagerOperations <em>Allocation Manager Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AllocationManagerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAllocationManagerOperations()
	 * @generated
	 */
	int ALLOCATION_MANAGER_OPERATIONS = 9;

	/**
	 * The number of structural features of the '<em>Allocation Manager Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MANAGER_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.AllocationManager <em>Allocation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AllocationManager
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAllocationManager()
	 * @generated
	 */
	int ALLOCATION_MANAGER = 8;

	/**
	 * The number of structural features of the '<em>Allocation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MANAGER_FEATURE_COUNT = ALLOCATION_MANAGER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.ApplicationOperations <em>Application Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplicationOperations()
	 * @generated
	 */
	int APPLICATION_OPERATIONS = 13;

	/**
	 * The number of structural features of the '<em>Application Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATIONS_FEATURE_COUNT = RESOURCE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.Application <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.Application
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = APPLICATION_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.ApplicationFactoryOperations <em>Application Factory Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationFactoryOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplicationFactoryOperations()
	 * @generated
	 */
	int APPLICATION_FACTORY_OPERATIONS = 12;

	/**
	 * The number of structural features of the '<em>Application Factory Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FACTORY_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.ApplicationFactory <em>Application Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationFactory
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplicationFactory()
	 * @generated
	 */
	int APPLICATION_FACTORY = 11;

	/**
	 * The number of structural features of the '<em>Application Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FACTORY_FEATURE_COUNT = APPLICATION_FACTORY_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.ConnectionManagerOperations <em>Connection Manager Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ConnectionManagerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getConnectionManagerOperations()
	 * @generated
	 */
	int CONNECTION_MANAGER_OPERATIONS = 15;

	/**
	 * The number of structural features of the '<em>Connection Manager Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.ConnectionManager <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ConnectionManager
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 14;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = CONNECTION_MANAGER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.Device <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.Device
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 16;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.PropertySetOperations <em>Property Set Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertySetOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPropertySetOperations()
	 * @generated
	 */
	int PROPERTY_SET_OPERATIONS = 53;

	/**
	 * The number of structural features of the '<em>Property Set Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.PropertyEmitterOperations <em>Property Emitter Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertyEmitterOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPropertyEmitterOperations()
	 * @generated
	 */
	int PROPERTY_EMITTER_OPERATIONS = 51;

	/**
	 * The number of structural features of the '<em>Property Emitter Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EMITTER_OPERATIONS_FEATURE_COUNT = PROPERTY_SET_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.DeviceManagerOperations <em>Device Manager Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DeviceManagerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDeviceManagerOperations()
	 * @generated
	 */
	int DEVICE_MANAGER_OPERATIONS = 18;

	/**
	 * The number of structural features of the '<em>Device Manager Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGER_OPERATIONS_FEATURE_COUNT = PROPERTY_EMITTER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.DeviceManager <em>Device Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DeviceManager
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDeviceManager()
	 * @generated
	 */
	int DEVICE_MANAGER = 17;

	/**
	 * The number of structural features of the '<em>Device Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGER_FEATURE_COUNT = DEVICE_MANAGER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.DomainManagerOperations <em>Domain Manager Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDomainManagerOperations()
	 * @generated
	 */
	int DOMAIN_MANAGER_OPERATIONS = 21;

	/**
	 * The number of structural features of the '<em>Domain Manager Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_OPERATIONS_FEATURE_COUNT = PROPERTY_EMITTER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.DomainManager <em>Domain Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManager
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDomainManager()
	 * @generated
	 */
	int DOMAIN_MANAGER = 20;

	/**
	 * The number of structural features of the '<em>Domain Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_FEATURE_COUNT = DOMAIN_MANAGER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.EventChannelManagerOperations <em>Event Channel Manager Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventChannelManagerOperations()
	 * @generated
	 */
	int EVENT_CHANNEL_MANAGER_OPERATIONS = 23;

	/**
	 * The number of structural features of the '<em>Event Channel Manager Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_MANAGER_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.EventChannelManager <em>Event Channel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManager
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventChannelManager()
	 * @generated
	 */
	int EVENT_CHANNEL_MANAGER = 22;

	/**
	 * The number of structural features of the '<em>Event Channel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_MANAGER_FEATURE_COUNT = EVENT_CHANNEL_MANAGER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.ExecutableDevice <em>Executable Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDevice
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getExecutableDevice()
	 * @generated
	 */
	int EXECUTABLE_DEVICE = 24;

	/**
	 * The number of structural features of the '<em>Executable Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_DEVICE_FEATURE_COUNT = EXECUTABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.FileOperations <em>File Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileOperations()
	 * @generated
	 */
	int FILE_OPERATIONS = 29;

	/**
	 * The number of structural features of the '<em>File Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.File <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.File
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 26;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = FILE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.FileSystemOperations <em>File System Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileSystemOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileSystemOperations()
	 * @generated
	 */
	int FILE_SYSTEM_OPERATIONS = 31;

	/**
	 * The number of structural features of the '<em>File System Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.FileManagerOperations <em>File Manager Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileManagerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileManagerOperations()
	 * @generated
	 */
	int FILE_MANAGER_OPERATIONS = 28;

	/**
	 * The number of structural features of the '<em>File Manager Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER_OPERATIONS_FEATURE_COUNT = FILE_SYSTEM_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.FileManager <em>File Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileManager
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileManager()
	 * @generated
	 */
	int FILE_MANAGER = 27;

	/**
	 * The number of structural features of the '<em>File Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER_FEATURE_COUNT = FILE_MANAGER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.FileSystem <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileSystem
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileSystem()
	 * @generated
	 */
	int FILE_SYSTEM = 30;

	/**
	 * The number of structural features of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_FEATURE_COUNT = FILE_SYSTEM_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.CORBA.portable.IDLEntity <em>IDL Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CORBA.portable.IDLEntity
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getIDLEntity()
	 * @generated
	 */
	int IDL_ENTITY = 32;

	/**
	 * The number of structural features of the '<em>IDL Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ENTITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.LifeCycle <em>Life Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LifeCycle
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLifeCycle()
	 * @generated
	 */
	int LIFE_CYCLE = 33;

	/**
	 * The number of structural features of the '<em>Life Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_FEATURE_COUNT = LIFE_CYCLE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.LoadableDevice <em>Loadable Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LoadableDevice
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLoadableDevice()
	 * @generated
	 */
	int LOADABLE_DEVICE = 35;

	/**
	 * The number of structural features of the '<em>Loadable Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE_DEVICE_FEATURE_COUNT = LOADABLE_DEVICE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.LogEventConsumerOperations <em>Log Event Consumer Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LogEventConsumerOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLogEventConsumerOperations()
	 * @generated
	 */
	int LOG_EVENT_CONSUMER_OPERATIONS = 40;

	/**
	 * The number of structural features of the '<em>Log Event Consumer Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_CONSUMER_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.LoggingOperations <em>Logging Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LoggingOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLoggingOperations()
	 * @generated
	 */
	int LOGGING_OPERATIONS = 38;

	/**
	 * The number of structural features of the '<em>Logging Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_OPERATIONS_FEATURE_COUNT = LOG_EVENT_CONSUMER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.Logging <em>Logging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.Logging
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLogging()
	 * @generated
	 */
	int LOGGING = 37;

	/**
	 * The number of structural features of the '<em>Logging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_FEATURE_COUNT = LOGGING_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.LogEventConsumer <em>Log Event Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LogEventConsumer
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLogEventConsumer()
	 * @generated
	 */
	int LOG_EVENT_CONSUMER = 39;

	/**
	 * The number of structural features of the '<em>Log Event Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_CONSUMER_FEATURE_COUNT = LOG_EVENT_CONSUMER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.LogConfigurationOperations <em>Log Configuration Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LogConfigurationOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLogConfigurationOperations()
	 * @generated
	 */
	int LOG_CONFIGURATION_OPERATIONS = 42;

	/**
	 * The number of structural features of the '<em>Log Configuration Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CONFIGURATION_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.LogConfiguration <em>Log Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LogConfiguration
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLogConfiguration()
	 * @generated
	 */
	int LOG_CONFIGURATION = 41;

	/**
	 * The number of structural features of the '<em>Log Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CONFIGURATION_FEATURE_COUNT = LOG_CONFIGURATION_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.CORBA.Object <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CORBA.Object
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 43;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.PortOperations <em>Port Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPortOperations()
	 * @generated
	 */
	int PORT_OPERATIONS = 45;

	/**
	 * The number of structural features of the '<em>Port Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.Port <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.Port
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 44;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = PORT_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.PortSetOperations <em>Port Set Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortSetOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPortSetOperations()
	 * @generated
	 */
	int PORT_SET_OPERATIONS = 47;

	/**
	 * The number of structural features of the '<em>Port Set Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SET_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.PortSet <em>Port Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortSet
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPortSet()
	 * @generated
	 */
	int PORT_SET = 46;

	/**
	 * The number of structural features of the '<em>Port Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SET_FEATURE_COUNT = PORT_SET_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.PortSupplierOperations <em>Port Supplier Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortSupplierOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPortSupplierOperations()
	 * @generated
	 */
	int PORT_SUPPLIER_OPERATIONS = 49;

	/**
	 * The number of structural features of the '<em>Port Supplier Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SUPPLIER_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.PortSupplier <em>Port Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortSupplier
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPortSupplier()
	 * @generated
	 */
	int PORT_SUPPLIER = 48;

	/**
	 * The number of structural features of the '<em>Port Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SUPPLIER_FEATURE_COUNT = PORT_SUPPLIER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.PropertyEmitter <em>Property Emitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertyEmitter
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPropertyEmitter()
	 * @generated
	 */
	int PROPERTY_EMITTER = 50;

	/**
	 * The number of structural features of the '<em>Property Emitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EMITTER_FEATURE_COUNT = PROPERTY_EMITTER_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.PropertySet <em>Property Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertySet
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPropertySet()
	 * @generated
	 */
	int PROPERTY_SET = 52;

	/**
	 * The number of structural features of the '<em>Property Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET_FEATURE_COUNT = PROPERTY_SET_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.Resource
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 54;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = RESOURCE_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.ResourceFactoryOperations <em>Resource Factory Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourceFactoryOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getResourceFactoryOperations()
	 * @generated
	 */
	int RESOURCE_FACTORY_OPERATIONS = 56;

	/**
	 * The number of structural features of the '<em>Resource Factory Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.ResourceFactory <em>Resource Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourceFactory
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getResourceFactory()
	 * @generated
	 */
	int RESOURCE_FACTORY = 55;

	/**
	 * The number of structural features of the '<em>Resource Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FACTORY_FEATURE_COUNT = RESOURCE_FACTORY_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CF.TestableObjectOperations <em>Testable Object Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.TestableObjectOperations
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getTestableObjectOperations()
	 * @generated
	 */
	int TESTABLE_OBJECT_OPERATIONS = 59;

	/**
	 * The number of structural features of the '<em>Testable Object Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_OBJECT_OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CF.TestableObject <em>Testable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.TestableObject
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getTestableObject()
	 * @generated
	 */
	int TESTABLE_OBJECT = 58;

	/**
	 * The number of structural features of the '<em>Testable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_OBJECT_FEATURE_COUNT = TESTABLE_OBJECT_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Allocation Status Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.AllocationManagerPackage.AllocationStatusType
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAllocationStatusType()
	 * @generated
	 */
	int ALLOCATION_STATUS_TYPE = 60;

	/**
	 * The meta object id for the '<em>Create Application Insufficient Capacity Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationFactoryPackage.CreateApplicationInsufficientCapacityError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getCreateApplicationInsufficientCapacityError()
	 * @generated
	 */
	int CREATE_APPLICATION_INSUFFICIENT_CAPACITY_ERROR = 61;

	/**
	 * The meta object id for the '<em>Create Application Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationFactoryPackage.CreateApplicationError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getCreateApplicationError()
	 * @generated
	 */
	int CREATE_APPLICATION_ERROR = 62;

	/**
	 * The meta object id for the '<em>Create Application Request Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationFactoryPackage.CreateApplicationRequestError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getCreateApplicationRequestError()
	 * @generated
	 */
	int CREATE_APPLICATION_REQUEST_ERROR = 63;

	/**
	 * The meta object id for the '<em>Invalid Init Configuration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ApplicationFactoryPackage.InvalidInitConfiguration
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidInitConfiguration()
	 * @generated
	 */
	int INVALID_INIT_CONFIGURATION = 64;

	/**
	 * The meta object id for the '<em>Connection Status Sequence Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ConnectionManagerPackage.ConnectionStatusSequenceHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getConnectionStatusSequenceHolder()
	 * @generated
	 */
	int CONNECTION_STATUS_SEQUENCE_HOLDER = 65;

	/**
	 * The meta object id for the '<em>Connection Status Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ConnectionManagerPackage.ConnectionStatusType
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getConnectionStatusType()
	 * @generated
	 */
	int CONNECTION_STATUS_TYPE = 66;

	/**
	 * The meta object id for the '<em>Connection Status Type Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getConnectionStatusTypeArray()
	 * @generated
	 */
	int CONNECTION_STATUS_TYPE_ARRAY = 67;

	/**
	 * The meta object id for the '<em>Endpoint Request</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ConnectionManagerPackage.EndpointRequest
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEndpointRequest()
	 * @generated
	 */
	int ENDPOINT_REQUEST = 68;

	/**
	 * The meta object id for the '<em>Connection Status Iterator Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ConnectionStatusIteratorHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getConnectionStatusIteratorHolder()
	 * @generated
	 */
	int CONNECTION_STATUS_ITERATOR_HOLDER = 69;

	/**
	 * The meta object id for the '<em>Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DataType
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 70;

	/**
	 * The meta object id for the '<em>Data Type Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDataTypeArray()
	 * @generated
	 */
	int DATA_TYPE_ARRAY = 71;

	/**
	 * The meta object id for the '<em>Device Assignment Type Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDeviceAssignmentTypeArray()
	 * @generated
	 */
	int DEVICE_ASSIGNMENT_TYPE_ARRAY = 72;

	/**
	 * The meta object id for the '<em>Invalid Capacity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DevicePackage.InvalidCapacity
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidCapacity()
	 * @generated
	 */
	int INVALID_CAPACITY = 73;

	/**
	 * The meta object id for the '<em>Invalid State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DevicePackage.InvalidState
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidState()
	 * @generated
	 */
	int INVALID_STATE = 74;

	/**
	 * The meta object id for the '<em>Device Manager Not Registered</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.DeviceManagerNotRegistered
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getDeviceManagerNotRegistered()
	 * @generated
	 */
	int DEVICE_MANAGER_NOT_REGISTERED = 75;

	/**
	 * The meta object id for the '<em>Register Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.RegisterError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getRegisterError()
	 * @generated
	 */
	int REGISTER_ERROR = 76;

	/**
	 * The meta object id for the '<em>Unregister Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.UnregisterError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUnregisterError()
	 * @generated
	 */
	int UNREGISTER_ERROR = 77;

	/**
	 * The meta object id for the '<em>Application Installation Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.ApplicationInstallationError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplicationInstallationError()
	 * @generated
	 */
	int APPLICATION_INSTALLATION_ERROR = 78;

	/**
	 * The meta object id for the '<em>Application Already Installed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.ApplicationAlreadyInstalled
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplicationAlreadyInstalled()
	 * @generated
	 */
	int APPLICATION_ALREADY_INSTALLED = 79;

	/**
	 * The meta object id for the '<em>Invalid Dom Mgr Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.InvalidIdentifier
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidDomMgrIdentifier()
	 * @generated
	 */
	int INVALID_DOM_MGR_IDENTIFIER = 80;

	/**
	 * The meta object id for the '<em>Application Uninstallation Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.ApplicationUninstallationError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getApplicationUninstallationError()
	 * @generated
	 */
	int APPLICATION_UNINSTALLATION_ERROR = 81;

	/**
	 * The meta object id for the '<em>Insufficient Capacity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DevicePackage.InsufficientCapacity
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInsufficientCapacity()
	 * @generated
	 */
	int INSUFFICIENT_CAPACITY = 82;

	/**
	 * The meta object id for the '<em>Invalid Event Channel Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.InvalidEventChannelName
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidEventChannelName()
	 * @generated
	 */
	int INVALID_EVENT_CHANNEL_NAME = 83;

	/**
	 * The meta object id for the '<em>Already Connected</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.AlreadyConnected
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAlreadyConnected()
	 * @generated
	 */
	int ALREADY_CONNECTED = 84;

	/**
	 * The meta object id for the '<em>Not Connected</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.DomainManagerPackage.NotConnected
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getNotConnected()
	 * @generated
	 */
	int NOT_CONNECTED = 85;

	/**
	 * The meta object id for the '<em>Event Channel Info Iterator Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelInfoIteratorHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventChannelInfoIteratorHolder()
	 * @generated
	 */
	int EVENT_CHANNEL_INFO_ITERATOR_HOLDER = 86;

	/**
	 * The meta object id for the '<em>Channel Already Exists</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.ChannelAlreadyExists
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getChannelAlreadyExists()
	 * @generated
	 */
	int CHANNEL_ALREADY_EXISTS = 87;

	/**
	 * The meta object id for the '<em>Channel Does Not Exist</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.ChannelDoesNotExist
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getChannelDoesNotExist()
	 * @generated
	 */
	int CHANNEL_DOES_NOT_EXIST = 88;

	/**
	 * The meta object id for the '<em>Event Channel Info List Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.EventChannelInfoListHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventChannelInfoListHolder()
	 * @generated
	 */
	int EVENT_CHANNEL_INFO_LIST_HOLDER = 89;

	/**
	 * The meta object id for the '<em>Event Channel Reg</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.EventChannelReg
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventChannelReg()
	 * @generated
	 */
	int EVENT_CHANNEL_REG = 90;

	/**
	 * The meta object id for the '<em>Event Registration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.EventRegistration
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventRegistration()
	 * @generated
	 */
	int EVENT_REGISTRATION = 91;

	/**
	 * The meta object id for the '<em>Event Registrant List Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.EventRegistrantListHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventRegistrantListHolder()
	 * @generated
	 */
	int EVENT_REGISTRANT_LIST_HOLDER = 92;

	/**
	 * The meta object id for the '<em>Invalid Channel Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.InvalidChannelName
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidChannelName()
	 * @generated
	 */
	int INVALID_CHANNEL_NAME = 93;

	/**
	 * The meta object id for the '<em>Operation Failed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.OperationFailed
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getOperationFailed()
	 * @generated
	 */
	int OPERATION_FAILED = 94;

	/**
	 * The meta object id for the '<em>Operation Not Allowed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.OperationNotAllowed
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getOperationNotAllowed()
	 * @generated
	 */
	int OPERATION_NOT_ALLOWED = 95;

	/**
	 * The meta object id for the '<em>Publisher Reg</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.PublisherReg
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPublisherReg()
	 * @generated
	 */
	int PUBLISHER_REG = 96;

	/**
	 * The meta object id for the '<em>Registration Already Exists</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.RegistrationAlreadyExists
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getRegistrationAlreadyExists()
	 * @generated
	 */
	int REGISTRATION_ALREADY_EXISTS = 97;

	/**
	 * The meta object id for the '<em>Registration Does Not Exist</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.RegistrationDoesNotExist
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getRegistrationDoesNotExist()
	 * @generated
	 */
	int REGISTRATION_DOES_NOT_EXIST = 98;

	/**
	 * The meta object id for the '<em>Registrations Exists</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.RegistrationsExists
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getRegistrationsExists()
	 * @generated
	 */
	int REGISTRATIONS_EXISTS = 99;

	/**
	 * The meta object id for the '<em>Service Unavailable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventChannelManagerPackage.ServiceUnavailable
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getServiceUnavailable()
	 * @generated
	 */
	int SERVICE_UNAVAILABLE = 100;

	/**
	 * The meta object id for the '<em>Event Registrant Iterator Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.EventRegistrantIteratorHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventRegistrantIteratorHolder()
	 * @generated
	 */
	int EVENT_REGISTRANT_ITERATOR_HOLDER = 101;

	/**
	 * The meta object id for the '<em>Invalid Process</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDevicePackage.InvalidProcess
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidProcess()
	 * @generated
	 */
	int INVALID_PROCESS = 102;

	/**
	 * The meta object id for the '<em>Invalid Function</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDevicePackage.InvalidFunction
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidFunction()
	 * @generated
	 */
	int INVALID_FUNCTION = 103;

	/**
	 * The meta object id for the '<em>Invalid Parameters</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDevicePackage.InvalidParameters
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidParameters()
	 * @generated
	 */
	int INVALID_PARAMETERS = 104;

	/**
	 * The meta object id for the '<em>Invalid Options</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDevicePackage.InvalidOptions
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidOptions()
	 * @generated
	 */
	int INVALID_OPTIONS = 105;

	/**
	 * The meta object id for the '<em>Execute Fail</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ExecutableDevicePackage.ExecuteFail
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getExecuteFail()
	 * @generated
	 */
	int EXECUTE_FAIL = 106;

	/**
	 * The meta object id for the '<em>Invalid File System</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileManagerPackage.InvalidFileSystem
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidFileSystem()
	 * @generated
	 */
	int INVALID_FILE_SYSTEM = 107;

	/**
	 * The meta object id for the '<em>Mount Point Already Exists</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileManagerPackage.MountPointAlreadyExists
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getMountPointAlreadyExists()
	 * @generated
	 */
	int MOUNT_POINT_ALREADY_EXISTS = 108;

	/**
	 * The meta object id for the '<em>Non Existent Mount</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileManagerPackage.NonExistentMount
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getNonExistentMount()
	 * @generated
	 */
	int NON_EXISTENT_MOUNT = 109;

	/**
	 * The meta object id for the '<em>Mount Type Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getMountTypeArray()
	 * @generated
	 */
	int MOUNT_TYPE_ARRAY = 110;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FilePackage.IOException
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 111;

	/**
	 * The meta object id for the '<em>File Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileException
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileException()
	 * @generated
	 */
	int FILE_EXCEPTION = 112;

	/**
	 * The meta object id for the '<em>Invalid File Pointer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FilePackage.InvalidFilePointer
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidFilePointer()
	 * @generated
	 */
	int INVALID_FILE_POINTER = 113;

	/**
	 * The meta object id for the '<em>File Information Type Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getFileInformationTypeArray()
	 * @generated
	 */
	int FILE_INFORMATION_TYPE_ARRAY = 114;

	/**
	 * The meta object id for the '<em>Unknown File System Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.FileSystemPackage.UnknownFileSystemProperties
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUnknownFileSystemProperties()
	 * @generated
	 */
	int UNKNOWN_FILE_SYSTEM_PROPERTIES = 115;

	/**
	 * The meta object id for the '<em>Invalid File Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.InvalidFileName
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidFileName()
	 * @generated
	 */
	int INVALID_FILE_NAME = 116;

	/**
	 * The meta object id for the '<em>Invalid Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.InvalidIdentifier
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidIdentifier()
	 * @generated
	 */
	int INVALID_IDENTIFIER = 117;

	/**
	 * The meta object id for the '<em>Invalid Object Reference</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.InvalidObjectReference
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidObjectReference()
	 * @generated
	 */
	int INVALID_OBJECT_REFERENCE = 118;

	/**
	 * The meta object id for the '<em>Invalid Profile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.InvalidProfile
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidProfile()
	 * @generated
	 */
	int INVALID_PROFILE = 119;

	/**
	 * The meta object id for the '<em>Initialize Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LifeCyclePackage.InitializeError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInitializeError()
	 * @generated
	 */
	int INITIALIZE_ERROR = 120;

	/**
	 * The meta object id for the '<em>Release Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LifeCyclePackage.ReleaseError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getReleaseError()
	 * @generated
	 */
	int RELEASE_ERROR = 121;

	/**
	 * The meta object id for the '<em>Load Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LoadableDevicePackage.LoadType
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLoadType()
	 * @generated
	 */
	int LOAD_TYPE = 122;

	/**
	 * The meta object id for the '<em>Invalid Load Kind</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LoadableDevicePackage.InvalidLoadKind
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidLoadKind()
	 * @generated
	 */
	int INVALID_LOAD_KIND = 123;

	/**
	 * The meta object id for the '<em>Load Fail</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.LoadableDevicePackage.LoadFail
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLoadFail()
	 * @generated
	 */
	int LOAD_FAIL = 124;

	/**
	 * The meta object id for the '<em>Log Event Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getLogEventArray()
	 * @generated
	 */
	int LOG_EVENT_ARRAY = 125;

	/**
	 * The meta object id for the '<em>Octet Sequence Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.OctetSequenceHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getOctetSequenceHolder()
	 * @generated
	 */
	int OCTET_SEQUENCE_HOLDER = 126;

	/**
	 * The meta object id for the '<em>Invalid Port</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortPackage.InvalidPort
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidPort()
	 * @generated
	 */
	int INVALID_PORT = 127;

	/**
	 * The meta object id for the '<em>Occupied Port</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortPackage.OccupiedPort
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getOccupiedPort()
	 * @generated
	 */
	int OCCUPIED_PORT = 128;

	/**
	 * The meta object id for the '<em>Port Info Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortSetPackage.PortInfoType
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPortInfoType()
	 * @generated
	 */
	int PORT_INFO_TYPE = 129;

	/**
	 * The meta object id for the '<em>Unknown Port</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PortSupplierPackage.UnknownPort
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUnknownPort()
	 * @generated
	 */
	int UNKNOWN_PORT = 130;

	/**
	 * The meta object id for the '<em>Properties Holder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertiesHolder
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPropertiesHolder()
	 * @generated
	 */
	int PROPERTIES_HOLDER = 131;

	/**
	 * The meta object id for the '<em>Property Change Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertyChangeListenerPackage.PropertyChangeEvent
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPropertyChangeEvent()
	 * @generated
	 */
	int PROPERTY_CHANGE_EVENT = 132;

	/**
	 * The meta object id for the '<em>Already Initialized</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertyEmitterPackage.AlreadyInitialized
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getAlreadyInitialized()
	 * @generated
	 */
	int ALREADY_INITIALIZED = 133;

	/**
	 * The meta object id for the '<em>Invalid Configuration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertySetPackage.InvalidConfiguration
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidConfiguration()
	 * @generated
	 */
	int INVALID_CONFIGURATION = 134;

	/**
	 * The meta object id for the '<em>Partial Configuration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.PropertySetPackage.PartialConfiguration
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPartialConfiguration()
	 * @generated
	 */
	int PARTIAL_CONFIGURATION = 135;

	/**
	 * The meta object id for the '<em>Unknown Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.UnknownProperties
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUnknownProperties()
	 * @generated
	 */
	int UNKNOWN_PROPERTIES = 136;

	/**
	 * The meta object id for the '<em>Create Resource Failure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourceFactoryPackage.CreateResourceFailure
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getCreateResourceFailure()
	 * @generated
	 */
	int CREATE_RESOURCE_FAILURE = 137;

	/**
	 * The meta object id for the '<em>Invalid Resource Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourceFactoryPackage.InvalidResourceId
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getInvalidResourceId()
	 * @generated
	 */
	int INVALID_RESOURCE_ID = 138;

	/**
	 * The meta object id for the '<em>Shutdown Failure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourceFactoryPackage.ShutdownFailure
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getShutdownFailure()
	 * @generated
	 */
	int SHUTDOWN_FAILURE = 139;

	/**
	 * The meta object id for the '<em>Start Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourcePackage.StartError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getStartError()
	 * @generated
	 */
	int START_ERROR = 140;

	/**
	 * The meta object id for the '<em>Stop Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.ResourcePackage.StopError
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getStopError()
	 * @generated
	 */
	int STOP_ERROR = 141;

	/**
	 * The meta object id for the '<em>Unknown Test</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.TestableObjectPackage.UnknownTest
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUnknownTest()
	 * @generated
	 */
	int UNKNOWN_TEST = 142;

	/**
	 * The meta object id for the '<em>Unknown Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.UnknownIdentifier
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUnknownIdentifier()
	 * @generated
	 */
	int UNKNOWN_IDENTIFIER = 143;

	/**
	 * The meta object id for the '<em>UTC Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CF.UTCTime
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getUTCTime()
	 * @generated
	 */
	int UTC_TIME = 144;

	/**
	 * The meta object id for the '<em>ORB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CORBA.ORB
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getORB()
	 * @generated
	 */
	int ORB = 145;

	/**
	 * The meta object id for the '<em>Event Channel</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CosEventChannelAdmin.EventChannel
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getEventChannel()
	 * @generated
	 */
	int EVENT_CHANNEL = 146;

	/**
	 * The meta object id for the '<em>Push Consumer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CosEventComm.PushConsumer
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPushConsumer()
	 * @generated
	 */
	int PUSH_CONSUMER = 147;

	/**
	 * The meta object id for the '<em>Push Supplier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CosEventComm.PushSupplier
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getPushSupplier()
	 * @generated
	 */
	int PUSH_SUPPLIER = 148;

	/**
	 * The meta object id for the '<em>Naming Context Ext</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CosNaming.NamingContextExt
	 * @see mil.jpeojtrs.sca.cf.impl.CfPackageImpl#getNamingContextExt()
	 * @generated
	 */
	int NAMING_CONTEXT_EXT = 149;

	/**
	 * Returns the meta object for class '{@link CF.AggregateDevice <em>Aggregate Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Device</em>'.
	 * @see CF.AggregateDevice
	 * @model instanceClass="CF.AggregateDevice" superTypes="mil.jpeojtrs.sca.cf.AggregateDeviceOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getAggregateDevice();

	/**
	 * Returns the meta object for class '{@link CF.AggregateDeviceOperations <em>Aggregate Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Device Operations</em>'.
	 * @see CF.AggregateDeviceOperations
	 * @model instanceClass="CF.AggregateDeviceOperations"
	 * @generated
	 */
	EClass getAggregateDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.AggregateExecutableDevice <em>Aggregate Executable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Executable Device</em>'.
	 * @see CF.AggregateExecutableDevice
	 * @model instanceClass="CF.AggregateExecutableDevice" superTypes="mil.jpeojtrs.sca.cf.AggregateExecutableDeviceOperations mil.jpeojtrs.sca.cf.ExecutableDevice mil.jpeojtrs.sca.cf.AggregateDevice"
	 * @generated
	 */
	EClass getAggregateExecutableDevice();

	/**
	 * Returns the meta object for class '{@link CF.AggregateExecutableDeviceOperations <em>Aggregate Executable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Executable Device Operations</em>'.
	 * @see CF.AggregateExecutableDeviceOperations
	 * @model instanceClass="CF.AggregateExecutableDeviceOperations" superTypes="mil.jpeojtrs.sca.cf.ExecutableDeviceOperations mil.jpeojtrs.sca.cf.AggregateDeviceOperations"
	 * @generated
	 */
	EClass getAggregateExecutableDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.AggregateLoadableDevice <em>Aggregate Loadable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Loadable Device</em>'.
	 * @see CF.AggregateLoadableDevice
	 * @model instanceClass="CF.AggregateLoadableDevice" superTypes="mil.jpeojtrs.sca.cf.AggregateLoadableDeviceOperations mil.jpeojtrs.sca.cf.LoadableDevice mil.jpeojtrs.sca.cf.AggregateDevice"
	 * @generated
	 */
	EClass getAggregateLoadableDevice();

	/**
	 * Returns the meta object for class '{@link CF.AggregateLoadableDeviceOperations <em>Aggregate Loadable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Loadable Device Operations</em>'.
	 * @see CF.AggregateLoadableDeviceOperations
	 * @model instanceClass="CF.AggregateLoadableDeviceOperations" superTypes="mil.jpeojtrs.sca.cf.LoadableDeviceOperations mil.jpeojtrs.sca.cf.AggregateDeviceOperations"
	 * @generated
	 */
	EClass getAggregateLoadableDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.AggregatePlainDevice <em>Aggregate Plain Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Plain Device</em>'.
	 * @see CF.AggregatePlainDevice
	 * @model instanceClass="CF.AggregatePlainDevice" superTypes="mil.jpeojtrs.sca.cf.AggregatePlainDeviceOperations mil.jpeojtrs.sca.cf.Device mil.jpeojtrs.sca.cf.AggregateDevice"
	 * @generated
	 */
	EClass getAggregatePlainDevice();

	/**
	 * Returns the meta object for class '{@link CF.AggregatePlainDeviceOperations <em>Aggregate Plain Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Plain Device Operations</em>'.
	 * @see CF.AggregatePlainDeviceOperations
	 * @model instanceClass="CF.AggregatePlainDeviceOperations" superTypes="mil.jpeojtrs.sca.cf.DeviceOperations mil.jpeojtrs.sca.cf.AggregateDeviceOperations"
	 * @generated
	 */
	EClass getAggregatePlainDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.AllocationManager <em>Allocation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Manager</em>'.
	 * @see CF.AllocationManager
	 * @model instanceClass="CF.AllocationManager" superTypes="mil.jpeojtrs.sca.cf.AllocationManagerOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getAllocationManager();

	/**
	 * Returns the meta object for class '{@link CF.AllocationManagerOperations <em>Allocation Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Manager Operations</em>'.
	 * @see CF.AllocationManagerOperations
	 * @model instanceClass="CF.AllocationManagerOperations"
	 * @generated
	 */
	EClass getAllocationManagerOperations();

	/**
	 * Returns the meta object for class '{@link CF.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see CF.Application
	 * @model instanceClass="CF.Application" superTypes="mil.jpeojtrs.sca.cf.ApplicationOperations mil.jpeojtrs.sca.cf.Resource mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for class '{@link CF.ApplicationFactory <em>Application Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Factory</em>'.
	 * @see CF.ApplicationFactory
	 * @model instanceClass="CF.ApplicationFactory" superTypes="mil.jpeojtrs.sca.cf.ApplicationFactoryOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getApplicationFactory();

	/**
	 * Returns the meta object for class '{@link CF.ApplicationFactoryOperations <em>Application Factory Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Factory Operations</em>'.
	 * @see CF.ApplicationFactoryOperations
	 * @model instanceClass="CF.ApplicationFactoryOperations"
	 * @generated
	 */
	EClass getApplicationFactoryOperations();

	/**
	 * Returns the meta object for class '{@link CF.ApplicationOperations <em>Application Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Operations</em>'.
	 * @see CF.ApplicationOperations
	 * @model instanceClass="CF.ApplicationOperations" superTypes="mil.jpeojtrs.sca.cf.ResourceOperations"
	 * @generated
	 */
	EClass getApplicationOperations();

	/**
	 * Returns the meta object for class '{@link CF.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see CF.ConnectionManager
	 * @model instanceClass="CF.ConnectionManager" superTypes="mil.jpeojtrs.sca.cf.ConnectionManagerOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for class '{@link CF.ConnectionManagerOperations <em>Connection Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager Operations</em>'.
	 * @see CF.ConnectionManagerOperations
	 * @model instanceClass="CF.ConnectionManagerOperations"
	 * @generated
	 */
	EClass getConnectionManagerOperations();

	/**
	 * Returns the meta object for class '{@link CF.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see CF.Device
	 * @model instanceClass="CF.Device" superTypes="mil.jpeojtrs.sca.cf.DeviceOperations mil.jpeojtrs.sca.cf.Resource mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link CF.DeviceManager <em>Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Manager</em>'.
	 * @see CF.DeviceManager
	 * @model instanceClass="CF.DeviceManager" superTypes="mil.jpeojtrs.sca.cf.DeviceManagerOperations mil.jpeojtrs.sca.cf.PropertyEmitter mil.jpeojtrs.sca.cf.PortSet"
	 * @generated
	 */
	EClass getDeviceManager();

	/**
	 * Returns the meta object for class '{@link CF.DeviceManagerOperations <em>Device Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Manager Operations</em>'.
	 * @see CF.DeviceManagerOperations
	 * @model instanceClass="CF.DeviceManagerOperations" superTypes="mil.jpeojtrs.sca.cf.PropertyEmitterOperations mil.jpeojtrs.sca.cf.PortSetOperations"
	 * @generated
	 */
	EClass getDeviceManagerOperations();

	/**
	 * Returns the meta object for class '{@link CF.DeviceOperations <em>Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Operations</em>'.
	 * @see CF.DeviceOperations
	 * @model instanceClass="CF.DeviceOperations" superTypes="mil.jpeojtrs.sca.cf.ResourceOperations"
	 * @generated
	 */
	EClass getDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.DomainManager <em>Domain Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Manager</em>'.
	 * @see CF.DomainManager
	 * @model instanceClass="CF.DomainManager" superTypes="mil.jpeojtrs.sca.cf.DomainManagerOperations mil.jpeojtrs.sca.cf.PropertyEmitter mil.jpeojtrs.sca.cf.Logging mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getDomainManager();

	/**
	 * Returns the meta object for class '{@link CF.DomainManagerOperations <em>Domain Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Manager Operations</em>'.
	 * @see CF.DomainManagerOperations
	 * @model instanceClass="CF.DomainManagerOperations" superTypes="mil.jpeojtrs.sca.cf.PropertyEmitterOperations"
	 * @generated
	 */
	EClass getDomainManagerOperations();

	/**
	 * Returns the meta object for class '{@link CF.EventChannelManager <em>Event Channel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Channel Manager</em>'.
	 * @see CF.EventChannelManager
	 * @model instanceClass="CF.EventChannelManager" superTypes="mil.jpeojtrs.sca.cf.EventChannelManagerOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getEventChannelManager();

	/**
	 * Returns the meta object for class '{@link CF.EventChannelManagerOperations <em>Event Channel Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Channel Manager Operations</em>'.
	 * @see CF.EventChannelManagerOperations
	 * @model instanceClass="CF.EventChannelManagerOperations"
	 * @generated
	 */
	EClass getEventChannelManagerOperations();

	/**
	 * Returns the meta object for class '{@link CF.ExecutableDevice <em>Executable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Device</em>'.
	 * @see CF.ExecutableDevice
	 * @model instanceClass="CF.ExecutableDevice" superTypes="mil.jpeojtrs.sca.cf.ExecutableDeviceOperations mil.jpeojtrs.sca.cf.LoadableDevice mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getExecutableDevice();

	/**
	 * Returns the meta object for class '{@link CF.ExecutableDeviceOperations <em>Executable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Device Operations</em>'.
	 * @see CF.ExecutableDeviceOperations
	 * @model instanceClass="CF.ExecutableDeviceOperations" superTypes="mil.jpeojtrs.sca.cf.LoadableDeviceOperations"
	 * @generated
	 */
	EClass getExecutableDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see CF.File
	 * @model instanceClass="CF.File" superTypes="mil.jpeojtrs.sca.cf.FileOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link CF.FileManager <em>File Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Manager</em>'.
	 * @see CF.FileManager
	 * @model instanceClass="CF.FileManager" superTypes="mil.jpeojtrs.sca.cf.FileManagerOperations mil.jpeojtrs.sca.cf.FileSystem mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getFileManager();

	/**
	 * Returns the meta object for class '{@link CF.FileManagerOperations <em>File Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Manager Operations</em>'.
	 * @see CF.FileManagerOperations
	 * @model instanceClass="CF.FileManagerOperations" superTypes="mil.jpeojtrs.sca.cf.FileSystemOperations"
	 * @generated
	 */
	EClass getFileManagerOperations();

	/**
	 * Returns the meta object for class '{@link CF.FileOperations <em>File Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Operations</em>'.
	 * @see CF.FileOperations
	 * @model instanceClass="CF.FileOperations"
	 * @generated
	 */
	EClass getFileOperations();

	/**
	 * Returns the meta object for class '{@link CF.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see CF.FileSystem
	 * @model instanceClass="CF.FileSystem" superTypes="mil.jpeojtrs.sca.cf.FileSystemOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getFileSystem();

	/**
	 * Returns the meta object for class '{@link CF.FileSystemOperations <em>File System Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Operations</em>'.
	 * @see CF.FileSystemOperations
	 * @model instanceClass="CF.FileSystemOperations"
	 * @generated
	 */
	EClass getFileSystemOperations();

	/**
	 * Returns the meta object for class '{@link org.omg.CORBA.portable.IDLEntity <em>IDL Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Entity</em>'.
	 * @see org.omg.CORBA.portable.IDLEntity
	 * @model instanceClass="org.omg.CORBA.portable.IDLEntity"
	 * @generated
	 */
	EClass getIDLEntity();

	/**
	 * Returns the meta object for class '{@link CF.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle</em>'.
	 * @see CF.LifeCycle
	 * @model instanceClass="CF.LifeCycle" superTypes="mil.jpeojtrs.sca.cf.LifeCycleOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getLifeCycle();

	/**
	 * Returns the meta object for class '{@link CF.LifeCycleOperations <em>Life Cycle Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle Operations</em>'.
	 * @see CF.LifeCycleOperations
	 * @model instanceClass="CF.LifeCycleOperations"
	 * @generated
	 */
	EClass getLifeCycleOperations();

	/**
	 * Returns the meta object for class '{@link CF.LoadableDevice <em>Loadable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadable Device</em>'.
	 * @see CF.LoadableDevice
	 * @model instanceClass="CF.LoadableDevice" superTypes="mil.jpeojtrs.sca.cf.LoadableDeviceOperations mil.jpeojtrs.sca.cf.Device mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getLoadableDevice();

	/**
	 * Returns the meta object for class '{@link CF.LoadableDeviceOperations <em>Loadable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadable Device Operations</em>'.
	 * @see CF.LoadableDeviceOperations
	 * @model instanceClass="CF.LoadableDeviceOperations" superTypes="mil.jpeojtrs.sca.cf.DeviceOperations"
	 * @generated
	 */
	EClass getLoadableDeviceOperations();

	/**
	 * Returns the meta object for class '{@link CF.Logging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging</em>'.
	 * @see CF.Logging
	 * @model instanceClass="CF.Logging" superTypes="mil.jpeojtrs.sca.cf.LoggingOperations mil.jpeojtrs.sca.cf.LogEventConsumer mil.jpeojtrs.sca.cf.LogConfiguration"
	 * @generated
	 */
	EClass getLogging();

	/**
	 * Returns the meta object for class '{@link CF.LoggingOperations <em>Logging Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging Operations</em>'.
	 * @see CF.LoggingOperations
	 * @model instanceClass="CF.LoggingOperations" superTypes="mil.jpeojtrs.sca.cf.LogEventConsumerOperations mil.jpeojtrs.sca.cf.LogConfigurationOperations"
	 * @generated
	 */
	EClass getLoggingOperations();

	/**
	 * Returns the meta object for class '{@link CF.LogEventConsumer <em>Log Event Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Event Consumer</em>'.
	 * @see CF.LogEventConsumer
	 * @model instanceClass="CF.LogEventConsumer" superTypes="mil.jpeojtrs.sca.cf.LogEventConsumerOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getLogEventConsumer();

	/**
	 * Returns the meta object for class '{@link CF.LogEventConsumerOperations <em>Log Event Consumer Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Event Consumer Operations</em>'.
	 * @see CF.LogEventConsumerOperations
	 * @model instanceClass="CF.LogEventConsumerOperations"
	 * @generated
	 */
	EClass getLogEventConsumerOperations();

	/**
	 * Returns the meta object for class '{@link CF.LogConfiguration <em>Log Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Configuration</em>'.
	 * @see CF.LogConfiguration
	 * @model instanceClass="CF.LogConfiguration" superTypes="mil.jpeojtrs.sca.cf.LogConfigurationOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getLogConfiguration();

	/**
	 * Returns the meta object for class '{@link CF.LogConfigurationOperations <em>Log Configuration Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Configuration Operations</em>'.
	 * @see CF.LogConfigurationOperations
	 * @model instanceClass="CF.LogConfigurationOperations"
	 * @generated
	 */
	EClass getLogConfigurationOperations();

	/**
	 * Returns the meta object for class '{@link org.omg.CORBA.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.omg.CORBA.Object
	 * @model instanceClass="org.omg.CORBA.Object"
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link CF.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see CF.Port
	 * @model instanceClass="CF.Port" superTypes="mil.jpeojtrs.sca.cf.PortOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link CF.PortOperations <em>Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Operations</em>'.
	 * @see CF.PortOperations
	 * @model instanceClass="CF.PortOperations"
	 * @generated
	 */
	EClass getPortOperations();

	/**
	 * Returns the meta object for class '{@link CF.PortSet <em>Port Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Set</em>'.
	 * @see CF.PortSet
	 * @model instanceClass="CF.PortSet" superTypes="mil.jpeojtrs.sca.cf.PortSetOperations mil.jpeojtrs.sca.cf.PortSupplier mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getPortSet();

	/**
	 * Returns the meta object for class '{@link CF.PortSetOperations <em>Port Set Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Set Operations</em>'.
	 * @see CF.PortSetOperations
	 * @model instanceClass="CF.PortSetOperations"
	 * @generated
	 */
	EClass getPortSetOperations();

	/**
	 * Returns the meta object for class '{@link CF.PortSupplier <em>Port Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Supplier</em>'.
	 * @see CF.PortSupplier
	 * @model instanceClass="CF.PortSupplier" superTypes="mil.jpeojtrs.sca.cf.PortSupplierOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getPortSupplier();

	/**
	 * Returns the meta object for class '{@link CF.PortSupplierOperations <em>Port Supplier Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Supplier Operations</em>'.
	 * @see CF.PortSupplierOperations
	 * @model instanceClass="CF.PortSupplierOperations"
	 * @generated
	 */
	EClass getPortSupplierOperations();

	/**
	 * Returns the meta object for class '{@link CF.PropertyEmitter <em>Property Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Emitter</em>'.
	 * @see CF.PropertyEmitter
	 * @model instanceClass="CF.PropertyEmitter" superTypes="mil.jpeojtrs.sca.cf.PropertyEmitterOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getPropertyEmitter();

	/**
	 * Returns the meta object for class '{@link CF.PropertyEmitterOperations <em>Property Emitter Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Emitter Operations</em>'.
	 * @see CF.PropertyEmitterOperations
	 * @model instanceClass="CF.PropertyEmitterOperations" superTypes="mil.jpeojtrs.sca.cf.PropertySetOperations"
	 * @generated
	 */
	EClass getPropertyEmitterOperations();

	/**
	 * Returns the meta object for class '{@link CF.PropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Set</em>'.
	 * @see CF.PropertySet
	 * @model instanceClass="CF.PropertySet" superTypes="mil.jpeojtrs.sca.cf.PropertySetOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getPropertySet();

	/**
	 * Returns the meta object for class '{@link CF.PropertySetOperations <em>Property Set Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Set Operations</em>'.
	 * @see CF.PropertySetOperations
	 * @model instanceClass="CF.PropertySetOperations"
	 * @generated
	 */
	EClass getPropertySetOperations();

	/**
	 * Returns the meta object for class '{@link CF.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see CF.Resource
	 * @model instanceClass="CF.Resource" superTypes="mil.jpeojtrs.sca.cf.ResourceOperations mil.jpeojtrs.sca.cf.LifeCycle mil.jpeojtrs.sca.cf.TestableObject mil.jpeojtrs.sca.cf.PropertyEmitter mil.jpeojtrs.sca.cf.PortSet mil.jpeojtrs.sca.cf.Logging"
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link CF.ResourceFactory <em>Resource Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Factory</em>'.
	 * @see CF.ResourceFactory
	 * @model instanceClass="CF.ResourceFactory" superTypes="mil.jpeojtrs.sca.cf.ResourceFactoryOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getResourceFactory();

	/**
	 * Returns the meta object for class '{@link CF.ResourceFactoryOperations <em>Resource Factory Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Factory Operations</em>'.
	 * @see CF.ResourceFactoryOperations
	 * @model instanceClass="CF.ResourceFactoryOperations"
	 * @generated
	 */
	EClass getResourceFactoryOperations();

	/**
	 * Returns the meta object for class '{@link CF.ResourceOperations <em>Resource Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Operations</em>'.
	 * @see CF.ResourceOperations
	 * @model instanceClass="CF.ResourceOperations" superTypes="mil.jpeojtrs.sca.cf.LifeCycleOperations mil.jpeojtrs.sca.cf.TestableObjectOperations mil.jpeojtrs.sca.cf.PropertyEmitterOperations mil.jpeojtrs.sca.cf.PortSupplierOperations"
	 * @generated
	 */
	EClass getResourceOperations();

	/**
	 * Returns the meta object for class '{@link CF.TestableObject <em>Testable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testable Object</em>'.
	 * @see CF.TestableObject
	 * @model instanceClass="CF.TestableObject" superTypes="mil.jpeojtrs.sca.cf.TestableObjectOperations mil.jpeojtrs.sca.cf.Object mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getTestableObject();

	/**
	 * Returns the meta object for class '{@link CF.TestableObjectOperations <em>Testable Object Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testable Object Operations</em>'.
	 * @see CF.TestableObjectOperations
	 * @model instanceClass="CF.TestableObjectOperations"
	 * @generated
	 */
	EClass getTestableObjectOperations();

	/**
	 * Returns the meta object for data type '{@link CF.AllocationManagerPackage.AllocationStatusType <em>Allocation Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Allocation Status Type</em>'.
	 * @see CF.AllocationManagerPackage.AllocationStatusType
	 * @model instanceClass="CF.AllocationManagerPackage.AllocationStatusType"
	 * @generated
	 */
	EDataType getAllocationStatusType();

	/**
	 * Returns the meta object for data type '{@link CF.ApplicationFactoryPackage.CreateApplicationInsufficientCapacityError <em>Create Application Insufficient Capacity Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Application Insufficient Capacity Error</em>'.
	 * @see CF.ApplicationFactoryPackage.CreateApplicationInsufficientCapacityError
	 * @model instanceClass="CF.ApplicationFactoryPackage.CreateApplicationInsufficientCapacityError"
	 * @generated
	 */
	EDataType getCreateApplicationInsufficientCapacityError();

	/**
	 * Returns the meta object for data type '{@link CF.ApplicationFactoryPackage.CreateApplicationError <em>Create Application Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Application Error</em>'.
	 * @see CF.ApplicationFactoryPackage.CreateApplicationError
	 * @model instanceClass="CF.ApplicationFactoryPackage.CreateApplicationError"
	 * @generated
	 */
	EDataType getCreateApplicationError();

	/**
	 * Returns the meta object for data type '{@link CF.ApplicationFactoryPackage.CreateApplicationRequestError <em>Create Application Request Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Application Request Error</em>'.
	 * @see CF.ApplicationFactoryPackage.CreateApplicationRequestError
	 * @model instanceClass="CF.ApplicationFactoryPackage.CreateApplicationRequestError"
	 * @generated
	 */
	EDataType getCreateApplicationRequestError();

	/**
	 * Returns the meta object for data type '{@link CF.ApplicationFactoryPackage.InvalidInitConfiguration <em>Invalid Init Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Init Configuration</em>'.
	 * @see CF.ApplicationFactoryPackage.InvalidInitConfiguration
	 * @model instanceClass="CF.ApplicationFactoryPackage.InvalidInitConfiguration"
	 * @generated
	 */
	EDataType getInvalidInitConfiguration();

	/**
	 * Returns the meta object for data type '{@link CF.ConnectionManagerPackage.ConnectionStatusSequenceHolder <em>Connection Status Sequence Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connection Status Sequence Holder</em>'.
	 * @see CF.ConnectionManagerPackage.ConnectionStatusSequenceHolder
	 * @model instanceClass="CF.ConnectionManagerPackage.ConnectionStatusSequenceHolder" serializeable="false"
	 * @generated
	 */
	EDataType getConnectionStatusSequenceHolder();

	/**
	 * Returns the meta object for data type '{@link CF.ConnectionManagerPackage.ConnectionStatusType <em>Connection Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connection Status Type</em>'.
	 * @see CF.ConnectionManagerPackage.ConnectionStatusType
	 * @model instanceClass="CF.ConnectionManagerPackage.ConnectionStatusType" serializeable="false"
	 * @generated
	 */
	EDataType getConnectionStatusType();

	/**
	 * Returns the meta object for data type '<em>Connection Status Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connection Status Type Array</em>'.
	 * @model instanceClass="CF.ConnectionManagerPackage.ConnectionStatusType[]" serializeable="false"
	 * @generated
	 */
	EDataType getConnectionStatusTypeArray();

	/**
	 * Returns the meta object for data type '{@link CF.ConnectionManagerPackage.EndpointRequest <em>Endpoint Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endpoint Request</em>'.
	 * @see CF.ConnectionManagerPackage.EndpointRequest
	 * @model instanceClass="CF.ConnectionManagerPackage.EndpointRequest" serializeable="false"
	 * @generated
	 */
	EDataType getEndpointRequest();

	/**
	 * Returns the meta object for data type '{@link CF.ConnectionStatusIteratorHolder <em>Connection Status Iterator Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connection Status Iterator Holder</em>'.
	 * @see CF.ConnectionStatusIteratorHolder
	 * @model instanceClass="CF.ConnectionStatusIteratorHolder" serializeable="false"
	 * @generated
	 */
	EDataType getConnectionStatusIteratorHolder();

	/**
	 * Returns the meta object for data type '{@link CF.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type</em>'.
	 * @see CF.DataType
	 * @model instanceClass="CF.DataType"
	 *        extendedMetaData="name='DataType'"
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Returns the meta object for data type '<em>Data Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Array</em>'.
	 * @model instanceClass="CF.DataType[]"
	 *        extendedMetaData="name='DataTypeArray'"
	 * @generated
	 */
	EDataType getDataTypeArray();

	/**
	 * Returns the meta object for data type '<em>Device Assignment Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Assignment Type Array</em>'.
	 * @model instanceClass="CF.DeviceAssignmentType[]"
	 * @generated
	 */
	EDataType getDeviceAssignmentTypeArray();

	/**
	 * Returns the meta object for data type '{@link CF.DevicePackage.InvalidCapacity <em>Invalid Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Capacity</em>'.
	 * @see CF.DevicePackage.InvalidCapacity
	 * @model instanceClass="CF.DevicePackage.InvalidCapacity"
	 * @generated
	 */
	EDataType getInvalidCapacity();

	/**
	 * Returns the meta object for data type '{@link CF.DevicePackage.InvalidState <em>Invalid State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid State</em>'.
	 * @see CF.DevicePackage.InvalidState
	 * @model instanceClass="CF.DevicePackage.InvalidState"
	 * @generated
	 */
	EDataType getInvalidState();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.DeviceManagerNotRegistered <em>Device Manager Not Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Manager Not Registered</em>'.
	 * @see CF.DomainManagerPackage.DeviceManagerNotRegistered
	 * @model instanceClass="CF.DomainManagerPackage.DeviceManagerNotRegistered"
	 * @generated
	 */
	EDataType getDeviceManagerNotRegistered();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.RegisterError <em>Register Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Register Error</em>'.
	 * @see CF.DomainManagerPackage.RegisterError
	 * @model instanceClass="CF.DomainManagerPackage.RegisterError"
	 * @generated
	 */
	EDataType getRegisterError();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.UnregisterError <em>Unregister Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unregister Error</em>'.
	 * @see CF.DomainManagerPackage.UnregisterError
	 * @model instanceClass="CF.DomainManagerPackage.UnregisterError"
	 * @generated
	 */
	EDataType getUnregisterError();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.ApplicationInstallationError <em>Application Installation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Application Installation Error</em>'.
	 * @see CF.DomainManagerPackage.ApplicationInstallationError
	 * @model instanceClass="CF.DomainManagerPackage.ApplicationInstallationError"
	 * @generated
	 */
	EDataType getApplicationInstallationError();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.ApplicationAlreadyInstalled <em>Application Already Installed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Application Already Installed</em>'.
	 * @see CF.DomainManagerPackage.ApplicationAlreadyInstalled
	 * @model instanceClass="CF.DomainManagerPackage.ApplicationAlreadyInstalled"
	 * @generated
	 */
	EDataType getApplicationAlreadyInstalled();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.InvalidIdentifier <em>Invalid Dom Mgr Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Dom Mgr Identifier</em>'.
	 * @see CF.DomainManagerPackage.InvalidIdentifier
	 * @model instanceClass="CF.DomainManagerPackage.InvalidIdentifier"
	 * @generated
	 */
	EDataType getInvalidDomMgrIdentifier();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.ApplicationUninstallationError <em>Application Uninstallation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Application Uninstallation Error</em>'.
	 * @see CF.DomainManagerPackage.ApplicationUninstallationError
	 * @model instanceClass="CF.DomainManagerPackage.ApplicationUninstallationError"
	 * @generated
	 */
	EDataType getApplicationUninstallationError();

	/**
	 * Returns the meta object for data type '{@link CF.DevicePackage.InsufficientCapacity <em>Insufficient Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Insufficient Capacity</em>'.
	 * @see CF.DevicePackage.InsufficientCapacity
	 * @model instanceClass="CF.DevicePackage.InsufficientCapacity" serializeable="false"
	 * @generated
	 */
	EDataType getInsufficientCapacity();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.InvalidEventChannelName <em>Invalid Event Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Event Channel Name</em>'.
	 * @see CF.DomainManagerPackage.InvalidEventChannelName
	 * @model instanceClass="CF.DomainManagerPackage.InvalidEventChannelName"
	 * @generated
	 */
	EDataType getInvalidEventChannelName();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.AlreadyConnected <em>Already Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Already Connected</em>'.
	 * @see CF.DomainManagerPackage.AlreadyConnected
	 * @model instanceClass="CF.DomainManagerPackage.AlreadyConnected"
	 * @generated
	 */
	EDataType getAlreadyConnected();

	/**
	 * Returns the meta object for data type '{@link CF.DomainManagerPackage.NotConnected <em>Not Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Not Connected</em>'.
	 * @see CF.DomainManagerPackage.NotConnected
	 * @model instanceClass="CF.DomainManagerPackage.NotConnected"
	 * @generated
	 */
	EDataType getNotConnected();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelInfoIteratorHolder <em>Event Channel Info Iterator Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Channel Info Iterator Holder</em>'.
	 * @see CF.EventChannelInfoIteratorHolder
	 * @model instanceClass="CF.EventChannelInfoIteratorHolder"
	 * @generated
	 */
	EDataType getEventChannelInfoIteratorHolder();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.ChannelAlreadyExists <em>Channel Already Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel Already Exists</em>'.
	 * @see CF.EventChannelManagerPackage.ChannelAlreadyExists
	 * @model instanceClass="CF.EventChannelManagerPackage.ChannelAlreadyExists"
	 * @generated
	 */
	EDataType getChannelAlreadyExists();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.ChannelDoesNotExist <em>Channel Does Not Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel Does Not Exist</em>'.
	 * @see CF.EventChannelManagerPackage.ChannelDoesNotExist
	 * @model instanceClass="CF.EventChannelManagerPackage.ChannelDoesNotExist"
	 * @generated
	 */
	EDataType getChannelDoesNotExist();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.EventChannelInfoListHolder <em>Event Channel Info List Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Channel Info List Holder</em>'.
	 * @see CF.EventChannelManagerPackage.EventChannelInfoListHolder
	 * @model instanceClass="CF.EventChannelManagerPackage.EventChannelInfoListHolder"
	 * @generated
	 */
	EDataType getEventChannelInfoListHolder();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.EventChannelReg <em>Event Channel Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Channel Reg</em>'.
	 * @see CF.EventChannelManagerPackage.EventChannelReg
	 * @model instanceClass="CF.EventChannelManagerPackage.EventChannelReg"
	 * @generated
	 */
	EDataType getEventChannelReg();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.EventRegistration <em>Event Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Registration</em>'.
	 * @see CF.EventChannelManagerPackage.EventRegistration
	 * @model instanceClass="CF.EventChannelManagerPackage.EventRegistration"
	 * @generated
	 */
	EDataType getEventRegistration();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.EventRegistrantListHolder <em>Event Registrant List Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Registrant List Holder</em>'.
	 * @see CF.EventChannelManagerPackage.EventRegistrantListHolder
	 * @model instanceClass="CF.EventChannelManagerPackage.EventRegistrantListHolder"
	 * @generated
	 */
	EDataType getEventRegistrantListHolder();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.InvalidChannelName <em>Invalid Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Channel Name</em>'.
	 * @see CF.EventChannelManagerPackage.InvalidChannelName
	 * @model instanceClass="CF.EventChannelManagerPackage.InvalidChannelName"
	 * @generated
	 */
	EDataType getInvalidChannelName();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.OperationFailed <em>Operation Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Failed</em>'.
	 * @see CF.EventChannelManagerPackage.OperationFailed
	 * @model instanceClass="CF.EventChannelManagerPackage.OperationFailed"
	 * @generated
	 */
	EDataType getOperationFailed();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.OperationNotAllowed <em>Operation Not Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Not Allowed</em>'.
	 * @see CF.EventChannelManagerPackage.OperationNotAllowed
	 * @model instanceClass="CF.EventChannelManagerPackage.OperationNotAllowed"
	 * @generated
	 */
	EDataType getOperationNotAllowed();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.PublisherReg <em>Publisher Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publisher Reg</em>'.
	 * @see CF.EventChannelManagerPackage.PublisherReg
	 * @model instanceClass="CF.EventChannelManagerPackage.PublisherReg"
	 * @generated
	 */
	EDataType getPublisherReg();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.RegistrationAlreadyExists <em>Registration Already Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registration Already Exists</em>'.
	 * @see CF.EventChannelManagerPackage.RegistrationAlreadyExists
	 * @model instanceClass="CF.EventChannelManagerPackage.RegistrationAlreadyExists"
	 * @generated
	 */
	EDataType getRegistrationAlreadyExists();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.RegistrationDoesNotExist <em>Registration Does Not Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registration Does Not Exist</em>'.
	 * @see CF.EventChannelManagerPackage.RegistrationDoesNotExist
	 * @model instanceClass="CF.EventChannelManagerPackage.RegistrationDoesNotExist"
	 * @generated
	 */
	EDataType getRegistrationDoesNotExist();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.RegistrationsExists <em>Registrations Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registrations Exists</em>'.
	 * @see CF.EventChannelManagerPackage.RegistrationsExists
	 * @model instanceClass="CF.EventChannelManagerPackage.RegistrationsExists"
	 * @generated
	 */
	EDataType getRegistrationsExists();

	/**
	 * Returns the meta object for data type '{@link CF.EventChannelManagerPackage.ServiceUnavailable <em>Service Unavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Unavailable</em>'.
	 * @see CF.EventChannelManagerPackage.ServiceUnavailable
	 * @model instanceClass="CF.EventChannelManagerPackage.ServiceUnavailable"
	 * @generated
	 */
	EDataType getServiceUnavailable();

	/**
	 * Returns the meta object for data type '{@link CF.EventRegistrantIteratorHolder <em>Event Registrant Iterator Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Registrant Iterator Holder</em>'.
	 * @see CF.EventRegistrantIteratorHolder
	 * @model instanceClass="CF.EventRegistrantIteratorHolder"
	 * @generated
	 */
	EDataType getEventRegistrantIteratorHolder();

	/**
	 * Returns the meta object for data type '{@link CF.ExecutableDevicePackage.InvalidProcess <em>Invalid Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Process</em>'.
	 * @see CF.ExecutableDevicePackage.InvalidProcess
	 * @model instanceClass="CF.ExecutableDevicePackage.InvalidProcess"
	 * @generated
	 */
	EDataType getInvalidProcess();

	/**
	 * Returns the meta object for data type '{@link CF.ExecutableDevicePackage.InvalidFunction <em>Invalid Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Function</em>'.
	 * @see CF.ExecutableDevicePackage.InvalidFunction
	 * @model instanceClass="CF.ExecutableDevicePackage.InvalidFunction"
	 * @generated
	 */
	EDataType getInvalidFunction();

	/**
	 * Returns the meta object for data type '{@link CF.ExecutableDevicePackage.InvalidParameters <em>Invalid Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Parameters</em>'.
	 * @see CF.ExecutableDevicePackage.InvalidParameters
	 * @model instanceClass="CF.ExecutableDevicePackage.InvalidParameters"
	 * @generated
	 */
	EDataType getInvalidParameters();

	/**
	 * Returns the meta object for data type '{@link CF.ExecutableDevicePackage.InvalidOptions <em>Invalid Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Options</em>'.
	 * @see CF.ExecutableDevicePackage.InvalidOptions
	 * @model instanceClass="CF.ExecutableDevicePackage.InvalidOptions"
	 * @generated
	 */
	EDataType getInvalidOptions();

	/**
	 * Returns the meta object for data type '{@link CF.ExecutableDevicePackage.ExecuteFail <em>Execute Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Execute Fail</em>'.
	 * @see CF.ExecutableDevicePackage.ExecuteFail
	 * @model instanceClass="CF.ExecutableDevicePackage.ExecuteFail"
	 * @generated
	 */
	EDataType getExecuteFail();

	/**
	 * Returns the meta object for data type '{@link CF.FileManagerPackage.InvalidFileSystem <em>Invalid File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid File System</em>'.
	 * @see CF.FileManagerPackage.InvalidFileSystem
	 * @model instanceClass="CF.FileManagerPackage.InvalidFileSystem"
	 * @generated
	 */
	EDataType getInvalidFileSystem();

	/**
	 * Returns the meta object for data type '{@link CF.FileManagerPackage.MountPointAlreadyExists <em>Mount Point Already Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mount Point Already Exists</em>'.
	 * @see CF.FileManagerPackage.MountPointAlreadyExists
	 * @model instanceClass="CF.FileManagerPackage.MountPointAlreadyExists"
	 * @generated
	 */
	EDataType getMountPointAlreadyExists();

	/**
	 * Returns the meta object for data type '{@link CF.FileManagerPackage.NonExistentMount <em>Non Existent Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Existent Mount</em>'.
	 * @see CF.FileManagerPackage.NonExistentMount
	 * @model instanceClass="CF.FileManagerPackage.NonExistentMount"
	 * @generated
	 */
	EDataType getNonExistentMount();

	/**
	 * Returns the meta object for data type '<em>Mount Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mount Type Array</em>'.
	 * @model instanceClass="CF.FileManagerPackage.MountType[]"
	 * @generated
	 */
	EDataType getMountTypeArray();

	/**
	 * Returns the meta object for data type '{@link CF.FilePackage.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see CF.FilePackage.IOException
	 * @model instanceClass="CF.FilePackage.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link CF.FileException <em>File Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File Exception</em>'.
	 * @see CF.FileException
	 * @model instanceClass="CF.FileException"
	 * @generated
	 */
	EDataType getFileException();

	/**
	 * Returns the meta object for data type '{@link CF.FilePackage.InvalidFilePointer <em>Invalid File Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid File Pointer</em>'.
	 * @see CF.FilePackage.InvalidFilePointer
	 * @model instanceClass="CF.FilePackage.InvalidFilePointer"
	 * @generated
	 */
	EDataType getInvalidFilePointer();

	/**
	 * Returns the meta object for data type '<em>File Information Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File Information Type Array</em>'.
	 * @model instanceClass="CF.FileSystemPackage.FileInformationType[]"
	 * @generated
	 */
	EDataType getFileInformationTypeArray();

	/**
	 * Returns the meta object for data type '{@link CF.FileSystemPackage.UnknownFileSystemProperties <em>Unknown File System Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unknown File System Properties</em>'.
	 * @see CF.FileSystemPackage.UnknownFileSystemProperties
	 * @model instanceClass="CF.FileSystemPackage.UnknownFileSystemProperties"
	 * @generated
	 */
	EDataType getUnknownFileSystemProperties();

	/**
	 * Returns the meta object for data type '{@link CF.InvalidFileName <em>Invalid File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid File Name</em>'.
	 * @see CF.InvalidFileName
	 * @model instanceClass="CF.InvalidFileName"
	 * @generated
	 */
	EDataType getInvalidFileName();

	/**
	 * Returns the meta object for data type '{@link CF.InvalidIdentifier <em>Invalid Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Identifier</em>'.
	 * @see CF.InvalidIdentifier
	 * @model instanceClass="CF.InvalidIdentifier"
	 * @generated
	 */
	EDataType getInvalidIdentifier();

	/**
	 * Returns the meta object for data type '{@link CF.InvalidObjectReference <em>Invalid Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Object Reference</em>'.
	 * @see CF.InvalidObjectReference
	 * @model instanceClass="CF.InvalidObjectReference"
	 * @generated
	 */
	EDataType getInvalidObjectReference();

	/**
	 * Returns the meta object for data type '{@link CF.InvalidProfile <em>Invalid Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Profile</em>'.
	 * @see CF.InvalidProfile
	 * @model instanceClass="CF.InvalidProfile"
	 * @generated
	 */
	EDataType getInvalidProfile();

	/**
	 * Returns the meta object for data type '{@link CF.LifeCyclePackage.InitializeError <em>Initialize Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Initialize Error</em>'.
	 * @see CF.LifeCyclePackage.InitializeError
	 * @model instanceClass="CF.LifeCyclePackage.InitializeError"
	 * @generated
	 */
	EDataType getInitializeError();

	/**
	 * Returns the meta object for data type '{@link CF.LifeCyclePackage.ReleaseError <em>Release Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Release Error</em>'.
	 * @see CF.LifeCyclePackage.ReleaseError
	 * @model instanceClass="CF.LifeCyclePackage.ReleaseError"
	 * @generated
	 */
	EDataType getReleaseError();

	/**
	 * Returns the meta object for data type '{@link CF.LoadableDevicePackage.LoadType <em>Load Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Load Type</em>'.
	 * @see CF.LoadableDevicePackage.LoadType
	 * @model instanceClass="CF.LoadableDevicePackage.LoadType"
	 * @generated
	 */
	EDataType getLoadType();

	/**
	 * Returns the meta object for data type '{@link CF.LoadableDevicePackage.InvalidLoadKind <em>Invalid Load Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Load Kind</em>'.
	 * @see CF.LoadableDevicePackage.InvalidLoadKind
	 * @model instanceClass="CF.LoadableDevicePackage.InvalidLoadKind"
	 * @generated
	 */
	EDataType getInvalidLoadKind();

	/**
	 * Returns the meta object for data type '{@link CF.LoadableDevicePackage.LoadFail <em>Load Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Load Fail</em>'.
	 * @see CF.LoadableDevicePackage.LoadFail
	 * @model instanceClass="CF.LoadableDevicePackage.LoadFail"
	 * @generated
	 */
	EDataType getLoadFail();

	/**
	 * Returns the meta object for data type '<em>Log Event Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Log Event Array</em>'.
	 * @model instanceClass="CF.LogEvent[]"
	 * @generated
	 */
	EDataType getLogEventArray();

	/**
	 * Returns the meta object for data type '{@link CF.OctetSequenceHolder <em>Octet Sequence Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Octet Sequence Holder</em>'.
	 * @see CF.OctetSequenceHolder
	 * @model instanceClass="CF.OctetSequenceHolder"
	 * @generated
	 */
	EDataType getOctetSequenceHolder();

	/**
	 * Returns the meta object for data type '{@link CF.PortPackage.InvalidPort <em>Invalid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Port</em>'.
	 * @see CF.PortPackage.InvalidPort
	 * @model instanceClass="CF.PortPackage.InvalidPort"
	 * @generated
	 */
	EDataType getInvalidPort();

	/**
	 * Returns the meta object for data type '{@link CF.PortPackage.OccupiedPort <em>Occupied Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Occupied Port</em>'.
	 * @see CF.PortPackage.OccupiedPort
	 * @model instanceClass="CF.PortPackage.OccupiedPort"
	 * @generated
	 */
	EDataType getOccupiedPort();

	/**
	 * Returns the meta object for data type '{@link CF.PortSetPackage.PortInfoType <em>Port Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Info Type</em>'.
	 * @see CF.PortSetPackage.PortInfoType
	 * @model instanceClass="CF.PortSetPackage.PortInfoType"
	 * @generated
	 */
	EDataType getPortInfoType();

	/**
	 * Returns the meta object for data type '{@link CF.PortSupplierPackage.UnknownPort <em>Unknown Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unknown Port</em>'.
	 * @see CF.PortSupplierPackage.UnknownPort
	 * @model instanceClass="CF.PortSupplierPackage.UnknownPort"
	 * @generated
	 */
	EDataType getUnknownPort();

	/**
	 * Returns the meta object for data type '{@link CF.PropertiesHolder <em>Properties Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Properties Holder</em>'.
	 * @see CF.PropertiesHolder
	 * @model instanceClass="CF.PropertiesHolder"
	 * @generated
	 */
	EDataType getPropertiesHolder();

	/**
	 * Returns the meta object for data type '{@link CF.PropertyChangeListenerPackage.PropertyChangeEvent <em>Property Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Event</em>'.
	 * @see CF.PropertyChangeListenerPackage.PropertyChangeEvent
	 * @model instanceClass="CF.PropertyChangeListenerPackage.PropertyChangeEvent"
	 * @generated
	 */
	EDataType getPropertyChangeEvent();

	/**
	 * Returns the meta object for data type '{@link CF.PropertyEmitterPackage.AlreadyInitialized <em>Already Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Already Initialized</em>'.
	 * @see CF.PropertyEmitterPackage.AlreadyInitialized
	 * @model instanceClass="CF.PropertyEmitterPackage.AlreadyInitialized"
	 * @generated
	 */
	EDataType getAlreadyInitialized();

	/**
	 * Returns the meta object for data type '{@link CF.PropertySetPackage.InvalidConfiguration <em>Invalid Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Configuration</em>'.
	 * @see CF.PropertySetPackage.InvalidConfiguration
	 * @model instanceClass="CF.PropertySetPackage.InvalidConfiguration"
	 * @generated
	 */
	EDataType getInvalidConfiguration();

	/**
	 * Returns the meta object for data type '{@link CF.PropertySetPackage.PartialConfiguration <em>Partial Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Partial Configuration</em>'.
	 * @see CF.PropertySetPackage.PartialConfiguration
	 * @model instanceClass="CF.PropertySetPackage.PartialConfiguration"
	 * @generated
	 */
	EDataType getPartialConfiguration();

	/**
	 * Returns the meta object for data type '{@link CF.UnknownProperties <em>Unknown Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unknown Properties</em>'.
	 * @see CF.UnknownProperties
	 * @model instanceClass="CF.UnknownProperties"
	 * @generated
	 */
	EDataType getUnknownProperties();

	/**
	 * Returns the meta object for data type '{@link CF.ResourceFactoryPackage.CreateResourceFailure <em>Create Resource Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Resource Failure</em>'.
	 * @see CF.ResourceFactoryPackage.CreateResourceFailure
	 * @model instanceClass="CF.ResourceFactoryPackage.CreateResourceFailure"
	 * @generated
	 */
	EDataType getCreateResourceFailure();

	/**
	 * Returns the meta object for data type '{@link CF.ResourceFactoryPackage.InvalidResourceId <em>Invalid Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Resource Id</em>'.
	 * @see CF.ResourceFactoryPackage.InvalidResourceId
	 * @model instanceClass="CF.ResourceFactoryPackage.InvalidResourceId"
	 * @generated
	 */
	EDataType getInvalidResourceId();

	/**
	 * Returns the meta object for data type '{@link CF.ResourceFactoryPackage.ShutdownFailure <em>Shutdown Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shutdown Failure</em>'.
	 * @see CF.ResourceFactoryPackage.ShutdownFailure
	 * @model instanceClass="CF.ResourceFactoryPackage.ShutdownFailure"
	 * @generated
	 */
	EDataType getShutdownFailure();

	/**
	 * Returns the meta object for data type '{@link CF.ResourcePackage.StartError <em>Start Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Start Error</em>'.
	 * @see CF.ResourcePackage.StartError
	 * @model instanceClass="CF.ResourcePackage.StartError"
	 * @generated
	 */
	EDataType getStartError();

	/**
	 * Returns the meta object for data type '{@link CF.ResourcePackage.StopError <em>Stop Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stop Error</em>'.
	 * @see CF.ResourcePackage.StopError
	 * @model instanceClass="CF.ResourcePackage.StopError"
	 * @generated
	 */
	EDataType getStopError();

	/**
	 * Returns the meta object for data type '{@link CF.TestableObjectPackage.UnknownTest <em>Unknown Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unknown Test</em>'.
	 * @see CF.TestableObjectPackage.UnknownTest
	 * @model instanceClass="CF.TestableObjectPackage.UnknownTest"
	 * @generated
	 */
	EDataType getUnknownTest();

	/**
	 * Returns the meta object for data type '{@link CF.UnknownIdentifier <em>Unknown Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unknown Identifier</em>'.
	 * @see CF.UnknownIdentifier
	 * @model instanceClass="CF.UnknownIdentifier"
	 * @generated
	 */
	EDataType getUnknownIdentifier();

	/**
	 * Returns the meta object for data type '{@link CF.UTCTime <em>UTC Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UTC Time</em>'.
	 * @see CF.UTCTime
	 * @model instanceClass="CF.UTCTime"
	 * @generated
	 */
	EDataType getUTCTime();

	/**
	 * Returns the meta object for data type '{@link org.omg.CORBA.ORB <em>ORB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ORB</em>'.
	 * @see org.omg.CORBA.ORB
	 * @model instanceClass="org.omg.CORBA.ORB"
	 *        extendedMetaData="name='ORB'"
	 * @generated
	 */
	EDataType getORB();

	/**
	 * Returns the meta object for data type '{@link org.omg.CosEventChannelAdmin.EventChannel <em>Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Channel</em>'.
	 * @see org.omg.CosEventChannelAdmin.EventChannel
	 * @model instanceClass="org.omg.CosEventChannelAdmin.EventChannel"
	 * @generated
	 */
	EDataType getEventChannel();

	/**
	 * Returns the meta object for data type '{@link org.omg.CosEventComm.PushConsumer <em>Push Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Push Consumer</em>'.
	 * @see org.omg.CosEventComm.PushConsumer
	 * @model instanceClass="org.omg.CosEventComm.PushConsumer"
	 * @generated
	 */
	EDataType getPushConsumer();

	/**
	 * Returns the meta object for data type '{@link org.omg.CosEventComm.PushSupplier <em>Push Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Push Supplier</em>'.
	 * @see org.omg.CosEventComm.PushSupplier
	 * @model instanceClass="org.omg.CosEventComm.PushSupplier"
	 * @generated
	 */
	EDataType getPushSupplier();

	/**
	 * Returns the meta object for data type '{@link org.omg.CosNaming.NamingContextExt <em>Naming Context Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Naming Context Ext</em>'.
	 * @see org.omg.CosNaming.NamingContextExt
	 * @model instanceClass="org.omg.CosNaming.NamingContextExt"
	 *        extendedMetaData="name='NamingContextExt'"
	 * @generated
	 */
	EDataType getNamingContextExt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CfFactory getCfFactory();

} //CfPackage
