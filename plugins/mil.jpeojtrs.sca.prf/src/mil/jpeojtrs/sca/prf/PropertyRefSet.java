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
package mil.jpeojtrs.sca.prf;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Ref Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefSet()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='propertyrefset' qualified='false'"
 * @generated
 */
public interface PropertyRefSet extends PropertyRefContainer {

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefSet_Properties()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='properties:0'"
	 * @generated
	 */
	FeatureMap getProperties();

	/**
	 * Returns the value of the '<em><b>Simple Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Ref</em>' containment reference.
	 * @see #setSimpleRef(SimpleRef)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefSet_SimpleRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpleref' group='#properties:0'"
	 * @generated
	 */
	SimpleRef getSimpleRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleRef <em>Simple Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Ref</em>' containment reference.
	 * @see #getSimpleRef()
	 * @generated
	 */
	void setSimpleRef(SimpleRef value);

	/**
	 * Returns the value of the '<em><b>Simple Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Sequence Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Sequence Ref</em>' containment reference.
	 * @see #setSimpleSequenceRef(SimpleSequenceRef)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefSet_SimpleSequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplesequenceref' group='#properties:0'"
	 * @generated
	 */
	SimpleSequenceRef getSimpleSequenceRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleSequenceRef <em>Simple Sequence Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Sequence Ref</em>' containment reference.
	 * @see #getSimpleSequenceRef()
	 * @generated
	 */
	void setSimpleSequenceRef(SimpleSequenceRef value);

	/**
	 * Returns the value of the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Ref</em>' containment reference.
	 * @see #setStructRef(StructRef)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefSet_StructRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structref' group='#properties:0'"
	 * @generated
	 */
	StructRef getStructRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getStructRef <em>Struct Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Ref</em>' containment reference.
	 * @see #getStructRef()
	 * @generated
	 */
	void setStructRef(StructRef value);

	/**
	 * Returns the value of the '<em><b>Struct Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Sequence Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Sequence Ref</em>' containment reference.
	 * @see #setStructSequenceRef(StructSequenceRef)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefSet_StructSequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structsequenceref' group='#properties:0'"
	 * @generated
	 */
	StructSequenceRef getStructSequenceRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getStructSequenceRef <em>Struct Sequence Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Sequence Ref</em>' containment reference.
	 * @see #getStructSequenceRef()
	 * @generated
	 */
	void setStructSequenceRef(StructSequenceRef value);

} // PropertyRefSet
