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
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getProj <em>Proj</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getClas <em>Clas</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getProc <em>Proc</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getPrim <em>Prim</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Model#getLit <em>Lit</em>}</li>
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
   * Returns the value of the '<em><b>Proj</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proj</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proj</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Proj()
   * @model containment="true"
   * @generated
   */
  EList<Project> getProj();

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
   * Returns the value of the '<em><b>Prim</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.Primary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prim</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prim</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Prim()
   * @model containment="true"
   * @generated
   */
  EList<Primary> getPrim();

  /**
   * Returns the value of the '<em><b>Lit</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.xgener.gen.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' containment reference list.
   * @see com.euclideanspace.xgener.gen.GenPackage#getModel_Lit()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getLit();

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
