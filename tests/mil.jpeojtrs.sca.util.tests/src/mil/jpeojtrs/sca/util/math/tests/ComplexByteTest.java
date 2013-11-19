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

import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;

import CF.complexOctet;
import CF.complexOctetHelper;

public class ComplexByteTest extends ComplexNumberTest {
	private static final ComplexByte[] DATA_SET = new ComplexByte[] { ComplexByte.valueOf("8+7i"), ComplexByte.valueOf("8+7j"), ComplexByte.valueOf("8+j7"),
	        ComplexByte.valueOf("8+i7"), ComplexByte.valueOf("(8,7)") };

	@Test
	public void testGetByteValue() {
		for (ComplexByte b : DATA_SET) {
			Assert.assertEquals((byte) 8, b.getByteValue(0));
			Assert.assertEquals((byte) 7, b.getByteValue(1));
		}
	}

	@Test
	public void testValueOfAny() {
		complexOctet octet = new complexOctet((byte) 7, (byte) 8);
		Any any = ORB.init().create_any();
		complexOctetHelper.insert(any, octet);
		ComplexByte cb = ComplexByte.valueOf(any);
		Assert.assertEquals((byte) 7, cb.getByteValue(0));
		Assert.assertEquals((byte) 8, cb.getByteValue(1));
	}

	@Test
	public void testValueOfString() {
		ComplexByte.valueOf("8+i7");
	}

	@Override
	@Test
	public void testToAny() {
		for (ComplexByte b : DATA_SET) {
			for (int i = 0; i < b.getSize(); i++) {
				b.toAny();
			}
		}
	}

	@Override
	@Test
	public void testGetValue() {
		for (ComplexByte b : DATA_SET) {
			for (int i = 0; i < b.getSize(); i++) {
				b.getValue(i);
			}
		}
	}

	@Override
	@Test
	public void testGetSize() {
		for (ComplexByte b : DATA_SET) {
			b.getSize();
		}

	}

}
