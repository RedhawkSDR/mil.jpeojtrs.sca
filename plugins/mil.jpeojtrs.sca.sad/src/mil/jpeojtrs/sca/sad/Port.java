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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.Port#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.Port#getUsesIdentifier <em>Uses Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.Port#getProvidesIndentifier <em>Provides Indentifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.Port#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.Port#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getPort()
 * @model extendedMetaData="name='port' kind='elementOnly' qualified='false'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonEmptyPort'"
 * @generated
 */
public interface Port extends EObject {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getPort_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.Port#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getPort_UsesIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='usesidentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUsesIdentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.Port#getUsesIdentifier <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Identifier</em>' attribute.
	 * @see #getUsesIdentifier()
	 * @generated
	 */
	void setUsesIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Provides Indentifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Indentifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Indentifier</em>' attribute.
	 * @see #setProvidesIndentifier(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getPort_ProvidesIndentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='providesidentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProvidesIndentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.Port#getProvidesIndentifier <em>Provides Indentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Indentifier</em>' attribute.
	 * @see #getProvidesIndentifier()
	 * @generated
	 */
	void setProvidesIndentifier(String value);

	/**
	 * Returns the value of the '<em><b>Supported Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Identifier</em>' attribute.
	 * @see #setSupportedIdentifier(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getPort_SupportedIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='supportedidentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupportedIdentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.Port#getSupportedIdentifier <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Identifier</em>' attribute.
	 * @see #getSupportedIdentifier()
	 * @generated
	 */
	void setSupportedIdentifier(String value);

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getPort_ComponentInstantiationRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentinstantiationref' namespace='##targetNamespace'"
	 * @generated
	 */
	SadComponentInstantiationRef getComponentInstantiationRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.Port#getComponentInstantiationRef <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instantiation Ref</em>' containment reference.
	 * @see #getComponentInstantiationRef()
	 * @generated
	 */
	void setComponentInstantiationRef(SadComponentInstantiationRef value);

} // Port
