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
package mil.jpeojtrs.sca.util;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;

/**
 * @since 3.0
 */
public class ScaExtendedMetaData extends BasicExtendedMetaData {

	public ScaExtendedMetaData() {
		this(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
	}

	public ScaExtendedMetaData(final Registry registry) {
		super(registry);
	}

	public ScaExtendedMetaData(final String annotationURI, final Registry registry, final Map<EModelElement, EAnnotation> annotationMap) {
		super(annotationURI, registry, annotationMap);
	}

	public ScaExtendedMetaData(final String annotationURI, final Registry registry) {
		super(annotationURI, registry);
	}

	@Override
	protected boolean isFeatureNamespaceMatchingLax() {
		return true;
	}

	@Override
	public EReference getXMLNSPrefixMapFeature(final EClass eClass) {
		// Always return null or we will get a Transaction exception on saves
		return null;
	}

}
