/**
 */
package com.euclideanspace.whitespaceblock.demo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.euclideanspace.whitespaceblock.demo.DemoFactory
 * @model kind="package"
 * @generated
 */
public interface DemoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "demo";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/whitespaceblock/Demo";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "demo";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DemoPackage eINSTANCE = com.euclideanspace.whitespaceblock.demo.impl.DemoPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.whitespaceblock.demo.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.whitespaceblock.demo.impl.ModelImpl
   * @see com.euclideanspace.whitespaceblock.demo.impl.DemoPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.whitespaceblock.demo.impl.RecurseImpl <em>Recurse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.whitespaceblock.demo.impl.RecurseImpl
   * @see com.euclideanspace.whitespaceblock.demo.impl.DemoPackageImpl#getRecurse()
   * @generated
   */
  int RECURSE = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSE__N = 0;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSE__R = 1;

  /**
   * The number of structural features of the '<em>Recurse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.whitespaceblock.demo.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.whitespaceblock.demo.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.whitespaceblock.demo.Model#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see com.euclideanspace.whitespaceblock.demo.Model#getContents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Contents();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.whitespaceblock.demo.Recurse <em>Recurse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recurse</em>'.
   * @see com.euclideanspace.whitespaceblock.demo.Recurse
   * @generated
   */
  EClass getRecurse();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.whitespaceblock.demo.Recurse#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>N</em>'.
   * @see com.euclideanspace.whitespaceblock.demo.Recurse#getN()
   * @see #getRecurse()
   * @generated
   */
  EAttribute getRecurse_N();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.whitespaceblock.demo.Recurse#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R</em>'.
   * @see com.euclideanspace.whitespaceblock.demo.Recurse#getR()
   * @see #getRecurse()
   * @generated
   */
  EReference getRecurse_R();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DemoFactory getDemoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.euclideanspace.whitespaceblock.demo.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.whitespaceblock.demo.impl.ModelImpl
     * @see com.euclideanspace.whitespaceblock.demo.impl.DemoPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTENTS = eINSTANCE.getModel_Contents();

    /**
     * The meta object literal for the '{@link com.euclideanspace.whitespaceblock.demo.impl.RecurseImpl <em>Recurse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.whitespaceblock.demo.impl.RecurseImpl
     * @see com.euclideanspace.whitespaceblock.demo.impl.DemoPackageImpl#getRecurse()
     * @generated
     */
    EClass RECURSE = eINSTANCE.getRecurse();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECURSE__N = eINSTANCE.getRecurse_N();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECURSE__R = eINSTANCE.getRecurse_R();

  }

} //DemoPackage
