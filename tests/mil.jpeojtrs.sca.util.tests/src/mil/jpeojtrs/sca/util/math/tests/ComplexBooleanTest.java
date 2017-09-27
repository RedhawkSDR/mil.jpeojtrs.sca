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
package mil.jpeojtrs.sca.util.math.tests;

import org.junit.Assert;

import mil.jpeojtrs.sca.util.math.ComplexBoolean;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexBoolean;
import CF.complexBooleanHelper;

public class ComplexBooleanTest extends ComplexNumberTest {

	private final ComplexBoolean complexBoolean = new ComplexBoolean(true, false);

	@Override
	public void testToAny() {
		Any any = complexBoolean.toAny();

		complexBoolean cfType = complexBooleanHelper.extract(any);
		Assert.assertEquals(true, cfType.real);
		Assert.assertEquals(false, cfType.imag);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals(true, complexBoolean.getValue(0).booleanValue());
		Assert.assertEquals(false, complexBoolean.getValue(1).booleanValue());
	}

	@Test
	public void testGetLongValue() {
		Assert.assertEquals(true, complexBoolean.getBooleanValue(0));
		Assert.assertEquals(false, complexBoolean.getBooleanValue(1));
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexBoolean.getSize());
	}

	@Override
	public void testValueOfAny() {
		complexBoolean cfType = new complexBoolean(true, false);
		Any any = ORB.init().create_any();
		complexBooleanHelper.insert(any, cfType);

		ComplexBoolean complexLong2 = ComplexBoolean.valueOf(any);
		Assert.assertEquals(true, complexLong2.getBooleanValue(0));
		Assert.assertEquals(false, complexLong2.getBooleanValue(1));
	}

	@Override
	public void testValueOfString() {
		ComplexBoolean complexLong2 = ComplexBoolean.valueOf("0+j");

		Assert.assertEquals(false, complexLong2.getBooleanValue(0));
		Assert.assertEquals(true, complexLong2.getBooleanValue(1));
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("boolean", "0+j");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexBoolean);
		Assert.assertEquals(false, ((ComplexBoolean) complexNumber).getBooleanValue(0));
		Assert.assertEquals(true, ((ComplexBoolean) complexNumber).getBooleanValue(1));
	}

	@Override
	public void testToString() {
		Assert.assertEquals("1", complexBoolean.toString());
	}
}
