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

import java.util.Collection;

import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.DomainFinder;
import mil.jpeojtrs.sca.partitioning.FindByStub;
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find By Stub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl#getNamingService <em>Naming Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl#getDomainFinder <em>Domain Finder</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.FindByStubImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindByStubImpl extends EObjectImpl implements FindByStub {

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
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPortStub> provides;
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<UsesPortStub> uses;
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentSupportedInterfaceStub interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindByStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.FIND_BY_STUB;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE, oldNamingService, newNamingService);
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
				msgs = ((InternalEObject)namingService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE, null, msgs);
			if (newNamingService != null)
				msgs = ((InternalEObject)newNamingService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE, null, msgs);
			msgs = basicSetNamingService(newNamingService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE, newNamingService, newNamingService));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER, oldDomainFinder, newDomainFinder);
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
				msgs = ((InternalEObject)domainFinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER, null, msgs);
			if (newDomainFinder != null)
				msgs = ((InternalEObject)newDomainFinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER, null, msgs);
			msgs = basicSetDomainFinder(newDomainFinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER, newDomainFinder, newDomainFinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvidesPortStub> getProvides() {
		if (provides == null)
		{
			provides = new EObjectContainmentEList<ProvidesPortStub>(ProvidesPortStub.class, this, PartitioningPackage.FIND_BY_STUB__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsesPortStub> getUses() {
		if (uses == null)
		{
			uses = new EObjectContainmentEList<UsesPortStub>(UsesPortStub.class, this, PartitioningPackage.FIND_BY_STUB__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSupportedInterfaceStub getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(ComponentSupportedInterfaceStub newInterface, NotificationChain msgs) {
		ComponentSupportedInterfaceStub oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY_STUB__INTERFACE, oldInterface, newInterface);
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
	public void setInterface(ComponentSupportedInterfaceStub newInterface) {
		if (newInterface != interface_)
		{
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY_STUB__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.FIND_BY_STUB__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.FIND_BY_STUB__INTERFACE, newInterface, newInterface));
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
			case PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE:
				return basicSetNamingService(null, msgs);
			case PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER:
				return basicSetDomainFinder(null, msgs);
			case PartitioningPackage.FIND_BY_STUB__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
			case PartitioningPackage.FIND_BY_STUB__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case PartitioningPackage.FIND_BY_STUB__INTERFACE:
				return basicSetInterface(null, msgs);
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
			case PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE:
				return getNamingService();
			case PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER:
				return getDomainFinder();
			case PartitioningPackage.FIND_BY_STUB__PROVIDES:
				return getProvides();
			case PartitioningPackage.FIND_BY_STUB__USES:
				return getUses();
			case PartitioningPackage.FIND_BY_STUB__INTERFACE:
				return getInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE:
				setNamingService((NamingService)newValue);
				return;
			case PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER:
				setDomainFinder((DomainFinder)newValue);
				return;
			case PartitioningPackage.FIND_BY_STUB__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends ProvidesPortStub>)newValue);
				return;
			case PartitioningPackage.FIND_BY_STUB__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends UsesPortStub>)newValue);
				return;
			case PartitioningPackage.FIND_BY_STUB__INTERFACE:
				setInterface((ComponentSupportedInterfaceStub)newValue);
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
			case PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE:
				setNamingService((NamingService)null);
				return;
			case PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER:
				setDomainFinder((DomainFinder)null);
				return;
			case PartitioningPackage.FIND_BY_STUB__PROVIDES:
				getProvides().clear();
				return;
			case PartitioningPackage.FIND_BY_STUB__USES:
				getUses().clear();
				return;
			case PartitioningPackage.FIND_BY_STUB__INTERFACE:
				setInterface((ComponentSupportedInterfaceStub)null);
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
			case PartitioningPackage.FIND_BY_STUB__NAMING_SERVICE:
				return namingService != null;
			case PartitioningPackage.FIND_BY_STUB__DOMAIN_FINDER:
				return domainFinder != null;
			case PartitioningPackage.FIND_BY_STUB__PROVIDES:
				return provides != null && !provides.isEmpty();
			case PartitioningPackage.FIND_BY_STUB__USES:
				return uses != null && !uses.isEmpty();
			case PartitioningPackage.FIND_BY_STUB__INTERFACE:
				return interface_ != null;
		}
		return super.eIsSet(featureID);
	}

} //FindByStubImpl
