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

import CF.complexFloat;
import CF.complexFloatHelper;
import mil.jpeojtrs.sca.util.math.ComplexFloat;
import mil.jpeojtrs.sca.util.math.ComplexNumber;

public class ComplexFloatTest extends AbstractComplexNumberTest {

	private final ComplexFloat complexFloat = new ComplexFloat(7f, 8f);

	@Override
	public void testToAny() {
		Any any = complexFloat.toAny();

		complexFloat cfType = complexFloatHelper.extract(any);
		Assert.assertEquals(7f, cfType.real, 0.0);
		Assert.assertEquals(8f, cfType.imag, 0.0);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals(7f, complexFloat.getValue(0).floatValue(), 0.0);
		Assert.assertEquals(8f, complexFloat.getValue(1).floatValue(), 0.0);
	}

	@Test
	public void testGetFloatValue() {
		Assert.assertEquals(7f, complexFloat.getFloatValue(0), 0.0);
		Assert.assertEquals(8f, complexFloat.getFloatValue(1), 0.0);
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexFloat.getSize());
	}

	@Override
	public void testIsSequence() {
		CF.complexFloat[] complexFloats = new CF.complexFloat[0];
		Any corbaAny = JacorbUtil.init().create_any();
		CF.complexFloatSeqHelper.insert(corbaAny, complexFloats);

		Assert.assertTrue(ComplexNumber.isSequence(corbaAny));

		complexFloats = new CF.complexFloat[2];
		complexFloats[0] = new complexFloat(1.0f, 2.0f);
		complexFloats[1] = new complexFloat(-3.0f, -4.0f);
		corbaAny = JacorbUtil.init().create_any();
		CF.complexFloatSeqHelper.insert(corbaAny, complexFloats);

		Assert.assertTrue(ComplexNumber.isSequence(corbaAny));
	}

	@Override
	public void testValueOfAny() {
		complexFloat cfType = new complexFloat(7f, 8f);
		Any any = ORB.init().create_any();
		complexFloatHelper.insert(any, cfType);

		ComplexFloat complexFloat2 = ComplexFloat.valueOf(any);
		Assert.assertEquals(7f, complexFloat2.getFloatValue(0), 0.0);
		Assert.assertEquals(8f, complexFloat2.getFloatValue(1), 0.0);
	}

	@Override
	public void testValueOfString() {
		ComplexFloat complexFloat2 = ComplexFloat.valueOf("5+i6");

		Assert.assertEquals(5f, complexFloat2.getFloatValue(0), 0.0);
		Assert.assertEquals(6f, complexFloat2.getFloatValue(1), 0.0);
	}

	@Override
	public void testValueOfStringString() {
		ComplexNumber complexNumber = ComplexNumber.valueOf("float", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexFloat);
		Assert.assertEquals(5f, ((ComplexFloat) complexNumber).getFloatValue(0), 0.0);
		Assert.assertEquals(6f, ((ComplexFloat) complexNumber).getFloatValue(1), 0.0);
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7.0+j8.0", complexFloat.toString());
		Assert.assertEquals("7.0-j8.0", new ComplexFloat(7f, -8f).toString());
		Assert.assertEquals("-7.0+j8.0", new ComplexFloat(-7f, 8f).toString());
		Assert.assertEquals("-7.0-j8.0", new ComplexFloat(-7f, -8f).toString());
		Assert.assertEquals("-7.0+j", new ComplexFloat(-7f, 1f).toString());
		Assert.assertEquals("-7.0-j", new ComplexFloat(-7f, -1f).toString());
	}

}
