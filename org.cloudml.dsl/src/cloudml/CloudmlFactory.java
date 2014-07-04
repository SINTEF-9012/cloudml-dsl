/**
 */
package cloudml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloudml.CloudmlPackage
 * @generated
 */
public interface CloudmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudmlFactory eINSTANCE = cloudml.impl.CloudmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>No Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Use</em>'.
	 * @generated
	 */
	NoUse createNoUse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudmlPackage getCloudmlPackage();

} //CloudmlFactory
