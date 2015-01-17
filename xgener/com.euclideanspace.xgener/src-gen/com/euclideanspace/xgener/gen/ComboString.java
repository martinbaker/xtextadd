/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.ComboString#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getComboString()
 * @model
 * @generated
 */
public interface ComboString extends EObject
{
  /**
   * Returns the value of the '<em><b>Inner</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.MultString}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getComboString_Inner()
   * @model containment="true"
   * @generated
   */
  EList<MultString> getInner();

} // ComboString
