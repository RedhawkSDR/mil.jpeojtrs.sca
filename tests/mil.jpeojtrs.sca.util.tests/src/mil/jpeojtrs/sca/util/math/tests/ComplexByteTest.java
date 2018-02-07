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
import mil.jpeojtrs.sca.util.math.ComplexByte;
import mil.jpeojtrs.sca.util.math.ComplexNumber;
import mil.jpeojtrs.sca.util.math.ComplexOctet;

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexOctet;
import CF.complexOctetHelper;

@SuppressWarnings("deprecation")
public class ComplexByteTest extends AbstractComplexNumberTest {

	private final ComplexByte complexByte = new ComplexByte((byte) 7, (byte) 8);

	@Override
	public void testToAny() {
		Any any = complexByte.toAny();

		complexOctet cfType = complexOctetHelper.extract(any);
		Assert.assertEquals((byte) 7, cfType.real);
		Assert.assertEquals((byte) 8, cfType.imag);
	}

	@Override
	public void testGetValue() {
		Assert.assertEquals((byte) 7, complexByte.getValue(0).byteValue());
		Assert.assertEquals((byte) 8, complexByte.getValue(1).byteValue());
	}

	@Test
	public void testGetByteValue() {
		Assert.assertEquals((byte) 7, complexByte.getByteValue(0));
		Assert.assertEquals((byte) 8, complexByte.getByteValue(1));
	}

	@Override
	public void testGetSize() {
		Assert.assertEquals(2, complexByte.getSize());
	}

	@Override
	public void testIsSequence() {
		// Not applicable to ComplexByte
	}

	@Override
	public void testValueOfAny() {
		complexOctet cfType = new complexOctet((byte) 7, (byte) 8);
		Any any = ORB.init().create_any();
		complexOctetHelper.insert(any, cfType);

		ComplexByte complexByte2 = ComplexByte.valueOf(any);
		Assert.assertEquals((byte) 7, complexByte2.getByteValue(0));
		Assert.assertEquals((byte) 8, complexByte2.getByteValue(1));
	}

	@Override
	public void testValueOfString() {
		ComplexByte complexByte2 = ComplexByte.valueOf("5+i6");

		Assert.assertEquals((byte) 5, complexByte2.getByteValue(0));
		Assert.assertEquals((byte) 6, complexByte2.getByteValue(1));
	}

	@Override
	public void testValueOfStringString() {
		// Because ComplexByte is deprecated, ComplexOctet is now returned
		ComplexNumber complexNumber = ComplexNumber.valueOf("octet", "5+i6");

		Assert.assertTrue("Invalid complex type", complexNumber instanceof ComplexOctet);
		Assert.assertEquals((short) 5, ((ComplexOctet) complexNumber).getShortValue(0));
		Assert.assertEquals((short) 6, ((ComplexOctet) complexNumber).getShortValue(1));
	}

	@Override
	public void testToString() {
		Assert.assertEquals("7+j8", complexByte.toString());
		Assert.assertEquals("7-j8", new ComplexByte((byte) 7, (byte) -8).toString());
		Assert.assertEquals("-7+j8", new ComplexByte((byte) -7, (byte) 8).toString());
		Assert.assertEquals("-7-j8", new ComplexByte((byte) -7, (byte) -8).toString());
		Assert.assertEquals("-7+j", new ComplexByte((byte) -7, (byte) 1).toString());
		Assert.assertEquals("-7-j", new ComplexByte((byte) -7, (byte) -1).toString());
	}

}
