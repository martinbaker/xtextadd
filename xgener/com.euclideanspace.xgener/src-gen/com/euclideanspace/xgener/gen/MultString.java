/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.MultString#getMs <em>Ms</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.MultString#getSynpred <em>Synpred</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.MultString#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getMultString()
 * @model
 * @generated
 */
public interface MultString extends EObject
{
  /**
   * Returns the value of the '<em><b>Ms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ms</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ms</em>' attribute.
   * @see #setMs(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getMultString_Ms()
   * @model
   * @generated
   */
  String getMs();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.MultString#getMs <em>Ms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ms</em>' attribute.
   * @see #getMs()
   * @generated
   */
  void setMs(String value);

  /**
   * Returns the value of the '<em><b>Synpred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Synpred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Synpred</em>' attribute.
   * @see #setSynpred(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getMultString_Synpred()
   * @model
   * @generated
   */
  String getSynpred();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.MultString#getSynpred <em>Synpred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Synpred</em>' attribute.
   * @see #getSynpred()
   * @generated
   */
  void setSynpred(String value);

  /**
   * Returns the value of the '<em><b>Cs</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.ComboString}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cs</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getMultString_Cs()
   * @model containment="true"
   * @generated
   */
  EList<ComboString> getCs();

} // MultString
