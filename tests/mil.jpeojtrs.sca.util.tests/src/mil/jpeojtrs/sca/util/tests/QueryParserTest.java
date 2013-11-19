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
package mil.jpeojtrs.sca.util.tests;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import mil.jpeojtrs.sca.util.QueryParser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueryParserTest {

	private String query;
	private String badQuery;
	private Map<String, String> params;

	@Before
	public void setUp() throws Exception {
		this.query = "dmName=REDHAWKDomain&fs=IOR%3A00000000000000";
		this.badQuery = "dmName=REDHAWKDomain&fs&";
	}

	@After
	public void tearDown() throws Exception {
		this.query = null;
		this.badQuery = null;
		this.params = null;
	}

	@Test
	public void test_parseQuery() throws Exception {
		this.params = QueryParser.parseQuery(this.query);

		Assert.assertNotNull(this.params);
		Assert.assertEquals(2, this.params.keySet().size());
		Assert.assertEquals(2, this.params.values().size());

		Assert.assertEquals("REDHAWKDomain", this.params.get("dmName"));
		Assert.assertEquals("IOR:00000000000000", this.params.get("fs"));
	}

	@Test
	public void test_parseQueryBlankIOR() throws Exception {
		this.params = QueryParser.parseQuery(this.badQuery);

		Assert.assertNotNull(this.params);
		Assert.assertEquals(2, this.params.keySet().size());
		Assert.assertEquals("REDHAWKDomain", this.params.get("dmName"));
	}

	@Test
	public void test_createQuery() throws Exception {
		this.params = QueryParser.parseQuery(this.query);

		for (final Entry<String, String> entry : this.params.entrySet()) {
			Assert.assertNotNull(entry.getKey());
			Assert.assertNotNull(entry.getValue());
		}

		final String newQuery = QueryParser.createQuery(this.params);
		Assert.assertNotNull(newQuery);

		final Map<String, String> myMap = QueryParser.parseQuery(newQuery);
		for (final Entry<String, String> myEntry : myMap.entrySet()) {
			Assert.assertEquals("Each parameter from the new query should be contained in the original", true, this.params.entrySet().contains(myEntry));
		}
		Assert.assertEquals("The same number of parameters should be present in the original query and the new query", this.params.entrySet().size(), myMap
		        .entrySet().size());

		final String parms = QueryParser.createQuery(null);
		Assert.assertEquals("", parms);
	}

	@Test
	public void test_createQueryWithNoValues() throws Exception {
		this.badQuery = null;
		this.params = QueryParser.parseQuery(this.badQuery);

		Assert.assertNotNull(this.params);
		Assert.assertTrue(this.params.isEmpty());
	}
}
