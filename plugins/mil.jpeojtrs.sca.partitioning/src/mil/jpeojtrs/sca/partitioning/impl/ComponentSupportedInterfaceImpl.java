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

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByApplication;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.SoftPkg;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Supported Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getDeviceUsedByApplication <em>Device Used By Application</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getFindBy <em>Find By</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentSupportedInterfaceImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentSupportedInterfaceImpl extends EObjectImpl implements ComponentSupportedInterface {
	/**
	 * The default value of the '{@link #getSupportedIdentifier() <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSupportedIdentifier() <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String supportedIdentifier = SUPPORTED_IDENTIFIER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentInstantiationRef() <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstantiationRef()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstantiationRef< ? > componentInstantiationRef;
	/**
	 * The cached value of the '{@link #getDeviceThatLoadedThisComponentRef() <em>Device That Loaded This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see #getDeviceThatLoadedThisComponentRef()
	 * @generated
	 * @ordered
	 */
	protected DeviceThatLoadedThisComponentRef deviceThatLoadedThisComponentRef;
	/**
	 * The cached value of the '{@link #getDeviceUsedByThisComponentRef() <em>Device Used By This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
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
	protected ComponentSupportedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupportedIdentifier() {
		return supportedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedIdentifierGen(String newSupportedIdentifier) {
		String oldSupportedIdentifier = supportedIdentifier;
		supportedIdentifier = newSupportedIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER,
				oldSupportedIdentifier, supportedIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSupportedIdentifier(final String newSupportedIdentifier) {
		Interface oldValue = getInterface();
		setSupportedIdentifierGen(newSupportedIdentifier);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__INTERFACE, oldValue, getInterface()));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstantiationRef< ? > getComponentInstantiationRef() {
		return componentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstantiationRef(ComponentInstantiationRef< ? > newComponentInstantiationRef, NotificationChain msgs) {
		ComponentInstantiationRef< ? > oldComponentInstantiationRef = componentInstantiationRef;
		componentInstantiationRef = newComponentInstantiationRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF, oldComponentInstantiationRef, newComponentInstantiationRef);
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
	public void setComponentInstantiationRef(ComponentInstantiationRef< ? > newComponentInstantiationRef) {
		if (newComponentInstantiationRef != componentInstantiationRef) {
			NotificationChain msgs = null;
			if (componentInstantiationRef != null)
				msgs = ((InternalEObject) componentInstantiationRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF, null, msgs);
			if (newComponentInstantiationRef != null)
				msgs = ((InternalEObject) newComponentInstantiationRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF, null, msgs);
			msgs = basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF,
				newComponentInstantiationRef, newComponentInstantiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceThatLoadedThisComponentRef getDeviceThatLoadedThisComponentRef() {
		return deviceThatLoadedThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef newDeviceThatLoadedThisComponentRef,
		NotificationChain msgs) {
		DeviceThatLoadedThisComponentRef oldDeviceThatLoadedThisComponentRef = deviceThatLoadedThisComponentRef;
		deviceThatLoadedThisComponentRef = newDeviceThatLoadedThisComponentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, oldDeviceThatLoadedThisComponentRef,
				newDeviceThatLoadedThisComponentRef);
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
	public void setDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef newDeviceThatLoadedThisComponentRef) {
		if (newDeviceThatLoadedThisComponentRef != deviceThatLoadedThisComponentRef) {
			NotificationChain msgs = null;
			if (deviceThatLoadedThisComponentRef != null)
				msgs = ((InternalEObject) deviceThatLoadedThisComponentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, null, msgs);
			if (newDeviceThatLoadedThisComponentRef != null)
				msgs = ((InternalEObject) newDeviceThatLoadedThisComponentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF, null, msgs);
			msgs = basicSetDeviceThatLoadedThisComponentRef(newDeviceThatLoadedThisComponentRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF,
				newDeviceThatLoadedThisComponentRef, newDeviceThatLoadedThisComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsedByThisComponentRef getDeviceUsedByThisComponentRef() {
		return deviceUsedByThisComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef newDeviceUsedByThisComponentRef, NotificationChain msgs) {
		DeviceUsedByThisComponentRef oldDeviceUsedByThisComponentRef = deviceUsedByThisComponentRef;
		deviceUsedByThisComponentRef = newDeviceUsedByThisComponentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF, oldDeviceUsedByThisComponentRef,
				newDeviceUsedByThisComponentRef);
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
	public void setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef newDeviceUsedByThisComponentRef) {
		if (newDeviceUsedByThisComponentRef != deviceUsedByThisComponentRef) {
			NotificationChain msgs = null;
			if (deviceUsedByThisComponentRef != null)
				msgs = ((InternalEObject) deviceUsedByThisComponentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF, null, msgs);
			if (newDeviceUsedByThisComponentRef != null)
				msgs = ((InternalEObject) newDeviceUsedByThisComponentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF, null, msgs);
			msgs = basicSetDeviceUsedByThisComponentRef(newDeviceUsedByThisComponentRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION, oldDeviceUsedByApplication, newDeviceUsedByApplication);
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
				msgs = ((InternalEObject) deviceUsedByApplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION, null, msgs);
			if (newDeviceUsedByApplication != null)
				msgs = ((InternalEObject) newDeviceUsedByApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION, null, msgs);
			msgs = basicSetDeviceUsedByApplication(newDeviceUsedByApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION,
				newDeviceUsedByApplication, newDeviceUsedByApplication));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY,
				oldFindBy, newFindBy);
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
				msgs = ((InternalEObject) findBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY,
					null, msgs);
			if (newFindBy != null)
				msgs = ((InternalEObject) newFindBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY,
					null, msgs);
			msgs = basicSetFindBy(newFindBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY, newFindBy, newFindBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterface() {
		Interface interface_ = basicGetInterface();
		return interface_ != null && interface_.eIsProxy() ? (Interface) eResolveProxy((InternalEObject) interface_) : interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Interface basicGetInterface() {
		// END GENERATED CODE
		if (this.supportedIdentifier == null) {
			return null;
		}

		final ComponentInstantiationRef< ? > componentRef = this.getComponentInstantiationRef();
		if (componentRef == null) {
			return null;
		}
		final ComponentInstantiation instantiation = componentRef.getInstantiation();
		if (instantiation == null) {
			return null;
		}
		final ComponentPlacement< ? > placement = instantiation.getPlacement();
		if (placement == null) {
			return null;
		}
		final ComponentFileRef fileRef = placement.getComponentFileRef();
		if (fileRef == null) {
			return null;
		}
		final ComponentFile file = fileRef.getFile();
		if (file == null) {
			return null;
		}
		final SoftPkg spd = file.getSoftPkg();
		if (spd == null) {
			return null;
		}
		final Descriptor descriptor = spd.getDescriptor();
		if (descriptor == null) {
			return null;
		}
		final SoftwareComponent scd = descriptor.getComponent();
		if (scd == null) {
			return null;
		}
		final Resource resource = scd.eResource();
		if (resource == null) {
			return null;
		}
		final EObject obj = resource.getEObject(this.supportedIdentifier);
		if (obj instanceof Interface) {
			return ((Interface) obj);
		}
		return null;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setInterface(Interface newInterface) {
		// END GENERATED CODE
		String repId = null;
		if (newInterface != null) {
			repId = newInterface.getRepid();
		}
		this.setSupportedIdentifier(repId);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF:
			return basicSetComponentInstantiationRef(null, msgs);
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return basicSetDeviceThatLoadedThisComponentRef(null, msgs);
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF:
			return basicSetDeviceUsedByThisComponentRef(null, msgs);
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION:
			return basicSetDeviceUsedByApplication(null, msgs);
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY:
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
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER:
			return getSupportedIdentifier();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF:
			return getComponentInstantiationRef();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return getDeviceThatLoadedThisComponentRef();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF:
			return getDeviceUsedByThisComponentRef();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION:
			return getDeviceUsedByApplication();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY:
			return getFindBy();
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
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
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER:
			setSupportedIdentifier((String) newValue);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((ComponentInstantiationRef< ? >) newValue);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			setDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef) newValue);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF:
			setDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef) newValue);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION:
			setDeviceUsedByApplication((DeviceUsedByApplication) newValue);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY:
			setFindBy((FindBy) newValue);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__INTERFACE:
			setInterface((Interface) newValue);
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
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER:
			setSupportedIdentifier(SUPPORTED_IDENTIFIER_EDEFAULT);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((ComponentInstantiationRef< ? >) null);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			setDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef) null);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF:
			setDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef) null);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION:
			setDeviceUsedByApplication((DeviceUsedByApplication) null);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY:
			setFindBy((FindBy) null);
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__INTERFACE:
			setInterface((Interface) null);
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
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER:
			return SUPPORTED_IDENTIFIER_EDEFAULT == null ? supportedIdentifier != null : !SUPPORTED_IDENTIFIER_EDEFAULT.equals(supportedIdentifier);
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF:
			return componentInstantiationRef != null;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
			return deviceThatLoadedThisComponentRef != null;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF:
			return deviceUsedByThisComponentRef != null;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION:
			return deviceUsedByApplication != null;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY:
			return findBy != null;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__INTERFACE:
			return basicGetInterface() != null;
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
		result.append(" (supportedIdentifier: ");
		result.append(supportedIdentifier);
		result.append(')');
		return result.toString();
	}

} //ComponentSupportedInterfaceImpl
