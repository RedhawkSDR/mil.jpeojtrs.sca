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
package mil.jpeojtrs.sca.util.math;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

import CF.complexChar;
import CF.complexCharHelper;
import CF.complexOctet;
import CF.complexOctetHelper;

public class ComplexUByte extends ComplexNumber {
	private final short [] numbers;

	public ComplexUByte(short ... numbers) {
		this.numbers = numbers;
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexOctet value = new complexOctet((byte) numbers[0], (byte) numbers[1]);
			Any any = orb.create_any();
			complexOctetHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_octet((byte) numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	public short getUByteValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Short getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	public static ComplexUByte valueOf(Any any) {
		// TODO Use new Complex Unsiged byte when it becomes available.  Using char here is unsafe
		complexChar complex = complexCharHelper.extract(any);
		return new ComplexUByte((short) complex.real, (short) complex.imag);
	}

	public static ComplexUByte valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		short [] numbers = new short [strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Short.valueOf(strNum[i]);
			if (numbers[i] > 255) {
				throw new IllegalArgumentException("Number value out of range: " + strNum[i]);
			}
		}
		return new ComplexUByte(numbers);
	}
}
