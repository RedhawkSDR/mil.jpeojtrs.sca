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

import CF.complexLongLong;
import CF.complexLongLongHelper;

/**
 * @since 3.4
 */
public class ComplexLongLong extends ComplexNumber {

	private long[] numbers;

	public ComplexLongLong() {
		this(0, 0);
	}

	public ComplexLongLong(long real, long imaginary) {
		this(new long[] { real, imaginary });
	}

	protected ComplexLongLong(long... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 3.5
	 */
	public complexLongLong toCFType() {
		if (numbers.length == 2) {
			return new complexLongLong(numbers[0], numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexLongLong value = toCFType();
			Any any = orb.create_any();
			complexLongLongHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_longlong(numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.5
	 */
	public long[] getNumbers() {
		return Arrays.copyOf(numbers, numbers.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.5
	 */
	public void setNumbers(long[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
	}

	public long getLongValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Long getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 3.5
	 */
	public static ComplexLongLong[] valueOfSequence(Any any) {
		CF.complexLongLong[] cfArray = CF.complexLongLongSeqHelper.extract(any);
		ComplexLongLong[] array = new ComplexLongLong[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexLongLong(cfArray[i].real, cfArray[i].imag);
		}
		return array;
	}

	public static ComplexLongLong valueOf(Any any) {
		complexLongLong complex = complexLongLongHelper.extract(any);
		return new ComplexLongLong(new long[] { complex.real, complex.imag });
	}

	public static ComplexLongLong valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		long[] numbers = new long[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Long.valueOf(strNum[i]);
		}
		return new ComplexLongLong(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexLongLong) {
			return Arrays.equals(numbers, ((ComplexLongLong) obj).numbers);
		}
		return super.equals(obj);
	}

}
