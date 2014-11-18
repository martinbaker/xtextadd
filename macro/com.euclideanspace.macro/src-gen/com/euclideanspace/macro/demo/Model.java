/**
 */
package com.euclideanspace.macro.demo;

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
 *   <li>{@link com.euclideanspace.macro.demo.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.macro.demo.DemoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.macro.demo.Recurse}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see com.euclideanspace.macro.demo.DemoPackage#getModel_Contents()
   * @model containment="true"
   * @generated
   */
  EList<Recurse> getContents();

} // Model
