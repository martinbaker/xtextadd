/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSwitch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XSwitchExpression#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XSwitchExpression#getSwitch <em>Switch</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XSwitchExpression#getCases <em>Cases</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XSwitchExpression#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXSwitchExpression()
 * @model
 * @generated
 */
public interface XSwitchExpression extends XExpression
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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXSwitchExpression_DeclaredParam()
   * @model
   * @generated
   */
  String getDeclaredParam();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getDeclaredParam <em>Declared Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Param</em>' attribute.
   * @see #getDeclaredParam()
   * @generated
   */
  void setDeclaredParam(String value);

  /**
   * Returns the value of the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' containment reference.
   * @see #setSwitch(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXSwitchExpression_Switch()
   * @model containment="true"
   * @generated
   */
  XExpression getSwitch();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getSwitch <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' containment reference.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(XExpression value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.XCasePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXSwitchExpression_Cases()
   * @model containment="true"
   * @generated
   */
  EList<XCasePart> getCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXSwitchExpression_Default()
   * @model containment="true"
   * @generated
   */
  XExpression getDefault();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(XExpression value);

} // XSwitchExpression
