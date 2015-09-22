/**
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 * 
 * This file is part of REDHAWK IDE.
 * 
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package mil.jpeojtrs.sca.util.collections;

import java.util.Iterator;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * Allows iterating a {@link FeatureMap} while treating all its values as deriving from some class other than Object.
 * @see FeatureMapList
 * @since 4.0
 */
public class FeatureMapIterator< E > implements Iterator<E> {

	private Iterator<FeatureMap.Entry> iterator;

	private Class<E> valueType;

	/**
	 * @param map The {@link FeatureMap} to iterate
	 * @param valueType The base type of all values in the {@link FeatureMap}
	 */
	public FeatureMapIterator(FeatureMap map, Class<E> valueType) {
		this.iterator = map.iterator();
		this.valueType = valueType;
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public E next() {
		return valueType.cast(iterator.next().getValue());
	}

	@Override
	public void remove() {
		iterator.remove();
	}

}
