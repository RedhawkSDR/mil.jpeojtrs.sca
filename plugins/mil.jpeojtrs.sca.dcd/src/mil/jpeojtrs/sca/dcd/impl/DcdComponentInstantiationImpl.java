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

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.partitioning.Requirements;
import mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentInstantiationImpl#getDeployerRequires <em>Deployer Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcdComponentInstantiationImpl extends ComponentInstantiationImpl implements DcdComponentInstantiation {

	/**
	 * The cached value of the '{@link #getDeployerRequires() <em>Deployer Requires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @see #getDeployerRequires()
	 * @generated
	 * @ordered
	 */
	protected Requirements deployerRequires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcdComponentInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DCD_COMPONENT_INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements getDeployerRequires() {
		return deployerRequires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployerRequires(Requirements newDeployerRequires, NotificationChain msgs) {
		Requirements oldDeployerRequires = deployerRequires;
		deployerRequires = newDeployerRequires;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES,
				oldDeployerRequires, newDeployerRequires);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployerRequires(Requirements newDeployerRequires) {
		if (newDeployerRequires != deployerRequires) {
			NotificationChain msgs = null;
			if (deployerRequires != null)
				msgs = ((InternalEObject) deployerRequires).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES, null, msgs);
			if (newDeployerRequires != null)
				msgs = ((InternalEObject) newDeployerRequires).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES, null, msgs);
			msgs = basicSetDeployerRequires(newDeployerRequires, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES, newDeployerRequires,
				newDeployerRequires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES:
			return basicSetDeployerRequires(null, msgs);
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
		case DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES:
			return getDeployerRequires();
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
		case DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES:
			setDeployerRequires((Requirements) newValue);
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
		case DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES:
			setDeployerRequires((Requirements) null);
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
		case DcdPackage.DCD_COMPONENT_INSTANTIATION__DEPLOYER_REQUIRES:
			return deployerRequires != null;
		}
		return super.eIsSet(featureID);
	}

} //DcdComponentInstantiationImpl
