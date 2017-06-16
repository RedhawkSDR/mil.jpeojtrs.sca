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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.util.collections.FeatureMapList;

public abstract class AbstractComponentPropertiesTest {

	/**
	 * IDE-1813 Test validation for empty <code>componentproperties</code> element.
	 * @throws URISyntaxException
	 */
	@Test
	public void empty() throws URISyntaxException {
		ComponentProperties componentProperties = getEmptyComponentProperties();

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
		Diagnostic diagnostic = diagnostician.validate(componentProperties);
		Assert.assertNotEquals(Diagnostic.OK, diagnostic.getSeverity());

		String errorMsg = diagnostic.getChildren().get(0).getMessage();
		Assert.assertEquals("The feature 'properties' of 'componentProperties' with 0 values must have at least 1 values", errorMsg);
	}

	protected abstract ComponentProperties getEmptyComponentProperties() throws URISyntaxException;

	/**
	 * IDE-1868 Validate references to non-existent properties in SAD/DCD
	 * IDE-1975 NPE during validation of structvalue if no corresponding structsequence in ref'd component's PRF
	 */
	@Test
	public void validatePropertyRefIds() throws URISyntaxException {
		ComponentProperties props = getCPForPropertyRefValidation();
		Set<String> badRefIds = new HashSet<String>();
		Collections.addAll(badRefIds, "badSimple1", "badSimpleSeq1", "badStruct1", "badStructSeq1");
		List<String> badChildRefIds = new ArrayList<String>();
		Collections.addAll(badChildRefIds, "badChildSimple2", "badChildSimpleSeq2", "badGrandChildSimple2", "badGrandChildSimpleSeq2");

		for (AbstractPropertyRef< ? > propRef : new FeatureMapList<>(props.getProperties(), AbstractPropertyRef.class)) {
			BasicDiagnostic diagnostics = new BasicDiagnostic();
			boolean validatorResult = Diagnostician.INSTANCE.validate(propRef, diagnostics);
			String refId = propRef.getRefID();
			if (badRefIds.contains(refId)) {
				Assert.assertFalse("Incorrect validation for prop ref " + refId, validatorResult);
				Assert.assertEquals("Incorrect severity for prop ref " + refId, IStatus.ERROR, diagnostics.getSeverity());
				Assert.assertTrue("Unexpected error message for prop ref " + refId,
					diagnostics.getChildren().get(0).getMessage().contains("Invalid property refid"));
			} else if (!validatorResult) {
				// Must have bad child property ref(s)
				Assert.assertEquals("Incorrect severity for prop ref " + refId, IStatus.ERROR, diagnostics.getSeverity());
				boolean foundBadChildren = false;
				outer: for (Diagnostic diag : diagnostics.getChildren()) {
					// We don't care about partial config messages
					if (diag.getMessage().contains("partial configuration")) {
						continue;
					}

					boolean testMsg = diag.getMessage().contains("Invalid property refid");
					Assert.assertTrue("Unexpected error message for prop ref " + refId + ". Message: " + diag.getMessage(), testMsg);

					for (String badRefId : badChildRefIds) {
						if (diag.getMessage().contains(badRefId)) {
							foundBadChildren = true;
							break outer;
						}
					}
					Assert.fail("Child error did not mention bad property refs for prop ref " + refId + ". Message: " + diag.getMessage());
				}
				Assert.assertTrue("Didn't find bad children for prop ref " + refId, foundBadChildren);
			}
		}
	}

	protected abstract ComponentProperties getCPForPropertyRefValidation() throws URISyntaxException;

}
