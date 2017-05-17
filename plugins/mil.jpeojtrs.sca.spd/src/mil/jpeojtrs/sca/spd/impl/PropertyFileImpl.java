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
package mil.jpeojtrs.sca.spd.impl;

import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.PropertyFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Property File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.PropertyFileImpl#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.PropertyFileImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.PropertyFileImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyFileImpl extends EObjectImpl implements PropertyFile {
	/**
	 * The cached value of the '{@link #getLocalFile() <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFile()
	 * @generated
	 * @ordered
	 */
	protected LocalFile localFile;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.PROPERTY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile getLocalFile() {
		return localFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalFileGen(LocalFile newLocalFile, NotificationChain msgs) {
		LocalFile oldLocalFile = localFile;
		localFile = newLocalFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.PROPERTY_FILE__LOCAL_FILE, oldLocalFile, newLocalFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetLocalFile(LocalFile newLocalFile, NotificationChain msgs) {
		Properties oldProperties = getProperties();
		msgs = basicSetLocalFileGen(newLocalFile, msgs);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.PROPERTY_FILE__PROPERTIES, oldProperties,
				getProperties());
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
	public void setLocalFile(LocalFile newLocalFile) {
		if (newLocalFile != localFile) {
			NotificationChain msgs = null;
			if (localFile != null)
				msgs = ((InternalEObject) localFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.PROPERTY_FILE__LOCAL_FILE, null, msgs);
			if (newLocalFile != null)
				msgs = ((InternalEObject) newLocalFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.PROPERTY_FILE__LOCAL_FILE, null, msgs);
			msgs = basicSetLocalFile(newLocalFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.PROPERTY_FILE__LOCAL_FILE, newLocalFile, newLocalFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		Properties properties = basicGetProperties();
		return properties != null && properties.eIsProxy() ? (Properties) eResolveProxy((InternalEObject) properties) : properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Properties basicGetProperties() {
		// END GENERATED CODE
		if (getLocalFile() == null) {
			return null;
		}
		Resource resource = ScaUriHelpers.getLocalFileResource(getLocalFile().getName(), this,
			SoftPkg.Util.getFileSystem(SoftPkg.Util.getSoftPkg(eResource())));
		return Properties.Util.getProperties(resource);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProperties(Properties newProperties) {
		// END GENERATED CODE
		String localFilePath = ScaUriHelpers.getLocalFilePath(this, newProperties);
		LocalFile file = null;
		if (localFilePath != null) {
			file = SpdFactory.eINSTANCE.createLocalFile();
			file.setName(localFilePath);
		}
		setLocalFile(file);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.PROPERTY_FILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.PROPERTY_FILE__LOCAL_FILE:
			return basicSetLocalFile(null, msgs);
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
		case SpdPackage.PROPERTY_FILE__LOCAL_FILE:
			return getLocalFile();
		case SpdPackage.PROPERTY_FILE__PROPERTIES:
			if (resolve)
				return getProperties();
			return basicGetProperties();
		case SpdPackage.PROPERTY_FILE__TYPE:
			return getType();
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
		case SpdPackage.PROPERTY_FILE__LOCAL_FILE:
			setLocalFile((LocalFile) newValue);
			return;
		case SpdPackage.PROPERTY_FILE__PROPERTIES:
			setProperties((Properties) newValue);
			return;
		case SpdPackage.PROPERTY_FILE__TYPE:
			setType((String) newValue);
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
		case SpdPackage.PROPERTY_FILE__LOCAL_FILE:
			setLocalFile((LocalFile) null);
			return;
		case SpdPackage.PROPERTY_FILE__PROPERTIES:
			setProperties((Properties) null);
			return;
		case SpdPackage.PROPERTY_FILE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case SpdPackage.PROPERTY_FILE__LOCAL_FILE:
			return localFile != null;
		case SpdPackage.PROPERTY_FILE__PROPERTIES:
			return basicGetProperties() != null;
		case SpdPackage.PROPERTY_FILE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // PropertyFileImpl
