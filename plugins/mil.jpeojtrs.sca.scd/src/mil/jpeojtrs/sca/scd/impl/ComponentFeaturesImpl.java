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
package mil.jpeojtrs.sca.scd.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.scd.ComponentFeatures;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.SupportsInterface;

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
 * An implementation of the model object '<em><b>Component Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.ComponentFeaturesImpl#getSupportsInterface <em>Supports Interface</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.ComponentFeaturesImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentFeaturesImpl extends EObjectImpl implements ComponentFeatures {

	/**
	 * The cached value of the '{@link #getSupportsInterface() <em>Supports Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportsInterface> supportsInterface;
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected Ports ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.COMPONENT_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupportsInterface> getSupportsInterface() {
		if (supportsInterface == null) {
			supportsInterface = new EObjectContainmentEList<SupportsInterface>(SupportsInterface.class, this,
				ScdPackage.COMPONENT_FEATURES__SUPPORTS_INTERFACE);
		}
		return supportsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ports getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(Ports newPorts, NotificationChain msgs) {
		Ports oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.COMPONENT_FEATURES__PORTS, oldPorts, newPorts);
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
	public void setPorts(Ports newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject) ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScdPackage.COMPONENT_FEATURES__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject) newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScdPackage.COMPONENT_FEATURES__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.COMPONENT_FEATURES__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScdPackage.COMPONENT_FEATURES__SUPPORTS_INTERFACE:
			return ((InternalEList< ? >) getSupportsInterface()).basicRemove(otherEnd, msgs);
		case ScdPackage.COMPONENT_FEATURES__PORTS:
			return basicSetPorts(null, msgs);
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
		case ScdPackage.COMPONENT_FEATURES__SUPPORTS_INTERFACE:
			return getSupportsInterface();
		case ScdPackage.COMPONENT_FEATURES__PORTS:
			return getPorts();
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
		case ScdPackage.COMPONENT_FEATURES__SUPPORTS_INTERFACE:
			getSupportsInterface().clear();
			getSupportsInterface().addAll((Collection< ? extends SupportsInterface>) newValue);
			return;
		case ScdPackage.COMPONENT_FEATURES__PORTS:
			setPorts((Ports) newValue);
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
		case ScdPackage.COMPONENT_FEATURES__SUPPORTS_INTERFACE:
			getSupportsInterface().clear();
			return;
		case ScdPackage.COMPONENT_FEATURES__PORTS:
			setPorts((Ports) null);
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
		case ScdPackage.COMPONENT_FEATURES__SUPPORTS_INTERFACE:
			return supportsInterface != null && !supportsInterface.isEmpty();
		case ScdPackage.COMPONENT_FEATURES__PORTS:
			return ports != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentFeaturesImpl
