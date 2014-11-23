/**
 */
package com.euclideanspace.pbase.demo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCollection Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.XCollectionLiteral#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.pbase.demo.DemoPackage#getXCollectionLiteral()
 * @model
 * @generated
 */
public interface XCollectionLiteral extends XExpression
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.pbase.demo.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.euclideanspace.pbase.demo.DemoPackage#getXCollectionLiteral_Elements()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getElements();

} // XCollectionLiteral
