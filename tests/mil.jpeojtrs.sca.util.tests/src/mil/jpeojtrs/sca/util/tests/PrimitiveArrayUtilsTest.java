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

import junit.framework.Assert;
import mil.jpeojtrs.sca.util.PrimitiveArrayUtils;

import org.junit.Test;

public class PrimitiveArrayUtilsTest {

	private static final Object[] TEST_ARRAY = new Object[] {
	        (short) 12, (byte) 2, 15, 123151L, 123.561F, 12312.231e12
	};

	private static final byte[] BYTE_PRIM_ARRAY = new byte[] {
	        1, 2, 3, 4
	};
	private static final Byte[] BYTE_ARRAY = new Byte[] {
	        0, 1, 2, 3
	};

	private static final char[] CHAR_PRIM_ARRAY = new char[] {
	        1, 2, 3, 4
	};
	private static final Character[] CHAR_ARRAY = new Character[] {
	        0, 1, 2, 3
	};

	private static final short[] SHORT_PRIM_ARRAY = new short[] {
	        1, 2, 3, 4
	};
	private static final Short[] SHORT_ARRAY = new Short[] {
	        0, 1, 2, 3
	};

	private static final int[] INT_PRIM_ARRAY = new int[] {
	        1, 2, 3, 4
	};
	private static final Integer[] INT_ARRAY = new Integer[] {
	        0, 1, 2, 3
	};

	private static final long[] LONG_PRIM_ARRAY = new long[] {
	        1L, 2L, 3L, 4L
	};
	private static final Long[] LONG_ARRAY = new Long[] {
	        0L, 1L, 2L, 3L
	};

	private static final float[] FLOAT_PRIM_ARRAY = new float[] {
	        1F, 2F, 3F, 4F
	};
	private static final Float[] FLOAT_ARRAY = new Float[] {
	        0F, 1F, 2F, 3F
	};

	private static final double[] DOUBLE_PRIM_ARRAY = new double[] {
	        1D, 2D, 3D, 4D
	};
	private static final Double[] DOUBLE_ARRAY = new Double[] {
	        0D, 1D, 2D, 3D
	};

	private static final boolean[] BOOL_PRIM_ARRAY = new boolean[] {
	        false, true, false, true
	};
	private static final Boolean[] BOOL_ARRAY = new Boolean[] {
	        true, false, true, false
	};
	
	// Due to the constants we've placed throughout the file...
	// CHECKSTYLE:OFF

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToByteArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToByteArray() {
		Assert.assertNull(PrimitiveArrayUtils.convertToByteArray(null));
		byte[] convArray = PrimitiveArrayUtils.convertToByteArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertEquals((byte) 12, convArray[0]);
		Assert.assertEquals((byte) 2, convArray[1]);
		Assert.assertEquals((byte) 15, convArray[2]);
		Assert.assertEquals((byte) 123151, convArray[3]);
		Assert.assertEquals((byte) 123.561, convArray[4]);
		Assert.assertEquals((byte) 12312.231e12, convArray[5]);

		convArray = PrimitiveArrayUtils.convertToByteArray(PrimitiveArrayUtilsTest.BYTE_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.BYTE_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToByteArray(PrimitiveArrayUtilsTest.BYTE_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.BYTE_ARRAY.length, convArray.length);
		for (byte i = 0; i < convArray.length; ++i) {
			Assert.assertEquals(i, convArray[i]);
		}
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToCharArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToCharArray() {
		final Object[] testArray = new Object[] {
		        (short) 2, 'L'
		};
		Assert.assertNull(PrimitiveArrayUtils.convertToCharArray(null));
		char[] convArray = PrimitiveArrayUtils.convertToCharArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertEquals((char) 12, convArray[0]);
		Assert.assertEquals((char) 2, convArray[1]);
		Assert.assertEquals((char) 15, convArray[2]);
		Assert.assertEquals((char) new Integer(123151).byteValue(), convArray[3]);
		Assert.assertEquals((char) new Float(123.561).byteValue(), convArray[4]);
		Assert.assertEquals((char) new Double(12312.231e12).byteValue(), convArray[5]);

		convArray = PrimitiveArrayUtils.convertToCharArray(PrimitiveArrayUtilsTest.CHAR_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.CHAR_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToCharArray(PrimitiveArrayUtilsTest.CHAR_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.CHAR_ARRAY.length, convArray.length);
		for (char i = 0; i < convArray.length; ++i) {
			Assert.assertEquals(i, convArray[i]);
		}

		convArray = PrimitiveArrayUtils.convertToCharArray(testArray);
		Assert.assertEquals(testArray.length, convArray.length);
		Assert.assertEquals((short) 2, convArray[0]);
		Assert.assertEquals('L', convArray[1]);
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToShortArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToShortArray() {
		Assert.assertNull(PrimitiveArrayUtils.convertToShortArray(null));
		short[] convArray = PrimitiveArrayUtils.convertToShortArray(PrimitiveArrayUtilsTest.TEST_ARRAY);
		Assert.assertEquals((short) 12, convArray[0]);
		Assert.assertEquals((short) 2, convArray[1]);
		Assert.assertEquals((short) 15, convArray[2]);
		Assert.assertEquals((short) 123151, convArray[3]);
		Assert.assertEquals((short) 123.561, convArray[4]);
		Assert.assertEquals((short) 12312.231e12, convArray[5]);

		convArray = PrimitiveArrayUtils.convertToShortArray(PrimitiveArrayUtilsTest.SHORT_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.SHORT_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToShortArray(PrimitiveArrayUtilsTest.SHORT_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.SHORT_ARRAY.length, convArray.length);
		for (short i = 0; i < convArray.length; ++i) {
			Assert.assertEquals(i, convArray[i]);
		}
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToIntArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToIntArray() {
		Assert.assertNull(PrimitiveArrayUtils.convertToIntArray(null));
		int[] convArray = PrimitiveArrayUtils.convertToIntArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertEquals(12, convArray[0]);
		Assert.assertEquals(2, convArray[1]);
		Assert.assertEquals(15, convArray[2]);
		Assert.assertEquals(123151, convArray[3]);
		Assert.assertEquals((int) 123.561, convArray[4]);
		Assert.assertEquals((int) 12312.231e12, convArray[5]);

		convArray = PrimitiveArrayUtils.convertToIntArray(PrimitiveArrayUtilsTest.INT_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.INT_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToIntArray(PrimitiveArrayUtilsTest.INT_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.INT_ARRAY.length, convArray.length);
		for (int i = 0; i < convArray.length; ++i) {
			Assert.assertEquals(i, convArray[i]);
		}
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToLongArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToLongArray() {
		Assert.assertNull(PrimitiveArrayUtils.convertToLongArray(null));
		long[] convArray = PrimitiveArrayUtils.convertToLongArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertEquals(12L, convArray[0]);
		Assert.assertEquals(2L, convArray[1]);
		Assert.assertEquals(15L, convArray[2]);
		Assert.assertEquals(123151L, convArray[3]);
		Assert.assertEquals((long) 123.561, convArray[4]);
		Assert.assertEquals((long) 12312.231e12, convArray[5]);

		convArray = PrimitiveArrayUtils.convertToLongArray(PrimitiveArrayUtilsTest.LONG_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.LONG_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToLongArray(PrimitiveArrayUtilsTest.LONG_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.LONG_ARRAY.length, convArray.length);
		for (int i = 0; i < convArray.length; ++i) {
			Assert.assertEquals(i, convArray[i]);
		}
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToFloatArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToFloatArray() {
		Assert.assertNull(PrimitiveArrayUtils.convertToFloatArray(null));
		float[] convArray = PrimitiveArrayUtils.convertToFloatArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertEquals(12F, convArray[0]);
		Assert.assertEquals(2F, convArray[1]);
		Assert.assertEquals(15F, convArray[2]);
		Assert.assertEquals(123151F, convArray[3]);
		Assert.assertEquals(123.561F, convArray[4]);
		Assert.assertEquals((float) 12312.231e12, convArray[5]);

		convArray = PrimitiveArrayUtils.convertToFloatArray(PrimitiveArrayUtilsTest.FLOAT_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.FLOAT_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToFloatArray(PrimitiveArrayUtilsTest.FLOAT_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.FLOAT_ARRAY.length, convArray.length);
		for (int i = 0; i < convArray.length; ++i) {
			Assert.assertEquals((float) i, convArray[i]);
		}
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToDoubleArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToDoubleArray() {
		Assert.assertNull(PrimitiveArrayUtils.convertToDoubleArray(null));
		double[] convArray = PrimitiveArrayUtils.convertToDoubleArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertEquals(12D, convArray[0]);
		Assert.assertEquals(2D, convArray[1]);
		Assert.assertEquals(15D, convArray[2]);
		Assert.assertEquals(123151D, convArray[3]);
		// TODO This is a hack, the float version of 123.561 is 123.560997... Not sure what to do here
		Assert.assertEquals(new Float(123.561F).doubleValue(), convArray[4]);
		Assert.assertEquals(12312.231e12D, convArray[5]);

		convArray = PrimitiveArrayUtils.convertToDoubleArray(PrimitiveArrayUtilsTest.DOUBLE_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.DOUBLE_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToDoubleArray(PrimitiveArrayUtilsTest.DOUBLE_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.DOUBLE_ARRAY.length, convArray.length);
		for (int i = 0; i < convArray.length; ++i) {
			Assert.assertEquals((double) i, convArray[i]);
		}
	}

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.PrimitiveArrayUtils#convertToBooleanArray(java.lang.Object)}.
	 */
	@Test
	public void testConvertToBooleanArray() {
		final Object[] testArray = new Object[] {
		        (short) 2, false, 0
		};
		Assert.assertNull(PrimitiveArrayUtils.convertToBooleanArray(null));
		boolean[] convArray = PrimitiveArrayUtils.convertToBooleanArray(PrimitiveArrayUtilsTest.TEST_ARRAY);

		Assert.assertTrue(convArray[0]);
		Assert.assertTrue(convArray[1]);
		Assert.assertTrue(convArray[2]);
		Assert.assertTrue(convArray[3]);
		Assert.assertTrue(convArray[4]);
		Assert.assertTrue(convArray[5]);

		convArray = PrimitiveArrayUtils.convertToBooleanArray(PrimitiveArrayUtilsTest.BOOL_PRIM_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.BOOL_PRIM_ARRAY, convArray);

		convArray = PrimitiveArrayUtils.convertToBooleanArray(PrimitiveArrayUtilsTest.BOOL_ARRAY);
		Assert.assertEquals(PrimitiveArrayUtilsTest.BOOL_ARRAY.length, convArray.length);
		for (int i = 0; i < convArray.length; ++i) {
			Assert.assertEquals((i % 2 == 0), convArray[i]);
		}

		convArray = PrimitiveArrayUtils.convertToBooleanArray(testArray);
		Assert.assertEquals(testArray.length, convArray.length);
		Assert.assertTrue(convArray[0]);
		Assert.assertFalse(convArray[1]);
		Assert.assertFalse(convArray[2]);
	}
	
	// CHECKSTYLE:ON

}
