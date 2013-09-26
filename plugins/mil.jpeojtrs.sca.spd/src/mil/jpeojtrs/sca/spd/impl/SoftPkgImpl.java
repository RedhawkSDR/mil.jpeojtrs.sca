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
import mil.jpeojtrs.sca.spd.Author;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.Implementation;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Soft Pkg</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getUsesDevice <em>Uses Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftPkgImpl extends EObjectImpl implements SoftPkg {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> author;
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
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected Descriptor descriptor;
	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> implementation;
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "sca_compliant";
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SOFT_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthor() {
		if (author == null)
		{
			author = new EObjectContainmentEList<Author>(Author.class, this, SpdPackage.SOFT_PKG__AUTHOR);
		}
		return author;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__DESCRIPTION, oldDescription, description));
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__PROPERTY_FILE, oldPropertyFile, newPropertyFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyFile(PropertyFile newPropertyFile) {
		if (newPropertyFile != propertyFile)
		{
			NotificationChain msgs = null;
			if (propertyFile != null)
				msgs = ((InternalEObject)propertyFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG__PROPERTY_FILE, null, msgs);
			if (newPropertyFile != null)
				msgs = ((InternalEObject)newPropertyFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG__PROPERTY_FILE, null, msgs);
			msgs = basicSetPropertyFile(newPropertyFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__PROPERTY_FILE, newPropertyFile, newPropertyFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptor(Descriptor newDescriptor, NotificationChain msgs) {
		Descriptor oldDescriptor = descriptor;
		descriptor = newDescriptor;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__DESCRIPTOR, oldDescriptor, newDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(Descriptor newDescriptor) {
		if (newDescriptor != descriptor)
		{
			NotificationChain msgs = null;
			if (descriptor != null)
				msgs = ((InternalEObject)descriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG__DESCRIPTOR, null, msgs);
			if (newDescriptor != null)
				msgs = ((InternalEObject)newDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG__DESCRIPTOR, null, msgs);
			msgs = basicSetDescriptor(newDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__DESCRIPTOR, newDescriptor, newDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImplementation() {
		if (implementation == null)
		{
			implementation = new EObjectContainmentWithInverseEList<Implementation>(Implementation.class, this, SpdPackage.SOFT_PKG__IMPLEMENTATION, SpdPackage.IMPLEMENTATION__SOFT_PKG);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsesDevice> getUsesDevice() {
		if (usesDevice == null)
		{
			usesDevice = new EObjectContainmentEList<UsesDevice>(UsesDevice.class, this, SpdPackage.SOFT_PKG__USES_DEVICE);
		}
		return usesDevice;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpdPackage.SOFT_PKG__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Implementation getImplementation(String implID) {
		// END GENERATED CODE
		if (implID == null) {
			return null;
		}
		for (Implementation impl : getImplementation()) {
			if (implID.equals(impl.getId())) {
				return impl;
			}
		}
		return null;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case SpdPackage.SOFT_PKG__IMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementation()).basicAdd(otherEnd, msgs);
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
		switch (featureID)
		{
			case SpdPackage.SOFT_PKG__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case SpdPackage.SOFT_PKG__PROPERTY_FILE:
				return basicSetPropertyFile(null, msgs);
			case SpdPackage.SOFT_PKG__DESCRIPTOR:
				return basicSetDescriptor(null, msgs);
			case SpdPackage.SOFT_PKG__IMPLEMENTATION:
				return ((InternalEList<?>)getImplementation()).basicRemove(otherEnd, msgs);
			case SpdPackage.SOFT_PKG__USES_DEVICE:
				return ((InternalEList<?>)getUsesDevice()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case SpdPackage.SOFT_PKG__TITLE:
				return getTitle();
			case SpdPackage.SOFT_PKG__AUTHOR:
				return getAuthor();
			case SpdPackage.SOFT_PKG__DESCRIPTION:
				return getDescription();
			case SpdPackage.SOFT_PKG__PROPERTY_FILE:
				return getPropertyFile();
			case SpdPackage.SOFT_PKG__DESCRIPTOR:
				return getDescriptor();
			case SpdPackage.SOFT_PKG__IMPLEMENTATION:
				return getImplementation();
			case SpdPackage.SOFT_PKG__USES_DEVICE:
				return getUsesDevice();
			case SpdPackage.SOFT_PKG__ID:
				return getId();
			case SpdPackage.SOFT_PKG__NAME:
				return getName();
			case SpdPackage.SOFT_PKG__TYPE:
				return getType();
			case SpdPackage.SOFT_PKG__VERSION:
				return getVersion();
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
		switch (featureID)
		{
			case SpdPackage.SOFT_PKG__TITLE:
				setTitle((String)newValue);
				return;
			case SpdPackage.SOFT_PKG__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case SpdPackage.SOFT_PKG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SpdPackage.SOFT_PKG__PROPERTY_FILE:
				setPropertyFile((PropertyFile)newValue);
				return;
			case SpdPackage.SOFT_PKG__DESCRIPTOR:
				setDescriptor((Descriptor)newValue);
				return;
			case SpdPackage.SOFT_PKG__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends Implementation>)newValue);
				return;
			case SpdPackage.SOFT_PKG__USES_DEVICE:
				getUsesDevice().clear();
				getUsesDevice().addAll((Collection<? extends UsesDevice>)newValue);
				return;
			case SpdPackage.SOFT_PKG__ID:
				setId((String)newValue);
				return;
			case SpdPackage.SOFT_PKG__NAME:
				setName((String)newValue);
				return;
			case SpdPackage.SOFT_PKG__TYPE:
				setType((String)newValue);
				return;
			case SpdPackage.SOFT_PKG__VERSION:
				setVersion((String)newValue);
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
		switch (featureID)
		{
			case SpdPackage.SOFT_PKG__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SpdPackage.SOFT_PKG__AUTHOR:
				getAuthor().clear();
				return;
			case SpdPackage.SOFT_PKG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SpdPackage.SOFT_PKG__PROPERTY_FILE:
				setPropertyFile((PropertyFile)null);
				return;
			case SpdPackage.SOFT_PKG__DESCRIPTOR:
				setDescriptor((Descriptor)null);
				return;
			case SpdPackage.SOFT_PKG__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case SpdPackage.SOFT_PKG__USES_DEVICE:
				getUsesDevice().clear();
				return;
			case SpdPackage.SOFT_PKG__ID:
				setId(ID_EDEFAULT);
				return;
			case SpdPackage.SOFT_PKG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpdPackage.SOFT_PKG__TYPE:
				unsetType();
				return;
			case SpdPackage.SOFT_PKG__VERSION:
				setVersion(VERSION_EDEFAULT);
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
		switch (featureID)
		{
			case SpdPackage.SOFT_PKG__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SpdPackage.SOFT_PKG__AUTHOR:
				return author != null && !author.isEmpty();
			case SpdPackage.SOFT_PKG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SpdPackage.SOFT_PKG__PROPERTY_FILE:
				return propertyFile != null;
			case SpdPackage.SOFT_PKG__DESCRIPTOR:
				return descriptor != null;
			case SpdPackage.SOFT_PKG__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case SpdPackage.SOFT_PKG__USES_DEVICE:
				return usesDevice != null && !usesDevice.isEmpty();
			case SpdPackage.SOFT_PKG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpdPackage.SOFT_PKG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpdPackage.SOFT_PKG__TYPE:
				return isSetType();
			case SpdPackage.SOFT_PKG__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} // SoftPkgImpl
