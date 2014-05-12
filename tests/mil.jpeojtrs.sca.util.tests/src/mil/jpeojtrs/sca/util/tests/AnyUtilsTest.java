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
import java.util.Arrays;

import junit.framework.Assert;
import mil.jpeojtrs.sca.util.AnyUtils;

import org.apache.commons.lang.ArrayUtils;
import org.jacorb.JacorbUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.DoubleSeqHelper;
import org.omg.CORBA.LongSeqHelper;
import org.omg.CORBA.StringSeqHelper;
import org.omg.CORBA.TCKind;

public class AnyUtilsTest {

	private String value;
	private String type;
	private Any any;

	@Before
	public void setUp() throws Exception {
		this.any = AnyUtils.toAny("true", "boolean");
	}

	@After
	public void tearDown() throws Exception {
		this.value = null;
		this.type = null;
	}

	@Test
	public void test_toAny() throws Exception {
		this.any = AnyUtils.toAny("Typecode Value", TCKind.tk_string);
		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals(TCKind.tk_string, this.any.type().kind());
		Assert.assertEquals("Typecode Value", this.any.extract_string());
	}

	@Test
	public void test_convertString() throws Exception {
		this.value = "true";
		this.type = "boolean";

		final Boolean result = (Boolean) AnyUtils.convertString(this.value, this.type);
		Assert.assertTrue(result);

		Assert.assertNull(AnyUtils.convertString(null, this.type));
		Object val = AnyUtils.convertString("REDHAWK", "string");
		Assert.assertTrue(val instanceof String);
		Assert.assertEquals("REDHAWK", (String) val);
		val = AnyUtils.convertString("KWAHDER", "wstring");
		Assert.assertTrue(val instanceof String);
		Assert.assertEquals("KWAHDER", (String) val);
		val = AnyUtils.convertString("K", "char");
		Assert.assertTrue(val instanceof Character);
		Assert.assertEquals('K', ((Character) val).charValue());
		val = AnyUtils.convertString("H", "wchar");
		Assert.assertTrue(val instanceof Character);
		Assert.assertEquals('H', ((Character) val).charValue());
		val = AnyUtils.convertString("1.0", "double");
		Assert.assertTrue(val instanceof Double);
		Assert.assertEquals(1.0, val);
		val = AnyUtils.convertString("1.0", "float");
		Assert.assertTrue(val instanceof Float);
		Assert.assertEquals(1.0F, val);
		val = AnyUtils.convertString("2", "short");
		Assert.assertTrue(val instanceof Short);
		Assert.assertEquals((short) 2, ((Short) val).shortValue());
		val = AnyUtils.convertString("4", "ushort");
		Assert.assertTrue(val instanceof Integer);
		Assert.assertEquals(4, ((Integer) val).intValue());
		val = AnyUtils.convertString(Integer.MAX_VALUE + "", "long");
		Assert.assertTrue(val instanceof Integer);
		Assert.assertEquals(Integer.MAX_VALUE, ((Integer) val).intValue());
		val = AnyUtils.convertString(Long.valueOf(2L * Integer.MAX_VALUE + 1L).toString(), "ulong");
		Assert.assertTrue(val instanceof Long);
		Assert.assertEquals(2L * Integer.MAX_VALUE + 1L, ((Long) val).longValue());
		val = AnyUtils.convertString(Long.MAX_VALUE + "", "longlong");
		Assert.assertTrue(val instanceof Long);
		Assert.assertEquals(Long.MAX_VALUE, ((Long) val).longValue());
		val = AnyUtils.convertString(Long.MAX_VALUE + "", "ulonglong");
		Assert.assertTrue(val instanceof BigInteger);
		Assert.assertEquals(Long.MAX_VALUE, ((BigInteger) val).longValue());
		val = AnyUtils.convertString(Byte.MAX_VALUE + "", "octet");
		Assert.assertTrue(val instanceof Short);
		Assert.assertEquals(Byte.MAX_VALUE, ((Short) val).byteValue());
	}

	@Test
	public void test_insertInto() {
		Assert.assertNull(AnyUtils.insertInto(null, null, TCKind.tk_boolean));
		Assert.assertNotNull(AnyUtils.insertInto(JacorbUtil.init().create_any(), null, TCKind.tk_boolean));
	}

	@Test
	public void test_convertAny() throws Exception {
		final Boolean result = (Boolean) AnyUtils.convertAny(this.any);

		Assert.assertTrue(result);

		Assert.assertNull(AnyUtils.convertAny(null));

		String str = (String) AnyUtils.convertAny(AnyUtils.toAny("2", TCKind.tk_string));
		Assert.assertEquals("2", str);
		str = (String) AnyUtils.convertAny(AnyUtils.toAny("3", TCKind.tk_wstring));
		Assert.assertEquals("3", str);
		final short b = (Short) AnyUtils.convertAny(AnyUtils.toAny(Byte.MAX_VALUE, TCKind.tk_octet));
		Assert.assertEquals(Byte.MAX_VALUE, b);
		char c = (Character) AnyUtils.convertAny(AnyUtils.toAny(Character.MAX_VALUE, TCKind.tk_char));
		Assert.assertEquals(Character.MAX_VALUE, c);
		c = (Character) AnyUtils.convertAny(AnyUtils.toAny(new Character('2'), TCKind.tk_wchar));
		Assert.assertEquals('2', c);
		final short s = (Short) AnyUtils.convertAny(AnyUtils.toAny(Short.MAX_VALUE, TCKind.tk_short));
		Assert.assertEquals(Short.MAX_VALUE, s);
		final int i = (Integer) AnyUtils.convertAny(AnyUtils.toAny(Integer.MAX_VALUE, TCKind.tk_long));
		Assert.assertEquals(Integer.MAX_VALUE, i);
		final long l = (Long) AnyUtils.convertAny(AnyUtils.toAny(Long.MAX_VALUE, TCKind.tk_longlong));
		Assert.assertEquals(Long.MAX_VALUE, l);
		final float f = (Float) AnyUtils.convertAny(AnyUtils.toAny(Float.MAX_VALUE, TCKind.tk_float));
		Assert.assertEquals(Float.MAX_VALUE, f);
		final double d = (Double) AnyUtils.convertAny(AnyUtils.toAny(Double.MAX_VALUE, TCKind.tk_double));
		Assert.assertEquals(Double.MAX_VALUE, d);
		final int us = (Integer) AnyUtils.convertAny(AnyUtils.toAny(Short.MAX_VALUE, TCKind.tk_ushort));
		Assert.assertEquals(Short.MAX_VALUE, us);
		final long ui = (Long) AnyUtils.convertAny(AnyUtils.toAny(Integer.MAX_VALUE, TCKind.tk_ulong));
		Assert.assertEquals(Integer.MAX_VALUE, ui);
		final BigInteger ul = (BigInteger) AnyUtils.convertAny(AnyUtils.toAny(Long.MAX_VALUE, TCKind.tk_ulonglong));
		Assert.assertEquals(Long.MAX_VALUE, ul.longValue());
		
		/** TODO Big Decimal not supported
		final BigDecimal fix = (BigDecimal) AnyUtils.convertAny(AnyUtils.toAny(new BigDecimal(1.0), TCKind.tk_fixed));
		Assert.assertEquals(1.0, fix.doubleValue());
		*/
		
		Any tmpAny = (Any) AnyUtils.convertAny(AnyUtils.toAny(AnyUtils.toAny(1, TCKind.tk_long), TCKind.tk_any));
		Assert.assertNotNull(tmpAny);
		Assert.assertEquals(1, tmpAny.extract_long());
		/** TODO Why do these not work in Jacorb? **/
//		tmpAny = (Any) AnyUtils.convertAny(AnyUtils.toAny(AnyUtils.toAny((short) 1, TCKind.tk_short), TCKind.tk_value));
//		Assert.assertNotNull(tmpAny);
//		Assert.assertEquals((short) 1, tmpAny.extract_short());
//		final TypeCode tmpType = (TypeCode) AnyUtils.convertAny(AnyUtils.toAny(tmpAny.type(), TCKind.tk_TypeCode));
//		Assert.assertNotNull(tmpType);
//		Assert.assertEquals(TCKind._tk_short, tmpType.kind().value());
//		final Object obj = AnyUtils.convertAny(null, tmpType);
//		Assert.assertNull(obj);
	}

	@Test
	public void test_convertToStringName() throws Exception {
		final TCKind tcKind = AnyUtils.convertToTCKind("value");

		Assert.assertEquals(TCKind.tk_value, tcKind);

		final String result = AnyUtils.convertToStringName(tcKind);

		Assert.assertNotNull(result);
	}

	@Test
	public void test_convertToTCKind() throws Exception {
		TCKind tcKind = AnyUtils.convertToTCKind("typecode");
		Assert.assertEquals(TCKind.tk_TypeCode, tcKind);
		tcKind = AnyUtils.convertToTCKind("boolean");
		Assert.assertEquals(TCKind.tk_boolean, tcKind);
		tcKind = AnyUtils.convertToTCKind("char");
		Assert.assertEquals(TCKind.tk_char, tcKind);
		tcKind = AnyUtils.convertToTCKind("double");
		Assert.assertEquals(TCKind.tk_double, tcKind);
		tcKind = AnyUtils.convertToTCKind("fixed");
		Assert.assertEquals(TCKind.tk_fixed, tcKind);
		tcKind = AnyUtils.convertToTCKind("float");
		Assert.assertEquals(TCKind.tk_float, tcKind);
		tcKind = AnyUtils.convertToTCKind("long");
		Assert.assertEquals(TCKind.tk_long, tcKind);
		tcKind = AnyUtils.convertToTCKind("longlong");
		Assert.assertEquals(TCKind.tk_longlong, tcKind);
		tcKind = AnyUtils.convertToTCKind("objref");
		Assert.assertEquals(TCKind.tk_objref, tcKind);
		tcKind = AnyUtils.convertToTCKind("octet");
		Assert.assertEquals(TCKind.tk_octet, tcKind);
		tcKind = AnyUtils.convertToTCKind("short");
		Assert.assertEquals(TCKind.tk_short, tcKind);
		tcKind = AnyUtils.convertToTCKind("string");
		Assert.assertEquals(TCKind.tk_string, tcKind);
		tcKind = AnyUtils.convertToTCKind("ulong");
		Assert.assertEquals(TCKind.tk_ulong, tcKind);
		tcKind = AnyUtils.convertToTCKind("ulonglong");
		Assert.assertEquals(TCKind.tk_ulonglong, tcKind);
		tcKind = AnyUtils.convertToTCKind("ushort");
		Assert.assertEquals(TCKind.tk_ushort, tcKind);
		tcKind = AnyUtils.convertToTCKind("value");
		Assert.assertEquals(TCKind.tk_value, tcKind);
		tcKind = AnyUtils.convertToTCKind("wchar");
		Assert.assertEquals(TCKind.tk_wchar, tcKind);
		tcKind = AnyUtils.convertToTCKind("wstring");
		Assert.assertEquals(TCKind.tk_wstring, tcKind);
	}

	@Test
	public void test_toAnyArray() throws Exception {
		final TCKind tcKind = TCKind.tk_string;

		this.any = AnyUtils.toAny(new String[] {
		        "Typecode Value", "Not Typecode Value"
		}, tcKind);

		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		final String[] arr = (String[]) AnyUtils.convertAny(this.any);
		Assert.assertEquals("Typecode Value", arr[0]);
		Assert.assertEquals("Not Typecode Value", arr[1]);
	}

	@Test
	public void test_toAnyWithObjectandString() throws Exception {
		this.any = AnyUtils.toAny("some value", "string");

		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals("some value", this.any.extract_string());
	}

	@Test
	public void test_stringToAny() throws Exception {
		this.any = AnyUtils.stringToAny("some value", "string");

		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals("some value", this.any.extract_string());
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_convertStringBAD() throws Exception {
		this.value = "true";
		this.type = "computer";
		AnyUtils.convertString(this.value, this.type);
	}

	public void test_convertAnyBAD() throws Exception {
		AnyUtils.convertAny(null);
	}

	@Test(expected = NullPointerException.class)
	public void test_convertToStringNameBAD() throws Exception {
		AnyUtils.convertToStringName(null);
	}

	@Test
	public void test_convertToTCKindBAD() throws Exception {
		try {
			AnyUtils.convertToTCKind(null);
		} catch (final NullPointerException e) {
			Assert.assertTrue(e instanceof NullPointerException);
		}

		try {
			AnyUtils.convertToTCKind("car");
		} catch (final IllegalArgumentException e) {
			Assert.assertTrue(e instanceof IllegalArgumentException);
		}
	}

	@Test(expected = BAD_OPERATION.class)
	public void test_toAnyBAD() throws Exception {
		final TCKind tcKind = null;
		final Any tmpAny = AnyUtils.toAny(null, tcKind);
		Assert.assertEquals(TCKind.tk_null, tmpAny.extract_TypeCode().kind());
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_toAnyWithObjectandStringv() throws Exception {
		AnyUtils.toAny("some value", "strings");
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_stringToAnyBAD() throws Exception {
		AnyUtils.stringToAny("some value", "strings");
	}

	@Test
	public void test_convertAnySequences() throws Exception {
		// Test Strings
		Object obj = null;
		Any theAny = JacorbUtil.init().create_any();

		final String[] stringInitialValue = new String[] {
		        "a", "b", "c"
		};
		StringSeqHelper.insert(theAny, stringInitialValue);
		final String[] stringExtractedValue = StringSeqHelper.extract(theAny);
		// Sanity Check
		Assert.assertTrue(Arrays.equals(stringInitialValue, stringExtractedValue));

		// The real test
		obj = AnyUtils.convertAny(theAny);
		Assert.assertTrue(obj instanceof String[]);
		Assert.assertTrue(Arrays.equals(stringInitialValue, (String[]) obj));

		// Test Doubles
		obj = null;
		theAny = JacorbUtil.init().create_any();

		final double[] doubleInitialValue = new double[] {
		        0.1, 0.2, 0.3
		};
		DoubleSeqHelper.insert(theAny, doubleInitialValue);
		final double[] doubleExtractedValue = DoubleSeqHelper.extract(theAny);
		// Sanity Check
		Assert.assertTrue(Arrays.equals(doubleInitialValue, doubleExtractedValue));

		// The real test
		obj = AnyUtils.convertAny(theAny);
		Assert.assertTrue(obj instanceof Double[]);
		Assert.assertTrue(Arrays.equals(ArrayUtils.toObject(doubleInitialValue), (Double[]) obj));

		// Test Integers
		obj = null;
		theAny = JacorbUtil.init().create_any();

		final int[] intInitialValue = new int[] {
		        1, 2, 3
		};
		LongSeqHelper.insert(theAny, intInitialValue);
		final int[] intExtractedValue = LongSeqHelper.extract(theAny);
		// Sanity Check
		Assert.assertTrue(Arrays.equals(intInitialValue, intExtractedValue));

		// The real test
		obj = AnyUtils.convertAny(theAny);
		Assert.assertTrue(obj instanceof Integer[]);
		Assert.assertTrue(Arrays.equals(ArrayUtils.toObject(intInitialValue), (Integer[]) obj));

		// Test Recursive Sequence
		obj = null;
		final Any[] theAnys = new Any[2];
		theAnys[0] = JacorbUtil.init().create_any();
		theAnys[1] = JacorbUtil.init().create_any();

		LongSeqHelper.insert(theAnys[0], intInitialValue);
		LongSeqHelper.insert(theAnys[1], intInitialValue);
		AnySeqHelper.insert(theAny, theAnys);

		// The real test
		obj = AnyUtils.convertAny(theAny);
		Assert.assertTrue(obj instanceof Any[]);
		int[] extractedIntArray = LongSeqHelper.extract(((Any[]) obj)[0]);
		Assert.assertTrue(Arrays.equals(intInitialValue, extractedIntArray));
		extractedIntArray = LongSeqHelper.extract(((Any[]) obj)[1]);
		Assert.assertTrue(Arrays.equals(intInitialValue, extractedIntArray));

		String[] str = (String[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new String[] {
		        "2", "3"
		}, TCKind.tk_string));
		Assert.assertEquals("2", str[0]);
		str = (String[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new String[] {
		        "3", "4"
		}, TCKind.tk_wstring));
		Assert.assertEquals("3", str[0]);
		final Boolean[] bool = (Boolean[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new boolean[] {
		        false, true
		}, TCKind.tk_boolean));
		Assert.assertTrue(bool[1].booleanValue());
		final Short[] b = (Short[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new byte[] {
		        Byte.MIN_VALUE, Byte.MAX_VALUE
		}, TCKind.tk_octet));
		Assert.assertEquals(Byte.MAX_VALUE, b[1].byteValue());
		Character[] c = (Character[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new char[] {
		        'r', 'h'
		}, TCKind.tk_char));
		Assert.assertEquals('h', c[1].charValue());
		c = (Character[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new Character[] {
		        '2', '3'
		}, TCKind.tk_wchar));
		Assert.assertEquals('2', c[0].charValue());
		final Short[] s = (Short[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new short[] {
		        Short.MIN_VALUE, Short.MAX_VALUE
		}, TCKind.tk_short));
		Assert.assertEquals(Short.MAX_VALUE, s[1].shortValue());
		final Integer[] i = (Integer[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new int[] {
		        Integer.MIN_VALUE, Integer.MAX_VALUE
		}, TCKind.tk_long));
		Assert.assertEquals(Integer.MAX_VALUE, i[1].intValue());
		final Long[] l = (Long[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new long[] {
		        Long.MIN_VALUE, Long.MAX_VALUE
		}, TCKind.tk_longlong));
		Assert.assertEquals(Long.MAX_VALUE, l[1].longValue());
		final Float[] f = (Float[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new float[] {
		        Float.MIN_VALUE, Float.MAX_VALUE
		}, TCKind.tk_float));
		Assert.assertEquals(Float.MAX_VALUE, f[1].floatValue());
		final Double[] d = (Double[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new double[] {
		        Double.MIN_VALUE, Double.MAX_VALUE
		}, TCKind.tk_double));
		Assert.assertEquals(Double.MAX_VALUE, d[1].doubleValue());
		final Integer[] us = (Integer[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new short[] {
		        Short.MIN_VALUE, Short.MAX_VALUE
		}, TCKind.tk_ushort));
		Assert.assertEquals(Short.MAX_VALUE, us[1].intValue());
		final Long[] ui = (Long[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new int[] {
		        Integer.MIN_VALUE, Integer.MAX_VALUE
		}, TCKind.tk_ulong));
		Assert.assertEquals(Integer.MAX_VALUE, ui[1].longValue());
		final BigInteger[] ul = (BigInteger[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new BigInteger[] {
		        new BigInteger("2"), new BigInteger("3")
		}, TCKind.tk_ulonglong));
		Assert.assertEquals(3L, ul[1].longValue());
		final Any[] tmpAny = (Any[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new Any[] {
		        AnyUtils.toAny(1, TCKind.tk_long), AnyUtils.toAny(2, TCKind.tk_long)
		}, TCKind.tk_any));
		Assert.assertNotNull(tmpAny);
		Assert.assertEquals(1, tmpAny[0].extract_long());
		//		Object obj = AnyUtils.convertAny(null, type);
		//		Assert.assertNull(obj);

	}

	@Test
	public void test_compareAnys() {
		final Any trueBool = AnyUtils.toAny(true, TCKind.tk_boolean);
		final Any falseBool = AnyUtils.toAny(false, TCKind.tk_boolean);
		final Any twoString = AnyUtils.toAny("2", TCKind.tk_string);
		final Any threeString = AnyUtils.toAny("3", TCKind.tk_string);
		final Any twoWString = AnyUtils.toAny("2", TCKind.tk_wstring);
		final Any threeWString = AnyUtils.toAny("3", TCKind.tk_wstring);
		final Any twoByte = AnyUtils.toAny((byte) 2, TCKind.tk_octet);
		final Any threeByte = AnyUtils.toAny((byte) 3, TCKind.tk_octet);
		final Any twoChar = AnyUtils.toAny('2', TCKind.tk_char);
		final Any threeChar = AnyUtils.toAny('3', TCKind.tk_char);
		final Any twoWChar = AnyUtils.toAny('2', TCKind.tk_wchar);
		final Any threeWChar = AnyUtils.toAny('3', TCKind.tk_wchar);
		final Any tooShort = AnyUtils.toAny((short) 2, TCKind.tk_short);
		final Any threeShort = AnyUtils.toAny((short) 3, TCKind.tk_short);
		final Any twoLong = AnyUtils.toAny(2, TCKind.tk_long);
		final Any threeLong = AnyUtils.toAny(3, TCKind.tk_long);
		final Any twoLongLong = AnyUtils.toAny(2L, TCKind.tk_longlong);
		final Any threeLongLong = AnyUtils.toAny(3L, TCKind.tk_longlong);
		final Any twoFloat = AnyUtils.toAny(2.0F, TCKind.tk_float);
		final Any threeFloat = AnyUtils.toAny(3.0F, TCKind.tk_float);
		final Any twoDouble = AnyUtils.toAny(2.0D, TCKind.tk_double);
		final Any threeDouble = AnyUtils.toAny(3.0D, TCKind.tk_double);
		final Any twoUshort = AnyUtils.toAny((short) 2, TCKind.tk_ushort);
		final Any threeUshort = AnyUtils.toAny((short) 3, TCKind.tk_ushort);
		final Any twoUlong = AnyUtils.toAny(2, TCKind.tk_ulong);
		final Any threeUlong = AnyUtils.toAny(3, TCKind.tk_ulong);
		final Any twoUlonglong = AnyUtils.toAny(2L, TCKind.tk_ulonglong);
		final Any threeUlonglong = AnyUtils.toAny(3L, TCKind.tk_ulonglong);

		Assert.assertTrue(AnyUtils.compareAnys(trueBool, falseBool, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(trueBool, falseBool, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(trueBool, trueBool, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(trueBool, falseBool, "gt"));
		Assert.assertFalse(AnyUtils.compareAnys(trueBool, falseBool, "lt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoString, threeString, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoString, threeString, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoString, twoString, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoString, threeString, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoString, threeString, "gt"));
		Assert.assertTrue(AnyUtils.compareAnys(twoString, threeString, "le"));
		Assert.assertFalse(AnyUtils.compareAnys(twoString, threeString, "ge"));
		Assert.assertTrue(AnyUtils.compareAnys(twoString, twoString, "ge"));

		Assert.assertTrue(AnyUtils.compareAnys(twoWString, threeWString, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoWString, threeWString, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoWString, twoWString, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoWString, threeWString, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoWString, threeWString, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoByte, threeByte, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoByte, threeByte, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoByte, twoByte, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoByte, threeByte, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoByte, threeByte, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoChar, threeChar, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoChar, threeChar, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoChar, twoChar, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoChar, threeChar, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoChar, threeChar, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoWChar, threeWChar, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoWChar, threeWChar, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoWChar, twoWChar, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoWChar, threeWChar, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoWChar, threeWChar, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(tooShort, threeShort, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(tooShort, threeShort, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(tooShort, tooShort, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(tooShort, threeShort, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(tooShort, threeShort, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoLong, threeLong, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoLong, threeLong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoLong, twoLong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoLong, threeLong, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoLong, threeLong, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoLongLong, threeLongLong, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoLongLong, threeLongLong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoLongLong, twoLongLong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoLongLong, threeLongLong, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoLongLong, threeLongLong, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoFloat, threeFloat, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoFloat, threeFloat, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoFloat, twoFloat, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoFloat, threeFloat, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoFloat, threeFloat, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoDouble, threeDouble, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoDouble, threeDouble, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoDouble, twoDouble, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoDouble, threeDouble, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoDouble, threeDouble, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoUshort, threeUshort, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoUshort, threeUshort, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoUshort, twoUshort, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoUshort, threeUshort, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoUshort, threeUshort, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoUlong, threeUlong, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoUlong, threeUlong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoUlong, twoUlong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoUlong, threeUlong, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoUlong, threeUlong, "gt"));

		Assert.assertTrue(AnyUtils.compareAnys(twoUlonglong, threeUlonglong, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoUlonglong, threeUlonglong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoUlonglong, twoUlonglong, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoUlonglong, threeUlonglong, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoUlonglong, threeUlonglong, "gt"));

		/** TODO Not supported
		final Any twoFixed = AnyUtils.toAny(new BigDecimal(2.0), TCKind.tk_fixed);
		final Any threeFixed = AnyUtils.toAny(new BigDecimal(3.0), TCKind.tk_fixed);
		Assert.assertTrue(AnyUtils.compareAnys(twoFixed, threeFixed, "ne"));
		Assert.assertFalse(AnyUtils.compareAnys(twoFixed, threeFixed, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoFixed, twoFixed, "eq"));
		Assert.assertTrue(AnyUtils.compareAnys(twoFixed, threeFixed, "lt"));
		Assert.assertFalse(AnyUtils.compareAnys(twoFixed, threeFixed, "gt"));
		*/
	}

}
