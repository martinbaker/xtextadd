/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.Model#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.EuclidMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getModel_M()
   * @model containment="true"
   * @generated
   */
  EList<EuclidMember> getM();

} // Model
