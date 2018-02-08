/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package mil.jpeojtrs.sca.util.math;

import java.util.Arrays;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

import CF.complexOctet;
import CF.complexOctetHelper;
import mil.jpeojtrs.sca.util.UnsignedUtils;

/**
 * @since 4.7
 */
public class ComplexOctet extends ComplexNumber {

	private static final int MAX_OCTET = 0xFF;

	private short[] numbers;

	public ComplexOctet() {
		this((short) 0, (short) 0);
	}

	public ComplexOctet(short real, short imaginary) {
		this(new short[] { real, imaginary });
	}

	protected ComplexOctet(short... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 4.0
	 */
	public complexOctet toCFType() {
		if (numbers.length == 2) {
			return new complexOctet((byte) numbers[0], (byte) numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexOctet value = toCFType();
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

	public short getShortValue(int index) {
		return numbers[index];
	}

	@Override
	public Short getValue(int index) {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 4.0
	 */
	public static ComplexOctet[] valueOfSequence(Any any) {
		CF.complexOctet[] cfArray = CF.complexOctetSeqHelper.extract(any);
		ComplexOctet[] array = new ComplexOctet[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexOctet(UnsignedUtils.toSigned(cfArray[i].real), UnsignedUtils.toSigned(cfArray[i].imag));
		}
		return array;
	}

	public static ComplexOctet valueOf(Any any) {
		complexOctet complex = complexOctetHelper.extract(any);
		return new ComplexOctet(new short[] { UnsignedUtils.toSigned(complex.real), UnsignedUtils.toSigned(complex.imag) });
	}

	public static ComplexOctet valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		short[] numbers = new short[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Short.valueOf(strNum[i]);
			if (numbers[i] < 0 || numbers[i] > MAX_OCTET) {
				throw new NumberFormatException("Value out of range. Value:\"" + strNum[i] + "\"");
			}
		}
		return new ComplexOctet(numbers);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexOctet) {
			return Arrays.equals(numbers, ((ComplexOctet) obj).numbers);
		}
		return super.equals(obj);
	}
}
