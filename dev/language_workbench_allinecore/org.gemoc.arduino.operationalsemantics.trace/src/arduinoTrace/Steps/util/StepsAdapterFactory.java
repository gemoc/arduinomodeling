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
			public Adapter caseSteps(Steps object) {
				return createStepsAdapter();
			}
			@Override
			public Adapter caseBigStep(BigStep object) {
				return createBigStepAdapter();
			}
			@Override
			public Adapter caseArduino_Status_Execute_AbstractSubStep(Arduino_Status_Execute_AbstractSubStep object) {
				return createArduino_Status_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Status_Execute_FillStep(Arduino_Status_Execute_FillStep object) {
				return createArduino_Status_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Project_Setup_AbstractSubStep(Arduino_Project_Setup_AbstractSubStep object) {
				return createArduino_Project_Setup_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Project_Setup_FillStep(Arduino_Project_Setup_FillStep object) {
				return createArduino_Project_Setup_FillStepAdapter();
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
			public Adapter caseArduino_Level_Execute_AbstractSubStep(Arduino_Level_Execute_AbstractSubStep object) {
				return createArduino_Level_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Level_Execute_FillStep(Arduino_Level_Execute_FillStep object) {
				return createArduino_Level_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Set_Execute_AbstractSubStep(Arduino_Set_Execute_AbstractSubStep object) {
				return createArduino_Set_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Set_Execute_FillStep(Arduino_Set_Execute_FillStep object) {
				return createArduino_Set_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Delay_Execute(Arduino_Delay_Execute object) {
				return createArduino_Delay_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Utilities_Call_AbstractSubStep(Arduino_Utilities_Call_AbstractSubStep object) {
				return createArduino_Utilities_Call_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Utilities_Call_FillStep(Arduino_Utilities_Call_FillStep object) {
				return createArduino_Utilities_Call_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_FunctionCall_Execute_AbstractSubStep(Arduino_FunctionCall_Execute_AbstractSubStep object) {
				return createArduino_FunctionCall_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_FunctionCall_Execute_FillStep(Arduino_FunctionCall_Execute_FillStep object) {
				return createArduino_FunctionCall_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Utilities_Execute(Arduino_Utilities_Execute object) {
				return createArduino_Utilities_ExecuteAdapter();
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
			public Adapter caseArduino_While_Execute_AbstractSubStep(Arduino_While_Execute_AbstractSubStep object) {
				return createArduino_While_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_While_Execute_FillStep(Arduino_While_Execute_FillStep object) {
				return createArduino_While_Execute_FillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Status_Call_AbstractSubStep(Arduino_Status_Call_AbstractSubStep object) {
				return createArduino_Status_Call_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Status_Call_FillStep(Arduino_Status_Call_FillStep object) {
				return createArduino_Status_Call_FillStepAdapter();
			}
			@Override
			public Adapter caseFillStep(FillStep object) {
				return createFillStepAdapter();
			}
			@Override
			public Adapter caseArduino_Status_Execute(Arduino_Status_Execute object) {
				return createArduino_Status_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Project_Setup(Arduino_Project_Setup object) {
				return createArduino_Project_SetupAdapter();
			}
			@Override
			public Adapter caseArduino_Repeat_Execute(Arduino_Repeat_Execute object) {
				return createArduino_Repeat_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Level_Execute(Arduino_Level_Execute object) {
				return createArduino_Level_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Set_Execute(Arduino_Set_Execute object) {
				return createArduino_Set_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Utilities_Call(Arduino_Utilities_Call object) {
				return createArduino_Utilities_CallAdapter();
			}
			@Override
			public Adapter caseArduino_FunctionCall_Execute(Arduino_FunctionCall_Execute object) {
				return createArduino_FunctionCall_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute(Arduino_If_Execute object) {
				return createArduino_If_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_While_Execute(Arduino_While_Execute object) {
				return createArduino_While_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Status_Call(Arduino_Status_Call object) {
				return createArduino_Status_CallAdapter();
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Steps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Steps
	 * @generated
	 */
	public Adapter createStepsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Status_Execute_AbstractSubStep <em>Arduino Status Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Status_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Status_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Status_Execute_FillStep <em>Arduino Status Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Status_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_Status_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Project_Setup_AbstractSubStep <em>Arduino Project Setup Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Project_Setup_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Project_Setup_FillStep <em>Arduino Project Setup Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup_FillStep
	 * @generated
	 */
	public Adapter createArduino_Project_Setup_FillStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Level_Execute_AbstractSubStep <em>Arduino Level Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Level_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Level_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Level_Execute_FillStep <em>Arduino Level Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Level_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_Level_Execute_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Set_Execute_AbstractSubStep <em>Arduino Set Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Set_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Set_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Set_Execute_FillStep <em>Arduino Set Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Set_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_Set_Execute_FillStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Utilities_Call_AbstractSubStep <em>Arduino Utilities Call Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Utilities_Call_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Utilities_Call_FillStep <em>Arduino Utilities Call Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call_FillStep
	 * @generated
	 */
	public Adapter createArduino_Utilities_Call_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute_AbstractSubStep <em>Arduino Function Call Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_FunctionCall_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep <em>Arduino Function Call Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep
	 * @generated
	 */
	public Adapter createArduino_FunctionCall_Execute_FillStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Status_Call_AbstractSubStep <em>Arduino Status Call Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Status_Call_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Status_Call_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Status_Call_FillStep <em>Arduino Status Call Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Status_Call_FillStep
	 * @generated
	 */
	public Adapter createArduino_Status_Call_FillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.FillStep <em>Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.FillStep
	 * @generated
	 */
	public Adapter createFillStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Status_Execute <em>Arduino Status Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Status_Execute
	 * @generated
	 */
	public Adapter createArduino_Status_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Project_Setup <em>Arduino Project Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup
	 * @generated
	 */
	public Adapter createArduino_Project_SetupAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Level_Execute <em>Arduino Level Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Level_Execute
	 * @generated
	 */
	public Adapter createArduino_Level_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Set_Execute <em>Arduino Set Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Set_Execute
	 * @generated
	 */
	public Adapter createArduino_Set_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Utilities_Call <em>Arduino Utilities Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call
	 * @generated
	 */
	public Adapter createArduino_Utilities_CallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute <em>Arduino Function Call Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute
	 * @generated
	 */
	public Adapter createArduino_FunctionCall_ExecuteAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Status_Call <em>Arduino Status Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Status_Call
	 * @generated
	 */
	public Adapter createArduino_Status_CallAdapter() {
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
