/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getPar1 <em>Par1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getInfix <em>Infix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getInfixleft <em>Infixleft</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getBracket <em>Bracket</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getBraces <em>Braces</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Expression#getParenthasis <em>Parenthasis</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
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
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Expression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Prefix()
   * @model unique="false"
   * @generated
   */
  EList<String> getPrefix();

  /**
   * Returns the value of the '<em><b>Par1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par1</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par1</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Par1()
   * @model unique="false"
   * @generated
   */
  EList<String> getPar1();

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Suffix()
   * @model unique="false"
   * @generated
   */
  EList<String> getSuffix();

  /**
   * Returns the value of the '<em><b>Infix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infix</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Infix()
   * @model unique="false"
   * @generated
   */
  EList<String> getInfix();

  /**
   * Returns the value of the '<em><b>Par2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par2</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Par2()
   * @model unique="false"
   * @generated
   */
  EList<String> getPar2();

  /**
   * Returns the value of the '<em><b>Infixleft</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infixleft</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infixleft</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Infixleft()
   * @model unique="false"
   * @generated
   */
  EList<String> getInfixleft();

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Literal()
   * @model unique="false"
   * @generated
   */
  EList<String> getLiteral();

  /**
   * Returns the value of the '<em><b>Bracket</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bracket</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bracket</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Bracket()
   * @model unique="false"
   * @generated
   */
  EList<String> getBracket();

  /**
   * Returns the value of the '<em><b>Braces</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Braces</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Braces</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Braces()
   * @model unique="false"
   * @generated
   */
  EList<String> getBraces();

  /**
   * Returns the value of the '<em><b>Parenthasis</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parenthasis</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthasis</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getExpression_Parenthasis()
   * @model unique="false"
   * @generated
   */
  EList<String> getParenthasis();

} // Expression
