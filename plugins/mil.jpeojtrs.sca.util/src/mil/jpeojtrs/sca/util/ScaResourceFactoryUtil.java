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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;

/**
 * @since 3.0
 * 
 */
public final class ScaResourceFactoryUtil {
	private ScaResourceFactoryUtil() {

	}
	
	/**
     * @since 3.4
     */
	public static ResourceSet createResourceSet() {
		ResourceSet retVal = new ResourceSetImpl();
		setDefaultLoadOptions(retVal.getLoadOptions());
		return retVal;
	}

	/**
	 * Applies all the default XMLResource Options used by all REDHAWK Model resources
	 * @param saveOptions
	 */
	public static void setDefaultSaveOptions(final Map<Object, Object> saveOptions) {

		saveOptions.remove(XMLResource.OPTION_SCHEMA_LOCATION);

		saveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SAVE_DOCTYPE, Boolean.TRUE);

		// Suppress The Document Root
		saveOptions.put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(false));

		saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);

		final Map<String, Object> parserFeatures = new HashMap<String, Object>();
		parserFeatures.put("http://xml.org/sax/features/namespaces", false);
		parserFeatures.put("http://xml.org/sax/features/validation", false);
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		saveOptions.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
	}

	/**
	 * Applies all the default XMLResource Options used by all REDHAWK Model resources
	 * @param saveOptions
	 */
	public static void setDefaultLoadOptions(final Map<Object, Object> loadOptions) {
		loadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_SAVE_DOCTYPE, Boolean.TRUE);

		// Suppress The Document Root
		loadOptions.put(XMLResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);

		final Map<String, Object> parserFeatures = new HashMap<String, Object>();
		parserFeatures.put("http://xml.org/sax/features/namespaces", false);
		parserFeatures.put("http://xml.org/sax/features/validation", false);
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		loadOptions.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
	}
}
