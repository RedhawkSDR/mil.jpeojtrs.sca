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

import CF.AllocationManagerPackage.AllocationStatusType;
import mil.jpeojtrs.sca.cf.CfFactory;
import mil.jpeojtrs.sca.cf.CfPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.omg.CORBA.ORB;
import org.omg.CosEventChannelAdmin.EventChannel;
import org.omg.CosEventComm.PushConsumer;
import org.omg.CosEventComm.PushSupplier;
import org.omg.CosNaming.NamingContextExt;

import CF.DataType;
import CF.DeviceAssignmentType;
import CF.FileException;
import CF.InvalidFileName;
import CF.InvalidObjectReference;
import CF.InvalidProfile;
import CF.OctetSequenceHolder;
import CF.PropertiesHolder;
import CF.PropertyChangeListenerPackage.PropertyChangeEvent;
import CF.PropertyEmitterPackage.AlreadyInitialized;
import CF.UnknownProperties;
import CF.ApplicationFactoryPackage.CreateApplicationError;
import CF.ApplicationFactoryPackage.CreateApplicationInsufficientCapacityError;
import CF.ApplicationFactoryPackage.CreateApplicationRequestError;
import CF.ApplicationFactoryPackage.InvalidInitConfiguration;
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
import CF.EventChannelManagerPackage.ChannelAlreadyExists;
import CF.EventChannelManagerPackage.ChannelDoesNotExist;
import CF.EventChannelManagerPackage.EventChannelInfoListHolder;
import CF.EventChannelManagerPackage.EventChannelReg;
import CF.EventChannelManagerPackage.EventRegistrantListHolder;
import CF.EventChannelManagerPackage.EventRegistration;
import CF.EventChannelManagerPackage.InvalidChannelName;
import CF.EventChannelManagerPackage.OperationFailed;
import CF.EventChannelManagerPackage.OperationNotAllowed;
import CF.EventChannelManagerPackage.PublisherReg;
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
import CF.LogEvent;
import CF.PortPackage.InvalidPort;
import CF.PortPackage.OccupiedPort;
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
import CF.UTCTime;
import CF.UnknownIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfFactoryImpl extends EFactoryImpl implements CfFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CfFactory init() {
		try {
			CfFactory theCfFactory = (CfFactory) EPackage.Registry.INSTANCE.getEFactory(CfPackage.eNS_URI);
			if (theCfFactory != null) {
				return theCfFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfFactoryImpl() {
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
		case CfPackage.ALLOCATION_STATUS_TYPE:
			return createAllocationStatusTypeFromString(eDataType, initialValue);
		case CfPackage.CREATE_APPLICATION_INSUFFICIENT_CAPACITY_ERROR:
			return createCreateApplicationInsufficientCapacityErrorFromString(eDataType, initialValue);
		case CfPackage.CREATE_APPLICATION_ERROR:
			return createCreateApplicationErrorFromString(eDataType, initialValue);
		case CfPackage.CREATE_APPLICATION_REQUEST_ERROR:
			return createCreateApplicationRequestErrorFromString(eDataType, initialValue);
		case CfPackage.INVALID_INIT_CONFIGURATION:
			return createInvalidInitConfigurationFromString(eDataType, initialValue);
		case CfPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		case CfPackage.DATA_TYPE_ARRAY:
			return createDataTypeArrayFromString(eDataType, initialValue);
		case CfPackage.DEVICE_ASSIGNMENT_TYPE_ARRAY:
			return createDeviceAssignmentTypeArrayFromString(eDataType, initialValue);
		case CfPackage.INVALID_CAPACITY:
			return createInvalidCapacityFromString(eDataType, initialValue);
		case CfPackage.INVALID_STATE:
			return createInvalidStateFromString(eDataType, initialValue);
		case CfPackage.DEVICE_MANAGER_NOT_REGISTERED:
			return createDeviceManagerNotRegisteredFromString(eDataType, initialValue);
		case CfPackage.REGISTER_ERROR:
			return createRegisterErrorFromString(eDataType, initialValue);
		case CfPackage.UNREGISTER_ERROR:
			return createUnregisterErrorFromString(eDataType, initialValue);
		case CfPackage.APPLICATION_INSTALLATION_ERROR:
			return createApplicationInstallationErrorFromString(eDataType, initialValue);
		case CfPackage.APPLICATION_ALREADY_INSTALLED:
			return createApplicationAlreadyInstalledFromString(eDataType, initialValue);
		case CfPackage.INVALID_DOM_MGR_IDENTIFIER:
			return createInvalidDomMgrIdentifierFromString(eDataType, initialValue);
		case CfPackage.APPLICATION_UNINSTALLATION_ERROR:
			return createApplicationUninstallationErrorFromString(eDataType, initialValue);
		case CfPackage.INVALID_EVENT_CHANNEL_NAME:
			return createInvalidEventChannelNameFromString(eDataType, initialValue);
		case CfPackage.ALREADY_CONNECTED:
			return createAlreadyConnectedFromString(eDataType, initialValue);
		case CfPackage.NOT_CONNECTED:
			return createNotConnectedFromString(eDataType, initialValue);
		case CfPackage.EVENT_CHANNEL_INFO_ITERATOR_HOLDER:
			return createEventChannelInfoIteratorHolderFromString(eDataType, initialValue);
		case CfPackage.CHANNEL_ALREADY_EXISTS:
			return createChannelAlreadyExistsFromString(eDataType, initialValue);
		case CfPackage.CHANNEL_DOES_NOT_EXIST:
			return createChannelDoesNotExistFromString(eDataType, initialValue);
		case CfPackage.EVENT_CHANNEL_INFO_LIST_HOLDER:
			return createEventChannelInfoListHolderFromString(eDataType, initialValue);
		case CfPackage.EVENT_CHANNEL_REG:
			return createEventChannelRegFromString(eDataType, initialValue);
		case CfPackage.EVENT_REGISTRATION:
			return createEventRegistrationFromString(eDataType, initialValue);
		case CfPackage.EVENT_REGISTRANT_LIST_HOLDER:
			return createEventRegistrantListHolderFromString(eDataType, initialValue);
		case CfPackage.INVALID_CHANNEL_NAME:
			return createInvalidChannelNameFromString(eDataType, initialValue);
		case CfPackage.OPERATION_FAILED:
			return createOperationFailedFromString(eDataType, initialValue);
		case CfPackage.OPERATION_NOT_ALLOWED:
			return createOperationNotAllowedFromString(eDataType, initialValue);
		case CfPackage.PUBLISHER_REG:
			return createPublisherRegFromString(eDataType, initialValue);
		case CfPackage.REGISTRATION_ALREADY_EXISTS:
			return createRegistrationAlreadyExistsFromString(eDataType, initialValue);
		case CfPackage.REGISTRATION_DOES_NOT_EXIST:
			return createRegistrationDoesNotExistFromString(eDataType, initialValue);
		case CfPackage.REGISTRATIONS_EXISTS:
			return createRegistrationsExistsFromString(eDataType, initialValue);
		case CfPackage.SERVICE_UNAVAILABLE:
			return createServiceUnavailableFromString(eDataType, initialValue);
		case CfPackage.EVENT_REGISTRANT_ITERATOR_HOLDER:
			return createEventRegistrantIteratorHolderFromString(eDataType, initialValue);
		case CfPackage.INVALID_PROCESS:
			return createInvalidProcessFromString(eDataType, initialValue);
		case CfPackage.INVALID_FUNCTION:
			return createInvalidFunctionFromString(eDataType, initialValue);
		case CfPackage.INVALID_PARAMETERS:
			return createInvalidParametersFromString(eDataType, initialValue);
		case CfPackage.INVALID_OPTIONS:
			return createInvalidOptionsFromString(eDataType, initialValue);
		case CfPackage.EXECUTE_FAIL:
			return createExecuteFailFromString(eDataType, initialValue);
		case CfPackage.INVALID_FILE_SYSTEM:
			return createInvalidFileSystemFromString(eDataType, initialValue);
		case CfPackage.MOUNT_POINT_ALREADY_EXISTS:
			return createMountPointAlreadyExistsFromString(eDataType, initialValue);
		case CfPackage.NON_EXISTENT_MOUNT:
			return createNonExistentMountFromString(eDataType, initialValue);
		case CfPackage.MOUNT_TYPE_ARRAY:
			return createMountTypeArrayFromString(eDataType, initialValue);
		case CfPackage.IO_EXCEPTION:
			return createIOExceptionFromString(eDataType, initialValue);
		case CfPackage.FILE_EXCEPTION:
			return createFileExceptionFromString(eDataType, initialValue);
		case CfPackage.INVALID_FILE_POINTER:
			return createInvalidFilePointerFromString(eDataType, initialValue);
		case CfPackage.FILE_INFORMATION_TYPE_ARRAY:
			return createFileInformationTypeArrayFromString(eDataType, initialValue);
		case CfPackage.UNKNOWN_FILE_SYSTEM_PROPERTIES:
			return createUnknownFileSystemPropertiesFromString(eDataType, initialValue);
		case CfPackage.INVALID_FILE_NAME:
			return createInvalidFileNameFromString(eDataType, initialValue);
		case CfPackage.INVALID_IDENTIFIER:
			return createInvalidIdentifierFromString(eDataType, initialValue);
		case CfPackage.INVALID_OBJECT_REFERENCE:
			return createInvalidObjectReferenceFromString(eDataType, initialValue);
		case CfPackage.INVALID_PROFILE:
			return createInvalidProfileFromString(eDataType, initialValue);
		case CfPackage.INITIALIZE_ERROR:
			return createInitializeErrorFromString(eDataType, initialValue);
		case CfPackage.RELEASE_ERROR:
			return createReleaseErrorFromString(eDataType, initialValue);
		case CfPackage.LOAD_TYPE:
			return createLoadTypeFromString(eDataType, initialValue);
		case CfPackage.INVALID_LOAD_KIND:
			return createInvalidLoadKindFromString(eDataType, initialValue);
		case CfPackage.LOAD_FAIL:
			return createLoadFailFromString(eDataType, initialValue);
		case CfPackage.LOG_EVENT_ARRAY:
			return createLogEventArrayFromString(eDataType, initialValue);
		case CfPackage.OCTET_SEQUENCE_HOLDER:
			return createOctetSequenceHolderFromString(eDataType, initialValue);
		case CfPackage.INVALID_PORT:
			return createInvalidPortFromString(eDataType, initialValue);
		case CfPackage.OCCUPIED_PORT:
			return createOccupiedPortFromString(eDataType, initialValue);
		case CfPackage.PORT_INFO_TYPE:
			return createPortInfoTypeFromString(eDataType, initialValue);
		case CfPackage.UNKNOWN_PORT:
			return createUnknownPortFromString(eDataType, initialValue);
		case CfPackage.PROPERTIES_HOLDER:
			return createPropertiesHolderFromString(eDataType, initialValue);
		case CfPackage.PROPERTY_CHANGE_EVENT:
			return createPropertyChangeEventFromString(eDataType, initialValue);
		case CfPackage.ALREADY_INITIALIZED:
			return createAlreadyInitializedFromString(eDataType, initialValue);
		case CfPackage.INVALID_CONFIGURATION:
			return createInvalidConfigurationFromString(eDataType, initialValue);
		case CfPackage.PARTIAL_CONFIGURATION:
			return createPartialConfigurationFromString(eDataType, initialValue);
		case CfPackage.UNKNOWN_PROPERTIES:
			return createUnknownPropertiesFromString(eDataType, initialValue);
		case CfPackage.CREATE_RESOURCE_FAILURE:
			return createCreateResourceFailureFromString(eDataType, initialValue);
		case CfPackage.INVALID_RESOURCE_ID:
			return createInvalidResourceIdFromString(eDataType, initialValue);
		case CfPackage.SHUTDOWN_FAILURE:
			return createShutdownFailureFromString(eDataType, initialValue);
		case CfPackage.START_ERROR:
			return createStartErrorFromString(eDataType, initialValue);
		case CfPackage.STOP_ERROR:
			return createStopErrorFromString(eDataType, initialValue);
		case CfPackage.UNKNOWN_TEST:
			return createUnknownTestFromString(eDataType, initialValue);
		case CfPackage.UNKNOWN_IDENTIFIER:
			return createUnknownIdentifierFromString(eDataType, initialValue);
		case CfPackage.UTC_TIME:
			return createUTCTimeFromString(eDataType, initialValue);
		case CfPackage.ORB:
			return createORBFromString(eDataType, initialValue);
		case CfPackage.EVENT_CHANNEL:
			return createEventChannelFromString(eDataType, initialValue);
		case CfPackage.PUSH_CONSUMER:
			return createPushConsumerFromString(eDataType, initialValue);
		case CfPackage.PUSH_SUPPLIER:
			return createPushSupplierFromString(eDataType, initialValue);
		case CfPackage.NAMING_CONTEXT_EXT:
			return createNamingContextExtFromString(eDataType, initialValue);
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
		case CfPackage.ALLOCATION_STATUS_TYPE:
			return convertAllocationStatusTypeToString(eDataType, instanceValue);
		case CfPackage.CREATE_APPLICATION_INSUFFICIENT_CAPACITY_ERROR:
			return convertCreateApplicationInsufficientCapacityErrorToString(eDataType, instanceValue);
		case CfPackage.CREATE_APPLICATION_ERROR:
			return convertCreateApplicationErrorToString(eDataType, instanceValue);
		case CfPackage.CREATE_APPLICATION_REQUEST_ERROR:
			return convertCreateApplicationRequestErrorToString(eDataType, instanceValue);
		case CfPackage.INVALID_INIT_CONFIGURATION:
			return convertInvalidInitConfigurationToString(eDataType, instanceValue);
		case CfPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		case CfPackage.DATA_TYPE_ARRAY:
			return convertDataTypeArrayToString(eDataType, instanceValue);
		case CfPackage.DEVICE_ASSIGNMENT_TYPE_ARRAY:
			return convertDeviceAssignmentTypeArrayToString(eDataType, instanceValue);
		case CfPackage.INVALID_CAPACITY:
			return convertInvalidCapacityToString(eDataType, instanceValue);
		case CfPackage.INVALID_STATE:
			return convertInvalidStateToString(eDataType, instanceValue);
		case CfPackage.DEVICE_MANAGER_NOT_REGISTERED:
			return convertDeviceManagerNotRegisteredToString(eDataType, instanceValue);
		case CfPackage.REGISTER_ERROR:
			return convertRegisterErrorToString(eDataType, instanceValue);
		case CfPackage.UNREGISTER_ERROR:
			return convertUnregisterErrorToString(eDataType, instanceValue);
		case CfPackage.APPLICATION_INSTALLATION_ERROR:
			return convertApplicationInstallationErrorToString(eDataType, instanceValue);
		case CfPackage.APPLICATION_ALREADY_INSTALLED:
			return convertApplicationAlreadyInstalledToString(eDataType, instanceValue);
		case CfPackage.INVALID_DOM_MGR_IDENTIFIER:
			return convertInvalidDomMgrIdentifierToString(eDataType, instanceValue);
		case CfPackage.APPLICATION_UNINSTALLATION_ERROR:
			return convertApplicationUninstallationErrorToString(eDataType, instanceValue);
		case CfPackage.INVALID_EVENT_CHANNEL_NAME:
			return convertInvalidEventChannelNameToString(eDataType, instanceValue);
		case CfPackage.ALREADY_CONNECTED:
			return convertAlreadyConnectedToString(eDataType, instanceValue);
		case CfPackage.NOT_CONNECTED:
			return convertNotConnectedToString(eDataType, instanceValue);
		case CfPackage.EVENT_CHANNEL_INFO_ITERATOR_HOLDER:
			return convertEventChannelInfoIteratorHolderToString(eDataType, instanceValue);
		case CfPackage.CHANNEL_ALREADY_EXISTS:
			return convertChannelAlreadyExistsToString(eDataType, instanceValue);
		case CfPackage.CHANNEL_DOES_NOT_EXIST:
			return convertChannelDoesNotExistToString(eDataType, instanceValue);
		case CfPackage.EVENT_CHANNEL_INFO_LIST_HOLDER:
			return convertEventChannelInfoListHolderToString(eDataType, instanceValue);
		case CfPackage.EVENT_CHANNEL_REG:
			return convertEventChannelRegToString(eDataType, instanceValue);
		case CfPackage.EVENT_REGISTRATION:
			return convertEventRegistrationToString(eDataType, instanceValue);
		case CfPackage.EVENT_REGISTRANT_LIST_HOLDER:
			return convertEventRegistrantListHolderToString(eDataType, instanceValue);
		case CfPackage.INVALID_CHANNEL_NAME:
			return convertInvalidChannelNameToString(eDataType, instanceValue);
		case CfPackage.OPERATION_FAILED:
			return convertOperationFailedToString(eDataType, instanceValue);
		case CfPackage.OPERATION_NOT_ALLOWED:
			return convertOperationNotAllowedToString(eDataType, instanceValue);
		case CfPackage.PUBLISHER_REG:
			return convertPublisherRegToString(eDataType, instanceValue);
		case CfPackage.REGISTRATION_ALREADY_EXISTS:
			return convertRegistrationAlreadyExistsToString(eDataType, instanceValue);
		case CfPackage.REGISTRATION_DOES_NOT_EXIST:
			return convertRegistrationDoesNotExistToString(eDataType, instanceValue);
		case CfPackage.REGISTRATIONS_EXISTS:
			return convertRegistrationsExistsToString(eDataType, instanceValue);
		case CfPackage.SERVICE_UNAVAILABLE:
			return convertServiceUnavailableToString(eDataType, instanceValue);
		case CfPackage.EVENT_REGISTRANT_ITERATOR_HOLDER:
			return convertEventRegistrantIteratorHolderToString(eDataType, instanceValue);
		case CfPackage.INVALID_PROCESS:
			return convertInvalidProcessToString(eDataType, instanceValue);
		case CfPackage.INVALID_FUNCTION:
			return convertInvalidFunctionToString(eDataType, instanceValue);
		case CfPackage.INVALID_PARAMETERS:
			return convertInvalidParametersToString(eDataType, instanceValue);
		case CfPackage.INVALID_OPTIONS:
			return convertInvalidOptionsToString(eDataType, instanceValue);
		case CfPackage.EXECUTE_FAIL:
			return convertExecuteFailToString(eDataType, instanceValue);
		case CfPackage.INVALID_FILE_SYSTEM:
			return convertInvalidFileSystemToString(eDataType, instanceValue);
		case CfPackage.MOUNT_POINT_ALREADY_EXISTS:
			return convertMountPointAlreadyExistsToString(eDataType, instanceValue);
		case CfPackage.NON_EXISTENT_MOUNT:
			return convertNonExistentMountToString(eDataType, instanceValue);
		case CfPackage.MOUNT_TYPE_ARRAY:
			return convertMountTypeArrayToString(eDataType, instanceValue);
		case CfPackage.IO_EXCEPTION:
			return convertIOExceptionToString(eDataType, instanceValue);
		case CfPackage.FILE_EXCEPTION:
			return convertFileExceptionToString(eDataType, instanceValue);
		case CfPackage.INVALID_FILE_POINTER:
			return convertInvalidFilePointerToString(eDataType, instanceValue);
		case CfPackage.FILE_INFORMATION_TYPE_ARRAY:
			return convertFileInformationTypeArrayToString(eDataType, instanceValue);
		case CfPackage.UNKNOWN_FILE_SYSTEM_PROPERTIES:
			return convertUnknownFileSystemPropertiesToString(eDataType, instanceValue);
		case CfPackage.INVALID_FILE_NAME:
			return convertInvalidFileNameToString(eDataType, instanceValue);
		case CfPackage.INVALID_IDENTIFIER:
			return convertInvalidIdentifierToString(eDataType, instanceValue);
		case CfPackage.INVALID_OBJECT_REFERENCE:
			return convertInvalidObjectReferenceToString(eDataType, instanceValue);
		case CfPackage.INVALID_PROFILE:
			return convertInvalidProfileToString(eDataType, instanceValue);
		case CfPackage.INITIALIZE_ERROR:
			return convertInitializeErrorToString(eDataType, instanceValue);
		case CfPackage.RELEASE_ERROR:
			return convertReleaseErrorToString(eDataType, instanceValue);
		case CfPackage.LOAD_TYPE:
			return convertLoadTypeToString(eDataType, instanceValue);
		case CfPackage.INVALID_LOAD_KIND:
			return convertInvalidLoadKindToString(eDataType, instanceValue);
		case CfPackage.LOAD_FAIL:
			return convertLoadFailToString(eDataType, instanceValue);
		case CfPackage.LOG_EVENT_ARRAY:
			return convertLogEventArrayToString(eDataType, instanceValue);
		case CfPackage.OCTET_SEQUENCE_HOLDER:
			return convertOctetSequenceHolderToString(eDataType, instanceValue);
		case CfPackage.INVALID_PORT:
			return convertInvalidPortToString(eDataType, instanceValue);
		case CfPackage.OCCUPIED_PORT:
			return convertOccupiedPortToString(eDataType, instanceValue);
		case CfPackage.PORT_INFO_TYPE:
			return convertPortInfoTypeToString(eDataType, instanceValue);
		case CfPackage.UNKNOWN_PORT:
			return convertUnknownPortToString(eDataType, instanceValue);
		case CfPackage.PROPERTIES_HOLDER:
			return convertPropertiesHolderToString(eDataType, instanceValue);
		case CfPackage.PROPERTY_CHANGE_EVENT:
			return convertPropertyChangeEventToString(eDataType, instanceValue);
		case CfPackage.ALREADY_INITIALIZED:
			return convertAlreadyInitializedToString(eDataType, instanceValue);
		case CfPackage.INVALID_CONFIGURATION:
			return convertInvalidConfigurationToString(eDataType, instanceValue);
		case CfPackage.PARTIAL_CONFIGURATION:
			return convertPartialConfigurationToString(eDataType, instanceValue);
		case CfPackage.UNKNOWN_PROPERTIES:
			return convertUnknownPropertiesToString(eDataType, instanceValue);
		case CfPackage.CREATE_RESOURCE_FAILURE:
			return convertCreateResourceFailureToString(eDataType, instanceValue);
		case CfPackage.INVALID_RESOURCE_ID:
			return convertInvalidResourceIdToString(eDataType, instanceValue);
		case CfPackage.SHUTDOWN_FAILURE:
			return convertShutdownFailureToString(eDataType, instanceValue);
		case CfPackage.START_ERROR:
			return convertStartErrorToString(eDataType, instanceValue);
		case CfPackage.STOP_ERROR:
			return convertStopErrorToString(eDataType, instanceValue);
		case CfPackage.UNKNOWN_TEST:
			return convertUnknownTestToString(eDataType, instanceValue);
		case CfPackage.UNKNOWN_IDENTIFIER:
			return convertUnknownIdentifierToString(eDataType, instanceValue);
		case CfPackage.UTC_TIME:
			return convertUTCTimeToString(eDataType, instanceValue);
		case CfPackage.ORB:
			return convertORBToString(eDataType, instanceValue);
		case CfPackage.EVENT_CHANNEL:
			return convertEventChannelToString(eDataType, instanceValue);
		case CfPackage.PUSH_CONSUMER:
			return convertPushConsumerToString(eDataType, instanceValue);
		case CfPackage.PUSH_SUPPLIER:
			return convertPushSupplierToString(eDataType, instanceValue);
		case CfPackage.NAMING_CONTEXT_EXT:
			return convertNamingContextExtToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationStatusType createAllocationStatusTypeFromString(EDataType eDataType, String initialValue) {
		return (AllocationStatusType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannel createEventChannelFromString(EDataType eDataType, String initialValue) {
		return (EventChannel) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventChannelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		return (DataType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType[] createDataTypeArrayFromString(EDataType eDataType, String initialValue) {
		return (DataType[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingContextExt createNamingContextExtFromString(EDataType eDataType, String initialValue) {
		return (NamingContextExt) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingContextExtToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushConsumer createPushConsumerFromString(EDataType eDataType, String initialValue) {
		return (PushConsumer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPushConsumerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushSupplier createPushSupplierFromString(EDataType eDataType, String initialValue) {
		return (PushSupplier) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPushSupplierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORB createORBFromString(EDataType eDataType, String initialValue) {
		return (ORB) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertORBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidObjectReference createInvalidObjectReferenceFromString(EDataType eDataType, String initialValue) {
		return (InvalidObjectReference) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidObjectReferenceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateApplicationInsufficientCapacityError createCreateApplicationInsufficientCapacityErrorFromString(EDataType eDataType, String initialValue) {
		return (CreateApplicationInsufficientCapacityError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateApplicationInsufficientCapacityErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAssignmentType[] createDeviceAssignmentTypeArrayFromString(EDataType eDataType, String initialValue) {
		return (DeviceAssignmentType[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceAssignmentTypeArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateApplicationError createCreateApplicationErrorFromString(EDataType eDataType, String initialValue) {
		return (CreateApplicationError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateApplicationErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateApplicationRequestError createCreateApplicationRequestErrorFromString(EDataType eDataType, String initialValue) {
		return (CreateApplicationRequestError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateApplicationRequestErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidInitConfiguration createInvalidInitConfigurationFromString(EDataType eDataType, String initialValue) {
		return (InvalidInitConfiguration) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidInitConfigurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidCapacity createInvalidCapacityFromString(EDataType eDataType, String initialValue) {
		return (InvalidCapacity) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidCapacityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidState createInvalidStateFromString(EDataType eDataType, String initialValue) {
		return (InvalidState) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidStateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidProfile createInvalidProfileFromString(EDataType eDataType, String initialValue) {
		return (InvalidProfile) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidProfileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceManagerNotRegistered createDeviceManagerNotRegisteredFromString(EDataType eDataType, String initialValue) {
		return (DeviceManagerNotRegistered) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceManagerNotRegisteredToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterError createRegisterErrorFromString(EDataType eDataType, String initialValue) {
		return (RegisterError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegisterErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisterError createUnregisterErrorFromString(EDataType eDataType, String initialValue) {
		return (UnregisterError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnregisterErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidFileName createInvalidFileNameFromString(EDataType eDataType, String initialValue) {
		return (InvalidFileName) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidFileNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInstallationError createApplicationInstallationErrorFromString(EDataType eDataType, String initialValue) {
		return (ApplicationInstallationError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationInstallationErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAlreadyInstalled createApplicationAlreadyInstalledFromString(EDataType eDataType, String initialValue) {
		return (ApplicationAlreadyInstalled) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationAlreadyInstalledToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidIdentifier createInvalidDomMgrIdentifierFromString(EDataType eDataType, String initialValue) {
		return (InvalidIdentifier) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidDomMgrIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF.InvalidIdentifier createInvalidIdentifierFromString(EDataType eDataType, String initialValue) {
		return (CF.InvalidIdentifier) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUninstallationError createApplicationUninstallationErrorFromString(EDataType eDataType, String initialValue) {
		return (ApplicationUninstallationError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationUninstallationErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidEventChannelName createInvalidEventChannelNameFromString(EDataType eDataType, String initialValue) {
		return (InvalidEventChannelName) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidEventChannelNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlreadyConnected createAlreadyConnectedFromString(EDataType eDataType, String initialValue) {
		return (AlreadyConnected) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlreadyConnectedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotConnected createNotConnectedFromString(EDataType eDataType, String initialValue) {
		return (NotConnected) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotConnectedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannelInfoIteratorHolder createEventChannelInfoIteratorHolderFromString(EDataType eDataType, String initialValue) {
		return (EventChannelInfoIteratorHolder) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventChannelInfoIteratorHolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelAlreadyExists createChannelAlreadyExistsFromString(EDataType eDataType, String initialValue) {
		return (ChannelAlreadyExists) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelAlreadyExistsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelDoesNotExist createChannelDoesNotExistFromString(EDataType eDataType, String initialValue) {
		return (ChannelDoesNotExist) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelDoesNotExistToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannelInfoListHolder createEventChannelInfoListHolderFromString(EDataType eDataType, String initialValue) {
		return (EventChannelInfoListHolder) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventChannelInfoListHolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannelReg createEventChannelRegFromString(EDataType eDataType, String initialValue) {
		return (EventChannelReg) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventChannelRegToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRegistration createEventRegistrationFromString(EDataType eDataType, String initialValue) {
		return (EventRegistration) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventRegistrationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRegistrantListHolder createEventRegistrantListHolderFromString(EDataType eDataType, String initialValue) {
		return (EventRegistrantListHolder) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventRegistrantListHolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidChannelName createInvalidChannelNameFromString(EDataType eDataType, String initialValue) {
		return (InvalidChannelName) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidChannelNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFailed createOperationFailedFromString(EDataType eDataType, String initialValue) {
		return (OperationFailed) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationFailedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationNotAllowed createOperationNotAllowedFromString(EDataType eDataType, String initialValue) {
		return (OperationNotAllowed) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationNotAllowedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherReg createPublisherRegFromString(EDataType eDataType, String initialValue) {
		return (PublisherReg) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublisherRegToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationAlreadyExists createRegistrationAlreadyExistsFromString(EDataType eDataType, String initialValue) {
		return (RegistrationAlreadyExists) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrationAlreadyExistsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationDoesNotExist createRegistrationDoesNotExistFromString(EDataType eDataType, String initialValue) {
		return (RegistrationDoesNotExist) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrationDoesNotExistToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationsExists createRegistrationsExistsFromString(EDataType eDataType, String initialValue) {
		return (RegistrationsExists) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrationsExistsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUnavailable createServiceUnavailableFromString(EDataType eDataType, String initialValue) {
		return (ServiceUnavailable) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceUnavailableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRegistrantIteratorHolder createEventRegistrantIteratorHolderFromString(EDataType eDataType, String initialValue) {
		return (EventRegistrantIteratorHolder) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventRegistrantIteratorHolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidProcess createInvalidProcessFromString(EDataType eDataType, String initialValue) {
		return (InvalidProcess) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidProcessToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidFunction createInvalidFunctionFromString(EDataType eDataType, String initialValue) {
		return (InvalidFunction) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidFunctionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidParameters createInvalidParametersFromString(EDataType eDataType, String initialValue) {
		return (InvalidParameters) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidParametersToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidOptions createInvalidOptionsFromString(EDataType eDataType, String initialValue) {
		return (InvalidOptions) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidOptionsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteFail createExecuteFailFromString(EDataType eDataType, String initialValue) {
		return (ExecuteFail) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecuteFailToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidFileSystem createInvalidFileSystemFromString(EDataType eDataType, String initialValue) {
		return (InvalidFileSystem) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidFileSystemToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountPointAlreadyExists createMountPointAlreadyExistsFromString(EDataType eDataType, String initialValue) {
		return (MountPointAlreadyExists) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMountPointAlreadyExistsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonExistentMount createNonExistentMountFromString(EDataType eDataType, String initialValue) {
		return (NonExistentMount) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonExistentMountToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountType[] createMountTypeArrayFromString(EDataType eDataType, String initialValue) {
		return (MountType[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMountTypeArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctetSequenceHolder createOctetSequenceHolderFromString(EDataType eDataType, String initialValue) {
		return (OctetSequenceHolder) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOctetSequenceHolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileException createFileExceptionFromString(EDataType eDataType, String initialValue) {
		return (FileException) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidFilePointer createInvalidFilePointerFromString(EDataType eDataType, String initialValue) {
		return (InvalidFilePointer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidFilePointerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileInformationType[] createFileInformationTypeArrayFromString(EDataType eDataType, String initialValue) {
		return (FileInformationType[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileInformationTypeArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesHolder createPropertiesHolderFromString(EDataType eDataType, String initialValue) {
		return (PropertiesHolder) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertiesHolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownFileSystemProperties createUnknownFileSystemPropertiesFromString(EDataType eDataType, String initialValue) {
		return (UnknownFileSystemProperties) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownFileSystemPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializeError createInitializeErrorFromString(EDataType eDataType, String initialValue) {
		return (InitializeError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitializeErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseError createReleaseErrorFromString(EDataType eDataType, String initialValue) {
		return (ReleaseError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReleaseErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadType createLoadTypeFromString(EDataType eDataType, String initialValue) {
		return (LoadType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidLoadKind createInvalidLoadKindFromString(EDataType eDataType, String initialValue) {
		return (InvalidLoadKind) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidLoadKindToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadFail createLoadFailFromString(EDataType eDataType, String initialValue) {
		return (LoadFail) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadFailToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidPort createInvalidPortFromString(EDataType eDataType, String initialValue) {
		return (InvalidPort) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidPortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupiedPort createOccupiedPortFromString(EDataType eDataType, String initialValue) {
		return (OccupiedPort) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccupiedPortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInfoType createPortInfoTypeFromString(EDataType eDataType, String initialValue) {
		return (PortInfoType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortInfoTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownPort createUnknownPortFromString(EDataType eDataType, String initialValue) {
		return (UnknownPort) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownPortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeEvent createPropertyChangeEventFromString(EDataType eDataType, String initialValue) {
		return (PropertyChangeEvent) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyChangeEventToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlreadyInitialized createAlreadyInitializedFromString(EDataType eDataType, String initialValue) {
		return (AlreadyInitialized) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlreadyInitializedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidConfiguration createInvalidConfigurationFromString(EDataType eDataType, String initialValue) {
		return (InvalidConfiguration) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidConfigurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialConfiguration createPartialConfigurationFromString(EDataType eDataType, String initialValue) {
		return (PartialConfiguration) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartialConfigurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownProperties createUnknownPropertiesFromString(EDataType eDataType, String initialValue) {
		return (UnknownProperties) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateResourceFailure createCreateResourceFailureFromString(EDataType eDataType, String initialValue) {
		return (CreateResourceFailure) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateResourceFailureToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidResourceId createInvalidResourceIdFromString(EDataType eDataType, String initialValue) {
		return (InvalidResourceId) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidResourceIdToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownFailure createShutdownFailureFromString(EDataType eDataType, String initialValue) {
		return (ShutdownFailure) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownFailureToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartError createStartErrorFromString(EDataType eDataType, String initialValue) {
		return (StartError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopError createStopErrorFromString(EDataType eDataType, String initialValue) {
		return (StopError) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStopErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownTest createUnknownTestFromString(EDataType eDataType, String initialValue) {
		return (UnknownTest) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownTestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownIdentifier createUnknownIdentifierFromString(EDataType eDataType, String initialValue) {
		return (UnknownIdentifier) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTCTime createUTCTimeFromString(EDataType eDataType, String initialValue) {
		return (UTCTime) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUTCTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEvent[] createLogEventArrayFromString(EDataType eDataType, String initialValue) {
		return (LogEvent[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogEventArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfPackage getCfPackage() {
		return (CfPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CfPackage getPackage() {
		return CfPackage.eINSTANCE;
	}

} //CfFactoryImpl
