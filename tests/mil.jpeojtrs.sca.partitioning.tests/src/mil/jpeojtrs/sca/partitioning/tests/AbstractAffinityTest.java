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
package mil.jpeojtrs.sca.partitioning.tests;

import java.net.URISyntaxException;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractAffinityTest {

	@Test
	public abstract void load() throws URISyntaxException;

	/**
	 * IDE-1813 Test validation for empty <code>affinity</code> element.
	 * @throws URISyntaxException
	 */
	@Test
	public void empty() throws URISyntaxException {
		EObject affinity = getEmptyAffinity();

		final AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final Diagnostician diagnostician = new Diagnostician() {
			@Override
			public String getObjectLabel(final EObject eObject) {
				if (!eObject.eIsProxy()) {
					final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(eObject, IItemLabelProvider.class);
					if (itemLabelProvider != null) {
						return itemLabelProvider.getText(eObject);
					}
				}

				return super.getObjectLabel(eObject);
			}
		};
		Diagnostic diagnostic = diagnostician.validate(affinity);
		Assert.assertNotEquals(Diagnostic.OK, diagnostic.getSeverity());

		String errorMsg = diagnostic.getChildren().get(0).getMessage();
		Assert.assertEquals("The feature 'properties' of 'affinity' with 0 values must have at least 1 values", errorMsg);
	}

	protected abstract EObject getEmptyAffinity() throws URISyntaxException;
}
