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
package mil.jpeojtrs.sca.profile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The profile element can be used to specify the absolute profile file pathname relative to a mounted CF FileSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.profile.Profile#getFilename <em>Filename</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.profile.Profile#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.profile.ProfilePackage#getProfile()
 * @model extendedMetaData="name='profile' kind='empty'"
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The filename attribute is the absolute pathname relative to a mounted FileSystem. This filename can also be used to access any other local file elements in the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see mil.jpeojtrs.sca.profile.ProfilePackage#getProfile_Filename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='filename'"
	 * @generated
	 */
	String getFilename();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.profile.Profile#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type attribute indicates the type of profile being referenced. The valid type attribute values are “SAD”, “SPD”, “DCD”, and “DMD”.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mil.jpeojtrs.sca.profile.ProfilePackage#getProfile_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.profile.Profile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);
	String EOBJECT_PATH = "/";
	public static class Util {
		// END GENERATED CODE
		private Util() {
			
		}
		public static Profile getProfile(Resource resource) {
			if (resource == null) {
				return null; 
			}
			EObject obj = resource.getEObject(EOBJECT_PATH);
			if (obj instanceof DocumentRoot) {
				return ((DocumentRoot) obj).getProfile();
			} else if (obj instanceof Profile) {
				return (Profile) obj;
			} else {
				throw new IllegalArgumentException(resource + " is not a valid profile resource.");
			}
		}
		// BEGIN GENERATED CODE
	}

} // Profile
