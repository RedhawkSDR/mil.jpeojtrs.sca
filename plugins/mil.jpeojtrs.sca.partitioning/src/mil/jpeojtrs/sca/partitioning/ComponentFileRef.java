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
package mil.jpeojtrs.sca.partitioning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component File Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The componentfileref element is used to reference a componentfile element within the
 * componentfiles element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile <em>File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getRefid <em>Refid</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFileRef()
 * @model extendedMetaData="kind='elementOnly' name='componentfileref' qualified='false'"
 * @generated
 */
public interface ComponentFileRef extends EObject {

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The componentfileref element’s refid attribute corresponds to a
	 * componentfile element’s id attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(ComponentFile)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFileRef_File()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='file'"
	 * @generated
	 */
	ComponentFile getFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(ComponentFile value);

	/**
	 * Returns the value of the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refid</em>' attribute.
	 * @see #setRefid(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFileRef_Refid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='refid'"
	 * @generated
	 */
	String getRefid();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getRefid <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refid</em>' attribute.
	 * @see #getRefid()
	 * @generated
	 */
	void setRefid(String value);

} // ComponentFileRef
