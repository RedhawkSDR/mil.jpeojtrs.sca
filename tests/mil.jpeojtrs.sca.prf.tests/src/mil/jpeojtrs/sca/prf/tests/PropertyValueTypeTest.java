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
  // BEGIN GENERATED CODE
 // BEGIN GENERATED CODE
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

	private PropertyValueType type;

	@Test
	public void testBoolean() {
		this.type = PropertyValueType.BOOLEAN;
		Assert.assertEquals("null is not a valid boolean value", false, this.type.isValueOfType(null));
		Assert.assertEquals("\"true\" is a valid boolean value", true, this.type.isValueOfType("true"));
		Assert.assertEquals("\"false\" is a valid boolean value", true, this.type.isValueOfType("false"));
		Assert.assertEquals("\"notaboolean\" is not a valid boolean value", false, this.type.isValueOfType("notaboolean"));
	}

	@Test
	public void testChar() {
		this.type = PropertyValueType.CHAR;
		Assert.assertEquals("null is not a valid char value", false, this.type.isValueOfType(null));
		Assert.assertEquals("\"a\" is a valid char value", true, this.type.isValueOfType("a"));
		Assert.assertEquals("\"abc\" is a not a valid char value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testDouble() {
		this.type = PropertyValueType.DOUBLE;
		Assert.assertEquals("null is not a valid double value", false, this.type.isValueOfType(null));
		Assert.assertEquals(Double.MIN_VALUE + " is a valid double value", true, this.type.isValueOfType(String.valueOf(Double.MIN_VALUE)));
		Assert.assertEquals(Double.MAX_VALUE + " is a valid double value", true, this.type.isValueOfType(String.valueOf(Double.MAX_VALUE)));
		Assert.assertEquals(Double.NaN + " is a valid double value", true, this.type.isValueOfType(String.valueOf(Double.NaN)));
		Assert.assertEquals("\"abc\" is a not a valid double value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testFloat() {
		this.type = PropertyValueType.FLOAT;
		Assert.assertEquals("null is not a valid float value", false, this.type.isValueOfType(null));
		Assert.assertEquals(Float.MIN_VALUE + " is a valid float value", true, this.type.isValueOfType(String.valueOf(Float.MIN_VALUE)));
		Assert.assertEquals(Float.MAX_VALUE + " is a valid float value", true, this.type.isValueOfType(String.valueOf(Float.MAX_VALUE)));
		Assert.assertEquals(Float.NaN + " is a valid float value", true, this.type.isValueOfType(String.valueOf(Float.NaN)));
		Assert.assertEquals("\"abc\" is a not a valid float value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testLong() {
		this.type = PropertyValueType.LONG;
		Assert.assertEquals("null is not a valid long value", false, this.type.isValueOfType(null));
		Assert.assertEquals(Integer.MIN_VALUE + " is a valid long value", true, this.type.isValueOfType(String.valueOf(Integer.MIN_VALUE)));
		Assert.assertEquals(Integer.MAX_VALUE + " is a valid long value", true, this.type.isValueOfType(String.valueOf(Integer.MAX_VALUE)));
		Assert.assertEquals(Long.valueOf(Integer.MAX_VALUE + 1L) + " is not a valid long value", false,
		        this.type.isValueOfType(String.valueOf(Long.valueOf(Integer.MAX_VALUE + 1L))));
		Assert.assertEquals(Long.valueOf(Integer.MIN_VALUE - 1L) + " is not a valid long value", false,
		        this.type.isValueOfType(String.valueOf(Long.valueOf(Integer.MIN_VALUE - 1L))));
		Assert.assertEquals("\"abc\" is a not a valid long value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testLongLong() {
		this.type = PropertyValueType.LONGLONG;
		Assert.assertEquals("null is not valid longlong value", false, this.type.isValueOfType(null));
		Assert.assertEquals(Long.MIN_VALUE + " is a valid longlong value", true, this.type.isValueOfType(String.valueOf(Long.MIN_VALUE)));
		Assert.assertEquals(Long.MAX_VALUE + " is a valid longlong value", true, this.type.isValueOfType(String.valueOf(Long.MAX_VALUE)));
		BigInteger tooSmall = BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE);
		BigInteger tooBig = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		Assert.assertEquals(tooSmall.toString() + " is not a valid longlong value", false, this.type.isValueOfType(tooSmall.toString()));
		Assert.assertEquals(tooBig.toString() + " is not a valid longlong value", false, this.type.isValueOfType(tooBig.toString()));
		Assert.assertEquals("\"abc\" is a not a valid longlong value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testObjref() {
		this.type = PropertyValueType.OBJREF;
		Assert.assertEquals("null is not valid objref value", false, this.type.isValueOfType(null));
		Assert.assertEquals("IOR:1234" + " is a valid objref value", true, this.type.isValueOfType("IOR:1234"));
		Assert.assertEquals("1234" + " is not valid objref value", false, this.type.isValueOfType("1234"));
		Assert.assertEquals("\"abc\" is a not a valid objref value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testOctet() {
		this.type = PropertyValueType.OCTET;
		Assert.assertEquals("null is not valid octet value", false, this.type.isValueOfType(null));
		Assert.assertEquals(MIN_OCTET + " is a valid octet value", true, this.type.isValueOfType(String.valueOf(MIN_OCTET)));
		Assert.assertEquals(MIN_OCTET - 1 + " is not a valid octet value", false, this.type.isValueOfType(String.valueOf(MIN_OCTET - 1)));
		Assert.assertEquals(MAX_OCTET + " is a valid octet value", true, this.type.isValueOfType(String.valueOf(MAX_OCTET)));
		Assert.assertEquals(MAX_OCTET + 1 + " is not valid octet value", false, this.type.isValueOfType(String.valueOf(MAX_OCTET + 1)));
		Assert.assertEquals("\"abc\" is a not a valid octet value", false, this.type.isValueOfType("abc"));
	}

	@Test
	public void testShort() {
		this.type = PropertyValueType.SHORT;
		Assert.assertEquals("null is not valid short value", false, this.type.isValueOfType(null));
		Assert.assertEquals(Short.MIN_VALUE + " is a valid short value", true, this.type.isValueOfType(String.valueOf(Short.MIN_VALUE)));
		Assert.assertEquals(Short.MAX_VALUE + " is a valid short value", true, this.type.isValueOfType(String.valueOf(Short.MAX_VALUE)));
		Assert.assertEquals(Short.MIN_VALUE - 1 + " is not a valid short value", false, this.type.isValueOfType(String.valueOf(Short.MIN_VALUE - 1)));
		Assert.assertEquals(Short.MAX_VALUE + 1 + " is not a valid short value", false, this.type.isValueOfType(String.valueOf(Short.MAX_VALUE + 1)));
	}

	@Test
	public void testString() {
		this.type = PropertyValueType.STRING;
		Assert.assertEquals("null is not valid string value", false, this.type.isValueOfType(null));
		Assert.assertEquals("\"\" is a valid string value", true, this.type.isValueOfType(""));
		Assert.assertEquals("\"test\" is a valid string value", true, this.type.isValueOfType("test"));
	}

	@Test
	public void testUlong() {
		this.type = PropertyValueType.ULONG;
		Assert.assertEquals("null is not valid ulong value", false, this.type.isValueOfType(null));
		Assert.assertEquals(MAX_ULONG + " is a valid ulong value", true, this.type.isValueOfType(String.valueOf(MAX_ULONG)));
		Assert.assertEquals(MAX_ULONG + 1L + " is not a valid ulong", false, this.type.isValueOfType(String.valueOf(MAX_ULONG + 1L)));
		Assert.assertEquals("0 is a valid ulong", true, this.type.isValueOfType(String.valueOf(0)));
		Assert.assertEquals("-1 is not a valid ulong", false, this.type.isValueOfType(String.valueOf(-1)));
	}

	@Test
	public void testUlongLong() {
		this.type = PropertyValueType.ULONGLONG;
		Assert.assertEquals("null is not valid ulonglong value", false, this.type.isValueOfType(null));
		Assert.assertEquals(MAX_ULONG_LONG.toString() + " is a valid ulong value", true, this.type.isValueOfType(MAX_ULONG_LONG.toString()));
		Assert.assertEquals(MAX_ULONG_LONG.add(BigInteger.ONE).toString() + " is not a valid ulong", false,
		        this.type.isValueOfType(MAX_ULONG_LONG.add(BigInteger.ONE).toString()));
		Assert.assertEquals("0 is a valid ulonglong", true, this.type.isValueOfType(String.valueOf(0)));
		Assert.assertEquals("-1 is not a valid ulonglong", false, this.type.isValueOfType(String.valueOf(-1)));
	}

	@Test
	public void testUshort() {
		this.type = PropertyValueType.USHORT;
		Assert.assertEquals("null is not valid ushort value", false, this.type.isValueOfType(null));
		Assert.assertEquals("0 is a valid ushort value", true, this.type.isValueOfType(String.valueOf(0)));
		Assert.assertEquals(MAX_USHORT + " is a valid ushort value", true, this.type.isValueOfType(String.valueOf(MAX_USHORT)));
		Assert.assertEquals("\"-1\" is not a valid ushort value", false, this.type.isValueOfType("-1"));
		Assert.assertEquals(MAX_USHORT + 1 + " is not a valid ushort value", false, this.type.isValueOfType(String.valueOf(MAX_USHORT + 1)));
	}

	public void testUtcTime() {
		this.type = PropertyValueType.UTCTIME;
		Assert.assertFalse("null is not a valid utctime value", this.type.isValueOfType(null));
		Assert.assertFalse("0 is not a valid utctime value", this.type.isValueOfType("0"));
		Assert.assertTrue("utctime without fractional seconds should be valid", this.type.isValueOfType("2001:02:03::04:05:06"));
		Assert.assertTrue("utctime with fractional seconds should be valid", this.type.isValueOfType("2017:02:09::17:05:00.123456"));
	}
}
