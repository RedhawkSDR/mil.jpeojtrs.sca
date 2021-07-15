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

import mil.jpeojtrs.sca.spd.Child;
import mil.jpeojtrs.sca.spd.ChildSoftwarePackageFile;
import mil.jpeojtrs.sca.spd.SpdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ChildImpl#getChildSoftwarePackageFile <em>Child Software Package File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildImpl extends EObjectImpl implements Child {
	/**
	 * The cached value of the '{@link #getChildSoftwarePackageFile() <em>Child Software Package File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSoftwarePackageFile()
	 * @generated
	 * @ordered
	 */
	protected ChildSoftwarePackageFile childSoftwarePackageFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.CHILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildSoftwarePackageFile getChildSoftwarePackageFile() {
		return childSoftwarePackageFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildSoftwarePackageFile(ChildSoftwarePackageFile newChildSoftwarePackageFile, NotificationChain msgs) {
		ChildSoftwarePackageFile oldChildSoftwarePackageFile = childSoftwarePackageFile;
		childSoftwarePackageFile = newChildSoftwarePackageFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE,
				oldChildSoftwarePackageFile, newChildSoftwarePackageFile);
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
	public void setChildSoftwarePackageFile(ChildSoftwarePackageFile newChildSoftwarePackageFile) {
		if (newChildSoftwarePackageFile != childSoftwarePackageFile) {
			NotificationChain msgs = null;
			if (childSoftwarePackageFile != null)
				msgs = ((InternalEObject) childSoftwarePackageFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE,
					null, msgs);
			if (newChildSoftwarePackageFile != null)
				msgs = ((InternalEObject) newChildSoftwarePackageFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE,
					null, msgs);
			msgs = basicSetChildSoftwarePackageFile(newChildSoftwarePackageFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE, newChildSoftwarePackageFile,
				newChildSoftwarePackageFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE:
			return basicSetChildSoftwarePackageFile(null, msgs);
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
		case SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE:
			return getChildSoftwarePackageFile();
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
		case SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE:
			setChildSoftwarePackageFile((ChildSoftwarePackageFile) newValue);
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
		case SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE:
			setChildSoftwarePackageFile((ChildSoftwarePackageFile) null);
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
		case SpdPackage.CHILD__CHILD_SOFTWARE_PACKAGE_FILE:
			return childSoftwarePackageFile != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildImpl
