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
package mil.jpeojtrs.sca.prf.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.PropertyRefGroup;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Ref Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyRefGroupImpl extends EObjectImpl implements PropertyRefGroup {
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
	protected PropertyRefGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.PROPERTY_REF_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProperties() {
		if (properties == null) {
			properties = new BasicFeatureMap(this, PrfPackage.PROPERTY_REF_GROUP__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleRef> getSimpleRef() {
		return getProperties().list(PrfPackage.Literals.PROPERTY_REF_GROUP__SIMPLE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleSequenceRef> getSimpleSequenceRef() {
		return getProperties().list(PrfPackage.Literals.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructRef> getStructRef() {
		return getProperties().list(PrfPackage.Literals.PROPERTY_REF_GROUP__STRUCT_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructSequenceRef> getStructSequenceRef() {
		return getProperties().list(PrfPackage.Literals.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract PropertyContainer getPropertyContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrfPackage.PROPERTY_REF_GROUP__PROPERTIES:
			return ((InternalEList< ? >) getProperties()).basicRemove(otherEnd, msgs);
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_REF:
			return ((InternalEList< ? >) getSimpleRef()).basicRemove(otherEnd, msgs);
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF:
			return ((InternalEList< ? >) getSimpleSequenceRef()).basicRemove(otherEnd, msgs);
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_REF:
			return ((InternalEList< ? >) getStructRef()).basicRemove(otherEnd, msgs);
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF:
			return ((InternalEList< ? >) getStructSequenceRef()).basicRemove(otherEnd, msgs);
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
		case PrfPackage.PROPERTY_REF_GROUP__PROPERTIES:
			if (coreType)
				return getProperties();
			return ((FeatureMap.Internal) getProperties()).getWrapper();
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_REF:
			return getSimpleRef();
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF:
			return getSimpleSequenceRef();
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_REF:
			return getStructRef();
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF:
			return getStructSequenceRef();
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
		case PrfPackage.PROPERTY_REF_GROUP__PROPERTIES:
			((FeatureMap.Internal) getProperties()).set(newValue);
			return;
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_REF:
			getSimpleRef().clear();
			getSimpleRef().addAll((Collection< ? extends SimpleRef>) newValue);
			return;
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			getSimpleSequenceRef().addAll((Collection< ? extends SimpleSequenceRef>) newValue);
			return;
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_REF:
			getStructRef().clear();
			getStructRef().addAll((Collection< ? extends StructRef>) newValue);
			return;
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF:
			getStructSequenceRef().clear();
			getStructSequenceRef().addAll((Collection< ? extends StructSequenceRef>) newValue);
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
		case PrfPackage.PROPERTY_REF_GROUP__PROPERTIES:
			getProperties().clear();
			return;
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_REF:
			getSimpleRef().clear();
			return;
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			return;
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_REF:
			getStructRef().clear();
			return;
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF:
			getStructSequenceRef().clear();
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
		case PrfPackage.PROPERTY_REF_GROUP__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_REF:
			return !getSimpleRef().isEmpty();
		case PrfPackage.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF:
			return !getSimpleSequenceRef().isEmpty();
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_REF:
			return !getStructRef().isEmpty();
		case PrfPackage.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF:
			return !getStructSequenceRef().isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} //PropertyRefGroupImpl
