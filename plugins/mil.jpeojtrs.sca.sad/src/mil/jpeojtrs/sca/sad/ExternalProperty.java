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
 * A representation of the model object '<em><b>External Property</b></em>'.
 * @since 2.3
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ExternalProperty#getCompRefID <em>Comp Ref ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ExternalProperty#getPropID <em>Prop ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ExternalProperty#getExternalPropID <em>External Prop ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getExternalProperty()
 * @model extendedMetaData="name='externalproperty' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface ExternalProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Comp Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Ref ID</em>' attribute.
	 * @see #setCompRefID(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getExternalProperty_CompRefID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='comprefid'"
	 * @generated
	 */
	String getCompRefID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ExternalProperty#getCompRefID <em>Comp Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Ref ID</em>' attribute.
	 * @see #getCompRefID()
	 * @generated
	 */
	void setCompRefID(String value);

	/**
	 * Returns the value of the '<em><b>Prop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop ID</em>' attribute.
	 * @see #setPropID(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getExternalProperty_PropID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='propid'"
	 * @generated
	 */
	String getPropID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ExternalProperty#getPropID <em>Prop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop ID</em>' attribute.
	 * @see #getPropID()
	 * @generated
	 */
	void setPropID(String value);

	/**
	 * Returns the value of the '<em><b>External Prop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Prop ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Prop ID</em>' attribute.
	 * @see #setExternalPropID(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getExternalProperty_ExternalPropID()
	 * @model extendedMetaData="kind='attribute' name='externalpropid'"
	 * @generated
	 */
	String getExternalPropID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ExternalProperty#getExternalPropID <em>External Prop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Prop ID</em>' attribute.
	 * @see #getExternalPropID()
	 * @generated
	 */
	void setExternalPropID(String value);

} // ExternalProperty
