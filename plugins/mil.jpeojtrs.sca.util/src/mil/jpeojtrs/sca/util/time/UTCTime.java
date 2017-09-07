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
package mil.jpeojtrs.sca.util.time;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;

import CF.UTCTimeHelper;
import CF.UTCTimeSequenceHelper;

/**
 * Wraps a {@link CF.UTCTime} object.
 * @since 4.6
 */
public class UTCTime implements Comparable<UTCTime> {

	private CF.UTCTime time;

	public UTCTime() {
		this.time = new CF.UTCTime();
	}

	public UTCTime(CF.UTCTime utcTime) {
		this.time = utcTime;
	}

	public UTCTime(short tcstatus, double twsec, double tfsec) {
		this.time = new CF.UTCTime(tcstatus, twsec, tfsec);
	}

	public short getStatus() {
		return time.tcstatus;
	}

	public void setStatus(short status) {
		time.tcstatus = status;
	}

	public double getWholeSeconds() {
		return time.twsec;
	}

	public void setWholeSeconds(double wholeSeconds) {
		time.twsec = wholeSeconds;
	}

	public double getFractionalSeconds() {
		return time.tfsec;
	}

	public void setFractionalSeconds(double fractionalSeconds) {
		time.tfsec = fractionalSeconds;
	}

	/**
	 * @return The wrapped time object
	 */
	public CF.UTCTime getWrappedTime() {
		return time;
	}

	public Any toAny() {
		Any any = JacorbUtil.init().create_any();
		UTCTimeHelper.insert(any, time);
		return any;
	}

	public static UTCTime valueOf(Any any) {
		return new UTCTime(UTCTimeHelper.extract(any));
	}

	public static UTCTime[] valueOfSequence(Any any) {
		CF.UTCTime[] cfTimes = UTCTimeSequenceHelper.extract(any);
		UTCTime[] times = new UTCTime[cfTimes.length];
		for (int index = 0; index < times.length; index++) {
			times[index] = new UTCTime(cfTimes[index]);
		}
		return times;
	}

	public static UTCTime valueOf(String value) {
		// Parse fractional seconds, if any
		int period = value.indexOf('.');
		double tfsec = 0.0;
		if (period != -1) {
			tfsec = Double.parseDouble(value.substring(period));
		} else {
			period = value.length();
		}

		// Parse date/time
		Date date;
		try {
			SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateTimeInstance();
			dateFormat.applyPattern("yyyy:MM:dd::HH:mm:ss");
			dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			date = dateFormat.parse(value.substring(0, period));
		} catch (ParseException e) {
			throw new IllegalArgumentException("Unable to parse date/time", e);
		}

		return new UTCTime(new CF.UTCTime((short) 1, date.getTime() / 1000, tfsec));
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		// Append date/time
		Date date = new Date((long) (time.twsec * 1000.0));
		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateTimeInstance();
		dateFormat.applyPattern("yyyy:MM:dd::HH:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		dateFormat.format(date, sb, new FieldPosition(0));

		// Append fractional seconds, if any, up to 6 decimal places (".XXXXXX")
		if (time.tfsec != 0.0) {
			String fractional = Double.toString(time.tfsec);
			sb.append(fractional, 1, Math.min(fractional.length(), 8));
		}

		return sb.toString();
	}

	@Override
	public int compareTo(UTCTime o) {
		int compare = Double.compare(time.twsec, o.time.twsec);
		if (compare != 0) {
			return compare;
		}
		compare = Double.compare(time.tfsec, o.time.tfsec);
		if (compare != 0) {
			return compare;
		}
		return time.tcstatus - o.time.tcstatus;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UTCTime) {
			UTCTime other = (UTCTime) obj;
			return time.twsec == other.time.twsec && time.tfsec == other.time.tfsec && time.tcstatus == other.time.tcstatus;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Double.valueOf(time.twsec).hashCode() ^ Double.valueOf(time.tfsec).hashCode() ^ time.tcstatus;
	}
}
