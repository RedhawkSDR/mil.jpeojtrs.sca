/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Resource Factory Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getResourceFactoryProperties <em>Resource Factory Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getRefid <em>Refid</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getComponentResourceFactoryRef()
 * @model extendedMetaData="name='componentresourcefactoryref' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface ComponentResourceFactoryRef extends EObject {

	/**
	 * Returns the value of the '<em><b>Resource Factory Properties</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getFactoryRef <em>Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Factory Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Factory Properties</em>' containment reference.
	 * @see #setResourceFactoryProperties(ResourceFactoryProperties)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getComponentResourceFactoryRef_ResourceFactoryProperties()
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getFactoryRef
	 * @model opposite="factoryRef" containment="true"
	 *        extendedMetaData="kind='element' name='resourcefactoryproperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceFactoryProperties getResourceFactoryProperties();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getResourceFactoryProperties <em>Resource Factory Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Factory Properties</em>' containment reference.
	 * @see #getResourceFactoryProperties()
	 * @generated
	 */
	void setResourceFactoryProperties(ResourceFactoryProperties value);

	/**
	 * Returns the value of the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refid</em>' attribute.
	 * @see #setRefid(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getComponentResourceFactoryRef_Refid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='refid'"
	 * @generated
	 */
	String getRefid();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getRefid <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refid</em>' attribute.
	 * @see #getRefid()
	 * @generated
	 */
	void setRefid(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(SadComponentInstantiation)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getComponentResourceFactoryRef_Component()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	SadComponentInstantiation getComponent();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(SadComponentInstantiation value);

} // ComponentResourceFactoryRef
