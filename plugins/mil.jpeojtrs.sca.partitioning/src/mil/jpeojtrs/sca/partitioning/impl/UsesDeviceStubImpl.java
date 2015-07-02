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
package mil.jpeojtrs.sca.partitioning.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesDeviceStub;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.spd.UsesDevice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Device Stub</b></em>'.
 * @since 2.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl#getUsesDevice <em>Uses Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl#getProvidesPortStubs <em>Provides Port Stubs</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl#getUsesPortStubs <em>Uses Port Stubs</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesDeviceStubImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsesDeviceStubImpl extends EObjectImpl implements UsesDeviceStub {
	/**
	 * The cached value of the '{@link #getUsesDevice() <em>Uses Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesDevice()
	 * @generated
	 * @ordered
	 */
	protected UsesDevice usesDevice;

	/**
	 * The cached value of the '{@link #getProvidesPortStubs() <em>Provides Port Stubs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesPortStubs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPortStub> providesPortStubs;

	/**
	 * The cached value of the '{@link #getUsesPortStubs() <em>Uses Port Stubs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesPortStubs()
	 * @generated
	 * @ordered
	 */
	protected EList<UsesPortStub> usesPortStubs;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentSupportedInterfaceStub interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.USES_DEVICE_STUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDevice getUsesDevice() {
		if (usesDevice != null && usesDevice.eIsProxy()) {
			InternalEObject oldUsesDevice = (InternalEObject) usesDevice;
			usesDevice = (UsesDevice) eResolveProxy(oldUsesDevice);
			if (usesDevice != oldUsesDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartitioningPackage.USES_DEVICE_STUB__USES_DEVICE, oldUsesDevice, usesDevice));
			}
		}
		return usesDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDevice basicGetUsesDevice() {
		return usesDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesDevice(UsesDevice newUsesDevice) {
		UsesDevice oldUsesDevice = usesDevice;
		usesDevice = newUsesDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_DEVICE_STUB__USES_DEVICE, oldUsesDevice, usesDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidesPortStub> getProvidesPortStubs() {
		if (providesPortStubs == null) {
			providesPortStubs = new EObjectContainmentEList<ProvidesPortStub>(ProvidesPortStub.class, this,
				PartitioningPackage.USES_DEVICE_STUB__PROVIDES_PORT_STUBS);
		}
		return providesPortStubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsesPortStub> getUsesPortStubs() {
		if (usesPortStubs == null) {
			usesPortStubs = new EObjectContainmentEList<UsesPortStub>(UsesPortStub.class, this, PartitioningPackage.USES_DEVICE_STUB__USES_PORT_STUBS);
		}
		return usesPortStubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSupportedInterfaceStub getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(ComponentSupportedInterfaceStub newInterface, NotificationChain msgs) {
		ComponentSupportedInterfaceStub oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_DEVICE_STUB__INTERFACE, oldInterface,
				newInterface);
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
	public void setInterface(ComponentSupportedInterfaceStub newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject) interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_DEVICE_STUB__INTERFACE, null,
					msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_DEVICE_STUB__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_DEVICE_STUB__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.USES_DEVICE_STUB__PROVIDES_PORT_STUBS:
			return ((InternalEList< ? >) getProvidesPortStubs()).basicRemove(otherEnd, msgs);
		case PartitioningPackage.USES_DEVICE_STUB__USES_PORT_STUBS:
			return ((InternalEList< ? >) getUsesPortStubs()).basicRemove(otherEnd, msgs);
		case PartitioningPackage.USES_DEVICE_STUB__INTERFACE:
			return basicSetInterface(null, msgs);
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
		case PartitioningPackage.USES_DEVICE_STUB__USES_DEVICE:
			if (resolve)
				return getUsesDevice();
			return basicGetUsesDevice();
		case PartitioningPackage.USES_DEVICE_STUB__PROVIDES_PORT_STUBS:
			return getProvidesPortStubs();
		case PartitioningPackage.USES_DEVICE_STUB__USES_PORT_STUBS:
			return getUsesPortStubs();
		case PartitioningPackage.USES_DEVICE_STUB__INTERFACE:
			return getInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PartitioningPackage.USES_DEVICE_STUB__USES_DEVICE:
			setUsesDevice((UsesDevice) newValue);
			return;
		case PartitioningPackage.USES_DEVICE_STUB__PROVIDES_PORT_STUBS:
			getProvidesPortStubs().clear();
			getProvidesPortStubs().addAll((Collection< ? extends ProvidesPortStub>) newValue);
			return;
		case PartitioningPackage.USES_DEVICE_STUB__USES_PORT_STUBS:
			getUsesPortStubs().clear();
			getUsesPortStubs().addAll((Collection< ? extends UsesPortStub>) newValue);
			return;
		case PartitioningPackage.USES_DEVICE_STUB__INTERFACE:
			setInterface((ComponentSupportedInterfaceStub) newValue);
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
		case PartitioningPackage.USES_DEVICE_STUB__USES_DEVICE:
			setUsesDevice((UsesDevice) null);
			return;
		case PartitioningPackage.USES_DEVICE_STUB__PROVIDES_PORT_STUBS:
			getProvidesPortStubs().clear();
			return;
		case PartitioningPackage.USES_DEVICE_STUB__USES_PORT_STUBS:
			getUsesPortStubs().clear();
			return;
		case PartitioningPackage.USES_DEVICE_STUB__INTERFACE:
			setInterface((ComponentSupportedInterfaceStub) null);
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
		case PartitioningPackage.USES_DEVICE_STUB__USES_DEVICE:
			return usesDevice != null;
		case PartitioningPackage.USES_DEVICE_STUB__PROVIDES_PORT_STUBS:
			return providesPortStubs != null && !providesPortStubs.isEmpty();
		case PartitioningPackage.USES_DEVICE_STUB__USES_PORT_STUBS:
			return usesPortStubs != null && !usesPortStubs.isEmpty();
		case PartitioningPackage.USES_DEVICE_STUB__INTERFACE:
			return interface_ != null;
		}
		return super.eIsSet(featureID);
	}

} //UsesDeviceStubImpl
