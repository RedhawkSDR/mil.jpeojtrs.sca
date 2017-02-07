/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getUsesIdentifier <em>Uses Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getProvidesIdentifier <em>Provides Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getExternalName <em>External Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends EObjectImpl implements Port {

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
	 * The default value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String usesIdentifier = USES_IDENTIFIER_EDEFAULT;
	/**
	 * The default value of the '{@link #getProvidesIdentifier() <em>Provides Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getProvidesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDES_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProvidesIdentifier() <em>Provides Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getProvidesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String providesIdentifier = PROVIDES_IDENTIFIER_EDEFAULT;
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
	protected SadComponentInstantiationRef componentInstantiationRef;

	/**
	 * The default value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected String externalName = EXTERNAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsesIdentifier() {
		return usesIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesIdentifier(String newUsesIdentifier) {
		String oldUsesIdentifier = usesIdentifier;
		usesIdentifier = newUsesIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__USES_IDENTIFIER, oldUsesIdentifier, usesIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvidesIdentifier() {
		return providesIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesIdentifier(String newProvidesIdentifier) {
		String oldProvidesIdentifier = providesIdentifier;
		providesIdentifier = newProvidesIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__PROVIDES_IDENTIFIER, oldProvidesIdentifier, providesIdentifier));
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
	@Override
	public void setSupportedIdentifier(String newSupportedIdentifier) {
		String oldSupportedIdentifier = supportedIdentifier;
		supportedIdentifier = newSupportedIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__SUPPORTED_IDENTIFIER, oldSupportedIdentifier, supportedIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadComponentInstantiationRef getComponentInstantiationRef() {
		return componentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstantiationRef(SadComponentInstantiationRef newComponentInstantiationRef, NotificationChain msgs) {
		SadComponentInstantiationRef oldComponentInstantiationRef = componentInstantiationRef;
		componentInstantiationRef = newComponentInstantiationRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.PORT__COMPONENT_INSTANTIATION_REF,
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
	public void setComponentInstantiationRef(SadComponentInstantiationRef newComponentInstantiationRef) {
		if (newComponentInstantiationRef != componentInstantiationRef) {
			NotificationChain msgs = null;
			if (componentInstantiationRef != null)
				msgs = ((InternalEObject) componentInstantiationRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.PORT__COMPONENT_INSTANTIATION_REF,
					null, msgs);
			if (newComponentInstantiationRef != null)
				msgs = ((InternalEObject) newComponentInstantiationRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.PORT__COMPONENT_INSTANTIATION_REF,
					null, msgs);
			msgs = basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__COMPONENT_INSTANTIATION_REF, newComponentInstantiationRef,
				newComponentInstantiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalName() {
		return externalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalName(String newExternalName) {
		String oldExternalName = externalName;
		externalName = newExternalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__EXTERNAL_NAME, oldExternalName, externalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
			return basicSetComponentInstantiationRef(null, msgs);
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
		case SadPackage.PORT__DESCRIPTION:
			return getDescription();
		case SadPackage.PORT__USES_IDENTIFIER:
			return getUsesIdentifier();
		case SadPackage.PORT__PROVIDES_IDENTIFIER:
			return getProvidesIdentifier();
		case SadPackage.PORT__SUPPORTED_IDENTIFIER:
			return getSupportedIdentifier();
		case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
			return getComponentInstantiationRef();
		case SadPackage.PORT__EXTERNAL_NAME:
			return getExternalName();
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
		case SadPackage.PORT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SadPackage.PORT__USES_IDENTIFIER:
			setUsesIdentifier((String) newValue);
			return;
		case SadPackage.PORT__PROVIDES_IDENTIFIER:
			setProvidesIdentifier((String) newValue);
			return;
		case SadPackage.PORT__SUPPORTED_IDENTIFIER:
			setSupportedIdentifier((String) newValue);
			return;
		case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((SadComponentInstantiationRef) newValue);
			return;
		case SadPackage.PORT__EXTERNAL_NAME:
			setExternalName((String) newValue);
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
		case SadPackage.PORT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SadPackage.PORT__USES_IDENTIFIER:
			setUsesIdentifier(USES_IDENTIFIER_EDEFAULT);
			return;
		case SadPackage.PORT__PROVIDES_IDENTIFIER:
			setProvidesIdentifier(PROVIDES_IDENTIFIER_EDEFAULT);
			return;
		case SadPackage.PORT__SUPPORTED_IDENTIFIER:
			setSupportedIdentifier(SUPPORTED_IDENTIFIER_EDEFAULT);
			return;
		case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((SadComponentInstantiationRef) null);
			return;
		case SadPackage.PORT__EXTERNAL_NAME:
			setExternalName(EXTERNAL_NAME_EDEFAULT);
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
		case SadPackage.PORT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SadPackage.PORT__USES_IDENTIFIER:
			return USES_IDENTIFIER_EDEFAULT == null ? usesIdentifier != null : !USES_IDENTIFIER_EDEFAULT.equals(usesIdentifier);
		case SadPackage.PORT__PROVIDES_IDENTIFIER:
			return PROVIDES_IDENTIFIER_EDEFAULT == null ? providesIdentifier != null : !PROVIDES_IDENTIFIER_EDEFAULT.equals(providesIdentifier);
		case SadPackage.PORT__SUPPORTED_IDENTIFIER:
			return SUPPORTED_IDENTIFIER_EDEFAULT == null ? supportedIdentifier != null : !SUPPORTED_IDENTIFIER_EDEFAULT.equals(supportedIdentifier);
		case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
			return componentInstantiationRef != null;
		case SadPackage.PORT__EXTERNAL_NAME:
			return EXTERNAL_NAME_EDEFAULT == null ? externalName != null : !EXTERNAL_NAME_EDEFAULT.equals(externalName);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", usesIdentifier: ");
		result.append(usesIdentifier);
		result.append(", providesIdentifier: ");
		result.append(providesIdentifier);
		result.append(", supportedIdentifier: ");
		result.append(supportedIdentifier);
		result.append(", externalName: ");
		result.append(externalName);
		result.append(')');
		return result.toString();
	}

} //PortImpl
