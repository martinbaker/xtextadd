/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XVariable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XVariableDeclaration#isWriteable <em>Writeable</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXVariableDeclaration()
 * @model
 * @generated
 */
public interface XVariableDeclaration extends XExpression
{
  /**
   * Returns the value of the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writeable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writeable</em>' attribute.
   * @see #setWriteable(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXVariableDeclaration_Writeable()
   * @model
   * @generated
   */
  boolean isWriteable();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#isWriteable <em>Writeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Writeable</em>' attribute.
   * @see #isWriteable()
   * @generated
   */
  void setWriteable(boolean value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXVariableDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXVariableDeclaration_Right()
   * @model containment="true"
   * @generated
   */
  XExpression getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(XExpression value);

} // XVariableDeclaration
