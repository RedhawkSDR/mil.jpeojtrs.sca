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
package mil.jpeojtrs.sca.spd;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Code#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Code#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Code#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Code#getPriority <em>Priority</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Code#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCode()
 * @model extendedMetaData="name='code' kind='elementOnly'"
 * @generated
 */
public interface Code extends EObject {

	/**
	 * Returns the value of the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local File</em>' containment reference.
	 * @see #setLocalFile(LocalFile)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCode_LocalFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalFile getLocalFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Code#getLocalFile <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File</em>' containment reference.
	 * @see #getLocalFile()
	 * @generated
	 */
	void setLocalFile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' attribute.
	 * @see #setEntryPoint(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCode_EntryPoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='entrypoint' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEntryPoint();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Code#getEntryPoint <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' attribute.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Size</em>' attribute.
	 * @see #setStackSize(BigInteger)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCode_StackSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='stacksize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStackSize();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Code#getStackSize <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Size</em>' attribute.
	 * @see #getStackSize()
	 * @generated
	 */
	void setStackSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(BigInteger)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCode_Priority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPriority();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Code#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mil.jpeojtrs.sca.spd.CodeFileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mil.jpeojtrs.sca.spd.CodeFileType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(CodeFileType)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCode_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	CodeFileType getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Code#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mil.jpeojtrs.sca.spd.CodeFileType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeFileType value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.spd.Code#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(CodeFileType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.spd.Code#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(CodeFileType)
	 * @generated
	 */
	boolean isSetType();

} // Code
