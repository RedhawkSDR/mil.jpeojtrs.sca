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

import java.util.Arrays;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

import CF.complexChar;
import CF.complexCharHelper;

/**
 * @since 3.4
 */
public class ComplexUByte extends ComplexNumber {

	private short[] numbers;

	public ComplexUByte() {
		this((short) 0, (short) 0);
	}

	public ComplexUByte(short real, short imaginary) {
		this(new short[] { real, imaginary });
	}

	protected ComplexUByte(short... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 4.0
	 */
	public complexChar toCFType() {
		if (numbers.length == 2) {
			return new complexChar((char) numbers[0], (char) numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexChar value = toCFType();
			Any any = orb.create_any();
			complexCharHelper.insert(any, value);
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

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public short[] getNumbers() {
		return Arrays.copyOf(numbers, numbers.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public void setNumbers(short[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
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

	/**
	 * @since 4.0
	 */
	public static ComplexUByte[] valueOfSequence(Any any) {
		// TODO Use new Complex Unsiged byte when it becomes available.  Using char here is unsafe
		CF.complexChar[] cfArray = CF.complexCharSeqHelper.extract(any);
		ComplexUByte[] array = new ComplexUByte[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexUByte((short) cfArray[i].real, (short) cfArray[i].imag);
		}
		return array;
	}

	public static ComplexUByte valueOf(Any any) {
		// TODO Use new Complex Unsiged byte when it becomes available.  Using char here is unsafe
		complexChar complex = complexCharHelper.extract(any);
		return new ComplexUByte((short) complex.real, (short) complex.imag);
	}

	public static ComplexUByte valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		short[] numbers = new short[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Short.valueOf(strNum[i]);
			if (numbers[i] > 255) {
				throw new IllegalArgumentException("Number value out of range: " + strNum[i]);
			}
		}
		return new ComplexUByte(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexUByte) {
			return Arrays.equals(numbers, ((ComplexUByte) obj).numbers);
		}
		return super.equals(obj);
	}
}
