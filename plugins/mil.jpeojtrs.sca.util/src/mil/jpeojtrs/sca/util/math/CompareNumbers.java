/**
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 * 
 * This file is part of REDHAWK IDE.
 * 
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 *
 */
package mil.jpeojtrs.sca.util.math;

import java.math.BigInteger;

public class CompareNumbers {

    private CompareNumbers() {

    }

    public static < T extends Number > int compare(T num1, T num2) {
        if (num1 instanceof Byte) {
            return ((Byte) num1).compareTo((Byte) num2);
        }
        if (num1 instanceof Short) {
            return ((Short) num1).compareTo((Short) num2);
        }
        if (num1 instanceof Integer) {
            return ((Integer) num1).compareTo((Integer) num2);
        }
        if (num1 instanceof Long) {
            return ((Long) num1).compareTo((Long) num2);
        }
        if (num1 instanceof Float) {
            return ((Float) num1).compareTo((Float) num2);
        }
        if (num1 instanceof Double) {
            return ((Double) num1).compareTo((Double) num2);
        }
        if (num1 instanceof BigInteger) {
            return ((BigInteger) num1).compareTo((BigInteger) num2);
        }
        // Should never happen
        throw new IllegalArgumentException("Unknown number type: " + num1.getClass());
    }
}
