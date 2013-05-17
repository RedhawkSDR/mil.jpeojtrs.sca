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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getCode <em>Code</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getProgrammingLanguage <em>Programming Language</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getHumanLanguage <em>Human Language</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getDependencyMap <em>Dependency Map</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getOs <em>Os</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getProcessor <em>Processor</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getUsesDevice <em>Uses Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getAepCompliance <em>Aep Compliance</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getSoftPkg <em>Soft Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation()
 * @model extendedMetaData="name='implementation' kind='elementOnly'"
 * @generated
 */
public interface Implementation extends EObject {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property File</em>' containment reference.
	 * @see #setPropertyFile(PropertyFile)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_PropertyFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyfile' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyFile getPropertyFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getPropertyFile <em>Property File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property File</em>' containment reference.
	 * @see #getPropertyFile()
	 * @generated
	 */
	void setPropertyFile(PropertyFile value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Compiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiler</em>' containment reference.
	 * @see #setCompiler(mil.jpeojtrs.sca.spd.Compiler)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Compiler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compiler' namespace='##targetNamespace'"
	 * @generated
	 */
	mil.jpeojtrs.sca.spd.Compiler getCompiler();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getCompiler <em>Compiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiler</em>' containment reference.
	 * @see #getCompiler()
	 * @generated
	 */
	void setCompiler(mil.jpeojtrs.sca.spd.Compiler value);

	/**
	 * Returns the value of the '<em><b>Programming Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programming Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programming Language</em>' containment reference.
	 * @see #setProgrammingLanguage(ProgrammingLanguage)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_ProgrammingLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programminglanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgrammingLanguage getProgrammingLanguage();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getProgrammingLanguage <em>Programming Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programming Language</em>' containment reference.
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	void setProgrammingLanguage(ProgrammingLanguage value);

	/**
	 * Returns the value of the '<em><b>Human Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Language</em>' containment reference.
	 * @see #setHumanLanguage(HumanLanguage)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_HumanLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='humanlanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanLanguage getHumanLanguage();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getHumanLanguage <em>Human Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Language</em>' containment reference.
	 * @see #getHumanLanguage()
	 * @generated
	 */
	void setHumanLanguage(HumanLanguage value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' containment reference.
	 * @see #setRuntime(mil.jpeojtrs.sca.spd.Runtime)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Runtime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runtime' namespace='##targetNamespace'"
	 * @generated
	 */
	mil.jpeojtrs.sca.spd.Runtime getRuntime();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getRuntime <em>Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' containment reference.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(mil.jpeojtrs.sca.spd.Runtime value);

	/**
	 * Returns the value of the '<em><b>Dependency Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Map</em>' attribute list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_DependencyMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='dependencyMap:7'"
	 * @generated
	 */
	FeatureMap getDependencyMap();

	/**
	 * Returns the value of the '<em><b>Os</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.Os}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Os()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='os' namespace='##targetNamespace' group='#dependencyMap:7'"
	 * @generated
	 */
	EList<Os> getOs();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Processor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='processor' namespace='##targetNamespace' group='#dependencyMap:7'"
	 * @generated
	 */
	EList<Processor> getProcessor();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Dependency()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace' group='#dependencyMap:7'"
	 * @generated
	 */
	EList<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Uses Device</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.UsesDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Device</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_UsesDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesdevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsesDevice> getUsesDevice();

	/**
	 * Returns the value of the '<em><b>Aep Compliance</b></em>' attribute.
	 * The default value is <code>"aep_compliant"</code>.
	 * The literals are from the enumeration {@link mil.jpeojtrs.sca.spd.AEPComplianceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aep Compliance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aep Compliance</em>' attribute.
	 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
	 * @see #isSetAepCompliance()
	 * @see #unsetAepCompliance()
	 * @see #setAepCompliance(AEPComplianceType)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_AepCompliance()
	 * @model default="aep_compliant" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aepcompliance'"
	 * @generated
	 */
	AEPComplianceType getAepCompliance();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getAepCompliance <em>Aep Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aep Compliance</em>' attribute.
	 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
	 * @see #isSetAepCompliance()
	 * @see #unsetAepCompliance()
	 * @see #getAepCompliance()
	 * @generated
	 */
	void setAepCompliance(AEPComplianceType value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getAepCompliance <em>Aep Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAepCompliance()
	 * @see #getAepCompliance()
	 * @see #setAepCompliance(AEPComplianceType)
	 * @generated
	 */
	void unsetAepCompliance();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getAepCompliance <em>Aep Compliance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aep Compliance</em>' attribute is set.
	 * @see #unsetAepCompliance()
	 * @see #getAepCompliance()
	 * @see #setAepCompliance(AEPComplianceType)
	 * @generated
	 */
	boolean isSetAepCompliance();

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
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Soft Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mil.jpeojtrs.sca.spd.SoftPkg#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Pkg</em>' container reference.
	 * @see #setSoftPkg(SoftPkg)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getImplementation_SoftPkg()
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getImplementation
	 * @model opposite="implementation" transient="false"
	 *        extendedMetaData="kind='attribute' name='softPkg'"
	 * @generated
	 */
	SoftPkg getSoftPkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.Implementation#getSoftPkg <em>Soft Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Pkg</em>' container reference.
	 * @see #getSoftPkg()
	 * @generated
	 */
	void setSoftPkg(SoftPkg value);

} // Implementation
