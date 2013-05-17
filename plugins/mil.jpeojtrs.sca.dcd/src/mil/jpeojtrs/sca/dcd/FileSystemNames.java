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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The optional filesystemnames element indicates the mounted file system names for CF
 * DeviceManager’s FileManager.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.FileSystemNames#getFileSystemName <em>File System Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getFileSystemNames()
 * @model extendedMetaData="name='filesystemnames' kind='elementOnly'"
 * @generated
 */
public interface FileSystemNames extends EObject {

	/**
	 * Returns the value of the '<em><b>File System Name</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.dcd.FileSystemName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File System Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File System Name</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getFileSystemNames_FileSystemName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filesystemname'"
	 * @generated
	 */
	EList<FileSystemName> getFileSystemName();

} // FileSystemNames
