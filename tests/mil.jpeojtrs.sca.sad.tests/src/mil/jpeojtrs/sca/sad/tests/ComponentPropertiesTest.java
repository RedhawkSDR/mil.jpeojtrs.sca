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
package mil.jpeojtrs.sca.sad.tests;

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.tests.AbstractComponentPropertiesTest;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.prf.util.PrfPlugin;
import mil.jpeojtrs.sca.prf.util.PrfValidator;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

public class ComponentPropertiesTest extends AbstractComponentPropertiesTest {

	@Override
	protected ComponentProperties getEmptyComponentProperties() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/waveEmptyComponentProperties/waveEmptyComponentProperties.sad.xml");
		return sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0).getComponentProperties();
	}

	@Override
	protected ComponentProperties getCPForPropertyRefValidation() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/BadPropertyRefs/BadPropertyRefs.sad.xml");
		return sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0).getComponentProperties();
	}
	
	/**
	 * IDE-2081 - Validate mistyped properties
	 * @throws URISyntaxException 
	 */
	@Test
	public void testMistypedProperties() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/MistypedPropsWaveform/MistypedPropsWaveform.sad.xml");

		SadComponentInstantiation fastFilter = sad.getComponentInstantiation("fastfilter_1");
		SadComponentInstantiation sinkSocket = sad.getComponentInstantiation("sinksocket_1");

		SimpleRef simpleRef = fastFilter.getComponentProperties().getSimpleRef().get(0);
		SimpleSequenceRef simpleSequenceRef = fastFilter.getComponentProperties().getSimpleSequenceRef().get(0);
		StructRef structRef = sinkSocket.getComponentProperties().getStructRef().get(0);
		StructSequenceRef structSequenceRef = fastFilter.getComponentProperties().getStructSequenceRef().get(0);

		BasicDiagnostic diagnostics = null;
		String errorMsg = null;

		// simple ref validation
		diagnostics = new BasicDiagnostic();
		Assert.assertFalse("Validation should fail", PrfValidator.INSTANCE.validateSimpleRef(simpleRef, diagnostics, null));
		errorMsg = PrfPlugin.INSTANCE.getString("_UI_InvalidPropertyType_diagnostic", new Object[] { simpleRef.getRefID() });
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().equals(errorMsg));

		// simple sequence ref validation
		diagnostics = new BasicDiagnostic();
		Assert.assertFalse("Validation should fail", PrfValidator.INSTANCE.validateSimpleSequenceRef(simpleSequenceRef, diagnostics, null));
		errorMsg = PrfPlugin.INSTANCE.getString("_UI_InvalidPropertyType_diagnostic", new Object[] { simpleSequenceRef.getRefID() });
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().equals(errorMsg));

		// struct validation
		diagnostics = new BasicDiagnostic();
		Assert.assertFalse("Validation should fail", PrfValidator.INSTANCE.validateStructRef(structRef, diagnostics, null));
		errorMsg = PrfPlugin.INSTANCE.getString("_UI_InvalidPropertyType_diagnostic", new Object[] { structRef.getRefID() });
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().equals(errorMsg));

		// struct sequence validation
		diagnostics = new BasicDiagnostic();
		Assert.assertFalse("Validation should fail", PrfValidator.INSTANCE.validateStructSequenceRef(structSequenceRef, diagnostics, null));
		errorMsg = PrfPlugin.INSTANCE.getString("_UI_InvalidPropertyType_diagnostic", new Object[] { structSequenceRef.getRefID() });
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().equals(errorMsg));
	}
}
