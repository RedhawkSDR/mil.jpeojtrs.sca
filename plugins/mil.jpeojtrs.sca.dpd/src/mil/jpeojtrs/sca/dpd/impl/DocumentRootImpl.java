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
package mil.jpeojtrs.sca.dpd.impl;

import mil.jpeojtrs.sca.dpd.Author;
import mil.jpeojtrs.sca.dpd.ChildHwDevice;
import mil.jpeojtrs.sca.dpd.DeviceClass;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DevicePkgRef;
import mil.jpeojtrs.sca.dpd.DocumentRoot;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;
import mil.jpeojtrs.sca.dpd.LocalFile;
import mil.jpeojtrs.sca.dpd.PropertyFile;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getChildhwdevice <em>Childhwdevice</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getDeviceclass <em>Deviceclass</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getDevicepkg <em>Devicepkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getDevicepkgref <em>Devicepkgref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getHwdeviceregistration <em>Hwdeviceregistration</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getLocalfile <em>Localfile</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getModelnumber <em>Modelnumber</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getPropertyfile <em>Propertyfile</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl#getWebpage <em>Webpage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;
	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;
	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;
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
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getModelnumber() <em>Modelnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELNUMBER_EDEFAULT = null;
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWebpage() <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBPAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpdPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DpdPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DpdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DpdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Author getAuthor() {
		return (Author)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Author newAuthor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__AUTHOR, newAuthor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(Author newAuthor) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildHwDevice getChildhwdevice() {
		return (ChildHwDevice)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__CHILDHWDEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildhwdevice(ChildHwDevice newChildhwdevice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__CHILDHWDEVICE, newChildhwdevice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildhwdevice(ChildHwDevice newChildhwdevice) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__CHILDHWDEVICE, newChildhwdevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__CLASS, newClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompany() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__COMPANY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompany(String newCompany) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__COMPANY, newCompany);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceClass getDeviceclass() {
		return (DeviceClass)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__DEVICECLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceclass(DeviceClass newDeviceclass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__DEVICECLASS, newDeviceclass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceclass(DeviceClass newDeviceclass) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__DEVICECLASS, newDeviceclass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevicePkg getDevicepkg() {
		return (DevicePkg)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevicepkg(DevicePkg newDevicepkg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKG, newDevicepkg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevicepkg(DevicePkg newDevicepkg) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKG, newDevicepkg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevicePkgRef getDevicepkgref() {
		return (DevicePkgRef)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKGREF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevicepkgref(DevicePkgRef newDevicepkgref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKGREF, newDevicepkgref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevicepkgref(DevicePkgRef newDevicepkgref) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKGREF, newDevicepkgref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwDeviceRegistration getHwdeviceregistration() {
		return (HwDeviceRegistration)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__HWDEVICEREGISTRATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwdeviceregistration(HwDeviceRegistration newHwdeviceregistration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__HWDEVICEREGISTRATION, newHwdeviceregistration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHwdeviceregistration(HwDeviceRegistration newHwdeviceregistration) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__HWDEVICEREGISTRATION, newHwdeviceregistration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalFile getLocalfile() {
		return (LocalFile)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__LOCALFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalfile(LocalFile newLocalfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__LOCALFILE, newLocalfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalfile(LocalFile newLocalfile) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__LOCALFILE, newLocalfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturer() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__MANUFACTURER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturer(String newManufacturer) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__MANUFACTURER, newManufacturer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelnumber() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__MODELNUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelnumber(String newModelnumber) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__MODELNUMBER, newModelnumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyFile getPropertyfile() {
		return (PropertyFile)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__PROPERTYFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyfile(PropertyFile newPropertyfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DpdPackage.Literals.DOCUMENT_ROOT__PROPERTYFILE, newPropertyfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyfile(PropertyFile newPropertyfile) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__PROPERTYFILE, newPropertyfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebpage() {
		return (String)getMixed().get(DpdPackage.Literals.DOCUMENT_ROOT__WEBPAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebpage(String newWebpage) {
		((FeatureMap.Internal)getMixed()).set(DpdPackage.Literals.DOCUMENT_ROOT__WEBPAGE, newWebpage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpdPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DpdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DpdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DpdPackage.DOCUMENT_ROOT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__CHILDHWDEVICE:
				return basicSetChildhwdevice(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__DEVICECLASS:
				return basicSetDeviceclass(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKG:
				return basicSetDevicepkg(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKGREF:
				return basicSetDevicepkgref(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__HWDEVICEREGISTRATION:
				return basicSetHwdeviceregistration(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__LOCALFILE:
				return basicSetLocalfile(null, msgs);
			case DpdPackage.DOCUMENT_ROOT__PROPERTYFILE:
				return basicSetPropertyfile(null, msgs);
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
		switch (featureID) {
			case DpdPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DpdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DpdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DpdPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor();
			case DpdPackage.DOCUMENT_ROOT__CHILDHWDEVICE:
				return getChildhwdevice();
			case DpdPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case DpdPackage.DOCUMENT_ROOT__COMPANY:
				return getCompany();
			case DpdPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case DpdPackage.DOCUMENT_ROOT__DEVICECLASS:
				return getDeviceclass();
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKG:
				return getDevicepkg();
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKGREF:
				return getDevicepkgref();
			case DpdPackage.DOCUMENT_ROOT__HWDEVICEREGISTRATION:
				return getHwdeviceregistration();
			case DpdPackage.DOCUMENT_ROOT__LOCALFILE:
				return getLocalfile();
			case DpdPackage.DOCUMENT_ROOT__MANUFACTURER:
				return getManufacturer();
			case DpdPackage.DOCUMENT_ROOT__MODELNUMBER:
				return getModelnumber();
			case DpdPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case DpdPackage.DOCUMENT_ROOT__PROPERTYFILE:
				return getPropertyfile();
			case DpdPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case DpdPackage.DOCUMENT_ROOT__WEBPAGE:
				return getWebpage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DpdPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((Author)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__CHILDHWDEVICE:
				setChildhwdevice((ChildHwDevice)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__CLASS:
				setClass((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__COMPANY:
				setCompany((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__DEVICECLASS:
				setDeviceclass((DeviceClass)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKG:
				setDevicepkg((DevicePkg)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKGREF:
				setDevicepkgref((DevicePkgRef)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__HWDEVICEREGISTRATION:
				setHwdeviceregistration((HwDeviceRegistration)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__LOCALFILE:
				setLocalfile((LocalFile)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__MODELNUMBER:
				setModelnumber((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__PROPERTYFILE:
				setPropertyfile((PropertyFile)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case DpdPackage.DOCUMENT_ROOT__WEBPAGE:
				setWebpage((String)newValue);
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
			case DpdPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DpdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DpdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DpdPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((Author)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__CHILDHWDEVICE:
				setChildhwdevice((ChildHwDevice)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__DEVICECLASS:
				setDeviceclass((DeviceClass)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKG:
				setDevicepkg((DevicePkg)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKGREF:
				setDevicepkgref((DevicePkgRef)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__HWDEVICEREGISTRATION:
				setHwdeviceregistration((HwDeviceRegistration)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__LOCALFILE:
				setLocalfile((LocalFile)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__MODELNUMBER:
				setModelnumber(MODELNUMBER_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__PROPERTYFILE:
				setPropertyfile((PropertyFile)null);
				return;
			case DpdPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DpdPackage.DOCUMENT_ROOT__WEBPAGE:
				setWebpage(WEBPAGE_EDEFAULT);
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
			case DpdPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DpdPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DpdPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DpdPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor() != null;
			case DpdPackage.DOCUMENT_ROOT__CHILDHWDEVICE:
				return getChildhwdevice() != null;
			case DpdPackage.DOCUMENT_ROOT__CLASS:
				return CLASS_EDEFAULT == null ? getClass_() != null : !CLASS_EDEFAULT.equals(getClass_());
			case DpdPackage.DOCUMENT_ROOT__COMPANY:
				return COMPANY_EDEFAULT == null ? getCompany() != null : !COMPANY_EDEFAULT.equals(getCompany());
			case DpdPackage.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case DpdPackage.DOCUMENT_ROOT__DEVICECLASS:
				return getDeviceclass() != null;
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKG:
				return getDevicepkg() != null;
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKGREF:
				return getDevicepkgref() != null;
			case DpdPackage.DOCUMENT_ROOT__HWDEVICEREGISTRATION:
				return getHwdeviceregistration() != null;
			case DpdPackage.DOCUMENT_ROOT__LOCALFILE:
				return getLocalfile() != null;
			case DpdPackage.DOCUMENT_ROOT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? getManufacturer() != null : !MANUFACTURER_EDEFAULT.equals(getManufacturer());
			case DpdPackage.DOCUMENT_ROOT__MODELNUMBER:
				return MODELNUMBER_EDEFAULT == null ? getModelnumber() != null : !MODELNUMBER_EDEFAULT.equals(getModelnumber());
			case DpdPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DpdPackage.DOCUMENT_ROOT__PROPERTYFILE:
				return getPropertyfile() != null;
			case DpdPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case DpdPackage.DOCUMENT_ROOT__WEBPAGE:
				return WEBPAGE_EDEFAULT == null ? getWebpage() != null : !WEBPAGE_EDEFAULT.equals(getWebpage());
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
