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

import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.UsesImpl#getUsesName <em>Uses Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsesImpl extends AbstractPortImpl implements Uses {
	/**
	 * The default value of the '{@link #getUsesName() <em>Uses Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesName()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.USES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getUsesName() {
		// END GENERATED CODE
		return getName();
		// BEGIN GENERATED CODE
	}
	
	@Override
	public void setName(String newName) {
		// END GENERATED CODE
		String oldValue = getUsesName();
	    super.setName(newName);
	    if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.USES__USES_NAME, oldValue, getUsesName()));
	    }
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setUsesName(String newUsesName) {
		// END GENERATED CODE
		setName(newUsesName);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case ScdPackage.USES__USES_NAME:
				return getUsesName();
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
		switch (featureID)
		{
			case ScdPackage.USES__USES_NAME:
				setUsesName((String)newValue);
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
		switch (featureID)
		{
			case ScdPackage.USES__USES_NAME:
				setUsesName(USES_NAME_EDEFAULT);
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
		switch (featureID)
		{
			case ScdPackage.USES__USES_NAME:
				return USES_NAME_EDEFAULT == null ? getUsesName() != null : !USES_NAME_EDEFAULT.equals(getUsesName());
		}
		return super.eIsSet(featureID);
	}

} //UsesImpl
