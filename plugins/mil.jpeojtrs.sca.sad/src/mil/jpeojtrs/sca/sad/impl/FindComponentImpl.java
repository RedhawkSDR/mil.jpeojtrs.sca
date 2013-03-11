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
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.FindComponent;
import mil.jpeojtrs.sca.sad.SadPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.FindComponentImpl#getComponentResourceFactoryRef <em>Component Resource Factory Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.FindComponentImpl#getNamingService <em>Naming Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindComponentImpl extends EObjectImpl implements FindComponent {

	/**
	 * The cached value of the '{@link #getComponentResourceFactoryRef() <em>Component Resource Factory Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentResourceFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected ComponentResourceFactoryRef componentResourceFactoryRef;
	/**
	 * The cached value of the '{@link #getNamingService() <em>Naming Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingService()
	 * @generated
	 * @ordered
	 */
	protected NamingService namingService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.FIND_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentResourceFactoryRef getComponentResourceFactoryRef() {
		return componentResourceFactoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentResourceFactoryRef(ComponentResourceFactoryRef newComponentResourceFactoryRef, NotificationChain msgs) {
		ComponentResourceFactoryRef oldComponentResourceFactoryRef = componentResourceFactoryRef;
		componentResourceFactoryRef = newComponentResourceFactoryRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF, oldComponentResourceFactoryRef, newComponentResourceFactoryRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentResourceFactoryRef(ComponentResourceFactoryRef newComponentResourceFactoryRef) {
		if (newComponentResourceFactoryRef != componentResourceFactoryRef) {
			NotificationChain msgs = null;
			if (componentResourceFactoryRef != null)
				msgs = ((InternalEObject)componentResourceFactoryRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF, null, msgs);
			if (newComponentResourceFactoryRef != null)
				msgs = ((InternalEObject)newComponentResourceFactoryRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF, null, msgs);
			msgs = basicSetComponentResourceFactoryRef(newComponentResourceFactoryRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF, newComponentResourceFactoryRef, newComponentResourceFactoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingService getNamingService() {
		return namingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingService(NamingService newNamingService, NotificationChain msgs) {
		NamingService oldNamingService = namingService;
		namingService = newNamingService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.FIND_COMPONENT__NAMING_SERVICE, oldNamingService, newNamingService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamingService(NamingService newNamingService) {
		if (newNamingService != namingService) {
			NotificationChain msgs = null;
			if (namingService != null)
				msgs = ((InternalEObject)namingService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.FIND_COMPONENT__NAMING_SERVICE, null, msgs);
			if (newNamingService != null)
				msgs = ((InternalEObject)newNamingService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.FIND_COMPONENT__NAMING_SERVICE, null, msgs);
			msgs = basicSetNamingService(newNamingService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.FIND_COMPONENT__NAMING_SERVICE, newNamingService, newNamingService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF:
				return basicSetComponentResourceFactoryRef(null, msgs);
			case SadPackage.FIND_COMPONENT__NAMING_SERVICE:
				return basicSetNamingService(null, msgs);
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
			case SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF:
				return getComponentResourceFactoryRef();
			case SadPackage.FIND_COMPONENT__NAMING_SERVICE:
				return getNamingService();
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
			case SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF:
				setComponentResourceFactoryRef((ComponentResourceFactoryRef)newValue);
				return;
			case SadPackage.FIND_COMPONENT__NAMING_SERVICE:
				setNamingService((NamingService)newValue);
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
			case SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF:
				setComponentResourceFactoryRef((ComponentResourceFactoryRef)null);
				return;
			case SadPackage.FIND_COMPONENT__NAMING_SERVICE:
				setNamingService((NamingService)null);
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
			case SadPackage.FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF:
				return componentResourceFactoryRef != null;
			case SadPackage.FIND_COMPONENT__NAMING_SERVICE:
				return namingService != null;
		}
		return super.eIsSet(featureID);
	}

} //FindComponentImpl
