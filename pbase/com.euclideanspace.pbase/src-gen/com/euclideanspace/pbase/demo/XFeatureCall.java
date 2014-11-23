/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFeature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XFeatureCall#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XFeatureCall#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.XFeatureCall#getFeatureCallArguments <em>Feature Call Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXFeatureCall()
 * @model
 * @generated
 */
public interface XFeatureCall extends XExpression
{
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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXFeatureCall_TypeArguments()
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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXFeatureCall_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XFeatureCall#getFeature <em>Feature</em>}' attribute.
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
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXFeatureCall_ExplicitOperationCall()
   * @model
   * @generated
   */
  boolean isExplicitOperationCall();

  /**
   * Sets the value of the '{@link com.euclideanspace.pbase.demo.XFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Operation Call</em>' attribute.
   * @see #isExplicitOperationCall()
   * @generated
   */
  void setExplicitOperationCall(boolean value);

  /**
   * Returns the value of the '<em><b>Feature Call Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Call Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Call Arguments</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXFeatureCall_FeatureCallArguments()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getFeatureCallArguments();

} // XFeatureCall
