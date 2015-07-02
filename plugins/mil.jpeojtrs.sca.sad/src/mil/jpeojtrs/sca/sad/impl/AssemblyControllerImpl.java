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

import mil.jpeojtrs.sca.sad.AssemblyController;
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
 * An implementation of the model object '<em><b>Assembly Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.AssemblyControllerImpl#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyControllerImpl extends EObjectImpl implements AssemblyController {

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.ASSEMBLY_CONTROLLER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF,
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
				msgs = ((InternalEObject) componentInstantiationRef).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF, null, msgs);
			if (newComponentInstantiationRef != null)
				msgs = ((InternalEObject) newComponentInstantiationRef).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF, null, msgs);
			msgs = basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF, newComponentInstantiationRef,
				newComponentInstantiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF:
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
		case SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF:
			return getComponentInstantiationRef();
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
		case SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((SadComponentInstantiationRef) newValue);
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
		case SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF:
			setComponentInstantiationRef((SadComponentInstantiationRef) null);
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
		case SadPackage.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF:
			return componentInstantiationRef != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyControllerImpl
