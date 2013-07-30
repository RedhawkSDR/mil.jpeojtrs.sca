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
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg;
import mil.jpeojtrs.sca.dmd.Services;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Manager Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl#getDomainManagerSoftPkg <em>Domain Manager Soft Pkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.impl.DomainManagerConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainManagerConfigurationImpl extends EObjectImpl implements DomainManagerConfiguration {

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDomainManagerSoftPkg() <em>Domain Manager Soft Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainManagerSoftPkg()
	 * @generated
	 * @ordered
	 */
	protected DomainManagerSoftPkg domainManagerSoftPkg;
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;
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
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmdPackage.Literals.DOMAIN_MANAGER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManagerSoftPkg getDomainManagerSoftPkg() {
		return domainManagerSoftPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainManagerSoftPkg(DomainManagerSoftPkg newDomainManagerSoftPkg, NotificationChain msgs) {
		DomainManagerSoftPkg oldDomainManagerSoftPkg = domainManagerSoftPkg;
		domainManagerSoftPkg = newDomainManagerSoftPkg;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG, oldDomainManagerSoftPkg, newDomainManagerSoftPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainManagerSoftPkg(DomainManagerSoftPkg newDomainManagerSoftPkg) {
		if (newDomainManagerSoftPkg != domainManagerSoftPkg)
		{
			NotificationChain msgs = null;
			if (domainManagerSoftPkg != null)
				msgs = ((InternalEObject)domainManagerSoftPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG, null, msgs);
			if (newDomainManagerSoftPkg != null)
				msgs = ((InternalEObject)newDomainManagerSoftPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG, null, msgs);
			msgs = basicSetDomainManagerSoftPkg(newDomainManagerSoftPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG, newDomainManagerSoftPkg, newDomainManagerSoftPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(Services newServices, NotificationChain msgs) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Services newServices) {
		if (newServices != services)
		{
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmdPackage.DOMAIN_MANAGER_CONFIGURATION__NAME, oldName, name));
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
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG:
				return basicSetDomainManagerSoftPkg(null, msgs);
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES:
				return basicSetServices(null, msgs);
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
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION:
				return getDescription();
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG:
				return getDomainManagerSoftPkg();
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES:
				return getServices();
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__ID:
				return getId();
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__NAME:
				return getName();
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
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG:
				setDomainManagerSoftPkg((DomainManagerSoftPkg)newValue);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES:
				setServices((Services)newValue);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__NAME:
				setName((String)newValue);
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
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG:
				setDomainManagerSoftPkg((DomainManagerSoftPkg)null);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES:
				setServices((Services)null);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
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
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__DOMAIN_MANAGER_SOFT_PKG:
				return domainManagerSoftPkg != null;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__SERVICES:
				return services != null;
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DmdPackage.DOMAIN_MANAGER_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainManagerConfigurationImpl
