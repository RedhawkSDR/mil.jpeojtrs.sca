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

import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Resource Factory Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl#getResourceFactoryProperties <em>Resource Factory Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl#getRefid <em>Refid</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ComponentResourceFactoryRefImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentResourceFactoryRefImpl extends EObjectImpl implements ComponentResourceFactoryRef {
	/**
	 * The cached value of the '{@link #getResourceFactoryProperties() <em>Resource Factory Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceFactoryProperties()
	 * @generated
	 * @ordered
	 */
	protected ResourceFactoryProperties resourceFactoryProperties;
	/**
	 * The default value of the '{@link #getRefid() <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefid()
	 * @generated
	 * @ordered
	 */
	protected static final String REFID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRefid() <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefid()
	 * @generated
	 * @ordered
	 */
	protected String refid = REFID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentResourceFactoryRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.COMPONENT_RESOURCE_FACTORY_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceFactoryProperties getResourceFactoryProperties() {
		return resourceFactoryProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceFactoryProperties(ResourceFactoryProperties newResourceFactoryProperties, NotificationChain msgs) {
		ResourceFactoryProperties oldResourceFactoryProperties = resourceFactoryProperties;
		resourceFactoryProperties = newResourceFactoryProperties;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES, oldResourceFactoryProperties, newResourceFactoryProperties);
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
	public void setResourceFactoryProperties(ResourceFactoryProperties newResourceFactoryProperties) {
		if (newResourceFactoryProperties != resourceFactoryProperties)
		{
			NotificationChain msgs = null;
			if (resourceFactoryProperties != null)
				msgs = ((InternalEObject)resourceFactoryProperties).eInverseRemove(this, SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF, ResourceFactoryProperties.class, msgs);
			if (newResourceFactoryProperties != null)
				msgs = ((InternalEObject)newResourceFactoryProperties).eInverseAdd(this, SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF, ResourceFactoryProperties.class, msgs);
			msgs = basicSetResourceFactoryProperties(newResourceFactoryProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES, newResourceFactoryProperties, newResourceFactoryProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefid() {
		return refid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefid(String newRefid) {
		String oldRefid = refid;
		refid = newRefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.COMPONENT_RESOURCE_FACTORY_REF__REFID, oldRefid, refid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadComponentInstantiation getComponent() {
		SadComponentInstantiation component = basicGetComponent();
		return component != null && component.eIsProxy() ? (SadComponentInstantiation)eResolveProxy((InternalEObject)component) : component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SadComponentInstantiation basicGetComponent() {
		// END GENERATED CODE
		if (refid == null) {
			return null;
		}
		EObject root = EcoreUtil.getRootContainer(this);
		if (root instanceof SoftwareAssembly) {
			SoftwareAssembly sad = (SoftwareAssembly) root;
			for (SadComponentPlacement cp : sad.getPartitioning().getComponentPlacement()) {
				for (SadComponentInstantiation ci : cp.getComponentInstantiation()) {
					if (refid.equals(ci.getId())) {
						return ci;
					}
				}
			}
			for (HostCollocation hc : sad.getPartitioning().getHostCollocation()) {
				for (SadComponentPlacement cp : hc.getComponentPlacement()) {
					for (SadComponentInstantiation ci : cp.getComponentInstantiation()) {
						if (refid.equals(ci.getId())) {
							return ci;
						}
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
	 * @generated NOT
	 */
	@Override
	public void setComponent(SadComponentInstantiation newComponent) {
		// END GENERATED CODE
		if (newComponent != null) {
			setRefid(newComponent.getId());
		} else {
			setRefid(null);
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES:
				if (resourceFactoryProperties != null)
					msgs = ((InternalEObject)resourceFactoryProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES, null, msgs);
				return basicSetResourceFactoryProperties((ResourceFactoryProperties)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES:
				return basicSetResourceFactoryProperties(null, msgs);
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
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES:
				return getResourceFactoryProperties();
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__REFID:
				return getRefid();
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES:
				setResourceFactoryProperties((ResourceFactoryProperties)newValue);
				return;
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__REFID:
				setRefid((String)newValue);
				return;
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__COMPONENT:
				setComponent((SadComponentInstantiation)newValue);
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
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES:
				setResourceFactoryProperties((ResourceFactoryProperties)null);
				return;
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__REFID:
				setRefid(REFID_EDEFAULT);
				return;
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__COMPONENT:
				setComponent((SadComponentInstantiation)null);
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
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES:
				return resourceFactoryProperties != null;
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__REFID:
				return REFID_EDEFAULT == null ? refid != null : !REFID_EDEFAULT.equals(refid);
			case SadPackage.COMPONENT_RESOURCE_FACTORY_REF__COMPONENT:
				return basicGetComponent() != null;
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
		result.append(" (refid: ");
		result.append(refid);
		result.append(')');
		return result.toString();
	}

} //ComponentResourceFactoryRefImpl
