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

import CF.complexFloat;
import CF.complexFloatHelper;

/**
 * @since 3.4
 */
public class ComplexFloat extends ComplexNumber {

	private float[] numbers;

	public ComplexFloat() {
		this(0, 0);
	}

	public ComplexFloat(float real, float imaginary) {
		this(new float[] { real, imaginary });
	}

	protected ComplexFloat(float... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 3.7
	 */
	public complexFloat toCFType() {
		if (numbers.length == 2) {
			return new complexFloat(numbers[0], numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexFloat value = toCFType();
			Any any = orb.create_any();
			complexFloatHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_float(numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.7
	 */
	public float[] getNumbers() {
		return numbers;
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.7
	 */
	public void setNumbers(float[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
	}

	public float getFloatValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Float getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 3.7
	 */
	public static ComplexFloat[] valueOfSequence(Any any) {
		CF.complexFloat[] cfArray = CF.complexFloatSeqHelper.extract(any);
		ComplexFloat[] array = new ComplexFloat[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexFloat(cfArray[i].real, cfArray[i].imag);
		}
		return array;
	}

	public static ComplexFloat valueOf(Any any) {
		complexFloat complex = complexFloatHelper.extract(any);
		return new ComplexFloat(new float[] { complex.real, complex.imag });
	}

	public static ComplexFloat valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		float[] numbers = new float[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Float.valueOf(strNum[i]);
		}
		return new ComplexFloat(numbers);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexFloat) {
			return Arrays.equals(numbers, ((ComplexFloat) obj).numbers);
		}
		return super.equals(obj);
	}

}
