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

import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.util.ScaFileSystemConstants;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Manager Soft Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceManagerSoftPkgImpl#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DeviceManagerSoftPkgImpl#getSoftPkg <em>Soft Pkg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagerSoftPkgImpl extends EObjectImpl implements DeviceManagerSoftPkg {
	/**
	 * The cached value of the '{@link #getLocalFile() <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFile()
	 * @generated
	 * @ordered
	 */
	protected LocalFile localFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagerSoftPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DEVICE_MANAGER_SOFT_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalFile getLocalFile() {
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalFileGen(LocalFile newLocalFile, NotificationChain msgs) {
		LocalFile oldLocalFile = localFile;
		localFile = newLocalFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE, oldLocalFile,
				newLocalFile);
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
	 * @generated NOT
	 */
	public NotificationChain basicSetLocalFile(LocalFile newLocalFile, NotificationChain msgs) {
		SoftPkg oldSpd = getSoftPkg();
		msgs = basicSetLocalFileGen(newLocalFile, msgs);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_MANAGER_SOFT_PKG__SOFT_PKG, oldSpd, getSoftPkg());
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
	public void setLocalFile(LocalFile newLocalFile) {
		if (newLocalFile != localFile) {
			NotificationChain msgs = null;
			if (localFile != null)
				msgs = ((InternalEObject) localFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE, null, msgs);
			if (newLocalFile != null)
				msgs = ((InternalEObject) newLocalFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE, null, msgs);
			msgs = basicSetLocalFile(newLocalFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE, newLocalFile, newLocalFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftPkg getSoftPkg() {
		SoftPkg softPkg = basicGetSoftPkg();
		return softPkg != null && softPkg.eIsProxy() ? (SoftPkg) eResolveProxy((InternalEObject) softPkg) : softPkg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SoftPkg basicGetSoftPkg() {
		// END GENERATED CODE
		if (this.getLocalFile() == null) {
			return null;
		}
		Resource resource = ScaUriHelpers.getLocalFileResource(this.getLocalFile().getName(), this, ScaFileSystemConstants.SCHEME_TARGET_SDR_DEV);
		return SoftPkg.Util.getSoftPkg(resource);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setSoftPkg(final SoftPkg newSoftPkg) {
		// END GENERATED CODE
		String path = ScaUriHelpers.getLocalFilePath(this, newSoftPkg);
		LocalFile newFile = null;
		if (path != null) {
			newFile = PartitioningFactory.eINSTANCE.createLocalFile();
			newFile.setName(path);
		}
		setLocalFile(newFile);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE:
			return basicSetLocalFile(null, msgs);
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
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE:
			return getLocalFile();
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__SOFT_PKG:
			if (resolve)
				return getSoftPkg();
			return basicGetSoftPkg();
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
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE:
			setLocalFile((LocalFile) newValue);
			return;
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__SOFT_PKG:
			setSoftPkg((SoftPkg) newValue);
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
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE:
			setLocalFile((LocalFile) null);
			return;
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__SOFT_PKG:
			setSoftPkg((SoftPkg) null);
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
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__LOCAL_FILE:
			return localFile != null;
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG__SOFT_PKG:
			return basicGetSoftPkg() != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagerSoftPkgImpl
