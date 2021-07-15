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
package mil.jpeojtrs.sca.spd.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.spd.AEPComplianceType;
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.CodeFileType;
import mil.jpeojtrs.sca.spd.Dependency;
import mil.jpeojtrs.sca.spd.HumanLanguage;
import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.Os;
import mil.jpeojtrs.sca.spd.Processor;
import mil.jpeojtrs.sca.spd.ProgrammingLanguage;
import mil.jpeojtrs.sca.spd.PropertyFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.spd.UsesDevice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Implementation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getProgrammingLanguage <em>Programming Language</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getHumanLanguage <em>Human Language</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getDependencyMap <em>Dependency Map</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getOs <em>Os</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getUsesDevice <em>Uses Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getAepCompliance <em>Aep Compliance</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl#getSoftPkg <em>Soft Pkg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationImpl extends EObjectImpl implements Implementation {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPropertyFile() <em>Property File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyFile()
	 * @generated
	 * @ordered
	 */
	protected PropertyFile propertyFile;
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;
	/**
	 * The cached value of the '{@link #getCompiler() <em>Compiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiler()
	 * @generated
	 * @ordered
	 */
	protected mil.jpeojtrs.sca.spd.Compiler compiler;
	/**
	 * The cached value of the '{@link #getProgrammingLanguage() <em>Programming Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammingLanguage()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingLanguage programmingLanguage;
	/**
	 * The cached value of the '{@link #getHumanLanguage() <em>Human Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanLanguage()
	 * @generated
	 * @ordered
	 */
	protected HumanLanguage humanLanguage;
	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected mil.jpeojtrs.sca.spd.Runtime runtime;
	/**
	 * The cached value of the '{@link #getDependencyMap() <em>Dependency Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dependencyMap;
	/**
	 * The cached value of the '{@link #getUsesDevice() <em>Uses Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<UsesDevice> usesDevice;
	/**
	 * The default value of the '{@link #getAepCompliance() <em>Aep Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAepCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final AEPComplianceType AEP_COMPLIANCE_EDEFAULT = AEPComplianceType.AEP_COMPLIANT;
	/**
	 * The cached value of the '{@link #getAepCompliance() <em>Aep Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAepCompliance()
	 * @generated
	 * @ordered
	 */
	protected AEPComplianceType aepCompliance = AEP_COMPLIANCE_EDEFAULT;
	/**
	 * This is true if the Aep Compliance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aepComplianceESet;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFile getPropertyFile() {
		return propertyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyFile(PropertyFile newPropertyFile, NotificationChain msgs) {
		PropertyFile oldPropertyFile = propertyFile;
		propertyFile = newPropertyFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__PROPERTY_FILE, oldPropertyFile,
				newPropertyFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyFile(PropertyFile newPropertyFile) {
		if (newPropertyFile != propertyFile) {
			NotificationChain msgs = null;
			if (propertyFile != null)
				msgs = ((InternalEObject) propertyFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__PROPERTY_FILE, null, msgs);
			if (newPropertyFile != null)
				msgs = ((InternalEObject) newPropertyFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__PROPERTY_FILE, null, msgs);
			msgs = basicSetPropertyFile(newPropertyFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__PROPERTY_FILE, newPropertyFile, newPropertyFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__CODE, oldCode, newCode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject) code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject) newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mil.jpeojtrs.sca.spd.Compiler getCompiler() {
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompiler(mil.jpeojtrs.sca.spd.Compiler newCompiler, NotificationChain msgs) {
		mil.jpeojtrs.sca.spd.Compiler oldCompiler = compiler;
		compiler = newCompiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__COMPILER, oldCompiler, newCompiler);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiler(mil.jpeojtrs.sca.spd.Compiler newCompiler) {
		if (newCompiler != compiler) {
			NotificationChain msgs = null;
			if (compiler != null)
				msgs = ((InternalEObject) compiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__COMPILER, null, msgs);
			if (newCompiler != null)
				msgs = ((InternalEObject) newCompiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__COMPILER, null, msgs);
			msgs = basicSetCompiler(newCompiler, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__COMPILER, newCompiler, newCompiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage getProgrammingLanguage() {
		return programmingLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammingLanguage(ProgrammingLanguage newProgrammingLanguage, NotificationChain msgs) {
		ProgrammingLanguage oldProgrammingLanguage = programmingLanguage;
		programmingLanguage = newProgrammingLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE,
				oldProgrammingLanguage, newProgrammingLanguage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgrammingLanguage(ProgrammingLanguage newProgrammingLanguage) {
		if (newProgrammingLanguage != programmingLanguage) {
			NotificationChain msgs = null;
			if (programmingLanguage != null)
				msgs = ((InternalEObject) programmingLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE,
					null, msgs);
			if (newProgrammingLanguage != null)
				msgs = ((InternalEObject) newProgrammingLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE,
					null, msgs);
			msgs = basicSetProgrammingLanguage(newProgrammingLanguage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(
				new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE, newProgrammingLanguage, newProgrammingLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanLanguage getHumanLanguage() {
		return humanLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHumanLanguage(HumanLanguage newHumanLanguage, NotificationChain msgs) {
		HumanLanguage oldHumanLanguage = humanLanguage;
		humanLanguage = newHumanLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE, oldHumanLanguage,
				newHumanLanguage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanLanguage(HumanLanguage newHumanLanguage) {
		if (newHumanLanguage != humanLanguage) {
			NotificationChain msgs = null;
			if (humanLanguage != null)
				msgs = ((InternalEObject) humanLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE, null, msgs);
			if (newHumanLanguage != null)
				msgs = ((InternalEObject) newHumanLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE, null, msgs);
			msgs = basicSetHumanLanguage(newHumanLanguage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE, newHumanLanguage, newHumanLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mil.jpeojtrs.sca.spd.Runtime getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntime(mil.jpeojtrs.sca.spd.Runtime newRuntime, NotificationChain msgs) {
		mil.jpeojtrs.sca.spd.Runtime oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__RUNTIME, oldRuntime, newRuntime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(mil.jpeojtrs.sca.spd.Runtime newRuntime) {
		if (newRuntime != runtime) {
			NotificationChain msgs = null;
			if (runtime != null)
				msgs = ((InternalEObject) runtime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__RUNTIME, null, msgs);
			if (newRuntime != null)
				msgs = ((InternalEObject) newRuntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.IMPLEMENTATION__RUNTIME, null, msgs);
			msgs = basicSetRuntime(newRuntime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__RUNTIME, newRuntime, newRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDependencyMap() {
		if (dependencyMap == null) {
			dependencyMap = new BasicFeatureMap(this, SpdPackage.IMPLEMENTATION__DEPENDENCY_MAP);
		}
		return dependencyMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Os> getOs() {
		return getDependencyMap().list(SpdPackage.Literals.IMPLEMENTATION__OS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessor() {
		return getDependencyMap().list(SpdPackage.Literals.IMPLEMENTATION__PROCESSOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependency() {
		return getDependencyMap().list(SpdPackage.Literals.IMPLEMENTATION__DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsesDevice> getUsesDevice() {
		if (usesDevice == null) {
			usesDevice = new EObjectContainmentEList<UsesDevice>(UsesDevice.class, this, SpdPackage.IMPLEMENTATION__USES_DEVICE);
		}
		return usesDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEPComplianceType getAepCompliance() {
		return aepCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAepCompliance(AEPComplianceType newAepCompliance) {
		AEPComplianceType oldAepCompliance = aepCompliance;
		aepCompliance = newAepCompliance == null ? AEP_COMPLIANCE_EDEFAULT : newAepCompliance;
		boolean oldAepComplianceESet = aepComplianceESet;
		aepComplianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE, oldAepCompliance, aepCompliance,
				!oldAepComplianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAepCompliance() {
		AEPComplianceType oldAepCompliance = aepCompliance;
		boolean oldAepComplianceESet = aepComplianceESet;
		aepCompliance = AEP_COMPLIANCE_EDEFAULT;
		aepComplianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE, oldAepCompliance, AEP_COMPLIANCE_EDEFAULT,
				oldAepComplianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAepCompliance() {
		return aepComplianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkg getSoftPkg() {
		if (eContainerFeatureID() != SpdPackage.IMPLEMENTATION__SOFT_PKG)
			return null;
		return (SoftPkg) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkg basicGetSoftPkg() {
		if (eContainerFeatureID() != SpdPackage.IMPLEMENTATION__SOFT_PKG)
			return null;
		return (SoftPkg) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftPkg(SoftPkg newSoftPkg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSoftPkg, SpdPackage.IMPLEMENTATION__SOFT_PKG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftPkg(SoftPkg newSoftPkg) {
		if (newSoftPkg != eInternalContainer() || (eContainerFeatureID() != SpdPackage.IMPLEMENTATION__SOFT_PKG && newSoftPkg != null)) {
			if (EcoreUtil.isAncestor(this, newSoftPkg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSoftPkg != null)
				msgs = ((InternalEObject) newSoftPkg).eInverseAdd(this, SpdPackage.SOFT_PKG__IMPLEMENTATION, SoftPkg.class, msgs);
			msgs = basicSetSoftPkg(newSoftPkg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.IMPLEMENTATION__SOFT_PKG, newSoftPkg, newSoftPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isExecutable() {
		// Must have an entry point and be of type executable or shared library
		return this.code != null && code.getEntryPoint() != null
			&& (code.getType() == CodeFileType.EXECUTABLE || code.getType() == CodeFileType.SHARED_LIBRARY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSharedLibrary() {
		// Must have no entry point, and be of type shared library
		return this.code != null && code.getEntryPoint() == null && code.getType() == CodeFileType.SHARED_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSoftPkg((SoftPkg) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.IMPLEMENTATION__PROPERTY_FILE:
			return basicSetPropertyFile(null, msgs);
		case SpdPackage.IMPLEMENTATION__CODE:
			return basicSetCode(null, msgs);
		case SpdPackage.IMPLEMENTATION__COMPILER:
			return basicSetCompiler(null, msgs);
		case SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
			return basicSetProgrammingLanguage(null, msgs);
		case SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE:
			return basicSetHumanLanguage(null, msgs);
		case SpdPackage.IMPLEMENTATION__RUNTIME:
			return basicSetRuntime(null, msgs);
		case SpdPackage.IMPLEMENTATION__DEPENDENCY_MAP:
			return ((InternalEList< ? >) getDependencyMap()).basicRemove(otherEnd, msgs);
		case SpdPackage.IMPLEMENTATION__OS:
			return ((InternalEList< ? >) getOs()).basicRemove(otherEnd, msgs);
		case SpdPackage.IMPLEMENTATION__PROCESSOR:
			return ((InternalEList< ? >) getProcessor()).basicRemove(otherEnd, msgs);
		case SpdPackage.IMPLEMENTATION__DEPENDENCY:
			return ((InternalEList< ? >) getDependency()).basicRemove(otherEnd, msgs);
		case SpdPackage.IMPLEMENTATION__USES_DEVICE:
			return ((InternalEList< ? >) getUsesDevice()).basicRemove(otherEnd, msgs);
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			return basicSetSoftPkg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			return eInternalContainer().eInverseRemove(this, SpdPackage.SOFT_PKG__IMPLEMENTATION, SoftPkg.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdPackage.IMPLEMENTATION__DESCRIPTION:
			return getDescription();
		case SpdPackage.IMPLEMENTATION__PROPERTY_FILE:
			return getPropertyFile();
		case SpdPackage.IMPLEMENTATION__CODE:
			return getCode();
		case SpdPackage.IMPLEMENTATION__COMPILER:
			return getCompiler();
		case SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
			return getProgrammingLanguage();
		case SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE:
			return getHumanLanguage();
		case SpdPackage.IMPLEMENTATION__RUNTIME:
			return getRuntime();
		case SpdPackage.IMPLEMENTATION__DEPENDENCY_MAP:
			if (coreType)
				return getDependencyMap();
			return ((FeatureMap.Internal) getDependencyMap()).getWrapper();
		case SpdPackage.IMPLEMENTATION__OS:
			return getOs();
		case SpdPackage.IMPLEMENTATION__PROCESSOR:
			return getProcessor();
		case SpdPackage.IMPLEMENTATION__DEPENDENCY:
			return getDependency();
		case SpdPackage.IMPLEMENTATION__USES_DEVICE:
			return getUsesDevice();
		case SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE:
			return getAepCompliance();
		case SpdPackage.IMPLEMENTATION__ID:
			return getId();
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			if (resolve)
				return getSoftPkg();
			return basicGetSoftPkg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdPackage.IMPLEMENTATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__PROPERTY_FILE:
			setPropertyFile((PropertyFile) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__CODE:
			setCode((Code) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__COMPILER:
			setCompiler((mil.jpeojtrs.sca.spd.Compiler) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
			setProgrammingLanguage((ProgrammingLanguage) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE:
			setHumanLanguage((HumanLanguage) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__RUNTIME:
			setRuntime((mil.jpeojtrs.sca.spd.Runtime) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__DEPENDENCY_MAP:
			((FeatureMap.Internal) getDependencyMap()).set(newValue);
			return;
		case SpdPackage.IMPLEMENTATION__OS:
			getOs().clear();
			getOs().addAll((Collection< ? extends Os>) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__PROCESSOR:
			getProcessor().clear();
			getProcessor().addAll((Collection< ? extends Processor>) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__DEPENDENCY:
			getDependency().clear();
			getDependency().addAll((Collection< ? extends Dependency>) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__USES_DEVICE:
			getUsesDevice().clear();
			getUsesDevice().addAll((Collection< ? extends UsesDevice>) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE:
			setAepCompliance((AEPComplianceType) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__ID:
			setId((String) newValue);
			return;
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			setSoftPkg((SoftPkg) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpdPackage.IMPLEMENTATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SpdPackage.IMPLEMENTATION__PROPERTY_FILE:
			setPropertyFile((PropertyFile) null);
			return;
		case SpdPackage.IMPLEMENTATION__CODE:
			setCode((Code) null);
			return;
		case SpdPackage.IMPLEMENTATION__COMPILER:
			setCompiler((mil.jpeojtrs.sca.spd.Compiler) null);
			return;
		case SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
			setProgrammingLanguage((ProgrammingLanguage) null);
			return;
		case SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE:
			setHumanLanguage((HumanLanguage) null);
			return;
		case SpdPackage.IMPLEMENTATION__RUNTIME:
			setRuntime((mil.jpeojtrs.sca.spd.Runtime) null);
			return;
		case SpdPackage.IMPLEMENTATION__DEPENDENCY_MAP:
			getDependencyMap().clear();
			return;
		case SpdPackage.IMPLEMENTATION__OS:
			getOs().clear();
			return;
		case SpdPackage.IMPLEMENTATION__PROCESSOR:
			getProcessor().clear();
			return;
		case SpdPackage.IMPLEMENTATION__DEPENDENCY:
			getDependency().clear();
			return;
		case SpdPackage.IMPLEMENTATION__USES_DEVICE:
			getUsesDevice().clear();
			return;
		case SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE:
			unsetAepCompliance();
			return;
		case SpdPackage.IMPLEMENTATION__ID:
			setId(ID_EDEFAULT);
			return;
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			setSoftPkg((SoftPkg) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpdPackage.IMPLEMENTATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SpdPackage.IMPLEMENTATION__PROPERTY_FILE:
			return propertyFile != null;
		case SpdPackage.IMPLEMENTATION__CODE:
			return code != null;
		case SpdPackage.IMPLEMENTATION__COMPILER:
			return compiler != null;
		case SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
			return programmingLanguage != null;
		case SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE:
			return humanLanguage != null;
		case SpdPackage.IMPLEMENTATION__RUNTIME:
			return runtime != null;
		case SpdPackage.IMPLEMENTATION__DEPENDENCY_MAP:
			return dependencyMap != null && !dependencyMap.isEmpty();
		case SpdPackage.IMPLEMENTATION__OS:
			return !getOs().isEmpty();
		case SpdPackage.IMPLEMENTATION__PROCESSOR:
			return !getProcessor().isEmpty();
		case SpdPackage.IMPLEMENTATION__DEPENDENCY:
			return !getDependency().isEmpty();
		case SpdPackage.IMPLEMENTATION__USES_DEVICE:
			return usesDevice != null && !usesDevice.isEmpty();
		case SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE:
			return isSetAepCompliance();
		case SpdPackage.IMPLEMENTATION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SpdPackage.IMPLEMENTATION__SOFT_PKG:
			return basicGetSoftPkg() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", dependencyMap: ");
		result.append(dependencyMap);
		result.append(", aepCompliance: ");
		if (aepComplianceESet)
			result.append(aepCompliance);
		else
			result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		if (this.id != null) {
			return this.id.hashCode();
		}
		return "".hashCode();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		final ImplementationImpl tempImpl = (ImplementationImpl) obj;
		return this.id.equals(tempImpl.getId());
	}

} // ImplementationImpl
