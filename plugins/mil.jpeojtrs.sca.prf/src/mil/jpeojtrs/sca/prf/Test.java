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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Test#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Test#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Test#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Test#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getTest()
 * @model extendedMetaData="name='test' kind='elementOnly'"
 * @generated
 */
public interface Test extends EObject {
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
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getTest_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Test#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference.
	 * @see #setInputValue(InputValue)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getTest_InputValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputvalue'"
	 * @generated
	 */
	InputValue getInputValue();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Test#getInputValue <em>Input Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Value</em>' containment reference.
	 * @see #getInputValue()
	 * @generated
	 */
	void setInputValue(InputValue value);

	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' containment reference.
	 * @see #setResultValue(ResultValue)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getTest_ResultValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resultvalue'"
	 * @generated
	 */
	ResultValue getResultValue();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Test#getResultValue <em>Result Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' containment reference.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(ResultValue value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getTest_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Test#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * @deprecated Switch to using {@link #getInputValue()}
	 * @generated NOT
	 */
	@Deprecated
	InputValue getInputvalue();

} // Test
