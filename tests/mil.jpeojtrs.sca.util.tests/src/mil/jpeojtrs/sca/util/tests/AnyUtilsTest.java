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

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;
import org.jacorb.JacorbUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.DoubleSeqHelper;
import org.omg.CORBA.LongSeqHelper;
import org.omg.CORBA.StringSeqHelper;
import org.omg.CORBA.TCKind;

import mil.jpeojtrs.sca.util.AnyUtils;
import mil.jpeojtrs.sca.util.math.ComplexBoolean;
import mil.jpeojtrs.sca.util.math.ComplexByte;
import mil.jpeojtrs.sca.util.math.ComplexDouble;
import mil.jpeojtrs.sca.util.math.ComplexFloat;
import mil.jpeojtrs.sca.util.math.ComplexLong;
import mil.jpeojtrs.sca.util.math.ComplexLongLong;
import mil.jpeojtrs.sca.util.math.ComplexNumber;
import mil.jpeojtrs.sca.util.math.ComplexShort;
import mil.jpeojtrs.sca.util.math.ComplexUByte;
import mil.jpeojtrs.sca.util.math.ComplexULong;
import mil.jpeojtrs.sca.util.math.ComplexULongLong;
import mil.jpeojtrs.sca.util.math.ComplexUShort;

public class AnyUtilsTest {

	private String value;
	private String type;
	private Any any;

	@Before
	public void setUp() throws Exception {
		this.any = AnyUtils.toAny("true", "boolean", false);
	}

	@After
	public void tearDown() throws Exception {
		this.value = null;
		this.type = null;
	}

	@Test
	public void test_toAny() throws Exception {
		this.any = AnyUtils.toAny("Typecode Value", TCKind.tk_string, false);
		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals(TCKind.tk_string, this.any.type().kind());
		Assert.assertEquals("Typecode Value", this.any.extract_string());
		
		this.any = AnyUtils.toAny(null, TCKind.tk_null, false);
		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals(TCKind.tk_null, this.any.type().kind());
		
		this.any = AnyUtils.toAny(8.8, TCKind.tk_null, false);
		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals(TCKind.tk_null, this.any.type().kind());
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

	
	/**
	 * @deprecated Test deprecated
	 */
	@Test
	@Deprecated
	public void test_insertInto() {
		Assert.assertNull(AnyUtils.insertInto(null, null, TCKind.tk_boolean));
		Assert.assertNotNull(AnyUtils.insertInto(JacorbUtil.init().create_any(), null, TCKind.tk_boolean));
	}

	@Test
	public void test_convertAny() throws Exception {
		final Boolean result = (Boolean) AnyUtils.convertAny(this.any);

		Assert.assertTrue(result);

		Assert.assertNull(AnyUtils.convertAny(null));

		String str = (String) AnyUtils.convertAny(AnyUtils.toAny("2", TCKind.tk_string, false));
		Assert.assertEquals("2", str);
		str = (String) AnyUtils.convertAny(AnyUtils.toAny("3", TCKind.tk_wstring, false));
		Assert.assertEquals("3", str);
		final short b = (Short) AnyUtils.convertAny(AnyUtils.toAny(Byte.MAX_VALUE, TCKind.tk_octet, false));
		Assert.assertEquals(Byte.MAX_VALUE, b);
		char c = (Character) AnyUtils.convertAny(AnyUtils.toAny(Character.MAX_VALUE, TCKind.tk_char, false));
		Assert.assertEquals(Character.MAX_VALUE, c);
		c = (Character) AnyUtils.convertAny(AnyUtils.toAny(new Character('2'), TCKind.tk_wchar, false));
		Assert.assertEquals('2', c);
		final short s = (Short) AnyUtils.convertAny(AnyUtils.toAny(Short.MAX_VALUE, TCKind.tk_short, false));
		Assert.assertEquals(Short.MAX_VALUE, s);
		final int i = (Integer) AnyUtils.convertAny(AnyUtils.toAny(Integer.MAX_VALUE, TCKind.tk_long, false));
		Assert.assertEquals(Integer.MAX_VALUE, i);
		final long l = (Long) AnyUtils.convertAny(AnyUtils.toAny(Long.MAX_VALUE, TCKind.tk_longlong, false));
		Assert.assertEquals(Long.MAX_VALUE, l);
		final float f = (Float) AnyUtils.convertAny(AnyUtils.toAny(Float.MAX_VALUE, TCKind.tk_float, false));
		Assert.assertEquals(Float.MAX_VALUE, f, 0.00001);
		final double d = (Double) AnyUtils.convertAny(AnyUtils.toAny(Double.MAX_VALUE, TCKind.tk_double, false));
		Assert.assertEquals(Double.MAX_VALUE, d, 0.00001);
		final int us = (Integer) AnyUtils.convertAny(AnyUtils.toAny(Short.MAX_VALUE, TCKind.tk_ushort, false));
		Assert.assertEquals(Short.MAX_VALUE, us);
		final long ui = (Long) AnyUtils.convertAny(AnyUtils.toAny(Integer.MAX_VALUE, TCKind.tk_ulong, false));
		Assert.assertEquals(Integer.MAX_VALUE, ui);
		final BigInteger ul = (BigInteger) AnyUtils.convertAny(AnyUtils.toAny(Long.MAX_VALUE, TCKind.tk_ulonglong, false));
		Assert.assertEquals(Long.MAX_VALUE, ul.longValue());
		
		/** TODO Big Decimal not supported
		final BigDecimal fix = (BigDecimal) AnyUtils.convertAny(AnyUtils.toAny(new BigDecimal(1.0), TCKind.tk_fixed));
		Assert.assertEquals(1.0, fix.doubleValue(), 0.00001);
		*/
		
		Any tmpAny = (Any) AnyUtils.convertAny(AnyUtils.toAny(AnyUtils.toAny(1, TCKind.tk_long, false), TCKind.tk_any, false));
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
	public void test_toAnyWithObjectandString() throws Exception {
		this.any = AnyUtils.toAny("some value", "string", false);

		Assert.assertNotNull(this.any);
		Assert.assertTrue(this.any instanceof Any);
		Assert.assertEquals("some value", this.any.extract_string());
	}

	@Test
	public void test_stringToAny() throws Exception {
		this.any = AnyUtils.stringToAny("some value", "string", false);

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
		final Any tmpAny = AnyUtils.toAny(null, tcKind, false);
		Assert.assertEquals(TCKind.tk_null, tmpAny.extract_TypeCode().kind());
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_toAnyWithObjectandStringv() throws Exception {
		AnyUtils.toAny("some value", "strings", false);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_stringToAnyBAD() throws Exception {
		AnyUtils.stringToAny("some value", "strings", false);
	}

	@Test
	public void complexBoolean_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "boolean", true);

		CF.complexBoolean[] complexBool = new CF.complexBoolean[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexBooleanSeqHelper.insert(corbaAny, complexBool);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexBoolean_sequence() throws Exception {
		Object[] cValue = new ComplexBoolean[] { new ComplexBoolean(true, false), new ComplexBoolean(false, true) };
		Any ourAny = AnyUtils.toAny(cValue, "boolean", true);

		CF.complexBoolean[] complexBool = new CF.complexBoolean[] { new CF.complexBoolean(true, false), new CF.complexBoolean(false, true) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexBooleanSeqHelper.insert(corbaAny, complexBool);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexOctet_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "octet", true);

		CF.complexOctet[] complexOctet = new CF.complexOctet[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexOctetSeqHelper.insert(corbaAny, complexOctet);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexOctet_sequence() throws Exception {
		Object[] cValue = new ComplexByte[] { new ComplexByte((byte) 1, (byte) 2), new ComplexByte((byte) 3, (byte) 4) };
		Any ourAny = AnyUtils.toAny(cValue, "octet", true);

		CF.complexOctet[] complexOctet = new CF.complexOctet[] { new CF.complexOctet((byte) 1, (byte) 2), new CF.complexOctet((byte) 3, (byte) 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexOctetSeqHelper.insert(corbaAny, complexOctet);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexDouble_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "double", true);

		CF.complexDouble[] complexDouble = new CF.complexDouble[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexDoubleSeqHelper.insert(corbaAny, complexDouble);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexDouble_sequence() throws Exception {
		Object[] cValue = new ComplexDouble[] { new ComplexDouble(1.2, 3.4), new ComplexDouble(5.6, 7.8) };
		Any ourAny = AnyUtils.toAny(cValue, "double", true);

		CF.complexDouble[] complexDouble = new CF.complexDouble[] { new CF.complexDouble(1.2, 3.4), new CF.complexDouble(5.6, 7.8) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexDoubleSeqHelper.insert(corbaAny, complexDouble);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexFloat_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "float", true);

		CF.complexFloat[] complexFloat = new CF.complexFloat[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexFloatSeqHelper.insert(corbaAny, complexFloat);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexFloat_sequence() throws Exception {
		Object[] cValue = new ComplexFloat[] { new ComplexFloat(1.2f, 3.4f), new ComplexFloat(5.6f, 7.8f) };
		Any ourAny = AnyUtils.toAny(cValue, "float", true);

		CF.complexFloat[] complexFloat = new CF.complexFloat[] { new CF.complexFloat(1.2f, 3.4f), new CF.complexFloat(5.6f, 7.8f) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexFloatSeqHelper.insert(corbaAny, complexFloat);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexLong_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "long", true);

		CF.complexLong[] complexLong = new CF.complexLong[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexLongSeqHelper.insert(corbaAny, complexLong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexLong_sequence() throws Exception {
		Object[] cValue = new ComplexLong[] { new ComplexLong(1, 2), new ComplexLong(3, 4) };
		Any ourAny = AnyUtils.toAny(cValue, "long", true);

		CF.complexLong[] complexLong = new CF.complexLong[] { new CF.complexLong(1, 2), new CF.complexLong(3, 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexLongSeqHelper.insert(corbaAny, complexLong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexLongLong_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "longlong", true);

		CF.complexLongLong[] complexLongLong = new CF.complexLongLong[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexLongLongSeqHelper.insert(corbaAny, complexLongLong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexLongLong_sequence() throws Exception {
		Object[] cValue = new ComplexLongLong[] { new ComplexLongLong(1L, 2L), new ComplexLongLong(3L, 4L) };
		Any ourAny = AnyUtils.toAny(cValue, "longlong", true);

		CF.complexLongLong[] complexLongLong = new CF.complexLongLong[] { new CF.complexLongLong(1L, 2L), new CF.complexLongLong(3L, 4L) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexLongLongSeqHelper.insert(corbaAny, complexLongLong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexShort_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "short", true);

		CF.complexShort[] complexShort = new CF.complexShort[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexShortSeqHelper.insert(corbaAny, complexShort);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexShort_sequence() throws Exception {
		Object[] cValue = new ComplexShort[] { new ComplexShort((short) 1, (short) 2), new ComplexShort((short) 3, (short) 4) };
		Any ourAny = AnyUtils.toAny(cValue, "short", true);

		CF.complexShort[] complexShort = new CF.complexShort[] { new CF.complexShort((short) 1, (short) 2), new CF.complexShort((short) 3, (short) 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexShortSeqHelper.insert(corbaAny, complexShort);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexChar_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "char", true);

		CF.complexChar[] complexChar = new CF.complexChar[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexCharSeqHelper.insert(corbaAny, complexChar);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexChar_sequence() throws Exception {
		Object[] cValue = new ComplexUByte[] { new ComplexUByte((short) 1, (short) 2), new ComplexUByte((short) 3, (short) 4) };
		Any ourAny = AnyUtils.toAny(cValue, "char", true);

		CF.complexChar[] complexChar = new CF.complexChar[] { new CF.complexChar((char) 1, (char) 2), new CF.complexChar((char) 3, (char) 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexCharSeqHelper.insert(corbaAny, complexChar);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexULong_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "ulong", true);

		CF.complexULong[] complexULong = new CF.complexULong[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexULongSeqHelper.insert(corbaAny, complexULong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexULong_sequence() throws Exception {
		Object[] cValue = new ComplexULong[] { new ComplexULong(1L, 2L), new ComplexULong(3L, 4L) };
		Any ourAny = AnyUtils.toAny(cValue, "ulong", true);

		CF.complexULong[] complexULong = new CF.complexULong[] { new CF.complexULong(1, 2), new CF.complexULong(3, 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexULongSeqHelper.insert(corbaAny, complexULong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexULongLong_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "ulonglong", true);

		CF.complexULongLong[] complexULongLong = new CF.complexULongLong[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexULongLongSeqHelper.insert(corbaAny, complexULongLong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexULongLong_sequence() throws Exception {
		Object[] cValue = new ComplexULongLong[] { new ComplexULongLong(new BigInteger("1"), new BigInteger("2")), new ComplexULongLong(new BigInteger("3"), new BigInteger("4")) };
		Any ourAny = AnyUtils.toAny(cValue, "ulonglong", true);

		CF.complexULongLong[] complexULongLong = new CF.complexULongLong[] { new CF.complexULongLong(1, 2), new CF.complexULongLong(3, 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexULongLongSeqHelper.insert(corbaAny, complexULongLong);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void complexUShort_empty_sequence() {
		Any ourAny = AnyUtils.toAny(new Object[0], "ushort", true);

		CF.complexUShort[] complexUShort = new CF.complexUShort[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexUShortSeqHelper.insert(corbaAny, complexUShort);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(newValue.getClass().isArray());
		Assert.assertEquals(0, Array.getLength(newValue));
	}

	@Test
	public void complexUShort_sequence() throws Exception {
		Object[] cValue = new ComplexUShort[] { new ComplexUShort(1, 2), new ComplexUShort(3, 4) };
		Any ourAny = AnyUtils.toAny(cValue, "ushort", true);

		CF.complexUShort[] complexUShort = new CF.complexUShort[] { new CF.complexUShort((short) 1, (short) 2), new CF.complexUShort((short) 3, (short) 4) };
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexUShortSeqHelper.insert(corbaAny, complexUShort);

		Object newValue = AnyUtils.convertAny(ourAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
		newValue = AnyUtils.convertAny(corbaAny);
		Assert.assertTrue(Arrays.deepEquals(cValue, (Object[]) newValue));
	}

	@Test
	public void test_complex() throws Exception {
		ComplexNumber cValue = new ComplexBoolean();
		Any tmpAny = cValue.toAny();
		Object newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexByte();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexDouble();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexFloat();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexLong();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexLongLong();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexShort();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexUByte();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexULong();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexULongLong();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);

		cValue = new ComplexUShort();
		tmpAny = cValue.toAny();
		newValue = AnyUtils.convertAny(tmpAny);
		Assert.assertEquals(cValue, newValue);
	}

	@Test
	public void test_convertAnySequences() throws Exception {
		// Test Strings
		Object obj = null;
		Any theAny = JacorbUtil.init().create_any();

		final String[] stringInitialValue = new String[] { "a", "b", "c" };
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

		final double[] doubleInitialValue = new double[] { 0.1, 0.2, 0.3 };
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

		final int[] intInitialValue = new int[] { 1, 2, 3 };
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
		Assert.assertTrue(obj instanceof Object[]);
		int[] extractedIntArray = ArrayUtils.toPrimitive((Integer[]) ((Object[]) obj)[0]);
		Assert.assertTrue(Arrays.equals(intInitialValue, extractedIntArray));
		extractedIntArray = ArrayUtils.toPrimitive((Integer[]) ((Object[]) obj)[1]);
		Assert.assertTrue(Arrays.equals(intInitialValue, extractedIntArray));

		String[] str = (String[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new String[] { "2", "3" }, "string", false));
		Assert.assertEquals("2", str[0]);
		final Boolean[] bool = (Boolean[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new boolean[] { false, true }, "boolean", false));
		Assert.assertTrue(bool[1].booleanValue());
		final Short[] b = (Short[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new byte[] { Byte.MIN_VALUE, Byte.MAX_VALUE }, "octet", false));
		Assert.assertEquals(Byte.MAX_VALUE, b[1].byteValue());
		Character[] c = (Character[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new char[] { 'r', 'h' }, "char", false));
		Assert.assertEquals('h', c[1].charValue());
		final Short[] s = (Short[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new short[] { Short.MIN_VALUE, Short.MAX_VALUE }, "short", false));
		Assert.assertEquals(Short.MAX_VALUE, s[1].shortValue());
		final Integer[] i = (Integer[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }, "long", false));
		Assert.assertEquals(Integer.MAX_VALUE, i[1].intValue());
		final Long[] l = (Long[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new long[] { Long.MIN_VALUE, Long.MAX_VALUE }, "longlong", false));
		Assert.assertEquals(Long.MAX_VALUE, l[1].longValue());
		final Float[] f = (Float[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new float[] { Float.MIN_VALUE, Float.MAX_VALUE }, "float", false));
		Assert.assertEquals(Float.MAX_VALUE, f[1].floatValue(), 0.00001);
		final Double[] d = (Double[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new double[] { Double.MIN_VALUE, Double.MAX_VALUE }, "double", false));
		Assert.assertEquals(Double.MAX_VALUE, d[1].doubleValue(), 0.00001);
		final Integer[] us = (Integer[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new short[] { Short.MIN_VALUE, Short.MAX_VALUE }, "ushort", false));
		Assert.assertEquals(Short.MAX_VALUE, us[1].intValue());
		final Long[] ui = (Long[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }, "ulong", false));
		Assert.assertEquals(Integer.MAX_VALUE, ui[1].longValue());
		final BigInteger[] ul = (BigInteger[]) AnyUtils.convertAny(AnyUtils.toAnySequence(new BigInteger[] { new BigInteger("2"), new BigInteger("3") },
			"ulonglong", false));
		Assert.assertEquals(3L, ul[1].longValue());
	}

}
