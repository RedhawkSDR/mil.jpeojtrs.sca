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

import java.math.BigInteger;
import java.util.Random;

import junit.framework.Assert;
import mil.jpeojtrs.sca.util.UnsignedUtils;

import org.junit.Test;

/**
 * 
 */
public class UnsignedUtilsTest {

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(short[])}.
	 */
	@Test
	public void testToSignedShortArray() {
		final int[] minSigned = UnsignedUtils.toSigned(new short[] {
			Short.MIN_VALUE
		});
		final int[] maxSigned = UnsignedUtils.toSigned(new short[] {
			Short.MAX_VALUE
		});
		Assert.assertTrue(minSigned[0] > 0);
		Assert.assertTrue(maxSigned[0] > 0);
		Assert.assertTrue(minSigned[0] > maxSigned[0]);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(short)}.
	 */
	@Test
	public void testToSignedShort() {
		final int minSigned = UnsignedUtils.toSigned(Short.MIN_VALUE);
		final int maxSigned = UnsignedUtils.toSigned(Short.MAX_VALUE);
		Assert.assertTrue(minSigned > 0);
		Assert.assertTrue(maxSigned > 0);
		Assert.assertTrue(minSigned > maxSigned);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toUnSigned(int)}.
	 */
	@Test
	public void testToUnSignedInt() {
		final int minSigned = UnsignedUtils.toSigned(Short.MIN_VALUE);
		final int maxSigned = UnsignedUtils.toSigned(Short.MAX_VALUE);
		Assert.assertEquals(Short.MIN_VALUE, UnsignedUtils.toUnsigned(minSigned));
		Assert.assertEquals(Short.MAX_VALUE, UnsignedUtils.toUnsigned(maxSigned));
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toUnSigned(int[])}.
	 */
	@Test
	public void testToUnSignedIntArray() {
		final int[] minSigned = UnsignedUtils.toSigned(new short[] {
			Short.MIN_VALUE
		});
		final int[] maxSigned = UnsignedUtils.toSigned(new short[] {
			Short.MAX_VALUE
		});
		Assert.assertEquals(Short.MIN_VALUE, UnsignedUtils.toUnsigned(minSigned)[0]);
		Assert.assertEquals(Short.MAX_VALUE, UnsignedUtils.toUnsigned(maxSigned)[0]);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(int)}.
	 */
	@Test
	public void testToSignedInt() {
		final long minSigned = UnsignedUtils.toSigned(Integer.MIN_VALUE);
		final long maxSigned = UnsignedUtils.toSigned(Integer.MAX_VALUE);
		Assert.assertTrue(minSigned > 0);
		Assert.assertTrue(maxSigned > 0);
		Assert.assertTrue(minSigned > maxSigned);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(int[])}.
	 */
	@Test
	public void testToSignedIntArray() {
		final long[] minSigned = UnsignedUtils.toSigned(new int[] {
			Integer.MIN_VALUE
		});
		final long[] maxSigned = UnsignedUtils.toSigned(new int[] {
			Integer.MAX_VALUE
		});
		Assert.assertTrue(minSigned[0] > 0);
		Assert.assertTrue(maxSigned[0] > 0);
		Assert.assertTrue(minSigned[0] > maxSigned[0]);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toUnSigned(long)}.
	 */
	@Test
	public void testToUnSignedLong() {
		final long minSigned = UnsignedUtils.toSigned(Integer.MIN_VALUE);
		final long maxSigned = UnsignedUtils.toSigned(Integer.MAX_VALUE);
		Assert.assertEquals(Integer.MIN_VALUE, UnsignedUtils.toUnsigned(minSigned));
		Assert.assertEquals(Integer.MAX_VALUE, UnsignedUtils.toUnsigned(maxSigned));
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toUnSigned(long)}.
	 */
	@Test
	public void testToUnSignedLongArray() {
		final long[] minSigned = UnsignedUtils.toSigned(new int[] {
			Integer.MIN_VALUE
		});
		final long[] maxSigned = UnsignedUtils.toSigned(new int[] {
			Integer.MAX_VALUE
		});
		Assert.assertEquals(Integer.MIN_VALUE, UnsignedUtils.toUnsigned(minSigned)[0]);
		Assert.assertEquals(Integer.MAX_VALUE, UnsignedUtils.toUnsigned(maxSigned)[0]);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(long)}.
	 */
	@Test
	public void testToSignedLong() {
		final BigInteger minSigned = UnsignedUtils.toSigned(Long.MIN_VALUE);
		final BigInteger maxSigned = UnsignedUtils.toSigned(Long.MAX_VALUE);
		Assert.assertTrue(minSigned.compareTo(BigInteger.ZERO) > 0);
		Assert.assertTrue(maxSigned.compareTo(BigInteger.ZERO) > 0);
		Assert.assertTrue(minSigned.compareTo(maxSigned) > 0);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(long[])}.
	 */
	@Test
	public void testToSignedLongArray() {
		final BigInteger[] minSigned = UnsignedUtils.toSigned(new long[] {
			Long.MIN_VALUE
		});
		final BigInteger[] maxSigned = UnsignedUtils.toSigned(new long[] {
			Long.MAX_VALUE
		});
		Assert.assertTrue(minSigned[0].compareTo(BigInteger.ZERO) > 0);
		Assert.assertTrue(maxSigned[0].compareTo(BigInteger.ZERO) > 0);
		Assert.assertTrue(minSigned[0].compareTo(maxSigned[0]) > 0);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toUnSigned(java.math.BigInteger)}.
	 */
	@Test
	public void testToUnSignedBigInteger() {
		final BigInteger minSigned = UnsignedUtils.toSigned(Long.MIN_VALUE);
		final BigInteger maxSigned = UnsignedUtils.toSigned(Long.MAX_VALUE);
		Assert.assertEquals(Long.MIN_VALUE, UnsignedUtils.toUnsigned(minSigned));
		Assert.assertEquals(Long.MAX_VALUE, UnsignedUtils.toUnsigned(maxSigned));
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toUnSigned(java.math.BigInteger[])}.
	 */
	@Test
	public void testToUnSignedBigIntegerArray() {
		final BigInteger[] minSigned = UnsignedUtils.toSigned(new long[] {
			Long.MIN_VALUE
		});
		final BigInteger[] maxSigned = UnsignedUtils.toSigned(new long[] {
			Long.MAX_VALUE
		});
		Assert.assertEquals(Long.MIN_VALUE, UnsignedUtils.toUnsigned(minSigned)[0]);
		Assert.assertEquals(Long.MAX_VALUE, UnsignedUtils.toUnsigned(maxSigned)[0]);
	}

	@Test
	public void randomTest() {
		final Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			final short value = (short) random.nextInt();
			final int signedValue = UnsignedUtils.toSigned(value);
			final short newValue = UnsignedUtils.toUnsigned(signedValue);
			Assert.assertEquals(value, newValue);
		}

		for (int i = 0; i < 1000; i++) {
			final short value = (short) random.nextInt();
			final int[] signedValue = UnsignedUtils.toSigned(new short[] {
				value
			});
			final short newValue = UnsignedUtils.toUnsigned(signedValue)[0];
			Assert.assertEquals(value, newValue);
		}

		for (int i = 0; i < 1000; i++) {
			final int value = random.nextInt();
			final long signedValue = UnsignedUtils.toSigned(value);
			final int newValue = UnsignedUtils.toUnsigned(signedValue);
			Assert.assertEquals(value, newValue);
		}

		for (int i = 0; i < 1000; i++) {
			final int value = random.nextInt();
			final long[] signedValue = UnsignedUtils.toSigned(new int[] {
				value
			});
			final int newValue = UnsignedUtils.toUnsigned(signedValue)[0];
			Assert.assertEquals(value, newValue);
		}

		for (int i = 0; i < 1000; i++) {
			final long value = random.nextLong();
			final BigInteger signedValue = UnsignedUtils.toSigned(value);
			final long newValue = UnsignedUtils.toUnsigned(signedValue);
			Assert.assertEquals(value, newValue);
		}

		for (int i = 0; i < 1000; i++) {
			final long value = random.nextLong();
			final BigInteger[] signedValue = UnsignedUtils.toSigned(new long[] {
				value
			});
			final long newValue = UnsignedUtils.toUnsigned(signedValue)[0];
			Assert.assertEquals(value, newValue);
		}
	}
}
