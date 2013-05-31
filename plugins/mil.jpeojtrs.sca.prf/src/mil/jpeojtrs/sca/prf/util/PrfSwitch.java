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
package mil.jpeojtrs.sca.prf.util;

import java.util.List;

import mil.jpeojtrs.sca.prf.*;
import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.Enumeration;
import mil.jpeojtrs.sca.prf.Enumerations;
import mil.jpeojtrs.sca.prf.InputValue;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfDocumentRoot;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.prf.PropertyRefGroup;
import mil.jpeojtrs.sca.prf.PropertyRefSet;
import mil.jpeojtrs.sca.prf.Range;
import mil.jpeojtrs.sca.prf.ResultValue;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.prf.StructValue;
import mil.jpeojtrs.sca.prf.Test;
import mil.jpeojtrs.sca.prf.Values;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.prf.PrfPackage
 * @generated
 */
public class PrfSwitch< T > {

	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static PrfPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrfSwitch() {
        if (modelPackage == null) {
            modelPackage = PrfPackage.eINSTANCE;
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case PrfPackage.ABSTRACT_PROPERTY: {
                AbstractProperty abstractProperty = (AbstractProperty)theEObject;
                T result = caseAbstractProperty(abstractProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.ACTION: {
                Action action = (Action)theEObject;
                T result = caseAction(action);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.CONFIGURATION_KIND: {
                ConfigurationKind configurationKind = (ConfigurationKind)theEObject;
                T result = caseConfigurationKind(configurationKind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.ENUMERATION: {
                Enumeration enumeration = (Enumeration)theEObject;
                T result = caseEnumeration(enumeration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.ENUMERATIONS: {
                Enumerations enumerations = (Enumerations)theEObject;
                T result = caseEnumerations(enumerations);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.INPUT_VALUE: {
                InputValue inputValue = (InputValue)theEObject;
                T result = caseInputValue(inputValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.KIND: {
                Kind kind = (Kind)theEObject;
                T result = caseKind(kind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.PRF_DOCUMENT_ROOT: {
                PrfDocumentRoot prfDocumentRoot = (PrfDocumentRoot)theEObject;
                T result = casePrfDocumentRoot(prfDocumentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.PROPERTIES: {
                Properties properties = (Properties)theEObject;
                T result = caseProperties(properties);
                if (result == null) result = casePropertyContainer(properties);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.RANGE: {
                Range range = (Range)theEObject;
                T result = caseRange(range);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.RESULT_VALUE: {
                ResultValue resultValue = (ResultValue)theEObject;
                T result = caseResultValue(resultValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.SIMPLE: {
                Simple simple = (Simple)theEObject;
                T result = caseSimple(simple);
                if (result == null) result = caseAbstractProperty(simple);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.SIMPLE_SEQUENCE: {
                SimpleSequence simpleSequence = (SimpleSequence)theEObject;
                T result = caseSimpleSequence(simpleSequence);
                if (result == null) result = caseAbstractProperty(simpleSequence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.STRUCT: {
                Struct struct = (Struct)theEObject;
                T result = caseStruct(struct);
                if (result == null) result = caseAbstractProperty(struct);
                if (result == null) result = casePropertyContainer(struct);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.STRUCT_SEQUENCE: {
                StructSequence structSequence = (StructSequence)theEObject;
                T result = caseStructSequence(structSequence);
                if (result == null) result = caseAbstractProperty(structSequence);
                if (result == null) result = casePropertyContainer(structSequence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.STRUCT_VALUE: {
                StructValue structValue = (StructValue)theEObject;
                T result = caseStructValue(structValue);
                if (result == null) result = casePropertyRefContainer(structValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.TEST: {
                Test test = (Test)theEObject;
                T result = caseTest(test);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.VALUES: {
                Values values = (Values)theEObject;
                T result = caseValues(values);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.PROPERTY_CONTAINER: {
                PropertyContainer propertyContainer = (PropertyContainer)theEObject;
                T result = casePropertyContainer(propertyContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.ABSTRACT_PROPERTY_REF: {
                AbstractPropertyRef<?> abstractPropertyRef = (AbstractPropertyRef<?>)theEObject;
                T result = caseAbstractPropertyRef(abstractPropertyRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.PROPERTY_REF_CONTAINER: {
                PropertyRefContainer propertyRefContainer = (PropertyRefContainer)theEObject;
                T result = casePropertyRefContainer(propertyRefContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.PROPERTY_REF_GROUP: {
                PropertyRefGroup propertyRefGroup = (PropertyRefGroup)theEObject;
                T result = casePropertyRefGroup(propertyRefGroup);
                if (result == null) result = casePropertyRefContainer(propertyRefGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.PROPERTY_REF_SET: {
                PropertyRefSet propertyRefSet = (PropertyRefSet)theEObject;
                T result = casePropertyRefSet(propertyRefSet);
                if (result == null) result = casePropertyRefContainer(propertyRefSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.SIMPLE_REF: {
                SimpleRef simpleRef = (SimpleRef)theEObject;
                T result = caseSimpleRef(simpleRef);
                if (result == null) result = caseAbstractPropertyRef(simpleRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.SIMPLE_SEQUENCE_REF: {
                SimpleSequenceRef simpleSequenceRef = (SimpleSequenceRef)theEObject;
                T result = caseSimpleSequenceRef(simpleSequenceRef);
                if (result == null) result = caseAbstractPropertyRef(simpleSequenceRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.STRUCT_REF: {
                StructRef structRef = (StructRef)theEObject;
                T result = caseStructRef(structRef);
                if (result == null) result = caseAbstractPropertyRef(structRef);
                if (result == null) result = casePropertyRefContainer(structRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrfPackage.STRUCT_SEQUENCE_REF: {
                StructSequenceRef structSequenceRef = (StructSequenceRef)theEObject;
                T result = caseStructSequenceRef(structSequenceRef);
                if (result == null) result = caseAbstractPropertyRef(structSequenceRef);
                if (result == null) result = casePropertyRefContainer(structSequenceRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractProperty(AbstractProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAction(Action object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Configuration Kind</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Configuration Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConfigurationKind(ConfigurationKind object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumeration(Enumeration object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumerations</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumerations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumerations(Enumerations object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Input Value</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInputValue(InputValue object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Kind</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKind(Kind object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePrfDocumentRoot(PrfDocumentRoot object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProperties(Properties object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRange(Range object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Result Value</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResultValue(ResultValue object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSimple(Simple object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Simple Sequence</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSimpleSequence(SimpleSequence object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStruct(Struct object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Struct Sequence</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Struct Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStructSequence(StructSequence object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Struct Value</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Struct Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStructValue(StructValue object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTest(Test object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Values</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseValues(Values object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Container</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyContainer(PropertyContainer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Property Ref</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Property Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public <P extends AbstractProperty> T caseAbstractPropertyRef(AbstractPropertyRef<P> object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Ref Container</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Ref Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyRefContainer(PropertyRefContainer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Ref Group</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Ref Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyRefGroup(PropertyRefGroup object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Ref Set</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Ref Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyRefSet(PropertyRefSet object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Simple Ref</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSimpleRef(SimpleRef object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Simple Sequence Ref</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Sequence Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSimpleSequenceRef(SimpleSequenceRef object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Struct Ref</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Struct Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStructRef(StructRef object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Struct Sequence Ref</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Struct Sequence Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStructSequenceRef(StructSequenceRef object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	public T defaultCase(EObject object) {
        return null;
    }

} //PrfSwitch
