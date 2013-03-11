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
package mil.jpeojtrs.sca.dcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Part Of Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The compositepartofdevice element is used when an aggregate relationship exists to reference the
 * componentinstantiation element that describes the whole Device for which this Device’s
 * componentinstantiation element describes a part of the aggregate Device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent <em>Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getCompositePartOfDevice()
 * @model extendedMetaData="name='compositepartofdevice' kind='empty'"
 * @generated
 */
public interface CompositePartOfDevice extends EObject {

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(DcdComponentInstantiation)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getCompositePartOfDevice_Component()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	DcdComponentInstantiation getComponent();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(DcdComponentInstantiation value);

	/**
	 * Returns the value of the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref ID</em>' attribute.
	 * @see #setRefID(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getCompositePartOfDevice_RefID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='refid'"
	 * @generated
	 */
	String getRefID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getRefID <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref ID</em>' attribute.
	 * @see #getRefID()
	 * @generated
	 */
	void setRefID(String value);

} // CompositePartOfDevice
