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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supports Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.SupportsInterface#getRepId <em>Rep Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SupportsInterface#getSupportsName <em>Supports Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SupportsInterface#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SupportsInterface#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSupportsInterface()
 * @model extendedMetaData="name='supportsInterface' kind='empty'"
 * @generated
 */
public interface SupportsInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Rep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repid attribute is the unique repository id of the interface, which has formats specified in the CORBA specification. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rep Id</em>' attribute.
	 * @see #setRepId(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSupportsInterface_RepId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='repid'"
	 * @generated
	 */
	String getRepId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getRepId <em>Rep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Id</em>' attribute.
	 * @see #getRepId()
	 * @generated
	 */
	void setRepId(String value);

	/**
	 * Returns the value of the '<em><b>Supports Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Name</em>' attribute.
	 * @see #setSupportsName(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSupportsInterface_SupportsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='supportsname'"
	 * @generated
	 */
	String getSupportsName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getSupportsName <em>Supports Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Name</em>' attribute.
	 * @see #getSupportsName()
	 * @generated
	 */
	void setSupportsName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSupportsInterface_Id()
	 * @model id="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSupportsInterface_Interface()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	public static final class Util {
	// END GENERATED CODE
		private static final String ID_PREFIX = "supportsInterface:";
		private Util() {
			
		}
		public static String buildId(String repId) {
			return ID_PREFIX + repId;
		}
	// BEGIN GENERATED CODE
	}

} // SupportsInterface
