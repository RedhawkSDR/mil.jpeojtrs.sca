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
package mil.jpeojtrs.sca.cf.util;

import mil.jpeojtrs.sca.cf.CfPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.omg.CORBA.portable.IDLEntity;

import CF.AggregateDevice;
import CF.AggregateDeviceOperations;
import CF.AggregateExecutableDevice;
import CF.AggregateExecutableDeviceOperations;
import CF.AggregateLoadableDevice;
import CF.AggregateLoadableDeviceOperations;
import CF.AggregatePlainDevice;
import CF.AggregatePlainDeviceOperations;
import CF.Application;
import CF.ApplicationFactory;
import CF.ApplicationFactoryOperations;
import CF.ApplicationOperations;
import CF.Device;
import CF.DeviceManager;
import CF.DeviceManagerOperations;
import CF.DeviceOperations;
import CF.DomainManager;
import CF.DomainManagerOperations;
import CF.ExecutableDevice;
import CF.ExecutableDeviceOperations;
import CF.File;
import CF.FileManager;
import CF.FileManagerOperations;
import CF.FileOperations;
import CF.FileSystem;
import CF.FileSystemOperations;
import CF.LifeCycle;
import CF.LifeCycleOperations;
import CF.LoadableDevice;
import CF.LoadableDeviceOperations;
import CF.LogConfiguration;
import CF.LogConfigurationOperations;
import CF.LogEventConsumer;
import CF.LogEventConsumerOperations;
import CF.Logging;
import CF.LoggingOperations;
import CF.Port;
import CF.PortOperations;
import CF.PortSupplier;
import CF.PortSupplierOperations;
import CF.PropertyEmitter;
import CF.PropertyEmitterOperations;
import CF.PropertySet;
import CF.PropertySetOperations;
import CF.Resource;
import CF.ResourceFactory;
import CF.ResourceFactoryOperations;
import CF.ResourceOperations;
import CF.TestableObject;
import CF.TestableObjectOperations;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.cf.CfPackage
 * @generated
 */
public class CfAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfSwitch<Adapter> modelSwitch = new CfSwitch<Adapter>() {
		@Override
		public Adapter caseObject(org.omg.CORBA.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseIDLEntity(IDLEntity object) {
			return createIDLEntityAdapter();
		}

		@Override
		public Adapter caseAggregateDevice(AggregateDevice object) {
			return createAggregateDeviceAdapter();
		}

		@Override
		public Adapter caseAggregateDeviceOperations(AggregateDeviceOperations object) {
			return createAggregateDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseAggregateExecutableDevice(AggregateExecutableDevice object) {
			return createAggregateExecutableDeviceAdapter();
		}

		@Override
		public Adapter caseAggregateExecutableDeviceOperations(AggregateExecutableDeviceOperations object) {
			return createAggregateExecutableDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseAggregateLoadableDevice(AggregateLoadableDevice object) {
			return createAggregateLoadableDeviceAdapter();
		}

		@Override
		public Adapter caseAggregateLoadableDeviceOperations(AggregateLoadableDeviceOperations object) {
			return createAggregateLoadableDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseAggregatePlainDevice(AggregatePlainDevice object) {
			return createAggregatePlainDeviceAdapter();
		}

		@Override
		public Adapter caseAggregatePlainDeviceOperations(AggregatePlainDeviceOperations object) {
			return createAggregatePlainDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseApplication(Application object) {
			return createApplicationAdapter();
		}

		@Override
		public Adapter caseApplicationFactory(ApplicationFactory object) {
			return createApplicationFactoryAdapter();
		}

		@Override
		public Adapter caseApplicationFactoryOperations(ApplicationFactoryOperations object) {
			return createApplicationFactoryOperationsAdapter();
		}

		@Override
		public Adapter caseApplicationOperations(ApplicationOperations object) {
			return createApplicationOperationsAdapter();
		}

		@Override
		public Adapter caseDevice(Device object) {
			return createDeviceAdapter();
		}

		@Override
		public Adapter caseDeviceManager(DeviceManager object) {
			return createDeviceManagerAdapter();
		}

		@Override
		public Adapter caseDeviceManagerOperations(DeviceManagerOperations object) {
			return createDeviceManagerOperationsAdapter();
		}

		@Override
		public Adapter caseDeviceOperations(DeviceOperations object) {
			return createDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseDomainManager(DomainManager object) {
			return createDomainManagerAdapter();
		}

		@Override
		public Adapter caseDomainManagerOperations(DomainManagerOperations object) {
			return createDomainManagerOperationsAdapter();
		}

		@Override
		public Adapter caseExecutableDevice(ExecutableDevice object) {
			return createExecutableDeviceAdapter();
		}

		@Override
		public Adapter caseExecutableDeviceOperations(ExecutableDeviceOperations object) {
			return createExecutableDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseFileManager(FileManager object) {
			return createFileManagerAdapter();
		}

		@Override
		public Adapter caseFileManagerOperations(FileManagerOperations object) {
			return createFileManagerOperationsAdapter();
		}

		@Override
		public Adapter caseFileOperations(FileOperations object) {
			return createFileOperationsAdapter();
		}

		@Override
		public Adapter caseFileSystem(FileSystem object) {
			return createFileSystemAdapter();
		}

		@Override
		public Adapter caseFileSystemOperations(FileSystemOperations object) {
			return createFileSystemOperationsAdapter();
		}

		@Override
		public Adapter caseLifeCycle(LifeCycle object) {
			return createLifeCycleAdapter();
		}

		@Override
		public Adapter caseLifeCycleOperations(LifeCycleOperations object) {
			return createLifeCycleOperationsAdapter();
		}

		@Override
		public Adapter caseLoadableDevice(LoadableDevice object) {
			return createLoadableDeviceAdapter();
		}

		@Override
		public Adapter caseLoadableDeviceOperations(LoadableDeviceOperations object) {
			return createLoadableDeviceOperationsAdapter();
		}

		@Override
		public Adapter caseLogging(Logging object) {
			return createLoggingAdapter();
		}

		@Override
		public Adapter caseLoggingOperations(LoggingOperations object) {
			return createLoggingOperationsAdapter();
		}

		@Override
		public Adapter caseLogEventConsumer(LogEventConsumer object) {
			return createLogEventConsumerAdapter();
		}

		@Override
		public Adapter caseLogEventConsumerOperations(LogEventConsumerOperations object) {
			return createLogEventConsumerOperationsAdapter();
		}

		@Override
		public Adapter caseLogConfiguration(LogConfiguration object) {
			return createLogConfigurationAdapter();
		}

		@Override
		public Adapter caseLogConfigurationOperations(LogConfigurationOperations object) {
			return createLogConfigurationOperationsAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter casePortOperations(PortOperations object) {
			return createPortOperationsAdapter();
		}

		@Override
		public Adapter casePortSupplier(PortSupplier object) {
			return createPortSupplierAdapter();
		}

		@Override
		public Adapter casePortSupplierOperations(PortSupplierOperations object) {
			return createPortSupplierOperationsAdapter();
		}

		@Override
		public Adapter casePropertyEmitter(PropertyEmitter object) {
			return createPropertyEmitterAdapter();
		}

		@Override
		public Adapter casePropertyEmitterOperations(PropertyEmitterOperations object) {
			return createPropertyEmitterOperationsAdapter();
		}

		@Override
		public Adapter casePropertySet(PropertySet object) {
			return createPropertySetAdapter();
		}

		@Override
		public Adapter casePropertySetOperations(PropertySetOperations object) {
			return createPropertySetOperationsAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseResourceFactory(ResourceFactory object) {
			return createResourceFactoryAdapter();
		}

		@Override
		public Adapter caseResourceFactoryOperations(ResourceFactoryOperations object) {
			return createResourceFactoryOperationsAdapter();
		}

		@Override
		public Adapter caseResourceOperations(ResourceOperations object) {
			return createResourceOperationsAdapter();
		}

		@Override
		public Adapter caseTestableObject(TestableObject object) {
			return createTestableObjectAdapter();
		}

		@Override
		public Adapter caseTestableObjectOperations(TestableObjectOperations object) {
			return createTestableObjectOperationsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CORBA.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CORBA.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CORBA.portable.IDLEntity <em>IDL Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CORBA.portable.IDLEntity
	 * @generated
	 */
	public Adapter createIDLEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregateDevice <em>Aggregate Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregateDevice
	 * @generated
	 */
	public Adapter createAggregateDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregateDeviceOperations <em>Aggregate Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregateDeviceOperations
	 * @generated
	 */
	public Adapter createAggregateDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregateExecutableDevice <em>Aggregate Executable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregateExecutableDevice
	 * @generated
	 */
	public Adapter createAggregateExecutableDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregateExecutableDeviceOperations <em>Aggregate Executable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregateExecutableDeviceOperations
	 * @generated
	 */
	public Adapter createAggregateExecutableDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregateLoadableDevice <em>Aggregate Loadable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregateLoadableDevice
	 * @generated
	 */
	public Adapter createAggregateLoadableDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregateLoadableDeviceOperations <em>Aggregate Loadable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregateLoadableDeviceOperations
	 * @generated
	 */
	public Adapter createAggregateLoadableDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregatePlainDevice <em>Aggregate Plain Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregatePlainDevice
	 * @generated
	 */
	public Adapter createAggregatePlainDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.AggregatePlainDeviceOperations <em>Aggregate Plain Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.AggregatePlainDeviceOperations
	 * @generated
	 */
	public Adapter createAggregatePlainDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ApplicationFactory <em>Application Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ApplicationFactory
	 * @generated
	 */
	public Adapter createApplicationFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ApplicationFactoryOperations <em>Application Factory Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ApplicationFactoryOperations
	 * @generated
	 */
	public Adapter createApplicationFactoryOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ApplicationOperations <em>Application Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ApplicationOperations
	 * @generated
	 */
	public Adapter createApplicationOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.DeviceManager <em>Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.DeviceManager
	 * @generated
	 */
	public Adapter createDeviceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.DeviceManagerOperations <em>Device Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.DeviceManagerOperations
	 * @generated
	 */
	public Adapter createDeviceManagerOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.DeviceOperations <em>Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.DeviceOperations
	 * @generated
	 */
	public Adapter createDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.DomainManager <em>Domain Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.DomainManager
	 * @generated
	 */
	public Adapter createDomainManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.DomainManagerOperations <em>Domain Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.DomainManagerOperations
	 * @generated
	 */
	public Adapter createDomainManagerOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ExecutableDevice <em>Executable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ExecutableDevice
	 * @generated
	 */
	public Adapter createExecutableDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ExecutableDeviceOperations <em>Executable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ExecutableDeviceOperations
	 * @generated
	 */
	public Adapter createExecutableDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.FileManager <em>File Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.FileManager
	 * @generated
	 */
	public Adapter createFileManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.FileManagerOperations <em>File Manager Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.FileManagerOperations
	 * @generated
	 */
	public Adapter createFileManagerOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.FileOperations <em>File Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.FileOperations
	 * @generated
	 */
	public Adapter createFileOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.FileSystem
	 * @generated
	 */
	public Adapter createFileSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.FileSystemOperations <em>File System Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.FileSystemOperations
	 * @generated
	 */
	public Adapter createFileSystemOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LifeCycle
	 * @generated
	 */
	public Adapter createLifeCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LifeCycleOperations <em>Life Cycle Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LifeCycleOperations
	 * @generated
	 */
	public Adapter createLifeCycleOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LoadableDevice <em>Loadable Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LoadableDevice
	 * @generated
	 */
	public Adapter createLoadableDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LoadableDeviceOperations <em>Loadable Device Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LoadableDeviceOperations
	 * @generated
	 */
	public Adapter createLoadableDeviceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.Logging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.Logging
	 * @generated
	 */
	public Adapter createLoggingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LoggingOperations <em>Logging Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LoggingOperations
	 * @generated
	 */
	public Adapter createLoggingOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LogEventConsumer <em>Log Event Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LogEventConsumer
	 * @generated
	 */
	public Adapter createLogEventConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LogEventConsumerOperations <em>Log Event Consumer Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LogEventConsumerOperations
	 * @generated
	 */
	public Adapter createLogEventConsumerOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LogConfiguration <em>Log Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LogConfiguration
	 * @generated
	 */
	public Adapter createLogConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.LogConfigurationOperations <em>Log Configuration Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.LogConfigurationOperations
	 * @generated
	 */
	public Adapter createLogConfigurationOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PortOperations <em>Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PortOperations
	 * @generated
	 */
	public Adapter createPortOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PortSupplier <em>Port Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PortSupplier
	 * @generated
	 */
	public Adapter createPortSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PortSupplierOperations <em>Port Supplier Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PortSupplierOperations
	 * @generated
	 */
	public Adapter createPortSupplierOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PropertyEmitter <em>Property Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PropertyEmitter
	 * @generated
	 */
	public Adapter createPropertyEmitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PropertyEmitterOperations <em>Property Emitter Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PropertyEmitterOperations
	 * @generated
	 */
	public Adapter createPropertyEmitterOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PropertySet
	 * @generated
	 */
	public Adapter createPropertySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PropertySetOperations <em>Property Set Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PropertySetOperations
	 * @generated
	 */
	public Adapter createPropertySetOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ResourceFactory <em>Resource Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ResourceFactory
	 * @generated
	 */
	public Adapter createResourceFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ResourceFactoryOperations <em>Resource Factory Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ResourceFactoryOperations
	 * @generated
	 */
	public Adapter createResourceFactoryOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.ResourceOperations <em>Resource Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.ResourceOperations
	 * @generated
	 */
	public Adapter createResourceOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.TestableObject <em>Testable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.TestableObject
	 * @generated
	 */
	public Adapter createTestableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.TestableObjectOperations <em>Testable Object Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.TestableObjectOperations
	 * @generated
	 */
	public Adapter createTestableObjectOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CfAdapterFactory
