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

import CF.complexLong;
import CF.complexLongHelper;

/**
 * @since 3.4
 */
public class ComplexLong extends ComplexNumber {

	private int[] numbers;

	public ComplexLong() {
		this(0, 0);
	}

	public ComplexLong(int real, int imaginary) {
		this(new int[] { real, imaginary });
	}

	protected ComplexLong(int... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 3.7
	 */
	public complexLong toCFType() {
		if (numbers.length == 2) {
			return new complexLong(numbers[0], numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexLong value = toCFType();
			Any any = orb.create_any();
			complexLongHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_long(numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.7
	 */
	public int[] getNumbers() {
		return Arrays.copyOf(numbers, numbers.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.7
	 */
	public void setNumbers(int[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
	}

	public int getIntValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Integer getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 3.7
	 */
	public static ComplexLong[] valueOfSequence(Any any) {
		CF.complexLong[] cfArray = CF.complexLongSeqHelper.extract(any);
		ComplexLong[] array = new ComplexLong[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexLong(cfArray[i].real, cfArray[i].imag);
		}
		return array;
	}

	public static ComplexLong valueOf(Any any) {
		complexLong complex = complexLongHelper.extract(any);
		return new ComplexLong(new int[] { complex.real, complex.imag });
	}

	public static ComplexLong valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		int[] numbers = new int[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.valueOf(strNum[i]);
		}
		return new ComplexLong(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexLong) {
			return Arrays.equals(numbers, ((ComplexLong) obj).numbers);
		}
		return super.equals(obj);
	}

}
