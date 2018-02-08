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

import CF.complexULong;
import CF.complexULongHelper;
import mil.jpeojtrs.sca.util.UnsignedUtils;

/**
 * @since 3.4
 */
public class ComplexULong extends ComplexNumber {

	private static final long MAX_ULONG = 2L * Integer.MAX_VALUE + 1L;

	private long[] numbers;

	public ComplexULong() {
		this(0, 0);
	}

	public ComplexULong(long real, long imag) {
		this(new long[] { real, imag });
	}

	protected ComplexULong(long... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 4.0
	 */
	public complexULong toCFType() {
		if (numbers.length == 2) {
			return new complexULong((int) numbers[0], (int) numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexULong value = toCFType();
			Any any = orb.create_any();
			complexULongHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_ulong((int) numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public long[] getNumbers() {
		return Arrays.copyOf(numbers, numbers.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public void setNumbers(long[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
	}

	public long getULongValue(int index) {
		return numbers[index];
	}

	@Override
	public Long getValue(int index) {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 4.0
	 */
	public static ComplexULong[] valueOfSequence(Any any) {
		CF.complexULong[] cfArray = CF.complexULongSeqHelper.extract(any);
		ComplexULong[] array = new ComplexULong[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexULong(UnsignedUtils.toSigned(cfArray[i].real), UnsignedUtils.toSigned(cfArray[i].imag));
		}
		return array;
	}

	public static ComplexULong valueOf(Any any) {
		complexULong complex = complexULongHelper.extract(any);
		return new ComplexULong(UnsignedUtils.toSigned(complex.real), UnsignedUtils.toSigned(complex.imag));
	}

	public static ComplexULong valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		long[] numbers = new long[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Long.valueOf(strNum[i]);
			if (numbers[i] < 0 || numbers[i] > MAX_ULONG) {
				throw new NumberFormatException("Value out of range. Value:\"" + strNum[i] + "\"");
			}
		}
		return new ComplexULong(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexULong) {
			return Arrays.equals(numbers, ((ComplexULong) obj).numbers);
		}
		return super.equals(obj);
	}
}
