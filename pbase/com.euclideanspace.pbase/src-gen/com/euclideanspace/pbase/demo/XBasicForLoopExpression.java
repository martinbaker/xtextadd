/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBasic For Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getInitExpressions <em>Init Expressions</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getUpdateExpressions <em>Update Expressions</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXBasicForLoopExpression()
 * @model
 * @generated
 */
public interface XBasicForLoopExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>Init Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Expressions</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXBasicForLoopExpression_InitExpressions()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getInitExpressions();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXBasicForLoopExpression_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

  /**
   * Returns the value of the '<em><b>Update Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Expressions</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXBasicForLoopExpression_UpdateExpressions()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getUpdateExpressions();

  /**
   * Returns the value of the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Each Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Each Expression</em>' containment reference.
   * @see #setEachExpression(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXBasicForLoopExpression_EachExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getEachExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getEachExpression <em>Each Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Expression</em>' containment reference.
   * @see #getEachExpression()
   * @generated
   */
  void setEachExpression(XExpression value);

} // XBasicForLoopExpression
