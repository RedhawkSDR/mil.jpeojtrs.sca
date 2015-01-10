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
package mil.jpeojtrs.sca.partitioning.provider;

import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
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
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSupportedInterfaceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSupportedInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addSupportedIdentifierPropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Supported Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ComponentSupportedInterface_supportedIdentifier_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ComponentSupportedInterface_supportedIdentifier_feature",
				"_UI_ComponentSupportedInterface_type"), PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_ComponentSupportedInterface_interface_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ComponentSupportedInterface_interface_feature", "_UI_ComponentSupportedInterface_type"),
			PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__INTERFACE, true, false, true, null, null, null));
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
			childrenFeatures.add(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF);
			childrenFeatures.add(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF);
			childrenFeatures.add(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF);
			childrenFeatures.add(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION);
			childrenFeatures.add(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__FIND_BY);
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
	 * This returns ComponentSupportedInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentSupportedInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((ComponentSupportedInterface) object).getSupportedIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_ComponentSupportedInterface_type") : label;
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

		switch (notification.getFeatureID(ComponentSupportedInterface.class)) {
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__SUPPORTED_IDENTIFIER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__COMPONENT_INSTANTIATION_REF:
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF:
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION:
		case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE__FIND_BY:
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

		newChildDescriptors.add(createChildParameter(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__DEVICE_THAT_LOADED_THIS_COMPONENT_REF,
			PartitioningFactory.eINSTANCE.createDeviceThatLoadedThisComponentRef()));

		newChildDescriptors.add(createChildParameter(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_THIS_COMPONENT_REF,
			PartitioningFactory.eINSTANCE.createDeviceUsedByThisComponentRef()));

		newChildDescriptors.add(createChildParameter(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__DEVICE_USED_BY_APPLICATION,
			PartitioningFactory.eINSTANCE.createDeviceUsedByApplication()));

		newChildDescriptors.add(createChildParameter(PartitioningPackage.Literals.COMPONENT_SUPPORTED_INTERFACE__FIND_BY,
			PartitioningFactory.eINSTANCE.createFindBy()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
