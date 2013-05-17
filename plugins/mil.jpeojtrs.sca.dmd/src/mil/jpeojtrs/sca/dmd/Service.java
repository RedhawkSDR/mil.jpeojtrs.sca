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
package mil.jpeojtrs.sca.dmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.Service#getUsesIdentifier <em>Uses Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.Service#getFindBy <em>Find By</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getService()
 * @model extendedMetaData="name='service' kind='elementOnly'"
 * @generated
 */
public interface Service extends EObject {

	/**
	 * Returns the value of the '<em><b>Uses Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Identifier</em>' attribute.
	 * @see #setUsesIdentifier(String)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getService_UsesIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='usesidentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUsesIdentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.Service#getUsesIdentifier <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Identifier</em>' attribute.
	 * @see #getUsesIdentifier()
	 * @generated
	 */
	void setUsesIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find By</em>' containment reference.
	 * @see #setFindBy(FindBy)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getService_FindBy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='findby' namespace='##targetNamespace'"
	 * @generated
	 */
	FindBy getFindBy();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.Service#getFindBy <em>Find By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find By</em>' containment reference.
	 * @see #getFindBy()
	 * @generated
	 */
	void setFindBy(FindBy value);

} // Service
