/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFor Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XForLoopExpression#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XForLoopExpression#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XForLoopExpression#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXForLoopExpression()
 * @model
 * @generated
 */
public interface XForLoopExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>Declared Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Param</em>' attribute.
   * @see #setDeclaredParam(String)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXForLoopExpression_DeclaredParam()
   * @model
   * @generated
   */
  String getDeclaredParam();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XForLoopExpression#getDeclaredParam <em>Declared Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Param</em>' attribute.
   * @see #getDeclaredParam()
   * @generated
   */
  void setDeclaredParam(String value);

  /**
   * Returns the value of the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Expression</em>' containment reference.
   * @see #setForExpression(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXForLoopExpression_ForExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getForExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XForLoopExpression#getForExpression <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Expression</em>' containment reference.
   * @see #getForExpression()
   * @generated
   */
  void setForExpression(XExpression value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXForLoopExpression_EachExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getEachExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XForLoopExpression#getEachExpression <em>Each Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Expression</em>' containment reference.
   * @see #getEachExpression()
   * @generated
   */
  void setEachExpression(XExpression value);

} // XForLoopExpression
