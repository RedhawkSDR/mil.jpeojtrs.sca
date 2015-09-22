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

import mil.jpeojtrs.sca.scd.InheritsInterface;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.ScdPackage;

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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.InterfaceImpl#getInheritsInterfaces <em>Inherits Interfaces</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.impl.InterfaceImpl#getRepid <em>Repid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends EObjectImpl implements Interface {
	/**
	 * The cached value of the '{@link #getInheritsInterfaces() <em>Inherits Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritsInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InheritsInterface> inheritsInterfaces;
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
	 * The default value of the '{@link #getRepid() <em>Repid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepid()
	 * @generated
	 * @ordered
	 */
	protected static final String REPID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRepid() <em>Repid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepid()
	 * @generated
	 * @ordered
	 */
	protected String repid = REPID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScdPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InheritsInterface> getInheritsInterfaces() {
		if (inheritsInterfaces == null) {
			inheritsInterfaces = new EObjectContainmentEList<InheritsInterface>(InheritsInterface.class, this, ScdPackage.INTERFACE__INHERITS_INTERFACES);
		}
		return inheritsInterfaces;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepid() {
		return repid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepid(String newRepid) {
		String oldRepid = repid;
		repid = newRepid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScdPackage.INTERFACE__REPID, oldRepid, repid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInstance(Interface obj) {
		// END GENERATED CODE
		if (obj == null) {
			return false;
		}
		if (this.getRepid().equals(obj.getRepid())) {
			return true;
		} else {
			for (InheritsInterface ii : getInheritsInterfaces()) {
				Interface i = ii.getInterface();
				if (i != null && i.isInstance(obj)) {
					return true;
				}
			}
		}
		return false;
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
		case ScdPackage.INTERFACE__INHERITS_INTERFACES:
			return ((InternalEList< ? >) getInheritsInterfaces()).basicRemove(otherEnd, msgs);
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
		case ScdPackage.INTERFACE__INHERITS_INTERFACES:
			return getInheritsInterfaces();
		case ScdPackage.INTERFACE__NAME:
			return getName();
		case ScdPackage.INTERFACE__REPID:
			return getRepid();
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
		case ScdPackage.INTERFACE__INHERITS_INTERFACES:
			getInheritsInterfaces().clear();
			getInheritsInterfaces().addAll((Collection< ? extends InheritsInterface>) newValue);
			return;
		case ScdPackage.INTERFACE__NAME:
			setName((String) newValue);
			return;
		case ScdPackage.INTERFACE__REPID:
			setRepid((String) newValue);
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
		case ScdPackage.INTERFACE__INHERITS_INTERFACES:
			getInheritsInterfaces().clear();
			return;
		case ScdPackage.INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScdPackage.INTERFACE__REPID:
			setRepid(REPID_EDEFAULT);
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
		case ScdPackage.INTERFACE__INHERITS_INTERFACES:
			return inheritsInterfaces != null && !inheritsInterfaces.isEmpty();
		case ScdPackage.INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ScdPackage.INTERFACE__REPID:
			return REPID_EDEFAULT == null ? repid != null : !REPID_EDEFAULT.equals(repid);
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
		result.append(", repid: ");
		result.append(repid);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
