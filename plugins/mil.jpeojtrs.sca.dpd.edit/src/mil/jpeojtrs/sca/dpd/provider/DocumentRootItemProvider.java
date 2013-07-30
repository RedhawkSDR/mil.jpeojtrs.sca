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
package mil.jpeojtrs.sca.dpd.provider;


import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.dpd.DocumentRoot;
import mil.jpeojtrs.sca.dpd.DpdFactory;
import mil.jpeojtrs.sca.dpd.DpdPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.dpd.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClassPropertyDescriptor(object);
			addCompanyPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addManufacturerPropertyDescriptor(object);
			addModelnumberPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addWebpagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_class_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Company feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompanyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_company_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_company_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__COMPANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_description_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manufacturer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufacturerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_manufacturer_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__MANUFACTURER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modelnumber feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelnumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_modelnumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_modelnumber_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__MODELNUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_name_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_title_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Webpage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebpagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_webpage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_webpage_feature", "_UI_DocumentRoot_type"),
				 DpdPackage.Literals.DOCUMENT_ROOT__WEBPAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__AUTHOR);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__CHILDHWDEVICE);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__DEVICECLASS);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKG);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKGREF);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__HWDEVICEREGISTRATION);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__LOCALFILE);
			childrenFeatures.add(DpdPackage.Literals.DOCUMENT_ROOT__PROPERTYFILE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case DpdPackage.DOCUMENT_ROOT__CLASS:
			case DpdPackage.DOCUMENT_ROOT__COMPANY:
			case DpdPackage.DOCUMENT_ROOT__DESCRIPTION:
			case DpdPackage.DOCUMENT_ROOT__MANUFACTURER:
			case DpdPackage.DOCUMENT_ROOT__MODELNUMBER:
			case DpdPackage.DOCUMENT_ROOT__NAME:
			case DpdPackage.DOCUMENT_ROOT__TITLE:
			case DpdPackage.DOCUMENT_ROOT__WEBPAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DpdPackage.DOCUMENT_ROOT__AUTHOR:
			case DpdPackage.DOCUMENT_ROOT__CHILDHWDEVICE:
			case DpdPackage.DOCUMENT_ROOT__DEVICECLASS:
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKG:
			case DpdPackage.DOCUMENT_ROOT__DEVICEPKGREF:
			case DpdPackage.DOCUMENT_ROOT__HWDEVICEREGISTRATION:
			case DpdPackage.DOCUMENT_ROOT__LOCALFILE:
			case DpdPackage.DOCUMENT_ROOT__PROPERTYFILE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__AUTHOR,
				 DpdFactory.eINSTANCE.createAuthor()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__CHILDHWDEVICE,
				 DpdFactory.eINSTANCE.createChildHwDevice()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__DEVICECLASS,
				 DpdFactory.eINSTANCE.createDeviceClass()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKG,
				 DpdFactory.eINSTANCE.createDevicePkg()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__DEVICEPKGREF,
				 DpdFactory.eINSTANCE.createDevicePkgRef()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__HWDEVICEREGISTRATION,
				 DpdFactory.eINSTANCE.createHwDeviceRegistration()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__LOCALFILE,
				 DpdFactory.eINSTANCE.createLocalFile()));

		newChildDescriptors.add
			(createChildParameter
				(DpdPackage.Literals.DOCUMENT_ROOT__PROPERTYFILE,
				 DpdFactory.eINSTANCE.createPropertyFile()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DpdEditPlugin.INSTANCE;
	}

}
