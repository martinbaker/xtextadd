/**
 */
package com.euclideanspace.phantom1.test1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.phantom1.test1.Recurse#getN <em>N</em>}</li>
 *   <li>{@link com.euclideanspace.phantom1.test1.Recurse#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.phantom1.test1.Test1Package#getRecurse()
 * @model
 * @generated
 */
public interface Recurse extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(String)
   * @see com.euclideanspace.phantom1.test1.Test1Package#getRecurse_N()
   * @model
   * @generated
   */
  String getN();

  /**
   * Sets the value of the '{@link com.euclideanspace.phantom1.test1.Recurse#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(String value);

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference.
   * @see #setR(Recurse)
   * @see com.euclideanspace.phantom1.test1.Test1Package#getRecurse_R()
   * @model containment="true"
   * @generated
   */
  Recurse getR();

  /**
   * Sets the value of the '{@link com.euclideanspace.phantom1.test1.Recurse#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(Recurse value);

} // Recurse
