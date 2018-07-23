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
 * A representation of the model object '<em><b>Configuration Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.ConfigurationKind#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getConfigurationKind()
 * @model extendedMetaData="name='configurationkind' kind='empty'"
 * @generated
 */
public interface ConfigurationKind extends EObject {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"configure"</code>.
	 * The literals are from the enumeration {@link mil.jpeojtrs.sca.prf.StructPropertyConfigurationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(StructPropertyConfigurationType)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getConfigurationKind_Type()
	 * @model default="configure" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kindtype'"
	 * @generated
	 */
	StructPropertyConfigurationType getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.ConfigurationKind#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(StructPropertyConfigurationType value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.ConfigurationKind#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(StructPropertyConfigurationType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.ConfigurationKind#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(StructPropertyConfigurationType)
	 * @generated
	 */
	boolean isSetType();

} // ConfigurationKind
