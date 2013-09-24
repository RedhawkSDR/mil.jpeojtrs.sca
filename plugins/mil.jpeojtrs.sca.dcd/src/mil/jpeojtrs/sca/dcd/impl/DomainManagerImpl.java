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

import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DomainManager;
import mil.jpeojtrs.sca.partitioning.NamingService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DomainManagerImpl#getNamingService <em>Naming Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DomainManagerImpl#getStringifiedObjectRef <em>Stringified Object Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainManagerImpl extends EObjectImpl implements DomainManager {

	/**
	 * The cached value of the '{@link #getNamingService() <em>Naming Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingService()
	 * @generated
	 * @ordered
	 */
	protected NamingService namingService;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DOMAIN_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingService getNamingService() {
		return namingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingService(NamingService newNamingService, NotificationChain msgs) {
		NamingService oldNamingService = namingService;
		namingService = newNamingService;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE, oldNamingService, newNamingService);
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
	public void setNamingService(NamingService newNamingService) {
		if (newNamingService != namingService)
		{
			NotificationChain msgs = null;
			if (namingService != null)
				msgs = ((InternalEObject)namingService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE, null, msgs);
			if (newNamingService != null)
				msgs = ((InternalEObject)newNamingService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE, null, msgs);
			msgs = basicSetNamingService(newNamingService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE, newNamingService, newNamingService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF, oldStringifiedObjectRef, stringifiedObjectRef));
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
			case DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE:
				return basicSetNamingService(null, msgs);
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
			case DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE:
				return getNamingService();
			case DcdPackage.DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF:
				return getStringifiedObjectRef();
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
			case DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE:
				setNamingService((NamingService)newValue);
				return;
			case DcdPackage.DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF:
				setStringifiedObjectRef((String)newValue);
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
			case DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE:
				setNamingService((NamingService)null);
				return;
			case DcdPackage.DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF:
				setStringifiedObjectRef(STRINGIFIED_OBJECT_REF_EDEFAULT);
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
			case DcdPackage.DOMAIN_MANAGER__NAMING_SERVICE:
				return namingService != null;
			case DcdPackage.DOMAIN_MANAGER__STRINGIFIED_OBJECT_REF:
				return STRINGIFIED_OBJECT_REF_EDEFAULT == null ? stringifiedObjectRef != null : !STRINGIFIED_OBJECT_REF_EDEFAULT.equals(stringifiedObjectRef);
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

} //DomainManagerImpl
