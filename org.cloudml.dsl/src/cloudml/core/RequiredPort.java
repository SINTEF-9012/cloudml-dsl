/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.RequiredPort#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getRequiredPort()
 * @model
 * @generated
 */
public interface RequiredPort extends Port {
	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see cloudml.core.CorePackage#getRequiredPort_IsMandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link cloudml.core.RequiredPort#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

} // RequiredPort
