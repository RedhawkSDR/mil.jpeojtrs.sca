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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Range;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Values;
import mil.jpeojtrs.sca.util.AnyUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#getValues <em>Values</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#getRange <em>Range</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl#isComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleSequenceImpl extends AbstractPropertyImpl implements SimpleSequence {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected Values values;
	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> kind;
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyValueType TYPE_EDEFAULT = PropertyValueType.STRING;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PropertyValueType type = TYPE_EDEFAULT;
	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isComplex() <em>Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLEX_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isComplex() <em>Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplex()
	 * @generated
	 * @ordered
	 */
	protected boolean complex = COMPLEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.SIMPLE_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Values getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValues(Values newValues, NotificationChain msgs) {
		Values oldValues = values;
		values = newValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__VALUES, oldValues, newValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(Values newValues) {
		if (newValues != values) {
			NotificationChain msgs = null;
			if (values != null)
				msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE__VALUES, null, msgs);
			if (newValues != null)
				msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE__VALUES, null, msgs);
			msgs = basicSetValues(newValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__VALUES, newValues, newValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kind> getKind() {
		if (kind == null) {
			kind = new EObjectContainmentEList<Kind>(Kind.class, this, PrfPackage.SIMPLE_SEQUENCE__KIND);
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.SIMPLE_SEQUENCE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PropertyValueType newType) {
		PropertyValueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		PropertyValueType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PrfPackage.SIMPLE_SEQUENCE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplex() {
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplex(boolean newComplex) {
		boolean oldComplex = complex;
		complex = newComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.SIMPLE_SEQUENCE__COMPLEX, oldComplex, complex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrfPackage.SIMPLE_SEQUENCE__VALUES:
				return basicSetValues(null, msgs);
			case PrfPackage.SIMPLE_SEQUENCE__RANGE:
				return basicSetRange(null, msgs);
			case PrfPackage.SIMPLE_SEQUENCE__KIND:
				return ((InternalEList<?>)getKind()).basicRemove(otherEnd, msgs);
			case PrfPackage.SIMPLE_SEQUENCE__ACTION:
				return basicSetAction(null, msgs);
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
			case PrfPackage.SIMPLE_SEQUENCE__VALUES:
				return getValues();
			case PrfPackage.SIMPLE_SEQUENCE__UNITS:
				return getUnits();
			case PrfPackage.SIMPLE_SEQUENCE__RANGE:
				return getRange();
			case PrfPackage.SIMPLE_SEQUENCE__KIND:
				return getKind();
			case PrfPackage.SIMPLE_SEQUENCE__ACTION:
				return getAction();
			case PrfPackage.SIMPLE_SEQUENCE__TYPE:
				return getType();
			case PrfPackage.SIMPLE_SEQUENCE__COMPLEX:
				return isComplex();
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
			case PrfPackage.SIMPLE_SEQUENCE__VALUES:
				setValues((Values)newValue);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__UNITS:
				setUnits((String)newValue);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__RANGE:
				setRange((Range)newValue);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__KIND:
				getKind().clear();
				getKind().addAll((Collection<? extends Kind>)newValue);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__ACTION:
				setAction((Action)newValue);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__TYPE:
				setType((PropertyValueType)newValue);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__COMPLEX:
				setComplex((Boolean)newValue);
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
			case PrfPackage.SIMPLE_SEQUENCE__VALUES:
				setValues((Values)null);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__RANGE:
				setRange((Range)null);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__KIND:
				getKind().clear();
				return;
			case PrfPackage.SIMPLE_SEQUENCE__ACTION:
				setAction((Action)null);
				return;
			case PrfPackage.SIMPLE_SEQUENCE__TYPE:
				unsetType();
				return;
			case PrfPackage.SIMPLE_SEQUENCE__COMPLEX:
				setComplex(COMPLEX_EDEFAULT);
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
			case PrfPackage.SIMPLE_SEQUENCE__VALUES:
				return values != null;
			case PrfPackage.SIMPLE_SEQUENCE__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case PrfPackage.SIMPLE_SEQUENCE__RANGE:
				return range != null;
			case PrfPackage.SIMPLE_SEQUENCE__KIND:
				return kind != null && !kind.isEmpty();
			case PrfPackage.SIMPLE_SEQUENCE__ACTION:
				return action != null;
			case PrfPackage.SIMPLE_SEQUENCE__TYPE:
				return isSetType();
			case PrfPackage.SIMPLE_SEQUENCE__COMPLEX:
				return complex != COMPLEX_EDEFAULT;
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
		result.append(" (units: ");
		result.append(units);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", complex: ");
		result.append(complex);
		result.append(')');
		return result.toString();
	}

	public boolean isKind(PropertyConfigurationType ... type) {
		// END GENERATED CODE
		if (type == null) {
			return false;
		}
		if (eContainer() instanceof AbstractProperty) {
			return ((AbstractProperty) eContainer()).isKind(type);
		}
		Set<PropertyConfigurationType> types = new HashSet<PropertyConfigurationType>(Arrays.asList(type));
		for (Kind k : getKind()) {
			if (types.contains(k.getType())) {
				return true;
			}
		}
		if (getKind().isEmpty() && types.contains(PropertyConfigurationType.CONFIGURE)) {
			return true;
		}
		return false;
		// BEGIN GENERATED CODE
	}

	@Override
    public Any toAny() {
		return AnyUtils.toAny(getValues().getValue().toArray(), getType().getLiteral());
    }

} //SimpleSequenceImpl
