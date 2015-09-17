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

import CF.complexDouble;
import CF.complexDoubleHelper;

/**
 * @since 3.4
 */
public class ComplexDouble extends ComplexNumber {

	private double[] numbers;

	public ComplexDouble() {
		this(0, 0);
	}

	public ComplexDouble(double real, double imaginary) {
		this(new double[] { real, imaginary });
	}

	protected ComplexDouble(double... numbers) {
		this.numbers = numbers;
	}

	/**
	 * @since 3.7
	 */
	public complexDouble toCFType() {
		if (numbers.length == 2) {
			return new complexDouble(numbers[0], numbers[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexDouble value = toCFType();
			Any any = orb.create_any();
			complexDoubleHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_double(numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.7
	 */
	public double[] getNumbers() {
		return Arrays.copyOf(numbers, numbers.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 3.7
	 */
	public void setNumbers(double[] numbers) {
		this.numbers = Arrays.copyOf(numbers, numbers.length);
	}

	public double getDoubleValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Double getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	/**
	 * @since 3.7
	 */
	public static ComplexDouble[] valueOfSequence(Any any) {
		CF.complexDouble[] cfArray = CF.complexDoubleSeqHelper.extract(any);
		ComplexDouble[] array = new ComplexDouble[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexDouble(cfArray[i].real, cfArray[i].imag);
		}
		return array;
	}

	public static ComplexDouble valueOf(Any any) {
		complexDouble complex = complexDoubleHelper.extract(any);
		return new ComplexDouble(new double[] { complex.real, complex.imag });
	}

	public static ComplexDouble valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		double[] numbers = new double[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Double.valueOf(strNum[i]);
		}
		return new ComplexDouble(numbers);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexDouble) {
			return Arrays.equals(numbers, ((ComplexDouble) obj).numbers);
		}
		return super.equals(obj);
	}

}
