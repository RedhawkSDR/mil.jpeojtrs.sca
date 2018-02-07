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
package mil.jpeojtrs.sca.util.time.tests;

import org.jacorb.JacorbUtil;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.UTCTimeHelper;
import CF.UTCTimeSequenceHelper;
import mil.jpeojtrs.sca.util.time.UTCTime;
import mil.jpeojtrs.sca.util.time.UTCTimeNow;

public class UTCTimeTest {

	private static final ORB ORB = JacorbUtil.init();

	@Test
	public void new_cfTime() {
		UTCTime time = new UTCTime(new CF.UTCTime((short) 1, 2.0, 0.3));
		new_common(time);
	}

	@Test
	public void new_shortDoubleDouble() {
		UTCTime time = new UTCTime((short) 1, 2.0, 0.3);
		new_common(time);
	}

	private void new_common(UTCTime time) {
		Assert.assertEquals(2.0, time.getWholeSeconds(), 0.0);
		Assert.assertEquals(0.3, time.getFractionalSeconds(), 0.0);
		Assert.assertEquals((short) 1, time.getStatus());
		Assert.assertNotNull(time.getWrappedTime());
		Assert.assertEquals(2.0, time.getWrappedTime().twsec, 0.0);
		Assert.assertEquals(0.3, time.getWrappedTime().tfsec, 0.0);
		Assert.assertEquals((short) 1, time.getWrappedTime().tcstatus);
	}

	@Test
	public void toAny() {
		UTCTime time = new UTCTime((short) 1, 2.0, 3.0);
		Any actualAny = time.toAny();

		Any expectedAny = JacorbUtil.init().create_any();
		UTCTimeHelper.insert(expectedAny, new CF.UTCTime((short) 1, 2.0, 3.0));

		Assert.assertEquals(expectedAny, actualAny);
	}

	@Test
	public void valueOf_any() {
		CF.UTCTime cfTime = new CF.UTCTime((short) 1, 2.0, 0.3);
		Any any = ORB.create_any();
		UTCTimeHelper.insert(any, cfTime);

		UTCTime time = UTCTime.valueOf(any);
		Assert.assertEquals(cfTime.twsec, time.getWrappedTime().twsec, 0.0);
		Assert.assertEquals(cfTime.tfsec, time.getWrappedTime().tfsec, 0.0);
		Assert.assertEquals(cfTime.tcstatus, time.getWrappedTime().tcstatus);
	}

	@Test
	public void valueOfSequence_any() {
		CF.UTCTime[] cfTimes = new CF.UTCTime[2];
		cfTimes[0] = new CF.UTCTime((short) 1, 2.0, 0.3);
		cfTimes[1] = new CF.UTCTime((short) 0, 4.0, 0.5);
		Any any = ORB.create_any();
		UTCTimeSequenceHelper.insert(any, cfTimes);

		UTCTime[] times = UTCTime.valueOfSequence(any);
		Assert.assertEquals(2, times.length);
		Assert.assertEquals(2.0, times[0].getWrappedTime().twsec, 0.0);
		Assert.assertEquals(0.3, times[0].getWrappedTime().tfsec, 0.0);
		Assert.assertEquals((short) 1, times[0].getWrappedTime().tcstatus);
		Assert.assertEquals(4.0, times[1].getWrappedTime().twsec, 0.0);
		Assert.assertEquals(0.5, times[1].getWrappedTime().tfsec, 0.0);
		Assert.assertEquals((short) 0, times[1].getWrappedTime().tcstatus);
	}

	@Test
	public void valueOf_string() {
		UTCTime time = UTCTime.valueOf("1970:01:01::00:00:00.000000");

		Assert.assertEquals(0.0, time.getWrappedTime().twsec, 0.0);
		Assert.assertEquals(0.0, time.getWrappedTime().tfsec, 0.0);
		Assert.assertEquals((short) 1, time.getWrappedTime().tcstatus);

		time = UTCTime.valueOf("1970:01:01::00:00:00");
		Assert.assertEquals(0.0, time.getWrappedTime().twsec, 0.0);
		Assert.assertEquals(0.0, time.getWrappedTime().tfsec, 0.0);
		Assert.assertEquals((short) 1, time.getWrappedTime().tcstatus);

		time = UTCTime.valueOf("2017:02:10::18:02:00.123456");

		Assert.assertEquals(1486749720.0, time.getWrappedTime().twsec, 0.0);
		Assert.assertEquals(0.123456, time.getWrappedTime().tfsec, 0.0);
		Assert.assertEquals((short) 1, time.getWrappedTime().tcstatus);

		time = UTCTime.valueOf("now");
		Assert.assertEquals(System.currentTimeMillis() / 1000.0, time.getWrappedTime().twsec, 1.0);
		Assert.assertEquals((short) 1, time.getWrappedTime().tcstatus);

		try {
			UTCTime.valueOf("1234567890");
			Assert.fail("Expected an IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			// PASS
		}
	}

	@Test
	public void utctime_toString() {
		UTCTime time = new UTCTime((short) 1, 0.0, 0.0);
		Assert.assertEquals("1970:01:01::00:00:00", time.toString());

		time = new UTCTime((short) 1, 1486749720.0, 0.123456);
		Assert.assertEquals("2017:02:10::18:02:00.123456", time.toString());

		time = UTCTime.valueOf("now");
		Assert.assertEquals("now", time.toString());
	}

	@Test
	public void utctime_compareTo() {
		UTCTime time1 = new UTCTime((short) 1, 2.0, 0.3);
		UTCTime time2 = new UTCTime((short) 1, 2.0, 0.4);
		UTCTime time3 = new UTCTime((short) 1, 3.0, 0.1);
		UTCTime time4Bad = new UTCTime((short) 0, 2.0, 0.3);
		Assert.assertEquals(0, time1.compareTo(time1));
		Assert.assertEquals(-1, time1.compareTo(time2));
		Assert.assertEquals(-1, time1.compareTo(time3));
		Assert.assertEquals(1, time1.compareTo(time4Bad));
		Assert.assertEquals(1, time2.compareTo(time1));
		Assert.assertEquals(0, time2.compareTo(time2));
		Assert.assertEquals(-1, time2.compareTo(time3));
		Assert.assertEquals(1, time2.compareTo(time4Bad));
		Assert.assertEquals(1, time3.compareTo(time1));
		Assert.assertEquals(1, time3.compareTo(time2));
		Assert.assertEquals(0, time3.compareTo(time3));
		Assert.assertEquals(1, time3.compareTo(time4Bad));
		Assert.assertEquals(-1, time4Bad.compareTo(time1));
		Assert.assertEquals(-1, time4Bad.compareTo(time2));
		Assert.assertEquals(-1, time4Bad.compareTo(time3));
		Assert.assertEquals(0, time4Bad.compareTo(time4Bad));

		UTCTime timeNow1 = UTCTime.valueOf("now");
		UTCTime timeNow2 = new UTCTimeNow();
		Assert.assertEquals(0, timeNow1.compareTo(timeNow2));
		Assert.assertTrue(timeNow1.compareTo(time1) > 0);
		Assert.assertTrue(time1.compareTo(timeNow1) < 0);
	}

	@Test
	public void utctime_equals() {
		UTCTime time1 = new UTCTime((short) 1, 2.0, 0.3);
		UTCTime time2 = new UTCTime((short) 1, 4.0, 0.5);
		UTCTime time3 = new UTCTime((short) 1, 2.0, 0.3);
		Assert.assertEquals(time1, time3);
		Assert.assertNotEquals(time1, time2);
		Assert.assertNotEquals(time1, new Object());

		UTCTime timeNow1 = UTCTime.valueOf("now");
		UTCTime timeNow2 = new UTCTimeNow();
		Assert.assertEquals(timeNow1, timeNow2);
		Assert.assertNotEquals(time1, timeNow1);
		Assert.assertNotEquals(timeNow1, new Object());
	}
}
