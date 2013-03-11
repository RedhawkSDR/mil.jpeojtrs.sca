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
package mil.jpeojtrs.sca.prf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sequence Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequenceRef#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequenceRef()
 * @model extendedMetaData="kind='elementOnly' name='simplesequenceref' qualified='false'"
 * @generated
 */
public interface SimpleSequenceRef extends AbstractPropertyRef<SimpleSequence> {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference.
	 * @see #setValues(Values)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequenceRef_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Values getValues();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequenceRef#getValues <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' containment reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Values value);

} // SimpleSequenceRef
