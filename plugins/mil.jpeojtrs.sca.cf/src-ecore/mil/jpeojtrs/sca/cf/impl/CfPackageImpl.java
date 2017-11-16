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
package mil.jpeojtrs.sca.cf.impl;

import mil.jpeojtrs.sca.cf.CfFactory;
import mil.jpeojtrs.sca.cf.CfPackage;
import mil.jpeojtrs.sca.cf.extended.ExtendedPackage;
import mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.omg.CORBA.portable.IDLEntity;
import org.omg.CosEventChannelAdmin.EventChannel;
import org.omg.CosEventComm.PushConsumer;
import org.omg.CosEventComm.PushSupplier;
import org.omg.CosNaming.NamingContextExt;

import CF.AggregateDevice;
import CF.AggregateDeviceOperations;
import CF.AggregateExecutableDevice;
import CF.AggregateExecutableDeviceOperations;
import CF.AggregateLoadableDevice;
import CF.AggregateLoadableDeviceOperations;
import CF.AggregatePlainDevice;
import CF.AggregatePlainDeviceOperations;
import CF.AllocationManager;
import CF.AllocationManagerOperations;
import CF.AllocationManagerPackage.AllocationStatusType;
import CF.Application;
import CF.ApplicationFactory;
import CF.ApplicationFactoryOperations;
import CF.ApplicationOperations;
import CF.ConnectionManager;
import CF.ConnectionManagerOperations;
import CF.ConnectionManagerPackage.ConnectionStatusSequenceHolder;
import CF.ConnectionManagerPackage.ConnectionStatusType;
import CF.ConnectionManagerPackage.EndpointRequest;
import CF.ConnectionStatusIteratorHolder;
import CF.DataType;
import CF.Device;
import CF.DeviceAssignmentType;
import CF.DeviceManager;
import CF.DeviceManagerOperations;
import CF.DeviceOperations;
import CF.DomainManager;
import CF.DomainManagerOperations;
import CF.ExecutableDevice;
import CF.ExecutableDeviceOperations;
import CF.File;
import CF.FileException;
import CF.FileManager;
import CF.FileManagerOperations;
import CF.FileOperations;
import CF.FileSystem;
import CF.FileSystemOperations;
import CF.InvalidFileName;
import CF.InvalidObjectReference;
import CF.InvalidProfile;
import CF.LifeCycle;
import CF.LifeCycleOperations;
import CF.LoadableDevice;
import CF.LoadableDeviceOperations;
import CF.OctetSequenceHolder;
import CF.Port;
import CF.PortOperations;
import CF.PortSupplier;
import CF.PortSupplierOperations;
import CF.PropertiesHolder;
import CF.PropertyChangeListenerPackage.PropertyChangeEvent;
import CF.PropertyEmitter;
import CF.PropertyEmitterOperations;
import CF.PropertyEmitterPackage.AlreadyInitialized;
import CF.PropertySet;
import CF.PropertySetOperations;
import CF.Resource;
import CF.ResourceFactory;
import CF.ResourceFactoryOperations;
import CF.ResourceOperations;
import CF.TestableObject;
import CF.TestableObjectOperations;
import CF.UnknownProperties;
import CF.ApplicationFactoryPackage.CreateApplicationError;
import CF.ApplicationFactoryPackage.CreateApplicationInsufficientCapacityError;
import CF.ApplicationFactoryPackage.CreateApplicationRequestError;
import CF.ApplicationFactoryPackage.InvalidInitConfiguration;
import CF.DevicePackage.InsufficientCapacity;
import CF.DevicePackage.InvalidCapacity;
import CF.DevicePackage.InvalidState;
import CF.DomainManagerPackage.AlreadyConnected;
import CF.DomainManagerPackage.ApplicationAlreadyInstalled;
import CF.DomainManagerPackage.ApplicationInstallationError;
import CF.DomainManagerPackage.ApplicationUninstallationError;
import CF.DomainManagerPackage.DeviceManagerNotRegistered;
import CF.DomainManagerPackage.InvalidEventChannelName;
import CF.DomainManagerPackage.InvalidIdentifier;
import CF.DomainManagerPackage.NotConnected;
import CF.DomainManagerPackage.RegisterError;
import CF.DomainManagerPackage.UnregisterError;
import CF.EventChannelInfoIteratorHolder;
import CF.EventChannelManager;
import CF.EventChannelManagerOperations;
import CF.EventChannelManagerPackage.ChannelAlreadyExists;
import CF.EventChannelManagerPackage.ChannelDoesNotExist;
import CF.EventChannelManagerPackage.EventChannelInfoListHolder;
import CF.EventChannelManagerPackage.EventChannelReg;
import CF.EventChannelManagerPackage.EventRegistrantListHolder;
import CF.EventChannelManagerPackage.EventRegistration;
import CF.EventChannelManagerPackage.InvalidChannelName;
import CF.EventChannelManagerPackage.OperationFailed;
import CF.EventChannelManagerPackage.OperationNotAllowed;
import CF.EventChannelManagerPackage.RegistrationAlreadyExists;
import CF.EventChannelManagerPackage.RegistrationDoesNotExist;
import CF.EventChannelManagerPackage.RegistrationsExists;
import CF.EventChannelManagerPackage.ServiceUnavailable;
import CF.EventRegistrantIteratorHolder;
import CF.ExecutableDevicePackage.ExecuteFail;
import CF.ExecutableDevicePackage.InvalidFunction;
import CF.ExecutableDevicePackage.InvalidOptions;
import CF.ExecutableDevicePackage.InvalidParameters;
import CF.ExecutableDevicePackage.InvalidProcess;
import CF.FileManagerPackage.InvalidFileSystem;
import CF.FileManagerPackage.MountPointAlreadyExists;
import CF.FileManagerPackage.MountType;
import CF.FileManagerPackage.NonExistentMount;
import CF.FilePackage.IOException;
import CF.FilePackage.InvalidFilePointer;
import CF.FileSystemPackage.FileInformationType;
import CF.FileSystemPackage.UnknownFileSystemProperties;
import CF.LifeCyclePackage.InitializeError;
import CF.LifeCyclePackage.ReleaseError;
import CF.LoadableDevicePackage.InvalidLoadKind;
import CF.LoadableDevicePackage.LoadFail;
import CF.LoadableDevicePackage.LoadType;
import CF.LogConfiguration;
import CF.LogConfigurationOperations;
import CF.LogEvent;
import CF.LogEventConsumer;
import CF.LogEventConsumerOperations;
import CF.Logging;
import CF.LoggingOperations;
import CF.PortPackage.InvalidPort;
import CF.PortPackage.OccupiedPort;
import CF.PortSet;
import CF.PortSetOperations;
import CF.PortSetPackage.PortInfoType;
import CF.PortSupplierPackage.UnknownPort;
import CF.PropertySetPackage.InvalidConfiguration;
import CF.PropertySetPackage.PartialConfiguration;
import CF.ResourceFactoryPackage.CreateResourceFailure;
import CF.ResourceFactoryPackage.InvalidResourceId;
import CF.ResourceFactoryPackage.ShutdownFailure;
import CF.ResourcePackage.StartError;
import CF.ResourcePackage.StopError;
import CF.TestableObjectPackage.UnknownTest;
import CF.UnknownIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfPackageImpl extends EPackageImpl implements CfPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlEntityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateDeviceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExecutableDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExecutableDeviceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateLoadableDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateLoadableDeviceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatePlainDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatePlainDeviceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationManagerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationFactoryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationFactoryOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceOperationsEClass = null;
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
	private EClass domainManagerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChannelManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChannelManagerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableDeviceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileManagerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadableDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadableDeviceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEventConsumerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEventConsumerOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logConfigurationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logConfigurationOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSetOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSupplierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSupplierOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEmitterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEmitterOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySetOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceFactoryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceFactoryOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testableObjectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testableObjectOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypeEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypeArrayEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namingContextExtEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orbEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allocationStatusTypeEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidObjectReferenceEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType createApplicationInsufficientCapacityErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceAssignmentTypeArrayEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType createApplicationErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType createApplicationRequestErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidInitConfigurationEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionStatusSequenceHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionStatusTypeEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionStatusTypeArrayEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endpointRequestEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionStatusIteratorHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidCapacityEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidStateEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidProfileEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceManagerNotRegisteredEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registerErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unregisterErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidFileNameEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationInstallationErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationAlreadyInstalledEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidDomMgrIdentifierEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidIdentifierEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationUninstallationErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType insufficientCapacityEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidEventChannelNameEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alreadyConnectedEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType notConnectedEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventChannelInfoIteratorHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelAlreadyExistsEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelDoesNotExistEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventChannelInfoListHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventChannelRegEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventRegistrationEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventRegistrantListHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidChannelNameEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationFailedEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationNotAllowedEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registrationAlreadyExistsEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registrationDoesNotExistEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registrationsExistsEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceUnavailableEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventRegistrantIteratorHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidProcessEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidFunctionEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidParametersEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidOptionsEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executeFailEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidFileSystemEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mountPointAlreadyExistsEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonExistentMountEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mountTypeArrayEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType octetSequenceHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileExceptionEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidFilePointerEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileInformationTypeArrayEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertiesHolderEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeEventEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unknownFileSystemPropertiesEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType initializeErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType releaseErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType loadTypeEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidLoadKindEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType loadFailEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidPortEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType occupiedPortEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portInfoTypeEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unknownPortEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alreadyInitializedEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidConfigurationEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partialConfigurationEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unknownPropertiesEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType createResourceFailureEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidResourceIdEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shutdownFailureEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType startErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stopErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unknownTestEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unknownIdentifierEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventChannelEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pushConsumerEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pushSupplierEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType logEventArrayEDataType = null;

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
	 * @see mil.jpeojtrs.sca.cf.CfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CfPackageImpl() {
		super(eNS_URI, CfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CfPackage init() {
		if (isInited)
			return (CfPackage) EPackage.Registry.INSTANCE.getEPackage(CfPackage.eNS_URI);

		// Obtain or create and register package
		CfPackageImpl theCfPackage = (CfPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new CfPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExtendedPackageImpl theExtendedPackage = (ExtendedPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(
			ExtendedPackage.eNS_URI) instanceof ExtendedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI)
				: ExtendedPackage.eINSTANCE);

		// Create package meta-data objects
		theCfPackage.createPackageContents();
		theExtendedPackage.createPackageContents();

		// Initialize created meta-data
		theCfPackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CfPackage.eNS_URI, theCfPackage);
		return theCfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDLEntity() {
		return idlEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateDevice() {
		return aggregateDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateDeviceOperations() {
		return aggregateDeviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExecutableDevice() {
		return aggregateExecutableDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExecutableDeviceOperations() {
		return aggregateExecutableDeviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateLoadableDevice() {
		return aggregateLoadableDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateLoadableDeviceOperations() {
		return aggregateLoadableDeviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatePlainDevice() {
		return aggregatePlainDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatePlainDeviceOperations() {
		return aggregatePlainDeviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationManager() {
		return allocationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationManagerOperations() {
		return allocationManagerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationFactory() {
		return applicationFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationFactoryOperations() {
		return applicationFactoryOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationOperations() {
		return applicationOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManagerOperations() {
		return connectionManagerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceManager() {
		return deviceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceManagerOperations() {
		return deviceManagerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceOperations() {
		return deviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainManager() {
		return domainManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainManagerOperations() {
		return domainManagerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChannelManager() {
		return eventChannelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChannelManagerOperations() {
		return eventChannelManagerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableDevice() {
		return executableDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableDeviceOperations() {
		return executableDeviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileManager() {
		return fileManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileManagerOperations() {
		return fileManagerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileOperations() {
		return fileOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSystem() {
		return fileSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSystemOperations() {
		return fileSystemOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeCycle() {
		return lifeCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeCycleOperations() {
		return lifeCycleOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadableDevice() {
		return loadableDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadableDeviceOperations() {
		return loadableDeviceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogging() {
		return loggingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoggingOperations() {
		return loggingOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEventConsumer() {
		return logEventConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEventConsumerOperations() {
		return logEventConsumerOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogConfiguration() {
		return logConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogConfigurationOperations() {
		return logConfigurationOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortOperations() {
		return portOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSet() {
		return portSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSetOperations() {
		return portSetOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSupplier() {
		return portSupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSupplierOperations() {
		return portSupplierOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyEmitter() {
		return propertyEmitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyEmitterOperations() {
		return propertyEmitterOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertySet() {
		return propertySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertySetOperations() {
		return propertySetOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceFactory() {
		return resourceFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceFactoryOperations() {
		return resourceFactoryOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceOperations() {
		return resourceOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestableObject() {
		return testableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestableObjectOperations() {
		return testableObjectOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataType() {
		return dataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataTypeArray() {
		return dataTypeArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamingContextExt() {
		return namingContextExtEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getORB() {
		return orbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllocationStatusType() {
		return allocationStatusTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidObjectReference() {
		return invalidObjectReferenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCreateApplicationInsufficientCapacityError() {
		return createApplicationInsufficientCapacityErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceAssignmentTypeArray() {
		return deviceAssignmentTypeArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCreateApplicationError() {
		return createApplicationErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCreateApplicationRequestError() {
		return createApplicationRequestErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidInitConfiguration() {
		return invalidInitConfigurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectionStatusSequenceHolder() {
		return connectionStatusSequenceHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectionStatusType() {
		return connectionStatusTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectionStatusTypeArray() {
		return connectionStatusTypeArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEndpointRequest() {
		return endpointRequestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectionStatusIteratorHolder() {
		return connectionStatusIteratorHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidCapacity() {
		return invalidCapacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidState() {
		return invalidStateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidProfile() {
		return invalidProfileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceManagerNotRegistered() {
		return deviceManagerNotRegisteredEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegisterError() {
		return registerErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnregisterError() {
		return unregisterErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidFileName() {
		return invalidFileNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationInstallationError() {
		return applicationInstallationErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationAlreadyInstalled() {
		return applicationAlreadyInstalledEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidDomMgrIdentifier() {
		return invalidDomMgrIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidIdentifier() {
		return invalidIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationUninstallationError() {
		return applicationUninstallationErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInsufficientCapacity() {
		return insufficientCapacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidEventChannelName() {
		return invalidEventChannelNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlreadyConnected() {
		return alreadyConnectedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNotConnected() {
		return notConnectedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventChannelInfoIteratorHolder() {
		return eventChannelInfoIteratorHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChannelAlreadyExists() {
		return channelAlreadyExistsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChannelDoesNotExist() {
		return channelDoesNotExistEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventChannelInfoListHolder() {
		return eventChannelInfoListHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventChannelReg() {
		return eventChannelRegEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventRegistration() {
		return eventRegistrationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventRegistrantListHolder() {
		return eventRegistrantListHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidChannelName() {
		return invalidChannelNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationFailed() {
		return operationFailedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationNotAllowed() {
		return operationNotAllowedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegistrationAlreadyExists() {
		return registrationAlreadyExistsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegistrationDoesNotExist() {
		return registrationDoesNotExistEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegistrationsExists() {
		return registrationsExistsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceUnavailable() {
		return serviceUnavailableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventRegistrantIteratorHolder() {
		return eventRegistrantIteratorHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidProcess() {
		return invalidProcessEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidFunction() {
		return invalidFunctionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidParameters() {
		return invalidParametersEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidOptions() {
		return invalidOptionsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExecuteFail() {
		return executeFailEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidFileSystem() {
		return invalidFileSystemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMountPointAlreadyExists() {
		return mountPointAlreadyExistsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonExistentMount() {
		return nonExistentMountEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMountTypeArray() {
		return mountTypeArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOctetSequenceHolder() {
		return octetSequenceHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFileException() {
		return fileExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidFilePointer() {
		return invalidFilePointerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFileInformationTypeArray() {
		return fileInformationTypeArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertiesHolder() {
		return propertiesHolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeEvent() {
		return propertyChangeEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnknownFileSystemProperties() {
		return unknownFileSystemPropertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInitializeError() {
		return initializeErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReleaseError() {
		return releaseErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLoadType() {
		return loadTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidLoadKind() {
		return invalidLoadKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLoadFail() {
		return loadFailEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidPort() {
		return invalidPortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOccupiedPort() {
		return occupiedPortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortInfoType() {
		return portInfoTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnknownPort() {
		return unknownPortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlreadyInitialized() {
		return alreadyInitializedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidConfiguration() {
		return invalidConfigurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPartialConfiguration() {
		return partialConfigurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnknownProperties() {
		return unknownPropertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCreateResourceFailure() {
		return createResourceFailureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidResourceId() {
		return invalidResourceIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShutdownFailure() {
		return shutdownFailureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStartError() {
		return startErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStopError() {
		return stopErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnknownTest() {
		return unknownTestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnknownIdentifier() {
		return unknownIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventChannel() {
		return eventChannelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPushConsumer() {
		return pushConsumerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPushSupplier() {
		return pushSupplierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLogEventArray() {
		return logEventArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfFactory getCfFactory() {
		return (CfFactory) getEFactoryInstance();
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
		aggregateDeviceEClass = createEClass(AGGREGATE_DEVICE);

		aggregateDeviceOperationsEClass = createEClass(AGGREGATE_DEVICE_OPERATIONS);

		aggregateExecutableDeviceEClass = createEClass(AGGREGATE_EXECUTABLE_DEVICE);

		aggregateExecutableDeviceOperationsEClass = createEClass(AGGREGATE_EXECUTABLE_DEVICE_OPERATIONS);

		aggregateLoadableDeviceEClass = createEClass(AGGREGATE_LOADABLE_DEVICE);

		aggregateLoadableDeviceOperationsEClass = createEClass(AGGREGATE_LOADABLE_DEVICE_OPERATIONS);

		aggregatePlainDeviceEClass = createEClass(AGGREGATE_PLAIN_DEVICE);

		aggregatePlainDeviceOperationsEClass = createEClass(AGGREGATE_PLAIN_DEVICE_OPERATIONS);

		allocationManagerEClass = createEClass(ALLOCATION_MANAGER);

		allocationManagerOperationsEClass = createEClass(ALLOCATION_MANAGER_OPERATIONS);

		applicationEClass = createEClass(APPLICATION);

		applicationFactoryEClass = createEClass(APPLICATION_FACTORY);

		applicationFactoryOperationsEClass = createEClass(APPLICATION_FACTORY_OPERATIONS);

		applicationOperationsEClass = createEClass(APPLICATION_OPERATIONS);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);

		connectionManagerOperationsEClass = createEClass(CONNECTION_MANAGER_OPERATIONS);

		deviceEClass = createEClass(DEVICE);

		deviceManagerEClass = createEClass(DEVICE_MANAGER);

		deviceManagerOperationsEClass = createEClass(DEVICE_MANAGER_OPERATIONS);

		deviceOperationsEClass = createEClass(DEVICE_OPERATIONS);

		domainManagerEClass = createEClass(DOMAIN_MANAGER);

		domainManagerOperationsEClass = createEClass(DOMAIN_MANAGER_OPERATIONS);

		eventChannelManagerEClass = createEClass(EVENT_CHANNEL_MANAGER);

		eventChannelManagerOperationsEClass = createEClass(EVENT_CHANNEL_MANAGER_OPERATIONS);

		executableDeviceEClass = createEClass(EXECUTABLE_DEVICE);

		executableDeviceOperationsEClass = createEClass(EXECUTABLE_DEVICE_OPERATIONS);

		fileEClass = createEClass(FILE);

		fileManagerEClass = createEClass(FILE_MANAGER);

		fileManagerOperationsEClass = createEClass(FILE_MANAGER_OPERATIONS);

		fileOperationsEClass = createEClass(FILE_OPERATIONS);

		fileSystemEClass = createEClass(FILE_SYSTEM);

		fileSystemOperationsEClass = createEClass(FILE_SYSTEM_OPERATIONS);

		idlEntityEClass = createEClass(IDL_ENTITY);

		lifeCycleEClass = createEClass(LIFE_CYCLE);

		lifeCycleOperationsEClass = createEClass(LIFE_CYCLE_OPERATIONS);

		loadableDeviceEClass = createEClass(LOADABLE_DEVICE);

		loadableDeviceOperationsEClass = createEClass(LOADABLE_DEVICE_OPERATIONS);

		loggingEClass = createEClass(LOGGING);

		loggingOperationsEClass = createEClass(LOGGING_OPERATIONS);

		logEventConsumerEClass = createEClass(LOG_EVENT_CONSUMER);

		logEventConsumerOperationsEClass = createEClass(LOG_EVENT_CONSUMER_OPERATIONS);

		logConfigurationEClass = createEClass(LOG_CONFIGURATION);

		logConfigurationOperationsEClass = createEClass(LOG_CONFIGURATION_OPERATIONS);

		objectEClass = createEClass(OBJECT);

		portEClass = createEClass(PORT);

		portOperationsEClass = createEClass(PORT_OPERATIONS);

		portSetEClass = createEClass(PORT_SET);

		portSetOperationsEClass = createEClass(PORT_SET_OPERATIONS);

		portSupplierEClass = createEClass(PORT_SUPPLIER);

		portSupplierOperationsEClass = createEClass(PORT_SUPPLIER_OPERATIONS);

		propertyEmitterEClass = createEClass(PROPERTY_EMITTER);

		propertyEmitterOperationsEClass = createEClass(PROPERTY_EMITTER_OPERATIONS);

		propertySetEClass = createEClass(PROPERTY_SET);

		propertySetOperationsEClass = createEClass(PROPERTY_SET_OPERATIONS);

		resourceEClass = createEClass(RESOURCE);

		resourceFactoryEClass = createEClass(RESOURCE_FACTORY);

		resourceFactoryOperationsEClass = createEClass(RESOURCE_FACTORY_OPERATIONS);

		resourceOperationsEClass = createEClass(RESOURCE_OPERATIONS);

		testableObjectEClass = createEClass(TESTABLE_OBJECT);

		testableObjectOperationsEClass = createEClass(TESTABLE_OBJECT_OPERATIONS);

		// Create data types
		allocationStatusTypeEDataType = createEDataType(ALLOCATION_STATUS_TYPE);
		createApplicationInsufficientCapacityErrorEDataType = createEDataType(CREATE_APPLICATION_INSUFFICIENT_CAPACITY_ERROR);
		createApplicationErrorEDataType = createEDataType(CREATE_APPLICATION_ERROR);
		createApplicationRequestErrorEDataType = createEDataType(CREATE_APPLICATION_REQUEST_ERROR);
		invalidInitConfigurationEDataType = createEDataType(INVALID_INIT_CONFIGURATION);
		connectionStatusSequenceHolderEDataType = createEDataType(CONNECTION_STATUS_SEQUENCE_HOLDER);
		connectionStatusTypeEDataType = createEDataType(CONNECTION_STATUS_TYPE);
		connectionStatusTypeArrayEDataType = createEDataType(CONNECTION_STATUS_TYPE_ARRAY);
		endpointRequestEDataType = createEDataType(ENDPOINT_REQUEST);
		connectionStatusIteratorHolderEDataType = createEDataType(CONNECTION_STATUS_ITERATOR_HOLDER);
		dataTypeEDataType = createEDataType(DATA_TYPE);
		dataTypeArrayEDataType = createEDataType(DATA_TYPE_ARRAY);
		deviceAssignmentTypeArrayEDataType = createEDataType(DEVICE_ASSIGNMENT_TYPE_ARRAY);
		invalidCapacityEDataType = createEDataType(INVALID_CAPACITY);
		invalidStateEDataType = createEDataType(INVALID_STATE);
		deviceManagerNotRegisteredEDataType = createEDataType(DEVICE_MANAGER_NOT_REGISTERED);
		registerErrorEDataType = createEDataType(REGISTER_ERROR);
		unregisterErrorEDataType = createEDataType(UNREGISTER_ERROR);
		applicationInstallationErrorEDataType = createEDataType(APPLICATION_INSTALLATION_ERROR);
		applicationAlreadyInstalledEDataType = createEDataType(APPLICATION_ALREADY_INSTALLED);
		invalidDomMgrIdentifierEDataType = createEDataType(INVALID_DOM_MGR_IDENTIFIER);
		applicationUninstallationErrorEDataType = createEDataType(APPLICATION_UNINSTALLATION_ERROR);
		insufficientCapacityEDataType = createEDataType(INSUFFICIENT_CAPACITY);
		invalidEventChannelNameEDataType = createEDataType(INVALID_EVENT_CHANNEL_NAME);
		alreadyConnectedEDataType = createEDataType(ALREADY_CONNECTED);
		notConnectedEDataType = createEDataType(NOT_CONNECTED);
		eventChannelInfoIteratorHolderEDataType = createEDataType(EVENT_CHANNEL_INFO_ITERATOR_HOLDER);
		channelAlreadyExistsEDataType = createEDataType(CHANNEL_ALREADY_EXISTS);
		channelDoesNotExistEDataType = createEDataType(CHANNEL_DOES_NOT_EXIST);
		eventChannelInfoListHolderEDataType = createEDataType(EVENT_CHANNEL_INFO_LIST_HOLDER);
		eventChannelRegEDataType = createEDataType(EVENT_CHANNEL_REG);
		eventRegistrationEDataType = createEDataType(EVENT_REGISTRATION);
		eventRegistrantListHolderEDataType = createEDataType(EVENT_REGISTRANT_LIST_HOLDER);
		invalidChannelNameEDataType = createEDataType(INVALID_CHANNEL_NAME);
		operationFailedEDataType = createEDataType(OPERATION_FAILED);
		operationNotAllowedEDataType = createEDataType(OPERATION_NOT_ALLOWED);
		registrationAlreadyExistsEDataType = createEDataType(REGISTRATION_ALREADY_EXISTS);
		registrationDoesNotExistEDataType = createEDataType(REGISTRATION_DOES_NOT_EXIST);
		registrationsExistsEDataType = createEDataType(REGISTRATIONS_EXISTS);
		serviceUnavailableEDataType = createEDataType(SERVICE_UNAVAILABLE);
		eventRegistrantIteratorHolderEDataType = createEDataType(EVENT_REGISTRANT_ITERATOR_HOLDER);
		invalidProcessEDataType = createEDataType(INVALID_PROCESS);
		invalidFunctionEDataType = createEDataType(INVALID_FUNCTION);
		invalidParametersEDataType = createEDataType(INVALID_PARAMETERS);
		invalidOptionsEDataType = createEDataType(INVALID_OPTIONS);
		executeFailEDataType = createEDataType(EXECUTE_FAIL);
		invalidFileSystemEDataType = createEDataType(INVALID_FILE_SYSTEM);
		mountPointAlreadyExistsEDataType = createEDataType(MOUNT_POINT_ALREADY_EXISTS);
		nonExistentMountEDataType = createEDataType(NON_EXISTENT_MOUNT);
		mountTypeArrayEDataType = createEDataType(MOUNT_TYPE_ARRAY);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		fileExceptionEDataType = createEDataType(FILE_EXCEPTION);
		invalidFilePointerEDataType = createEDataType(INVALID_FILE_POINTER);
		fileInformationTypeArrayEDataType = createEDataType(FILE_INFORMATION_TYPE_ARRAY);
		unknownFileSystemPropertiesEDataType = createEDataType(UNKNOWN_FILE_SYSTEM_PROPERTIES);
		invalidFileNameEDataType = createEDataType(INVALID_FILE_NAME);
		invalidIdentifierEDataType = createEDataType(INVALID_IDENTIFIER);
		invalidObjectReferenceEDataType = createEDataType(INVALID_OBJECT_REFERENCE);
		invalidProfileEDataType = createEDataType(INVALID_PROFILE);
		initializeErrorEDataType = createEDataType(INITIALIZE_ERROR);
		releaseErrorEDataType = createEDataType(RELEASE_ERROR);
		loadTypeEDataType = createEDataType(LOAD_TYPE);
		invalidLoadKindEDataType = createEDataType(INVALID_LOAD_KIND);
		loadFailEDataType = createEDataType(LOAD_FAIL);
		logEventArrayEDataType = createEDataType(LOG_EVENT_ARRAY);
		octetSequenceHolderEDataType = createEDataType(OCTET_SEQUENCE_HOLDER);
		invalidPortEDataType = createEDataType(INVALID_PORT);
		occupiedPortEDataType = createEDataType(OCCUPIED_PORT);
		portInfoTypeEDataType = createEDataType(PORT_INFO_TYPE);
		unknownPortEDataType = createEDataType(UNKNOWN_PORT);
		propertiesHolderEDataType = createEDataType(PROPERTIES_HOLDER);
		propertyChangeEventEDataType = createEDataType(PROPERTY_CHANGE_EVENT);
		alreadyInitializedEDataType = createEDataType(ALREADY_INITIALIZED);
		invalidConfigurationEDataType = createEDataType(INVALID_CONFIGURATION);
		partialConfigurationEDataType = createEDataType(PARTIAL_CONFIGURATION);
		unknownPropertiesEDataType = createEDataType(UNKNOWN_PROPERTIES);
		createResourceFailureEDataType = createEDataType(CREATE_RESOURCE_FAILURE);
		invalidResourceIdEDataType = createEDataType(INVALID_RESOURCE_ID);
		shutdownFailureEDataType = createEDataType(SHUTDOWN_FAILURE);
		startErrorEDataType = createEDataType(START_ERROR);
		stopErrorEDataType = createEDataType(STOP_ERROR);
		unknownTestEDataType = createEDataType(UNKNOWN_TEST);
		unknownIdentifierEDataType = createEDataType(UNKNOWN_IDENTIFIER);
		orbEDataType = createEDataType(ORB);
		eventChannelEDataType = createEDataType(EVENT_CHANNEL);
		pushConsumerEDataType = createEDataType(PUSH_CONSUMER);
		pushSupplierEDataType = createEDataType(PUSH_SUPPLIER);
		namingContextExtEDataType = createEDataType(NAMING_CONTEXT_EXT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aggregateDeviceEClass.getESuperTypes().add(this.getAggregateDeviceOperations());
		aggregateDeviceEClass.getESuperTypes().add(this.getObject());
		aggregateDeviceEClass.getESuperTypes().add(this.getIDLEntity());
		aggregateExecutableDeviceEClass.getESuperTypes().add(this.getAggregateExecutableDeviceOperations());
		aggregateExecutableDeviceEClass.getESuperTypes().add(this.getExecutableDevice());
		aggregateExecutableDeviceEClass.getESuperTypes().add(this.getAggregateDevice());
		aggregateExecutableDeviceOperationsEClass.getESuperTypes().add(this.getExecutableDeviceOperations());
		aggregateExecutableDeviceOperationsEClass.getESuperTypes().add(this.getAggregateDeviceOperations());
		aggregateLoadableDeviceEClass.getESuperTypes().add(this.getAggregateLoadableDeviceOperations());
		aggregateLoadableDeviceEClass.getESuperTypes().add(this.getLoadableDevice());
		aggregateLoadableDeviceEClass.getESuperTypes().add(this.getAggregateDevice());
		aggregateLoadableDeviceOperationsEClass.getESuperTypes().add(this.getLoadableDeviceOperations());
		aggregateLoadableDeviceOperationsEClass.getESuperTypes().add(this.getAggregateDeviceOperations());
		aggregatePlainDeviceEClass.getESuperTypes().add(this.getAggregatePlainDeviceOperations());
		aggregatePlainDeviceEClass.getESuperTypes().add(this.getDevice());
		aggregatePlainDeviceEClass.getESuperTypes().add(this.getAggregateDevice());
		aggregatePlainDeviceOperationsEClass.getESuperTypes().add(this.getDeviceOperations());
		aggregatePlainDeviceOperationsEClass.getESuperTypes().add(this.getAggregateDeviceOperations());
		allocationManagerEClass.getESuperTypes().add(this.getAllocationManagerOperations());
		allocationManagerEClass.getESuperTypes().add(this.getObject());
		allocationManagerEClass.getESuperTypes().add(this.getIDLEntity());
		applicationEClass.getESuperTypes().add(this.getApplicationOperations());
		applicationEClass.getESuperTypes().add(this.getResource());
		applicationEClass.getESuperTypes().add(this.getIDLEntity());
		applicationFactoryEClass.getESuperTypes().add(this.getApplicationFactoryOperations());
		applicationFactoryEClass.getESuperTypes().add(this.getObject());
		applicationFactoryEClass.getESuperTypes().add(this.getIDLEntity());
		applicationOperationsEClass.getESuperTypes().add(this.getResourceOperations());
		connectionManagerEClass.getESuperTypes().add(this.getConnectionManagerOperations());
		connectionManagerEClass.getESuperTypes().add(this.getObject());
		connectionManagerEClass.getESuperTypes().add(this.getIDLEntity());
		deviceEClass.getESuperTypes().add(this.getDeviceOperations());
		deviceEClass.getESuperTypes().add(this.getResource());
		deviceEClass.getESuperTypes().add(this.getIDLEntity());
		deviceManagerEClass.getESuperTypes().add(this.getDeviceManagerOperations());
		deviceManagerEClass.getESuperTypes().add(this.getPropertyEmitter());
		deviceManagerEClass.getESuperTypes().add(this.getPortSet());
		deviceManagerOperationsEClass.getESuperTypes().add(this.getPropertyEmitterOperations());
		deviceManagerOperationsEClass.getESuperTypes().add(this.getPortSetOperations());
		deviceOperationsEClass.getESuperTypes().add(this.getResourceOperations());
		domainManagerEClass.getESuperTypes().add(this.getDomainManagerOperations());
		domainManagerEClass.getESuperTypes().add(this.getPropertyEmitter());
		domainManagerEClass.getESuperTypes().add(this.getIDLEntity());
		domainManagerOperationsEClass.getESuperTypes().add(this.getPropertyEmitterOperations());
		eventChannelManagerEClass.getESuperTypes().add(this.getEventChannelManagerOperations());
		eventChannelManagerEClass.getESuperTypes().add(this.getObject());
		eventChannelManagerEClass.getESuperTypes().add(this.getIDLEntity());
		executableDeviceEClass.getESuperTypes().add(this.getExecutableDeviceOperations());
		executableDeviceEClass.getESuperTypes().add(this.getLoadableDevice());
		executableDeviceEClass.getESuperTypes().add(this.getIDLEntity());
		executableDeviceOperationsEClass.getESuperTypes().add(this.getLoadableDeviceOperations());
		fileEClass.getESuperTypes().add(this.getFileOperations());
		fileEClass.getESuperTypes().add(this.getObject());
		fileEClass.getESuperTypes().add(this.getIDLEntity());
		fileManagerEClass.getESuperTypes().add(this.getFileManagerOperations());
		fileManagerEClass.getESuperTypes().add(this.getFileSystem());
		fileManagerEClass.getESuperTypes().add(this.getIDLEntity());
		fileManagerOperationsEClass.getESuperTypes().add(this.getFileSystemOperations());
		fileSystemEClass.getESuperTypes().add(this.getFileSystemOperations());
		fileSystemEClass.getESuperTypes().add(this.getObject());
		fileSystemEClass.getESuperTypes().add(this.getIDLEntity());
		lifeCycleEClass.getESuperTypes().add(this.getLifeCycleOperations());
		lifeCycleEClass.getESuperTypes().add(this.getObject());
		lifeCycleEClass.getESuperTypes().add(this.getIDLEntity());
		loadableDeviceEClass.getESuperTypes().add(this.getLoadableDeviceOperations());
		loadableDeviceEClass.getESuperTypes().add(this.getDevice());
		loadableDeviceEClass.getESuperTypes().add(this.getIDLEntity());
		loadableDeviceOperationsEClass.getESuperTypes().add(this.getDeviceOperations());
		loggingEClass.getESuperTypes().add(this.getLoggingOperations());
		loggingEClass.getESuperTypes().add(this.getLogEventConsumer());
		loggingEClass.getESuperTypes().add(this.getLogConfiguration());
		loggingOperationsEClass.getESuperTypes().add(this.getLogEventConsumerOperations());
		loggingOperationsEClass.getESuperTypes().add(this.getLogConfigurationOperations());
		logEventConsumerEClass.getESuperTypes().add(this.getLogEventConsumerOperations());
		logEventConsumerEClass.getESuperTypes().add(this.getObject());
		logEventConsumerEClass.getESuperTypes().add(this.getIDLEntity());
		logConfigurationEClass.getESuperTypes().add(this.getLogConfigurationOperations());
		logConfigurationEClass.getESuperTypes().add(this.getObject());
		logConfigurationEClass.getESuperTypes().add(this.getIDLEntity());
		portEClass.getESuperTypes().add(this.getPortOperations());
		portEClass.getESuperTypes().add(this.getObject());
		portEClass.getESuperTypes().add(this.getIDLEntity());
		portSetEClass.getESuperTypes().add(this.getPortSetOperations());
		portSetEClass.getESuperTypes().add(this.getPortSupplier());
		portSetEClass.getESuperTypes().add(this.getObject());
		portSetEClass.getESuperTypes().add(this.getIDLEntity());
		portSupplierEClass.getESuperTypes().add(this.getPortSupplierOperations());
		portSupplierEClass.getESuperTypes().add(this.getObject());
		portSupplierEClass.getESuperTypes().add(this.getIDLEntity());
		propertyEmitterEClass.getESuperTypes().add(this.getPropertyEmitterOperations());
		propertyEmitterEClass.getESuperTypes().add(this.getObject());
		propertyEmitterEClass.getESuperTypes().add(this.getIDLEntity());
		propertyEmitterOperationsEClass.getESuperTypes().add(this.getPropertySetOperations());
		propertySetEClass.getESuperTypes().add(this.getPropertySetOperations());
		propertySetEClass.getESuperTypes().add(this.getObject());
		propertySetEClass.getESuperTypes().add(this.getIDLEntity());
		resourceEClass.getESuperTypes().add(this.getResourceOperations());
		resourceEClass.getESuperTypes().add(this.getLifeCycle());
		resourceEClass.getESuperTypes().add(this.getTestableObject());
		resourceEClass.getESuperTypes().add(this.getPropertyEmitter());
		resourceEClass.getESuperTypes().add(this.getPortSet());
		resourceEClass.getESuperTypes().add(this.getLogging());
		resourceFactoryEClass.getESuperTypes().add(this.getResourceFactoryOperations());
		resourceFactoryEClass.getESuperTypes().add(this.getObject());
		resourceFactoryEClass.getESuperTypes().add(this.getIDLEntity());
		resourceOperationsEClass.getESuperTypes().add(this.getLifeCycleOperations());
		resourceOperationsEClass.getESuperTypes().add(this.getTestableObjectOperations());
		resourceOperationsEClass.getESuperTypes().add(this.getPropertyEmitterOperations());
		resourceOperationsEClass.getESuperTypes().add(this.getPortSupplierOperations());
		testableObjectEClass.getESuperTypes().add(this.getTestableObjectOperations());
		testableObjectEClass.getESuperTypes().add(this.getObject());
		testableObjectEClass.getESuperTypes().add(this.getIDLEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(aggregateDeviceEClass, AggregateDevice.class, "AggregateDevice", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregateDeviceOperationsEClass, AggregateDeviceOperations.class, "AggregateDeviceOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(aggregateDeviceOperationsEClass, null, "addDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "associatedDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());

		op = addEOperation(aggregateDeviceOperationsEClass, null, "removeDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "associatedDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());

		initEClass(aggregateExecutableDeviceEClass, AggregateExecutableDevice.class, "AggregateExecutableDevice", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregateExecutableDeviceOperationsEClass, AggregateExecutableDeviceOperations.class, "AggregateExecutableDeviceOperations", IS_ABSTRACT,
			IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregateLoadableDeviceEClass, AggregateLoadableDevice.class, "AggregateLoadableDevice", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregateLoadableDeviceOperationsEClass, AggregateLoadableDeviceOperations.class, "AggregateLoadableDeviceOperations", IS_ABSTRACT,
			IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregatePlainDeviceEClass, AggregatePlainDevice.class, "AggregatePlainDevice", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregatePlainDeviceOperationsEClass, AggregatePlainDeviceOperations.class, "AggregatePlainDeviceOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationManagerEClass, AllocationManager.class, "AllocationManager", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationManagerOperationsEClass, AllocationManagerOperations.class, "AllocationManagerOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationEClass, Application.class, "Application", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationFactoryEClass, ApplicationFactory.class, "ApplicationFactory", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationFactoryOperationsEClass, ApplicationFactoryOperations.class, "ApplicationFactoryOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(applicationFactoryOperationsEClass, this.getApplication(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "initConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeviceAssignmentTypeArray(), "deviceAssignments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCreateApplicationError());
		addEException(op, this.getCreateApplicationRequestError());
		addEException(op, this.getInvalidInitConfiguration());

		initEClass(applicationOperationsEClass, ApplicationOperations.class, "ApplicationOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionManagerOperationsEClass, ConnectionManagerOperations.class, "ConnectionManagerOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionManagerOperationsEClass, null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEndpointRequest(), "usesEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEndpointRequest(), "providesEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "requesterId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "connectionId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidPort());

		op = addEOperation(connectionManagerOperationsEClass, null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "connectionRecordId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidPort());

		addEOperation(connectionManagerOperationsEClass, this.getConnectionStatusTypeArray(), "connections", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionManagerOperationsEClass, null, "listConnections", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "how_many", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionStatusSequenceHolder(), "connections", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionStatusIteratorHolder(), "iter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceManagerEClass, DeviceManager.class, "DeviceManager", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceManagerOperationsEClass, DeviceManagerOperations.class, "DeviceManagerOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(deviceManagerOperationsEClass, null, "registerDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "registeringDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());

		op = addEOperation(deviceManagerOperationsEClass, null, "unregisterDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "registeredDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());

		addEOperation(deviceManagerOperationsEClass, null, "shutdown", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deviceManagerOperationsEClass, null, "registerService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "registeringService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());

		op = addEOperation(deviceManagerOperationsEClass, null, "unregisterService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "unregisteringService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());

		op = addEOperation(deviceManagerOperationsEClass, ecorePackage.getEString(), "getComponentImplementationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentInstantiationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceOperationsEClass, DeviceOperations.class, "DeviceOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(deviceOperationsEClass, ecorePackage.getEBoolean(), "allocateCapacity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "capacities", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidCapacity());
		addEException(op, this.getInvalidState());

		op = addEOperation(deviceOperationsEClass, null, "deallocateCapacity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "capacities", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidCapacity());
		addEException(op, this.getInvalidState());

		initEClass(domainManagerEClass, DomainManager.class, "DomainManager", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainManagerOperationsEClass, DomainManagerOperations.class, "DomainManagerOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(domainManagerOperationsEClass, null, "registerDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "registeringDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeviceManager(), "registeredDeviceMgr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getInvalidProfile());
		addEException(op, this.getDeviceManagerNotRegistered());
		addEException(op, this.getRegisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "registerDeviceManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeviceManager(), "deviceMgr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getInvalidProfile());
		addEException(op, this.getRegisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "unregisterDeviceManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeviceManager(), "deviceMgr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getUnregisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "unregisterDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "unregisteringDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getUnregisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "createApplication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "profileFileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "initConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeviceAssignmentTypeArray(), "deviceAssignments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getCreateApplicationError());
		addEException(op, this.getCreateApplicationRequestError());
		addEException(op, this.getCreateApplicationInsufficientCapacityError());
		addEException(op, this.getInvalidInitConfiguration());

		op = addEOperation(domainManagerOperationsEClass, null, "installApplication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "profileFileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidProfile());
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getApplicationInstallationError());
		addEException(op, this.getApplicationAlreadyInstalled());

		op = addEOperation(domainManagerOperationsEClass, null, "uninstallApplication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "applicationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidDomMgrIdentifier());
		addEException(op, this.getApplicationUninstallationError());

		op = addEOperation(domainManagerOperationsEClass, null, "registerService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "registeringService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeviceManager(), "registeredDeviceMgr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getDeviceManagerNotRegistered());
		addEException(op, this.getRegisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "unregisterService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "unregisteringService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getUnregisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "registerWithEventChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "registeringObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "registeringId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eventChannelName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getInvalidEventChannelName());
		addEException(op, this.getAlreadyConnected());

		op = addEOperation(domainManagerOperationsEClass, null, "unregisterFromEventChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "unregisteringId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eventChannelName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidEventChannelName());
		addEException(op, this.getNotConnected());

		op = addEOperation(domainManagerOperationsEClass, null, "registerRemoteDomainManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainManager(), "registeringDomainManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getRegisterError());

		op = addEOperation(domainManagerOperationsEClass, null, "unregisterRemoteDomainManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainManager(), "unregisteringDomainManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidObjectReference());
		addEException(op, this.getUnregisterError());

		initEClass(eventChannelManagerEClass, EventChannelManager.class, "EventChannelManager", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventChannelManagerOperationsEClass, EventChannelManagerOperations.class, "EventChannelManagerOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eventChannelManagerOperationsEClass, this.getEventChannel(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channel_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelAlreadyExists());
		addEException(op, this.getOperationNotAllowed());
		addEException(op, this.getOperationFailed());
		addEException(op, this.getServiceUnavailable());

		op = addEOperation(eventChannelManagerOperationsEClass, this.getEventChannel(), "createForRegistrations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channel_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelAlreadyExists());
		addEException(op, this.getOperationNotAllowed());
		addEException(op, this.getOperationFailed());
		addEException(op, this.getServiceUnavailable());

		op = addEOperation(eventChannelManagerOperationsEClass, null, "markForRegistrations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channel_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelDoesNotExist());
		addEException(op, this.getOperationNotAllowed());
		addEException(op, this.getOperationFailed());
		addEException(op, this.getServiceUnavailable());

		op = addEOperation(eventChannelManagerOperationsEClass, null, "release", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channel_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelDoesNotExist());
		addEException(op, this.getRegistrationsExists());
		addEException(op, this.getOperationNotAllowed());
		addEException(op, this.getOperationFailed());
		addEException(op, this.getServiceUnavailable());

		op = addEOperation(eventChannelManagerOperationsEClass, this.getEventChannelReg(), "registerResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventRegistration(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidChannelName());
		addEException(op, this.getRegistrationAlreadyExists());
		addEException(op, this.getOperationFailed());
		addEException(op, this.getOperationNotAllowed());
		addEException(op, this.getServiceUnavailable());

		op = addEOperation(eventChannelManagerOperationsEClass, null, "unregister", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventRegistration(), "reg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelDoesNotExist());
		addEException(op, this.getRegistrationDoesNotExist());
		addEException(op, this.getServiceUnavailable());

		op = addEOperation(eventChannelManagerOperationsEClass, null, "listChannels", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "how_many", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventChannelInfoListHolder(), "elist", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventChannelInfoIteratorHolder(), "eiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eventChannelManagerOperationsEClass, null, "listRegistrants", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channel_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "how_many", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventRegistrantListHolder(), "rlist", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventRegistrantIteratorHolder(), "riter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executableDeviceEClass, ExecutableDevice.class, "ExecutableDevice", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableDeviceOperationsEClass, ExecutableDeviceOperations.class, "ExecutableDeviceOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(executableDeviceOperationsEClass, null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "processId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidProcess());
		addEException(op, this.getInvalidState());

		op = addEOperation(executableDeviceOperationsEClass, ecorePackage.getEInt(), "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidState());
		addEException(op, this.getInvalidFunction());
		addEException(op, this.getInvalidParameters());
		addEException(op, this.getInvalidOptions());
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getExecuteFail());

		op = addEOperation(executableDeviceOperationsEClass, null, "executeLinked", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deps", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidState());
		addEException(op, this.getInvalidFunction());
		addEException(op, this.getInvalidParameters());
		addEException(op, this.getInvalidOptions());
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getExecuteFail());

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileManagerEClass, FileManager.class, "FileManager", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileManagerOperationsEClass, FileManagerOperations.class, "FileManagerOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fileManagerOperationsEClass, null, "mount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mountPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileSystem(), "file_System", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getInvalidFileSystem());
		addEException(op, this.getMountPointAlreadyExists());

		op = addEOperation(fileManagerOperationsEClass, null, "unmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mountPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNonExistentMount());

		addEOperation(fileManagerOperationsEClass, this.getMountTypeArray(), "getMounts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileOperationsEClass, FileOperations.class, "FileOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fileOperationsEClass, null, "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOctetSequenceHolder(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = addEOperation(fileOperationsEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = addEOperation(fileOperationsEClass, ecorePackage.getEInt(), "sizeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFileException());

		op = addEOperation(fileOperationsEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFileException());

		op = addEOperation(fileOperationsEClass, null, "setFilePointer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "filePointer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFilePointer());
		addEException(op, this.getFileException());

		initEClass(fileSystemEClass, FileSystem.class, "FileSystem", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileSystemOperationsEClass, FileSystemOperations.class, "FileSystemOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fileSystemOperationsEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFileException());
		addEException(op, this.getInvalidFileName());

		op = addEOperation(fileSystemOperationsEClass, null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceFileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "destinationFileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getFileException());

		op = addEOperation(fileSystemOperationsEClass, ecorePackage.getEBoolean(), "exists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());

		op = addEOperation(fileSystemOperationsEClass, this.getFileInformationTypeArray(), "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFileException());
		addEException(op, this.getInvalidFileName());

		op = addEOperation(fileSystemOperationsEClass, this.getFile(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getFileException());

		op = addEOperation(fileSystemOperationsEClass, this.getFile(), "open", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "read_Only", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getFileException());

		op = addEOperation(fileSystemOperationsEClass, null, "mkdir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "directoryName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getFileException());

		op = addEOperation(fileSystemOperationsEClass, null, "rmdir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "directoryName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getFileException());

		op = addEOperation(fileSystemOperationsEClass, null, "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertiesHolder(), "fileSystemProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnknownFileSystemProperties());

		initEClass(idlEntityEClass, IDLEntity.class, "IDLEntity", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifeCycleOperationsEClass, LifeCycleOperations.class, "LifeCycleOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lifeCycleOperationsEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInitializeError());

		op = addEOperation(lifeCycleOperationsEClass, null, "releaseObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getReleaseError());

		initEClass(loadableDeviceEClass, LoadableDevice.class, "LoadableDevice", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadableDeviceOperationsEClass, LoadableDeviceOperations.class, "LoadableDeviceOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(loadableDeviceOperationsEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileSystem(), "fs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLoadType(), "loadKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidState());
		addEException(op, this.getInvalidLoadKind());
		addEException(op, this.getInvalidFileName());
		addEException(op, this.getLoadFail());

		op = addEOperation(loadableDeviceOperationsEClass, null, "unload", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidState());
		addEException(op, this.getInvalidFileName());

		initEClass(loggingEClass, Logging.class, "Logging", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(loggingOperationsEClass, LoggingOperations.class, "LoggingOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(logEventConsumerEClass, LogEventConsumer.class, "LogEventConsumer", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(logEventConsumerOperationsEClass, LogEventConsumerOperations.class, "LogEventConsumerOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(logEventConsumerOperationsEClass, this.getLogEventArray(), "retrieve_records", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "howMany", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "startingRecord", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logEventConsumerOperationsEClass, this.getLogEventArray(), "retrieve_records_by_date", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "howMany", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "to_timeStamp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logEventConsumerOperationsEClass, this.getLogEventArray(), "retrieve_records_from_date", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "howMany", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "from_timeStamp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(logConfigurationEClass, LogConfiguration.class, "LogConfiguration", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(logConfigurationOperationsEClass, LogConfigurationOperations.class, "LogConfigurationOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(logConfigurationOperationsEClass, null, "setLogLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "logger_id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "newLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnknownIdentifier());

		addEOperation(logConfigurationOperationsEClass, ecorePackage.getEString(), "getLogConfig", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logConfigurationOperationsEClass, null, "setLogConfig", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "config_contents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logConfigurationOperationsEClass, null, "setLogConfigURL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "config_url", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectEClass, org.omg.CORBA.Object.class, "Object", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portOperationsEClass, PortOperations.class, "PortOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(portOperationsEClass, null, "connectPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "connectionId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidPort());
		addEException(op, this.getOccupiedPort());

		op = addEOperation(portOperationsEClass, null, "disconnectPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "connectionId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidPort());

		initEClass(portSetEClass, PortSet.class, "PortSet", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portSetOperationsEClass, PortSetOperations.class, "PortSetOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		addEOperation(portSetOperationsEClass, this.getPortInfoType(), "getPortSet", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(portSupplierEClass, PortSupplier.class, "PortSupplier", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portSupplierOperationsEClass, PortSupplierOperations.class, "PortSupplierOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(portSupplierOperationsEClass, this.getObject(), "getPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnknownPort());

		initEClass(propertyEmitterEClass, PropertyEmitter.class, "PropertyEmitter", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEmitterOperationsEClass, PropertyEmitterOperations.class, "PropertyEmitterOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(propertyEmitterOperationsEClass, null, "initializeProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "initialProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAlreadyInitialized());
		addEException(op, this.getInvalidConfiguration());
		addEException(op, this.getPartialConfiguration());

		op = addEOperation(propertyEmitterOperationsEClass, ecorePackage.getEString(), "registerPropertyListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "prop_ids", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "interval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnknownProperties());
		addEException(op, this.getInvalidObjectReference());

		op = addEOperation(propertyEmitterOperationsEClass, null, "unregisterPropertyListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidIdentifier());

		initEClass(propertySetEClass, PropertySet.class, "PropertySet", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertySetOperationsEClass, PropertySetOperations.class, "PropertySetOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(propertySetOperationsEClass, null, "configure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "configProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidConfiguration());
		addEException(op, this.getPartialConfiguration());

		op = addEOperation(propertySetOperationsEClass, null, "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertiesHolder(), "configProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnknownProperties());

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceFactoryEClass, ResourceFactory.class, "ResourceFactory", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceFactoryOperationsEClass, ResourceFactoryOperations.class, "ResourceFactoryOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceFactoryOperationsEClass, this.getResource(), "createResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTypeArray(), "qualifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCreateResourceFailure());

		op = addEOperation(resourceFactoryOperationsEClass, null, "releaseResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidResourceId());

		op = addEOperation(resourceFactoryOperationsEClass, null, "shutdown", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getShutdownFailure());

		initEClass(resourceOperationsEClass, ResourceOperations.class, "ResourceOperations", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceOperationsEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getStartError());

		op = addEOperation(resourceOperationsEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getStopError());

		initEClass(testableObjectEClass, TestableObject.class, "TestableObject", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(testableObjectOperationsEClass, TestableObjectOperations.class, "TestableObjectOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testableObjectOperationsEClass, null, "runTest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "testid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertiesHolder(), "testValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getUnknownTest());
		addEException(op, this.getUnknownProperties());

		// Initialize data types
		initEDataType(allocationStatusTypeEDataType, AllocationStatusType.class, "AllocationStatusType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(createApplicationInsufficientCapacityErrorEDataType, CreateApplicationInsufficientCapacityError.class,
			"CreateApplicationInsufficientCapacityError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(createApplicationErrorEDataType, CreateApplicationError.class, "CreateApplicationError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(createApplicationRequestErrorEDataType, CreateApplicationRequestError.class, "CreateApplicationRequestError", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidInitConfigurationEDataType, InvalidInitConfiguration.class, "InvalidInitConfiguration", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionStatusSequenceHolderEDataType, ConnectionStatusSequenceHolder.class, "ConnectionStatusSequenceHolder", !IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionStatusTypeEDataType, ConnectionStatusType.class, "ConnectionStatusType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionStatusTypeArrayEDataType, ConnectionStatusType[].class, "ConnectionStatusTypeArray", !IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(endpointRequestEDataType, EndpointRequest.class, "EndpointRequest", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionStatusIteratorHolderEDataType, ConnectionStatusIteratorHolder.class, "ConnectionStatusIteratorHolder", !IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataTypeEDataType, DataType.class, "DataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataTypeArrayEDataType, DataType[].class, "DataTypeArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceAssignmentTypeArrayEDataType, DeviceAssignmentType[].class, "DeviceAssignmentTypeArray", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidCapacityEDataType, InvalidCapacity.class, "InvalidCapacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidStateEDataType, InvalidState.class, "InvalidState", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceManagerNotRegisteredEDataType, DeviceManagerNotRegistered.class, "DeviceManagerNotRegistered", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(registerErrorEDataType, RegisterError.class, "RegisterError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unregisterErrorEDataType, UnregisterError.class, "UnregisterError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(applicationInstallationErrorEDataType, ApplicationInstallationError.class, "ApplicationInstallationError", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(applicationAlreadyInstalledEDataType, ApplicationAlreadyInstalled.class, "ApplicationAlreadyInstalled", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidDomMgrIdentifierEDataType, InvalidIdentifier.class, "InvalidDomMgrIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(applicationUninstallationErrorEDataType, ApplicationUninstallationError.class, "ApplicationUninstallationError", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(insufficientCapacityEDataType, InsufficientCapacity.class, "InsufficientCapacity", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidEventChannelNameEDataType, InvalidEventChannelName.class, "InvalidEventChannelName", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(alreadyConnectedEDataType, AlreadyConnected.class, "AlreadyConnected", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(notConnectedEDataType, NotConnected.class, "NotConnected", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventChannelInfoIteratorHolderEDataType, EventChannelInfoIteratorHolder.class, "EventChannelInfoIteratorHolder", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(channelAlreadyExistsEDataType, ChannelAlreadyExists.class, "ChannelAlreadyExists", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(channelDoesNotExistEDataType, ChannelDoesNotExist.class, "ChannelDoesNotExist", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventChannelInfoListHolderEDataType, EventChannelInfoListHolder.class, "EventChannelInfoListHolder", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventChannelRegEDataType, EventChannelReg.class, "EventChannelReg", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventRegistrationEDataType, EventRegistration.class, "EventRegistration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventRegistrantListHolderEDataType, EventRegistrantListHolder.class, "EventRegistrantListHolder", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidChannelNameEDataType, InvalidChannelName.class, "InvalidChannelName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationFailedEDataType, OperationFailed.class, "OperationFailed", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationNotAllowedEDataType, OperationNotAllowed.class, "OperationNotAllowed", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(registrationAlreadyExistsEDataType, RegistrationAlreadyExists.class, "RegistrationAlreadyExists", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(registrationDoesNotExistEDataType, RegistrationDoesNotExist.class, "RegistrationDoesNotExist", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(registrationsExistsEDataType, RegistrationsExists.class, "RegistrationsExists", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceUnavailableEDataType, ServiceUnavailable.class, "ServiceUnavailable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventRegistrantIteratorHolderEDataType, EventRegistrantIteratorHolder.class, "EventRegistrantIteratorHolder", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidProcessEDataType, InvalidProcess.class, "InvalidProcess", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidFunctionEDataType, InvalidFunction.class, "InvalidFunction", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidParametersEDataType, InvalidParameters.class, "InvalidParameters", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidOptionsEDataType, InvalidOptions.class, "InvalidOptions", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(executeFailEDataType, ExecuteFail.class, "ExecuteFail", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidFileSystemEDataType, InvalidFileSystem.class, "InvalidFileSystem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mountPointAlreadyExistsEDataType, MountPointAlreadyExists.class, "MountPointAlreadyExists", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonExistentMountEDataType, NonExistentMount.class, "NonExistentMount", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mountTypeArrayEDataType, MountType[].class, "MountTypeArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileExceptionEDataType, FileException.class, "FileException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidFilePointerEDataType, InvalidFilePointer.class, "InvalidFilePointer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileInformationTypeArrayEDataType, FileInformationType[].class, "FileInformationTypeArray", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unknownFileSystemPropertiesEDataType, UnknownFileSystemProperties.class, "UnknownFileSystemProperties", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidFileNameEDataType, InvalidFileName.class, "InvalidFileName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidIdentifierEDataType, CF.InvalidIdentifier.class, "InvalidIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidObjectReferenceEDataType, InvalidObjectReference.class, "InvalidObjectReference", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidProfileEDataType, InvalidProfile.class, "InvalidProfile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(initializeErrorEDataType, InitializeError.class, "InitializeError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(releaseErrorEDataType, ReleaseError.class, "ReleaseError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(loadTypeEDataType, LoadType.class, "LoadType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidLoadKindEDataType, InvalidLoadKind.class, "InvalidLoadKind", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(loadFailEDataType, LoadFail.class, "LoadFail", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(logEventArrayEDataType, LogEvent[].class, "LogEventArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(octetSequenceHolderEDataType, OctetSequenceHolder.class, "OctetSequenceHolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidPortEDataType, InvalidPort.class, "InvalidPort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(occupiedPortEDataType, OccupiedPort.class, "OccupiedPort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portInfoTypeEDataType, PortInfoType.class, "PortInfoType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unknownPortEDataType, UnknownPort.class, "UnknownPort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertiesHolderEDataType, PropertiesHolder.class, "PropertiesHolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeEventEDataType, PropertyChangeEvent.class, "PropertyChangeEvent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(alreadyInitializedEDataType, AlreadyInitialized.class, "AlreadyInitialized", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidConfigurationEDataType, InvalidConfiguration.class, "InvalidConfiguration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(partialConfigurationEDataType, PartialConfiguration.class, "PartialConfiguration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unknownPropertiesEDataType, UnknownProperties.class, "UnknownProperties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(createResourceFailureEDataType, CreateResourceFailure.class, "CreateResourceFailure", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidResourceIdEDataType, InvalidResourceId.class, "InvalidResourceId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shutdownFailureEDataType, ShutdownFailure.class, "ShutdownFailure", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(startErrorEDataType, StartError.class, "StartError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stopErrorEDataType, StopError.class, "StopError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unknownTestEDataType, UnknownTest.class, "UnknownTest", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unknownIdentifierEDataType, UnknownIdentifier.class, "UnknownIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orbEDataType, org.omg.CORBA.ORB.class, "ORB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventChannelEDataType, EventChannel.class, "EventChannel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pushConsumerEDataType, PushConsumer.class, "PushConsumer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pushSupplierEDataType, PushSupplier.class, "PushSupplier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(namingContextExtEDataType, NamingContextExt.class, "NamingContextExt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(dataTypeEDataType, source, new String[] { "name", "DataType" });
		addAnnotation(dataTypeArrayEDataType, source, new String[] { "name", "DataTypeArray" });
		addAnnotation(orbEDataType, source, new String[] { "name", "ORB" });
		addAnnotation(namingContextExtEDataType, source, new String[] { "name", "NamingContextExt" });
	}

} //CfPackageImpl
