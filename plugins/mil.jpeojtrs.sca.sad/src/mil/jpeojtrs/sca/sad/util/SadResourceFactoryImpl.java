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
package mil.jpeojtrs.sca.sad.util;

import java.util.ArrayList;
import java.util.List;

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.util.ScaExtendedMetaData;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.util.SadResourceImpl
 * @generated
 */
public class SadResourceFactoryImpl extends ResourceFactoryImpl {
	/** <!-- begin-user-doc --> <!-- end-user-doc -->. */
	protected ExtendedMetaData extendedMetaData;

	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SadResourceFactoryImpl() {
		// END GENERATED CODE
		super();
		this.extendedMetaData = new ScaExtendedMetaData();
		this.extendedMetaData.putPackage(null, SadPackage.eINSTANCE);
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
		final XMLResource result = new SadResourceImpl(uri);

		ScaResourceFactoryUtil.setDefaultLoadOptions(result.getDefaultLoadOptions());
		ScaResourceFactoryUtil.setDefaultSaveOptions(result.getDefaultSaveOptions());

		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, this.extendedMetaData);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, this.extendedMetaData);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

		List<EPackage> packageList = new ArrayList<EPackage>();
		packageList.add(SadPackage.eINSTANCE);
		packageList.add(PartitioningPackage.eINSTANCE);
		// Since we include a super project need to add a custom element handler here
		result.getDefaultSaveOptions().put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(false, packageList));

		result.setDoctypeInfo(null, SadResourceImpl.DOC_TYPE_SYSTEM);

		return result;
		// BEGIN GENERATED CODE
	}

} // SadResourceFactoryImpl
