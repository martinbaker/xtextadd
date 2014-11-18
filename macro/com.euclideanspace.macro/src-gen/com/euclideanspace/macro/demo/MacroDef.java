/**
 */
package com.euclideanspace.macro.demo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.macro.demo.MacroDef#getMn <em>Mn</em>}</li>
 *   <li>{@link com.euclideanspace.macro.demo.MacroDef#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.macro.demo.DemoPackage#getMacroDef()
 * @model
 * @generated
 */
public interface MacroDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Mn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mn</em>' attribute.
   * @see #setMn(String)
   * @see com.euclideanspace.macro.demo.DemoPackage#getMacroDef_Mn()
   * @model
   * @generated
   */
  String getMn();

  /**
   * Sets the value of the '{@link com.euclideanspace.macro.demo.MacroDef#getMn <em>Mn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mn</em>' attribute.
   * @see #getMn()
   * @generated
   */
  void setMn(String value);

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(Recurse)
   * @see com.euclideanspace.macro.demo.DemoPackage#getMacroDef_M()
   * @model containment="true"
   * @generated
   */
  Recurse getM();

  /**
   * Sets the value of the '{@link com.euclideanspace.macro.demo.MacroDef#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(Recurse value);

} // MacroDef
