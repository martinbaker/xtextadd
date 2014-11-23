/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XIf Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XIfExpression#getIf <em>If</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XIfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XIfExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXIfExpression()
 * @model
 * @generated
 */
public interface XIfExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXIfExpression_If()
   * @model containment="true"
   * @generated
   */
  XExpression getIf();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XIfExpression#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(XExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXIfExpression_Then()
   * @model containment="true"
   * @generated
   */
  XExpression getThen();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XIfExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(XExpression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXIfExpression_Else()
   * @model containment="true"
   * @generated
   */
  XExpression getElse();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XIfExpression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(XExpression value);

} // XIfExpression
