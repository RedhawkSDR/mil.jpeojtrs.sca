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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;

import CF.DataType;
import CF.PropertiesHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructImpl#getSimpleSequence <em>Simple Sequence</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructImpl#getConfigurationKind <em>Configuration Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructImpl extends AbstractPropertyImpl implements Struct {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap fields;

	/**
	 * The cached value of the '{@link #getConfigurationKind() <em>Configuration Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKind()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationKind> configurationKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFields() {
		if (fields == null) {
			fields = new BasicFeatureMap(this, PrfPackage.STRUCT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Simple> getSimple() {
		return getFields().list(PrfPackage.Literals.STRUCT__SIMPLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleSequence> getSimpleSequence() {
		return getFields().list(PrfPackage.Literals.STRUCT__SIMPLE_SEQUENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationKind> getConfigurationKind() {
		if (configurationKind == null) {
			configurationKind = new EObjectContainmentEList<ConfigurationKind>(ConfigurationKind.class, this, PrfPackage.STRUCT__CONFIGURATION_KIND);
		}
		return configurationKind;
	}

	@Override
	public boolean isKind(PropertyConfigurationType... type) {
		// END GENERATED CODE
		if (type == null) {
			return false;
		}
		if (eContainer() instanceof AbstractProperty) {
			return ((AbstractProperty) eContainer()).isKind(type);
		}

		Set<StructPropertyConfigurationType> types = new HashSet<StructPropertyConfigurationType>(type.length);
		for (PropertyConfigurationType t : type) {
			types.add(StructPropertyConfigurationType.getStructPropertyConfigurationType(t));
		}
		for (ConfigurationKind k : getConfigurationKind()) {
			if (types.contains(k.getType())) {
				return true;
			}
		}
		if (getConfigurationKind().isEmpty() && types.contains(StructPropertyConfigurationType.PROPERTY)) {
			return true;
		}
		return false;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public AbstractProperty getProperty(String repID) {
		// END GENERATED CODE
		if (repID == null) {
			return null;
		}
		for (FeatureMap.Entry entry : getFields()) {
			AbstractProperty property = (AbstractProperty) entry.getValue();
			if (repID.equals(property.getId())) {
				return property;
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
		case PrfPackage.STRUCT__FIELDS:
			return ((InternalEList< ? >) getFields()).basicRemove(otherEnd, msgs);
		case PrfPackage.STRUCT__SIMPLE:
			return ((InternalEList< ? >) getSimple()).basicRemove(otherEnd, msgs);
		case PrfPackage.STRUCT__SIMPLE_SEQUENCE:
			return ((InternalEList< ? >) getSimpleSequence()).basicRemove(otherEnd, msgs);
		case PrfPackage.STRUCT__CONFIGURATION_KIND:
			return ((InternalEList< ? >) getConfigurationKind()).basicRemove(otherEnd, msgs);
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
		case PrfPackage.STRUCT__FIELDS:
			if (coreType)
				return getFields();
			return ((FeatureMap.Internal) getFields()).getWrapper();
		case PrfPackage.STRUCT__SIMPLE:
			return getSimple();
		case PrfPackage.STRUCT__SIMPLE_SEQUENCE:
			return getSimpleSequence();
		case PrfPackage.STRUCT__CONFIGURATION_KIND:
			return getConfigurationKind();
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
		case PrfPackage.STRUCT__FIELDS:
			((FeatureMap.Internal) getFields()).set(newValue);
			return;
		case PrfPackage.STRUCT__SIMPLE:
			getSimple().clear();
			getSimple().addAll((Collection< ? extends Simple>) newValue);
			return;
		case PrfPackage.STRUCT__SIMPLE_SEQUENCE:
			getSimpleSequence().clear();
			getSimpleSequence().addAll((Collection< ? extends SimpleSequence>) newValue);
			return;
		case PrfPackage.STRUCT__CONFIGURATION_KIND:
			getConfigurationKind().clear();
			getConfigurationKind().addAll((Collection< ? extends ConfigurationKind>) newValue);
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
		case PrfPackage.STRUCT__FIELDS:
			getFields().clear();
			return;
		case PrfPackage.STRUCT__SIMPLE:
			getSimple().clear();
			return;
		case PrfPackage.STRUCT__SIMPLE_SEQUENCE:
			getSimpleSequence().clear();
			return;
		case PrfPackage.STRUCT__CONFIGURATION_KIND:
			getConfigurationKind().clear();
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
		case PrfPackage.STRUCT__FIELDS:
			return fields != null && !fields.isEmpty();
		case PrfPackage.STRUCT__SIMPLE:
			return !getSimple().isEmpty();
		case PrfPackage.STRUCT__SIMPLE_SEQUENCE:
			return !getSimpleSequence().isEmpty();
		case PrfPackage.STRUCT__CONFIGURATION_KIND:
			return configurationKind != null && !configurationKind.isEmpty();
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
		result.append(" (fields: ");
		result.append(fields);
		result.append(')');
		return result.toString();
	}

	@Override
	public Any toAny() {
		Any retVal = JacorbUtil.init().create_any();
		List<DataType> fields = new ArrayList<DataType>();
		for (FeatureMap.Entry propEntry : getFields()) {
			AbstractProperty prop = (AbstractProperty) propEntry.getValue();
			fields.add(new DataType(prop.getId(), prop.toAny()));
		}
		PropertiesHelper.insert(retVal, fields.toArray(new DataType[fields.size()]));
		return retVal;
	}

} //StructImpl
