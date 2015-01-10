/**
 */
package com.euclideanspace.phantom1.test1;

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
 *   <li>{@link com.euclideanspace.phantom1.test1.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.phantom1.test1.Test1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.phantom1.test1.Recurse}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see com.euclideanspace.phantom1.test1.Test1Package#getModel_Contents()
   * @model containment="true"
   * @generated
   */
  EList<Recurse> getContents();

} // Model
