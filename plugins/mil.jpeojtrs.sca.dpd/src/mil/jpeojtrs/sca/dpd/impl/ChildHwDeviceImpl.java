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
package mil.jpeojtrs.sca.dpd.impl;

import mil.jpeojtrs.sca.dpd.ChildHwDevice;
import mil.jpeojtrs.sca.dpd.DevicePkgRef;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Hw Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.ChildHwDeviceImpl#getHwDeviceRegistration <em>Hw Device Registration</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.ChildHwDeviceImpl#getDevicePkgRef <em>Device Pkg Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildHwDeviceImpl extends EObjectImpl implements ChildHwDevice {

	/**
	 * The cached value of the '{@link #getHwDeviceRegistration() <em>Hw Device Registration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwDeviceRegistration()
	 * @generated
	 * @ordered
	 */
	protected HwDeviceRegistration hwDeviceRegistration;
	/**
	 * The cached value of the '{@link #getDevicePkgRef() <em>Device Pkg Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicePkgRef()
	 * @generated
	 * @ordered
	 */
	protected DevicePkgRef devicePkgRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildHwDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpdPackage.Literals.CHILD_HW_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceRegistration getHwDeviceRegistration() {
		return hwDeviceRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwDeviceRegistration(HwDeviceRegistration newHwDeviceRegistration, NotificationChain msgs) {
		HwDeviceRegistration oldHwDeviceRegistration = hwDeviceRegistration;
		hwDeviceRegistration = newHwDeviceRegistration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION, oldHwDeviceRegistration, newHwDeviceRegistration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwDeviceRegistration(HwDeviceRegistration newHwDeviceRegistration) {
		if (newHwDeviceRegistration != hwDeviceRegistration) {
			NotificationChain msgs = null;
			if (hwDeviceRegistration != null)
				msgs = ((InternalEObject)hwDeviceRegistration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION, null, msgs);
			if (newHwDeviceRegistration != null)
				msgs = ((InternalEObject)newHwDeviceRegistration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION, null, msgs);
			msgs = basicSetHwDeviceRegistration(newHwDeviceRegistration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION, newHwDeviceRegistration, newHwDeviceRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePkgRef getDevicePkgRef() {
		return devicePkgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevicePkgRef(DevicePkgRef newDevicePkgRef, NotificationChain msgs) {
		DevicePkgRef oldDevicePkgRef = devicePkgRef;
		devicePkgRef = newDevicePkgRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF, oldDevicePkgRef, newDevicePkgRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicePkgRef(DevicePkgRef newDevicePkgRef) {
		if (newDevicePkgRef != devicePkgRef) {
			NotificationChain msgs = null;
			if (devicePkgRef != null)
				msgs = ((InternalEObject)devicePkgRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF, null, msgs);
			if (newDevicePkgRef != null)
				msgs = ((InternalEObject)newDevicePkgRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF, null, msgs);
			msgs = basicSetDevicePkgRef(newDevicePkgRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF, newDevicePkgRef, newDevicePkgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION:
				return basicSetHwDeviceRegistration(null, msgs);
			case DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF:
				return basicSetDevicePkgRef(null, msgs);
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
			case DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION:
				return getHwDeviceRegistration();
			case DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF:
				return getDevicePkgRef();
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
			case DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION:
				setHwDeviceRegistration((HwDeviceRegistration)newValue);
				return;
			case DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF:
				setDevicePkgRef((DevicePkgRef)newValue);
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
			case DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION:
				setHwDeviceRegistration((HwDeviceRegistration)null);
				return;
			case DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF:
				setDevicePkgRef((DevicePkgRef)null);
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
			case DpdPackage.CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION:
				return hwDeviceRegistration != null;
			case DpdPackage.CHILD_HW_DEVICE__DEVICE_PKG_REF:
				return devicePkgRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildHwDeviceImpl
