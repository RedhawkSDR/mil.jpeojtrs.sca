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

import CF.complexOctet;
import CF.complexOctetHelper;

/**
 * @since 3.4
 */
public class ComplexByte extends ComplexNumber {

	private byte[] bytes;

	public ComplexByte() {
		this((byte) 0, (byte) 0);
	}

	public ComplexByte(byte real, byte imaginary) {
		this(new byte[] { real, imaginary });
	}

	protected ComplexByte(byte... bytes) {
		this.bytes = bytes;
	}

	/**
	 * @since 4.0
	 */
	public complexOctet toCFType() {
		if (bytes.length == 2) {
			return new complexOctet(bytes[0], bytes[1]);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (bytes.length == 2) {
			complexOctet value = toCFType();
			Any any = orb.create_any();
			complexOctetHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[bytes.length];
			for (int i = 0; i < bytes.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_octet(bytes[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public byte[] getBytes() {
		return Arrays.copyOf(bytes, bytes.length);
	}

	/**
	 * Intended for JavaBean serialization only.
	 * @since 4.0
	 */
	public void setBytes(byte[] bytes) {
		this.bytes = Arrays.copyOf(bytes, bytes.length);
	}

	public byte getByteValue(int index) throws ArrayIndexOutOfBoundsException {
		return bytes[index];
	}

	@Override
	public Byte getValue(int index) throws ArrayIndexOutOfBoundsException {
		return bytes[index];
	}

	@Override
	public int getSize() {
		return bytes.length;
	}

	/**
	 * @since 4.0
	 */
	public static ComplexByte[] valueOfSequence(Any any) {
		CF.complexOctet[] cfArray = CF.complexOctetSeqHelper.extract(any);
		ComplexByte[] array = new ComplexByte[cfArray.length];
		for (int i = 0; i < cfArray.length; i++) {
			array[i] = new ComplexByte(cfArray[i].real, cfArray[i].imag);
		}
		return array;
	}

	public static ComplexByte valueOf(Any any) {
		complexOctet octet = complexOctetHelper.extract(any);
		return new ComplexByte(new byte[] { octet.real, octet.imag });
	}

	public static ComplexByte valueOf(String value) {
		String[] numbers = ComplexParser.parse(value);
		byte[] bytes = new byte[numbers.length];
		for (int i = 0; i < bytes.length; i++) {
			// TODO Add support for hex / octal
			bytes[i] = Byte.valueOf(numbers[i]);
		}
		return new ComplexByte(bytes);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(bytes);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexByte) {
			return Arrays.equals(bytes, ((ComplexByte) obj).bytes);
		}
		return super.equals(obj);
	}

}
