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
import mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.UsesPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl#getUsesIdentifier <em>Uses Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl#getDeviceUsedByApplication <em>Device Used By Application</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl#getFindBy <em>Find By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UsesPortImpl< U extends ComponentInstantiationRef< ? > > extends EObjectImpl implements UsesPort<U> {

	/**
	 * The default value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String usesIdentifier = USES_IDENTIFIER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentInstantiationRef() <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstantiationRef()
	 * @generated
	 * @ordered
	 */
	protected U componentInstantiationRef;
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
	 * The cached value of the '{@link #getDeviceUsedByApplication() <em>Device Used By Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see #getDeviceUsedByApplication()
	 * @generated
	 * @ordered
	 */
	protected DeviceUsedByApplication deviceUsedByApplication;
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
	protected UsesPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.USES_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsesIdentifier() {
		return usesIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesIdentifier(String newUsesIdentifier) {
		String oldUsesIdentifier = usesIdentifier;
		usesIdentifier = newUsesIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__USES_IDENTIFIER, oldUsesIdentifier, usesIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U getComponentInstantiationRef() {
		return componentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstantiationRef(U newComponentInstantiationRef, NotificationChain msgs) {
		U oldComponentInstantiationRef = componentInstantiationRef;
		componentInstantiationRef = newComponentInstantiationRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF,
				oldComponentInstantiationRef, newComponentInstantiationRef);
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
	public void setComponentInstantiationRef(U newComponentInstantiationRef) {
		if (newComponentInstantiationRef != componentInstantiationRef) {
			NotificationChain msgs = null;
			if (componentInstantiationRef != null)
				msgs = ((InternalEObject) componentInstantiationRef).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF, null, msgs);
			if (newComponentInstantiationRef != null)
				msgs = ((InternalEObject) newComponentInstantiationRef).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF, null, msgs);
			msgs = basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF, newComponentInstantiationRef,
				newComponentInstantiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceThatLoadedThisComponentRef getDeviceThatLoadedThisComponentRef() {
		return deviceThatLoadedThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef newDeviceThatLoadedThisComponentRef,
		NotificationChain msgs) {
		DeviceThatLoadedThisComponentRef oldDeviceThatLoadedThisComponentRef = deviceThatLoadedThisComponentRef;
		deviceThatLoadedThisComponentRef = newDeviceThatLoadedThisComponentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF,
				oldDeviceThatLoadedThisComponentRef, newDeviceThatLoadedThisComponentRef);
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
	public void setDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef newDeviceThatLoadedThisComponentRef) {
		if (newDeviceThatLoadedThisComponentRef != deviceThatLoadedThisComponentRef) {
			NotificationChain msgs = null;
			if (deviceThatLoadedThisComponentRef != null)
				msgs = ((InternalEObject) deviceThatLoadedThisComponentRef).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, null, msgs);
			if (newDeviceThatLoadedThisComponentRef != null)
				msgs = ((InternalEObject) newDeviceThatLoadedThisComponentRef).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, null, msgs);
			msgs = basicSetDeviceThatLoadedThisComponentRef(newDeviceThatLoadedThisComponentRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF,
				newDeviceThatLoadedThisComponentRef, newDeviceThatLoadedThisComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF,
				oldDeviceUsedByThisComponentRef, newDeviceUsedByThisComponentRef);
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
	public void setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef newDeviceUsedByThisComponentRef) {
		if (newDeviceUsedByThisComponentRef != deviceUsedByThisComponentRef) {
			NotificationChain msgs = null;
			if (deviceUsedByThisComponentRef != null)
				msgs = ((InternalEObject) deviceUsedByThisComponentRef).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF, null, msgs);
			if (newDeviceUsedByThisComponentRef != null)
				msgs = ((InternalEObject) newDeviceUsedByThisComponentRef).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF, null, msgs);
			msgs = basicSetDeviceUsedByThisComponentRef(newDeviceUsedByThisComponentRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF,
				newDeviceUsedByThisComponentRef, newDeviceUsedByThisComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsedByApplication getDeviceUsedByApplication() {
		return deviceUsedByApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUsedByApplication(DeviceUsedByApplication newDeviceUsedByApplication, NotificationChain msgs) {
		DeviceUsedByApplication oldDeviceUsedByApplication = deviceUsedByApplication;
		deviceUsedByApplication = newDeviceUsedByApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION,
				oldDeviceUsedByApplication, newDeviceUsedByApplication);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUsedByApplication(DeviceUsedByApplication newDeviceUsedByApplication) {
		if (newDeviceUsedByApplication != deviceUsedByApplication) {
			NotificationChain msgs = null;
			if (deviceUsedByApplication != null)
				msgs = ((InternalEObject) deviceUsedByApplication).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION, null, msgs);
			if (newDeviceUsedByApplication != null)
				msgs = ((InternalEObject) newDeviceUsedByApplication).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION, null, msgs);
			msgs = basicSetDeviceUsedByApplication(newDeviceUsedByApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION, newDeviceUsedByApplication,
				newDeviceUsedByApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__FIND_BY, oldFindBy, newFindBy);
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
	public void setFindBy(FindBy newFindBy) {
		if (newFindBy != findBy) {
			NotificationChain msgs = null;
			if (findBy != null)
				msgs = ((InternalEObject) findBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__FIND_BY, null, msgs);
			if (newFindBy != null)
				msgs = ((InternalEObject) newFindBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.USES_PORT__FIND_BY, null, msgs);
			msgs = basicSetFindBy(newFindBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT__FIND_BY, newFindBy, newFindBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF:
			return basicSetComponentInstantiationRef(null, msgs);
		case PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return basicSetDeviceThatLoadedThisComponentRef(null, msgs);
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
			return basicSetDeviceUsedByThisComponentRef(null, msgs);
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION:
			return basicSetDeviceUsedByApplication(null, msgs);
		case PartitioningPackage.USES_PORT__FIND_BY:
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
		case PartitioningPackage.USES_PORT__USES_IDENTIFIER:
			return getUsesIdentifier();
		case PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF:
			return getComponentInstantiationRef();
		case PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return getDeviceThatLoadedThisComponentRef();
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
			return getDeviceUsedByThisComponentRef();
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION:
			return getDeviceUsedByApplication();
		case PartitioningPackage.USES_PORT__FIND_BY:
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
		switch (featureID) {
		case PartitioningPackage.USES_PORT__USES_IDENTIFIER:
			setUsesIdentifier((String) newValue);
			return;
		case PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((U) newValue);
			return;
		case PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			setDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef) newValue);
			return;
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
			setDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef) newValue);
			return;
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION:
			setDeviceUsedByApplication((DeviceUsedByApplication) newValue);
			return;
		case PartitioningPackage.USES_PORT__FIND_BY:
			setFindBy((FindBy) newValue);
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
		case PartitioningPackage.USES_PORT__USES_IDENTIFIER:
			setUsesIdentifier(USES_IDENTIFIER_EDEFAULT);
			return;
		case PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((U) null);
			return;
		case PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			setDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef) null);
			return;
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
			setDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef) null);
			return;
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION:
			setDeviceUsedByApplication((DeviceUsedByApplication) null);
			return;
		case PartitioningPackage.USES_PORT__FIND_BY:
			setFindBy((FindBy) null);
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
		case PartitioningPackage.USES_PORT__USES_IDENTIFIER:
			return USES_IDENTIFIER_EDEFAULT == null ? usesIdentifier != null : !USES_IDENTIFIER_EDEFAULT.equals(usesIdentifier);
		case PartitioningPackage.USES_PORT__COMPONENT_INSTANTIATION_REF:
			return componentInstantiationRef != null;
		case PartitioningPackage.USES_PORT__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return deviceThatLoadedThisComponentRef != null;
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_THIS_COMPONENT_REF:
			return deviceUsedByThisComponentRef != null;
		case PartitioningPackage.USES_PORT__DEVICE_USED_BY_APPLICATION:
			return deviceUsedByApplication != null;
		case PartitioningPackage.USES_PORT__FIND_BY:
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (usesIdentifier: ");
		result.append(usesIdentifier);
		result.append(')');
		return result.toString();
	}

} //UsesPortImpl
