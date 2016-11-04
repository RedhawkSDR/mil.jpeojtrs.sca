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

import mil.jpeojtrs.sca.prf.PropertyRefSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Dependency#getSoftPkgRef <em>Soft Pkg Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Dependency#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Dependency#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDependency()
 * @model extendedMetaData="name='dependency' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonEmptyDependency'"
 * @generated
 */
public interface Dependency extends PropertyRefSet {

	/**
	 * Returns the value of the '<em><b>Soft Pkg Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Pkg Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Pkg Ref</em>' containment reference.
	 * @see #setSoftPkgRef(SoftPkgRef)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDependency_SoftPkgRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='softpkgref' namespace='##targetNamespace'"
	 * @generated
	 */
	SoftPkgRef getSoftPkgRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Dependency#getSoftPkgRef <em>Soft Pkg Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Pkg Ref</em>' containment reference.
	 * @see #getSoftPkgRef()
	 * @generated
	 */
	void setSoftPkgRef(SoftPkgRef value);

	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' containment reference.
	 * @see #setPropertyRef(PropertyRef)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDependency_PropertyRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertyref' group='#properties:0'"
	 * @generated
	 */
	PropertyRef getPropertyRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Dependency#getPropertyRef <em>Property Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' containment reference.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(PropertyRef value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getDependency_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Dependency
