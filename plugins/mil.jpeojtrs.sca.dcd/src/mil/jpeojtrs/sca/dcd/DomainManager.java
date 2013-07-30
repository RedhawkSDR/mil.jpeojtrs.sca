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
package mil.jpeojtrs.sca.dcd;

import mil.jpeojtrs.sca.partitioning.NamingService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The domainmanager element (see Figure D-37) indicates how to obtain the CF DomainManager
 * object reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DomainManager#getNamingService <em>Naming Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DomainManager#getStringifiedObjectRef <em>Stringified Object Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDomainManager()
 * @model extendedMetaData="name='domainmanager' kind='elementOnly'"
 * @generated
 */
public interface DomainManager extends EObject {

	/**
	 * Returns the value of the '<em><b>Naming Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Naming Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming Service</em>' containment reference.
	 * @see #setNamingService(NamingService)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDomainManager_NamingService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namingservice'"
	 * @generated
	 */
	NamingService getNamingService();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DomainManager#getNamingService <em>Naming Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Service</em>' containment reference.
	 * @see #getNamingService()
	 * @generated
	 */
	void setNamingService(NamingService value);

	/**
	 * Returns the value of the '<em><b>Stringified Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stringified Object Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringified Object Ref</em>' attribute.
	 * @see #setStringifiedObjectRef(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDomainManager_StringifiedObjectRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='stringifiedobjectref'"
	 * @generated
	 */
	String getStringifiedObjectRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DomainManager#getStringifiedObjectRef <em>Stringified Object Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringified Object Ref</em>' attribute.
	 * @see #getStringifiedObjectRef()
	 * @generated
	 */
	void setStringifiedObjectRef(String value);

} // DomainManager
