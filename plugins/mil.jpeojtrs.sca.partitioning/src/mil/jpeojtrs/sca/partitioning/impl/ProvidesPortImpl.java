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

import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl#getProvidesIdentifier <em>Provides Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ProvidesPortImpl#getFindBy <em>Find By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProvidesPortImpl<P extends ComponentInstantiationRef<?>> extends EObjectImpl implements ProvidesPort<P> {

	/**
	 * The default value of the '{@link #getProvidesIdentifier() <em>Provides Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDES_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProvidesIdentifier() <em>Provides Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String providesIdentifier = PROVIDES_IDENTIFIER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentInstantiationRef() <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstantiationRef()
	 * @generated
	 * @ordered
	 */
	protected P componentInstantiationRef;
	/**
	 * The cached value of the '{@link #getDeviceThatLoadedThisComponentRef() <em>Device That Loaded This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceThatLoadedThisComponentRef()
	 * @generated
	 * @ordered
	 */
	protected DeviceThatLoadedThisComponentRef deviceThatLoadedThisComponentRef;
	/**
	 * The cached value of the '{@link #getDeviceUsedByThisComponentRef() <em>Device Used By This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceUsedByThisComponentRef()
	 * @generated
	 * @ordered
	 */
	protected DeviceUsedByThisComponentRef deviceUsedByThisComponentRef;
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
	protected ProvidesPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.PROVIDES_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvidesIdentifier() {
		return providesIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesIdentifier(String newProvidesIdentifier) {
		String oldProvidesIdentifier = providesIdentifier;
		providesIdentifier = newProvidesIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER, oldProvidesIdentifier, providesIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P getComponentInstantiationRef() {
		return componentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstantiationRef(P newComponentInstantiationRef, NotificationChain msgs) {
		P oldComponentInstantiationRef = componentInstantiationRef;
		componentInstantiationRef = newComponentInstantiationRef;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF, oldComponentInstantiationRef, newComponentInstantiationRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstantiationRef(P newComponentInstantiationRef) {
		if (newComponentInstantiationRef != componentInstantiationRef)
		{
			NotificationChain msgs = null;
			if (componentInstantiationRef != null)
				msgs = ((InternalEObject)componentInstantiationRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF, null, msgs);
			if (newComponentInstantiationRef != null)
				msgs = ((InternalEObject)newComponentInstantiationRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF, null, msgs);
			msgs = basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF, newComponentInstantiationRef, newComponentInstantiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceThatLoadedThisComponentRef getDeviceThatLoadedThisComponentRef() {
		return deviceThatLoadedThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef newDeviceThatLoadedThisComponentRef, NotificationChain msgs) {
		DeviceThatLoadedThisComponentRef oldDeviceThatLoadedThisComponentRef = deviceThatLoadedThisComponentRef;
		deviceThatLoadedThisComponentRef = newDeviceThatLoadedThisComponentRef;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, oldDeviceThatLoadedThisComponentRef, newDeviceThatLoadedThisComponentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef newDeviceThatLoadedThisComponentRef) {
		if (newDeviceThatLoadedThisComponentRef != deviceThatLoadedThisComponentRef)
		{
			NotificationChain msgs = null;
			if (deviceThatLoadedThisComponentRef != null)
				msgs = ((InternalEObject)deviceThatLoadedThisComponentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, null, msgs);
			if (newDeviceThatLoadedThisComponentRef != null)
				msgs = ((InternalEObject)newDeviceThatLoadedThisComponentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, null, msgs);
			msgs = basicSetDeviceThatLoadedThisComponentRef(newDeviceThatLoadedThisComponentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, newDeviceThatLoadedThisComponentRef, newDeviceThatLoadedThisComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsedByThisComponentRef getDeviceUsedByThisComponentRef() {
		return deviceUsedByThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef newDeviceUsedByThisComponentRef, NotificationChain msgs) {
		DeviceUsedByThisComponentRef oldDeviceUsedByThisComponentRef = deviceUsedByThisComponentRef;
		deviceUsedByThisComponentRef = newDeviceUsedByThisComponentRef;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF, oldDeviceUsedByThisComponentRef, newDeviceUsedByThisComponentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef newDeviceUsedByThisComponentRef) {
		if (newDeviceUsedByThisComponentRef != deviceUsedByThisComponentRef)
		{
			NotificationChain msgs = null;
			if (deviceUsedByThisComponentRef != null)
				msgs = ((InternalEObject)deviceUsedByThisComponentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF, null, msgs);
			if (newDeviceUsedByThisComponentRef != null)
				msgs = ((InternalEObject)newDeviceUsedByThisComponentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF, null, msgs);
			msgs = basicSetDeviceUsedByThisComponentRef(newDeviceUsedByThisComponentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF, newDeviceUsedByThisComponentRef, newDeviceUsedByThisComponentRef));
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__FIND_BY, oldFindBy, newFindBy);
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
		if (newFindBy != findBy)
		{
			NotificationChain msgs = null;
			if (findBy != null)
				msgs = ((InternalEObject)findBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__FIND_BY, null, msgs);
			if (newFindBy != null)
				msgs = ((InternalEObject)newFindBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.PROVIDES_PORT__FIND_BY, null, msgs);
			msgs = basicSetFindBy(newFindBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.PROVIDES_PORT__FIND_BY, newFindBy, newFindBy));
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
			case PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF:
				return basicSetComponentInstantiationRef(null, msgs);
			case PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
				return basicSetDeviceThatLoadedThisComponentRef(null, msgs);
			case PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
				return basicSetDeviceUsedByThisComponentRef(null, msgs);
			case PartitioningPackage.PROVIDES_PORT__FIND_BY:
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
		switch (featureID)
		{
			case PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER:
				return getProvidesIdentifier();
			case PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF:
				return getComponentInstantiationRef();
			case PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
				return getDeviceThatLoadedThisComponentRef();
			case PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
				return getDeviceUsedByThisComponentRef();
			case PartitioningPackage.PROVIDES_PORT__FIND_BY:
				return getFindBy();
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
			case PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER:
				setProvidesIdentifier((String)newValue);
				return;
			case PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF:
				setComponentInstantiationRef((P)newValue);
				return;
			case PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
				setDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef)newValue);
				return;
			case PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
				setDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef)newValue);
				return;
			case PartitioningPackage.PROVIDES_PORT__FIND_BY:
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
		switch (featureID)
		{
			case PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER:
				setProvidesIdentifier(PROVIDES_IDENTIFIER_EDEFAULT);
				return;
			case PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF:
				setComponentInstantiationRef((P)null);
				return;
			case PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
				setDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef)null);
				return;
			case PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
				setDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef)null);
				return;
			case PartitioningPackage.PROVIDES_PORT__FIND_BY:
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
		switch (featureID)
		{
			case PartitioningPackage.PROVIDES_PORT__PROVIDES_IDENTIFIER:
				return PROVIDES_IDENTIFIER_EDEFAULT == null ? providesIdentifier != null : !PROVIDES_IDENTIFIER_EDEFAULT.equals(providesIdentifier);
			case PartitioningPackage.PROVIDES_PORT__COMPONENT_INSTANTIATION_REF:
				return componentInstantiationRef != null;
			case PartitioningPackage.PROVIDES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
				return deviceThatLoadedThisComponentRef != null;
			case PartitioningPackage.PROVIDES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
				return deviceUsedByThisComponentRef != null;
			case PartitioningPackage.PROVIDES_PORT__FIND_BY:
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
		result.append(" (providesIdentifier: ");
		result.append(providesIdentifier);
		result.append(')');
		return result.toString();
	}

} //ProvidesPortImpl
