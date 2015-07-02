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

import mil.jpeojtrs.sca.spd.SoftPkg;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg <em>Soft Pkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFile()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='componentfile' qualified='false'"
 * @generated
 */
public interface ComponentFile extends EObject {

	/**
	 * Returns the value of the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local File</em>' containment reference.
	 * @see #setLocalFile(LocalFile)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFile_LocalFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile'"
	 * @generated
	 */
	LocalFile getLocalFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getLocalFile <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File</em>' containment reference.
	 * @see #getLocalFile()
	 * @generated
	 */
	void setLocalFile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFile_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Pkg</em>' reference.
	 * @see #setSoftPkg(SoftPkg)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFile_SoftPkg()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='softPkg'"
	 * @generated
	 */
	SoftPkg getSoftPkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg <em>Soft Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Pkg</em>' reference.
	 * @see #getSoftPkg()
	 * @generated
	 */
	void setSoftPkg(SoftPkg value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentFile_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ComponentFile
