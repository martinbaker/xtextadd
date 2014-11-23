/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCatch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XCatchClause#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XCatchClause#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXCatchClause()
 * @model
 * @generated
 */
public interface XCatchClause extends EObject
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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCatchClause_DeclaredParam()
   * @model
   * @generated
   */
  String getDeclaredParam();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCatchClause#getDeclaredParam <em>Declared Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Param</em>' attribute.
   * @see #getDeclaredParam()
   * @generated
   */
  void setDeclaredParam(String value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCatchClause_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCatchClause#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // XCatchClause
