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
package mil.jpeojtrs.sca.dcd.impl;

import java.util.Comparator;

import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DcdPartitioning;
import mil.jpeojtrs.sca.partitioning.Partitioning;
import mil.jpeojtrs.sca.partitioning.impl.PartitioningImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partitioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DcdPartitioningImpl extends PartitioningImpl<DcdComponentPlacement>implements DcdPartitioning {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DcdPartitioningImpl() {
		super();
		eAdapters().add(new SortListener());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DCD_PARTITIONING;
	}

	private class SortListener extends EContentAdapter {
		@Override
		public void notifyChanged(final Notification notification) {
			super.notifyChanged(notification);

			if (notification.getNotifier() instanceof DcdPartitioning) {
				switch (notification.getFeatureID(Partitioning.class)) {
				case DcdPackage.DCD_PARTITIONING__COMPONENT_PLACEMENT:
					sortComponents();
					break;
				default:
					break;
				}
			} else if (notification.getNotifier() instanceof DcdComponentPlacement) {
				switch (notification.getFeatureID(DcdComponentPlacement.class)) {
				case DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE:
					sortComponents();
					break;
				default:
					break;
				}
			}
		}
	}

	private void sortComponents() {
		ECollections.sort(getComponentPlacement(), new Comparator<DcdComponentPlacement>() {

			@Override
			public int compare(final DcdComponentPlacement o1, final DcdComponentPlacement o2) {

				if (o1.getParentDevice() != null) {
					if (o1.getParentDevice().eContainer() == o2) {
						return 1;
					}
				}

				if (o2.getParentDevice() != null) {
					if (o2.getParentDevice().eContainer() == o1) {
						return -1;
					}
				}
				return 0;
			}

		});
	}

} //DcdPartitioningImpl
