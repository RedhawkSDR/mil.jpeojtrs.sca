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

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.spd.SoftPkg;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl#getComponentFileRef <em>Component File Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl#getComponentInstantiation <em>Component Instantiation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentPlacementImpl<I extends ComponentInstantiation> extends EObjectImpl implements ComponentPlacement<I> {
	/**
	 * The cached value of the '{@link #getComponentFileRef() <em>Component File Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentFileRef()
	 * @generated
	 * @ordered
	 */
	protected ComponentFileRef componentFileRef;
	/**
	 * The cached value of the '{@link #getComponentInstantiation() <em>Component Instantiation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstantiation()
	 * @generated
	 * @ordered
	 */
	protected EList<I> componentInstantiation;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.COMPONENT_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFileRef getComponentFileRef() {
		return componentFileRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentFileRef(ComponentFileRef newComponentFileRef, NotificationChain msgs) {
		ComponentFileRef oldComponentFileRef = componentFileRef;
		componentFileRef = newComponentFileRef;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF, oldComponentFileRef, newComponentFileRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentFileRef(ComponentFileRef newComponentFileRef) {
		if (newComponentFileRef != componentFileRef)
		{
			NotificationChain msgs = null;
			if (componentFileRef != null)
				msgs = ((InternalEObject)componentFileRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF, null, msgs);
			if (newComponentFileRef != null)
				msgs = ((InternalEObject)newComponentFileRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF, null, msgs);
			msgs = basicSetComponentFileRef(newComponentFileRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF, newComponentFileRef, newComponentFileRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<I> getComponentInstantiation() {
		if (componentInstantiation == null)
		{
			componentInstantiation = new EObjectContainmentWithInverseEList<I>(ComponentInstantiation.class, this, PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION, PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT);
		}
		return componentInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		// END GENERATED CODE
		final ComponentFileRef ref = getComponentFileRef();
		if (ref == null) {
			return null;
		}
		final ComponentFile file = ref.getFile();
		if (file == null) {
			return null;
		}
		final SoftPkg spd = file.getSoftPkg();
		if (spd == null) {
			return null;
		}
		return spd.getName();
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentInstantiation()).basicAdd(otherEnd, msgs);
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
		switch (featureID)
		{
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF:
				return basicSetComponentFileRef(null, msgs);
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION:
				return ((InternalEList<?>)getComponentInstantiation()).basicRemove(otherEnd, msgs);
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
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF:
				return getComponentFileRef();
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION:
				return getComponentInstantiation();
			case PartitioningPackage.COMPONENT_PLACEMENT__NAME:
				return getName();
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
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF:
				setComponentFileRef((ComponentFileRef)newValue);
				return;
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION:
				getComponentInstantiation().clear();
				getComponentInstantiation().addAll((Collection<? extends I>)newValue);
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
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF:
				setComponentFileRef((ComponentFileRef)null);
				return;
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION:
				getComponentInstantiation().clear();
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
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF:
				return componentFileRef != null;
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION:
				return componentInstantiation != null && !componentInstantiation.isEmpty();
			case PartitioningPackage.COMPONENT_PLACEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //ComponentPlacementImpl
