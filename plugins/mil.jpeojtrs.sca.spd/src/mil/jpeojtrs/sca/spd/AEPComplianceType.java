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
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.spd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>AEP Compliance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getAEPComplianceType()
 * @model extendedMetaData="name='aepcompliance_._type'"
 * @generated
 */
public enum AEPComplianceType implements Enumerator {
	/**
	 * The '<em><b>Aep Compliant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AEP_COMPLIANT_VALUE
	 * @generated
	 * @ordered
	 */
	AEP_COMPLIANT(0, "aepCompliant", "aep_compliant"),
	/**
	 * The '<em><b>Aep Non Compliant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #AEP_NON_COMPLIANT_VALUE
	 * @generated
	 * @ordered
	 */
	AEP_NON_COMPLIANT(1, "aepNonCompliant", "aep_non_compliant");

	/**
	 * The '<em><b>Aep Compliant</b></em>' literal value.
	 * <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Aep Compliant</b></em>' literal object isn't clear,
		 * there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
	 * @see #AEP_COMPLIANT
	 * @model name="aepCompliant" literal="aep_compliant"
	 * @generated
	 * @ordered
	 */
	public static final int AEP_COMPLIANT_VALUE = 0;
	/**
	 * The '<em><b>Aep Non Compliant</b></em>' literal value.
	 * <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Aep Non Compliant</b></em>' literal object isn't clear,
		 * there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
	 * @see #AEP_NON_COMPLIANT
	 * @model name="aepNonCompliant" literal="aep_non_compliant"
	 * @generated
	 * @ordered
	 */
	public static final int AEP_NON_COMPLIANT_VALUE = 1;
	/**
	 * An array of all the '<em><b>AEP Compliance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AEPComplianceType[] VALUES_ARRAY = new AEPComplianceType[] { AEP_COMPLIANT, AEP_NON_COMPLIANT, };
	/**
	 * A public read-only list of all the '<em><b>AEP Compliance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AEPComplianceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>AEP Compliance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AEPComplianceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AEPComplianceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AEP Compliance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AEPComplianceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AEPComplianceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AEP Compliance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AEPComplianceType get(int value) {
		switch (value) {
		case AEP_COMPLIANT_VALUE:
			return AEP_COMPLIANT;
		case AEP_NON_COMPLIANT_VALUE:
			return AEP_NON_COMPLIANT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;
	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;
	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	private AEPComplianceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //AEPComplianceType
