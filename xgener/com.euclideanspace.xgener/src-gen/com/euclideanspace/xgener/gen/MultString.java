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
   * Returns the value of the '<em><b>Ms</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ms</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ms</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getMultString_Ms()
   * @model unique="false"
   * @generated
   */
  EList<String> getMs();

} // MultString
