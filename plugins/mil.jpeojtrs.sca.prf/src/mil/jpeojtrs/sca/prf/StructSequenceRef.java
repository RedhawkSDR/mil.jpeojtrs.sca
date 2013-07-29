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
package mil.jpeojtrs.sca.prf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Sequence Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructSequenceRef#getStructValue <em>Struct Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructSequenceRef()
 * @model extendedMetaData="kind='elementOnly' name='structsequenceref' qualified='false'"
 * @generated
 */
public interface StructSequenceRef extends AbstractPropertyRef<StructSequence>, PropertyRefContainer {

	/**
	 * Returns the value of the '<em><b>Struct Value</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Value</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructSequenceRef_StructValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structvalue'"
	 * @generated
	 */
	EList<StructValue> getStructValue();

} // StructSequenceRef
