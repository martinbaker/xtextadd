/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDo While Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XDoWhileExpression#getBody <em>Body</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XDoWhileExpression#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXDoWhileExpression()
 * @model
 * @generated
 */
public interface XDoWhileExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXDoWhileExpression_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XDoWhileExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXDoWhileExpression_Predicate()
   * @model containment="true"
   * @generated
   */
  XExpression getPredicate();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XDoWhileExpression#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(XExpression value);

} // XDoWhileExpression
