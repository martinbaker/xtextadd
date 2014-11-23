/**
 */
package com.euclideanspace.pbase.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAssignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XAssignment#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XAssignment#getAssignable <em>Assignable</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XAssignment#isExplicitStatic <em>Explicit Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXAssignment()
 * @model
 * @generated
 */
public interface XAssignment extends XExpression
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXAssignment_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XAssignment#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXAssignment_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XAssignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

  /**
   * Returns the value of the '<em><b>Assignable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignable</em>' containment reference.
   * @see #setAssignable(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXAssignment_Assignable()
   * @model containment="true"
   * @generated
   */
  XExpression getAssignable();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XAssignment#getAssignable <em>Assignable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignable</em>' containment reference.
   * @see #getAssignable()
   * @generated
   */
  void setAssignable(XExpression value);

  /**
   * Returns the value of the '<em><b>Explicit Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicit Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Static</em>' attribute.
   * @see #setExplicitStatic(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXAssignment_ExplicitStatic()
   * @model
   * @generated
   */
  boolean isExplicitStatic();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XAssignment#isExplicitStatic <em>Explicit Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Static</em>' attribute.
   * @see #isExplicitStatic()
   * @generated
   */
  void setExplicitStatic(boolean value);

} // XAssignment
