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
package mil.jpeojtrs.sca.dmd.impl;

import mil.jpeojtrs.sca.dmd.DmdPackage;
import mil.jpeojtrs.sca.dmd.FindBy;
import mil.jpeojtrs.sca.dmd.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.ServiceImpl#getUsesIdentifier <em>Uses Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.ServiceImpl#getFindBy <em>Find By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {

	/**
	 * The default value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String usesIdentifier = USES_IDENTIFIER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFindBy() <em>Find By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindBy()
	 * @generated
	 * @ordered
	 */
	protected FindBy findBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmdPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsesIdentifier() {
		return usesIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesIdentifier(String newUsesIdentifier) {
		String oldUsesIdentifier = usesIdentifier;
		usesIdentifier = newUsesIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.SERVICE__USES_IDENTIFIER, oldUsesIdentifier, usesIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindBy getFindBy() {
		return findBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindBy(FindBy newFindBy, NotificationChain msgs) {
		FindBy oldFindBy = findBy;
		findBy = newFindBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdPackage.SERVICE__FIND_BY, oldFindBy, newFindBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindBy(FindBy newFindBy) {
		if (newFindBy != findBy) {
			NotificationChain msgs = null;
			if (findBy != null)
				msgs = ((InternalEObject)findBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdPackage.SERVICE__FIND_BY, null, msgs);
			if (newFindBy != null)
				msgs = ((InternalEObject)newFindBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdPackage.SERVICE__FIND_BY, null, msgs);
			msgs = basicSetFindBy(newFindBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.SERVICE__FIND_BY, newFindBy, newFindBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmdPackage.SERVICE__FIND_BY:
				return basicSetFindBy(null, msgs);
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
			case DmdPackage.SERVICE__USES_IDENTIFIER:
				return getUsesIdentifier();
			case DmdPackage.SERVICE__FIND_BY:
				return getFindBy();
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
			case DmdPackage.SERVICE__USES_IDENTIFIER:
				setUsesIdentifier((String)newValue);
				return;
			case DmdPackage.SERVICE__FIND_BY:
				setFindBy((FindBy)newValue);
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
			case DmdPackage.SERVICE__USES_IDENTIFIER:
				setUsesIdentifier(USES_IDENTIFIER_EDEFAULT);
				return;
			case DmdPackage.SERVICE__FIND_BY:
				setFindBy((FindBy)null);
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
			case DmdPackage.SERVICE__USES_IDENTIFIER:
				return USES_IDENTIFIER_EDEFAULT == null ? usesIdentifier != null : !USES_IDENTIFIER_EDEFAULT.equals(usesIdentifier);
			case DmdPackage.SERVICE__FIND_BY:
				return findBy != null;
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
		result.append(" (usesIdentifier: ");
		result.append(usesIdentifier);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
