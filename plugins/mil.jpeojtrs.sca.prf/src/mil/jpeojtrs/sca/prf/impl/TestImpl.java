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
package mil.jpeojtrs.sca.prf.impl;

import mil.jpeojtrs.sca.prf.InputValue;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.ResultValue;
import mil.jpeojtrs.sca.prf.Test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.TestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.TestImpl#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.TestImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.TestImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends EObjectImpl implements Test {
	/**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
     * The cached value of the '{@link #getInputValue() <em>Input Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInputValue()
     * @generated
     * @ordered
     */
	protected InputValue inputValue;
	/**
     * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResultValue()
     * @generated
     * @ordered
     */
	protected ResultValue resultValue;
	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected static final String ID_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected String id = ID_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TestImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return PrfPackage.Literals.TEST;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDescription() {
        return description;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.TEST__DESCRIPTION, oldDescription, description));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InputValue getInputValue() {
        return inputValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInputValue(InputValue newInputValue, NotificationChain msgs) {
        InputValue oldInputValue = inputValue;
        inputValue = newInputValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.TEST__INPUT_VALUE, oldInputValue, newInputValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInputValue(InputValue newInputValue) {
        if (newInputValue != inputValue) {
            NotificationChain msgs = null;
            if (inputValue != null)
                msgs = ((InternalEObject)inputValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.TEST__INPUT_VALUE, null, msgs);
            if (newInputValue != null)
                msgs = ((InternalEObject)newInputValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.TEST__INPUT_VALUE, null, msgs);
            msgs = basicSetInputValue(newInputValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.TEST__INPUT_VALUE, newInputValue, newInputValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResultValue getResultValue() {
        return resultValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetResultValue(ResultValue newResultValue, NotificationChain msgs) {
        ResultValue oldResultValue = resultValue;
        resultValue = newResultValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.TEST__RESULT_VALUE, oldResultValue, newResultValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResultValue(ResultValue newResultValue) {
        if (newResultValue != resultValue) {
            NotificationChain msgs = null;
            if (resultValue != null)
                msgs = ((InternalEObject)resultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.TEST__RESULT_VALUE, null, msgs);
            if (newResultValue != null)
                msgs = ((InternalEObject)newResultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.TEST__RESULT_VALUE, null, msgs);
            msgs = basicSetResultValue(newResultValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.TEST__RESULT_VALUE, newResultValue, newResultValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getId() {
        return id;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.TEST__ID, oldId, id));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PrfPackage.TEST__INPUT_VALUE:
                return basicSetInputValue(null, msgs);
            case PrfPackage.TEST__RESULT_VALUE:
                return basicSetResultValue(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PrfPackage.TEST__DESCRIPTION:
                return getDescription();
            case PrfPackage.TEST__INPUT_VALUE:
                return getInputValue();
            case PrfPackage.TEST__RESULT_VALUE:
                return getResultValue();
            case PrfPackage.TEST__ID:
                return getId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PrfPackage.TEST__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PrfPackage.TEST__INPUT_VALUE:
                setInputValue((InputValue)newValue);
                return;
            case PrfPackage.TEST__RESULT_VALUE:
                setResultValue((ResultValue)newValue);
                return;
            case PrfPackage.TEST__ID:
                setId((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case PrfPackage.TEST__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PrfPackage.TEST__INPUT_VALUE:
                setInputValue((InputValue)null);
                return;
            case PrfPackage.TEST__RESULT_VALUE:
                setResultValue((ResultValue)null);
                return;
            case PrfPackage.TEST__ID:
                setId(ID_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PrfPackage.TEST__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PrfPackage.TEST__INPUT_VALUE:
                return inputValue != null;
            case PrfPackage.TEST__RESULT_VALUE:
                return resultValue != null;
            case PrfPackage.TEST__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (description: ");
        result.append(description);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

	public InputValue getInputvalue() {
	    return getInputValue();
    }

} //TestImpl
