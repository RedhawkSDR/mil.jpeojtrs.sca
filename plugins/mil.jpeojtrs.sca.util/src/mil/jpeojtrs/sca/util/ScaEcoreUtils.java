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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @since 3.0
 * 
 */
public final class ScaEcoreUtils {

	/**
	 * Pass as a feature on the path to get the container object.
	 * @since 3.1
	 */
	public static final EStructuralFeature ECONTAINER = null;

	private ScaEcoreUtils() {

	}

	/**
	 * Returns a feature value from a given path.  If any intermediate values are null this method returns null.
	 * <b>NOTE</b> Does not work with lists within the path.  However, a list may be the final retval value.
	 * @param <T> The type of the feature
	 * @param eObj The object to fetch the feature from
	 * @param path Path to the request feature starting from the eObj. 
	 * @return value of the feature, may be null
	 */
	@SuppressWarnings("unchecked")
	public static < T > T getFeature(EObject eObj, final EStructuralFeature... path) {
		Object retVal = null;
		if (path != null) {
			for (final EStructuralFeature feature : path) {
				if (eObj == null) {
					return null;
				}
				if (feature != null) {
					// Do check of container type
					feature.getContainerClass().cast(eObj);
					retVal = eObj.eGet(feature);
				} else {
					retVal = eObj.eContainer();
				}
				if (retVal instanceof EObject) {
					eObj = (EObject) retVal;
				} else {
					eObj = null;
				}
			}
		}
		return (T) retVal;
	}
	
	/**
	 * Traverses the parent eContainer tree up until it finds a parent of a given type.
	 * @param eObj The child object
	 * @param type The type of the parent object to look for, must NOT be null
	 * @return The object matching the type, may return null.
	 * @since 3.2
	 */
	public static < T > T getEContainerOfType(EObject eObj, Class < T > type) {
		Assert.isNotNull(type, "Type must not be null");
		for (; eObj != null; eObj = eObj.eContainer()) {
			if (type.isInstance(eObj)) {
				return type.cast(eObj);
			}
		}
		return null;
	}

}
