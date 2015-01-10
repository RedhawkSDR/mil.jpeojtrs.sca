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

import mil.jpeojtrs.sca.partitioning.DomainFinder;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;

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
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByImpl#getNamingService <em>Naming Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByImpl#getDomainFinder <em>Domain Finder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindByImpl extends EObjectImpl implements FindBy {

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
		return PartitioningPackage.Literals.FIND_BY;
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
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY__NAMING_SERVICE, oldNamingService,
				newNamingService);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
		if (newNamingService != namingService) {
			NotificationChain msgs = null;
			if (namingService != null)
				msgs = ((InternalEObject) namingService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY__NAMING_SERVICE, null, msgs);
			if (newNamingService != null)
				msgs = ((InternalEObject) newNamingService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY__NAMING_SERVICE, null, msgs);
			msgs = basicSetNamingService(newNamingService, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY__NAMING_SERVICE, newNamingService, newNamingService));
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
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY__DOMAIN_FINDER, oldDomainFinder,
				newDomainFinder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
		if (newDomainFinder != domainFinder) {
			NotificationChain msgs = null;
			if (domainFinder != null)
				msgs = ((InternalEObject) domainFinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY__DOMAIN_FINDER, null, msgs);
			if (newDomainFinder != null)
				msgs = ((InternalEObject) newDomainFinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY__DOMAIN_FINDER, null, msgs);
			msgs = basicSetDomainFinder(newDomainFinder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY__DOMAIN_FINDER, newDomainFinder, newDomainFinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.FIND_BY__NAMING_SERVICE:
			return basicSetNamingService(null, msgs);
		case PartitioningPackage.FIND_BY__DOMAIN_FINDER:
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
		switch (featureID) {
		case PartitioningPackage.FIND_BY__NAMING_SERVICE:
			return getNamingService();
		case PartitioningPackage.FIND_BY__DOMAIN_FINDER:
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
		switch (featureID) {
		case PartitioningPackage.FIND_BY__NAMING_SERVICE:
			setNamingService((NamingService) newValue);
			return;
		case PartitioningPackage.FIND_BY__DOMAIN_FINDER:
			setDomainFinder((DomainFinder) newValue);
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
		case PartitioningPackage.FIND_BY__NAMING_SERVICE:
			setNamingService((NamingService) null);
			return;
		case PartitioningPackage.FIND_BY__DOMAIN_FINDER:
			setDomainFinder((DomainFinder) null);
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
		case PartitioningPackage.FIND_BY__NAMING_SERVICE:
			return namingService != null;
		case PartitioningPackage.FIND_BY__DOMAIN_FINDER:
			return domainFinder != null;
		}
		return super.eIsSet(featureID);
	}

} //FindByImpl
