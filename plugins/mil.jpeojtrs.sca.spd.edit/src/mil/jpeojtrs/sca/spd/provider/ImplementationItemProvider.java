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
package mil.jpeojtrs.sca.spd.provider;

import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.SpdPackage;

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
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.spd.Implementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationItemProvider(AdapterFactory adapterFactory) {
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
			addPropertyFilePropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addCompilerPropertyDescriptor(object);
			addProgrammingLanguagePropertyDescriptor(object);
			addHumanLanguagePropertyDescriptor(object);
			addRuntimePropertyDescriptor(object);
			addOsPropertyDescriptor(object);
			addProcessorPropertyDescriptor(object);
			addAepCompliancePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
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
			getString("_UI_Implementation_description_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_description_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__DESCRIPTION, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_propertyFile_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_propertyFile_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__PROPERTY_FILE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_code_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_code_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__CODE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Compiler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompilerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_compiler_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_compiler_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__COMPILER, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Programming Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgrammingLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_programmingLanguage_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_programmingLanguage_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__PROGRAMMING_LANGUAGE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Human Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHumanLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_humanLanguage_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_humanLanguage_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__HUMAN_LANGUAGE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Runtime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuntimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_runtime_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_runtime_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__RUNTIME, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Os feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_os_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_os_feature", "_UI_Implementation_type"), SpdPackage.Literals.IMPLEMENTATION__OS,
			false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Processor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_processor_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_processor_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__PROCESSOR, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Aep Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAepCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_aepCompliance_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_aepCompliance_feature", "_UI_Implementation_type"),
			SpdPackage.Literals.IMPLEMENTATION__AEP_COMPLIANCE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Implementation_id_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Implementation_id_feature", "_UI_Implementation_type"), SpdPackage.Literals.IMPLEMENTATION__ID,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(SpdPackage.Literals.IMPLEMENTATION__USES_DEVICE);
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
	 * This returns Implementation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Implementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Implementation) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Implementation_type") : getString("_UI_Implementation_type") + " " + label;
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

		switch (notification.getFeatureID(Implementation.class)) {
		case SpdPackage.IMPLEMENTATION__DESCRIPTION:
		case SpdPackage.IMPLEMENTATION__PROPERTY_FILE:
		case SpdPackage.IMPLEMENTATION__CODE:
		case SpdPackage.IMPLEMENTATION__COMPILER:
		case SpdPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
		case SpdPackage.IMPLEMENTATION__HUMAN_LANGUAGE:
		case SpdPackage.IMPLEMENTATION__RUNTIME:
		case SpdPackage.IMPLEMENTATION__OS:
		case SpdPackage.IMPLEMENTATION__PROCESSOR:
		case SpdPackage.IMPLEMENTATION__DEPENDENCY:
		case SpdPackage.IMPLEMENTATION__AEP_COMPLIANCE:
		case SpdPackage.IMPLEMENTATION__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SpdPackage.IMPLEMENTATION__USES_DEVICE:
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

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.IMPLEMENTATION__USES_DEVICE, SpdFactory.eINSTANCE.createUsesDevice()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpdEditPlugin.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getColumnText(final Object object, final int columnIndex) {
		if (columnIndex == 0) {
			return getText(object);
		}
		return super.getColumnText(object, columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getColumnImage(final Object object, final int columnIndex) {
		if (columnIndex == 0) {
			return getImage(object);
		}
		return super.getColumnImage(object, columnIndex);
	}

}
