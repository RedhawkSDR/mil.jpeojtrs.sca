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
import mil.jpeojtrs.sca.util.math.ComplexShort;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexShort;
import CF.complexShortHelper;

public class ComplexShortTest extends ComplexNumberTest {

	private final ComplexShort complexShort = new ComplexShort((short) 7, (short) 8);

	@Override
	public void testToAny() {
		Any any = complexShort.toAny();

		complexShort cfType = complexShortHelper.extract(any);
		Assert.assertEquals((short) 7, cfType.real);
		Assert.assertEquals((short) 8, cfType.imag);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals((short) 7, complexShort.getValue(0).shortValue());
		Assert.assertEquals((short) 8, complexShort.getValue(1).shortValue());
	}

	@Test
	public void testGetShortValue() {
		Assert.assertEquals((short) 7, complexShort.getShortValue(0));
		Assert.assertEquals((short) 8, complexShort.getShortValue(1));
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexShort.getSize());
	}

	@Override
	public void testValueOfAny() {
		complexShort cfType = new complexShort((short) 7, (short) 8);
		Any any = ORB.init().create_any();
		complexShortHelper.insert(any, cfType);

		ComplexShort complexShort2 = ComplexShort.valueOf(any);
		Assert.assertEquals((short) 7, complexShort2.getShortValue(0));
		Assert.assertEquals((short) 8, complexShort2.getShortValue(1));
	}

	@Override
	public void testValueOfString() {
		ComplexShort complexShort2 = ComplexShort.valueOf("5+i6");

		Assert.assertEquals((short) 5, complexShort2.getShortValue(0));
		Assert.assertEquals((short) 6, complexShort2.getShortValue(1));
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("short", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexShort);
		Assert.assertEquals((short) 5, ((ComplexShort) complexNumber).getShortValue(0));
		Assert.assertEquals((short) 6, ((ComplexShort) complexNumber).getShortValue(1));
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7+j8", complexShort.toString());
	}

}
