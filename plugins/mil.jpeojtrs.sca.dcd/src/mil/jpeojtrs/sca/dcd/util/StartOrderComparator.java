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
package mil.jpeojtrs.sca.dcd.util;

import java.math.BigInteger;
import java.util.Comparator;

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;

/**
 * A comparator to order component instantiations by start order.
 * @since 4.0
 */
public class StartOrderComparator implements Comparator<DcdComponentInstantiation> {

	@Override
	public int compare(DcdComponentInstantiation o1, DcdComponentInstantiation o2) {
		// Handle nulls (< any component instance)
		if (o1 == null || o2 == null) {
			if (o1 != null) {
				return -1;
			} else if (o2 != null) {
				return 1;
			} else {
				return 0;
			}
		}

		// Handle same object
		if (o1 == o2) {
			return 0;
		}

		// Handle start order (any start order > no start order)
		BigInteger so1 = o1.getStartOrder();
		BigInteger so2 = o2.getStartOrder();
		if (so1 != null && so2 != null) {
			return so1.compareTo(so2);
		} else if (so1 != null && so2 == null) {
			// only o1 has a start order
			return 1;
		} else if (so1 == null && so2 != null) {
			// only o2 has a start order
			return -1;
		} else {
			return 0;
		}
	}

}
