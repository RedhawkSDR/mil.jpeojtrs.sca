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
package mil.jpeojtrs.sca.dmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.FindBy#getNameService <em>Name Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.FindBy#getStringifiedObjectRef <em>Stringified Object Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.FindBy#getDomainFinder <em>Domain Finder</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getFindBy()
 * @model extendedMetaData="name='findby' kind='elementOnly'"
 * @generated
 */
public interface FindBy extends EObject {

	/**
	 * Returns the value of the '<em><b>Name Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Service</em>' containment reference.
	 * @see #setNameService(NamingService)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getFindBy_NameService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namingservice' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingService getNameService();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.FindBy#getNameService <em>Name Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Service</em>' containment reference.
	 * @see #getNameService()
	 * @generated
	 */
	void setNameService(NamingService value);

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
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getFindBy_StringifiedObjectRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='stringifiedobjectref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringifiedObjectRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.FindBy#getStringifiedObjectRef <em>Stringified Object Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringified Object Ref</em>' attribute.
	 * @see #getStringifiedObjectRef()
	 * @generated
	 */
	void setStringifiedObjectRef(String value);

	/**
	 * Returns the value of the '<em><b>Domain Finder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Finder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Finder</em>' containment reference.
	 * @see #setDomainFinder(DomainFinder)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getFindBy_DomainFinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainfinder' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainFinder getDomainFinder();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.FindBy#getDomainFinder <em>Domain Finder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Finder</em>' containment reference.
	 * @see #getDomainFinder()
	 * @generated
	 */
	void setDomainFinder(DomainFinder value);

} // FindBy
