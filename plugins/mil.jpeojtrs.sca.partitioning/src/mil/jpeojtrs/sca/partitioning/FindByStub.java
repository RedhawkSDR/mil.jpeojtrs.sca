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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find By Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindByStub#getNamingService <em>Naming Service</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindByStub#getDomainFinder <em>Domain Finder</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindByStub#getProvides <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindByStub#getUses <em>Uses</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindByStub#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStub()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidFindByStub'"
 * @generated
 */
public interface FindByStub extends ConnectionTarget {

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStub_NamingService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namingservice'"
	 * @generated
	 */
	NamingService getNamingService();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getNamingService <em>Naming Service</em>}' containment reference.
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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStub_DomainFinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainfinder'"
	 * @generated
	 */
	DomainFinder getDomainFinder();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getDomainFinder <em>Domain Finder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Finder</em>' containment reference.
	 * @see #getDomainFinder()
	 * @generated
	 */
	void setDomainFinder(DomainFinder value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStub_Provides()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provides'"
	 * @generated
	 */
	EList<ProvidesPortStub> getProvides();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.UsesPortStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStub_Uses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uses'"
	 * @generated
	 */
	EList<UsesPortStub> getUses();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(ComponentSupportedInterfaceStub)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStub_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceports'"
	 * @generated
	 */
	ComponentSupportedInterfaceStub getInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.FindByStub#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ComponentSupportedInterfaceStub value);

} // FindByStub
