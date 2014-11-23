/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCase Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XCasePart#getTypeGuard <em>Type Guard</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XCasePart#getCase <em>Case</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XCasePart#getThen <em>Then</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XCasePart#isFallThrough <em>Fall Through</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXCasePart()
 * @model
 * @generated
 */
public interface XCasePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Guard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Guard</em>' attribute.
   * @see #setTypeGuard(String)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCasePart_TypeGuard()
   * @model
   * @generated
   */
  String getTypeGuard();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCasePart#getTypeGuard <em>Type Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Guard</em>' attribute.
   * @see #getTypeGuard()
   * @generated
   */
  void setTypeGuard(String value);

  /**
   * Returns the value of the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference.
   * @see #setCase(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCasePart_Case()
   * @model containment="true"
   * @generated
   */
  XExpression getCase();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCasePart#getCase <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' containment reference.
   * @see #getCase()
   * @generated
   */
  void setCase(XExpression value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCasePart_Then()
   * @model containment="true"
   * @generated
   */
  XExpression getThen();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCasePart#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(XExpression value);

  /**
   * Returns the value of the '<em><b>Fall Through</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fall Through</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fall Through</em>' attribute.
   * @see #setFallThrough(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCasePart_FallThrough()
   * @model
   * @generated
   */
  boolean isFallThrough();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XCasePart#isFallThrough <em>Fall Through</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fall Through</em>' attribute.
   * @see #isFallThrough()
   * @generated
   */
  void setFallThrough(boolean value);

} // XCasePart
