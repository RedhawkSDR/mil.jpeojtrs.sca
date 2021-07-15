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
 * A representation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Child#getChildSoftwarePackageFile <em>Child Software Package File</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getChild()
 * @model extendedMetaData="name='child' kind='elementOnly'"
 * @generated
 */
public interface Child extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Software Package File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Software Package File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Software Package File</em>' containment reference.
	 * @see #setChildSoftwarePackageFile(ChildSoftwarePackageFile)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getChild_ChildSoftwarePackageFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='childSoftwarePackageFile' namespace='##targetNamespace'"
	 * @generated
	 */
	ChildSoftwarePackageFile getChildSoftwarePackageFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Child#getChildSoftwarePackageFile <em>Child Software Package File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Software Package File</em>' containment reference.
	 * @see #getChildSoftwarePackageFile()
	 * @generated
	 */
	void setChildSoftwarePackageFile(ChildSoftwarePackageFile value);

} // Child
