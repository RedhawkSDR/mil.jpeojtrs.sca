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
package mil.jpeojtrs.sca.dpd.util;

import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.util.ScaExtendedMetaData;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dpd.util.DpdResourceImpl
 * @generated
 */
public class DpdResourceFactoryImpl extends ResourceFactoryImpl {
	/** <!-- begin-user-doc --> <!-- end-user-doc -->. */
	protected ExtendedMetaData extendedMetaData;

	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DpdResourceFactoryImpl() {
		// END GENERATED CODE
		super();
		this.extendedMetaData = new ScaExtendedMetaData();
		this.extendedMetaData.putPackage(null, DpdPackage.eINSTANCE);
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
		final XMLResource result = new DpdResourceImpl(uri);
		
		ScaResourceFactoryUtil.setDefaultLoadOptions(result.getDefaultLoadOptions());
		ScaResourceFactoryUtil.setDefaultSaveOptions(result.getDefaultSaveOptions());
		
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, this.extendedMetaData);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, this.extendedMetaData);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

		result.setEncoding("UTF-8");
		result.setDoctypeInfo(DpdResourceImpl.DOC_TYPE_PUBLIC, DpdResourceImpl.DOC_TYPE_SYSTEM);

		return result;
		// BEGIN GENERATED CODE
	}

} // DpdResourceFactoryImpl
