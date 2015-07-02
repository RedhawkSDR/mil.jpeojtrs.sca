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
package mil.jpeojtrs.sca.sad;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.AssemblyController#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getAssemblyController()
 * @model extendedMetaData="name='assemblycontroller' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface AssemblyController extends EObject {

	/**
	 * Returns the value of the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instantiation Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instantiation Ref</em>' containment reference.
	 * @see #setComponentInstantiationRef(SadComponentInstantiationRef)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getAssemblyController_ComponentInstantiationRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentinstantiationref' namespace='##targetNamespace'"
	 * @generated
	 */
	SadComponentInstantiationRef getComponentInstantiationRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.AssemblyController#getComponentInstantiationRef <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instantiation Ref</em>' containment reference.
	 * @see #getComponentInstantiationRef()
	 * @generated
	 */
	void setComponentInstantiationRef(SadComponentInstantiationRef value);

} // AssemblyController
