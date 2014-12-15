/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.ClassType#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.ClassType#getNoclass <em>Noclass</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.ClassType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.ClassType#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.ClassType#getBlocking <em>Blocking</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends EObject
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
   * @see com.euclideanspace.xgener.gen.GenPackage#getClassType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.ClassType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Noclass</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Noclass</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Noclass</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getClassType_Noclass()
   * @model unique="false"
   * @generated
   */
  EList<String> getNoclass();

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
   * @see com.euclideanspace.xgener.gen.GenPackage#getClassType_Prefix()
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
   * @see com.euclideanspace.xgener.gen.GenPackage#getClassType_Suffix()
   * @model containment="true"
   * @generated
   */
  EList<MultID> getSuffix();

  /**
   * Returns the value of the '<em><b>Blocking</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocking</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocking</em>' attribute list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getClassType_Blocking()
   * @model unique="false"
   * @generated
   */
  EList<String> getBlocking();

} // ClassType
