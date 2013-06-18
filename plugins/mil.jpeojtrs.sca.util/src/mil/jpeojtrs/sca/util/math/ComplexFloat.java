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

import CF.complexFloat;
import CF.complexFloatHelper;

/**
 * @since 3.4
 */
public class ComplexFloat extends ComplexNumber {
	private final float [] numbers;

	public ComplexFloat(float ... numbers) {
		this.numbers = numbers;
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexFloat value = new complexFloat(numbers[0], numbers[1]);
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

	public static ComplexFloat valueOf(Any any) {
		complexFloat complex = complexFloatHelper.extract(any);
		return new ComplexFloat(new float [] { complex.real, complex.imag });
	}

	public static ComplexFloat valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		float [] numbers = new float [strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Float.valueOf(strNum[i]);
		}
		return new ComplexFloat(numbers);
	}

}
