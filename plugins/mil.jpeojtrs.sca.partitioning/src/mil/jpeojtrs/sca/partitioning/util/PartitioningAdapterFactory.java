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
package mil.jpeojtrs.sca.partitioning.util;

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.ComponentFiles;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.ConnectInterface;
import mil.jpeojtrs.sca.partitioning.ConnectionTarget;
import mil.jpeojtrs.sca.partitioning.Connections;
import mil.jpeojtrs.sca.partitioning.DevComponentFile;
import mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DomComponentFile;
import mil.jpeojtrs.sca.partitioning.DomainFinder;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.FindByStub;
import mil.jpeojtrs.sca.partitioning.FindByStubContainer;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.partitioning.Partitioning;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPort;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesPort;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage
 * @generated
 */
public class PartitioningAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartitioningPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitioningAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PartitioningPackage.eINSTANCE;
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
	protected PartitioningSwitch<Adapter> modelSwitch =
		new PartitioningSwitch<Adapter>() {
			@Override
			public Adapter caseComponentFile(ComponentFile object) {
				return createComponentFileAdapter();
			}
			@Override
			public Adapter caseDomComponentFile(DomComponentFile object) {
				return createDomComponentFileAdapter();
			}
			@Override
			public Adapter caseDevComponentFile(DevComponentFile object) {
				return createDevComponentFileAdapter();
			}
			@Override
			public Adapter caseComponentFileRef(ComponentFileRef object) {
				return createComponentFileRefAdapter();
			}
			@Override
			public Adapter caseComponentFiles(ComponentFiles object) {
				return createComponentFilesAdapter();
			}
			@Override
			public Adapter caseComponentInstantiation(ComponentInstantiation object) {
				return createComponentInstantiationAdapter();
			}
			@Override
			public <R extends ComponentInstantiation> Adapter caseComponentInstantiationRef(ComponentInstantiationRef<R> object) {
				return createComponentInstantiationRefAdapter();
			}
			@Override
			public <I extends ComponentInstantiation> Adapter caseComponentPlacement(ComponentPlacement<I> object) {
				return createComponentPlacementAdapter();
			}
			@Override
			public Adapter caseComponentProperties(ComponentProperties object) {
				return createComponentPropertiesAdapter();
			}
			@Override
			public Adapter caseComponentSupportedInterface(ComponentSupportedInterface object) {
				return createComponentSupportedInterfaceAdapter();
			}
			@Override
			public Adapter caseComponentSupportedInterfaceStub(ComponentSupportedInterfaceStub object) {
				return createComponentSupportedInterfaceStubAdapter();
			}
			@Override
			public <CIR extends ComponentInstantiationRef<?>, UP extends UsesPort<CIR>, PP extends ProvidesPort<CIR>> Adapter caseConnectInterface(ConnectInterface<CIR, UP, PP> object) {
				return createConnectInterfaceAdapter();
			}
			@Override
			public <CI extends ConnectInterface<?, ?, ?>> Adapter caseConnections(Connections<CI> object) {
				return createConnectionsAdapter();
			}
			@Override
			public Adapter caseConnectionTarget(ConnectionTarget object) {
				return createConnectionTargetAdapter();
			}
			@Override
			public Adapter caseDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef object) {
				return createDeviceThatLoadedThisComponentRefAdapter();
			}
			@Override
			public Adapter caseDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef object) {
				return createDeviceUsedByThisComponentRefAdapter();
			}
			@Override
			public Adapter caseDomainFinder(DomainFinder object) {
				return createDomainFinderAdapter();
			}
			@Override
			public Adapter caseFindBy(FindBy object) {
				return createFindByAdapter();
			}
			@Override
			public Adapter caseFindByStub(FindByStub object) {
				return createFindByStubAdapter();
			}
			@Override
			public Adapter caseFindByStubContainer(FindByStubContainer object) {
				return createFindByStubContainerAdapter();
			}
			@Override
			public Adapter caseLocalFile(LocalFile object) {
				return createLocalFileAdapter();
			}
			@Override
			public Adapter caseNamingService(NamingService object) {
				return createNamingServiceAdapter();
			}
			@Override
			public <C extends ComponentPlacement<?>> Adapter casePartitioning(Partitioning<C> object) {
				return createPartitioningAdapter();
			}
			@Override
			public <P extends ComponentInstantiationRef<?>> Adapter caseProvidesPort(ProvidesPort<P> object) {
				return createProvidesPortAdapter();
			}
			@Override
			public Adapter caseProvidesPortStub(ProvidesPortStub object) {
				return createProvidesPortStubAdapter();
			}
			@Override
			public <U extends ComponentInstantiationRef<?>> Adapter caseUsesPort(UsesPort<U> object) {
				return createUsesPortAdapter();
			}
			@Override
			public Adapter caseUsesPortStub(UsesPortStub object) {
				return createUsesPortStubAdapter();
			}
			@Override
			public Adapter casePropertyRefContainer(PropertyRefContainer object) {
				return createPropertyRefContainerAdapter();
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentFile <em>Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile
	 * @generated
	 */
	public Adapter createComponentFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.DomComponentFile <em>Dom Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.DomComponentFile
	 * @generated
	 */
	public Adapter createDomComponentFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.DevComponentFile <em>Dev Component File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.DevComponentFile
	 * @generated
	 */
	public Adapter createDevComponentFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef <em>Component File Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFileRef
	 * @generated
	 */
	public Adapter createComponentFileRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentFiles <em>Component Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFiles
	 * @generated
	 */
	public Adapter createComponentFilesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentProperties <em>Component Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentProperties
	 * @generated
	 */
	public Adapter createComponentPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface <em>Component Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface
	 * @generated
	 */
	public Adapter createComponentSupportedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub <em>Component Supported Interface Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub
	 * @generated
	 */
	public Adapter createComponentSupportedInterfaceStubAdapter() {
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ConnectionTarget <em>Connection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ConnectionTarget
	 * @generated
	 */
	public Adapter createConnectionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef
	 * @generated
	 */
	public Adapter createDeviceThatLoadedThisComponentRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef
	 * @generated
	 */
	public Adapter createDeviceUsedByThisComponentRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.DomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.DomainFinder
	 * @generated
	 */
	public Adapter createDomainFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.FindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.FindBy
	 * @generated
	 */
	public Adapter createFindByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.FindByStub <em>Find By Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStub
	 * @generated
	 */
	public Adapter createFindByStubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.FindByStubContainer <em>Find By Stub Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.FindByStubContainer
	 * @generated
	 */
	public Adapter createFindByStubContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.LocalFile
	 * @generated
	 */
	public Adapter createLocalFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.NamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.NamingService
	 * @generated
	 */
	public Adapter createNamingServiceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub <em>Provides Port Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.ProvidesPortStub
	 * @generated
	 */
	public Adapter createProvidesPortStubAdapter() {
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.partitioning.UsesPortStub <em>Uses Port Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.partitioning.UsesPortStub
	 * @generated
	 */
	public Adapter createUsesPortStubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer <em>Property Ref Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer
	 * @generated
	 */
	public Adapter createPropertyRefContainerAdapter() {
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

} //PartitioningAdapterFactory
