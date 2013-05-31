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

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.Test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getSimpleSequence <em>Simple Sequence</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getTest <em>Test</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl#getStructSequence <em>Struct Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesImpl extends EObjectImpl implements Properties {
	/**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
	protected String description = DESCRIPTION_EDEFAULT;
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
	protected PropertiesImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return PrfPackage.Literals.PROPERTIES;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDescription() {
        return description;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.PROPERTIES__DESCRIPTION, oldDescription, description));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getProperties() {
        if (properties == null) {
            properties = new BasicFeatureMap(this, PrfPackage.PROPERTIES__PROPERTIES);
        }
        return properties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Simple> getSimple() {
        return getProperties().list(PrfPackage.Literals.PROPERTIES__SIMPLE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SimpleSequence> getSimpleSequence() {
        return getProperties().list(PrfPackage.Literals.PROPERTIES__SIMPLE_SEQUENCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Test> getTest() {
        return getProperties().list(PrfPackage.Literals.PROPERTIES__TEST);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Struct> getStruct() {
        return getProperties().list(PrfPackage.Literals.PROPERTIES__STRUCT);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<StructSequence> getStructSequence() {
        return getProperties().list(PrfPackage.Literals.PROPERTIES__STRUCT_SEQUENCE);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AbstractProperty getProperty(String repID) {
		// END GENERATED CODE
		if (repID == null) {
			return null;
		}
		for (Entry entry : getProperties()) {
			if (entry.getValue() instanceof AbstractProperty && repID.equals(((AbstractProperty) entry.getValue()).getId())) {
				return (AbstractProperty) entry.getValue();
			}
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
            case PrfPackage.PROPERTIES__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case PrfPackage.PROPERTIES__SIMPLE:
                return ((InternalEList<?>)getSimple()).basicRemove(otherEnd, msgs);
            case PrfPackage.PROPERTIES__SIMPLE_SEQUENCE:
                return ((InternalEList<?>)getSimpleSequence()).basicRemove(otherEnd, msgs);
            case PrfPackage.PROPERTIES__TEST:
                return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
            case PrfPackage.PROPERTIES__STRUCT:
                return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
            case PrfPackage.PROPERTIES__STRUCT_SEQUENCE:
                return ((InternalEList<?>)getStructSequence()).basicRemove(otherEnd, msgs);
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
            case PrfPackage.PROPERTIES__DESCRIPTION:
                return getDescription();
            case PrfPackage.PROPERTIES__PROPERTIES:
                if (coreType) return getProperties();
                return ((FeatureMap.Internal)getProperties()).getWrapper();
            case PrfPackage.PROPERTIES__SIMPLE:
                return getSimple();
            case PrfPackage.PROPERTIES__SIMPLE_SEQUENCE:
                return getSimpleSequence();
            case PrfPackage.PROPERTIES__TEST:
                return getTest();
            case PrfPackage.PROPERTIES__STRUCT:
                return getStruct();
            case PrfPackage.PROPERTIES__STRUCT_SEQUENCE:
                return getStructSequence();
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
            case PrfPackage.PROPERTIES__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PrfPackage.PROPERTIES__PROPERTIES:
                ((FeatureMap.Internal)getProperties()).set(newValue);
                return;
            case PrfPackage.PROPERTIES__SIMPLE:
                getSimple().clear();
                getSimple().addAll((Collection<? extends Simple>)newValue);
                return;
            case PrfPackage.PROPERTIES__SIMPLE_SEQUENCE:
                getSimpleSequence().clear();
                getSimpleSequence().addAll((Collection<? extends SimpleSequence>)newValue);
                return;
            case PrfPackage.PROPERTIES__TEST:
                getTest().clear();
                getTest().addAll((Collection<? extends Test>)newValue);
                return;
            case PrfPackage.PROPERTIES__STRUCT:
                getStruct().clear();
                getStruct().addAll((Collection<? extends Struct>)newValue);
                return;
            case PrfPackage.PROPERTIES__STRUCT_SEQUENCE:
                getStructSequence().clear();
                getStructSequence().addAll((Collection<? extends StructSequence>)newValue);
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
            case PrfPackage.PROPERTIES__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PrfPackage.PROPERTIES__PROPERTIES:
                getProperties().clear();
                return;
            case PrfPackage.PROPERTIES__SIMPLE:
                getSimple().clear();
                return;
            case PrfPackage.PROPERTIES__SIMPLE_SEQUENCE:
                getSimpleSequence().clear();
                return;
            case PrfPackage.PROPERTIES__TEST:
                getTest().clear();
                return;
            case PrfPackage.PROPERTIES__STRUCT:
                getStruct().clear();
                return;
            case PrfPackage.PROPERTIES__STRUCT_SEQUENCE:
                getStructSequence().clear();
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
            case PrfPackage.PROPERTIES__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PrfPackage.PROPERTIES__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case PrfPackage.PROPERTIES__SIMPLE:
                return !getSimple().isEmpty();
            case PrfPackage.PROPERTIES__SIMPLE_SEQUENCE:
                return !getSimpleSequence().isEmpty();
            case PrfPackage.PROPERTIES__TEST:
                return !getTest().isEmpty();
            case PrfPackage.PROPERTIES__STRUCT:
                return !getStruct().isEmpty();
            case PrfPackage.PROPERTIES__STRUCT_SEQUENCE:
                return !getStructSequence().isEmpty();
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
        result.append(" (description: ");
        result.append(description);
        result.append(", properties: ");
        result.append(properties);
        result.append(')');
        return result.toString();
    }

} //PropertiesImpl
