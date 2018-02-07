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

import org.omg.CORBA.Any;

/**
 * Functional interface used inside the package to point to a method that can extract a Redhawk complex number sequence from an {@link Any}.
 * @see ComplexNumber
 */
interface IComplexSequenceConverter {

	ComplexNumber[] valueOfSequence(Any any);

}
