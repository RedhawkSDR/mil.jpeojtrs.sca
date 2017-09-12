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
import mil.jpeojtrs.sca.sad.*;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.ExternalProperties;
import mil.jpeojtrs.sca.sad.ExternalProperty;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.SadPackage
 * @generated
 */
public class SadSwitch< T > extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadSwitch() {
		if (modelPackage == null) {
			modelPackage = SadPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SadPackage.ASSEMBLY_CONTROLLER: {
			AssemblyController assemblyController = (AssemblyController) theEObject;
			T result = caseAssemblyController(assemblyController);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_COMPONENT_INSTANTIATION: {
			SadComponentInstantiation sadComponentInstantiation = (SadComponentInstantiation) theEObject;
			T result = caseSadComponentInstantiation(sadComponentInstantiation);
			if (result == null)
				result = caseComponentInstantiation(sadComponentInstantiation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_COMPONENT_INSTANTIATION_REF: {
			SadComponentInstantiationRef sadComponentInstantiationRef = (SadComponentInstantiationRef) theEObject;
			T result = caseSadComponentInstantiationRef(sadComponentInstantiationRef);
			if (result == null)
				result = caseComponentInstantiationRef(sadComponentInstantiationRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_USES_PORT: {
			SadUsesPort sadUsesPort = (SadUsesPort) theEObject;
			T result = caseSadUsesPort(sadUsesPort);
			if (result == null)
				result = caseUsesPort(sadUsesPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_PROVIDES_PORT: {
			SadProvidesPort sadProvidesPort = (SadProvidesPort) theEObject;
			T result = caseSadProvidesPort(sadProvidesPort);
			if (result == null)
				result = caseProvidesPort(sadProvidesPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_CONNECT_INTERFACE: {
			SadConnectInterface sadConnectInterface = (SadConnectInterface) theEObject;
			T result = caseSadConnectInterface(sadConnectInterface);
			if (result == null)
				result = caseConnectInterface(sadConnectInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_CONNECTIONS: {
			SadConnections sadConnections = (SadConnections) theEObject;
			T result = caseSadConnections(sadConnections);
			if (result == null)
				result = caseConnections(sadConnections);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.COMPONENT_RESOURCE_FACTORY_REF: {
			ComponentResourceFactoryRef componentResourceFactoryRef = (ComponentResourceFactoryRef) theEObject;
			T result = caseComponentResourceFactoryRef(componentResourceFactoryRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.EXTERNAL_PORTS: {
			ExternalPorts externalPorts = (ExternalPorts) theEObject;
			T result = caseExternalPorts(externalPorts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.EXTERNAL_PROPERTIES: {
			ExternalProperties externalProperties = (ExternalProperties) theEObject;
			T result = caseExternalProperties(externalProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.EXTERNAL_PROPERTY: {
			ExternalProperty externalProperty = (ExternalProperty) theEObject;
			T result = caseExternalProperty(externalProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.FIND_COMPONENT: {
			FindComponent findComponent = (FindComponent) theEObject;
			T result = caseFindComponent(findComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.HOST_COLLOCATION: {
			HostCollocation hostCollocation = (HostCollocation) theEObject;
			T result = caseHostCollocation(hostCollocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.OPTIONS: {
			Options options = (Options) theEObject;
			T result = caseOptions(options);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.OPTION: {
			Option option = (Option) theEObject;
			T result = caseOption(option);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_PARTITIONING: {
			SadPartitioning sadPartitioning = (SadPartitioning) theEObject;
			T result = caseSadPartitioning(sadPartitioning);
			if (result == null)
				result = casePartitioning(sadPartitioning);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_COMPONENT_PLACEMENT: {
			SadComponentPlacement sadComponentPlacement = (SadComponentPlacement) theEObject;
			T result = caseSadComponentPlacement(sadComponentPlacement);
			if (result == null)
				result = caseComponentPlacement(sadComponentPlacement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.RESERVATION: {
			Reservation reservation = (Reservation) theEObject;
			T result = caseReservation(reservation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.RESOURCE_FACTORY_PROPERTIES: {
			ResourceFactoryProperties resourceFactoryProperties = (ResourceFactoryProperties) theEObject;
			T result = caseResourceFactoryProperties(resourceFactoryProperties);
			if (result == null)
				result = casePropertyRefContainer(resourceFactoryProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SAD_DOCUMENT_ROOT: {
			SadDocumentRoot sadDocumentRoot = (SadDocumentRoot) theEObject;
			T result = caseSadDocumentRoot(sadDocumentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.SOFTWARE_ASSEMBLY: {
			SoftwareAssembly softwareAssembly = (SoftwareAssembly) theEObject;
			T result = caseSoftwareAssembly(softwareAssembly);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.USES_DEVICE_DEPENDENCIES: {
			UsesDeviceDependencies usesDeviceDependencies = (UsesDeviceDependencies) theEObject;
			T result = caseUsesDeviceDependencies(usesDeviceDependencies);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SadPackage.USES_DEVICE_REF: {
			UsesDeviceRef usesDeviceRef = (UsesDeviceRef) theEObject;
			T result = caseUsesDeviceRef(usesDeviceRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyController(AssemblyController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadComponentInstantiation(SadComponentInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instantiation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instantiation Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadComponentInstantiationRef(SadComponentInstantiationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadUsesPort(SadUsesPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadProvidesPort(SadProvidesPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadConnectInterface(SadConnectInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadConnections(SadConnections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Resource Factory Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Resource Factory Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentResourceFactoryRef(ComponentResourceFactoryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalPorts(ExternalPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalProperties(ExternalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalProperty(ExternalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindComponent(FindComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Collocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Collocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostCollocation(HostCollocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadPartitioning(SadPartitioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadComponentPlacement(SadComponentPlacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservation(Reservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Factory Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Factory Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceFactoryProperties(ResourceFactoryProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSadDocumentRoot(SadDocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareAssembly(SoftwareAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Device Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Device Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesDeviceDependencies(UsesDeviceDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Device Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Device Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesDeviceRef(UsesDeviceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstantiation(ComponentInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instantiation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instantiation Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < R extends ComponentInstantiation > T caseComponentInstantiationRef(ComponentInstantiationRef<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < U extends ComponentInstantiationRef< ? > > T caseUsesPort(UsesPort<U> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < P extends ComponentInstantiationRef< ? > > T caseProvidesPort(ProvidesPort<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < CIR extends ComponentInstantiationRef< ? >, UP extends UsesPort<CIR>, PP extends ProvidesPort<CIR> > T caseConnectInterface(
		ConnectInterface<CIR, UP, PP> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < CI extends ConnectInterface< ? , ? , ? > > T caseConnections(Connections<CI> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < C extends ComponentPlacement< ? > > T casePartitioning(Partitioning<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public < I extends ComponentInstantiation > T caseComponentPlacement(ComponentPlacement<I> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Ref Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Ref Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRefContainer(PropertyRefContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SadSwitch
