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
package mil.jpeojtrs.sca.scd.impl;

import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.scd.LocalFile;
import mil.jpeojtrs.sca.scd.PropertyFile;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Property File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.PropertyFileImpl#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.PropertyFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.PropertyFileImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
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
		return ScdPackage.Literals.PROPERTY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.PROPERTY_FILE__LOCAL_FILE, oldLocalFile, newLocalFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetLocalFile(LocalFile newLocalFile, NotificationChain msgs) {
		Properties oldValue = getProperties();
		msgs = basicSetLocalFileGen(newLocalFile, msgs);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.PROPERTY_FILE__PROPERTIES, oldValue, getProperties());
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
	public void setLocalFile(LocalFile newLocalFile) {
		if (newLocalFile != localFile)
		{
			NotificationChain msgs = null;
			if (localFile != null)
				msgs = ((InternalEObject)localFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScdPackage.PROPERTY_FILE__LOCAL_FILE, null, msgs);
			if (newLocalFile != null)
				msgs = ((InternalEObject)newLocalFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScdPackage.PROPERTY_FILE__LOCAL_FILE, null, msgs);
			msgs = basicSetLocalFile(newLocalFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.PROPERTY_FILE__LOCAL_FILE, newLocalFile, newLocalFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.PROPERTY_FILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Properties getProperties() {
		Properties properties = basicGetProperties();
		return properties != null && properties.eIsProxy() ? (Properties)eResolveProxy((InternalEObject)properties) : properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Properties basicGetProperties() {
		// END GENERATED CODE
		if (this.getLocalFile() == null) {
			return null;
		}
		return (Properties) ScaUriHelpers.getLocalFileEObject(getLocalFile().getName(), this, Properties.EOBJECT_PATH, 
				SoftwareComponent.Util.getFileSystem(SoftwareComponent.Util.getSoftwareComponent(eResource())));
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setProperties(final Properties newProperties) {
		// END GENERATED CODE
		LocalFile newFile = null;
		String path = ScaUriHelpers.getLocalFilePath(this, newProperties);
		String newType = null;
		if (path != null) {
			newFile = ScdFactory.eINSTANCE.createLocalFile();
			newFile.setName(path);
			newType = "PRF";
		}
		setLocalFile(newFile);
		setType(newType);
		// BEGIN GENERATED CODE
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
			case ScdPackage.PROPERTY_FILE__LOCAL_FILE:
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
		switch (featureID)
		{
			case ScdPackage.PROPERTY_FILE__LOCAL_FILE:
				return getLocalFile();
			case ScdPackage.PROPERTY_FILE__TYPE:
				return getType();
			case ScdPackage.PROPERTY_FILE__PROPERTIES:
				if (resolve) return getProperties();
				return basicGetProperties();
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
			case ScdPackage.PROPERTY_FILE__LOCAL_FILE:
				setLocalFile((LocalFile)newValue);
				return;
			case ScdPackage.PROPERTY_FILE__TYPE:
				setType((String)newValue);
				return;
			case ScdPackage.PROPERTY_FILE__PROPERTIES:
				setProperties((Properties)newValue);
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
			case ScdPackage.PROPERTY_FILE__LOCAL_FILE:
				setLocalFile((LocalFile)null);
				return;
			case ScdPackage.PROPERTY_FILE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ScdPackage.PROPERTY_FILE__PROPERTIES:
				setProperties((Properties)null);
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
			case ScdPackage.PROPERTY_FILE__LOCAL_FILE:
				return localFile != null;
			case ScdPackage.PROPERTY_FILE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ScdPackage.PROPERTY_FILE__PROPERTIES:
				return basicGetProperties() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // PropertyFileImpl
