/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.MultID#getMi <em>Mi</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getMultID()
 * @model
 * @generated
 */
public interface MultID extends EObject
{
  /**
   * Returns the value of the '<em><b>Mi</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mi</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mi</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getMultID_Mi()
   * @model unique="false"
   * @generated
   */
  EList<String> getMi();

} // MultID
