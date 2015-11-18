/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package mil.jpeojtrs.sca.prf.util.tests;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.tests.PrfTests;
import mil.jpeojtrs.sca.prf.util.PropertiesUtil;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;

public class PropertiesUtilTest {

	private Properties props;

	@Before
	public void before() throws IOException {
		ResourceSet resourceSet = ScaResourceFactoryUtil.createResourceSet();
		Resource resource = resourceSet.getResource(PrfTests.getURI("testFiles/PropertiesUtilTest.prf.xml"), true);
		props = Properties.Util.getProperties(resource);
	}

	@Test
	public void canInitialize() {
		Assert.assertFalse(PropertiesUtil.canInitialize(null));

		String[] initializeTrue = new String[] { "simple_property", "simplesequence_property", "struct_property", "structsequence_property", "simple_empty",
			"simple_configure_property", "simple_readonly_property", "simplesequence_readonly_property", "struct_readonly_property",
			"structsequence_readonly_property" };

		String[] initializeFalse = new String[] { "simple_configure", "simple_execparam_property", "simple_execparam", "simple_commandline_property" };

		for (String property : initializeTrue) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertTrue("Should be able to initialize " + property, PropertiesUtil.canInitialize(prop));
		}
		for (String property : initializeFalse) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertFalse("Should NOT be able to initialize " + property, PropertiesUtil.canInitialize(prop));
		}
	}

	@Test
	public void canConfigure() {
		Assert.assertFalse(PropertiesUtil.canConfigure(null));

		String[] configureTrue = new String[] { "simple_property", "simplesequence_property", "struct_property", "structsequence_property", "simple_empty",
			"simple_configure_property", "simple_configure", "simple_execparam_property", "simple_commandline_property" };

		String[] configureFalse = new String[] { "simple_execparam", "simple_readonly_property", "simplesequence_readonly_property", "struct_readonly_property",
			"structsequence_readonly_property" };

		for (String property : configureTrue) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertTrue("Should be able to configure " + property, PropertiesUtil.canConfigure(prop));
		}
		for (String property : configureFalse) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertFalse("Should NOT be able to configure " + property, PropertiesUtil.canConfigure(prop));
		}
	}
}
