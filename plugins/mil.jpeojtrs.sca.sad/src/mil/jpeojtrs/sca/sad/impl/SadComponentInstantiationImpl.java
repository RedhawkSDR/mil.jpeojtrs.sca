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
package mil.jpeojtrs.sca.sad.impl;

import java.math.BigInteger;

import mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl;
import mil.jpeojtrs.sca.sad.FindComponent;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationImpl#getFindComponent <em>Find Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SadComponentInstantiationImpl#getStartOrder <em>Start Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SadComponentInstantiationImpl extends ComponentInstantiationImpl implements SadComponentInstantiation {

	/**
	 * The cached value of the '{@link #getFindComponent() <em>Find Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindComponent()
	 * @generated
	 * @ordered
	 */
	protected FindComponent findComponent;
	/**
	 * The default value of the '{@link #getStartOrder() <em>Start Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_ORDER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartOrder() <em>Start Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startOrder = START_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadComponentInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.SAD_COMPONENT_INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindComponent getFindComponent() {
		return findComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindComponent(FindComponent newFindComponent, NotificationChain msgs) {
		FindComponent oldFindComponent = findComponent;
		findComponent = newFindComponent;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT, oldFindComponent, newFindComponent);
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
	public void setFindComponent(FindComponent newFindComponent) {
		if (newFindComponent != findComponent)
		{
			NotificationChain msgs = null;
			if (findComponent != null)
				msgs = ((InternalEObject)findComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT, null, msgs);
			if (newFindComponent != null)
				msgs = ((InternalEObject)newFindComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT, null, msgs);
			msgs = basicSetFindComponent(newFindComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT, newFindComponent, newFindComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStartOrder() {
		return startOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartOrder(BigInteger newStartOrder) {
		BigInteger oldStartOrder = startOrder;
		startOrder = newStartOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SAD_COMPONENT_INSTANTIATION__START_ORDER, oldStartOrder, startOrder));
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
			case SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT:
				return basicSetFindComponent(null, msgs);
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
			case SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT:
				return getFindComponent();
			case SadPackage.SAD_COMPONENT_INSTANTIATION__START_ORDER:
				return getStartOrder();
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
			case SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT:
				setFindComponent((FindComponent)newValue);
				return;
			case SadPackage.SAD_COMPONENT_INSTANTIATION__START_ORDER:
				setStartOrder((BigInteger)newValue);
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
			case SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT:
				setFindComponent((FindComponent)null);
				return;
			case SadPackage.SAD_COMPONENT_INSTANTIATION__START_ORDER:
				setStartOrder(START_ORDER_EDEFAULT);
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
			case SadPackage.SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT:
				return findComponent != null;
			case SadPackage.SAD_COMPONENT_INSTANTIATION__START_ORDER:
				return START_ORDER_EDEFAULT == null ? startOrder != null : !START_ORDER_EDEFAULT.equals(startOrder);
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
		result.append(" (startOrder: ");
		result.append(startOrder);
		result.append(')');
		return result.toString();
	}
} //ComponentInstantiationImpl
