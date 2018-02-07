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
package mil.jpeojtrs.sca.util.math.tests;

import org.junit.Assert;
import mil.jpeojtrs.sca.util.math.ComplexLongLong;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexLongLong;
import CF.complexLongLongHelper;

public class ComplexLongLongTest extends ComplexNumberTest {

	private final ComplexLongLong complexLongLong = new ComplexLongLong(7L, 8L);

	@Override
	public void testToAny() {
		Any any = complexLongLong.toAny();

		complexLongLong cfType = complexLongLongHelper.extract(any);
		Assert.assertEquals(7L, cfType.real);
		Assert.assertEquals(8L, cfType.imag);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals(7L, complexLongLong.getValue(0).longValue());
		Assert.assertEquals(8L, complexLongLong.getValue(1).longValue());
	}

	@Test
	public void testGetLongLongValue() {
		Assert.assertEquals(7L, complexLongLong.getLongValue(0));
		Assert.assertEquals(8L, complexLongLong.getLongValue(1));
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexLongLong.getSize());
	}

	@Override
	public void testValueOfAny() {
		complexLongLong cfType = new complexLongLong(7L, 8L);
		Any any = ORB.init().create_any();
		complexLongLongHelper.insert(any, cfType);

		ComplexLongLong complexLongLong2 = ComplexLongLong.valueOf(any);
		Assert.assertEquals(7L, complexLongLong2.getLongValue(0));
		Assert.assertEquals(8L, complexLongLong2.getLongValue(1));
	}

	@Override
	public void testValueOfString() {
		ComplexLongLong complexLongLong2 = ComplexLongLong.valueOf("5+i6");

		Assert.assertEquals(5L, complexLongLong2.getLongValue(0));
		Assert.assertEquals(6L, complexLongLong2.getLongValue(1));
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("longlong", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexLongLong);
		Assert.assertEquals(5L, ((ComplexLongLong) complexNumber).getLongValue(0));
		Assert.assertEquals(6L, ((ComplexLongLong) complexNumber).getLongValue(1));
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7+j8", complexLongLong.toString());
		Assert.assertEquals("7-j8", new ComplexLongLong(7L, -8L).toString());
		Assert.assertEquals("-7+j8", new ComplexLongLong(-7L, 8L).toString());
		Assert.assertEquals("-7-j8", new ComplexLongLong(-7L, -8L).toString());
		Assert.assertEquals("-7+j", new ComplexLongLong(-7L, 1L).toString());
		Assert.assertEquals("-7-j", new ComplexLongLong(-7L, -1L).toString());
	}

}
