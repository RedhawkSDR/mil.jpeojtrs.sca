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
package mil.jpeojtrs.sca.sad.provider;


import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPackage;

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
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.sad.Port} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortItemProvider(AdapterFactory adapterFactory) {
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
			addUsesIdentifierPropertyDescriptor(object);
			addProvidesIndentifierPropertyDescriptor(object);
			addSupportedIdentifierPropertyDescriptor(object);
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Port_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Port_description_feature", "_UI_Port_type"),
				 SadPackage.Literals.PORT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Port_usesIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Port_usesIdentifier_feature", "_UI_Port_type"),
				 SadPackage.Literals.PORT__USES_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Indentifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesIndentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Port_providesIndentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Port_providesIndentifier_feature", "_UI_Port_type"),
				 SadPackage.Literals.PORT__PROVIDES_INDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Port_supportedIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Port_supportedIdentifier_feature", "_UI_Port_type"),
				 SadPackage.Literals.PORT__SUPPORTED_IDENTIFIER,
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
			childrenFeatures.add(SadPackage.Literals.PORT__COMPONENT_INSTANTIATION_REF);
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
	 * This returns Port.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Port port = (Port) object;
		if (port.getProvidesIndentifier() != null) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ProvidesPort"));
		} else if (port.getSupportedIdentifier() != null) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentSupportedInterface"));
		} else if (port.getUsesIdentifier() != null) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/UsesPort"));
		}
		return null;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Port)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Port_type") :
			getString("_UI_Port_type") + " " + label;
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

		switch (notification.getFeatureID(Port.class)) {
			case SadPackage.PORT__DESCRIPTION:
			case SadPackage.PORT__USES_IDENTIFIER:
			case SadPackage.PORT__PROVIDES_INDENTIFIER:
			case SadPackage.PORT__SUPPORTED_IDENTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
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
				(SadPackage.Literals.PORT__COMPONENT_INSTANTIATION_REF,
				 SadFactory.eINSTANCE.createSadComponentInstantiationRef()));
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

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return getComponentImage(object);
		case 1:
			return getPortImage((Port) object);
		}
	    return super.getColumnImage(object, columnIndex);
	}
	
	private Object getPortImage(Port object) {
		if (object.getSupportedIdentifier() != null){
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentSupportedInterface")); 
		}
		if (object.getProvidesIndentifier() != null) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ProvidesPort"));
		}
		if (object.getUsesIdentifier() != null) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/UsesPort"));
		}
	    return null;
    }

	private Object getComponentImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInstantiation"));
    }

	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return getComponentName((Port) object);
		case 1:
			return getPortName((Port)object);
		}
	    return super.getColumnText(object, columnIndex);
	}

	private String getPortName(Port port) {
		String portLabel = "<Port>";
		if (port.getProvidesIndentifier() != null) {
			portLabel = port.getProvidesIndentifier();
		} else if (port.getSupportedIdentifier() != null) {
			portLabel = port.getSupportedIdentifier();
		} else if (port.getUsesIdentifier() != null) {
			portLabel = port.getUsesIdentifier();
		}
	    return portLabel;
    }

	private String getComponentName(Port port) {
		String componentName = "<Component>";
		if (port.getComponentInstantiationRef() != null) {
			componentName = port.getComponentInstantiationRef().getInstantiation().getUsageName();
			if (componentName == null) {
				componentName = port.getComponentInstantiationRef().getRefid();
			}
		}
	    return componentName;
    }
}
