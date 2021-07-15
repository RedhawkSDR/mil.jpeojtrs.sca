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
package mil.jpeojtrs.sca.spd.impl;

import mil.jpeojtrs.sca.spd.ChildSoftwarePackageFile;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.SpdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Software Package File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ChildSoftwarePackageFileImpl#getLocalFile <em>Local File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildSoftwarePackageFileImpl extends EObjectImpl implements ChildSoftwarePackageFile {
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
	protected ChildSoftwarePackageFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.CHILD_SOFTWARE_PACKAGE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile getLocalFile() {
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalFile(LocalFile newLocalFile, NotificationChain msgs) {
		LocalFile oldLocalFile = localFile;
		localFile = newLocalFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE, oldLocalFile,
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
	 * @generated
	 */
	public void setLocalFile(LocalFile newLocalFile) {
		if (newLocalFile != localFile) {
			NotificationChain msgs = null;
			if (localFile != null)
				msgs = ((InternalEObject) localFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE, null,
					msgs);
			if (newLocalFile != null)
				msgs = ((InternalEObject) newLocalFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE, null,
					msgs);
			msgs = basicSetLocalFile(newLocalFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE, newLocalFile, newLocalFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE:
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
		case SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE:
			return getLocalFile();
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
		case SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE:
			setLocalFile((LocalFile) newValue);
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
		case SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE:
			setLocalFile((LocalFile) null);
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
		case SpdPackage.CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE:
			return localFile != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildSoftwarePackageFileImpl
