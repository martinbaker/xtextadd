/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCasted Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XCastedExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XCastedExpression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXCastedExpression()
 * @model
 * @generated
 */
public interface XCastedExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCastedExpression_Target()
   * @model containment="true"
   * @generated
   */
  XExpression getTarget();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCastedExpression#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(XExpression value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCastedExpression_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCastedExpression#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // XCastedExpression
