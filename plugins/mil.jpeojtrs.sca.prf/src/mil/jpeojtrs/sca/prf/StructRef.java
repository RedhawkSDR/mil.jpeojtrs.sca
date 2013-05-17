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
 * A representation of the model object '<em><b>Struct Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructRef#getSimpleRef <em>Simple Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructRef()
 * @model extendedMetaData="kind='elementOnly' name='structref' qualified='false'"
 * @generated
 */
public interface StructRef extends AbstractPropertyRef<Struct>, PropertyRefContainer {

	/**
	 * Returns the value of the '<em><b>Simple Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructRef_SimpleRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='simpleref'"
	 * @generated
	 */
	EList<SimpleRef> getSimpleRef();

} // StructRef
