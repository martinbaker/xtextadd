/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XType Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XTypeLiteral#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XTypeLiteral#getArrayDimensions <em>Array Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXTypeLiteral()
 * @model
 * @generated
 */
public interface XTypeLiteral extends XExpression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXTypeLiteral_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XTypeLiteral#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Array Dimensions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Dimensions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Dimensions</em>' attribute list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXTypeLiteral_ArrayDimensions()
   * @model unique="false"
   * @generated
   */
  EList<String> getArrayDimensions();

} // XTypeLiteral
