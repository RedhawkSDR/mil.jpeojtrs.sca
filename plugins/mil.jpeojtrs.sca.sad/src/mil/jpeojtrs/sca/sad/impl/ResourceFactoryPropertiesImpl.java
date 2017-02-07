/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Factory Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.ResourceFactoryPropertiesImpl#getFactoryRef <em>Factory Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceFactoryPropertiesImpl extends EObjectImpl implements ResourceFactoryProperties {

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFactoryPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.RESOURCE_FACTORY_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SadPackage.RESOURCE_FACTORY_PROPERTIES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleRef> getSimpleRef() {
		return getGroup().list(SadPackage.Literals.RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleSequenceRef> getSimpleSequenceRef() {
		return getGroup().list(SadPackage.Literals.RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructRef> getStructRef() {
		return getGroup().list(SadPackage.Literals.RESOURCE_FACTORY_PROPERTIES__STRUCT_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructSequenceRef> getStructSequenceRef() {
		return getGroup().list(SadPackage.Literals.RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentResourceFactoryRef getFactoryRef() {
		if (eContainerFeatureID() != SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF)
			return null;
		return (ComponentResourceFactoryRef) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryRef(ComponentResourceFactoryRef newFactoryRef, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFactoryRef, SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactoryRef(ComponentResourceFactoryRef newFactoryRef) {
		if (newFactoryRef != eInternalContainer() || (eContainerFeatureID() != SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF && newFactoryRef != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryRef))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryRef != null)
				msgs = ((InternalEObject) newFactoryRef).eInverseAdd(this, SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES,
					ComponentResourceFactoryRef.class, msgs);
			msgs = basicSetFactoryRef(newFactoryRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF, newFactoryRef, newFactoryRef));
	}

	private static final EStructuralFeature[] PROP_PATH = new EStructuralFeature[] { SadPackage.Literals.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF,
		SadPackage.Literals.COMPONENT_RESOURCE_FACTORY_REF__COMPONENT, PartitioningPackage.Literals.COMPONENT_INSTANTIATION__PLACEMENT,
		PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_FILE_REF, PartitioningPackage.Literals.COMPONENT_FILE_REF__FILE,
		PartitioningPackage.Literals.COMPONENT_FILE__SOFT_PKG, SpdPackage.Literals.SOFT_PKG__PROPERTY_FILE, SpdPackage.Literals.PROPERTY_FILE__PROPERTIES };

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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFactoryRef((ComponentResourceFactoryRef) otherEnd, msgs);
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
		switch (featureID) {
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__GROUP:
			return ((InternalEList< ? >) getGroup()).basicRemove(otherEnd, msgs);
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF:
			return ((InternalEList< ? >) getSimpleRef()).basicRemove(otherEnd, msgs);
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF:
			return ((InternalEList< ? >) getSimpleSequenceRef()).basicRemove(otherEnd, msgs);
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_REF:
			return ((InternalEList< ? >) getStructRef()).basicRemove(otherEnd, msgs);
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF:
			return ((InternalEList< ? >) getStructSequenceRef()).basicRemove(otherEnd, msgs);
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			return basicSetFactoryRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			return eInternalContainer().eInverseRemove(this, SadPackage.COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES,
				ComponentResourceFactoryRef.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF:
			return getSimpleRef();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF:
			return getSimpleSequenceRef();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_REF:
			return getStructRef();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF:
			return getStructSequenceRef();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			return getFactoryRef();
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
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF:
			getSimpleRef().clear();
			getSimpleRef().addAll((Collection< ? extends SimpleRef>) newValue);
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			getSimpleSequenceRef().addAll((Collection< ? extends SimpleSequenceRef>) newValue);
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_REF:
			getStructRef().clear();
			getStructRef().addAll((Collection< ? extends StructRef>) newValue);
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF:
			getStructSequenceRef().clear();
			getStructSequenceRef().addAll((Collection< ? extends StructSequenceRef>) newValue);
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			setFactoryRef((ComponentResourceFactoryRef) newValue);
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
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__GROUP:
			getGroup().clear();
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF:
			getSimpleRef().clear();
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF:
			getSimpleSequenceRef().clear();
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_REF:
			getStructRef().clear();
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF:
			getStructSequenceRef().clear();
			return;
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			setFactoryRef((ComponentResourceFactoryRef) null);
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
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__GROUP:
			return group != null && !group.isEmpty();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF:
			return !getSimpleRef().isEmpty();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF:
			return !getSimpleSequenceRef().isEmpty();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_REF:
			return !getStructRef().isEmpty();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF:
			return !getStructSequenceRef().isEmpty();
		case SadPackage.RESOURCE_FACTORY_PROPERTIES__FACTORY_REF:
			return getFactoryRef() != null;
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ResourceFactoryPropertiesImpl
