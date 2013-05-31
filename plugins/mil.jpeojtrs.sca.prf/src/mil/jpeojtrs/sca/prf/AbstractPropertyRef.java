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
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getRefID <em>Ref ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractPropertyRef()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='propertyref' qualified='false'"
 * @generated
 */
public interface AbstractPropertyRef<P extends AbstractProperty> extends EObject {

	/**
     * Returns the value of the '<em><b>Ref ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ref ID</em>' attribute.
     * @see #setRefID(String)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractPropertyRef_RefID()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='refid'"
     * @generated
     */
	String getRefID();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getRefID <em>Ref ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref ID</em>' attribute.
     * @see #getRefID()
     * @generated
     */
	void setRefID(String value);

	/**
     * Returns the value of the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' reference.
     * @see #setProperty(AbstractProperty)
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getAbstractPropertyRef_Property()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	P getProperty();

	/**
     * Sets the value of the '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty <em>Property</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' reference.
     * @see #getProperty()
     * @generated
     */
	void setProperty(P value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model dataType="mil.jpeojtrs.sca.prf.Any"
     * @generated
     */
	Any toAny();

} // PropertyRef
