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
package mil.jpeojtrs.sca.prf.impl;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl#getLocalMode <em>Local Mode</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPropertyImpl extends EObjectImpl implements AbstractProperty {
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
	 * The default value of the '{@link #getLocalMode() <em>Local Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType LOCAL_MODE_EDEFAULT = AccessType.READWRITE;
	/**
	 * The cached value of the '{@link #getLocalMode() <em>Local Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMode()
	 * @generated
	 * @ordered
	 */
	protected AccessType localMode = LOCAL_MODE_EDEFAULT;
	/**
	 * This is true if the Local Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localModeESet;
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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType MODE_EDEFAULT = AccessType.WRITEONLY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.ABSTRACT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.ABSTRACT_PROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.ABSTRACT_PROPERTY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getLocalMode() {
		return localMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalMode(AccessType newLocalMode) {
		AccessType oldLocalMode = localMode;
		localMode = newLocalMode == null ? LOCAL_MODE_EDEFAULT : newLocalMode;
		boolean oldLocalModeESet = localModeESet;
		localModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.ABSTRACT_PROPERTY__LOCAL_MODE, oldLocalMode, localMode, !oldLocalModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocalMode() {
		AccessType oldLocalMode = localMode;
		boolean oldLocalModeESet = localModeESet;
		localMode = LOCAL_MODE_EDEFAULT;
		localModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PrfPackage.ABSTRACT_PROPERTY__LOCAL_MODE, oldLocalMode, LOCAL_MODE_EDEFAULT, oldLocalModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocalMode() {
		return localModeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.ABSTRACT_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccessType getMode() {
		// END GENERATED CODE
		if (eContainer() instanceof AbstractProperty) {
			return ((AbstractProperty) eContainer()).getMode();
		}
		return getLocalMode();
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setMode(AccessType newMode) {
		// END GENERATED CODE
		if (eContainer() instanceof AbstractProperty) {
			((AbstractProperty) eContainer()).setMode(newMode);
		} else {
			setLocalMode(newMode);
		}
		// BEGIN GENERATED CODE
	}
	
	@Override
	public void eNotify(Notification notification) {
	    super.eNotify(notification);
	    if (notification.getFeature() == PrfPackage.Literals.ABSTRACT_PROPERTY__LOCAL_MODE) {
	    	super.eNotify(new ENotificationImpl(this, notification.getEventType(), PrfPackage.ABSTRACT_PROPERTY__MODE, notification.getOldValue(), notification.getNewValue(), notification.wasSet()));
	    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetMode() {
		// END GENERATED CODE
		if (eContainer() instanceof AbstractProperty) {
			((AbstractProperty) eContainer()).unsetMode();
		} else {
			unsetLocalMode();
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetMode() {
		// END GENERATED CODE
		if (eContainer() instanceof AbstractProperty) {
			return ((AbstractProperty) eContainer()).isSetMode();
		}
		return isSetLocalMode();
		// BEGIN GENERATED CODE
	}

	public abstract boolean isKind(PropertyConfigurationType ... type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Any toAny();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrfPackage.ABSTRACT_PROPERTY__DESCRIPTION:
				return getDescription();
			case PrfPackage.ABSTRACT_PROPERTY__ID:
				return getId();
			case PrfPackage.ABSTRACT_PROPERTY__LOCAL_MODE:
				return getLocalMode();
			case PrfPackage.ABSTRACT_PROPERTY__NAME:
				return getName();
			case PrfPackage.ABSTRACT_PROPERTY__MODE:
				return getMode();
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
			case PrfPackage.ABSTRACT_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__ID:
				setId((String)newValue);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__LOCAL_MODE:
				setLocalMode((AccessType)newValue);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__MODE:
				setMode((AccessType)newValue);
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
			case PrfPackage.ABSTRACT_PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__LOCAL_MODE:
				unsetLocalMode();
				return;
			case PrfPackage.ABSTRACT_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PrfPackage.ABSTRACT_PROPERTY__MODE:
				unsetMode();
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
			case PrfPackage.ABSTRACT_PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PrfPackage.ABSTRACT_PROPERTY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PrfPackage.ABSTRACT_PROPERTY__LOCAL_MODE:
				return isSetLocalMode();
			case PrfPackage.ABSTRACT_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PrfPackage.ABSTRACT_PROPERTY__MODE:
				return isSetMode();
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
		result.append(", id: ");
		result.append(id);
		result.append(", localMode: ");
		if (localModeESet) result.append(localMode); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractPropertyImpl
