/**
 */
package arduinoTrace.Steps;

import org.gemoc.arduino.sequential.execarduino.arduino.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Project Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Project_Setup()
 * @model
 * @generated
 */
public interface Arduino_Project_Setup extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Project) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Project getCaller();

} // Arduino_Project_Setup
