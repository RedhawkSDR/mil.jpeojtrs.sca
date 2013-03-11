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

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Utility class to convert between signed and unsigned type. <B>Note<B> probably only supports 32-bit systems. 
 * @since 3.0
 * 
 */
public final class UnsignedUtils {

	private static final short MAX_BYTE = 0xFF;
	private static final int MAX_USHORT = 0xFFFF;
	private static final long MAX_UINT = 0xFFFFFFFFL;

	private UnsignedUtils() {

	}

	public static int[] toSigned(final short[] ushort) {
		final int[] retVal = new int[ushort.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toSigned(ushort[i]);
		}
		return retVal;
	}

	public static short[] toUnsigned(final int[] ushort) {
		final short[] retVal = new short[ushort.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toUnsigned(ushort[i]);
		}
		return retVal;
	}

	public static long[] toSigned(final int[] uint) {
		final long[] retVal = new long[uint.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toSigned(uint[i]);
		}
		return retVal;
	}

	public static int[] toUnsigned(final long[] uint) {
		final int[] retVal = new int[uint.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toUnsigned(uint[i]);
		}
		return retVal;
	}

	public static BigInteger[] toSigned(final long[] ulong) {
		final BigInteger[] retVal = new BigInteger[ulong.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toSigned(ulong[i]);
		}
		return retVal;
	}

	public static long[] toUnsigned(final BigInteger[] ulong) {
		final long[] retVal = new long[ulong.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toUnsigned(ulong[i]);
		}
		return retVal;
	}

	/**
	 * @since 3.0
	 */
	public static short toSigned(final byte octet) {
		return (short) (UnsignedUtils.MAX_BYTE & octet);
	}

	/**
	 * @since 3.0
	 */
	public static short[] toSigned(final byte[] octet) {
		final short[] retVal = new short[octet.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toSigned(octet[i]);
		}
		return retVal;
	}

	public static int toSigned(final short ushort) {
		return UnsignedUtils.MAX_USHORT & ushort;
	}

	/**
	 * @since 3.0
	 */
	public static byte toUnsigned(final short octet) {
		return (byte) octet;
	}

	/**
	 * @since 3.0
	 */
	public static byte[] toUnsigned(final short[] octet) {
		final byte[] retVal = new byte[octet.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = UnsignedUtils.toUnsigned(octet[i]);
		}
		return retVal;
	}

	public static short toUnsigned(final int ushort) {
		return (short) ushort;
	}

	public static long toSigned(final int uint) {
		return UnsignedUtils.MAX_UINT & uint;
	}

	public static int toUnsigned(final long uint) {
		return (int) uint;
	}

	public static BigInteger toSigned(final long ulong) {
		final ByteArrayOutputStream array = new ByteArrayOutputStream();
		final DataOutputStream stream = new DataOutputStream(array);
		try {
			stream.writeLong(ulong);
			array.flush();
		} catch (final IOException e) {
			// PASS, will never happen
		} finally {
			try {
				array.close();
			} catch (final IOException e) {
				// PASS
			}
		}

		return new BigInteger(1, array.toByteArray());
	}

	public static long toUnsigned(final BigInteger ulong) {
		return ulong.longValue();
	}
}
