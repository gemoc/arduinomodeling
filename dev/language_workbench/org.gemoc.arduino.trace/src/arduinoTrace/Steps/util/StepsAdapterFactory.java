/**
 */
package arduinoTrace.Steps.util;

import arduinoTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter caseBigStep(BigStep object) {
				return createBigStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseRootFillStep(RootFillStep object) {
				return createRootFillStepAdapter();
			}
			@Override
			public Adapter caseArduino_BooleanModuleGet_Evaluate(Arduino_BooleanModuleGet_Evaluate object) {
				return createArduino_BooleanModuleGet_EvaluateAdapter();
			}
			@Override
			public Adapter caseArduino_ModuleAssignment_Execute(Arduino_ModuleAssignment_Execute object) {
				return createArduino_ModuleAssignment_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_ModuleAssignment_Execute_AbstractSubStep(Arduino_ModuleAssignment_Execute_AbstractSubStep object) {
				return createArduino_ModuleAssignment_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_ModuleAssignment_Execute_FillStep(Arduino_ModuleAssignment_Execute_FillStep object) {
				return createArduino_ModuleAssignment_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_IntegerConstant_Evaluate(Arduino_IntegerConstant_Evaluate object) {
				return createArduino_IntegerConstant_EvaluateAdapter();
			}
			@Override
			public Adapter caseArduino_BooleanConstant_Evaluate(Arduino_BooleanConstant_Evaluate object) {
				return createArduino_BooleanConstant_EvaluateAdapter();
			}
			@Override
			public Adapter caseArduino_IntegerModuleGet_Evaluate(Arduino_IntegerModuleGet_Evaluate object) {
				return createArduino_IntegerModuleGet_EvaluateAdapter();
			}
			@Override
			public Adapter caseArduino_While_Execute(Arduino_While_Execute object) {
				return createArduino_While_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_While_Execute_AbstractSubStep(Arduino_While_Execute_AbstractSubStep object) {
				return createArduino_While_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_While_Execute_FillStep(Arduino_While_Execute_FillStep object) {
				return createArduino_While_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Utilities_Execute(Arduino_Utilities_Execute object) {
				return createArduino_Utilities_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_VariableAssignment_Execute(Arduino_VariableAssignment_Execute object) {
				return createArduino_VariableAssignment_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute(Arduino_If_Execute object) {
				return createArduino_If_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Delay_Execute(Arduino_Delay_Execute object) {
				return createArduino_Delay_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_VariableDeclaration_Execute(Arduino_VariableDeclaration_Execute object) {
				return createArduino_VariableDeclaration_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Repeat_Execute(Arduino_Repeat_Execute object) {
				return createArduino_Repeat_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute_AbstractSubStep(Arduino_If_Execute_AbstractSubStep object) {
				return createArduino_If_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute_FillStep(Arduino_If_Execute_FillStep object) {
				return createArduino_If_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_VariableAssignment_Execute_AbstractSubStep(Arduino_VariableAssignment_Execute_AbstractSubStep object) {
				return createArduino_VariableAssignment_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_VariableAssignment_Execute_FillStep(Arduino_VariableAssignment_Execute_FillStep object) {
				return createArduino_VariableAssignment_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Repeat_Execute_AbstractSubStep(Arduino_Repeat_Execute_AbstractSubStep object) {
				return createArduino_Repeat_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Repeat_Execute_FillStep(Arduino_Repeat_Execute_FillStep object) {
				return createArduino_Repeat_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_ModuleAssignment_Call(Arduino_ModuleAssignment_Call object) {
				return createArduino_ModuleAssignment_CallAdapter();
			}
			@Override
			public Adapter caseArduino_ModuleAssignment_Call_AbstractSubStep(Arduino_ModuleAssignment_Call_AbstractSubStep object) {
				return createArduino_ModuleAssignment_Call_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_ModuleAssignment_Call_FillStep(Arduino_ModuleAssignment_Call_FillStep object) {
				return createArduino_ModuleAssignment_Call_FillStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.RootFillStep <em>Root Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.RootFillStep
	 * @generated
	 */
	public Adapter createRootFillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate <em>Arduino Boolean Module Get Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate
	 * @generated
	 */
	public Adapter createArduino_BooleanModuleGet_EvaluateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute <em>Arduino Module Assignment Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep <em>Arduino Module Assignment Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_FillStep <em>Arduino Module Assignment Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate <em>Arduino Integer Constant Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate
	 * @generated
	 */
	public Adapter createArduino_IntegerConstant_EvaluateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate <em>Arduino Boolean Constant Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate
	 * @generated
	 */
	public Adapter createArduino_BooleanConstant_EvaluateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate <em>Arduino Integer Module Get Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate
	 * @generated
	 */
	public Adapter createArduino_IntegerModuleGet_EvaluateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_While_Execute <em>Arduino While Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_While_Execute
	 * @generated
	 */
	public Adapter createArduino_While_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_While_Execute_AbstractSubStep <em>Arduino While Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_While_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_While_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_While_Execute_FillStep <em>Arduino While Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_While_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_While_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Utilities_Execute <em>Arduino Utilities Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Execute
	 * @generated
	 */
	public Adapter createArduino_Utilities_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute <em>Arduino Variable Assignment Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute
	 * @generated
	 */
	public Adapter createArduino_VariableAssignment_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_If_Execute <em>Arduino If Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_If_Execute
	 * @generated
	 */
	public Adapter createArduino_If_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Delay_Execute <em>Arduino Delay Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute
	 * @generated
	 */
	public Adapter createArduino_Delay_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute <em>Arduino Variable Declaration Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute
	 * @generated
	 */
	public Adapter createArduino_VariableDeclaration_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute <em>Arduino Repeat Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute
	 * @generated
	 */
	public Adapter createArduino_Repeat_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep <em>Arduino If Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_If_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_If_Execute_FillStep <em>Arduino If Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_If_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep <em>Arduino Variable Assignment Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_VariableAssignment_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute_FillStep <em>Arduino Variable Assignment Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_VariableAssignment_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep <em>Arduino Repeat Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Repeat_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep <em>Arduino Repeat Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_Repeat_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call <em>Arduino Module Assignment Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_CallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call_AbstractSubStep <em>Arduino Module Assignment Call Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_Call_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call_FillStep <em>Arduino Module Assignment Call Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call_FillStep
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_Call_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
