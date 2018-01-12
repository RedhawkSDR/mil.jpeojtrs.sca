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
package mil.jpeojtrs.sca.prf.util.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.tests.PrfTests;
import mil.jpeojtrs.sca.prf.util.PrfValidator;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;

public class PrfValidatorTest {

	@Test
	public void validateSimple_1215() throws IOException {
		Properties props = getProps("testFiles/validation/Simple.prf.xml");

		// Warning for a top-level simple that is marked optional (IDE-1215)
		Simple simple = (Simple) props.getProperty("optionalWarning");
		assertWarning(simple, 1215);

		// Simple inside a struct that is marked optional is ok
		simple = (Simple) ((Struct) props.getProperty("optional")).getProperty("optional::optionalOk");
		assertOk(simple);
	}

	@Test
	public void validateSimple_1344() throws IOException {
		Properties props = getProps("testFiles/validation/Simple.prf.xml");

		// Warning for a simple with a kind element that is not top-level (IDE-1344)
		Simple simple = (Simple) ((Struct) props.getProperty("redundantKind")).getProperty("redundantKind::redundantKindWarning");
		assertWarning(simple, 1344);
	}

	@Test
	public void validateSimple_1675() throws IOException {
		Properties props = getProps("testFiles/validation/Simple.prf.xml");

		// Warning for non-struct property with kind=message (IDE-1675)
		Simple simple = (Simple) props.getProperty("messageWarning");
		assertWarning(simple, 1675);
	}

	@Test
	public void validateSimpleSequence_1215() throws IOException {
		Properties props = getProps("testFiles/validation/SimpleSequence.prf.xml");

		// Warning for a top-level simple sequence that is marked optional (IDE-1215)
		SimpleSequence simpleSeq = (SimpleSequence) props.getProperty("optionalWarning");
		assertWarning(simpleSeq, 1215);

		// Simple sequence inside a struct that is marked optional is ok
		simpleSeq = (SimpleSequence) ((Struct) props.getProperty("optional")).getProperty("optional::optionalOk");
		assertOk(simpleSeq);
	}

	@Test
	public void validateSimpleSequence_1344() throws IOException {
		Properties props = getProps("testFiles/validation/SimpleSequence.prf.xml");

		// Warning for a simple sequence with a kind element that is not top-level (IDE-1344)
		SimpleSequence simpleSeq = (SimpleSequence) ((Struct) props.getProperty("redundantKind")).getProperty("redundantKind::redundantKindWarning");
		assertWarning(simpleSeq, 1344);
	}

	@Test
	public void validateSimpleSequence_1675() throws IOException {
		Properties props = getProps("testFiles/validation/SimpleSequence.prf.xml");

		// Warning for non-struct property with kind=message (IDE-1675)
		SimpleSequence simpleSeq = (SimpleSequence) props.getProperty("messageWarning");
		assertWarning(simpleSeq, 1675);
	}

	@Test
	public void validateStruct_1344() throws IOException {
		Properties props = getProps("testFiles/validation/Struct.prf.xml");

		// Warning for a struct with a configurationkind element that is not top-level (IDE-1344)
		Struct struct = ((StructSequence) props.getProperty("redundantKind")).getStruct();
		assertWarning(struct, 1344);
	}

	@Test
	public void validateStructSequence_1675() throws IOException {
		Properties props = getProps("testFiles/validation/StructSequence.prf.xml");

		// Warning for non-struct property with kind=message (IDE-1675)
		StructSequence structSeq = (StructSequence) props.getProperty("messageWarning");
		assertWarning(structSeq, 1675);
	}

	private Properties getProps(String file) throws IOException {
		final ResourceSet resourceSet = ScaResourceFactoryUtil.createResourceSet();
		return Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI(file), true));
	}

	private void assertOk(EObject obj) {
		// Yes/no validation
		boolean result = PrfValidator.INSTANCE.validate(obj, null, null);
		Assert.assertTrue(result);

		// Valdiation with diagnostics
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		result = PrfValidator.INSTANCE.validate(obj, diagnostic, null);
		Assert.assertTrue(result);
		Assert.assertEquals(Diagnostic.OK, diagnostic.getSeverity());
	}

	private void assertWarning(EObject obj, int code) {
		// Yes/no validation
		boolean result = PrfValidator.INSTANCE.validate(obj, null, null);
		Assert.assertTrue(result);

		// Valdiation with diagnostics
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		result = PrfValidator.INSTANCE.validate(obj, diagnostic, null);
		Assert.assertTrue(result);
		Assert.assertEquals(1, diagnostic.getChildren().size());
		Diagnostic childDiag = diagnostic.getChildren().get(0);
		Assert.assertEquals(Diagnostic.WARNING, childDiag.getSeverity());
		Assert.assertEquals(code, childDiag.getCode());
	}
}
