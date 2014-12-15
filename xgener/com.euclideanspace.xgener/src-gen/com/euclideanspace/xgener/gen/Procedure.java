/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Procedure#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Procedure#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Procedure#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
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
   * @see com.euclideanspace.xgener.gen.GenPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.MultID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getProcedure_Prefix()
   * @model containment="true"
   * @generated
   */
  EList<MultID> getPrefix();

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.MultID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getProcedure_Suffix()
   * @model containment="true"
   * @generated
   */
  EList<MultID> getSuffix();

  /**
   * Returns the value of the '<em><b>Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getProcedure_Types()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypes();

} // Procedure
