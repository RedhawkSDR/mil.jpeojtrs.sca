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
package mil.jpeojtrs.sca.scd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Provides#getProvidesName <em>Provides Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getProvides()
 * @model extendedMetaData="name='provides' kind='elementOnly'"
 * @generated
 */
public interface Provides extends AbstractPort {

	/**
	 * Returns the value of the '<em><b>Provides Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Name</em>' attribute.
	 * @see #setProvidesName(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getProvides_ProvidesName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='providesname'"
	 * @generated
	 */
	String getProvidesName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.Provides#getProvidesName <em>Provides Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Name</em>' attribute.
	 * @see #getProvidesName()
	 * @generated
	 */
	void setProvidesName(String value);

} // Provides
