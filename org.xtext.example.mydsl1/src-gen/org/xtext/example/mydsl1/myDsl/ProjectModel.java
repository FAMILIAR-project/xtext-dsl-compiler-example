/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ProjectModel#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getProjectModel()
 * @model
 * @generated
 */
public interface ProjectModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getProjectModel_Data()
   * @model
   * @generated
   */
  String getData();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ProjectModel#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
  void setData(String value);

} // ProjectModel
