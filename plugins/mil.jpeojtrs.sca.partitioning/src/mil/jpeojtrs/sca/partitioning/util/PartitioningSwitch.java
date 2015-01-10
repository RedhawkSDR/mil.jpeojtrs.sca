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
import mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication;
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
import mil.jpeojtrs.sca.partitioning.UsesDeviceStub;
import mil.jpeojtrs.sca.partitioning.UsesPort;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;
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
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage
 * @generated
 */
public class PartitioningSwitch< T > extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartitioningPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitioningSwitch() {
		if (modelPackage == null) {
			modelPackage = PartitioningPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
		case PartitioningPackage.COMPONENT_FILE: {
			ComponentFile componentFile = (ComponentFile) theEObject;
			T result = caseComponentFile(componentFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.DOM_COMPONENT_FILE: {
			DomComponentFile domComponentFile = (DomComponentFile) theEObject;
			T result = caseDomComponentFile(domComponentFile);
			if (result == null)
				result = caseComponentFile(domComponentFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.DEV_COMPONENT_FILE: {
			DevComponentFile devComponentFile = (DevComponentFile) theEObject;
			T result = caseDevComponentFile(devComponentFile);
			if (result == null)
				result = caseComponentFile(devComponentFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_FILE_REF: {
			ComponentFileRef componentFileRef = (ComponentFileRef) theEObject;
			T result = caseComponentFileRef(componentFileRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_FILES: {
			ComponentFiles componentFiles = (ComponentFiles) theEObject;
			T result = caseComponentFiles(componentFiles);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_INSTANTIATION: {
			ComponentInstantiation componentInstantiation = (ComponentInstantiation) theEObject;
			T result = caseComponentInstantiation(componentInstantiation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_INSTANTIATION_REF: {
			ComponentInstantiationRef< ? > componentInstantiationRef = (ComponentInstantiationRef< ? >) theEObject;
			T result = caseComponentInstantiationRef(componentInstantiationRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_PLACEMENT: {
			ComponentPlacement< ? > componentPlacement = (ComponentPlacement< ? >) theEObject;
			T result = caseComponentPlacement(componentPlacement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_PROPERTIES: {
			ComponentProperties componentProperties = (ComponentProperties) theEObject;
			T result = caseComponentProperties(componentProperties);
			if (result == null)
				result = casePropertyRefContainer(componentProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE: {
			ComponentSupportedInterface componentSupportedInterface = (ComponentSupportedInterface) theEObject;
			T result = caseComponentSupportedInterface(componentSupportedInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE_STUB: {
			ComponentSupportedInterfaceStub componentSupportedInterfaceStub = (ComponentSupportedInterfaceStub) theEObject;
			T result = caseComponentSupportedInterfaceStub(componentSupportedInterfaceStub);
			if (result == null)
				result = caseConnectionTarget(componentSupportedInterfaceStub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.CONNECT_INTERFACE: {
			ConnectInterface< ? , ? , ? > connectInterface = (ConnectInterface< ? , ? , ? >) theEObject;
			T result = caseConnectInterface(connectInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.CONNECTIONS: {
			Connections< ? > connections = (Connections< ? >) theEObject;
			T result = caseConnections(connections);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.CONNECTION_TARGET: {
			ConnectionTarget connectionTarget = (ConnectionTarget) theEObject;
			T result = caseConnectionTarget(connectionTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.DEVICE_THAT_LOADED_THIS_COMPONENT_REF: {
			DeviceThatLoadedThisComponentRef deviceThatLoadedThisComponentRef = (DeviceThatLoadedThisComponentRef) theEObject;
			T result = caseDeviceThatLoadedThisComponentRef(deviceThatLoadedThisComponentRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.DEVICE_USED_BY_THIS_COMPONENT_REF: {
			DeviceUsedByThisComponentRef deviceUsedByThisComponentRef = (DeviceUsedByThisComponentRef) theEObject;
			T result = caseDeviceUsedByThisComponentRef(deviceUsedByThisComponentRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION: {
			DeviceUsedByApplication deviceUsedByApplication = (DeviceUsedByApplication) theEObject;
			T result = caseDeviceUsedByApplication(deviceUsedByApplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.DOMAIN_FINDER: {
			DomainFinder domainFinder = (DomainFinder) theEObject;
			T result = caseDomainFinder(domainFinder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.FIND_BY: {
			FindBy findBy = (FindBy) theEObject;
			T result = caseFindBy(findBy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.FIND_BY_STUB: {
			FindByStub findByStub = (FindByStub) theEObject;
			T result = caseFindByStub(findByStub);
			if (result == null)
				result = caseConnectionTarget(findByStub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.FIND_BY_STUB_CONTAINER: {
			FindByStubContainer findByStubContainer = (FindByStubContainer) theEObject;
			T result = caseFindByStubContainer(findByStubContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.LOCAL_FILE: {
			LocalFile localFile = (LocalFile) theEObject;
			T result = caseLocalFile(localFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.NAMING_SERVICE: {
			NamingService namingService = (NamingService) theEObject;
			T result = caseNamingService(namingService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.PARTITIONING: {
			Partitioning< ? > partitioning = (Partitioning< ? >) theEObject;
			T result = casePartitioning(partitioning);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.PROVIDES_PORT: {
			ProvidesPort< ? > providesPort = (ProvidesPort< ? >) theEObject;
			T result = caseProvidesPort(providesPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.PROVIDES_PORT_STUB: {
			ProvidesPortStub providesPortStub = (ProvidesPortStub) theEObject;
			T result = caseProvidesPortStub(providesPortStub);
			if (result == null)
				result = caseConnectionTarget(providesPortStub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.USES_PORT: {
			UsesPort< ? > usesPort = (UsesPort< ? >) theEObject;
			T result = caseUsesPort(usesPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.USES_PORT_STUB: {
			UsesPortStub usesPortStub = (UsesPortStub) theEObject;
			T result = caseUsesPortStub(usesPortStub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PartitioningPackage.USES_DEVICE_STUB: {
			UsesDeviceStub usesDeviceStub = (UsesDeviceStub) theEObject;
			T result = caseUsesDeviceStub(usesDeviceStub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentFile(ComponentFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dom Component File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dom Component File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomComponentFile(DomComponentFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dev Component File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dev Component File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevComponentFile(DevComponentFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component File Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component File Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentFileRef(ComponentFileRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentFiles(ComponentFiles object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProperties(ComponentProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Supported Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Supported Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSupportedInterface(ComponentSupportedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Supported Interface Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Supported Interface Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSupportedInterfaceStub(ComponentSupportedInterfaceStub object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionTarget(ConnectionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device That Loaded This Component Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device That Loaded This Component Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Used By This Component Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Used By This Component Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Used By Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Used By Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUsedByApplication(DeviceUsedByApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainFinder(DomainFinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindBy(FindBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find By Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find By Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindByStub(FindByStub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find By Stub Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find By Stub Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindByStubContainer(FindByStubContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalFile(LocalFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingService(NamingService object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Provides Port Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Port Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesPortStub(ProvidesPortStub object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Uses Port Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Port Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesPortStub(UsesPortStub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Device Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Device Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesDeviceStub(UsesDeviceStub object) {
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

} //PartitioningSwitch
