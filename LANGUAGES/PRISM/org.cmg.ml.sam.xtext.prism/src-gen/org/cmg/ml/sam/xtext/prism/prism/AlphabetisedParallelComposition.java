/**
 */
package org.cmg.ml.sam.xtext.prism.prism;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alphabetised Parallel Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cmg.ml.sam.xtext.prism.prism.AlphabetisedParallelComposition#getLeft <em>Left</em>}</li>
 *   <li>{@link org.cmg.ml.sam.xtext.prism.prism.AlphabetisedParallelComposition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.cmg.ml.sam.xtext.prism.prism.PrismPackage#getAlphabetisedParallelComposition()
 * @model
 * @generated
 */
public interface AlphabetisedParallelComposition extends PrismSystem
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PrismSystem)
   * @see org.cmg.ml.sam.xtext.prism.prism.PrismPackage#getAlphabetisedParallelComposition_Left()
   * @model containment="true"
   * @generated
   */
  PrismSystem getLeft();

  /**
   * Sets the value of the '{@link org.cmg.ml.sam.xtext.prism.prism.AlphabetisedParallelComposition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PrismSystem value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PrismSystem)
   * @see org.cmg.ml.sam.xtext.prism.prism.PrismPackage#getAlphabetisedParallelComposition_Right()
   * @model containment="true"
   * @generated
   */
  PrismSystem getRight();

  /**
   * Sets the value of the '{@link org.cmg.ml.sam.xtext.prism.prism.AlphabetisedParallelComposition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PrismSystem value);

} // AlphabetisedParallelComposition
