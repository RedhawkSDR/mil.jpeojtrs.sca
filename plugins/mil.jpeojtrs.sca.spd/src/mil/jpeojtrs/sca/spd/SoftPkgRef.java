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
package mil.jpeojtrs.sca.spd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Pkg Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplRef <em>Impl Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg <em>Soft Pkg</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkgRef()
 * @model extendedMetaData="name='softPkgRef' kind='elementOnly'"
 * @generated
 */
public interface SoftPkgRef extends EObject {

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
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkgRef_LocalFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localfile' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalFile getLocalFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getLocalFile <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File</em>' containment reference.
	 * @see #getLocalFile()
	 * @generated
	 */
	void setLocalFile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Impl Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Ref</em>' containment reference.
	 * @see #setImplRef(ImplRef)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkgRef_ImplRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implref' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplRef getImplRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplRef <em>Impl Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Ref</em>' containment reference.
	 * @see #getImplRef()
	 * @generated
	 */
	void setImplRef(ImplRef value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(Implementation)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkgRef_Implementation()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='implementation'"
	 * @generated
	 */
	Implementation getImplementation();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Implementation value);

	/**
	 * Returns the value of the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Pkg</em>' reference.
	 * @see #setSoftPkg(SoftPkg)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkgRef_SoftPkg()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='softPkg'"
	 * @generated
	 */
	SoftPkg getSoftPkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg <em>Soft Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Pkg</em>' reference.
	 * @see #getSoftPkg()
	 * @generated
	 */
	void setSoftPkg(SoftPkg value);

} // SoftPkgRef
