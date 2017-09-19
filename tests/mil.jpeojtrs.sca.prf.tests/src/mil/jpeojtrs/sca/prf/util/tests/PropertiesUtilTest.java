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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.tests.PrfTests;
import mil.jpeojtrs.sca.prf.util.PropertiesUtil;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;
import mil.jpeojtrs.sca.util.collections.FeatureMapList;

public class PropertiesUtilTest {

	private static Properties props;
	private static Set<String> propIds;
	private static Properties props2;
	private static Set<String> propIds2;

	@BeforeClass
	public static void before() throws IOException {
		ResourceSet resourceSet = ScaResourceFactoryUtil.createResourceSet();

		Resource resource = resourceSet.getResource(PrfTests.getURI("testFiles/PropertiesUtilTest.prf.xml"), true);
		props = Properties.Util.getProperties(resource);
		propIds = new HashSet<>();
		for (AbstractProperty prop : new FeatureMapList<AbstractProperty>(props.getProperties(), AbstractProperty.class)) {
			propIds.add(prop.getId());
		}

		resource = resourceSet.getResource(PrfTests.getURI("testFiles/PropertiesUtilTest2.prf.xml"), true);
		props2 = Properties.Util.getProperties(resource);
		propIds2 = new HashSet<>();
		for (AbstractProperty prop : new FeatureMapList<AbstractProperty>(props2.getProperties(), AbstractProperty.class)) {
			propIds2.add(prop.getId());
		}
	}

	/**
	 * IDE-1654
	 */
	@Test
	public void isCommandLine() {
		String[] isCmdLnTrue = new String[] { "simple_execparam_property", "simple_execparam", "simple_execparam_readonly", "simple_execparam_writeonly",
			"simple_commandline_property", "simple_readonly_commandline_property", };

		String[] isCmdLnFalse = new String[] { "simple_property", "simplesequence_property", "struct_property", "structsequence_property", "simple_empty",
			"simplesequence_empty", "struct_empty", "structsequence_empty", "simple_configure", "simple_configure_readonly", "simple_configure_writeonly",
			"simple_configure_property", "simple_readonly_property", "simplesequence_readonly_property", "struct_readonly_property",
			"structsequence_readonly_property" };
		verifyAllPropNamesPresent(isCmdLnTrue, isCmdLnFalse, propIds);

		for (String property : isCmdLnTrue) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertTrue(property + " should be a valid command-line property", PropertiesUtil.isCommandLine(prop));
		}
		for (String property : isCmdLnFalse) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertFalse(property + " should NOT be a valid command-line property", PropertiesUtil.isCommandLine(prop));
		}
	}

	/**
	 * IDE-1391
	 */
	@Test
	public void canInitialize() {
		Assert.assertFalse(PropertiesUtil.canInitialize(null));

		String[] initializeTrue = new String[] { "simple_property", "simplesequence_property", "struct_property", "structsequence_property",
			"simple_configure_property", "simple_readonly_property", "simplesequence_readonly_property", "struct_readonly_property",
			"structsequence_readonly_property" };

		String[] initializeFalse = new String[] { "simple_configure", "simple_configure_readonly", "simple_configure_writeonly", "simple_empty",
			"simplesequence_empty", "struct_empty", "structsequence_empty", "simple_execparam_property", "simple_execparam", "simple_execparam_readonly",
			"simple_execparam_writeonly", "simple_commandline_property", "simple_readonly_commandline_property" };
		verifyAllPropNamesPresent(initializeTrue, initializeFalse, propIds);

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

	/**
	 * IDE-1531 - The IDE should allow property value overrides for read-only command line property properties
	 * IDE-1888 - The IDE should allow property value overrides for ALL 'property' properties
	 */
	@Test
	public void canOverride() {
		String[] overrideTrue = new String[] { "simple_property", "simple_readonly_commandline_property", "simple_configure", "simple_configure_writeonly",
			"simple_execparam_property", "simple_execparam", "simple_execparam_writeonly", "simplesequence_property", "struct_property",
			"structsequence_property", "simple_empty", "simplesequence_empty", "struct_empty", "structsequence_empty", "simple_configure_property",
			"simple_commandline_property", "simple_readonly_property", "simplesequence_readonly_property", "struct_readonly_property",
			"structsequence_readonly_property" };
		String[] overrideFalse = new String[] { "simple_configure_readonly", "simple_execparam_readonly" };
		verifyAllPropNamesPresent(overrideTrue, overrideFalse, propIds);

		for (String property : overrideTrue) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertTrue("Should be able to override " + property, PropertiesUtil.canOverride(prop));
		}
		for (String property : overrideFalse) {
			AbstractProperty prop = props.getProperty(property);
			Assert.assertNotNull("Property not found in PRF: " + property, prop);
			Assert.assertFalse("Should NOT be able to override " + property, PropertiesUtil.canOverride(prop));
		}
	}

	@Test
	public void canConfigure() {
		Assert.assertFalse(PropertiesUtil.canConfigure(null));

		String[] configureTrue = new String[] { "simple_property", "simplesequence_property", "struct_property", "structsequence_property", "simple_empty",
			"simplesequence_empty", "struct_empty", "structsequence_empty", "simple_configure_property", "simple_configure", "simple_configure_writeonly" };

		String[] configureFalse = new String[] { "simple_execparam", "simple_execparam_readonly", "simple_execparam_writeonly", "simple_execparam_property",
			"simple_commandline_property", "simple_readonly_commandline_property", "simple_readonly_property", "simplesequence_readonly_property",
			"struct_readonly_property", "structsequence_readonly_property", "simple_configure_readonly" };
		verifyAllPropNamesPresent(configureTrue, configureFalse, propIds);

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

	@Test
	public void canConfigureOrQuery() {
		Assert.assertFalse(PropertiesUtil.canConfigureOrQuery(null));

		String[] configOrQueryTrue = { "prop_ro", "prop_rw", "prop_wo", "alloc_ro", "alloc_rw", "exec_ro", "exec_rw", "config_ro", "config_rw", "config_wo",
			"commandline_ro", "commandline_rw", "commandline_wo" };

		String[] configOrQueryFalse = { "alloc_wo", "exec_wo", "message_ro", "message_rw", "message_wo", "alloc_internal_ro", "alloc_internal_rw", "alloc_internal_wo" };
		verifyAllPropNamesPresent(configOrQueryTrue, configOrQueryFalse, propIds2);

		for (String property : configOrQueryTrue) {
			AbstractProperty prop = props2.getProperty(property);
			Assert.assertTrue("Should be able to configure/query " + property, PropertiesUtil.canConfigureOrQuery(prop));
		}
		for (String property : configOrQueryFalse) {
			AbstractProperty prop = props2.getProperty(property);
			Assert.assertFalse("Should NOT be able to configure/query " + property, PropertiesUtil.canConfigureOrQuery(prop));
		}
	}

	/**
	 * Ensure set 1 + set 2 is the same as the reference set
	 * @param set1
	 * @param set2
	 * @param referenceSet
	 */
	private void verifyAllPropNamesPresent(String[] set1, String[] set2, Set<String> referenceSet) {
		Set<String> propIdsToVerify = new HashSet<>(referenceSet);
		for (String propId : set1) {
			if (!propIdsToVerify.remove(propId)) {
				Assert.fail("Sanity check failed. Property " + propId + " isn't a property in the PRF, or is used twice");
			}
		}
		for (String propId : set2) {
			if (!propIdsToVerify.remove(propId)) {
				Assert.fail("Sanity check failed. Property " + propId + " isn't a property in the PRF, or is used twice");
			}
		}
		Assert.assertTrue("One or more properties weren't checked: " + propIdsToVerify.toString(), propIdsToVerify.isEmpty());
	}
}
