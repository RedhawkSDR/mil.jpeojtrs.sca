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
package mil.jpeojtrs.sca.util.math.tests;

import org.jacorb.JacorbUtil;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.Any;
import org.omg.CORBA.DoubleSeqHelper;

import mil.jpeojtrs.sca.util.math.ComplexNumber;

public class ComplexNumberTest {

	@Test
	public void testIsSequence() {
		// Primitive double
		Any corbaAny = JacorbUtil.init().create_any();
		corbaAny.insert_double(1.0);
		Assert.assertFalse(ComplexNumber.isSequence(corbaAny));

		// Sequence of double (but not COMPLEX sequence of double)
		corbaAny = JacorbUtil.init().create_any();
		DoubleSeqHelper.insert(corbaAny, new double[] { 1.0, 2.0 });
		Assert.assertFalse(ComplexNumber.isSequence(corbaAny));
	}

}
