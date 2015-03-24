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

import mil.jpeojtrs.sca.scd.ComponentFeatures;
import mil.jpeojtrs.sca.scd.ComponentRepId;
import mil.jpeojtrs.sca.scd.Interfaces;
import mil.jpeojtrs.sca.scd.PropertyFile;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Software Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getCorbaVersion <em>Corba Version</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getComponentRepID <em>Component Rep ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getComponentFeatures <em>Component Features</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.SoftwareComponentImpl#getRepId <em>Rep Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareComponentImpl extends EObjectImpl implements SoftwareComponent {
	/**
	 * The default value of the '{@link #getCorbaVersion() <em>Corba Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorbaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CORBA_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCorbaVersion() <em>Corba Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorbaVersion()
	 * @generated
	 * @ordered
	 */
	protected String corbaVersion = CORBA_VERSION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentRepID() <em>Component Rep ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRepID()
	 * @generated
	 * @ordered
	 */
	protected ComponentRepId componentRepID;
	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected String componentType = COMPONENT_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentFeatures() <em>Component Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentFeatures()
	 * @generated
	 * @ordered
	 */
	protected ComponentFeatures componentFeatures;
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected Interfaces interfaces;
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
	 * The default value of the '{@link #getRepId() <em>Rep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepId()
	 * @generated
	 * @ordered
	 */
	protected static final String REP_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.SOFTWARE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorbaVersion() {
		return corbaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorbaVersion(String newCorbaVersion) {
		String oldCorbaVersion = corbaVersion;
		corbaVersion = newCorbaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__CORBA_VERSION, oldCorbaVersion, corbaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRepId getComponentRepID() {
		return componentRepID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepID(ComponentRepId newComponentRepID, NotificationChain msgs) {
		ComponentRepId oldComponentRepID = componentRepID;
		componentRepID = newComponentRepID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID, oldComponentRepID,
				newComponentRepID);
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
	public void setComponentRepID(ComponentRepId newComponentRepID) {
		if (newComponentRepID != componentRepID) {
			NotificationChain msgs = null;
			if (componentRepID != null)
				msgs = ((InternalEObject) componentRepID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID, null,
					msgs);
			if (newComponentRepID != null)
				msgs = ((InternalEObject) newComponentRepID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID, null,
					msgs);
			msgs = basicSetComponentRepID(newComponentRepID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID, newComponentRepID, newComponentRepID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentType(String newComponentType) {
		String oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFeatures getComponentFeatures() {
		return componentFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentFeatures(ComponentFeatures newComponentFeatures, NotificationChain msgs) {
		ComponentFeatures oldComponentFeatures = componentFeatures;
		componentFeatures = newComponentFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES,
				oldComponentFeatures, newComponentFeatures);
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
	public void setComponentFeatures(ComponentFeatures newComponentFeatures) {
		if (newComponentFeatures != componentFeatures) {
			NotificationChain msgs = null;
			if (componentFeatures != null)
				msgs = ((InternalEObject) componentFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES,
					null, msgs);
			if (newComponentFeatures != null)
				msgs = ((InternalEObject) newComponentFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES,
					null, msgs);
			msgs = basicSetComponentFeatures(newComponentFeatures, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES, newComponentFeatures, newComponentFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interfaces getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(Interfaces newInterfaces, NotificationChain msgs) {
		Interfaces oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__INTERFACES, oldInterfaces,
				newInterfaces);
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
	public void setInterfaces(Interfaces newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject) interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject) newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__INTERFACES, newInterfaces, newInterfaces));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE, oldPropertyFile,
				newPropertyFile);
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
	public void setPropertyFile(PropertyFile newPropertyFile) {
		if (newPropertyFile != propertyFile) {
			NotificationChain msgs = null;
			if (propertyFile != null)
				msgs = ((InternalEObject) propertyFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE, null, msgs);
			if (newPropertyFile != null)
				msgs = ((InternalEObject) newPropertyFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE, null, msgs);
			msgs = basicSetPropertyFile(newPropertyFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE, newPropertyFile, newPropertyFile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getRepId() {
		// END GENERATED CODE
		if (this.componentRepID == null) {
			return null;
		}
		return this.componentRepID.getRepid();
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setRepId(final String newRepId) {
		// END GENERATED CODE
		if (this.componentRepID == null) {
			this.componentRepID = ScdFactory.eINSTANCE.createComponentRepId();
		}
		this.componentRepID.setRepid(newRepId);
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
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID:
			return basicSetComponentRepID(null, msgs);
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES:
			return basicSetComponentFeatures(null, msgs);
		case ScdPackage.SOFTWARE_COMPONENT__INTERFACES:
			return basicSetInterfaces(null, msgs);
		case ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE:
			return basicSetPropertyFile(null, msgs);
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
		case ScdPackage.SOFTWARE_COMPONENT__CORBA_VERSION:
			return getCorbaVersion();
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID:
			return getComponentRepID();
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_TYPE:
			return getComponentType();
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES:
			return getComponentFeatures();
		case ScdPackage.SOFTWARE_COMPONENT__INTERFACES:
			return getInterfaces();
		case ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE:
			return getPropertyFile();
		case ScdPackage.SOFTWARE_COMPONENT__REP_ID:
			return getRepId();
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
		case ScdPackage.SOFTWARE_COMPONENT__CORBA_VERSION:
			setCorbaVersion((String) newValue);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID:
			setComponentRepID((ComponentRepId) newValue);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_TYPE:
			setComponentType((String) newValue);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES:
			setComponentFeatures((ComponentFeatures) newValue);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__INTERFACES:
			setInterfaces((Interfaces) newValue);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE:
			setPropertyFile((PropertyFile) newValue);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__REP_ID:
			setRepId((String) newValue);
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
		case ScdPackage.SOFTWARE_COMPONENT__CORBA_VERSION:
			setCorbaVersion(CORBA_VERSION_EDEFAULT);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID:
			setComponentRepID((ComponentRepId) null);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_TYPE:
			setComponentType(COMPONENT_TYPE_EDEFAULT);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES:
			setComponentFeatures((ComponentFeatures) null);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__INTERFACES:
			setInterfaces((Interfaces) null);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE:
			setPropertyFile((PropertyFile) null);
			return;
		case ScdPackage.SOFTWARE_COMPONENT__REP_ID:
			setRepId(REP_ID_EDEFAULT);
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
		case ScdPackage.SOFTWARE_COMPONENT__CORBA_VERSION:
			return CORBA_VERSION_EDEFAULT == null ? corbaVersion != null : !CORBA_VERSION_EDEFAULT.equals(corbaVersion);
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_REP_ID:
			return componentRepID != null;
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_TYPE:
			return COMPONENT_TYPE_EDEFAULT == null ? componentType != null : !COMPONENT_TYPE_EDEFAULT.equals(componentType);
		case ScdPackage.SOFTWARE_COMPONENT__COMPONENT_FEATURES:
			return componentFeatures != null;
		case ScdPackage.SOFTWARE_COMPONENT__INTERFACES:
			return interfaces != null;
		case ScdPackage.SOFTWARE_COMPONENT__PROPERTY_FILE:
			return propertyFile != null;
		case ScdPackage.SOFTWARE_COMPONENT__REP_ID:
			return REP_ID_EDEFAULT == null ? getRepId() != null : !REP_ID_EDEFAULT.equals(getRepId());
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
		result.append(" (corbaVersion: ");
		result.append(corbaVersion);
		result.append(", componentType: ");
		result.append(componentType);
		result.append(')');
		return result.toString();
	}

} // SoftwareComponentImpl
