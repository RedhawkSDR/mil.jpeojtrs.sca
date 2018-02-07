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

import org.jacorb.JacorbUtil;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexLong;
import CF.complexLongHelper;
import mil.jpeojtrs.sca.util.math.ComplexLong;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

public class ComplexLongTest extends AbstractComplexNumberTest {

	private final ComplexLong complexLong = new ComplexLong((int) 7, (int) 8);

	@Override
	public void testToAny() {
		Any any = complexLong.toAny();

		complexLong cfType = complexLongHelper.extract(any);
		Assert.assertEquals(7, cfType.real);
		Assert.assertEquals(8, cfType.imag);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals(7, complexLong.getValue(0).intValue());
		Assert.assertEquals(8, complexLong.getValue(1).intValue());
	}

	@Test
	public void testGetLongValue() {
		Assert.assertEquals(7, complexLong.getIntValue(0));
		Assert.assertEquals(8, complexLong.getIntValue(1));
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexLong.getSize());
	}

	@Override
	public void testIsSequence() {
		CF.complexLong[] complexLongs = new CF.complexLong[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexLongSeqHelper.insert(corbaAny, complexLongs);

		Assert.assertTrue(ComplexNumber.isSequence(corbaAny));

		complexLongs = new CF.complexLong[2];
		complexLongs[0] = new complexLong(1, 2);
		complexLongs[1] = new complexLong(-3, -4);
		corbaAny = JacorbUtil.init().create_any();
		CF.complexLongSeqHelper.insert(corbaAny, complexLongs);

		Assert.assertTrue(ComplexNumber.isSequence(corbaAny));
	}

	@Override
	public void testValueOfAny() {
		complexLong cfType = new complexLong(7, 8);
		Any any = ORB.init().create_any();
		complexLongHelper.insert(any, cfType);

		ComplexLong complexLong2 = ComplexLong.valueOf(any);
		Assert.assertEquals((int) 7, complexLong2.getIntValue(0));
		Assert.assertEquals((int) 8, complexLong2.getIntValue(1));
	}

	@Override
	public void testValueOfString() {
		ComplexLong complexLong2 = ComplexLong.valueOf("5+i6");

		Assert.assertEquals((int) 5, complexLong2.getIntValue(0));
		Assert.assertEquals((int) 6, complexLong2.getIntValue(1));
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("long", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexLong);
		Assert.assertEquals(5, ((ComplexLong) complexNumber).getIntValue(0));
		Assert.assertEquals(6, ((ComplexLong) complexNumber).getIntValue(1));
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7+j8", complexLong.toString());
		Assert.assertEquals("7-j8", new ComplexLong(7, -8).toString());
		Assert.assertEquals("-7+j8", new ComplexLong(-7, 8).toString());
		Assert.assertEquals("-7-j8", new ComplexLong(-7, -8).toString());
		Assert.assertEquals("-7+j", new ComplexLong(-7, 1).toString());
		Assert.assertEquals("-7-j", new ComplexLong(-7, -1).toString());
	}

}
