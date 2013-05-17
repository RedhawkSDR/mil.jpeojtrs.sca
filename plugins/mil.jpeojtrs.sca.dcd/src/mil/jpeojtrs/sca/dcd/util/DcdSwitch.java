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

import java.util.List;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see mil.jpeojtrs.sca.dcd.DcdPackage
 * @generated
 */
public class DcdSwitch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DcdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdSwitch() {
		if (modelPackage == null) {
			modelPackage = DcdPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DcdPackage.DCD_COMPONENT_PLACEMENT: {
				DcdComponentPlacement dcdComponentPlacement = (DcdComponentPlacement)theEObject;
				T result = caseDcdComponentPlacement(dcdComponentPlacement);
				if (result == null) result = caseComponentPlacement(dcdComponentPlacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_COMPONENT_INSTANTIATION: {
				DcdComponentInstantiation dcdComponentInstantiation = (DcdComponentInstantiation)theEObject;
				T result = caseDcdComponentInstantiation(dcdComponentInstantiation);
				if (result == null) result = caseComponentInstantiation(dcdComponentInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_PARTITIONING: {
				DcdPartitioning dcdPartitioning = (DcdPartitioning)theEObject;
				T result = caseDcdPartitioning(dcdPartitioning);
				if (result == null) result = casePartitioning(dcdPartitioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_COMPONENT_INSTANTIATION_REF: {
				DcdComponentInstantiationRef dcdComponentInstantiationRef = (DcdComponentInstantiationRef)theEObject;
				T result = caseDcdComponentInstantiationRef(dcdComponentInstantiationRef);
				if (result == null) result = caseComponentInstantiationRef(dcdComponentInstantiationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_CONNECT_INTERFACE: {
				DcdConnectInterface dcdConnectInterface = (DcdConnectInterface)theEObject;
				T result = caseDcdConnectInterface(dcdConnectInterface);
				if (result == null) result = caseConnectInterface(dcdConnectInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_USES_PORT: {
				DcdUsesPort dcdUsesPort = (DcdUsesPort)theEObject;
				T result = caseDcdUsesPort(dcdUsesPort);
				if (result == null) result = caseUsesPort(dcdUsesPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_PROVIDES_PORT: {
				DcdProvidesPort dcdProvidesPort = (DcdProvidesPort)theEObject;
				T result = caseDcdProvidesPort(dcdProvidesPort);
				if (result == null) result = caseProvidesPort(dcdProvidesPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_CONNECTIONS: {
				DcdConnections dcdConnections = (DcdConnections)theEObject;
				T result = caseDcdConnections(dcdConnections);
				if (result == null) result = caseConnections(dcdConnections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.COMPOSITE_PART_OF_DEVICE: {
				CompositePartOfDevice compositePartOfDevice = (CompositePartOfDevice)theEObject;
				T result = caseCompositePartOfDevice(compositePartOfDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DCD_DOCUMENT_ROOT: {
				DcdDocumentRoot dcdDocumentRoot = (DcdDocumentRoot)theEObject;
				T result = caseDcdDocumentRoot(dcdDocumentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DEPLOY_ON_DEVICE: {
				DeployOnDevice deployOnDevice = (DeployOnDevice)theEObject;
				T result = caseDeployOnDevice(deployOnDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DEVICE_CONFIGURATION: {
				DeviceConfiguration deviceConfiguration = (DeviceConfiguration)theEObject;
				T result = caseDeviceConfiguration(deviceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DEVICE_MANAGER_SOFT_PKG: {
				DeviceManagerSoftPkg deviceManagerSoftPkg = (DeviceManagerSoftPkg)theEObject;
				T result = caseDeviceManagerSoftPkg(deviceManagerSoftPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DEVICE_PKG_FILE: {
				DevicePkgFile devicePkgFile = (DevicePkgFile)theEObject;
				T result = caseDevicePkgFile(devicePkgFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.DOMAIN_MANAGER: {
				DomainManager domainManager = (DomainManager)theEObject;
				T result = caseDomainManager(domainManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.FILE_SYSTEM_NAME: {
				FileSystemName fileSystemName = (FileSystemName)theEObject;
				T result = caseFileSystemName(fileSystemName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DcdPackage.FILE_SYSTEM_NAMES: {
				FileSystemNames fileSystemNames = (FileSystemNames)theEObject;
				T result = caseFileSystemNames(fileSystemNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseDcdComponentPlacement(DcdComponentPlacement object) {
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
	public T caseDcdComponentInstantiation(DcdComponentInstantiation object) {
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
	public T caseDcdPartitioning(DcdPartitioning object) {
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
	public T caseDcdComponentInstantiationRef(DcdComponentInstantiationRef object) {
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
	public T caseDcdConnectInterface(DcdConnectInterface object) {
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
	public T caseDcdUsesPort(DcdUsesPort object) {
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
	public T caseDcdProvidesPort(DcdProvidesPort object) {
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
	public T caseDcdConnections(DcdConnections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Part Of Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Part Of Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositePartOfDevice(CompositePartOfDevice object) {
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
	public T caseDcdDocumentRoot(DcdDocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deploy On Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deploy On Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployOnDevice(DeployOnDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceConfiguration(DeviceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Manager Soft Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Manager Soft Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagerSoftPkg(DeviceManagerSoftPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Pkg File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Pkg File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevicePkgFile(DevicePkgFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainManager(DomainManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystemName(FileSystemName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystemNames(FileSystemNames object) {
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
	public <I extends ComponentInstantiation> T caseComponentPlacement(ComponentPlacement<I> object) {
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
	public <C extends ComponentPlacement<?>> T casePartitioning(Partitioning<C> object) {
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
	public <R extends ComponentInstantiation> T caseComponentInstantiationRef(ComponentInstantiationRef<R> object) {
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
	public <CIR extends ComponentInstantiationRef<?>, UP extends UsesPort<CIR>, PP extends ProvidesPort<CIR>> T caseConnectInterface(ConnectInterface<CIR, UP, PP> object) {
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
	public <U extends ComponentInstantiationRef<?>> T caseUsesPort(UsesPort<U> object) {
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
	public <P extends ComponentInstantiationRef<?>> T caseProvidesPort(ProvidesPort<P> object) {
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
	public <CI extends ConnectInterface<?, ?, ?>> T caseConnections(Connections<CI> object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //DcdSwitch
