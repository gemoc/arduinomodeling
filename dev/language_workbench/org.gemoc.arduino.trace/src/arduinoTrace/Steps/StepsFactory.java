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
	 * Returns a new object of class '<em>Arduino Boolean Module Get Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Boolean Module Get Evaluate</em>'.
	 * @generated
	 */
	Arduino_BooleanModuleGet_Evaluate createArduino_BooleanModuleGet_Evaluate();

	/**
	 * Returns a new object of class '<em>Arduino Module Assignment Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Module Assignment Execute</em>'.
	 * @generated
	 */
	Arduino_ModuleAssignment_Execute createArduino_ModuleAssignment_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Module Assignment Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Module Assignment Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_ModuleAssignment_Execute_FillStep createArduino_ModuleAssignment_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Integer Constant Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Integer Constant Evaluate</em>'.
	 * @generated
	 */
	Arduino_IntegerConstant_Evaluate createArduino_IntegerConstant_Evaluate();

	/**
	 * Returns a new object of class '<em>Arduino Boolean Constant Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Boolean Constant Evaluate</em>'.
	 * @generated
	 */
	Arduino_BooleanConstant_Evaluate createArduino_BooleanConstant_Evaluate();

	/**
	 * Returns a new object of class '<em>Arduino Integer Module Get Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Integer Module Get Evaluate</em>'.
	 * @generated
	 */
	Arduino_IntegerModuleGet_Evaluate createArduino_IntegerModuleGet_Evaluate();

	/**
	 * Returns a new object of class '<em>Arduino While Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino While Execute</em>'.
	 * @generated
	 */
	Arduino_While_Execute createArduino_While_Execute();

	/**
	 * Returns a new object of class '<em>Arduino While Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino While Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_While_Execute_FillStep createArduino_While_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Utilities Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Utilities Execute</em>'.
	 * @generated
	 */
	Arduino_Utilities_Execute createArduino_Utilities_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Variable Assignment Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Variable Assignment Execute</em>'.
	 * @generated
	 */
	Arduino_VariableAssignment_Execute createArduino_VariableAssignment_Execute();

	/**
	 * Returns a new object of class '<em>Arduino If Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino If Execute</em>'.
	 * @generated
	 */
	Arduino_If_Execute createArduino_If_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Delay Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Delay Execute</em>'.
	 * @generated
	 */
	Arduino_Delay_Execute createArduino_Delay_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Variable Declaration Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Variable Declaration Execute</em>'.
	 * @generated
	 */
	Arduino_VariableDeclaration_Execute createArduino_VariableDeclaration_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Repeat Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Repeat Execute</em>'.
	 * @generated
	 */
	Arduino_Repeat_Execute createArduino_Repeat_Execute();

	/**
	 * Returns a new object of class '<em>Arduino If Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino If Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_If_Execute_FillStep createArduino_If_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Variable Assignment Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Variable Assignment Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_VariableAssignment_Execute_FillStep createArduino_VariableAssignment_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Repeat Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Repeat Execute Fill Step</em>'.
	 * @generated
	 */
	Arduino_Repeat_Execute_FillStep createArduino_Repeat_Execute_FillStep();

	/**
	 * Returns a new object of class '<em>Arduino Module Assignment Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Module Assignment Call</em>'.
	 * @generated
	 */
	Arduino_ModuleAssignment_Call createArduino_ModuleAssignment_Call();

	/**
	 * Returns a new object of class '<em>Arduino Module Assignment Call Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Module Assignment Call Fill Step</em>'.
	 * @generated
	 */
	Arduino_ModuleAssignment_Call_FillStep createArduino_ModuleAssignment_Call_FillStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
