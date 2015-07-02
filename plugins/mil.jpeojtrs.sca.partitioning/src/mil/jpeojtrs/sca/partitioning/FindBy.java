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
package mil.jpeojtrs.sca.partitioning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindBy#getNamingService <em>Naming Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindBy#getDomainFinder <em>Domain Finder</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindBy()
 * @model extendedMetaData="kind='elementOnly' name='findby' qualified='false'"
 * @generated
 */
public interface FindBy extends EObject {

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindBy_NamingService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namingservice'"
	 * @generated
	 */
	NamingService getNamingService();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.FindBy#getNamingService <em>Naming Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Service</em>' containment reference.
	 * @see #getNamingService()
	 * @generated
	 */
	void setNamingService(NamingService value);

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindBy_DomainFinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainfinder'"
	 * @generated
	 */
	DomainFinder getDomainFinder();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.FindBy#getDomainFinder <em>Domain Finder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Finder</em>' containment reference.
	 * @see #getDomainFinder()
	 * @generated
	 */
	void setDomainFinder(DomainFinder value);

} // FindBy
