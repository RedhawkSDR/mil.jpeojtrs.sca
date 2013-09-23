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

import mil.jpeojtrs.sca.dpd.Author;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;

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
 * An implementation of the model object '<em><b>Device Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getHwDeviceRegistration <em>Hw Device Registration</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevicePkgImpl extends EObjectImpl implements DevicePkg {

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> author;
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
	 * The cached value of the '{@link #getHwDeviceRegistration() <em>Hw Device Registration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwDeviceRegistration()
	 * @generated
	 * @ordered
	 */
	protected HwDeviceRegistration hwDeviceRegistration;
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
	protected DevicePkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpdPackage.Literals.DEVICE_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Author> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Author>(Author.class, this, DpdPackage.DEVICE_PKG__AUTHOR);
		}
		return author;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwDeviceRegistration getHwDeviceRegistration() {
		return hwDeviceRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwDeviceRegistration(HwDeviceRegistration newHwDeviceRegistration, NotificationChain msgs) {
		HwDeviceRegistration oldHwDeviceRegistration = hwDeviceRegistration;
		hwDeviceRegistration = newHwDeviceRegistration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION, oldHwDeviceRegistration, newHwDeviceRegistration);
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
	public void setHwDeviceRegistration(HwDeviceRegistration newHwDeviceRegistration) {
		if (newHwDeviceRegistration != hwDeviceRegistration) {
			NotificationChain msgs = null;
			if (hwDeviceRegistration != null)
				msgs = ((InternalEObject)hwDeviceRegistration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION, null, msgs);
			if (newHwDeviceRegistration != null)
				msgs = ((InternalEObject)newHwDeviceRegistration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION, null, msgs);
			msgs = basicSetHwDeviceRegistration(newHwDeviceRegistration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION, newHwDeviceRegistration, newHwDeviceRegistration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DpdPackage.DEVICE_PKG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpdPackage.DEVICE_PKG__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION:
				return basicSetHwDeviceRegistration(null, msgs);
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
			case DpdPackage.DEVICE_PKG__TITLE:
				return getTitle();
			case DpdPackage.DEVICE_PKG__AUTHOR:
				return getAuthor();
			case DpdPackage.DEVICE_PKG__DESCRIPTION:
				return getDescription();
			case DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION:
				return getHwDeviceRegistration();
			case DpdPackage.DEVICE_PKG__ID:
				return getId();
			case DpdPackage.DEVICE_PKG__NAME:
				return getName();
			case DpdPackage.DEVICE_PKG__VERSION:
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
			case DpdPackage.DEVICE_PKG__TITLE:
				setTitle((String)newValue);
				return;
			case DpdPackage.DEVICE_PKG__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case DpdPackage.DEVICE_PKG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION:
				setHwDeviceRegistration((HwDeviceRegistration)newValue);
				return;
			case DpdPackage.DEVICE_PKG__ID:
				setId((String)newValue);
				return;
			case DpdPackage.DEVICE_PKG__NAME:
				setName((String)newValue);
				return;
			case DpdPackage.DEVICE_PKG__VERSION:
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
			case DpdPackage.DEVICE_PKG__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DpdPackage.DEVICE_PKG__AUTHOR:
				getAuthor().clear();
				return;
			case DpdPackage.DEVICE_PKG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION:
				setHwDeviceRegistration((HwDeviceRegistration)null);
				return;
			case DpdPackage.DEVICE_PKG__ID:
				setId(ID_EDEFAULT);
				return;
			case DpdPackage.DEVICE_PKG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DpdPackage.DEVICE_PKG__VERSION:
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
			case DpdPackage.DEVICE_PKG__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DpdPackage.DEVICE_PKG__AUTHOR:
				return author != null && !author.isEmpty();
			case DpdPackage.DEVICE_PKG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DpdPackage.DEVICE_PKG__HW_DEVICE_REGISTRATION:
				return hwDeviceRegistration != null;
			case DpdPackage.DEVICE_PKG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DpdPackage.DEVICE_PKG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DpdPackage.DEVICE_PKG__VERSION:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DevicePkgImpl
