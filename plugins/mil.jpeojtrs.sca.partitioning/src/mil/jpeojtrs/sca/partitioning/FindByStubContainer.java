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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find By Stub Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.FindByStubContainer#getStubs <em>Stubs</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStubContainer()
 * @model
 * @generated
 */
public interface FindByStubContainer extends EObject {

	/**
	 * Returns the value of the '<em><b>Stubs</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.FindByStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stubs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stubs</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getFindByStubContainer_Stubs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stubs'"
	 * @generated
	 */
	EList<FindByStub> getStubs();

} // FindByStubContainer
