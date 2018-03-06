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
package mil.jpeojtrs.sca.prf.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.util.DceUuidUtil;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.prf.AbstractProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractPropertyItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected Object createWrapper(EObject object, EStructuralFeature feature, Object value, int index) {
		if (FeatureMapUtil.isFeatureMap(feature)) {
			value = new WrapperItemProvider((FeatureMap.Entry) value, object, (EAttribute) feature, index, adapterFactory, getResourceLocator());
		} else {
			value = super.createWrapper(object, feature, value, index);
		}
		return value;
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
			addModePropertyDescriptor(object);
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
			getString("_UI_AbstractProperty_description_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractProperty_description_feature", "_UI_AbstractProperty_type"),
			PrfPackage.Literals.ABSTRACT_PROPERTY__DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractProperty_id_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractProperty_id_feature", "_UI_AbstractProperty_type"),
			PrfPackage.Literals.ABSTRACT_PROPERTY__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractProperty_name_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractProperty_name_feature", "_UI_AbstractProperty_type"),
			PrfPackage.Literals.ABSTRACT_PROPERTY__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	public static final int PROP_NAME_COLUMN = 0;
	public static final int PROP_VALUE_COLUMN = 1;

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addModePropertyDescriptor(Object object) {
		boolean showMode = false;
		if (object instanceof EObject) {
			showMode = ((EObject) object).eContainer() instanceof Properties;
		}
		if (showMode) {
			itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractProperty_mode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractProperty_mode_feature", "_UI_AbstractProperty_type"),
				PrfPackage.Literals.ABSTRACT_PROPERTY__MODE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
		}
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractProperty) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractProperty_type") : getString("_UI_AbstractProperty_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractProperty.class)) {
		case PrfPackage.ABSTRACT_PROPERTY__DESCRIPTION:
		case PrfPackage.ABSTRACT_PROPERTY__ID:
		case PrfPackage.ABSTRACT_PROPERTY__NAME:
		case PrfPackage.ABSTRACT_PROPERTY__MODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PrfEditPlugin.INSTANCE;
	}

	// END GENERATED CODE

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		switch (columnIndex) {
		case AbstractPropertyItemProvider.PROP_NAME_COLUMN:
			return getImage(object);
		case AbstractPropertyItemProvider.PROP_VALUE_COLUMN:
			return null;
		default:
			return super.getColumnImage(object, columnIndex);
		}
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch (columnIndex) {
		case AbstractPropertyItemProvider.PROP_NAME_COLUMN:
			return getText(object);
		case AbstractPropertyItemProvider.PROP_VALUE_COLUMN:
			return getValueText((AbstractProperty) object);
		default:
			return super.getColumnText(object, columnIndex);
		}
	}

	protected String getValueText(AbstractProperty object) {
		return "";
	}

	/**
	 * If scoped IDs are created automatically.
	 */
	private boolean idScoping = false;

	/**
	 * Changes whether automatic creation of scoped IDs occurs. When enabled, changing a property's name will
	 * automatically create a scoped ID for it. Likewise, changeing a top-level property's name will cause all
	 * child elements of the property to have new scoped IDs created. By default scoping is disabled.
	 * @param enable Whether ID scoping should be enabled
	 * @since 4.0
	 */
	public void setIdScoping(boolean enable) {
		this.idScoping = enable;
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		// Our logic is specialized only if ID scoping is enabled, and the ID or name is being changed
		if (idScoping) {
			int featureID = feature.getFeatureID();
			switch (featureID) {
			case PrfPackage.ABSTRACT_PROPERTY__NAME:
				return createSetNameCommand(domain, owner, feature, value, index);
			case PrfPackage.ABSTRACT_PROPERTY__ID:
				return createSetIDCommand(domain, owner, feature, value, index);
			default:
			}
		}

		return super.createSetCommand(domain, owner, feature, value);
	}

	private Command createSetIDCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		// Our command will include the existing ID change
		final CompoundCommand command = new CompoundCommand();
		command.append(super.createSetCommand(domain, owner, feature, value));

		// Only a top-level property affects changes to the IDs of its children
		if (owner.eContainer() instanceof AbstractProperty) {
			return command.getCommandList().get(0);
		}

		// Update all children
		owner.eAllContents().forEachRemaining(child -> {
			// Must be a property
			if (!(child instanceof AbstractProperty)) {
				return;
			}
			AbstractProperty childProp = (AbstractProperty) child;

			// Must have a non-null, non-DCE ID
			String childID = childProp.getId();
			if (childID == null || DceUuidUtil.isValid(childID)) {
				return;
			}

			// Re-calculate the child property's ID
			String prefix;
			if (value == null || DceUuidUtil.isValid((String) value)) {
				prefix = "";
			} else {
				prefix = ((String) value) + "::";
			}
			int colonIndex = childID.lastIndexOf("::");
			String suffix = (colonIndex == -1) ? childID : childID.substring(colonIndex + 2);
			String newID = prefix + suffix;

			// Update the child's ID if different
			if (!newID.equals(childID)) {
				command.append(SetCommand.create(domain, childProp, feature, newID));
			}
		});

		// Unwrap in case we didn't add anything
		return command.unwrap();
	}

	private Command createSetNameCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		// Our command will include the existing name change
		final CompoundCommand command = new CompoundCommand();
		command.append(super.createSetCommand(domain, owner, feature, value));

		// We don't change the ID if the new name is null
		if (value == null) {
			return command.getCommandList().get(0);
		}

		// We don't change the ID if the existing ID is a DCE
		EStructuralFeature idFeature = PrfPackage.eINSTANCE.getAbstractProperty_Id();
		String id = (String) owner.eGet(idFeature);
		if (DceUuidUtil.isValid(id)) {
			return command.getCommandList().get(0);
		}

		// Compute the prefix
		EObject topLevelProp = owner;
		while (topLevelProp.eContainer() instanceof AbstractProperty) {
			topLevelProp = topLevelProp.eContainer();
		}
		String prefix = "";
		if (owner != topLevelProp) {
			String topLevelID = ((AbstractProperty) topLevelProp).getId();
			if (topLevelID != null && !DceUuidUtil.isValid(topLevelID)) {
				prefix = topLevelID + "::";
			}
		}

		// Set the ID
		command.append(SetCommand.create(domain, owner, idFeature, prefix + value));
		return command;
	}
}
