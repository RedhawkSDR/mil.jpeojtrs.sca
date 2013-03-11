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
package mil.jpeojtrs.sca.scd.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.PortTypeContainer;
import mil.jpeojtrs.sca.scd.ScdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getRepID <em>Rep ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.AbstractPortImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPortImpl extends EObjectImpl implements AbstractPort {
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.ABSTRACT_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepID() {
		return repID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Interface getInterface() {
		Interface interface_ = basicGetInterface();
		return interface_ != null && interface_.eIsProxy() ? (Interface)eResolveProxy((InternalEObject)interface_) : interface_;
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
	public void setInterface(Interface newInterface) {
		// END GENERATED CODE
		this.setRepID(newInterface.getRepid());
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
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
	public AbstractPort getSibling() {
		// END GENERATED CODE
		if (eContainer() != null) {
			for (EObject obj : eContainer().eContents()) {
				if (obj == this) {
					continue;
				}
				obj = (EObject) AdapterFactoryEditingDomain.unwrap(obj);
				if (obj.getClass() != getClass() && obj instanceof AbstractPort) {
					AbstractPort port = (AbstractPort) obj;
					if (port.getName().equals(getName()) && port.getRepID().equals(getRepID())) {
						return port;
					}
				}
			}
		}
		return null;
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
			case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
				return ((InternalEList<?>)getPortType()).basicRemove(otherEnd, msgs);
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
			case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
				return getPortType();
			case ScdPackage.ABSTRACT_PORT__NAME:
				return getName();
			case ScdPackage.ABSTRACT_PORT__REP_ID:
				return getRepID();
			case ScdPackage.ABSTRACT_PORT__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
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
			case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
				getPortType().clear();
				getPortType().addAll((Collection<? extends PortTypeContainer>)newValue);
				return;
			case ScdPackage.ABSTRACT_PORT__NAME:
				setName((String)newValue);
				return;
			case ScdPackage.ABSTRACT_PORT__REP_ID:
				setRepID((String)newValue);
				return;
			case ScdPackage.ABSTRACT_PORT__INTERFACE:
				setInterface((Interface)newValue);
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
				setInterface((Interface)null);
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
			case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
				return portType != null && !portType.isEmpty();
			case ScdPackage.ABSTRACT_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScdPackage.ABSTRACT_PORT__REP_ID:
				return REP_ID_EDEFAULT == null ? repID != null : !REP_ID_EDEFAULT.equals(repID);
			case ScdPackage.ABSTRACT_PORT__INTERFACE:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", repID: ");
		result.append(repID);
		result.append(')');
		return result.toString();
	}

} //AbstractPortImpl
