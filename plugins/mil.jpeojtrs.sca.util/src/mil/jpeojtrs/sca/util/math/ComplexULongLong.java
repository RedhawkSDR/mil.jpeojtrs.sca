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

import java.math.BigInteger;
import java.util.Arrays;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

import CF.complexULongLong;
import CF.complexULongLongHelper;
import mil.jpeojtrs.sca.util.UnsignedUtils;

/**
 * @since 3.4
 */
public class ComplexULongLong extends ComplexNumber {

	private BigInteger[] numbers;

	public ComplexULongLong() {
		this(BigInteger.ZERO, BigInteger.ZERO);
	}

	public ComplexULongLong(BigInteger real, BigInteger imag) {
		this(new BigInteger[] { real, imag });
	}

	protected ComplexULongLong(BigInteger... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 4.0
	 */
	public complexULongLong toCFType() {
		if (numbers.length == 2) {
			return new complexULongLong(UnsignedUtils.toUnsigned(numbers[0]), UnsignedUtils.toUnsigned(numbers[1]));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexULongLong value = toCFType();
			Any any = orb.create_any();
			complexULongLongHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_ulonglong(UnsignedUtils.toUnsigned(numbers[i]));
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public BigInteger[] getNumbers() {
		BigInteger[] arrayCopy = new BigInteger[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			arrayCopy[i] = new BigInteger(numbers[i].toByteArray());
		}
		return arrayCopy;
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public void setNumbers(BigInteger[] numbers) {
		this.numbers = new BigInteger[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			this.numbers[i] = new BigInteger(numbers[i].toByteArray());
		}
	}

	public BigInteger getULongLongValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public BigInteger getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 4.0
	 */
	public static ComplexULongLong[] valueOfSequence(Any any) {
		CF.complexULongLong[] cfArray = CF.complexULongLongSeqHelper.extract(any);
		ComplexULongLong[] array = new ComplexULongLong[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexULongLong(UnsignedUtils.toSigned(cfArray[i].real), UnsignedUtils.toSigned(cfArray[i].imag));
		}
		return array;
	}

	public static ComplexULongLong valueOf(Any any) {
		complexULongLong complex = complexULongLongHelper.extract(any);
		return new ComplexULongLong(UnsignedUtils.toSigned(complex.real), UnsignedUtils.toSigned(complex.imag));
	}

	public static ComplexULongLong valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		BigInteger[] numbers = new BigInteger[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new BigInteger(strNum[i]);
		}
		return new ComplexULongLong(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexULongLong) {
			return Arrays.equals(numbers, ((ComplexULongLong) obj).numbers);
		}
		return super.equals(obj);
	}
}
