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
package mil.jpeojtrs.sca.partitioning.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPropertiesImpl#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentPropertiesImpl extends EObjectImpl implements ComponentProperties {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap properties;
	private static final EStructuralFeature [] PROP_PATH = new EStructuralFeature[] {
		ScaEcoreUtils.ECONTAINER,
		PartitioningPackage.Literals.COMPONENT_INSTANTIATION__PLACEMENT,
		PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_FILE_REF,
		PartitioningPackage.Literals.COMPONENT_FILE_REF__FILE,
		PartitioningPackage.Literals.COMPONENT_FILE__SOFT_PKG,
		SpdPackage.Literals.SOFT_PKG__PROPERTY_FILE,
		SpdPackage.Literals.PROPERTY_FILE__PROPERTIES
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentPropertiesImpl() {
		super();

		eAdapters().add(this.emptyPropertiesListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.COMPONENT_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProperties() {
		if (properties == null)
		{
			properties = new BasicFeatureMap(this, PartitioningPackage.COMPONENT_PROPERTIES__PROPERTIES);
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
		return getProperties().list(PartitioningPackage.Literals.COMPONENT_PROPERTIES__SIMPLE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleSequenceRef> getSimpleSequenceRef() {
		return getProperties().list(PartitioningPackage.Literals.COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructRef> getStructRef() {
		return getProperties().list(PartitioningPackage.Literals.COMPONENT_PROPERTIES__STRUCT_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructSequenceRef> getStructSequenceRef() {
		return getProperties().list(PartitioningPackage.Literals.COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PropertyContainer getPropertyContainer() {
		// END GENERATED CODE
		return ScaEcoreUtils.getFeature(this, PROP_PATH);
		// BEGIN GENERATED CODE
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
			case PartitioningPackage.COMPONENT_PROPERTIES__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_REF:
				return ((InternalEList<?>)getSimpleRef()).basicRemove(otherEnd, msgs);
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF:
				return ((InternalEList<?>)getSimpleSequenceRef()).basicRemove(otherEnd, msgs);
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_REF:
				return ((InternalEList<?>)getStructRef()).basicRemove(otherEnd, msgs);
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF:
				return ((InternalEList<?>)getStructSequenceRef()).basicRemove(otherEnd, msgs);
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
			case PartitioningPackage.COMPONENT_PROPERTIES__PROPERTIES:
				if (coreType) return getProperties();
				return ((FeatureMap.Internal)getProperties()).getWrapper();
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_REF:
				return getSimpleRef();
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF:
				return getSimpleSequenceRef();
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_REF:
				return getStructRef();
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF:
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
		switch (featureID)
		{
			case PartitioningPackage.COMPONENT_PROPERTIES__PROPERTIES:
				((FeatureMap.Internal)getProperties()).set(newValue);
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_REF:
				getSimpleRef().clear();
				getSimpleRef().addAll((Collection<? extends SimpleRef>)newValue);
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF:
				getSimpleSequenceRef().clear();
				getSimpleSequenceRef().addAll((Collection<? extends SimpleSequenceRef>)newValue);
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_REF:
				getStructRef().clear();
				getStructRef().addAll((Collection<? extends StructRef>)newValue);
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF:
				getStructSequenceRef().clear();
				getStructSequenceRef().addAll((Collection<? extends StructSequenceRef>)newValue);
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
			case PartitioningPackage.COMPONENT_PROPERTIES__PROPERTIES:
				getProperties().clear();
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_REF:
				getSimpleRef().clear();
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF:
				getSimpleSequenceRef().clear();
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_REF:
				getStructRef().clear();
				return;
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF:
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
		switch (featureID)
		{
			case PartitioningPackage.COMPONENT_PROPERTIES__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_REF:
				return !getSimpleRef().isEmpty();
			case PartitioningPackage.COMPONENT_PROPERTIES__SIMPLE_SEQUENCE_REF:
				return !getSimpleSequenceRef().isEmpty();
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_REF:
				return !getStructRef().isEmpty();
			case PartitioningPackage.COMPONENT_PROPERTIES__STRUCT_SEQUENCE_REF:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

	private AdapterImpl emptyPropertiesListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);

			if (notification.getNotifier() instanceof ComponentProperties) {
				switch (notification.getFeatureID(ComponentProperties.class)) {
				case PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES:
					checkProperties();
					break;
				default:
					break;
				}
			}
		}
	};

	private void checkProperties() {
		final FeatureMap props = getProperties();

		if (props.isEmpty()) {
			EcoreUtil.delete(this);
		}
	}

} //ComponentPropertiesImpl
