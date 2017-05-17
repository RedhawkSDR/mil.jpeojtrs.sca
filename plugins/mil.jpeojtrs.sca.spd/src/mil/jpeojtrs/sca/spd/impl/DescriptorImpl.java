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

import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.LocalFile;
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
 * <em><b>Descriptor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.DescriptorImpl#getLocalfile <em>Localfile</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.DescriptorImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.DescriptorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptorImpl extends EObjectImpl implements Descriptor {
	/**
	 * The cached value of the '{@link #getLocalfile() <em>Localfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalfile()
	 * @generated
	 * @ordered
	 */
	protected LocalFile localfile;
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
	protected DescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile getLocalfile() {
		return localfile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalfileGen(LocalFile newLocalfile, NotificationChain msgs) {
		LocalFile oldLocalfile = localfile;
		localfile = newLocalfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.DESCRIPTOR__LOCALFILE, oldLocalfile, newLocalfile);
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
	public NotificationChain basicSetLocalfile(LocalFile newLocalfile, NotificationChain msgs) {
		SoftwareComponent oldDescriptor = getComponent();
		msgs = basicSetLocalfileGen(newLocalfile, msgs);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.DESCRIPTOR__COMPONENT, oldDescriptor, getComponent());
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
	public void setLocalfile(LocalFile newLocalfile) {
		if (newLocalfile != localfile) {
			NotificationChain msgs = null;
			if (localfile != null)
				msgs = ((InternalEObject) localfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.DESCRIPTOR__LOCALFILE, null, msgs);
			if (newLocalfile != null)
				msgs = ((InternalEObject) newLocalfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.DESCRIPTOR__LOCALFILE, null, msgs);
			msgs = basicSetLocalfile(newLocalfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.DESCRIPTOR__LOCALFILE, newLocalfile, newLocalfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareComponent getComponent() {
		SoftwareComponent component = basicGetComponent();
		return component != null && component.eIsProxy() ? (SoftwareComponent) eResolveProxy((InternalEObject) component) : component;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SoftwareComponent basicGetComponent() {
		// END GENERATED CODE
		if (getLocalfile() != null) {
			// TODO How do we find the appropriate File system without knowing the software component type?
			Resource resource = ScaUriHelpers.getLocalFileResource(getLocalfile().getName(), this, null);
			return SoftwareComponent.Util.getSoftwareComponent(resource);
		} else {
			return null;
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setComponent(SoftwareComponent newComponent) {
		// END GENERATED CODE
		String localFilePath = ScaUriHelpers.getLocalFilePath(this, newComponent);
		LocalFile file = null;
		if (localFilePath != null) {
			file = SpdFactory.eINSTANCE.createLocalFile();
			file.setName(localFilePath);
		}
		this.setLocalfile(file);
		// BEGIN GENERATED CODE
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.DESCRIPTOR__LOCALFILE:
			return basicSetLocalfile(null, msgs);
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
		case SpdPackage.DESCRIPTOR__LOCALFILE:
			return getLocalfile();
		case SpdPackage.DESCRIPTOR__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case SpdPackage.DESCRIPTOR__NAME:
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
		switch (featureID) {
		case SpdPackage.DESCRIPTOR__LOCALFILE:
			setLocalfile((LocalFile) newValue);
			return;
		case SpdPackage.DESCRIPTOR__COMPONENT:
			setComponent((SoftwareComponent) newValue);
			return;
		case SpdPackage.DESCRIPTOR__NAME:
			setName((String) newValue);
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
		case SpdPackage.DESCRIPTOR__LOCALFILE:
			setLocalfile((LocalFile) null);
			return;
		case SpdPackage.DESCRIPTOR__COMPONENT:
			setComponent((SoftwareComponent) null);
			return;
		case SpdPackage.DESCRIPTOR__NAME:
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
		switch (featureID) {
		case SpdPackage.DESCRIPTOR__LOCALFILE:
			return localfile != null;
		case SpdPackage.DESCRIPTOR__COMPONENT:
			return basicGetComponent() != null;
		case SpdPackage.DESCRIPTOR__NAME:
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // DescriptorImpl
