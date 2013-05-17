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
package mil.jpeojtrs.sca.dcd.util;

import mil.jpeojtrs.sca.dcd.CompositePartOfDevice;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DcdConnectInterface;
import mil.jpeojtrs.sca.dcd.DcdConnections;
import mil.jpeojtrs.sca.dcd.DcdDocumentRoot;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DcdPartitioning;
import mil.jpeojtrs.sca.dcd.DcdProvidesPort;
import mil.jpeojtrs.sca.dcd.DcdUsesPort;
import mil.jpeojtrs.sca.dcd.DeployOnDevice;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg;
import mil.jpeojtrs.sca.dcd.DevicePkgFile;
import mil.jpeojtrs.sca.dcd.DomainManager;
import mil.jpeojtrs.sca.dcd.FileSystemName;
import mil.jpeojtrs.sca.dcd.FileSystemNames;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.ConnectInterface;
import mil.jpeojtrs.sca.partitioning.Connections;
import mil.jpeojtrs.sca.partitioning.Partitioning;
import mil.jpeojtrs.sca.partitioning.ProvidesPort;
import mil.jpeojtrs.sca.partitioning.UsesPort;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dcd.DcdPackage
 * @generated
 */
public class DcdAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DcdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DcdPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcdSwitch<Adapter> modelSwitch =
		new DcdSwitch<Adapter>() {
			@Override
			public Adapter caseDcdComponentPlacement(DcdComponentPlacement object) {
				return createDcdComponentPlacementAdapter();
			}
			@Override
			public Adapter caseDcdComponentInstantiation(DcdComponentInstantiation object) {
				return createDcdComponentInstantiationAdapter();
			}
			@Override
			public Adapter caseDcdPartitioning(DcdPartitioning object) {
				return createDcdPartitioningAdapter();
			}
			@Override
			public Adapter caseDcdComponentInstantiationRef(DcdComponentInstantiationRef object) {
				return createDcdComponentInstantiationRefAdapter();
			}
			@Override
			public Adapter caseDcdConnectInterface(DcdConnectInterface object) {
				return createDcdConnectInterfaceAdapter();
			}
			@Override
			public Adapter caseDcdUsesPort(DcdUsesPort object) {
				return createDcdUsesPortAdapter();
			}
			@Override
			public Adapter caseDcdProvidesPort(DcdProvidesPort object) {
				return createDcdProvidesPortAdapter();
			}
			@Override
			public Adapter caseDcdConnections(DcdConnections object) {
				return createDcdConnectionsAdapter();
			}
			@Override
			public Adapter caseCompositePartOfDevice(CompositePartOfDevice object) {
				return createCompositePartOfDeviceAdapter();
			}
			@Override
			public Adapter caseDcdDocumentRoot(DcdDocumentRoot object) {
				return createDcdDocumentRootAdapter();
			}
			@Override
			public Adapter caseDeployOnDevice(DeployOnDevice object) {
				return createDeployOnDeviceAdapter();
			}
			@Override
			public Adapter caseDeviceConfiguration(DeviceConfiguration object) {
				return createDeviceConfigurationAdapter();
			}
			@Override
			public Adapter caseDeviceManagerSoftPkg(DeviceManagerSoftPkg object) {
				return createDeviceManagerSoftPkgAdapter();
			}
			@Override
			public Adapter caseDevicePkgFile(DevicePkgFile object) {
				return createDevicePkgFileAdapter();
			}
			@Override
			public Adapter caseDomainManager(DomainManager object) {
				return createDomainManagerAdapter();
			}
			@Override
			public Adapter caseFileSystemName(FileSystemName object) {
				return createFileSystemNameAdapter();
			}
			@Override
			public Adapter caseFileSystemNames(FileSystemNames object) {
				return createFileSystemNamesAdapter();
			}
			@Override
			public <I extends ComponentInstantiation> Adapter caseComponentPlacement(ComponentPlacement<I> object) {
				return createComponentPlacementAdapter();
			}
			@Override
			public Adapter caseComponentInstantiation(ComponentInstantiation object) {
				return createComponentInstantiationAdapter();
			}
			@Override
			public <C extends ComponentPlacement<?>> Adapter casePartitioning(Partitioning<C> object) {
				return createPartitioningAdapter();
			}
			@Override
			public <R extends ComponentInstantiation> Adapter caseComponentInstantiationRef(ComponentInstantiationRef<R> object) {
				return createComponentInstantiationRefAdapter();
			}
			@Override
			public <CIR extends ComponentInstantiationRef<?>, UP extends UsesPort<CIR>, PP extends ProvidesPort<CIR>> Adapter caseConnectInterface(ConnectInterface<CIR, UP, PP> object) {
				return createConnectInterfaceAdapter();
			}
			@Override
			public <U extends ComponentInstantiationRef<?>> Adapter caseUsesPort(UsesPort<U> object) {
				return createUsesPortAdapter();
			}
			@Override
			public <P extends ComponentInstantiationRef<?>> Adapter caseProvidesPort(ProvidesPort<P> object) {
				return createProvidesPortAdapter();
			}
			@Override
			public <CI extends ConnectInterface<?, ?, ?>> Adapter caseConnections(Connections<CI> object) {
				return createConnectionsAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement
	 * @generated
	 */
	public Adapter createDcdComponentPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentInstantiation
	 * @generated
	 */
	public Adapter createDcdComponentInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdPartitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdPartitioning
	 * @generated
	 */
	public Adapter createDcdPartitioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef
	 * @generated
	 */
	public Adapter createDcdComponentInstantiationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdConnectInterface
	 * @generated
	 */
	public Adapter createDcdConnectInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdUsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdUsesPort
	 * @generated
	 */
	public Adapter createDcdUsesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdProvidesPort
	 * @generated
	 */
	public Adapter createDcdProvidesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdConnections
	 * @generated
	 */
	public Adapter createDcdConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice <em>Composite Part Of Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.CompositePartOfDevice
	 * @generated
	 */
	public Adapter createCompositePartOfDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DcdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DcdDocumentRoot
	 * @generated
	 */
	public Adapter createDcdDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice <em>Deploy On Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DeployOnDevice
	 * @generated
	 */
	public Adapter createDeployOnDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration <em>Device Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DeviceConfiguration
	 * @generated
	 */
	public Adapter createDeviceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg <em>Device Manager Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg
	 * @generated
	 */
	public Adapter createDeviceManagerSoftPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile <em>Device Pkg File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile
	 * @generated
	 */
	public Adapter createDevicePkgFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.DomainManager <em>Domain Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.DomainManager
	 * @generated
	 */
	public Adapter createDomainManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.FileSystemName <em>File System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemName
	 * @generated
	 */
	public Adapter createFileSystemNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dcd.FileSystemNames <em>File System Names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dcd.FileSystemNames
	 * @generated
	 */
	public Adapter createFileSystemNamesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement
	 * @generated
	 */
	public Adapter createComponentPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation
	 * @generated
	 */
	public Adapter createComponentInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.Partitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.Partitioning
	 * @generated
	 */
	public Adapter createPartitioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef
	 * @generated
	 */
	public Adapter createComponentInstantiationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface
	 * @generated
	 */
	public Adapter createConnectInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.UsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPort
	 * @generated
	 */
	public Adapter createUsesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPort
	 * @generated
	 */
	public Adapter createProvidesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.Connections
	 * @generated
	 */
	public Adapter createConnectionsAdapter() {
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

} //DcdAdapterFactory
