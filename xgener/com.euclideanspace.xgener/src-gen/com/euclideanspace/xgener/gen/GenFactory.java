/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.xgener.gen.GenPackage
 * @generated
 */
public interface GenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenFactory eINSTANCE = com.euclideanspace.xgener.gen.impl.GenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Class Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Type</em>'.
   * @generated
   */
  ClassType createClassType();

  /**
   * Returns a new object of class '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure</em>'.
   * @generated
   */
  Procedure createProcedure();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precedence</em>'.
   * @generated
   */
  Precedence createPrecedence();

  /**
   * Returns a new object of class '<em>Sub Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Precedence</em>'.
   * @generated
   */
  SubPrecedence createSubPrecedence();

  /**
   * Returns a new object of class '<em>Inner Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inner Precedence</em>'.
   * @generated
   */
  InnerPrecedence createInnerPrecedence();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Mult String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult String</em>'.
   * @generated
   */
  MultString createMultString();

  /**
   * Returns a new object of class '<em>Combo String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combo String</em>'.
   * @generated
   */
  ComboString createComboString();

  /**
   * Returns a new object of class '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary</em>'.
   * @generated
   */
  Primary createPrimary();

  /**
   * Returns a new object of class '<em>Primary Inner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Inner</em>'.
   * @generated
   */
  PrimaryInner createPrimaryInner();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Literal Inner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Inner</em>'.
   * @generated
   */
  LiteralInner createLiteralInner();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GenPackage getGenPackage();

} //GenFactory
