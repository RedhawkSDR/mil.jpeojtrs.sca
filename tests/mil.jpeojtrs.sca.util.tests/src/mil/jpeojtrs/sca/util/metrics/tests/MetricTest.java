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
package mil.jpeojtrs.sca.util.metrics.tests;

import java.util.ArrayList;
import java.util.List;

import org.jacorb.JacorbUtil;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.DataType;
import CF.PropertiesHelper;
import mil.jpeojtrs.sca.util.metrics.Metric;

public class MetricTest {

	private static final ORB ORB = JacorbUtil.init();

	/**
	 * Tests demarshalling of a metric with all the attributes.
	 */
	@Test
	public void demarshalFullMetric() {
		List<DataType> props = new ArrayList<>();
		Any any = ORB.create_any();
		any.insert_float(1.0f);
		props.add(new DataType("cores", any));
		any = ORB.create_any();
		any.insert_float(2.0f);
		props.add(new DataType("memory", any));
		any = ORB.create_any();
		any.insert_boolean(true);
		props.add(new DataType("valid", any));
		any = ORB.create_any();
		any.insert_boolean(false);
		props.add(new DataType("shared", any));
		any = ORB.create_any();
		any.insert_ulong(3);
		props.add(new DataType("processes", any));
		any = ORB.create_any();
		any.insert_ulong(4);
		props.add(new DataType("threads", any));
		any = ORB.create_any();
		any.insert_ulong(5);
		props.add(new DataType("files", any));
		any = ORB.create_any();
		any.insert_string("abc");
		props.add(new DataType("componenthost", any));

		any = ORB.create_any();
		PropertiesHelper.insert(any, props.toArray(new DataType[props.size()]));
		DataType dt = new DataType("myid", any);

		Metric metric = new Metric(dt);
		Assert.assertEquals(1.0f, metric.getCores(), 0);
		Assert.assertEquals(2.0f, metric.getMemory(), 0);
		Assert.assertEquals(true, metric.isValid());
		Assert.assertEquals(false, metric.isShared());
		Assert.assertEquals(3, metric.getProcesses());
		Assert.assertEquals(4, metric.getThreads());
		Assert.assertEquals(5, metric.getFiles());
		Assert.assertEquals("abc", metric.getComponentHost());
		Assert.assertTrue(metric.isSetCores());
		Assert.assertTrue(metric.isSetMemory());
		Assert.assertTrue(metric.isSetValid());
		Assert.assertTrue(metric.isSetShared());
		Assert.assertTrue(metric.isSetProcesses());
		Assert.assertTrue(metric.isSetThreads());
		Assert.assertTrue(metric.isSetFiles());
		Assert.assertTrue(metric.isSetComponentHost());
	}

	/**
	 * Tests demarshalling of a metric with some attributes (just those for application utilization).
	 */
	@Test
	public void demarshalPartialMetric() {
		List<DataType> props = new ArrayList<>();
		Any any = ORB.create_any();
		any.insert_float(10.0f);
		props.add(new DataType("cores", any));
		any = ORB.create_any();
		any.insert_float(11.0f);
		props.add(new DataType("memory", any));
		any = ORB.create_any();
		any.insert_boolean(true);
		props.add(new DataType("valid", any));
		any = ORB.create_any();
		any.insert_ulong(12);
		props.add(new DataType("processes", any));
		any = ORB.create_any();
		any.insert_ulong(13);
		props.add(new DataType("threads", any));
		any = ORB.create_any();
		any.insert_ulong(14);
		props.add(new DataType("files", any));

		any = ORB.create_any();
		PropertiesHelper.insert(any, props.toArray(new DataType[props.size()]));
		DataType dt = new DataType("application utilization", any);

		Metric metric = new Metric(dt);
		Assert.assertEquals(10.0f, metric.getCores(), 0);
		Assert.assertEquals(11.0f, metric.getMemory(), 0);
		Assert.assertEquals(true, metric.isValid());
		Assert.assertEquals(12, metric.getProcesses());
		Assert.assertEquals(13, metric.getThreads());
		Assert.assertEquals(14, metric.getFiles());
		Assert.assertTrue(metric.isSetCores());
		Assert.assertTrue(metric.isSetMemory());
		Assert.assertTrue(metric.isSetValid());
		Assert.assertFalse(metric.isSetShared());
		Assert.assertTrue(metric.isSetProcesses());
		Assert.assertTrue(metric.isSetThreads());
		Assert.assertTrue(metric.isSetFiles());
		Assert.assertFalse(metric.isSetComponentHost());
	}

	/**
	 * Tests marshalling of a metric with all attributes.
	 */
	@Test
	public void marshalFullMetric() {
		Metric metric = new Metric();
		metric.setId("myid");
		metric.setCores(1.0f);
		metric.setMemory(2.0f);
		metric.setValid(false);
		metric.setShared(true);
		metric.setProcesses(3);
		metric.setThreads(4);
		metric.setFiles(5);
		metric.setComponentHost("abc");
		DataType dt = metric.toDataType(new String[] { "cores", "memory", "valid", "shared", "processes", "threads", "files", "componenthost" });

		Assert.assertEquals("myid", dt.id);
		DataType[] props = PropertiesHelper.extract(dt.value);
		Assert.assertEquals(props.length, 8);
		Assert.assertEquals("cores", props[0].id);
		Assert.assertEquals("memory", props[1].id);
		Assert.assertEquals("valid", props[2].id);
		Assert.assertEquals("shared", props[3].id);
		Assert.assertEquals("processes", props[4].id);
		Assert.assertEquals("threads", props[5].id);
		Assert.assertEquals("files", props[6].id);
		Assert.assertEquals("componenthost", props[7].id);
		Assert.assertEquals(1.0f, props[0].value.extract_float(), 0.0);
		Assert.assertEquals(2.0f, props[1].value.extract_float(), 0.0);
		Assert.assertEquals(false, props[2].value.extract_boolean());
		Assert.assertEquals(true, props[3].value.extract_boolean());
		Assert.assertEquals(3, props[4].value.extract_ulong());
		Assert.assertEquals(4, props[5].value.extract_ulong());
		Assert.assertEquals(5, props[6].value.extract_ulong());
		Assert.assertEquals("abc", props[7].value.extract_string());
	}

	/**
	 * Tests marshalling of a metric with some attributes (just those for application utilization).
	 */
	@Test
	public void marshalPartialMetric() {
		Metric metric = new Metric();
		metric.setId("application utilization");
		metric.setCores(1.0f);
		metric.setMemory(2.0f);
		metric.setValid(false);
		metric.setProcesses(3);
		metric.setThreads(4);
		metric.setFiles(5);
		DataType dt = metric.toDataType(new String[] { "cores", "memory", "valid", "shared", "processes", "threads", "files", "componenthost" });

		Assert.assertEquals("application utilization", dt.id);
		DataType[] props = PropertiesHelper.extract(dt.value);
		Assert.assertEquals(props.length, 6);
		Assert.assertEquals("cores", props[0].id);
		Assert.assertEquals("memory", props[1].id);
		Assert.assertEquals("valid", props[2].id);
		Assert.assertEquals("processes", props[3].id);
		Assert.assertEquals("threads", props[4].id);
		Assert.assertEquals("files", props[5].id);
		Assert.assertEquals(1.0f, props[0].value.extract_float(), 0.0);
		Assert.assertEquals(2.0f, props[1].value.extract_float(), 0.0);
		Assert.assertEquals(false, props[2].value.extract_boolean());
		Assert.assertEquals(3, props[3].value.extract_ulong());
		Assert.assertEquals(4, props[4].value.extract_ulong());
		Assert.assertEquals(5, props[5].value.extract_ulong());
	}

}
