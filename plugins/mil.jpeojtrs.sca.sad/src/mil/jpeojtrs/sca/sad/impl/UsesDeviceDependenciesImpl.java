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

import java.util.Collection;

import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.UsesDeviceDependencies;
import mil.jpeojtrs.sca.spd.UsesDevice;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Device Dependencies</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.UsesDeviceDependenciesImpl#getUsesdevice <em>Usesdevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsesDeviceDependenciesImpl extends EObjectImpl implements UsesDeviceDependencies {
	/**
	 * The cached value of the '{@link #getUsesdevice() <em>Usesdevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesdevice()
	 * @generated
	 * @ordered
	 */
	protected EList<UsesDevice> usesdevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.USES_DEVICE_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsesDevice> getUsesdevice() {
		if (usesdevice == null) {
			usesdevice = new EObjectContainmentEList<UsesDevice>(UsesDevice.class, this, SadPackage.USES_DEVICE_DEPENDENCIES__USESDEVICE);
		}
		return usesdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SadPackage.USES_DEVICE_DEPENDENCIES__USESDEVICE:
			return ((InternalEList< ? >) getUsesdevice()).basicRemove(otherEnd, msgs);
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
		case SadPackage.USES_DEVICE_DEPENDENCIES__USESDEVICE:
			return getUsesdevice();
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
		case SadPackage.USES_DEVICE_DEPENDENCIES__USESDEVICE:
			getUsesdevice().clear();
			getUsesdevice().addAll((Collection< ? extends UsesDevice>) newValue);
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
		case SadPackage.USES_DEVICE_DEPENDENCIES__USESDEVICE:
			getUsesdevice().clear();
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
		case SadPackage.USES_DEVICE_DEPENDENCIES__USESDEVICE:
			return usesdevice != null && !usesdevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsesDeviceDependenciesImpl
