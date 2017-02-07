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

import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SadComponentPlacementImpl extends ComponentPlacementImpl<SadComponentInstantiation> implements SadComponentPlacement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadComponentPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.SAD_COMPONENT_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SadComponentInstantiation> getComponentInstantiation() {
		if (componentInstantiation == null) {
			componentInstantiation = new EObjectContainmentWithInverseEList<SadComponentInstantiation>(SadComponentInstantiation.class, this,
				SadPackage.SAD_COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION, PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT) {
				private static final long serialVersionUID = 1L;

				@Override
				public Class< ? > getInverseFeatureClass() {
					return ComponentInstantiation.class;
				}
			};
		}
		return componentInstantiation;
	}

} //ComponentPlacementImpl
