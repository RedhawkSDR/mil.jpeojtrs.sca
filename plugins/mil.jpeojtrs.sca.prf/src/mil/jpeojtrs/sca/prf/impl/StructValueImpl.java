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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.prf.StructValue;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;

import CF.DataType;
import CF.PropertiesHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl#getRefs <em>Refs</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructValueImpl extends EObjectImpl implements StructValue {
	/**
	 * The cached value of the '{@link #getRefs() <em>Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getRefs()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap refs;
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.STRUCT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRefs() {
		if (refs == null) {
			refs = new BasicFeatureMap(this, PrfPackage.STRUCT_VALUE__REFS);
		}
		return refs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleRef> getSimpleRef() {
		return getRefs().list(PrfPackage.Literals.STRUCT_VALUE__SIMPLE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleSequenceRef> getSimpleSequenceRef() {
		return getRefs().list(PrfPackage.Literals.STRUCT_VALUE__SIMPLE_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Struct getStruct() {
		Struct struct = basicGetStruct();
		return struct != null && struct.eIsProxy() ? (Struct) eResolveProxy((InternalEObject) struct) : struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Struct basicGetStruct() {
		// END GENERATED CODE
		if (eContainer instanceof StructSequenceRef) {
			StructSequenceRef structSeqRef = (StructSequenceRef) eContainer();
			if (structSeqRef.getProperty() != null && structSeqRef.getProperty() instanceof StructSequence) {
				return structSeqRef.getProperty().getStruct();
			}
		} else if (eContainer instanceof StructSequence) {
			return ((StructSequence) eContainer).getStruct();
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
	public int getIndex() {
		// END GENERATED CODE
		if (eContainer() != null && eContainer().eGet(eContainingFeature()) instanceof List< ? >) {
			return ((List< ? >) eContainer().eGet(eContainingFeature())).indexOf(this);
		}
		return -1;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.1
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Any toAny() {
		// END GENERATED CODE
		Any retVal = JacorbUtil.init().create_any();
		List<DataType> fields = new ArrayList<DataType>();
		for (FeatureMap.Entry propRefEntry : getRefs()) {
			AbstractPropertyRef< ? > propRef = (AbstractPropertyRef< ? >) propRefEntry.getValue();
			Any propAny = propRef.toAny();
			if (propAny != null) {
				fields.add(new DataType(propRef.getRefID(), propRef.toAny()));
			}
		}
		PropertiesHelper.insert(retVal, fields.toArray(new DataType[fields.size()]));
		return retVal;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @since 5.0
	 */
	@Override
	public AbstractPropertyRef< ? > getRef(String id) {
		// END GENERATED CODE
		if (id == null) {
			return null;
		}
		for (FeatureMap.Entry entry : getRefs()) {
			AbstractPropertyRef< ? > ref = (AbstractPropertyRef< ? >) entry.getValue();
			if (id.equals(ref.getRefID())) {
				return ref;
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
	public PropertyContainer getPropertyContainer() {
		// END GENERATED CODE
		if (eContainer() instanceof PropertyContainer) {
			return (PropertyContainer) eContainer();
		} else if (eContainer() instanceof PropertyRefContainer) {
			return ((PropertyRefContainer) eContainer()).getPropertyContainer();
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
		case PrfPackage.STRUCT_VALUE__REFS:
			return ((InternalEList< ? >) getRefs()).basicRemove(otherEnd, msgs);
		case PrfPackage.STRUCT_VALUE__SIMPLE_REF:
			return ((InternalEList< ? >) getSimpleRef()).basicRemove(otherEnd, msgs);
		case PrfPackage.STRUCT_VALUE__SIMPLE_SEQUENCE_REF:
			return ((InternalEList< ? >) getSimpleSequenceRef()).basicRemove(otherEnd, msgs);
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
		case PrfPackage.STRUCT_VALUE__REFS:
			if (coreType)
				return getRefs();
			return ((FeatureMap.Internal) getRefs()).getWrapper();
		case PrfPackage.STRUCT_VALUE__SIMPLE_REF:
			return getSimpleRef();
		case PrfPackage.STRUCT_VALUE__SIMPLE_SEQUENCE_REF:
			return getSimpleSequenceRef();
		case PrfPackage.STRUCT_VALUE__STRUCT:
			if (resolve)
				return getStruct();
			return basicGetStruct();
		case PrfPackage.STRUCT_VALUE__INDEX:
			return getIndex();
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
		case PrfPackage.STRUCT_VALUE__REFS:
			((FeatureMap.Internal) getRefs()).set(newValue);
			return;
		case PrfPackage.STRUCT_VALUE__SIMPLE_REF:
			getSimpleRef().clear();
			getSimpleRef().addAll((Collection< ? extends SimpleRef>) newValue);
			return;
		case PrfPackage.STRUCT_VALUE__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			getSimpleSequenceRef().addAll((Collection< ? extends SimpleSequenceRef>) newValue);
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
		case PrfPackage.STRUCT_VALUE__REFS:
			getRefs().clear();
			return;
		case PrfPackage.STRUCT_VALUE__SIMPLE_REF:
			getSimpleRef().clear();
			return;
		case PrfPackage.STRUCT_VALUE__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
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
		case PrfPackage.STRUCT_VALUE__REFS:
			return refs != null && !refs.isEmpty();
		case PrfPackage.STRUCT_VALUE__SIMPLE_REF:
			return !getSimpleRef().isEmpty();
		case PrfPackage.STRUCT_VALUE__SIMPLE_SEQUENCE_REF:
			return !getSimpleSequenceRef().isEmpty();
		case PrfPackage.STRUCT_VALUE__STRUCT:
			return basicGetStruct() != null;
		case PrfPackage.STRUCT_VALUE__INDEX:
			return getIndex() != INDEX_EDEFAULT;
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
		result.append(" (refs: ");
		result.append(refs);
		result.append(')');
		return result.toString();
	}

} //StructValueImpl
