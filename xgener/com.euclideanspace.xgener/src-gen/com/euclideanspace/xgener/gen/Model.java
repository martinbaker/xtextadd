/**
 */
package com.euclideanspace.xgener.gen;

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
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getClas <em>Clas</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getProc <em>Proc</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getStatem <em>Statem</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Clas</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.ClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clas</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Clas()
   * @model containment="true"
   * @generated
   */
  EList<ClassType> getClas();

  /**
   * Returns the value of the '<em><b>Proc</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.Procedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Proc()
   * @model containment="true"
   * @generated
   */
  EList<Procedure> getProc();

  /**
   * Returns the value of the '<em><b>Statem</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statem</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statem</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Statem()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatem();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Exp()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExp();

} // Model
