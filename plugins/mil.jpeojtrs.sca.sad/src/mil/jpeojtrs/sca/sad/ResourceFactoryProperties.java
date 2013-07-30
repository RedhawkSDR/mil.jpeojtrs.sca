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

import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Factory Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getGroup <em>Group</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getFactoryRef <em>Factory Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties()
 * @model extendedMetaData="name='resourcefactoryproperties' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface ResourceFactoryProperties extends PropertyRefContainer {

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties_SimpleRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpleref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimpleRef> getSimpleRef();

	/**
	 * Returns the value of the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleSequenceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Sequence Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Sequence Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties_SimpleSequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplesequenceref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimpleSequenceRef> getSimpleSequenceRef();

	/**
	 * Returns the value of the '<em><b>Struct Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties_StructRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StructRef> getStructRef();

	/**
	 * Returns the value of the '<em><b>Struct Sequence Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructSequenceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Sequence Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Sequence Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties_StructSequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structsequenceref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StructSequenceRef> getStructSequenceRef();

	/**
	 * Returns the value of the '<em><b>Factory Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getResourceFactoryProperties <em>Resource Factory Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Ref</em>' container reference.
	 * @see #setFactoryRef(ComponentResourceFactoryRef)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getResourceFactoryProperties_FactoryRef()
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getResourceFactoryProperties
	 * @model opposite="resourceFactoryProperties" required="true" transient="false"
	 * @generated
	 */
	ComponentResourceFactoryRef getFactoryRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getFactoryRef <em>Factory Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Ref</em>' container reference.
	 * @see #getFactoryRef()
	 * @generated
	 */
	void setFactoryRef(ComponentResourceFactoryRef value);

} // ResourceFactoryProperties
