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

import CF.complexLongLong;
import CF.complexLongLongHelper;

/**
 * @since 3.4
 */
public class ComplexLongLong extends ComplexNumber {
	private final long [] numbers;

	public ComplexLongLong(long ... numbers) {
		this.numbers = numbers;
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexLongLong value = new complexLongLong(numbers[0], numbers[1]);
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

	public static ComplexLongLong valueOf(Any any) {
		complexLongLong complex = complexLongLongHelper.extract(any);
		return new ComplexLongLong(new long [] { complex.real, complex.imag });
	}

	public static ComplexLongLong valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		long [] numbers = new long [strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Long.valueOf(strNum[i]);
		}
		return new ComplexLongLong(numbers);
	}

}
