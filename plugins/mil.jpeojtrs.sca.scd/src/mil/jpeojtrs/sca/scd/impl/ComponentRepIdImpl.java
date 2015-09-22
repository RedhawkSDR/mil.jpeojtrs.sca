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

import mil.jpeojtrs.sca.scd.ComponentRepId;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.ScdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Rep Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.ComponentRepIdImpl#getRepid <em>Repid</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.ComponentRepIdImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRepIdImpl extends EObjectImpl implements ComponentRepId {
	/**
	 * The default value of the '{@link #getRepid() <em>Repid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepid()
	 * @generated
	 * @ordered
	 */
	protected static final String REPID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRepid() <em>Repid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepid()
	 * @generated
	 * @ordered
	 */
	protected String repid = REPID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRepIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.COMPONENT_REP_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepid() {
		return repid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepid(String newRepid) {
		String oldRepid = repid;
		repid = newRepid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.COMPONENT_REP_ID__REPID, oldRepid, repid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterface() {
		Interface interface_ = basicGetInterface();
		return interface_ != null && interface_.eIsProxy() ? (Interface) eResolveProxy((InternalEObject) interface_) : interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Interface basicGetInterface() {
		// END GENERATED CODE
		if ((eResource() == null) || (getRepid() == null)) {
			return null;
		}
		return (Interface) eResource().getEObject(getRepid());
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setInterface(Interface newInterface) {
		// END GENERATED CODE
		String newRepId;
		if (newInterface == null) {
			newRepId = null;
		} else {
			newRepId = newInterface.getRepid();
		}
		this.setRepid(newRepId);
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
		case ScdPackage.COMPONENT_REP_ID__REPID:
			return getRepid();
		case ScdPackage.COMPONENT_REP_ID__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
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
		case ScdPackage.COMPONENT_REP_ID__REPID:
			setRepid((String) newValue);
			return;
		case ScdPackage.COMPONENT_REP_ID__INTERFACE:
			setInterface((Interface) newValue);
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
		case ScdPackage.COMPONENT_REP_ID__REPID:
			setRepid(REPID_EDEFAULT);
			return;
		case ScdPackage.COMPONENT_REP_ID__INTERFACE:
			setInterface((Interface) null);
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
		case ScdPackage.COMPONENT_REP_ID__REPID:
			return REPID_EDEFAULT == null ? repid != null : !REPID_EDEFAULT.equals(repid);
		case ScdPackage.COMPONENT_REP_ID__INTERFACE:
			return basicGetInterface() != null;
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
		result.append(" (repid: ");
		result.append(repid);
		result.append(')');
		return result.toString();
	}

} //ComponentRepIdImpl
