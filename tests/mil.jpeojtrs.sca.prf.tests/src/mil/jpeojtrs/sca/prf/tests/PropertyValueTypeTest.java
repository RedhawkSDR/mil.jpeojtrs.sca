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
package mil.jpeojtrs.sca.prf.tests;

import java.math.BigInteger;

import org.junit.Assert;
import junit.framework.TestCase;
import mil.jpeojtrs.sca.prf.PropertyValueType;

import org.junit.Test;

public class PropertyValueTypeTest extends TestCase {

	private static final int MAX_USHORT = 2 * Short.MAX_VALUE + 1;
	private static final long MAX_ULONG = 2L * Integer.MAX_VALUE + 1L;
	private static final short MIN_OCTET = 0;
	private static final short MAX_OCTET = 0xFF;
	private static final BigInteger MAX_ULONG_LONG = BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);

	@Test
	public void testBoolean() {
		PropertyValueType type = PropertyValueType.BOOLEAN;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType("true", false));
		Assert.assertTrue(type.isValueOfType("false", false));
		Assert.assertFalse(type.isValueOfType("notaboolean", false));
	}

	@Test
	public void testBooleanComplex() {
		PropertyValueType type = PropertyValueType.BOOLEAN;
		Assert.assertTrue(type.isValueOfType("0", true));
		Assert.assertTrue(type.isValueOfType("1", true));
		Assert.assertTrue(type.isValueOfType("0+j0", true));
		Assert.assertTrue(type.isValueOfType("1+j", true));
		Assert.assertFalse("Failed minimum value test", type.isValueOfType("-1-j", true));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType("2+j2", true));
		Assert.assertFalse(type.isValueOfType("notaboolean", true));
	}

	@Test
	public void testChar() {
		PropertyValueType type = PropertyValueType.CHAR;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType("a", false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	/*
	@Test
	public void testCharComplex() {
		// TODO
	}
	*/

	@Test
	public void testDouble() {
		PropertyValueType type = PropertyValueType.DOUBLE;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Double.MAX_VALUE), false));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Double.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType("0", false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Double.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Double.MAX_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Double.NaN), false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testDoubleComplex() {
		PropertyValueType type = PropertyValueType.DOUBLE;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Double.MAX_VALUE), false));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Double.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType("0", false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Double.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Double.MAX_VALUE), true));
		Assert.assertFalse(type.isValueOfType(String.valueOf(Double.NaN), true));
		Assert.assertFalse(type.isValueOfType("abc", true));

		String expression = "-" + String.valueOf(Double.MAX_VALUE) + "-j" + String.valueOf(Double.MAX_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = "-" + String.valueOf(Double.MIN_VALUE) + "-j" + String.valueOf(Double.MIN_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = "0+j0";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Double.MIN_VALUE) + "+j" + String.valueOf(Double.MIN_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Double.MAX_VALUE) + "+j" + String.valueOf(Double.MAX_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
	}

	@Test
	public void testFloat() {
		PropertyValueType type = PropertyValueType.FLOAT;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Float.MAX_VALUE), false));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Float.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType("0", false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Float.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Float.MAX_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Float.NaN), false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testFloatComplex() {
		PropertyValueType type = PropertyValueType.FLOAT;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Float.MAX_VALUE), true));
		Assert.assertTrue(type.isValueOfType("-" + String.valueOf(Float.MIN_VALUE), true));
		Assert.assertTrue(type.isValueOfType("0", true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Float.MIN_VALUE), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Float.MAX_VALUE), true));
		Assert.assertFalse(type.isValueOfType(String.valueOf(Float.NaN), true));
		Assert.assertFalse(type.isValueOfType("abc", true));

		String expression = "-" + String.valueOf(Float.MAX_VALUE) + "-j" + String.valueOf(Float.MAX_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = "-" + String.valueOf(Float.MIN_VALUE) + "-j" + String.valueOf(Float.MIN_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = "0+j0";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Float.MIN_VALUE) + "+j" + String.valueOf(Float.MIN_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Float.MAX_VALUE) + "+j" + String.valueOf(Float.MAX_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
	}

	@Test
	public void testLong() {
		PropertyValueType type = PropertyValueType.LONG;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Integer.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Integer.MAX_VALUE), false));
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(String.valueOf(Integer.MIN_VALUE - 1L), false));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(String.valueOf(Integer.MAX_VALUE + 1L), false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testLongComplex() {
		PropertyValueType type = PropertyValueType.LONG;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Integer.MIN_VALUE), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Integer.MAX_VALUE), true));
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(String.valueOf(Long.valueOf(Integer.MIN_VALUE - 1L)), true));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(String.valueOf(Long.valueOf(Integer.MAX_VALUE + 1L)), true));
		Assert.assertFalse(type.isValueOfType("abc", true));

		String expression = String.valueOf(Integer.MIN_VALUE) + "+j" + String.valueOf(Integer.MIN_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Integer.MAX_VALUE) + "+j" + String.valueOf(Integer.MAX_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Integer.MIN_VALUE - 1L) + "+j" + String.valueOf(Integer.MIN_VALUE - 1L);
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(expression, true));
		expression = String.valueOf(Integer.MAX_VALUE + 1L) + "+j" + String.valueOf(Integer.MAX_VALUE + 1L);
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(expression, true));
	}

	@Test
	public void testLongLong() {
		PropertyValueType type = PropertyValueType.LONGLONG;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Long.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Long.MAX_VALUE), false));
		BigInteger tooSmall = BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE);
		BigInteger tooBig = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(tooSmall.toString(), false));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(tooBig.toString(), false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testLongLongComplex() {
		PropertyValueType type = PropertyValueType.LONGLONG;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Long.MIN_VALUE), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Long.MAX_VALUE), true));
		BigInteger tooSmall = BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE);
		BigInteger tooBig = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(tooSmall.toString(), true));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(tooBig.toString(), true));
		Assert.assertFalse(type.isValueOfType("abc", true));

		String expression = String.valueOf(Integer.MIN_VALUE) + "+j" + String.valueOf(Integer.MIN_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Integer.MAX_VALUE) + "+j" + String.valueOf(Integer.MAX_VALUE);
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = tooSmall.toString() + "+j" + tooSmall.toString();
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(expression, true));
		expression = tooBig.toString() + "+j" + tooBig.toString();
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(expression, true));
	}

	@Test
	public void testObjref() {
		PropertyValueType type = PropertyValueType.OBJREF;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType("IOR:1234", false));
		Assert.assertFalse(type.isValueOfType("1234", false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testObjrefComplex() {
		PropertyValueType type = PropertyValueType.OBJREF;
		Assert.assertFalse(type.isValueOfType("IOR:1234", true));
	}

	@Test
	public void testOctet() {
		PropertyValueType type = PropertyValueType.OCTET;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MIN_OCTET), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_OCTET), false));
		Assert.assertFalse("Failed negative value test", type.isValueOfType("-1", false));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(String.valueOf(MAX_OCTET + 1), false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testOctetComplex() {
		PropertyValueType type = PropertyValueType.OCTET;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MIN_OCTET), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_OCTET), true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType("-1", true));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(String.valueOf(MAX_OCTET + 1), true));
		Assert.assertFalse(type.isValueOfType("abc", true));

		Assert.assertTrue(type.isValueOfType(String.valueOf(MIN_OCTET) + "+j" + String.valueOf(MIN_OCTET), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_OCTET) + "+j" + String.valueOf(MAX_OCTET), true));
		String expression = "-1-j";
		Assert.assertFalse("Failed negative value test", type.isValueOfType(expression, true));
		expression = String.valueOf(MAX_OCTET + 1) + "+j" + String.valueOf(MAX_OCTET + 1);
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(expression, true));
	}

	@Test
	public void testShort() {
		PropertyValueType type = PropertyValueType.SHORT;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Short.MIN_VALUE), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Short.MAX_VALUE), false));
		Assert.assertFalse("Failed minimum value test", type.isValueOfType(String.valueOf(Short.MIN_VALUE - 1), false));
		Assert.assertFalse("Failed maximum value test", type.isValueOfType(String.valueOf(Short.MAX_VALUE + 1), false));
		Assert.assertFalse(type.isValueOfType("abc", false));
	}

	@Test
	public void testShortComplex() {
		PropertyValueType type = PropertyValueType.SHORT;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Short.MIN_VALUE), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(Short.MAX_VALUE), true));
		Assert.assertFalse(type.isValueOfType(String.valueOf(Short.MIN_VALUE - 1), true));
		Assert.assertFalse(type.isValueOfType(String.valueOf(Short.MAX_VALUE + 1), true));

		String expression = String.valueOf(Short.MIN_VALUE) + "+" + String.valueOf(Short.MIN_VALUE) + "j";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Short.MAX_VALUE) + "+" + String.valueOf(Short.MAX_VALUE) + "j";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(Short.MIN_VALUE - 1) + "+" + String.valueOf(Short.MIN_VALUE - 1) + "j";
		Assert.assertFalse("Failed value too small test", type.isValueOfType(expression, true));
		expression = String.valueOf(Short.MAX_VALUE + 1) + "+" + String.valueOf(Short.MAX_VALUE + 1) + "j";
		Assert.assertFalse("Failed value too large test", type.isValueOfType(expression, true));
	}

	@Test
	public void testString() {
		PropertyValueType type = PropertyValueType.STRING;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType("", false));
		Assert.assertTrue(type.isValueOfType("test", false));
	}

	@Test
	public void testStringComplex() {
		PropertyValueType type = PropertyValueType.STRING;
		Assert.assertFalse(type.isValueOfType("test", true));
	}

	@Test
	public void testUlong() {
		PropertyValueType type = PropertyValueType.ULONG;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_ULONG), false));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(String.valueOf(MAX_ULONG + 1L), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(0), false));
		Assert.assertFalse("Failed negative value test", type.isValueOfType(String.valueOf(-1), false));
	}

	@Test
	public void testUlongComplex() {
		PropertyValueType type = PropertyValueType.ULONG;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_ULONG), true));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(String.valueOf(MAX_ULONG + 1L), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(0), true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType(String.valueOf(-1), true));

		String expression = String.valueOf(MAX_ULONG) + "+" + String.valueOf(MAX_ULONG) + "j";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(MAX_ULONG + 1L) + "+" + String.valueOf(MAX_ULONG + 1L);
		Assert.assertFalse("Failed value too large test", type.isValueOfType(expression, true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType("-1-j", true));
	}

	@Test
	public void testUlongLong() {
		PropertyValueType type = PropertyValueType.ULONGLONG;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(MAX_ULONG_LONG.toString(), false));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(MAX_ULONG_LONG.add(BigInteger.ONE).toString(), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(0), false));
		Assert.assertFalse("Failed negative value test", type.isValueOfType(String.valueOf(-1), false));
	}

	@Test
	public void testUlongLongComplex() {
		PropertyValueType type = PropertyValueType.ULONGLONG;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(MAX_ULONG_LONG.toString(), true));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(MAX_ULONG_LONG.add(BigInteger.ONE).toString(), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(0), true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType(String.valueOf(-1), true));

		String expression = String.valueOf(MAX_ULONG_LONG) + "+" + String.valueOf(MAX_ULONG_LONG) + "j";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(MAX_ULONG_LONG.add(BigInteger.ONE)) + "+" + String.valueOf(MAX_ULONG_LONG.add(BigInteger.ONE));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(expression, true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType("-1-j", true));
	}

	@Test
	public void testUshort() {
		PropertyValueType type = PropertyValueType.USHORT;
		Assert.assertFalse(type.isValueOfType(null, false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(0), false));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_USHORT), false));
		Assert.assertFalse("Failed negative value test", type.isValueOfType(String.valueOf(-1), false));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(String.valueOf(MAX_USHORT + 1), false));
	}

	@Test
	public void testUshortComplex() {
		PropertyValueType type = PropertyValueType.USHORT;
		Assert.assertFalse(type.isValueOfType(null, true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(0), true));
		Assert.assertTrue(type.isValueOfType(String.valueOf(MAX_USHORT), true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType("-1", true));
		Assert.assertFalse("Failed value too large test", type.isValueOfType(String.valueOf(MAX_USHORT + 1), true));

		String expression = String.valueOf(MAX_USHORT) + "+" + String.valueOf(MAX_USHORT) + "j";
		Assert.assertTrue(type.isValueOfType(expression, true));
		expression = String.valueOf(MAX_USHORT + 1) + "+" + String.valueOf(MAX_USHORT + 1);
		Assert.assertFalse("Failed value too large test", type.isValueOfType(expression, true));
		Assert.assertFalse("Failed negative value test", type.isValueOfType("-1-j", true));
	}

	@Test
	public void testUtcTime() {
		PropertyValueType type = PropertyValueType.UTCTIME;
		Assert.assertFalse("null is not a valid utctime value", type.isValueOfType(null, false));
		Assert.assertFalse("0 is not a valid utctime value", type.isValueOfType("0", false));
		Assert.assertTrue("utctime without fractional seconds should be valid", type.isValueOfType("2001:02:03::04:05:06", false));
		Assert.assertTrue("utctime with fractional seconds should be valid", type.isValueOfType("2017:02:09::17:05:00.123456", false));
	}
}
