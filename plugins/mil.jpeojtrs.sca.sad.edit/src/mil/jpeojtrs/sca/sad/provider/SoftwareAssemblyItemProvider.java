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
package mil.jpeojtrs.sca.sad.provider;

import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

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
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.sad.SoftwareAssembly} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareAssemblyItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAssemblyItemProvider(AdapterFactory adapterFactory) {
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
			addVersionPropertyDescriptor(object);
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
			getString("_UI_SoftwareAssembly_description_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftwareAssembly_description_feature", "_UI_SoftwareAssembly_type"),
			SadPackage.Literals.SOFTWARE_ASSEMBLY__DESCRIPTION, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftwareAssembly_id_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftwareAssembly_id_feature", "_UI_SoftwareAssembly_type"),
			SadPackage.Literals.SOFTWARE_ASSEMBLY__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftwareAssembly_name_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftwareAssembly_name_feature", "_UI_SoftwareAssembly_type"),
			SadPackage.Literals.SOFTWARE_ASSEMBLY__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftwareAssembly_version_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftwareAssembly_version_feature", "_UI_SoftwareAssembly_type"),
			SadPackage.Literals.SOFTWARE_ASSEMBLY__VERSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__COMPONENT_FILES);
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__PARTITIONING);
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER);
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__CONNECTIONS);
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS);
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES);
			childrenFeatures.add(SadPackage.Literals.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES);
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
	 * This returns SoftwareAssembly.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareAssembly"));
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
		String label = ((SoftwareAssembly) object).getName();
		while (label.contains(".")) {
			label = label.substring(label.indexOf('.') + 1);
		}
		return label;
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

		switch (notification.getFeatureID(SoftwareAssembly.class)) {
		case SadPackage.SOFTWARE_ASSEMBLY__DESCRIPTION:
		case SadPackage.SOFTWARE_ASSEMBLY__ID:
		case SadPackage.SOFTWARE_ASSEMBLY__NAME:
		case SadPackage.SOFTWARE_ASSEMBLY__VERSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES:
		case SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING:
		case SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER:
		case SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS:
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS:
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES:
		case SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES:
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
			createChildParameter(SadPackage.Literals.SOFTWARE_ASSEMBLY__COMPONENT_FILES, PartitioningFactory.eINSTANCE.createComponentFiles()));

		newChildDescriptors.add(createChildParameter(SadPackage.Literals.SOFTWARE_ASSEMBLY__PARTITIONING, SadFactory.eINSTANCE.createSadPartitioning()));

		newChildDescriptors.add(
			createChildParameter(SadPackage.Literals.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER, SadFactory.eINSTANCE.createAssemblyController()));

		newChildDescriptors.add(createChildParameter(SadPackage.Literals.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS, SadFactory.eINSTANCE.createExternalPorts()));

		newChildDescriptors.add(
			createChildParameter(SadPackage.Literals.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES, SadFactory.eINSTANCE.createExternalProperties()));

		newChildDescriptors.add(
			createChildParameter(SadPackage.Literals.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES, SadFactory.eINSTANCE.createUsesDeviceDependencies()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SadEditPlugin.INSTANCE;
	}

}
