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
import mil.jpeojtrs.sca.util.math.ComplexDouble;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexDouble;
import CF.complexDoubleHelper;

public class ComplexDoubleTest extends ComplexNumberTest {

	private final ComplexDouble complexDouble = new ComplexDouble(7.0, 8.0);

	@Override
	public void testToAny() {
		Any any = complexDouble.toAny();

		complexDouble cfType = complexDoubleHelper.extract(any);
		Assert.assertEquals(7.0, cfType.real, 0.0);
		Assert.assertEquals(8.0, cfType.imag, 0.0);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals(7.0, complexDouble.getValue(0).doubleValue(), 0.0);
		Assert.assertEquals(8.0, complexDouble.getValue(1).doubleValue(), 0.0);
	}

	@Test
	public void testGetDoubleValue() {
		Assert.assertEquals(7.0, complexDouble.getDoubleValue(0), 0.0);
		Assert.assertEquals(8.0, complexDouble.getDoubleValue(1), 0.0);
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexDouble.getSize());
	}

	@Override
	public void testValueOfAny() {
		complexDouble cfType = new complexDouble(7.0, 8.0);
		Any any = ORB.init().create_any();
		complexDoubleHelper.insert(any, cfType);

		ComplexDouble complexDouble2 = ComplexDouble.valueOf(any);
		Assert.assertEquals(7.0, complexDouble2.getDoubleValue(0), 0.0);
		Assert.assertEquals(8.0, complexDouble2.getDoubleValue(1), 0.0);
	}

	@Override
	public void testValueOfString() {
		ComplexDouble complexDouble2 = ComplexDouble.valueOf("5+i6");

		Assert.assertEquals(5.0, complexDouble2.getDoubleValue(0), 0.0);
		Assert.assertEquals(6.0, complexDouble2.getDoubleValue(1), 0.0);
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("double", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexDouble);
		Assert.assertEquals(5.0, ((ComplexDouble) complexNumber).getDoubleValue(0), 0.0);
		Assert.assertEquals(6.0, ((ComplexDouble) complexNumber).getDoubleValue(1), 0.0);
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7.0+j8.0", complexDouble.toString());
	}

}
