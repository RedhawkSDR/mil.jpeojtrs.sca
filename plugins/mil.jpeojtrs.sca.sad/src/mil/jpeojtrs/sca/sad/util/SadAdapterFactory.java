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
package mil.jpeojtrs.sca.sad.util;

import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.ConnectInterface;
import mil.jpeojtrs.sca.partitioning.Connections;
import mil.jpeojtrs.sca.partitioning.Partitioning;
import mil.jpeojtrs.sca.partitioning.ProvidesPort;
import mil.jpeojtrs.sca.partitioning.UsesPort;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.FindComponent;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadConnectInterface;
import mil.jpeojtrs.sca.sad.SadConnections;
import mil.jpeojtrs.sca.sad.SadDocumentRoot;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadPartitioning;
import mil.jpeojtrs.sca.sad.SadProvidesPort;
import mil.jpeojtrs.sca.sad.SadUsesPort;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.SadPackage
 * @generated
 */
public class SadAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SadPackage.eINSTANCE;
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
	protected SadSwitch<Adapter> modelSwitch =
		new SadSwitch<Adapter>() {
			@Override
			public Adapter caseAssemblyController(AssemblyController object) {
				return createAssemblyControllerAdapter();
			}
			@Override
			public Adapter caseSadComponentInstantiation(SadComponentInstantiation object) {
				return createSadComponentInstantiationAdapter();
			}
			@Override
			public Adapter caseSadComponentInstantiationRef(SadComponentInstantiationRef object) {
				return createSadComponentInstantiationRefAdapter();
			}
			@Override
			public Adapter caseSadUsesPort(SadUsesPort object) {
				return createSadUsesPortAdapter();
			}
			@Override
			public Adapter caseSadProvidesPort(SadProvidesPort object) {
				return createSadProvidesPortAdapter();
			}
			@Override
			public Adapter caseSadConnectInterface(SadConnectInterface object) {
				return createSadConnectInterfaceAdapter();
			}
			@Override
			public Adapter caseSadConnections(SadConnections object) {
				return createSadConnectionsAdapter();
			}
			@Override
			public Adapter caseComponentResourceFactoryRef(ComponentResourceFactoryRef object) {
				return createComponentResourceFactoryRefAdapter();
			}
			@Override
			public Adapter caseExternalPorts(ExternalPorts object) {
				return createExternalPortsAdapter();
			}
			@Override
			public Adapter caseFindComponent(FindComponent object) {
				return createFindComponentAdapter();
			}
			@Override
			public Adapter caseHostCollocation(HostCollocation object) {
				return createHostCollocationAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseSadPartitioning(SadPartitioning object) {
				return createSadPartitioningAdapter();
			}
			@Override
			public Adapter caseSadComponentPlacement(SadComponentPlacement object) {
				return createSadComponentPlacementAdapter();
			}
			@Override
			public Adapter caseResourceFactoryProperties(ResourceFactoryProperties object) {
				return createResourceFactoryPropertiesAdapter();
			}
			@Override
			public Adapter caseSadDocumentRoot(SadDocumentRoot object) {
				return createSadDocumentRootAdapter();
			}
			@Override
			public Adapter caseSoftwareAssembly(SoftwareAssembly object) {
				return createSoftwareAssemblyAdapter();
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
			public <U extends ComponentInstantiationRef<?>> Adapter caseUsesPort(UsesPort<U> object) {
				return createUsesPortAdapter();
			}
			@Override
			public <P extends ComponentInstantiationRef<?>> Adapter caseProvidesPort(ProvidesPort<P> object) {
				return createProvidesPortAdapter();
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
			public <C extends ComponentPlacement<?>> Adapter casePartitioning(Partitioning<C> object) {
				return createPartitioningAdapter();
			}
			@Override
			public <I extends ComponentInstantiation> Adapter caseComponentPlacement(ComponentPlacement<I> object) {
				return createComponentPlacementAdapter();
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.AssemblyController <em>Assembly Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.AssemblyController
	 * @generated
	 */
	public Adapter createAssemblyControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadComponentInstantiation
	 * @generated
	 */
	public Adapter createSadComponentInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiationRef <em>Component Instantiation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadComponentInstantiationRef
	 * @generated
	 */
	public Adapter createSadComponentInstantiationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadUsesPort <em>Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadUsesPort
	 * @generated
	 */
	public Adapter createSadUsesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadProvidesPort <em>Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadProvidesPort
	 * @generated
	 */
	public Adapter createSadProvidesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadConnectInterface <em>Connect Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadConnectInterface
	 * @generated
	 */
	public Adapter createSadConnectInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadConnections
	 * @generated
	 */
	public Adapter createSadConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef <em>Component Resource Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef
	 * @generated
	 */
	public Adapter createComponentResourceFactoryRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.ExternalPorts <em>External Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.ExternalPorts
	 * @generated
	 */
	public Adapter createExternalPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.FindComponent <em>Find Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.FindComponent
	 * @generated
	 */
	public Adapter createFindComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.HostCollocation <em>Host Collocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.HostCollocation
	 * @generated
	 */
	public Adapter createHostCollocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadPartitioning <em>Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadPartitioning
	 * @generated
	 */
	public Adapter createSadPartitioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadComponentPlacement <em>Component Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadComponentPlacement
	 * @generated
	 */
	public Adapter createSadComponentPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties <em>Resource Factory Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties
	 * @generated
	 */
	public Adapter createResourceFactoryPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot
	 * @generated
	 */
	public Adapter createSadDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly <em>Software Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly
	 * @generated
	 */
	public Adapter createSoftwareAssemblyAdapter() {
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

} //SadAdapterFactory
