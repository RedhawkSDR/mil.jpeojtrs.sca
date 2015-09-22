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
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.Uses;
import mil.jpeojtrs.sca.util.collections.FeatureMapList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.PortsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.PortsImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.PortsImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortsImpl extends EObjectImpl implements Ports {

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.PORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ScdPackage.PORTS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Provides> getProvides() {
		return getGroup().list(ScdPackage.Literals.PORTS__PROVIDES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uses> getUses() {
		return getGroup().list(ScdPackage.Literals.PORTS__USES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AbstractPort getPort(String name) {
		for (AbstractPort port : new FeatureMapList<AbstractPort>(getGroup(), AbstractPort.class)) {
			if (name.equals(port.getName())) {
				return port;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScdPackage.PORTS__GROUP:
			return ((InternalEList< ? >) getGroup()).basicRemove(otherEnd, msgs);
		case ScdPackage.PORTS__PROVIDES:
			return ((InternalEList< ? >) getProvides()).basicRemove(otherEnd, msgs);
		case ScdPackage.PORTS__USES:
			return ((InternalEList< ? >) getUses()).basicRemove(otherEnd, msgs);
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
		case ScdPackage.PORTS__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case ScdPackage.PORTS__PROVIDES:
			return getProvides();
		case ScdPackage.PORTS__USES:
			return getUses();
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
		case ScdPackage.PORTS__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case ScdPackage.PORTS__PROVIDES:
			getProvides().clear();
			getProvides().addAll((Collection< ? extends Provides>) newValue);
			return;
		case ScdPackage.PORTS__USES:
			getUses().clear();
			getUses().addAll((Collection< ? extends Uses>) newValue);
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
		case ScdPackage.PORTS__GROUP:
			getGroup().clear();
			return;
		case ScdPackage.PORTS__PROVIDES:
			getProvides().clear();
			return;
		case ScdPackage.PORTS__USES:
			getUses().clear();
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
		case ScdPackage.PORTS__GROUP:
			return group != null && !group.isEmpty();
		case ScdPackage.PORTS__PROVIDES:
			return !getProvides().isEmpty();
		case ScdPackage.PORTS__USES:
			return !getUses().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

	/**
	 * @since 3.0
	 */
	@Override
	public List<AbstractPort> getAllPorts() {
		return new FeatureMapList<AbstractPort>(getGroup(), AbstractPort.class);
	}

} //PortsImpl
