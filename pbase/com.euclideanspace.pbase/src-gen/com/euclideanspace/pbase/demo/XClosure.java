/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XClosure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XClosure#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XClosure#isExplicitSyntax <em>Explicit Syntax</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XClosure#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXClosure()
 * @model
 * @generated
 */
public interface XClosure extends XExpression
{
  /**
   * Returns the value of the '<em><b>Declared Formal Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Formal Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Formal Parameters</em>' attribute list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXClosure_DeclaredFormalParameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getDeclaredFormalParameters();

  /**
   * Returns the value of the '<em><b>Explicit Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicit Syntax</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Syntax</em>' attribute.
   * @see #setExplicitSyntax(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXClosure_ExplicitSyntax()
   * @model
   * @generated
   */
  boolean isExplicitSyntax();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XClosure#isExplicitSyntax <em>Explicit Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Syntax</em>' attribute.
   * @see #isExplicitSyntax()
   * @generated
   */
  void setExplicitSyntax(boolean value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXClosure_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XClosure#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // XClosure
