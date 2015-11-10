/**
 */
package arduinoTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = arduinoTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Fill Step</em>'.
	 * @generated
	 */
	RootFillStep createRootFillStep();

	/**
	 * Returns a new object of class '<em>Arduino If Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino If Execute</em>'.
	 * @generated
	 */
	Arduino_If_Execute createArduino_If_Execute();

	/**
	 * Returns a new object of class '<em>Arduino If Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino If Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_If_Execute_FillStep createArduino_If_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Set Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Set Execute</em>'.
	 * @generated
	 */
	Arduino_Set_Execute createArduino_Set_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Level Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Level Execute</em>'.
	 * @generated
	 */
	Arduino_Level_Execute createArduino_Level_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Status Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Status Execute</em>'.
	 * @generated
	 */
	Arduino_Status_Execute createArduino_Status_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Delay Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Delay Execute</em>'.
	 * @generated
	 */
	Arduino_Delay_Execute createArduino_Delay_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Repeat Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Repeat Execute</em>'.
	 * @generated
	 */
	Arduino_Repeat_Execute createArduino_Repeat_Execute();

	/**
	 * Returns a new object of class '<em>Arduino While Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino While Execute</em>'.
	 * @generated
	 */
	Arduino_While_Execute createArduino_While_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Utilities Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Utilities Execute</em>'.
	 * @generated
	 */
	Arduino_Utilities_Execute createArduino_Utilities_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Function Call Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Function Call Execute</em>'.
	 * @generated
	 */
	Arduino_FunctionCall_Execute createArduino_FunctionCall_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Status Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Status Call</em>'.
	 * @generated
	 */
	Arduino_Status_Call createArduino_Status_Call();

	/**
	 * Returns a new object of class '<em>Arduino Status Call Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Status Call Fill Step</em>'.
	 * @generated
	 */
	Arduino_Status_Call_FillStep createArduino_Status_Call_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Repeat Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Repeat Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_Repeat_Execute_FillStep createArduino_Repeat_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Project Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Project Setup</em>'.
	 * @generated
	 */
	Arduino_Project_Setup createArduino_Project_Setup();

	/**
	 * Returns a new object of class '<em>Arduino Utilities Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Utilities Call</em>'.
	 * @generated
	 */
	Arduino_Utilities_Call createArduino_Utilities_Call();

	/**
	 * Returns a new object of class '<em>Arduino Utilities Call Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Utilities Call Fill Step</em>'.
	 * @generated
	 */
	Arduino_Utilities_Call_FillStep createArduino_Utilities_Call_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Function Call Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Function Call Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_FunctionCall_Execute_FillStep createArduino_FunctionCall_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino While Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino While Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_While_Execute_FillStep createArduino_While_Execute_FillStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
