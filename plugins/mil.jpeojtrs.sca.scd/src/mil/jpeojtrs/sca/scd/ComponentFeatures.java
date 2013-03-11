/**
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 * 
 * This file is part of REDHAWK IDE.
 * 
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package mil.jpeojtrs.sca.scd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.ComponentFeatures#getSupportsInterface <em>Supports Interface</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.ComponentFeatures#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getComponentFeatures()
 * @model extendedMetaData="name='componentFeatures' kind='elementOnly'"
 * @generated
 */
public interface ComponentFeatures extends EObject {

	/**
	 * Returns the value of the '<em><b>Supports Interface</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.scd.SupportsInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Interface</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getComponentFeatures_SupportsInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportsinterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportsInterface> getSupportsInterface();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(Ports)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getComponentFeatures_Ports()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ports' namespace='##targetNamespace'"
	 * @generated
	 */
	Ports getPorts();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.ComponentFeatures#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(Ports value);

} // ComponentFeatures
