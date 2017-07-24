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
package mil.jpeojtrs.sca.prf.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.edit.provider.FeatureMapEntryWrapperItemProvider;

/**
 * Overrides the default implementation of {@link FeatureMapEntryWrapperItemProvider#addEntryFeature} to avoid adding
 * the EAttribute as a prefix to the value's text
 * 
 * @since 3.1
 */
public class WrapperItemProvider extends FeatureMapEntryWrapperItemProvider {

	public WrapperItemProvider(Entry entry, EObject owner, EAttribute attribute, int index, AdapterFactory adapterFactory, ResourceLocator resourceLocator) {
		super(entry, owner, attribute, index, adapterFactory, resourceLocator);
	}

	/**
	 * The default implementation in {@link FeatureMapEntryWrapperItemProvider} tacks on
	 * <EStructuralFeature.getName()>, which we want to avoid here.
	 */
	@Override
	protected String addEntryFeature(String text) {
		return text;
	}

}
