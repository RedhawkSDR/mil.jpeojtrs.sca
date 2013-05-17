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

import mil.jpeojtrs.sca.partitioning.NamingService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.FindComponent#getComponentResourceFactoryRef <em>Component Resource Factory Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.FindComponent#getNamingService <em>Naming Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getFindComponent()
 * @model extendedMetaData="name='findcomponent' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface FindComponent extends EObject {

	/**
	 * Returns the value of the '<em><b>Component Resource Factory Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Resource Factory Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Resource Factory Ref</em>' containment reference.
	 * @see #setComponentResourceFactoryRef(ComponentResourceFactoryRef)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getFindComponent_ComponentResourceFactoryRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentresourcefactoryref' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentResourceFactoryRef getComponentResourceFactoryRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.FindComponent#getComponentResourceFactoryRef <em>Component Resource Factory Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Resource Factory Ref</em>' containment reference.
	 * @see #getComponentResourceFactoryRef()
	 * @generated
	 */
	void setComponentResourceFactoryRef(ComponentResourceFactoryRef value);

	/**
	 * Returns the value of the '<em><b>Naming Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Naming Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming Service</em>' containment reference.
	 * @see #setNamingService(NamingService)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getFindComponent_NamingService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namingservice' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingService getNamingService();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.FindComponent#getNamingService <em>Naming Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Service</em>' containment reference.
	 * @see #getNamingService()
	 * @generated
	 */
	void setNamingService(NamingService value);

} // FindComponent
