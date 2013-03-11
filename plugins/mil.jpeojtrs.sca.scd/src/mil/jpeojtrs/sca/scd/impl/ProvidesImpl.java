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
package mil.jpeojtrs.sca.scd.impl;

import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.ScdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.ProvidesImpl#getProvidesName <em>Provides Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidesImpl extends AbstractPortImpl implements Provides {
	/**
	 * The default value of the '{@link #getProvidesName() <em>Provides Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDES_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.PROVIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getProvidesName() {
		// END GENERATED CODE
		return getName();
		// BEGIN GENERATED CODE
	}
	
	@Override
	public void setName(String newName) {
		// END GENERATED CODE
		String oldValue = getProvidesName();
	    super.setName(newName);
	    if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.PROVIDES__PROVIDES_NAME, oldValue, getProvidesName()));
	    }
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProvidesName(String newProvidesName) {
		// END GENERATED CODE
		setName(newProvidesName);
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
			case ScdPackage.PROVIDES__PROVIDES_NAME:
				return getProvidesName();
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
			case ScdPackage.PROVIDES__PROVIDES_NAME:
				setProvidesName((String)newValue);
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
			case ScdPackage.PROVIDES__PROVIDES_NAME:
				setProvidesName(PROVIDES_NAME_EDEFAULT);
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
			case ScdPackage.PROVIDES__PROVIDES_NAME:
				return PROVIDES_NAME_EDEFAULT == null ? getProvidesName() != null : !PROVIDES_NAME_EDEFAULT.equals(getProvidesName());
		}
		return super.eIsSet(featureID);
	}

} //ProvidesImpl
