/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSynchronized Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XSynchronizedExpression#getParam <em>Param</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XSynchronizedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXSynchronizedExpression()
 * @model
 * @generated
 */
public interface XSynchronizedExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXSynchronizedExpression_Param()
   * @model containment="true"
   * @generated
   */
  XExpression getParam();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XSynchronizedExpression#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(XExpression value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXSynchronizedExpression_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XSynchronizedExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // XSynchronizedExpression
