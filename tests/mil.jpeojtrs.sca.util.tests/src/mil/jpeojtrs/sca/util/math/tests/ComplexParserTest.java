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
package mil.jpeojtrs.sca.util.math.tests;

import mil.jpeojtrs.sca.util.math.ComplexParser;

import org.junit.Assert;
import org.junit.Test;

public class ComplexParserTest {

	@Test
	public void testParse() {
		String [] retVal = ComplexParser.parse("7+8i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7", "8"}, retVal);
		retVal = ComplexParser.parse("7.6+8.5i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		retVal = ComplexParser.parse("7e9+8e3i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3"}, retVal);
		retVal = ComplexParser.parse("7.543e9+8.321e3i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.543e9", "8.321e3"}, retVal);
		retVal = ComplexParser.parse("7e-9+8e-3i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e-9", "8e-3"}, retVal);
		retVal = ComplexParser.parse("7E9+8E3i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3"}, retVal);
		retVal = ComplexParser.parse("7.543E9+8.321E3i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.543e9", "8.321e3"}, retVal);
		retVal = ComplexParser.parse("7E-9+8E-3i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e-9", "8e-3"}, retVal);
		retVal = ComplexParser.parse("-7-8i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7+-8i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7--8i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "8"}, retVal);
		retVal = ComplexParser.parse(" 7.6 + 8.5i ");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		retVal = ComplexParser.parse("7.6+i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "1"}, retVal);
		retVal = ComplexParser.parse("7.6-i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "-1"}, retVal);
		retVal = ComplexParser.parse("7.6+-i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "-1"}, retVal);
		retVal = ComplexParser.parse("7.6--i");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "1"}, retVal);
		
		retVal = ComplexParser.parse("7+8j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7", "8"}, retVal);
		retVal = ComplexParser.parse("7.6+8.5j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		retVal = ComplexParser.parse("7e9+8e3j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3"}, retVal);
		retVal = ComplexParser.parse("7e-9+8e-3j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e-9", "8e-3"}, retVal);
		retVal = ComplexParser.parse("-7-8j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7+-8j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7--8j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "8"}, retVal);
		retVal = ComplexParser.parse("7.6+j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "1"}, retVal);
		retVal = ComplexParser.parse("7.6-j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "-1"}, retVal);
		retVal = ComplexParser.parse("7.6+-j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "-1"}, retVal);
		retVal = ComplexParser.parse("7.6--j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "1"}, retVal);
		
		retVal = ComplexParser.parse("7+i8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7", "8"}, retVal);
		retVal = ComplexParser.parse("7.6+i8.5");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		retVal = ComplexParser.parse("7e9+i8e3");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3"}, retVal);
		retVal = ComplexParser.parse("7e-9+i8e-3");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e-9", "8e-3"}, retVal);
		retVal = ComplexParser.parse("-7-i8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7+-i8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7--i8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "8"}, retVal);
		retVal = ComplexParser.parse(" 7.6 + i8.5 ");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		
		retVal = ComplexParser.parse("i8.5");
		Assert.assertArrayEquals("Invalid Parse", new String []{"0", "8.5"}, retVal);
		retVal = ComplexParser.parse("8.5j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"0", "8.5"}, retVal);
		retVal = ComplexParser.parse("8.5");
		Assert.assertArrayEquals("Invalid Parse", new String []{"8.5", "0"}, retVal);
		retVal = ComplexParser.parse("-i8.5");
		Assert.assertArrayEquals("Invalid Parse", new String []{"0", "-8.5"}, retVal);
		retVal = ComplexParser.parse("-8.5j");
		Assert.assertArrayEquals("Invalid Parse", new String []{"0", "-8.5"}, retVal);
		retVal = ComplexParser.parse("-8.5");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-8.5", "0"}, retVal);
		
		retVal = ComplexParser.parse("7+j8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7", "8"}, retVal);
		retVal = ComplexParser.parse("7.6+j8.5");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		retVal = ComplexParser.parse("7e9+j8e3");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3"}, retVal);
		retVal = ComplexParser.parse("7e-9+j8e-3");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e-9", "8e-3"}, retVal);
		retVal = ComplexParser.parse("-7-j8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7+-j8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		retVal = ComplexParser.parse("-7--j8");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "8"}, retVal);
		retVal = ComplexParser.parse(" 7.6 + j8.5 ");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		
		retVal = ComplexParser.parse("(7,8)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7", "8"}, retVal);
		retVal = ComplexParser.parse("(7.6,8.5)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5"}, retVal);
		retVal = ComplexParser.parse("(7e9,8e3)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3"}, retVal);
		retVal = ComplexParser.parse("(7e-9,8e-3)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e-9", "8e-3"}, retVal);
		retVal = ComplexParser.parse("(-7,-8)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8"}, retVal);
		
		retVal = ComplexParser.parse("(7,8,9)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7", "8", "9"}, retVal);
		retVal = ComplexParser.parse("(7.6,8.5,0.4)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7.6", "8.5", "0.4"}, retVal);
		retVal = ComplexParser.parse("(7e9,8e3,0.2e3)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"7e9", "8e3", "0.2e3"}, retVal);
		retVal = ComplexParser.parse("(-7,-8,-9)");
		Assert.assertArrayEquals("Invalid Parse", new String []{"-7", "-8", "-9"}, retVal);
	}

}
