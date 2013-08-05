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
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.sad.ExternalProperty;
import mil.jpeojtrs.sca.sad.SadPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Property</b></em>'.
 * @since 2.3
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl#getCompRefID <em>Comp Ref ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl#getPropID <em>Prop ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ExternalPropertyImpl#getExternalPropID <em>External Prop ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalPropertyImpl extends EObjectImpl implements ExternalProperty {
	/**
	 * The default value of the '{@link #getCompRefID() <em>Comp Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompRefID() <em>Comp Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompRefID()
	 * @generated
	 * @ordered
	 */
	protected String compRefID = COMP_REF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropID() <em>Prop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropID() <em>Prop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropID()
	 * @generated
	 * @ordered
	 */
	protected String propID = PROP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalPropID() <em>External Prop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalPropID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_PROP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalPropID() <em>External Prop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalPropID()
	 * @generated
	 * @ordered
	 */
	protected String externalPropID = EXTERNAL_PROP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.EXTERNAL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompRefID() {
		return compRefID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompRefID(String newCompRefID) {
		String oldCompRefID = compRefID;
		compRefID = newCompRefID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.EXTERNAL_PROPERTY__COMP_REF_ID, oldCompRefID, compRefID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropID() {
		return propID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropID(String newPropID) {
		String oldPropID = propID;
		propID = newPropID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.EXTERNAL_PROPERTY__PROP_ID, oldPropID, propID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalPropID() {
		return externalPropID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalPropID(String newExternalPropID) {
		String oldExternalPropID = externalPropID;
		externalPropID = newExternalPropID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.EXTERNAL_PROPERTY__EXTERNAL_PROP_ID, oldExternalPropID, externalPropID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String resolveExternalID()
	{
		if (this.getExternalPropID() != null) {
			return getExternalPropID();
		} else {
			return getPropID();
		}
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
			case SadPackage.EXTERNAL_PROPERTY__COMP_REF_ID:
				return getCompRefID();
			case SadPackage.EXTERNAL_PROPERTY__PROP_ID:
				return getPropID();
			case SadPackage.EXTERNAL_PROPERTY__EXTERNAL_PROP_ID:
				return getExternalPropID();
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
			case SadPackage.EXTERNAL_PROPERTY__COMP_REF_ID:
				setCompRefID((String)newValue);
				return;
			case SadPackage.EXTERNAL_PROPERTY__PROP_ID:
				setPropID((String)newValue);
				return;
			case SadPackage.EXTERNAL_PROPERTY__EXTERNAL_PROP_ID:
				setExternalPropID((String)newValue);
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
			case SadPackage.EXTERNAL_PROPERTY__COMP_REF_ID:
				setCompRefID(COMP_REF_ID_EDEFAULT);
				return;
			case SadPackage.EXTERNAL_PROPERTY__PROP_ID:
				setPropID(PROP_ID_EDEFAULT);
				return;
			case SadPackage.EXTERNAL_PROPERTY__EXTERNAL_PROP_ID:
				setExternalPropID(EXTERNAL_PROP_ID_EDEFAULT);
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
			case SadPackage.EXTERNAL_PROPERTY__COMP_REF_ID:
				return COMP_REF_ID_EDEFAULT == null ? compRefID != null : !COMP_REF_ID_EDEFAULT.equals(compRefID);
			case SadPackage.EXTERNAL_PROPERTY__PROP_ID:
				return PROP_ID_EDEFAULT == null ? propID != null : !PROP_ID_EDEFAULT.equals(propID);
			case SadPackage.EXTERNAL_PROPERTY__EXTERNAL_PROP_ID:
				return EXTERNAL_PROP_ID_EDEFAULT == null ? externalPropID != null : !EXTERNAL_PROP_ID_EDEFAULT.equals(externalPropID);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (compRefID: ");
		result.append(compRefID);
		result.append(", propID: ");
		result.append(propID);
		result.append(", externalPropID: ");
		result.append(externalPropID);
		result.append(')');
		return result.toString();
	}

} //ExternalPropertyImpl
