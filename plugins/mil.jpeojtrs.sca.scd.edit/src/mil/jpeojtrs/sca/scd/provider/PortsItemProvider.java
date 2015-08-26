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
package mil.jpeojtrs.sca.scd.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.scd.Ports} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ScdPackage.Literals.PORTS__GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.
		if (child instanceof Uses) {
			return ScdPackage.Literals.PORTS__USES;
		} else if (child instanceof Provides) {
			return ScdPackage.Literals.PORTS__PROVIDES;
		}
		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Ports.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ports"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Ports_type");
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

		switch (notification.getFeatureID(Ports.class)) {
		case ScdPackage.PORTS__GROUP:
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

		newChildDescriptors.add(createChildParameter(ScdPackage.Literals.PORTS__GROUP,
			FeatureMapUtil.createEntry(ScdPackage.Literals.PORTS__PROVIDES, ScdFactory.eINSTANCE.createProvides())));

		newChildDescriptors.add(createChildParameter(ScdPackage.Literals.PORTS__GROUP,
			FeatureMapUtil.createEntry(ScdPackage.Literals.PORTS__USES, ScdFactory.eINSTANCE.createUses())));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScdEditPlugin.INSTANCE;
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection< ? > collection) {
		if (feature == ScdPackage.Literals.PORTS__GROUP) {
			// For bi-directional ports, add all of the siblings to the collection of objects to remove.
			FeatureMap groups = ((Ports) owner).getGroup();
			List<Object> removed = new ArrayList<Object>(collection);
			for (Object child : collection) {
				AbstractPort port = (AbstractPort) AdapterFactoryEditingDomain.unwrap(child);
				AbstractPort sibling = port.getSibling();
				if (sibling != null) {
					removed.add(getEntryForValue(groups, sibling));
				}
			}
			collection = removed;
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	@Override
	protected Command createMoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == ScdPackage.Literals.PORTS__GROUP) {
			AbstractPort port = (AbstractPort) AdapterFactoryEditingDomain.unwrap(value);
			if (port.isBiDirectional()) {
				// Keep (or put) both sides of bi-directional ports together when moving.
				CompoundCommand command = new CompoundCommand();
				FeatureMap group = ((Ports) owner).getGroup();
				// If the port is being moved up in the list, offset the sibling index so that it is placed after the
				// selected port; otherwise, it will be inserted before.
				int siblingIndex = index;
				if (group.indexOf(value) > index) {
					siblingIndex += 1;
				}
				FeatureMap.Entry sibling = getEntryForValue(group, port.getSibling());
				command.append(super.createMoveCommand(domain, owner, feature, value, index));
				command.append(super.createMoveCommand(domain, owner, feature, sibling, siblingIndex));
				return command.unwrap();
			}
		}
		return super.createMoveCommand(domain, owner, feature, value, index);
	}

	private FeatureMap.Entry getEntryForValue(FeatureMap map, Object value) {
		for (FeatureMap.Entry entry : map) {
			if (entry.getValue() == value) {
				return entry;
			}
		}
		return null;
	}

}
