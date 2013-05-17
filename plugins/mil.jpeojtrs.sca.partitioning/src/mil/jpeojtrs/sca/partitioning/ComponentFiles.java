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
 * A representation of the model object '<em><b>Component Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFiles#getComponentFile <em>Component File</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFiles()
 * @model extendedMetaData="kind='elementOnly' name='componentfiles' qualified='false'"
 * @generated
 */
public interface ComponentFiles extends EObject {

	/**
	 * Returns the value of the '<em><b>Component File</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.ComponentFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component File</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFiles_ComponentFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentfile'"
	 * @generated
	 */
	EList<ComponentFile> getComponentFile();

} // ComponentFiles
