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

import java.util.Collection;

import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.PortDirection;
import mil.jpeojtrs.sca.scd.PortTypeContainer;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.ScdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getRepID <em>Rep ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPortImpl extends EObjectImpl implements AbstractPort {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeContainer> portType;
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
	 * The default value of the '{@link #getRepID() <em>Rep ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepID()
	 * @generated
	 * @ordered
	 */
	protected static final String REP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRepID() <em>Rep ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepID()
	 * @generated
	 * @ordered
	 */
	protected String repID = REP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PortDirection DIRECTION_EDEFAULT = PortDirection.USES;

	/**
	 * The cached sibling reference.
	 * @since 3.0
	 * @generated NOT
	 */
	protected AbstractPort sibling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.ABSTRACT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.ABSTRACT_PORT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortTypeContainer> getPortType() {
		if (portType == null) {
			portType = new EObjectContainmentEList<PortTypeContainer>(PortTypeContainer.class, this, ScdPackage.ABSTRACT_PORT__PORT_TYPE);
		}
		return portType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.ABSTRACT_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepID() {
		return repID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepID(String newRepID) {
		String oldRepID = repID;
		repID = newRepID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.ABSTRACT_PORT__REP_ID, oldRepID, repID));
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
		if (getRepID() != null && eResource() != null) {
			String uriFragment = getRepID();
			return (Interface) eResource().getEObject(uriFragment);
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
		this.setRepID(newInterface.getRepid());
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDirection getDirection() {
		if (isBiDirectional()) {
			return PortDirection.BIDIR;
		} else {
			return basicGetDirection();
		}
	}

	/**
	 * @since 3.0
	 * @generated NOT
	 */
	protected abstract PortDirection basicGetDirection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isBiDirectional() {
		// END GENERATED CODE
		return getSibling() != null;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public AbstractPort getSibling() {
		return sibling;
	}

	/**
	 * Sets the sibling reference and emits a port direction change notification.
	 * @generated NOT
	 */
	private void setSibling(AbstractPort newSibling) {
		PortDirection oldDirection = getDirection();
		sibling = newSibling;
		PortDirection newDirection = getDirection();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.ABSTRACT_PORT__DIRECTION, oldDirection, newDirection));
		}
	}

	@Override
	protected void eBasicSetContainer(InternalEObject newContainer, int newContainerFeatureID) {
		super.eBasicSetContainer(newContainer, newContainerFeatureID);
		if (sibling != null) {
			((AbstractPortImpl) sibling).setSibling(null);
		}
		if (newContainer instanceof Ports) {
			AbstractPort newSibling = findSibling((Ports) newContainer);
			setSibling(newSibling);
			if (newSibling != null) {
				((AbstractPortImpl) newSibling).setSibling(this);
			}
		}
	}

	/**
	 * Finds the sibling port, if any, in the given Ports.
	 * @generated NOT
	 */
	private AbstractPort findSibling(Ports ports) {
		for (FeatureMap.Entry entry : ports.getGroup()) {
			AbstractPort port = (AbstractPort) entry.getValue();
			if (port == this) {
				continue;
			}
			if (port.getClass() != getClass()) {
				if (port.getName().equals(getName()) && port.getRepID().equals(getRepID())) {
					return port;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
			return ((InternalEList< ? >) getPortType()).basicRemove(otherEnd, msgs);
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
		case ScdPackage.ABSTRACT_PORT__DESCRIPTION:
			return getDescription();
		case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
			return getPortType();
		case ScdPackage.ABSTRACT_PORT__NAME:
			return getName();
		case ScdPackage.ABSTRACT_PORT__REP_ID:
			return getRepID();
		case ScdPackage.ABSTRACT_PORT__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
		case ScdPackage.ABSTRACT_PORT__DIRECTION:
			return getDirection();
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
		case ScdPackage.ABSTRACT_PORT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
			getPortType().clear();
			getPortType().addAll((Collection< ? extends PortTypeContainer>) newValue);
			return;
		case ScdPackage.ABSTRACT_PORT__NAME:
			setName((String) newValue);
			return;
		case ScdPackage.ABSTRACT_PORT__REP_ID:
			setRepID((String) newValue);
			return;
		case ScdPackage.ABSTRACT_PORT__INTERFACE:
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
		case ScdPackage.ABSTRACT_PORT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
			getPortType().clear();
			return;
		case ScdPackage.ABSTRACT_PORT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScdPackage.ABSTRACT_PORT__REP_ID:
			setRepID(REP_ID_EDEFAULT);
			return;
		case ScdPackage.ABSTRACT_PORT__INTERFACE:
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
		case ScdPackage.ABSTRACT_PORT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
			return portType != null && !portType.isEmpty();
		case ScdPackage.ABSTRACT_PORT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ScdPackage.ABSTRACT_PORT__REP_ID:
			return REP_ID_EDEFAULT == null ? repID != null : !REP_ID_EDEFAULT.equals(repID);
		case ScdPackage.ABSTRACT_PORT__INTERFACE:
			return basicGetInterface() != null;
		case ScdPackage.ABSTRACT_PORT__DIRECTION:
			return getDirection() != DIRECTION_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", repID: ");
		result.append(repID);
		result.append(')');
		return result.toString();
	}
} // AbstractPortImpl
