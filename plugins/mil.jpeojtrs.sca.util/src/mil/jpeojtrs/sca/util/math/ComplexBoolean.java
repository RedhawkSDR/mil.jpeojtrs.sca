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

import CF.complexBoolean;
import CF.complexBooleanHelper;

public class ComplexBoolean extends ComplexNumber {
	private final boolean[] numbers;

	public ComplexBoolean(boolean... numbers) {
		this.numbers = numbers;
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexBoolean value = new complexBoolean(numbers[0], numbers[1]);
			Any any = orb.create_any();
			complexBooleanHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_boolean(numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	public boolean getBooleanValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Boolean getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	public static ComplexBoolean valueOf(Any any) {
		complexBoolean complex = complexBooleanHelper.extract(any);
		return new ComplexBoolean(complex.real, complex.imag);
	}

	public static ComplexBoolean valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		boolean [] numbers = new boolean [strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Boolean.valueOf(strNum[i]);
		}
		return new ComplexBoolean(numbers);
	}

}
