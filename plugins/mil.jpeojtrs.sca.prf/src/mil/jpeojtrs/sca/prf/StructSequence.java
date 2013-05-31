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
 * A representation of the model object '<em><b>Struct Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructSequence#getStruct <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructSequence#getStructValue <em>Struct Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructSequence#getConfigurationKind <em>Configuration Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructSequence()
 * @model extendedMetaData="name='structsequence' kind='elementOnly'"
 * @generated
 */
public interface StructSequence extends AbstractProperty, PropertyContainer {
	/**
     * Returns the value of the '<em><b>Struct</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Struct</em>' containment reference.
     * @see #setStruct(Struct)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructSequence_Struct()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='struct'"
     * @generated
     */
	Struct getStruct();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.StructSequence#getStruct <em>Struct</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Struct</em>' containment reference.
     * @see #getStruct()
     * @generated
     */
	void setStruct(Struct value);

	/**
     * Returns the value of the '<em><b>Struct Value</b></em>' containment reference list.
     * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructValue}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Struct Value</em>' containment reference list.
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructSequence_StructValue()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='structvalue'"
     * @generated
     */
	EList<StructValue> getStructValue();

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
     * @see #isSetConfigurationKind()
     * @see #unsetConfigurationKind()
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructSequence_ConfigurationKind()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="kind='element' name='configurationkind'"
     * @generated
     */
	EList<ConfigurationKind> getConfigurationKind();

	/**
     * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.StructSequence#getConfigurationKind <em>Configuration Kind</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetConfigurationKind()
     * @see #getConfigurationKind()
     * @generated
     */
	void unsetConfigurationKind();

	/**
     * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.StructSequence#getConfigurationKind <em>Configuration Kind</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Configuration Kind</em>' containment reference list is set.
     * @see #unsetConfigurationKind()
     * @see #getConfigurationKind()
     * @generated
     */
	boolean isSetConfigurationKind();

	/**
	 * @deprecated Switch to using {@link #getStructValue()}
	 * @generated NOT
	 */
	@Deprecated
	EList<StructValue> getStructvalue();

} // StructSequence
