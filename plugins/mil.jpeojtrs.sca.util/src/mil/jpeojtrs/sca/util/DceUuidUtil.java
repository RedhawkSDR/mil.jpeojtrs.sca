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
package mil.jpeojtrs.sca.util;

import java.util.UUID;

/**
 * The Class DceUuidUtil.
 */
public final class DceUuidUtil {
	
	/**
	 * @since 3.0
	 * @deprecated Use {@link #DCE_UUID_LENGTH} instead
	 */
	@Deprecated
	public static final int LENGTH = DceUuidUtil.createDceUUID().length();

	/**
	 * @since 3.0
	 */
	public static final int DCE_UUID_LENGTH = DceUuidUtil.createDceUUID().length();

	/** The Constant DCE_PREFIX. */
	private static final String DCE_PREFIX = "DCE";
	private static final int MAX_NUMBER_SECTIONS = 3;
	private static final int MIN_NUMBER_SECTIONS = 2;


	/**
	 * Instantiates a new dce uuid util.
	 */
	private DceUuidUtil() {

	}

	/**
	 * Creates a dce uuid.
	 * 
	 * @param uid the uid
	 * 
	 * @return the string
	 */
	public static String createDceUUID(final UUID uid) {
		if (uid == null) {
			throw new IllegalArgumentException("UUID can not be null");
		}

		return DceUuidUtil.createDceUUID(uid, null);
	}

	/**
	 * Creates a dce uuid.
	 * 
	 * @param uid the uid
	 * @param version the version
	 * 
	 * @return the string
	 */
	public static String createDceUUID(final UUID uid, final Integer version) {
		if (uid == null) {
			throw new IllegalArgumentException("Uid can not be null");
		}

		return DceUuidUtil.DCE_PREFIX + ":" + uid.toString() + ((version != null) ? ":" + version : ""); // SUPPRESS CHECKSTYLE AvoidInLine
	}

	/**
	 * Creates a dce uuid.
	 * 
	 * @return the string
	 */
	public static String createDceUUID() {
		return DceUuidUtil.createDceUUID(UUID.randomUUID());
	}

	/**
	 * Sets the version.
	 * 
	 * @param dceUid the dce uid
	 * @param version the version
	 * 
	 * @return the string
	 */
	public static String setVersion(final String dceUid, final int version) {
		if (!DceUuidUtil.isValid(dceUid)) {
			throw new IllegalArgumentException("Invalid DCE UID");
		}
		final String[] split = dceUid.split(":");
		return DceUuidUtil.DCE_PREFIX + ":" + split[1] + ":" + version;
	}

	/**
	 * Gets the version.
	 * 
	 * @param dceUid the dce uid
	 * 
	 * @return the version
	 */
	public static Integer getVersion(final String dceUid) {
		if (!DceUuidUtil.isValid(dceUid)) {
			throw new IllegalArgumentException("Invalid DCE UID");
		}
		final String[] split = dceUid.split(":");
		if (split.length == DceUuidUtil.MAX_NUMBER_SECTIONS) {
			return Integer.valueOf(split[2]);
		} else {
			return null;
		}
	}

	/**
	 * Checks if is valid.
	 * 
	 * @param dceUid the dce uid
	 * 
	 * @return true, if is valid
	 */
	public static boolean isValid(final String dceUid) {
		if (dceUid == null) {
			return false;
		}
		if (!dceUid.startsWith(DceUuidUtil.DCE_PREFIX)) {
			return false;
		}
		final String[] split = dceUid.split(":");
		if (split.length >= DceUuidUtil.MIN_NUMBER_SECTIONS && split.length <= DceUuidUtil.MAX_NUMBER_SECTIONS) {
			try {
				UUID.fromString(split[1]);
				if (split.length == DceUuidUtil.MAX_NUMBER_SECTIONS) {
					Integer.valueOf(split[2]);
				}
				return true;
			} catch (final IllegalArgumentException e) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Removes a DCE prefix from the string, if any. Example:
	 * <p/>
	 * <code>trimPrefix("DCE:12345678-90ab-cdef-0123-456789abcdef:foo")</code>
	 * <p/>
	 * Would yield:
	 * <p/>
	 * <code>"foo"</code>
	 * @param str The string to check
	 * @return The string without any prefix if it was found
	 * @since 4.6
	 */
	public static String trimPrefix(String str) {
		if (str == null) {
			return null;
		}
		final String[] split = str.split(":");
		if (split.length < 3) {
			return str;
		}
		if (!DCE_PREFIX.equals(split[0])) {
			return str;
		}
		try {
			UUID.fromString(split[1]);
		} catch (IllegalArgumentException e) {
			return str;
		}
		return str.substring(DCE_UUID_LENGTH + 1);
	}
}
