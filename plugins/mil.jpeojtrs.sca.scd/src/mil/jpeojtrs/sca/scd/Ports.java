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
package mil.jpeojtrs.sca.scd;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Ports#getGroup <em>Group</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.Ports#getProvides <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.Ports#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getPorts()
 * @model extendedMetaData="name='ports' kind='elementOnly'"
 * @generated
 */
public interface Ports extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getPorts_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.scd.Provides}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getPorts_Provides()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='provides' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Provides> getProvides();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.scd.Uses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getPorts_Uses()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uses' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Uses> getUses();

	/**
	 * <!-- begin-user-doc -->
	 * Gets the {@link AbstractPort} of the specified name.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	AbstractPort getPort(String name);

	/**
	 * @since 3.0
	 * @return An unmodifiable list of all the ports
	 */
	List<AbstractPort> getAllPorts();

	public static String[] RESERVED_NAMES = new String[] { Uses.PORT_NAME_PROP_EVENTS };

} // Ports
