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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Enumerations#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getEnumerations()
 * @model extendedMetaData="name='enumerations' kind='elementOnly'"
 * @generated
 */
public interface Enumerations extends EObject {

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getEnumerations_Enumeration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='enumeration'"
	 * @generated
	 */
	EList<Enumeration> getEnumeration();

} // Enumerations
