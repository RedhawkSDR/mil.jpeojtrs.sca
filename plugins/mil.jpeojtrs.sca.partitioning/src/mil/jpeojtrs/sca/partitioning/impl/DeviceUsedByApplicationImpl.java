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

import mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Used By Application</b></em>'.
 * @since 2.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByApplicationImpl#getRefId <em>Ref Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.DeviceUsedByApplicationImpl#getUsesRefId <em>Uses Ref Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUsedByApplicationImpl extends EObjectImpl implements DeviceUsedByApplication {
	/**
	 * The default value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected String refId = REF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsesRefId() <em>Uses Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesRefId()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsesRefId() <em>Uses Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesRefId()
	 * @generated
	 * @ordered
	 */
	protected String usesRefId = USES_REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUsedByApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.DEVICE_USED_BY_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefId(String newRefId) {
		String oldRefId = refId;
		refId = newRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.DEVICE_USED_BY_APPLICATION__REF_ID, oldRefId, refId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsesRefId() {
		return usesRefId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesRefId(String newUsesRefId) {
		String oldUsesRefId = usesRefId;
		usesRefId = newUsesRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.DEVICE_USED_BY_APPLICATION__USES_REF_ID, oldUsesRefId, usesRefId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__REF_ID:
			return getRefId();
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__USES_REF_ID:
			return getUsesRefId();
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
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__REF_ID:
			setRefId((String) newValue);
			return;
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__USES_REF_ID:
			setUsesRefId((String) newValue);
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
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__REF_ID:
			setRefId(REF_ID_EDEFAULT);
			return;
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__USES_REF_ID:
			setUsesRefId(USES_REF_ID_EDEFAULT);
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
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__REF_ID:
			return REF_ID_EDEFAULT == null ? refId != null : !REF_ID_EDEFAULT.equals(refId);
		case PartitioningPackage.DEVICE_USED_BY_APPLICATION__USES_REF_ID:
			return USES_REF_ID_EDEFAULT == null ? usesRefId != null : !USES_REF_ID_EDEFAULT.equals(usesRefId);
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
		result.append(" (refId: ");
		result.append(refId);
		result.append(", usesRefId: ");
		result.append(usesRefId);
		result.append(')');
		return result.toString();
	}

} //DeviceUsedByApplicationImpl
