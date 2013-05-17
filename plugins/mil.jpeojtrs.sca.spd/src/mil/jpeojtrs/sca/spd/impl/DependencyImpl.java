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

import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl;
import mil.jpeojtrs.sca.spd.Dependency;
import mil.jpeojtrs.sca.spd.PropertyRef;
import mil.jpeojtrs.sca.spd.SoftPkgRef;
import mil.jpeojtrs.sca.spd.SpdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.DependencyImpl#getSoftPkgRef <em>Soft Pkg Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.DependencyImpl#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.DependencyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends PropertyRefSetImpl implements Dependency {
	/**
	 * The cached value of the '{@link #getSoftPkgRef() <em>Soft Pkg Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftPkgRef()
	 * @generated
	 * @ordered
	 */
	protected SoftPkgRef softPkgRef;
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
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkgRef getSoftPkgRef() {
		return softPkgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftPkgRef(SoftPkgRef newSoftPkgRef, NotificationChain msgs) {
		SoftPkgRef oldSoftPkgRef = softPkgRef;
		softPkgRef = newSoftPkgRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.DEPENDENCY__SOFT_PKG_REF, oldSoftPkgRef, newSoftPkgRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftPkgRef(SoftPkgRef newSoftPkgRef) {
		if (newSoftPkgRef != softPkgRef) {
			NotificationChain msgs = null;
			if (softPkgRef != null)
				msgs = ((InternalEObject)softPkgRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.DEPENDENCY__SOFT_PKG_REF, null, msgs);
			if (newSoftPkgRef != null)
				msgs = ((InternalEObject)newSoftPkgRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.DEPENDENCY__SOFT_PKG_REF, null, msgs);
			msgs = basicSetSoftPkgRef(newSoftPkgRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.DEPENDENCY__SOFT_PKG_REF, newSoftPkgRef, newSoftPkgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRef getPropertyRef() {
		return (PropertyRef)getProperties().get(SpdPackage.Literals.DEPENDENCY__PROPERTY_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyRef(PropertyRef newPropertyRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProperties()).basicAdd(SpdPackage.Literals.DEPENDENCY__PROPERTY_REF, newPropertyRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(PropertyRef newPropertyRef) {
		((FeatureMap.Internal)getProperties()).set(SpdPackage.Literals.DEPENDENCY__PROPERTY_REF, newPropertyRef);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.DEPENDENCY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpdPackage.DEPENDENCY__SOFT_PKG_REF:
				return basicSetSoftPkgRef(null, msgs);
			case SpdPackage.DEPENDENCY__PROPERTY_REF:
				return basicSetPropertyRef(null, msgs);
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
			case SpdPackage.DEPENDENCY__SOFT_PKG_REF:
				return getSoftPkgRef();
			case SpdPackage.DEPENDENCY__PROPERTY_REF:
				return getPropertyRef();
			case SpdPackage.DEPENDENCY__TYPE:
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
			case SpdPackage.DEPENDENCY__SOFT_PKG_REF:
				setSoftPkgRef((SoftPkgRef)newValue);
				return;
			case SpdPackage.DEPENDENCY__PROPERTY_REF:
				setPropertyRef((PropertyRef)newValue);
				return;
			case SpdPackage.DEPENDENCY__TYPE:
				setType((String)newValue);
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
			case SpdPackage.DEPENDENCY__SOFT_PKG_REF:
				setSoftPkgRef((SoftPkgRef)null);
				return;
			case SpdPackage.DEPENDENCY__PROPERTY_REF:
				setPropertyRef((PropertyRef)null);
				return;
			case SpdPackage.DEPENDENCY__TYPE:
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
			case SpdPackage.DEPENDENCY__SOFT_PKG_REF:
				return softPkgRef != null;
			case SpdPackage.DEPENDENCY__PROPERTY_REF:
				return getPropertyRef() != null;
			case SpdPackage.DEPENDENCY__TYPE:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
    public PropertyContainer getPropertyContainer() {
	    // TODO How do we return a "global" property container
	    return null;
    }

} //DependencyImpl
