/**
 */
package com.euclideanspace.macro.demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.macro.demo.Recurse#getMd <em>Md</em>}</li>
 *   <li>{@link com.euclideanspace.macro.demo.Recurse#getR <em>R</em>}</li>
 *   <li>{@link com.euclideanspace.macro.demo.Recurse#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.macro.demo.DemoPackage#getRecurse()
 * @model
 * @generated
 */
public interface Recurse extends EObject
{
  /**
   * Returns the value of the '<em><b>Md</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.macro.demo.MacroDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Md</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Md</em>' containment reference list.
   * @see com.euclideanspace.macro.demo.DemoPackage#getRecurse_Md()
   * @model containment="true"
   * @generated
   */
  EList<MacroDef> getMd();

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.macro.demo.Recurse}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference list.
   * @see com.euclideanspace.macro.demo.DemoPackage#getRecurse_R()
   * @model containment="true"
   * @generated
   */
  EList<Recurse> getR();

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute list.
   * @see com.euclideanspace.macro.demo.DemoPackage#getRecurse_N()
   * @model unique="false"
   * @generated
   */
  EList<String> getN();

} // Recurse
