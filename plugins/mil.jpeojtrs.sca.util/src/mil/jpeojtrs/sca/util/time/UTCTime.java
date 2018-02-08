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

import java.io.Serializable;
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
 * <p/>
 * This class is serializable by {@link java.beans.XMLEncoder}, which is used for loading/saving property values for
 * launches.
 * @since 4.7
 */
public class UTCTime implements Comparable<UTCTime>, Serializable {

	protected static final String NOW = "now"; //$NON-NLS-1$
	private static final String DATE_TIME_PATTERN = "yyyy:MM:dd::HH:mm:ss"; //$NON-NLS-1$
	private static final String UTC_TIME_ZONE_ID = "UTC"; //$NON-NLS-1$

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

	public double getWholeSeconds() {
		return time.twsec;
	}

	public double getFractionalSeconds() {
		return time.tfsec;
	}

	/**
	 * @return The wrapped time object
	 */
	public CF.UTCTime getWrappedTime() {
		return time;
	}

	/**
	 * Sets the time object wrapped by this object.
	 * @param time
	 */
	public void setWrappedTime(CF.UTCTime time) {
		this.time = time;
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
		if (NOW.equals(value)) {
			return new UTCTimeNow();
		}

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
			dateFormat.applyPattern(DATE_TIME_PATTERN);
			dateFormat.setTimeZone(TimeZone.getTimeZone(UTC_TIME_ZONE_ID));
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
		dateFormat.applyPattern(DATE_TIME_PATTERN);
		dateFormat.setTimeZone(TimeZone.getTimeZone(UTC_TIME_ZONE_ID));
		dateFormat.format(date, sb, new FieldPosition(0));

		// Append fractional seconds, if any, up to 6 decimal places (".XXXXXX")
		String fractional = Double.toString(time.tfsec);
		if (!"0.0".equals(fractional)) { //$NON-NLS-1$
			sb.append(fractional, 1, Math.min(fractional.length(), 8));
		}

		return sb.toString();
	}

	@Override
	public int compareTo(UTCTime o) {
		// If the right side is a UTCTimeNow, call getWrappedTime to force a time update
		if (o instanceof UTCTimeNow) {
			o.getWrappedTime();
		}

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
			return compareTo(other) == 0;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Double.valueOf(time.twsec).hashCode() ^ Double.valueOf(time.tfsec).hashCode() ^ time.tcstatus;
	}
}
