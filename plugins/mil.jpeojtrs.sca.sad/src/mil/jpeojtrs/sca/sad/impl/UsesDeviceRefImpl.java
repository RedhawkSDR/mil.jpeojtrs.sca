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
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.UsesDeviceRef;

import mil.jpeojtrs.sca.spd.UsesDevice;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Device Ref</b></em>'.
 * @since 4.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceRefImpl#getRefid <em>Refid</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceRefImpl#getUsesDevice <em>Uses Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsesDeviceRefImpl extends EObjectImpl implements UsesDeviceRef {
	/**
	 * The default value of the '{@link #getRefid() <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefid()
	 * @generated
	 * @ordered
	 */
	protected static final String REFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefid() <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefid()
	 * @generated
	 * @ordered
	 */
	protected String refid = REFID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.USES_DEVICE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefid() {
		return refid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefid(String newRefid) {
		String oldRefid = refid;
		refid = newRefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.USES_DEVICE_REF__REFID, oldRefid, refid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDevice getUsesDevice() {
		UsesDevice usesDevice = basicGetUsesDevice();
		return usesDevice != null && usesDevice.eIsProxy() ? (UsesDevice) eResolveProxy((InternalEObject) usesDevice) : usesDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UsesDevice basicGetUsesDevice() {
		// END GENERATED CODE
		if (eResource() == null) {
			return null;
		}
		String localRefId = getRefid();
		if (localRefId == null) {
			return null;
		}
		return (UsesDevice) eResource().getEObject(localRefId);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUsesDevice(UsesDevice newUsesDevice) {
		// END GENERATED CODE
		setRefid((newUsesDevice == null) ? null : newUsesDevice.getId());
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SadPackage.USES_DEVICE_REF__REFID:
			return getRefid();
		case SadPackage.USES_DEVICE_REF__USES_DEVICE:
			if (resolve)
				return getUsesDevice();
			return basicGetUsesDevice();
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
		case SadPackage.USES_DEVICE_REF__REFID:
			setRefid((String) newValue);
			return;
		case SadPackage.USES_DEVICE_REF__USES_DEVICE:
			setUsesDevice((UsesDevice) newValue);
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
		case SadPackage.USES_DEVICE_REF__REFID:
			setRefid(REFID_EDEFAULT);
			return;
		case SadPackage.USES_DEVICE_REF__USES_DEVICE:
			setUsesDevice((UsesDevice) null);
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
		case SadPackage.USES_DEVICE_REF__REFID:
			return REFID_EDEFAULT == null ? refid != null : !REFID_EDEFAULT.equals(refid);
		case SadPackage.USES_DEVICE_REF__USES_DEVICE:
			return basicGetUsesDevice() != null;
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
		result.append(" (refid: ");
		result.append(refid);
		result.append(')');
		return result.toString();
	}

} //UsesDeviceRefImpl
