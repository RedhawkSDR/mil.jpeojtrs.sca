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
package mil.jpeojtrs.sca.dpd.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.dpd.ChildHwDevice;
import mil.jpeojtrs.sca.dpd.DeviceClass;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;
import mil.jpeojtrs.sca.dpd.PropertyFile;

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
 * An implementation of the model object '<em><b>Hw Device Registration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getDeviceClass <em>Device Class</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getChildHwDevice <em>Child Hw Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HwDeviceRegistrationImpl extends EObjectImpl implements HwDeviceRegistration {

	/**
	 * The cached value of the '{@link #getPropertyFile() <em>Property File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyFile()
	 * @generated
	 * @ordered
	 */
	protected PropertyFile propertyFile;
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
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;
	/**
	 * The default value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected String modelNumber = MODEL_NUMBER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDeviceClass() <em>Device Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceClass()
	 * @generated
	 * @ordered
	 */
	protected DeviceClass deviceClass;
	/**
	 * The cached value of the '{@link #getChildHwDevice() <em>Child Hw Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildHwDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildHwDevice> childHwDevice;
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDeviceRegistrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpdPackage.Literals.HW_DEVICE_REGISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyFile getPropertyFile() {
		return propertyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyFile(PropertyFile newPropertyFile, NotificationChain msgs) {
		PropertyFile oldPropertyFile = propertyFile;
		propertyFile = newPropertyFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE, oldPropertyFile, newPropertyFile);
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
	public void setPropertyFile(PropertyFile newPropertyFile) {
		if (newPropertyFile != propertyFile) {
			NotificationChain msgs = null;
			if (propertyFile != null)
				msgs = ((InternalEObject)propertyFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE, null, msgs);
			if (newPropertyFile != null)
				msgs = ((InternalEObject)newPropertyFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE, null, msgs);
			msgs = basicSetPropertyFile(newPropertyFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE, newPropertyFile, newPropertyFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelNumber(String newModelNumber) {
		String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__MODEL_NUMBER, oldModelNumber, modelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceClass getDeviceClass() {
		return deviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceClass(DeviceClass newDeviceClass, NotificationChain msgs) {
		DeviceClass oldDeviceClass = deviceClass;
		deviceClass = newDeviceClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS, oldDeviceClass, newDeviceClass);
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
	public void setDeviceClass(DeviceClass newDeviceClass) {
		if (newDeviceClass != deviceClass) {
			NotificationChain msgs = null;
			if (deviceClass != null)
				msgs = ((InternalEObject)deviceClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS, null, msgs);
			if (newDeviceClass != null)
				msgs = ((InternalEObject)newDeviceClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS, null, msgs);
			msgs = basicSetDeviceClass(newDeviceClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS, newDeviceClass, newDeviceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildHwDevice> getChildHwDevice() {
		if (childHwDevice == null) {
			childHwDevice = new EObjectContainmentEList<ChildHwDevice>(ChildHwDevice.class, this, DpdPackage.HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE);
		}
		return childHwDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.HW_DEVICE_REGISTRATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE:
				return basicSetPropertyFile(null, msgs);
			case DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS:
				return basicSetDeviceClass(null, msgs);
			case DpdPackage.HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE:
				return ((InternalEList<?>)getChildHwDevice()).basicRemove(otherEnd, msgs);
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
			case DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE:
				return getPropertyFile();
			case DpdPackage.HW_DEVICE_REGISTRATION__DESCRIPTION:
				return getDescription();
			case DpdPackage.HW_DEVICE_REGISTRATION__MANUFACTURER:
				return getManufacturer();
			case DpdPackage.HW_DEVICE_REGISTRATION__MODEL_NUMBER:
				return getModelNumber();
			case DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS:
				return getDeviceClass();
			case DpdPackage.HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE:
				return getChildHwDevice();
			case DpdPackage.HW_DEVICE_REGISTRATION__ID:
				return getId();
			case DpdPackage.HW_DEVICE_REGISTRATION__NAME:
				return getName();
			case DpdPackage.HW_DEVICE_REGISTRATION__VERSION:
				return getVersion();
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
			case DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE:
				setPropertyFile((PropertyFile)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__MODEL_NUMBER:
				setModelNumber((String)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS:
				setDeviceClass((DeviceClass)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE:
				getChildHwDevice().clear();
				getChildHwDevice().addAll((Collection<? extends ChildHwDevice>)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__ID:
				setId((String)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__NAME:
				setName((String)newValue);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__VERSION:
				setVersion((String)newValue);
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
			case DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE:
				setPropertyFile((PropertyFile)null);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__MODEL_NUMBER:
				setModelNumber(MODEL_NUMBER_EDEFAULT);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS:
				setDeviceClass((DeviceClass)null);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE:
				getChildHwDevice().clear();
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__ID:
				setId(ID_EDEFAULT);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DpdPackage.HW_DEVICE_REGISTRATION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case DpdPackage.HW_DEVICE_REGISTRATION__PROPERTY_FILE:
				return propertyFile != null;
			case DpdPackage.HW_DEVICE_REGISTRATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DpdPackage.HW_DEVICE_REGISTRATION__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case DpdPackage.HW_DEVICE_REGISTRATION__MODEL_NUMBER:
				return MODEL_NUMBER_EDEFAULT == null ? modelNumber != null : !MODEL_NUMBER_EDEFAULT.equals(modelNumber);
			case DpdPackage.HW_DEVICE_REGISTRATION__DEVICE_CLASS:
				return deviceClass != null;
			case DpdPackage.HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE:
				return childHwDevice != null && !childHwDevice.isEmpty();
			case DpdPackage.HW_DEVICE_REGISTRATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DpdPackage.HW_DEVICE_REGISTRATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DpdPackage.HW_DEVICE_REGISTRATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", modelNumber: ");
		result.append(modelNumber);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //HwDeviceRegistrationImpl
