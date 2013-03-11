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

import org.eclipse.emf.ecore.EObject;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#getLocalMode <em>Local Mode</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractProperty()
 * @model abstract="true"
 *        extendedMetaData="name='abstractproperty' kind='elementOnly'"
 * @generated
 */
public interface AbstractProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description element is used to provide a description of the properties element that is being
	 * defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractProperty_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractProperty_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Local Mode</b></em>' attribute.
	 * The default value is <code>"readwrite"</code>.
	 * The literals are from the enumeration {@link mil.jpeojtrs.sca.prf.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Mode</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @see #isSetLocalMode()
	 * @see #unsetLocalMode()
	 * @see #setLocalMode(AccessType)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractProperty_LocalMode()
	 * @model default="readwrite" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	AccessType getLocalMode();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getLocalMode <em>Local Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Mode</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @see #isSetLocalMode()
	 * @see #unsetLocalMode()
	 * @see #getLocalMode()
	 * @generated
	 */
	void setLocalMode(AccessType value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getLocalMode <em>Local Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalMode()
	 * @see #getLocalMode()
	 * @see #setLocalMode(AccessType)
	 * @generated
	 */
	void unsetLocalMode();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getLocalMode <em>Local Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Mode</em>' attribute is set.
	 * @see #unsetLocalMode()
	 * @see #getLocalMode()
	 * @see #setLocalMode(AccessType)
	 * @generated
	 */
	boolean isSetLocalMode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractProperty_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link mil.jpeojtrs.sca.prf.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(AccessType)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractProperty_Mode()
	 * @model unsettable="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	AccessType getMode();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AccessType value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(AccessType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(AccessType)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="mil.jpeojtrs.sca.prf.Any"
	 * @generated
	 */
	Any toAny();

	/**
	 * Is this property one of the given type.  Performs an 'or' operations on the list of types. 
	 * @param types
	 * @return True if any of the given types is in this property
	 */
	boolean isKind(PropertyConfigurationType ... types);

} // AbstractProperty
