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

import java.util.Calendar;
import java.util.TimeZone;

import org.omg.CORBA.Any;

/**
 * Represents the current time, i.e. when the string value "now" is used for a utctime property. All instances are
 * considered to be equivalent. When the object must be compared to another non-"now" time, converted to an
 * {@link Any}, etc, the current time as of the method call will be used.
 * <p/>
 * This class is serializable by {@link java.beans.XMLEncoder}, which is used for loading/saving property values for
 * launches.
 * @since 4.7
 */
public class UTCTimeNow extends UTCTime {

	public UTCTimeNow() {
	}

	private void updateTimeToNow() {
		long timeMillis = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
		setWrappedTime(new CF.UTCTime((short) 1, timeMillis / 1000, (timeMillis % 1000) / 1000.0));
	}

	@Override
	public CF.UTCTime getWrappedTime() {
		// Set the wrapped time to the current time before returning it
		updateTimeToNow();
		return super.getWrappedTime();
	}

	@Override
	public Any toAny() {
		// Set time to current time and produce the Any
		updateTimeToNow();
		return super.toAny();
	}

	@Override
	public String toString() {
		return NOW;
	}

	@Override
	public int compareTo(UTCTime o) {
		if (o instanceof UTCTimeNow) {
			return 0;
		}

		// Set time to current time and compare
		updateTimeToNow();
		return super.compareTo(o);
	}

	public boolean equals(Object obj) {
		return obj instanceof UTCTimeNow;
	}

	@Override
	public int hashCode() {
		// All instances are equivalent, so hash codes must be too
		return 1;
	}
}
