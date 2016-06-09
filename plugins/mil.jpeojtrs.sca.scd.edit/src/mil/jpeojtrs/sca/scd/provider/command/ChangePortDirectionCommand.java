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
package mil.jpeojtrs.sca.scd.provider.command;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.PortDirection;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.Uses;

public class ChangePortDirectionCommand extends AbstractOverrideableCommand {
	private final AbstractPort port;
	private final PortDirection direction;

	private FeatureMap owner;
	private FeatureMap.Entry toRemove = null;
	private int removeIndex = -1;
	private FeatureMap.Entry toAdd = null;
	private int addIndex = -1;

	private Collection< ? > affectedObjects;
	private Collection<Object> originalObjects = new ArrayList<Object>();
	private Collection<Object> newObjects = new ArrayList<Object>();

	public ChangePortDirectionCommand(EditingDomain domain, AbstractPort port, PortDirection direction) {
		super(domain, "Change Direction");
		this.port = port;
		this.direction = direction;
	}

	@Override
	protected boolean prepare() {
		if (port == null || direction == null || port.getDirection() == direction) {
			return false;
		}

		owner = ((Ports) port.eContainer()).getGroup();
		FeatureMap.Entry entry = getEntryForValue(owner, port);
		if (entry == null) {
			return false;
		}
		originalObjects.add(entry);

		if (port.isBiDirectional()) {
			FeatureMap.Entry sibling = getEntryForValue(owner, port.getSibling());
			originalObjects.add(sibling);
			if (direction == getBaseDirection(port)) {
				toRemove = sibling;
				newObjects.add(entry);
			} else {
				toRemove = entry;
				newObjects.add(sibling);
			}
			removeIndex = owner.indexOf(toRemove);
		} else {
			// Create a new sibling of the opposite type
			AbstractPort sibling = createSibling(port);
			toAdd = FeatureMapUtil.createEntry(getFeature(sibling), sibling);
			newObjects.add(toAdd);

			addIndex = owner.indexOf(entry);
			removeIndex = addIndex;
			if (direction == PortDirection.BIDIR) {
				// Insert the new port directly after the old port to keep them together
				newObjects.add(entry);
				addIndex += 1;
			} else {
				toRemove = entry;
			}
		}
		return true;
	}

	@Override
	public void doUndo() {
		if (toAdd != null) {
			owner.remove(toAdd);
		}
		if (toRemove != null) {
			owner.add(removeIndex, toRemove);
		}
		affectedObjects = originalObjects;
	}

	@Override
	public void doRedo() {
		doExecute();
	}

	@Override
	public void doExecute() {
		if (toAdd != null) {
			owner.add(addIndex, toAdd);
		}
		if (toRemove != null) {
			owner.remove(toRemove);
		}
		affectedObjects = newObjects;
	}

	@Override
	public Collection< ? > doGetAffectedObjects() {
		return affectedObjects;
	}

	private FeatureMap.Entry getEntryForValue(FeatureMap map, Object value) {
		for (FeatureMap.Entry entry : map) {
			if (entry.getValue() == value) {
				return entry;
			}
		}
		return null;
	}

	private EStructuralFeature getFeature(AbstractPort port) {
		switch (port.eClass().getClassifierID()) {
		case ScdPackage.PROVIDES:
			return ScdPackage.Literals.PORTS__PROVIDES;
		case ScdPackage.USES:
			return ScdPackage.Literals.PORTS__USES;
		default:
			return null;
		}
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
}
