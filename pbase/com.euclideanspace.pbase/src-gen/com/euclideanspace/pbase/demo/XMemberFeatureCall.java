/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMember Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallTarget <em>Member Call Target</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isNullSafe <em>Null Safe</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitStatic <em>Explicit Static</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall()
 * @model
 * @generated
 */
public interface XMemberFeatureCall extends XExpression
{
  /**
   * Returns the value of the '<em><b>Member Call Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Call Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Call Target</em>' containment reference.
   * @see #setMemberCallTarget(XExpression)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_MemberCallTarget()
   * @model containment="true"
   * @generated
   */
  XExpression getMemberCallTarget();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallTarget <em>Member Call Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member Call Target</em>' containment reference.
   * @see #getMemberCallTarget()
   * @generated
   */
  void setMemberCallTarget(XExpression value);

  /**
   * Returns the value of the '<em><b>Null Safe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null Safe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null Safe</em>' attribute.
   * @see #setNullSafe(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_NullSafe()
   * @model
   * @generated
   */
  boolean isNullSafe();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isNullSafe <em>Null Safe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null Safe</em>' attribute.
   * @see #isNullSafe()
   * @generated
   */
  void setNullSafe(boolean value);

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_ExplicitStatic()
   * @model
   * @generated
   */
  boolean isExplicitStatic();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitStatic <em>Explicit Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Static</em>' attribute.
   * @see #isExplicitStatic()
   * @generated
   */
  void setExplicitStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Type Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Arguments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Arguments</em>' attribute list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_TypeArguments()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypeArguments();

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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /**
   * Returns the value of the '<em><b>Explicit Operation Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicit Operation Call</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Operation Call</em>' attribute.
   * @see #setExplicitOperationCall(boolean)
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_ExplicitOperationCall()
   * @model
   * @generated
   */
  boolean isExplicitOperationCall();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Operation Call</em>' attribute.
   * @see #isExplicitOperationCall()
   * @generated
   */
  void setExplicitOperationCall(boolean value);

  /**
   * Returns the value of the '<em><b>Member Call Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Call Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Call Arguments</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXMemberFeatureCall_MemberCallArguments()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getMemberCallArguments();

} // XMemberFeatureCall
