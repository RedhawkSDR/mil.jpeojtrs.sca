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

import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.prf.StructValue;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Sequence Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructSequenceRefImpl#getStructValue <em>Struct Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructSequenceRefImpl extends AbstractPropertyRefImpl<StructSequence> implements StructSequenceRef {
	/**
	 * The cached value of the '{@link #getStructValue() <em>Struct Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StructValue> structValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructSequenceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.STRUCT_SEQUENCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 *  @since 3.0
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setProperty(StructSequence newProperty) {
		super.setProperty(newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructValue> getStructValue() {
		if (structValue == null) {
			structValue = new EObjectContainmentEList<StructValue>(StructValue.class, this, PrfPackage.STRUCT_SEQUENCE_REF__STRUCT_VALUE);
		}
		return structValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PropertyContainer getPropertyContainer() {
		// END GENERATED CODE
		return getProperty();
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
		case PrfPackage.STRUCT_SEQUENCE_REF__STRUCT_VALUE:
			return ((InternalEList< ? >) getStructValue()).basicRemove(otherEnd, msgs);
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
		case PrfPackage.STRUCT_SEQUENCE_REF__STRUCT_VALUE:
			return getStructValue();
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
		case PrfPackage.STRUCT_SEQUENCE_REF__STRUCT_VALUE:
			getStructValue().clear();
			getStructValue().addAll((Collection< ? extends StructValue>) newValue);
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
		case PrfPackage.STRUCT_SEQUENCE_REF__STRUCT_VALUE:
			getStructValue().clear();
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
		case PrfPackage.STRUCT_SEQUENCE_REF__STRUCT_VALUE:
			return structValue != null && !structValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Any toAny() {
		Any retVal = JacorbUtil.init().create_any();
		List<Any> structVals = new ArrayList<Any>();
		for (StructValue structProp : getStructValue()) {
			structVals.add(structProp.toAny());
		}
		AnySeqHelper.insert(retVal, structVals.toArray(new Any[structVals.size()]));
		return retVal;
	}

} //StructSequenceRefImpl
