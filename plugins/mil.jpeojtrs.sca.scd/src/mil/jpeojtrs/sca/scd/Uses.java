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
 * A representation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Uses#getUsesName <em>Uses Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getUses()
 * @model extendedMetaData="name='uses' kind='elementOnly'"
 * @generated
 */
public interface Uses extends AbstractPort {
	
	/**
	 * Returns the value of the '<em><b>Uses Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Name</em>' attribute.
	 * @see #setUsesName(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getUses_UsesName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='usesname'"
	 * @generated
	 */
	String getUsesName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.Uses#getUsesName <em>Uses Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Name</em>' attribute.
	 * @see #getUsesName()
	 * @generated
	 */
	void setUsesName(String value);

	String PORT_NAME_PROP_EVENTS = "propEvent";

} // Uses
