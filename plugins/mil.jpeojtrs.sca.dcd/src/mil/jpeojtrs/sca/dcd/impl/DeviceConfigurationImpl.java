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
package mil.jpeojtrs.sca.dcd.impl;

import mil.jpeojtrs.sca.dcd.DcdConnections;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DcdPartitioning;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg;
import mil.jpeojtrs.sca.dcd.DomainManager;
import mil.jpeojtrs.sca.dcd.FileSystemNames;
import mil.jpeojtrs.sca.partitioning.ComponentFiles;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getDeviceManagerSoftPkg <em>Device Manager Soft Pkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getComponentFiles <em>Component Files</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getDomainManager <em>Domain Manager</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getFileSystemNames <em>File System Names</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceConfigurationImpl extends EObjectImpl implements DeviceConfiguration {

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDeviceManagerSoftPkg() <em>Device Manager Soft Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceManagerSoftPkg()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagerSoftPkg deviceManagerSoftPkg;
	/**
	 * The cached value of the '{@link #getComponentFiles() <em>Component Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentFiles()
	 * @generated
	 * @ordered
	 */
	protected ComponentFiles componentFiles;
	/**
	 * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioning()
	 * @generated
	 * @ordered
	 */
	protected DcdPartitioning partitioning;
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected DcdConnections connections;
	/**
	 * The cached value of the '{@link #getDomainManager() <em>Domain Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainManager()
	 * @generated
	 * @ordered
	 */
	protected DomainManager domainManager;
	/**
	 * The cached value of the '{@link #getFileSystemNames() <em>File System Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystemNames()
	 * @generated
	 * @ordered
	 */
	protected FileSystemNames fileSystemNames;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DEVICE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagerSoftPkg getDeviceManagerSoftPkg() {
		return deviceManagerSoftPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceManagerSoftPkg(DeviceManagerSoftPkg newDeviceManagerSoftPkg, NotificationChain msgs) {
		DeviceManagerSoftPkg oldDeviceManagerSoftPkg = deviceManagerSoftPkg;
		deviceManagerSoftPkg = newDeviceManagerSoftPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG,
				oldDeviceManagerSoftPkg, newDeviceManagerSoftPkg);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceManagerSoftPkg(DeviceManagerSoftPkg newDeviceManagerSoftPkg) {
		if (newDeviceManagerSoftPkg != deviceManagerSoftPkg) {
			NotificationChain msgs = null;
			if (deviceManagerSoftPkg != null)
				msgs = ((InternalEObject) deviceManagerSoftPkg).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG, null, msgs);
			if (newDeviceManagerSoftPkg != null)
				msgs = ((InternalEObject) newDeviceManagerSoftPkg).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG, null, msgs);
			msgs = basicSetDeviceManagerSoftPkg(newDeviceManagerSoftPkg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG, newDeviceManagerSoftPkg,
				newDeviceManagerSoftPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFiles getComponentFiles() {
		return componentFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentFiles(ComponentFiles newComponentFiles, NotificationChain msgs) {
		ComponentFiles oldComponentFiles = componentFiles;
		componentFiles = newComponentFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES, oldComponentFiles,
				newComponentFiles);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentFiles(ComponentFiles newComponentFiles) {
		if (newComponentFiles != componentFiles) {
			NotificationChain msgs = null;
			if (componentFiles != null)
				msgs = ((InternalEObject) componentFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES, null,
					msgs);
			if (newComponentFiles != null)
				msgs = ((InternalEObject) newComponentFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES, null,
					msgs);
			msgs = basicSetComponentFiles(newComponentFiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES, newComponentFiles, newComponentFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdPartitioning getPartitioning() {
		return partitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitioning(DcdPartitioning newPartitioning, NotificationChain msgs) {
		DcdPartitioning oldPartitioning = partitioning;
		partitioning = newPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__PARTITIONING, oldPartitioning,
				newPartitioning);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitioning(DcdPartitioning newPartitioning) {
		if (newPartitioning != partitioning) {
			NotificationChain msgs = null;
			if (partitioning != null)
				msgs = ((InternalEObject) partitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__PARTITIONING, null,
					msgs);
			if (newPartitioning != null)
				msgs = ((InternalEObject) newPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__PARTITIONING, null,
					msgs);
			msgs = basicSetPartitioning(newPartitioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__PARTITIONING, newPartitioning, newPartitioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdConnections getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnections(DcdConnections newConnections, NotificationChain msgs) {
		DcdConnections oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS, oldConnections,
				newConnections);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnections(DcdConnections newConnections) {
		if (newConnections != connections) {
			NotificationChain msgs = null;
			if (connections != null)
				msgs = ((InternalEObject) connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS, null, msgs);
			if (newConnections != null)
				msgs = ((InternalEObject) newConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS, null, msgs);
			msgs = basicSetConnections(newConnections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS, newConnections, newConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainManager getDomainManager() {
		return domainManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainManager(DomainManager newDomainManager, NotificationChain msgs) {
		DomainManager oldDomainManager = domainManager;
		domainManager = newDomainManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER, oldDomainManager,
				newDomainManager);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainManager(DomainManager newDomainManager) {
		if (newDomainManager != domainManager) {
			NotificationChain msgs = null;
			if (domainManager != null)
				msgs = ((InternalEObject) domainManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER, null,
					msgs);
			if (newDomainManager != null)
				msgs = ((InternalEObject) newDomainManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER, null,
					msgs);
			msgs = basicSetDomainManager(newDomainManager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER, newDomainManager, newDomainManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileSystemNames getFileSystemNames() {
		return fileSystemNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSystemNames(FileSystemNames newFileSystemNames, NotificationChain msgs) {
		FileSystemNames oldFileSystemNames = fileSystemNames;
		fileSystemNames = newFileSystemNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES,
				oldFileSystemNames, newFileSystemNames);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSystemNames(FileSystemNames newFileSystemNames) {
		if (newFileSystemNames != fileSystemNames) {
			NotificationChain msgs = null;
			if (fileSystemNames != null)
				msgs = ((InternalEObject) fileSystemNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES,
					null, msgs);
			if (newFileSystemNames != null)
				msgs = ((InternalEObject) newFileSystemNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES,
					null, msgs);
			msgs = basicSetFileSystemNames(newFileSystemNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES, newFileSystemNames, newFileSystemNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG:
			return basicSetDeviceManagerSoftPkg(null, msgs);
		case DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES:
			return basicSetComponentFiles(null, msgs);
		case DcdPackage.DEVICE_CONFIGURATION__PARTITIONING:
			return basicSetPartitioning(null, msgs);
		case DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS:
			return basicSetConnections(null, msgs);
		case DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER:
			return basicSetDomainManager(null, msgs);
		case DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES:
			return basicSetFileSystemNames(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DcdPackage.DEVICE_CONFIGURATION__DESCRIPTION:
			return getDescription();
		case DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG:
			return getDeviceManagerSoftPkg();
		case DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES:
			return getComponentFiles();
		case DcdPackage.DEVICE_CONFIGURATION__PARTITIONING:
			return getPartitioning();
		case DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS:
			return getConnections();
		case DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER:
			return getDomainManager();
		case DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES:
			return getFileSystemNames();
		case DcdPackage.DEVICE_CONFIGURATION__ID:
			return getId();
		case DcdPackage.DEVICE_CONFIGURATION__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DcdPackage.DEVICE_CONFIGURATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG:
			setDeviceManagerSoftPkg((DeviceManagerSoftPkg) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES:
			setComponentFiles((ComponentFiles) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__PARTITIONING:
			setPartitioning((DcdPartitioning) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS:
			setConnections((DcdConnections) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER:
			setDomainManager((DomainManager) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES:
			setFileSystemNames((FileSystemNames) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__ID:
			setId((String) newValue);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DcdPackage.DEVICE_CONFIGURATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG:
			setDeviceManagerSoftPkg((DeviceManagerSoftPkg) null);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES:
			setComponentFiles((ComponentFiles) null);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__PARTITIONING:
			setPartitioning((DcdPartitioning) null);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS:
			setConnections((DcdConnections) null);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER:
			setDomainManager((DomainManager) null);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES:
			setFileSystemNames((FileSystemNames) null);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__ID:
			setId(ID_EDEFAULT);
			return;
		case DcdPackage.DEVICE_CONFIGURATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DcdPackage.DEVICE_CONFIGURATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG:
			return deviceManagerSoftPkg != null;
		case DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES:
			return componentFiles != null;
		case DcdPackage.DEVICE_CONFIGURATION__PARTITIONING:
			return partitioning != null;
		case DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS:
			return connections != null;
		case DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER:
			return domainManager != null;
		case DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES:
			return fileSystemNames != null;
		case DcdPackage.DEVICE_CONFIGURATION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DcdPackage.DEVICE_CONFIGURATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeviceConfigurationImpl
