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
package mil.jpeojtrs.sca.dcd.impl;

import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.FileSystemName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File System Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.FileSystemNameImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.FileSystemNameImpl#getMountName <em>Mount Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSystemNameImpl extends EObjectImpl implements FileSystemName {

	/**
	 * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String deviceID = DEVICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getMountName() <em>Mount Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountName()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMountName() <em>Mount Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountName()
	 * @generated
	 * @ordered
	 */
	protected String mountName = MOUNT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSystemNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.FILE_SYSTEM_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(String newDeviceID) {
		String oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.FILE_SYSTEM_NAME__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountName() {
		return mountName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountName(String newMountName) {
		String oldMountName = mountName;
		mountName = newMountName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.FILE_SYSTEM_NAME__MOUNT_NAME, oldMountName, mountName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DcdPackage.FILE_SYSTEM_NAME__DEVICE_ID:
				return getDeviceID();
			case DcdPackage.FILE_SYSTEM_NAME__MOUNT_NAME:
				return getMountName();
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
			case DcdPackage.FILE_SYSTEM_NAME__DEVICE_ID:
				setDeviceID((String)newValue);
				return;
			case DcdPackage.FILE_SYSTEM_NAME__MOUNT_NAME:
				setMountName((String)newValue);
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
			case DcdPackage.FILE_SYSTEM_NAME__DEVICE_ID:
				setDeviceID(DEVICE_ID_EDEFAULT);
				return;
			case DcdPackage.FILE_SYSTEM_NAME__MOUNT_NAME:
				setMountName(MOUNT_NAME_EDEFAULT);
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
			case DcdPackage.FILE_SYSTEM_NAME__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
			case DcdPackage.FILE_SYSTEM_NAME__MOUNT_NAME:
				return MOUNT_NAME_EDEFAULT == null ? mountName != null : !MOUNT_NAME_EDEFAULT.equals(mountName);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deviceID: ");
		result.append(deviceID);
		result.append(", mountName: ");
		result.append(mountName);
		result.append(')');
		return result.toString();
	}

} //FileSystemNameImpl
