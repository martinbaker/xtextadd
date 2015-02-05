/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Project#getProj <em>Proj</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Project#getNam <em>Nam</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Proj</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.QualifiedName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proj</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proj</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getProject_Proj()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedName> getProj();

  /**
   * Returns the value of the '<em><b>Nam</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.QualifiedName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nam</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nam</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getProject_Nam()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedName> getNam();

} // Project
