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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.tests.PrfTests;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;

public class PrfValidatorTest {

	@Test
	public void validateSimples() throws IOException {
		final ResourceSet resourceSet = ScaResourceFactoryUtil.createResourceSet();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleTest.prf.xml"), true));

		BasicDiagnostic diagnostic = new BasicDiagnostic("mil.jpeojtrs.sca.prf.tests", 0, "Validation problems", null);
		Diagnostician.INSTANCE.validate(props, diagnostic);
		Assert.assertEquals(IStatus.OK, diagnostic.getSeverity());
	}
}
