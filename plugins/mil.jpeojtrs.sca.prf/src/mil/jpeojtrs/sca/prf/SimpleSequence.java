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
 * A representation of the model object '<em><b>Simple Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getValues <em>Values</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getUnits <em>Units</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getRange <em>Range</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getKind <em>Kind</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getAction <em>Action</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence()
 * @model extendedMetaData="name='simplesequence' kind='elementOnly'"
 * @generated
 */
public interface SimpleSequence extends AbstractProperty {

	/**
     * Returns the value of the '<em><b>Values</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference.
     * @see #setValues(Values)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Values()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='values'"
     * @generated
     */
	Values getValues();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getValues <em>Values</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Values</em>' containment reference.
     * @see #getValues()
     * @generated
     */
	void setValues(Values value);

	/**
     * Returns the value of the '<em><b>Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' attribute.
     * @see #setUnits(String)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Units()
     * @model dataType="mil.jpeojtrs.sca.prf.Unit"
     *        extendedMetaData="kind='element' name='units'"
     * @generated
     */
	String getUnits();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getUnits <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Units</em>' attribute.
     * @see #getUnits()
     * @generated
     */
	void setUnits(String value);

	/**
     * Returns the value of the '<em><b>Range</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Range</em>' containment reference.
     * @see #setRange(Range)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Range()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='range'"
     * @generated
     */
	Range getRange();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getRange <em>Range</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range</em>' containment reference.
     * @see #getRange()
     * @generated
     */
	void setRange(Range value);

	/**
     * Returns the value of the '<em><b>Kind</b></em>' containment reference list.
     * The list contents are of type {@link mil.jpeojtrs.sca.prf.Kind}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' containment reference list.
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Kind()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='kind'"
     * @generated
     */
	EList<Kind> getKind();

	/**
     * Returns the value of the '<em><b>Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' containment reference.
     * @see #setAction(Action)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Action()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='action'"
     * @generated
     */
	Action getAction();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getAction <em>Action</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' containment reference.
     * @see #getAction()
     * @generated
     */
	void setAction(Action value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link mil.jpeojtrs.sca.prf.PropertyValueType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see mil.jpeojtrs.sca.prf.PropertyValueType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(PropertyValueType)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
	PropertyValueType getType();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see mil.jpeojtrs.sca.prf.PropertyValueType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
	void setType(PropertyValueType value);

	/**
     * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(PropertyValueType)
     * @generated
     */
	void unsetType();

	/**
     * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(PropertyValueType)
     * @generated
     */
	boolean isSetType();

	/**
     * Returns the value of the '<em><b>Complex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Complex</em>' attribute.
     * @see #setComplex(Boolean)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimpleSequence_Complex()
     * @model extendedMetaData="kind='attribute' name='complex'"
     * @generated
     */
    Boolean getComplex();

    /**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getComplex <em>Complex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex</em>' attribute.
     * @see #getComplex()
     * @generated
     */
    void setComplex(Boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    boolean isComplex();

} // SimpleSequence
