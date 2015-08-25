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
import java.util.Collections;
import java.util.List;

import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.PortDirection;
import mil.jpeojtrs.sca.scd.PortType;
import mil.jpeojtrs.sca.scd.PortTypeContainer;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.scd.AbstractPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractPortItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPortItemProvider(AdapterFactory adapterFactory) {
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
			addNamePropertyDescriptor(object);
			addRepIDPropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * @since 2.4
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractPort_description_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_description_feature", "_UI_AbstractPort_type"),
			ScdPackage.Literals.ABSTRACT_PORT__DESCRIPTION, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractPort_name_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_name_feature", "_UI_AbstractPort_type"), ScdPackage.Literals.ABSTRACT_PORT__NAME,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rep ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractPort_repID_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_repID_feature", "_UI_AbstractPort_type"),
			ScdPackage.Literals.ABSTRACT_PORT__REP_ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractPort_interface_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_interface_feature", "_UI_AbstractPort_type"),
			ScdPackage.Literals.ABSTRACT_PORT__INTERFACE, false, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * @since 2.4
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_AbstractPort_direction_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_direction_feature", "_UI_AbstractPort_type"),
			ScdPackage.Literals.ABSTRACT_PORT__DIRECTION, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractPort) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractPort_type") : getString("_UI_AbstractPort_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractPort.class)) {
		case ScdPackage.ABSTRACT_PORT__DESCRIPTION:
		case ScdPackage.ABSTRACT_PORT__PORT_TYPE:
		case ScdPackage.ABSTRACT_PORT__NAME:
		case ScdPackage.ABSTRACT_PORT__REP_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		AbstractPort port = (AbstractPort) owner;
		switch (feature.getFeatureID()) {
		case ScdPackage.ABSTRACT_PORT__DESCRIPTION:
		case ScdPackage.ABSTRACT_PORT__NAME:
		case ScdPackage.ABSTRACT_PORT__REP_ID:
			if (port.isBiDirectional()) {
				// Create a compound command to do the set on both the target port and the sibling, using the method
				// from the superclass to avoid infinite recursion.
				CompoundCommand command = new CompoundCommand();
				command.append(super.createSetCommand(domain, port, feature, value, index));
				command.append(super.createSetCommand(domain, port.getSibling(), feature, value, index));
				return command;
			}
			break;
		case ScdPackage.ABSTRACT_PORT__DIRECTION:
			return createChangePortDirectionCommand(domain, port, (PortDirection) value);
		default:
			break;
		}
		return super.createSetCommand(domain, owner, feature, value, index);
	}

	/**
	 * @since 2.4
	 */
	protected Command createChangePortDirectionCommand(EditingDomain domain, AbstractPort port, PortDirection direction) {
		if (port.getDirection().equals(direction)) {
			return UnexecutableCommand.INSTANCE;
		}

		// Track the new port (and possibly its sibling) for reporting the affected objects on execute
		final Collection<Object> newObjects = new ArrayList<Object>();

		// Track the original port (and again, possibly its sibling) for reporting the affected objects on undo
		final Collection<Object> originalObjects = new ArrayList<Object>();
		originalObjects.add(port);

		Command command;
		if (port.isBiDirectional()) {
			// Add the sibling, so that both ports are considered the original set
			originalObjects.add(port.getSibling());

			// Determine which port to remove based on the desired direction, and add the remaining port to the set of
			// new objects
			if (direction == getBaseDirection(port)) {
				port = port.getSibling();
			}
			newObjects.add(port.getSibling());
			command = RemoveCommand.create(domain, port);
		} else {
			// Create a new sibling of the opposite type
			AbstractPort sibling = createSibling(port);
			newObjects.add(sibling);
			if (direction == PortDirection.BIDIR) {
				// Include the new sibling as part of the set of new objects
				newObjects.add(port);
				Ports ports = (Ports) port.eContainer();
				// Insert the new port directly after the old port to keep them together
				int index = getIndexForEntry(ports.getGroup(), port);
				command = AddCommand.create(domain, ports, null, sibling, index + 1);
			} else {
				command = ReplaceCommand.create(domain, port, Collections.singleton(sibling));
			}
		}

		return new CommandWrapper(command) {

			private Collection<Object> affectedObjects = null;

			@Override
			public String getLabel() {
				return "Change Direction";
			}

			@Override
			public void execute() {
				super.execute();
				affectedObjects = newObjects;
			}

			@Override
			public void undo() {
				super.undo();
				affectedObjects = originalObjects;
			}

			@Override
			public void redo() {
				super.redo();
				affectedObjects = newObjects;
			}

			@Override
			public Collection< ? > getAffectedObjects() {
				return affectedObjects;
			}
		};
	}

	private int getIndexForEntry(FeatureMap map, Object value) {
		for (int index = 0; index < map.size(); ++index) {
			if (map.getValue(index) == value) {
				return index;
			}
		}
		return CommandParameter.NO_INDEX;
	}

	private PortDirection getBaseDirection(AbstractPort port) {
		if (port instanceof Uses) {
			return PortDirection.USES;
		} else {
			return PortDirection.PROVIDES;
		}
	}

	private AbstractPort createSibling(AbstractPort port) {
		AbstractPort sibling;
		if (port instanceof Uses) {
			sibling = ScdFactory.eINSTANCE.createProvides();
		} else {
			sibling = ScdFactory.eINSTANCE.createUses();
		}
		sibling.setDescription(port.getDescription());
		sibling.setName(port.getName());
		sibling.setRepID(port.getRepID());
		sibling.getPortType().addAll(EcoreUtil.copyAll(port.getPortType()));
		return sibling;
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection< ? > collection, int index) {
		if (feature == ScdPackage.Literals.ABSTRACT_PORT__PORT_TYPE) {
			AbstractPort port = (AbstractPort) owner;

			// Filter out values that are already set and create PortTypeContainer instances for raw PortType values
			collection = toPortTypeContainers(port, collection);
			if (port.isBiDirectional()) {
				// Create a compound command to do the add on both the target port and the sibling, using the method
				// from the superclass to avoid infinite recursion.
				CompoundCommand command = new CompoundCommand();
				command.append(super.createAddCommand(domain, port, feature, collection, index));

				// Create copies of the PortTypeContainers, otherwise they will just be moved to the sibling. 
				collection = EcoreUtil.copyAll(collection);
				command.append(super.createAddCommand(domain, port.getSibling(), feature, collection, index));
				return command;
			}
		}
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

	private Collection<PortTypeContainer> toPortTypeContainers(AbstractPort port, Collection< ? > types) {
		Collection<PortTypeContainer> collection = new ArrayList<PortTypeContainer>();
		for (Object type : types) {
			if (type instanceof PortTypeContainer) {
				// Extract the enumeration value--the container instances aren't important, just the value
				type = ((PortTypeContainer) type).getType();
			}

			if (type instanceof PortType) {
				// Only add the new type if it's not already set on the port or in the current collection
				PortType portType = (PortType) type;
				if (findPortType(port.getPortType(), portType) == null && findPortType(collection, portType) == null) {
					collection.add(ScdFactory.eINSTANCE.createPortTypeContainer(portType));
				}
			}
		}
		return collection;
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection< ? > collection) {
		if (feature == ScdPackage.Literals.ABSTRACT_PORT__PORT_TYPE) {
			AbstractPort port = (AbstractPort) owner;

			if (port.isBiDirectional()) {
				// Create a compound command to do the remove on both the target port and the sibling, using the
				// method from the superclass to avoid infinite recursion.
				CompoundCommand command = new CompoundCommand();

				// Find PortTypeContainer instances that contain the PortType enumerated values, if necessary,
				Collection<PortTypeContainer> removed = findPortTypeContainers(port, collection);
				command.append(super.createRemoveCommand(domain, port, feature, removed));

				// Find the matching containers in the sibling port and remove those as well
				AbstractPort sibling = port.getSibling();
				removed = findPortTypeContainers(sibling, collection);
				command.append(super.createRemoveCommand(domain, sibling, feature, removed));
				return command;
			} else {
				collection = findPortTypeContainers(port, collection);
			}
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	private Collection<PortTypeContainer> findPortTypeContainers(AbstractPort port, Collection< ? > types) {
		Collection<PortTypeContainer> collection = new ArrayList<PortTypeContainer>();
		for (Object type : types) {
			if (type instanceof PortTypeContainer) {
				collection.add((PortTypeContainer) type);
			} else if (type instanceof PortType) {
				PortTypeContainer container = findPortType(port.getPortType(), (PortType) type);
				if (container != null) {
					collection.add(container);
				}
			}
		}
		return collection;
	}

	private PortTypeContainer findPortType(Collection<PortTypeContainer> collection, PortType type) {
		for (PortTypeContainer container : collection) {
			if (container.getType().equals(type)) {
				return container;
			}
		}
		return null;
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
		return ScdEditPlugin.INSTANCE;
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		if (columnIndex == 0) {
			return getImage(object);
		}
		return super.getColumnImage(object, columnIndex);
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		AbstractPort port = (AbstractPort) object;
		switch (columnIndex) {
		case 0:
			return port.getName();
		case 1:
			return port.getRepID();
		default:
			return null;
		}
	}

}
