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
package mil.jpeojtrs.sca.dcd.impl;

import mil.jpeojtrs.sca.dcd.CompositePartOfDevice;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Part Of Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.CompositePartOfDeviceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.CompositePartOfDeviceImpl#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositePartOfDeviceImpl extends EObjectImpl implements CompositePartOfDevice {
	/**
	 * The default value of the '{@link #getRefID() <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRefID() <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefID()
	 * @generated
	 * @ordered
	 */
	protected String refID = REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CompositePartOfDeviceImpl() {
		super();
		// END GENERATED CODE
		eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				switch (msg.getFeatureID(CompositePartOfDevice.class)) {
				case DcdPackage.COMPOSITE_PART_OF_DEVICE__REF_ID:
					if (msg.getEventType() == Notification.SET && eNotificationRequired()) {
						eNotify(new ENotificationImpl(CompositePartOfDeviceImpl.this, Notification.SET, DcdPackage.COMPOSITE_PART_OF_DEVICE__COMPONENT, null, getComponent()));
					}
					break;
				default:
					break;
				}
			}
		});
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.COMPOSITE_PART_OF_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdComponentInstantiation getComponent() {
		DcdComponentInstantiation component = basicGetComponent();
		return component != null && component.eIsProxy() ? (DcdComponentInstantiation)eResolveProxy((InternalEObject)component) : component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DcdComponentInstantiation basicGetComponent() {
		// END GENERATED CODE
		if ((eResource() == null) || (this.getRefID() == null)) {
			return null;
		}
		return (DcdComponentInstantiation) eResource().getEObject(this.getRefID());
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setComponent(DcdComponentInstantiation newComponent) {
		// END GENERATED CODE
		if (newComponent != null) {
			this.setRefID(newComponent.getId());
		} else {
			this.setRefID(null);
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefID() {
		return refID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefID(String newRefID) {
		String oldRefID = refID;
		refID = newRefID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.COMPOSITE_PART_OF_DEVICE__REF_ID, oldRefID, refID));
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
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__REF_ID:
				return getRefID();
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
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__COMPONENT:
				setComponent((DcdComponentInstantiation)newValue);
				return;
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__REF_ID:
				setRefID((String)newValue);
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
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__COMPONENT:
				setComponent((DcdComponentInstantiation)null);
				return;
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__REF_ID:
				setRefID(REF_ID_EDEFAULT);
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
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__COMPONENT:
				return basicGetComponent() != null;
			case DcdPackage.COMPOSITE_PART_OF_DEVICE__REF_ID:
				return REF_ID_EDEFAULT == null ? refID != null : !REF_ID_EDEFAULT.equals(refID);
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
		result.append(" (refID: ");
		result.append(refID);
		result.append(')');
		return result.toString();
	}

} //CompositePartOfDeviceImpl
