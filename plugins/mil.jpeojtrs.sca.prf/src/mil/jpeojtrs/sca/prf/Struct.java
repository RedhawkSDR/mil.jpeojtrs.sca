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
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getFields <em>Fields</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getSimple <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getSimpleSequence <em>Simple Sequence</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getConfigurationKind <em>Configuration Kind</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct()
 * @model extendedMetaData="name='struct' kind='elementOnly'"
 * @generated
 */
public interface Struct extends AbstractProperty, PropertyContainer {

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct_Fields()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='fields:0'"
	 * @generated
	 */
	FeatureMap getFields();

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct_Simple()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simple' group='#fields:0'"
	 * @generated
	 */
	EList<Simple> getSimple();

	/**
	 * Returns the value of the '<em><b>Simple Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Sequence</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct_SimpleSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplesequence' group='#fields:0'"
	 * @generated
	 */
	EList<SimpleSequence> getSimpleSequence();

	/**
	 * Returns the value of the '<em><b>Configuration Kind</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.ConfigurationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Kind</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Kind</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct_ConfigurationKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurationkind'"
	 * @generated
	 */
	EList<ConfigurationKind> getConfigurationKind();

} // Struct
