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

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * This class permits wrapping an EMF {@link FeatureMap} so that its <b>entire</b> contents can be treated as a list
 * of a particular type. This is useful if the {@link FeatureMap} contains objects which all inherit from a common
 * parent type.
 * <p>
 * Add/set operations are not supported, since FeatureMaps require the feature to be specified when adding elements.
 * @param <E> The type to assume for all contents of the {@link FeatureMap}
 * @since 4.0
 */
public class FeatureMapList< E > extends AbstractList<E>implements List<E> {

	private FeatureMap map;

	private Class<E> valueType;

	public FeatureMapList(FeatureMap map, Class<E> valueType) {
		this.map = map;
		this.valueType = valueType;
	}

	@Override
	public E get(int index) {
		return valueType.cast(map.getValue(index));
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(E e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E remove(int index) {
		return valueType.cast(map.remove(index));
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public Iterator<E> iterator() {
		return new FeatureMapIterator<E>(map, valueType);
	}

}
