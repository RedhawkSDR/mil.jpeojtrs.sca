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
package mil.jpeojtrs.sca.sad.util;

import java.math.BigInteger;
import java.util.Comparator;

import mil.jpeojtrs.sca.sad.SadComponentInstantiation;

/**
 * A comparator to order component instantiations by start order.
 * <p/>
 * The assembly controller is always first, regardless of start order.
 * @since 3.0
 */
public class StartOrderComparator implements Comparator<SadComponentInstantiation> {

	private SadComponentInstantiation assemblyController;

	/**
	 * Creates a new comparator. Note that the current assembly controller's instantiation must be provided. This
	 * avoids the computation of looking it up for each comparison.
	 * @param assemblyController
	 */
	public StartOrderComparator(SadComponentInstantiation assemblyController) {
		this.assemblyController = assemblyController;
	}

	@Override
	public int compare(SadComponentInstantiation o1, SadComponentInstantiation o2) {
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

		// Handle assembly controller (> some other component instance)
		if (o1.equals(assemblyController)) {
			return -1;
		} else if (o2.equals(assemblyController)) {
			return 1;
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
