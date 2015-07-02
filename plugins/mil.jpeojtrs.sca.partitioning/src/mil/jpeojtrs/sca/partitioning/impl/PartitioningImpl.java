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

import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.Partitioning;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partitioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl#getComponentPlacement <em>Component Placement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PartitioningImpl< C extends ComponentPlacement< ? > > extends EObjectImpl implements Partitioning<C> {

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.PARTITIONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParts() {
		if (parts == null) {
			parts = new BasicFeatureMap(this, PartitioningPackage.PARTITIONING__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<C> getComponentPlacement() {
		return getParts().list(PartitioningPackage.Literals.PARTITIONING__COMPONENT_PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.PARTITIONING__PARTS:
			return ((InternalEList< ? >) getParts()).basicRemove(otherEnd, msgs);
		case PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT:
			return ((InternalEList< ? >) getComponentPlacement()).basicRemove(otherEnd, msgs);
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
		case PartitioningPackage.PARTITIONING__PARTS:
			if (coreType)
				return getParts();
			return ((FeatureMap.Internal) getParts()).getWrapper();
		case PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT:
			return getComponentPlacement();
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
		case PartitioningPackage.PARTITIONING__PARTS:
			((FeatureMap.Internal) getParts()).set(newValue);
			return;
		case PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT:
			getComponentPlacement().clear();
			getComponentPlacement().addAll((Collection< ? extends C>) newValue);
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
		case PartitioningPackage.PARTITIONING__PARTS:
			getParts().clear();
			return;
		case PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT:
			getComponentPlacement().clear();
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
		case PartitioningPackage.PARTITIONING__PARTS:
			return parts != null && !parts.isEmpty();
		case PartitioningPackage.PARTITIONING__COMPONENT_PLACEMENT:
			return !getComponentPlacement().isEmpty();
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
		result.append(" (parts: ");
		result.append(parts);
		result.append(')');
		return result.toString();
	}

} //PartitioningImpl
