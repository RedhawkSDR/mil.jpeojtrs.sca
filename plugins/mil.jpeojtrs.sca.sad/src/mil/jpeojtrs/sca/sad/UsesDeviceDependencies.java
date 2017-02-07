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
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad;

import mil.jpeojtrs.sca.spd.UsesDevice;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Device Dependencies</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.UsesDeviceDependencies#getUsesdevice <em>Usesdevice</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getUsesDeviceDependencies()
 * @model extendedMetaData="name='usesdevicedependencies' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface UsesDeviceDependencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Usesdevice</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.UsesDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usesdevice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usesdevice</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getUsesDeviceDependencies_Usesdevice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesdevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsesDevice> getUsesdevice();

} // UsesDeviceDependencies
