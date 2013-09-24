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
import mil.jpeojtrs.sca.dmd.DomainFinder;
import mil.jpeojtrs.sca.dmd.FindBy;
import mil.jpeojtrs.sca.dmd.NamingService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.FindByImpl#getNameService <em>Name Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.FindByImpl#getStringifiedObjectRef <em>Stringified Object Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.FindByImpl#getDomainFinder <em>Domain Finder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindByImpl extends EObjectImpl implements FindBy {

	/**
	 * The cached value of the '{@link #getNameService() <em>Name Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameService()
	 * @generated
	 * @ordered
	 */
	protected NamingService nameService;
	/**
	 * The default value of the '{@link #getStringifiedObjectRef() <em>Stringified Object Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringifiedObjectRef()
	 * @generated
	 * @ordered
	 */
	protected static final String STRINGIFIED_OBJECT_REF_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStringifiedObjectRef() <em>Stringified Object Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringifiedObjectRef()
	 * @generated
	 * @ordered
	 */
	protected String stringifiedObjectRef = STRINGIFIED_OBJECT_REF_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDomainFinder() <em>Domain Finder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainFinder()
	 * @generated
	 * @ordered
	 */
	protected DomainFinder domainFinder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmdPackage.Literals.FIND_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingService getNameService() {
		return nameService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameService(NamingService newNameService, NotificationChain msgs) {
		NamingService oldNameService = nameService;
		nameService = newNameService;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdPackage.FIND_BY__NAME_SERVICE, oldNameService, newNameService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameService(NamingService newNameService) {
		if (newNameService != nameService)
		{
			NotificationChain msgs = null;
			if (nameService != null)
				msgs = ((InternalEObject)nameService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdPackage.FIND_BY__NAME_SERVICE, null, msgs);
			if (newNameService != null)
				msgs = ((InternalEObject)newNameService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdPackage.FIND_BY__NAME_SERVICE, null, msgs);
			msgs = basicSetNameService(newNameService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.FIND_BY__NAME_SERVICE, newNameService, newNameService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringifiedObjectRef() {
		return stringifiedObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringifiedObjectRef(String newStringifiedObjectRef) {
		String oldStringifiedObjectRef = stringifiedObjectRef;
		stringifiedObjectRef = newStringifiedObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.FIND_BY__STRINGIFIED_OBJECT_REF, oldStringifiedObjectRef, stringifiedObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainFinder getDomainFinder() {
		return domainFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainFinder(DomainFinder newDomainFinder, NotificationChain msgs) {
		DomainFinder oldDomainFinder = domainFinder;
		domainFinder = newDomainFinder;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdPackage.FIND_BY__DOMAIN_FINDER, oldDomainFinder, newDomainFinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainFinder(DomainFinder newDomainFinder) {
		if (newDomainFinder != domainFinder)
		{
			NotificationChain msgs = null;
			if (domainFinder != null)
				msgs = ((InternalEObject)domainFinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdPackage.FIND_BY__DOMAIN_FINDER, null, msgs);
			if (newDomainFinder != null)
				msgs = ((InternalEObject)newDomainFinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdPackage.FIND_BY__DOMAIN_FINDER, null, msgs);
			msgs = basicSetDomainFinder(newDomainFinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.FIND_BY__DOMAIN_FINDER, newDomainFinder, newDomainFinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case DmdPackage.FIND_BY__NAME_SERVICE:
				return basicSetNameService(null, msgs);
			case DmdPackage.FIND_BY__DOMAIN_FINDER:
				return basicSetDomainFinder(null, msgs);
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
		switch (featureID)
		{
			case DmdPackage.FIND_BY__NAME_SERVICE:
				return getNameService();
			case DmdPackage.FIND_BY__STRINGIFIED_OBJECT_REF:
				return getStringifiedObjectRef();
			case DmdPackage.FIND_BY__DOMAIN_FINDER:
				return getDomainFinder();
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
			case DmdPackage.FIND_BY__NAME_SERVICE:
				setNameService((NamingService)newValue);
				return;
			case DmdPackage.FIND_BY__STRINGIFIED_OBJECT_REF:
				setStringifiedObjectRef((String)newValue);
				return;
			case DmdPackage.FIND_BY__DOMAIN_FINDER:
				setDomainFinder((DomainFinder)newValue);
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
			case DmdPackage.FIND_BY__NAME_SERVICE:
				setNameService((NamingService)null);
				return;
			case DmdPackage.FIND_BY__STRINGIFIED_OBJECT_REF:
				setStringifiedObjectRef(STRINGIFIED_OBJECT_REF_EDEFAULT);
				return;
			case DmdPackage.FIND_BY__DOMAIN_FINDER:
				setDomainFinder((DomainFinder)null);
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
			case DmdPackage.FIND_BY__NAME_SERVICE:
				return nameService != null;
			case DmdPackage.FIND_BY__STRINGIFIED_OBJECT_REF:
				return STRINGIFIED_OBJECT_REF_EDEFAULT == null ? stringifiedObjectRef != null : !STRINGIFIED_OBJECT_REF_EDEFAULT.equals(stringifiedObjectRef);
			case DmdPackage.FIND_BY__DOMAIN_FINDER:
				return domainFinder != null;
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
		result.append(" (stringifiedObjectRef: ");
		result.append(stringifiedObjectRef);
		result.append(')');
		return result.toString();
	}

} //FindByImpl
