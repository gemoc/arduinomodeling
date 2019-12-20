/**
 */
package arduinoTrace.Steps.util;

import arduinoTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.executionframework.engine.mse.MSEOccurrence;

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
			public Adapter caseArduino_Delay_Execute(Arduino_Delay_Execute object) {
				return createArduino_Delay_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_Delay_Execute_AbstractSubStep(Arduino_Delay_Execute_AbstractSubStep object) {
				return createArduino_Delay_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_Delay_Execute_ImplicitStep(Arduino_Delay_Execute_ImplicitStep object) {
				return createArduino_Delay_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute(Arduino_If_Execute object) {
				return createArduino_If_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute_AbstractSubStep(Arduino_If_Execute_AbstractSubStep object) {
				return createArduino_If_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_If_Execute_ImplicitStep(Arduino_If_Execute_ImplicitStep object) {
				return createArduino_If_Execute_ImplicitStepAdapter();
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
			public Adapter caseArduino_ModuleAssignment_Execute_ImplicitStep(Arduino_ModuleAssignment_Execute_ImplicitStep object) {
				return createArduino_ModuleAssignment_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseArduino_Project_Setup(Arduino_Project_Setup object) {
				return createArduino_Project_SetupAdapter();
			}
			@Override
			public Adapter caseArduino_VariableAssignment_Execute(Arduino_VariableAssignment_Execute object) {
				return createArduino_VariableAssignment_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_VariableAssignment_Execute_AbstractSubStep(Arduino_VariableAssignment_Execute_AbstractSubStep object) {
				return createArduino_VariableAssignment_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_VariableAssignment_Execute_ImplicitStep(Arduino_VariableAssignment_Execute_ImplicitStep object) {
				return createArduino_VariableAssignment_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseArduino_VariableDeclaration_Execute(Arduino_VariableDeclaration_Execute object) {
				return createArduino_VariableDeclaration_ExecuteAdapter();
			}
			@Override
			public Adapter caseArduino_VariableDeclaration_Execute_AbstractSubStep(Arduino_VariableDeclaration_Execute_AbstractSubStep object) {
				return createArduino_VariableDeclaration_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseArduino_VariableDeclaration_Execute_ImplicitStep(Arduino_VariableDeclaration_Execute_ImplicitStep object) {
				return createArduino_VariableDeclaration_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseBigStep(BigStep object) {
				return createBigStepAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseMSEOccurrence(MSEOccurrence object) {
				return createMSEOccurrenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Delay_Execute_AbstractSubStep <em>Arduino Delay Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_Delay_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_Delay_Execute_ImplicitStep <em>Arduino Delay Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createArduino_Delay_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep <em>Arduino If Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createArduino_If_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_ImplicitStep <em>Arduino Module Assignment Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createArduino_ModuleAssignment_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute_ImplicitStep <em>Arduino Variable Assignment Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createArduino_VariableAssignment_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_AbstractSubStep <em>Arduino Variable Declaration Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createArduino_VariableDeclaration_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_ImplicitStep <em>Arduino Variable Declaration Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createArduino_VariableDeclaration_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.MSEOccurrence <em>MSE Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.MSEOccurrence
	 * @generated
	 */
	public Adapter createMSEOccurrenceAdapter() {
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
