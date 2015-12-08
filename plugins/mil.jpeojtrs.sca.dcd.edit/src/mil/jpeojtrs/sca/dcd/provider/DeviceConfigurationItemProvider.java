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
package mil.jpeojtrs.sca.dcd.provider;

import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;

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
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.dcd.DeviceConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceConfigurationItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_DeviceConfiguration_description_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_DeviceConfiguration_description_feature", "_UI_DeviceConfiguration_type"),
			DcdPackage.Literals.DEVICE_CONFIGURATION__DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_DeviceConfiguration_id_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_DeviceConfiguration_id_feature", "_UI_DeviceConfiguration_type"),
			DcdPackage.Literals.DEVICE_CONFIGURATION__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_DeviceConfiguration_name_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_DeviceConfiguration_name_feature", "_UI_DeviceConfiguration_type"),
			DcdPackage.Literals.DEVICE_CONFIGURATION__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	public Collection< ? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DcdPackage.Literals.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG);
			childrenFeatures.add(DcdPackage.Literals.DEVICE_CONFIGURATION__COMPONENT_FILES);
			childrenFeatures.add(DcdPackage.Literals.DEVICE_CONFIGURATION__PARTITIONING);
			childrenFeatures.add(DcdPackage.Literals.DEVICE_CONFIGURATION__CONNECTIONS);
			childrenFeatures.add(DcdPackage.Literals.DEVICE_CONFIGURATION__DOMAIN_MANAGER);
			childrenFeatures.add(DcdPackage.Literals.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES);
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
	 * This returns DeviceConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeviceConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// END GENERATED CODE
		String name = ((DeviceConfiguration) object).getName();
		if (name == null) {
			return ((DeviceConfiguration) object).getId();
		}
		return name.substring(name.lastIndexOf('.') + 1);
		// BEGIN GENERATED CODE
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

		switch (notification.getFeatureID(DeviceConfiguration.class)) {
		case DcdPackage.DEVICE_CONFIGURATION__DESCRIPTION:
		case DcdPackage.DEVICE_CONFIGURATION__ID:
		case DcdPackage.DEVICE_CONFIGURATION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DcdPackage.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG:
		case DcdPackage.DEVICE_CONFIGURATION__COMPONENT_FILES:
		case DcdPackage.DEVICE_CONFIGURATION__PARTITIONING:
		case DcdPackage.DEVICE_CONFIGURATION__CONNECTIONS:
		case DcdPackage.DEVICE_CONFIGURATION__DOMAIN_MANAGER:
		case DcdPackage.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES:
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

		newChildDescriptors.add(
			createChildParameter(DcdPackage.Literals.DEVICE_CONFIGURATION__DEVICE_MANAGER_SOFT_PKG, DcdFactory.eINSTANCE.createDeviceManagerSoftPkg()));

		newChildDescriptors.add(
			createChildParameter(DcdPackage.Literals.DEVICE_CONFIGURATION__COMPONENT_FILES, PartitioningFactory.eINSTANCE.createComponentFiles()));

		newChildDescriptors.add(createChildParameter(DcdPackage.Literals.DEVICE_CONFIGURATION__CONNECTIONS, DcdFactory.eINSTANCE.createDcdConnections()));

		newChildDescriptors.add(createChildParameter(DcdPackage.Literals.DEVICE_CONFIGURATION__DOMAIN_MANAGER, DcdFactory.eINSTANCE.createDomainManager()));

		newChildDescriptors.add(
			createChildParameter(DcdPackage.Literals.DEVICE_CONFIGURATION__FILE_SYSTEM_NAMES, DcdFactory.eINSTANCE.createFileSystemNames()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DcdEditPlugin.INSTANCE;
	}

}
