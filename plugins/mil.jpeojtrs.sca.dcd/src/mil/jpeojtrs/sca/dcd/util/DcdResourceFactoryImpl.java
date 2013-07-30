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
package mil.jpeojtrs.sca.dcd.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.util.ScaExtendedMetaData;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dcd.util.DcdResourceImpl
 * @generated
 */
public class DcdResourceFactoryImpl extends ResourceFactoryImpl {
	/** <!-- begin-user-doc --> <!-- end-user-doc -->. */
	protected ExtendedMetaData extendedMetaData;

	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DcdResourceFactoryImpl() {
		// END GENERATED CODE
		super();
		this.extendedMetaData = new ScaExtendedMetaData() {
			
			@Override
			public java.util.List<org.eclipse.emf.ecore.EStructuralFeature> getAllElements(org.eclipse.emf.ecore.EClass eClass) {
				List<EStructuralFeature> retVal = super.getAllElements(eClass);
				if (eClass == DcdPackage.Literals.DCD_COMPONENT_PLACEMENT) {
					Comparator<EStructuralFeature> comparator = new Comparator<EStructuralFeature>() {

						public int compare(EStructuralFeature o1, EStructuralFeature o2) {
							if (o1 == o2) {
								return 0;
							}
							if (o1 == PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION) {
								return 1;
							}
							if (o2 == PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION) {
								return -1;
							}
	                        return 0;
                        }
					};
					if (retVal instanceof EList) {
						ECollections.sort((EList<EStructuralFeature>) retVal, comparator);
					} else {
						Collections.sort(retVal, comparator);
					}
				}
				return retVal;
			}
		};
		this.extendedMetaData.putPackage(null, DcdPackage.eINSTANCE);
		// BEGIN GENERATED CODE
	}

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Resource createResource(final URI uri) {
		// END GENERATED CODE
		final XMLResource result = new DcdResourceImpl(uri);
		
		ScaResourceFactoryUtil.setDefaultLoadOptions(result.getDefaultLoadOptions());
		ScaResourceFactoryUtil.setDefaultSaveOptions(result.getDefaultSaveOptions());
		
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, this.extendedMetaData);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, this.extendedMetaData);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

		result.setDoctypeInfo(null, DcdResourceImpl.DOC_TYPE_SYSTEM);

		return result;
		// BEGIN GENERATED CODE
	}

} // DcdResourceFactoryImpl
