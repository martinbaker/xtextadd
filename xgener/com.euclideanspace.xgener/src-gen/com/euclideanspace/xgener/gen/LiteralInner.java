/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Inner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.LiteralInner#getPrimarytyp <em>Primarytyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.LiteralInner#getConstruct <em>Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getLiteralInner()
 * @model
 * @generated
 */
public interface LiteralInner extends EObject
{
  /**
   * Returns the value of the '<em><b>Primarytyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primarytyp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primarytyp</em>' attribute.
   * @see #setPrimarytyp(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getLiteralInner_Primarytyp()
   * @model
   * @generated
   */
  String getPrimarytyp();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.LiteralInner#getPrimarytyp <em>Primarytyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primarytyp</em>' attribute.
   * @see #getPrimarytyp()
   * @generated
   */
  void setPrimarytyp(String value);

  /**
   * Returns the value of the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Construct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Construct</em>' attribute.
   * @see #setConstruct(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getLiteralInner_Construct()
   * @model
   * @generated
   */
  String getConstruct();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.LiteralInner#getConstruct <em>Construct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Construct</em>' attribute.
   * @see #getConstruct()
   * @generated
   */
  void setConstruct(String value);

} // LiteralInner
