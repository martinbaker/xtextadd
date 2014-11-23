/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.EuclidParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.EuclidParameter#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.EuclidParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getEuclidParameter()
 * @model
 * @generated
 */
public interface EuclidParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' attribute.
   * @see #setParameterType(String)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getEuclidParameter_ParameterType()
   * @model
   * @generated
   */
  String getParameterType();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.EuclidParameter#getParameterType <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' attribute.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(String value);

  /**
   * Returns the value of the '<em><b>Var Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Arg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Arg</em>' attribute.
   * @see #setVarArg(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getEuclidParameter_VarArg()
   * @model
   * @generated
   */
  boolean isVarArg();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.EuclidParameter#isVarArg <em>Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Arg</em>' attribute.
   * @see #isVarArg()
   * @generated
   */
  void setVarArg(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getEuclidParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.EuclidParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EuclidParameter
