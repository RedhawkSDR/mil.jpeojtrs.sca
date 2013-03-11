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

import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.PropertyRefSet;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Ref Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PropertyRefSetImpl extends EObjectImpl implements PropertyRefSet {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyRefSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.PROPERTY_REF_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getProperties() {
		if (properties == null) {
			properties = new BasicFeatureMap(this, PrfPackage.PROPERTY_REF_SET__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRef getSimpleRef() {
		return (SimpleRef)getProperties().get(PrfPackage.Literals.PROPERTY_REF_SET__SIMPLE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleRef(SimpleRef newSimpleRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProperties()).basicAdd(PrfPackage.Literals.PROPERTY_REF_SET__SIMPLE_REF, newSimpleRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleRef(SimpleRef newSimpleRef) {
		((FeatureMap.Internal)getProperties()).set(PrfPackage.Literals.PROPERTY_REF_SET__SIMPLE_REF, newSimpleRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSequenceRef getSimpleSequenceRef() {
		return (SimpleSequenceRef)getProperties().get(PrfPackage.Literals.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleSequenceRef(SimpleSequenceRef newSimpleSequenceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProperties()).basicAdd(PrfPackage.Literals.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF, newSimpleSequenceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleSequenceRef(SimpleSequenceRef newSimpleSequenceRef) {
		((FeatureMap.Internal)getProperties()).set(PrfPackage.Literals.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF, newSimpleSequenceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructRef getStructRef() {
		return (StructRef)getProperties().get(PrfPackage.Literals.PROPERTY_REF_SET__STRUCT_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructRef(StructRef newStructRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProperties()).basicAdd(PrfPackage.Literals.PROPERTY_REF_SET__STRUCT_REF, newStructRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructRef(StructRef newStructRef) {
		((FeatureMap.Internal)getProperties()).set(PrfPackage.Literals.PROPERTY_REF_SET__STRUCT_REF, newStructRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructSequenceRef getStructSequenceRef() {
		return (StructSequenceRef)getProperties().get(PrfPackage.Literals.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructSequenceRef(StructSequenceRef newStructSequenceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProperties()).basicAdd(PrfPackage.Literals.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF, newStructSequenceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructSequenceRef(StructSequenceRef newStructSequenceRef) {
		((FeatureMap.Internal)getProperties()).set(PrfPackage.Literals.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF, newStructSequenceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract PropertyContainer getPropertyContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrfPackage.PROPERTY_REF_SET__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_REF:
				return basicSetSimpleRef(null, msgs);
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF:
				return basicSetSimpleSequenceRef(null, msgs);
			case PrfPackage.PROPERTY_REF_SET__STRUCT_REF:
				return basicSetStructRef(null, msgs);
			case PrfPackage.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF:
				return basicSetStructSequenceRef(null, msgs);
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
			case PrfPackage.PROPERTY_REF_SET__PROPERTIES:
				if (coreType) return getProperties();
				return ((FeatureMap.Internal)getProperties()).getWrapper();
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_REF:
				return getSimpleRef();
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF:
				return getSimpleSequenceRef();
			case PrfPackage.PROPERTY_REF_SET__STRUCT_REF:
				return getStructRef();
			case PrfPackage.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF:
				return getStructSequenceRef();
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
			case PrfPackage.PROPERTY_REF_SET__PROPERTIES:
				((FeatureMap.Internal)getProperties()).set(newValue);
				return;
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_REF:
				setSimpleRef((SimpleRef)newValue);
				return;
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF:
				setSimpleSequenceRef((SimpleSequenceRef)newValue);
				return;
			case PrfPackage.PROPERTY_REF_SET__STRUCT_REF:
				setStructRef((StructRef)newValue);
				return;
			case PrfPackage.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF:
				setStructSequenceRef((StructSequenceRef)newValue);
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
			case PrfPackage.PROPERTY_REF_SET__PROPERTIES:
				getProperties().clear();
				return;
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_REF:
				setSimpleRef((SimpleRef)null);
				return;
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF:
				setSimpleSequenceRef((SimpleSequenceRef)null);
				return;
			case PrfPackage.PROPERTY_REF_SET__STRUCT_REF:
				setStructRef((StructRef)null);
				return;
			case PrfPackage.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF:
				setStructSequenceRef((StructSequenceRef)null);
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
			case PrfPackage.PROPERTY_REF_SET__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_REF:
				return getSimpleRef() != null;
			case PrfPackage.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF:
				return getSimpleSequenceRef() != null;
			case PrfPackage.PROPERTY_REF_SET__STRUCT_REF:
				return getStructRef() != null;
			case PrfPackage.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF:
				return getStructSequenceRef() != null;
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
		result.append(" (properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} //PropertyRefSetImpl
