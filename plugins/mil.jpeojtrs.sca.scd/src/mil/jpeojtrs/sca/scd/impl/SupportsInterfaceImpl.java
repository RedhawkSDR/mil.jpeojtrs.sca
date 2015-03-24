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

import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.SupportsInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supports Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl#getRepId <em>Rep Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl#getSupportsName <em>Supports Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SupportsInterfaceImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportsInterfaceImpl extends EObjectImpl implements SupportsInterface {
	/**
	 * The default value of the '{@link #getRepId() <em>Rep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepId()
	 * @generated
	 * @ordered
	 */
	protected static final String REP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRepId() <em>Rep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepId()
	 * @generated
	 * @ordered
	 */
	protected String repId = REP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSupportsName() <em>Supports Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTS_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSupportsName() <em>Supports Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsName()
	 * @generated
	 * @ordered
	 */
	protected String supportsName = SUPPORTS_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportsInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.SUPPORTS_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepId() {
		return repId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepId(String newRepId) {
		String oldRepId = repId;
		repId = newRepId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SUPPORTS_INTERFACE__REP_ID, oldRepId, repId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupportsName() {
		return supportsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsName(String newSupportsName) {
		String oldSupportsName = supportsName;
		supportsName = newSupportsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SUPPORTS_INTERFACE__SUPPORTS_NAME, oldSupportsName, supportsName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getId() {
		// END GENERATED CODE
		return Util.buildId(getRepId());
		// BEGIN GENERATED CODE
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
		String uriFragment = getRepId();
		return (Interface) eResource().getEObject(uriFragment);
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
		this.setRepId(newInterface.getRepid());
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
		case ScdPackage.SUPPORTS_INTERFACE__REP_ID:
			return getRepId();
		case ScdPackage.SUPPORTS_INTERFACE__SUPPORTS_NAME:
			return getSupportsName();
		case ScdPackage.SUPPORTS_INTERFACE__ID:
			return getId();
		case ScdPackage.SUPPORTS_INTERFACE__INTERFACE:
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
		case ScdPackage.SUPPORTS_INTERFACE__REP_ID:
			setRepId((String) newValue);
			return;
		case ScdPackage.SUPPORTS_INTERFACE__SUPPORTS_NAME:
			setSupportsName((String) newValue);
			return;
		case ScdPackage.SUPPORTS_INTERFACE__INTERFACE:
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
		case ScdPackage.SUPPORTS_INTERFACE__REP_ID:
			setRepId(REP_ID_EDEFAULT);
			return;
		case ScdPackage.SUPPORTS_INTERFACE__SUPPORTS_NAME:
			setSupportsName(SUPPORTS_NAME_EDEFAULT);
			return;
		case ScdPackage.SUPPORTS_INTERFACE__INTERFACE:
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
		case ScdPackage.SUPPORTS_INTERFACE__REP_ID:
			return REP_ID_EDEFAULT == null ? repId != null : !REP_ID_EDEFAULT.equals(repId);
		case ScdPackage.SUPPORTS_INTERFACE__SUPPORTS_NAME:
			return SUPPORTS_NAME_EDEFAULT == null ? supportsName != null : !SUPPORTS_NAME_EDEFAULT.equals(supportsName);
		case ScdPackage.SUPPORTS_INTERFACE__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		case ScdPackage.SUPPORTS_INTERFACE__INTERFACE:
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
		result.append(" (repId: ");
		result.append(repId);
		result.append(", supportsName: ");
		result.append(supportsName);
		result.append(')');
		return result.toString();
	}

} //SupportsInterfaceImpl
