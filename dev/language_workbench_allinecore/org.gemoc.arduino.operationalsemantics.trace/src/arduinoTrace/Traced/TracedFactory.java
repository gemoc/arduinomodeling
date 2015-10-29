/**
 */
package arduinoTrace.Traced;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Traced.TracedPackage
 * @generated
 */
public interface TracedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracedFactory eINSTANCE = arduinoTrace.Traced.impl.TracedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objects</em>'.
	 * @generated
	 */
	TracedObjects createTracedObjects();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracedPackage getTracedPackage();

} //TracedFactory
