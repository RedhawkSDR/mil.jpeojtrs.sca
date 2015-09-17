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

import CF.complexShort;
import CF.complexShortHelper;

/**
 * @since 3.4
 */
public class ComplexShort extends ComplexNumber {

	private short[] numbers;

	public ComplexShort() {
		this((short) 0, (short) 0);
	}

	public ComplexShort(short real, short imaginary) {
		this(new short[] { real, imaginary });
	}

	protected ComplexShort(short... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 3.5
	 */
	public complexShort toCFType() {
		if (numbers.length == 2) {
			return new complexShort(numbers[0], numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexShort value = toCFType();
			Any any = orb.create_any();
			complexShortHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_short(numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.5
	 */
	public short[] getNumbers() {
		return Arrays.copyOf(numbers, numbers.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.5
	 */
	public void setNumbers(short[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
	}

	public short getShortValue(int index) throws ArrayIndexOutOfBoundsException {
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
	 * @since 3.5
	 */
	public static ComplexShort[] valueOfSequence(Any any) {
		CF.complexShort[] cfArray = CF.complexShortSeqHelper.extract(any);
		ComplexShort[] array = new ComplexShort[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexShort(cfArray[i].real, cfArray[i].imag);
		}
		return array;
	}

	public static ComplexShort valueOf(Any any) {
		complexShort complex = complexShortHelper.extract(any);
		return new ComplexShort(new short[] { complex.real, complex.imag });
	}

	public static ComplexShort valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		short[] numbers = new short[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Short.valueOf(strNum[i]);
		}
		return new ComplexShort(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexShort) {
			return Arrays.equals(numbers, ((ComplexShort) obj).numbers);
		}
		return super.equals(obj);
	}
}
