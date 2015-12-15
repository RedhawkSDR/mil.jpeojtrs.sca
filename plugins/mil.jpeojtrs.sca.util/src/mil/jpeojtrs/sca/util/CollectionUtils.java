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

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @since 4.1
 */
public class CollectionUtils {

	private CollectionUtils() {
	}

	/**
	 * Checks whether a collection is sorted according to the order specified by a comparator.
	 *
	 * @param collection
	 * @param comparator
	 * @return true if list is sorted
	 */
	public static < T > boolean isSorted(Collection<T> collection, Comparator< ? super T> comparator) {
		Iterator<T> iter = collection.iterator();
		if (!iter.hasNext()) {
			return true;
		}
		T t1 = iter.next();
		while (iter.hasNext()) {
			T t2 = iter.next();
			if (comparator.compare(t1, t2) > 0) {
				return false;
			}
			t1 = t2;
		}
		return true;
	}

}
