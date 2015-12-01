package org.gemoc.arduino.trace.tracemanager;

import fr.inria.diverse.trace.api.ITraceManager;
import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;

public class ArduinoTraceManager implements ITraceManager {

	private arduinoTrace.Trace traceRoot;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private arduinoTrace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<arduinoTrace.Steps.Step> context = new LinkedList<arduinoTrace.Steps.Step>();
	private static final List<String> bigSteps = Arrays.asList("Arduino_While_Execute", "Arduino_Repeat_Execute",
			"Arduino_ModuleAssignment_Call", "Arduino_ModuleAssignment_Execute", "Arduino_VariableAssignment_Execute",
			"Arduino_If_Execute");

	public ArduinoTraceManager(Resource exeModel, Resource traceResource) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.traces = new ArrayList<IValueTrace>();
	}

	@Override
	public boolean addStateIfChanged() {
		return addState(true);
	}

	@Override
	public void addState() {
		addState(false);
	}

	@SuppressWarnings("unchecked")
	private boolean addState(boolean onlyIfChange) {

		arduinoTrace.States.State newState = arduinoTrace.States.StatesFactory.eINSTANCE.createState();
		boolean changed = false;

		// We look at each object instance of a class with mutable properties 
		// Each of these objects should eventually become a traced object

		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		for (Resource r : allResources)
			for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
				EObject o = i.next();

				/**
				 * Storing the state of a org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin object
				 */
				if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin) {

					org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin o_cast = (org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedDigitalPin tracedObject = (arduinoTrace.States.arduino.TracedDigitalPin) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.Pin_level_Value> localTrace1 = tracedObject.getLevelSequence();
					arduinoTrace.States.Pin_level_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1.get(localTrace1.size() - 1);

					java.lang.Integer content1 = o_cast.getLevel();

					boolean noChange1 = previousValue1 != null && previousValue1.getLevel() == content1;

					if (noChange1) {
						newState.getPin_level_Values().add(previousValue1);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.Pin_level_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createPin_level_Value();

						newValue.setLevel(content1);

						tracedObject.getLevelSequence().add(newValue);
						newState.getPin_level_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable object
				 */
				if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable) {

					org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable o_cast = (org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedBooleanVariable tracedObject = (arduinoTrace.States.arduino.TracedBooleanVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.BooleanVariable_value_Value> localTrace2 = tracedObject.getValueSequence();
					arduinoTrace.States.BooleanVariable_value_Value previousValue2 = null;
					if (!localTrace2.isEmpty())
						previousValue2 = localTrace2.get(localTrace2.size() - 1);

					java.lang.Boolean content2 = o_cast.getValue();

					boolean noChange2 = previousValue2 != null && previousValue2.getValue() == content2;

					if (noChange2) {
						newState.getBooleanVariable_value_Values().add(previousValue2);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.BooleanVariable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createBooleanVariable_value_Value();

						newValue.setValue(content2);

						tracedObject.getValueSequence().add(newValue);
						newState.getBooleanVariable_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin object
				 */
				if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin) {

					org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin o_cast = (org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedAnalogPin tracedObject = (arduinoTrace.States.arduino.TracedAnalogPin) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.Pin_level_Value> localTrace3 = tracedObject.getLevelSequence();
					arduinoTrace.States.Pin_level_Value previousValue3 = null;
					if (!localTrace3.isEmpty())
						previousValue3 = localTrace3.get(localTrace3.size() - 1);

					java.lang.Integer content3 = o_cast.getLevel();

					boolean noChange3 = previousValue3 != null && previousValue3.getLevel() == content3;

					if (noChange3) {
						newState.getPin_level_Values().add(previousValue3);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.Pin_level_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createPin_level_Value();

						newValue.setLevel(content3);

						tracedObject.getLevelSequence().add(newValue);
						newState.getPin_level_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable object
				 */
				if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable) {

					org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable o_cast = (org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedIntegerVariable tracedObject = (arduinoTrace.States.arduino.TracedIntegerVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.IntegerVariable_value_Value> localTrace4 = tracedObject.getValueSequence();
					arduinoTrace.States.IntegerVariable_value_Value previousValue4 = null;
					if (!localTrace4.isEmpty())
						previousValue4 = localTrace4.get(localTrace4.size() - 1);

					java.lang.Integer content4 = o_cast.getValue();

					boolean noChange4 = previousValue4 != null && previousValue4.getValue() == content4;

					if (noChange4) {
						newState.getIntegerVariable_value_Values().add(previousValue4);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.IntegerVariable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createIntegerVariable_value_Value();

						newValue.setValue(content4);

						tracedObject.getValueSequence().add(newValue);
						newState.getIntegerVariable_value_Values().add(newValue);
					}

				}
			}

		boolean createNewState = lastState == null || (!onlyIfChange || changed);
		if (createNewState) {
			lastState = newState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedSteps().clear();
			newState.getEndedSteps().clear();

			newState.getPin_level_Values().clear();
			newState.getIntegerVariable_value_Values().clear();
			newState.getBooleanVariable_value_Values().clear();
		}

		return createNewState;

	}

	@Override
	public void retroAddStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 2);

	}

	@Override
	public void addStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 1);
	}

	private void addStep(String stepRule, Map<String, Object> params, int stateIndex) {

		arduinoTrace.Steps.Step toPush = null;

		if (stateIndex >= 0) {

			arduinoTrace.States.State state = this.traceRoot.getStatesTrace().get(stateIndex);

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet.evaluate")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate arduino_BooleanModuleGet_EvaluateInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_BooleanModuleGet_Evaluate();
				arduino_BooleanModuleGet_EvaluateInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_BooleanModuleGet_EvaluateInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_BooleanModuleGet_EvaluateInstance);
				}
				toPush = arduino_BooleanModuleGet_EvaluateInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v0 = params.get(k);
							if (v0 instanceof org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet)
								arduino_BooleanModuleGet_EvaluateInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet) v0);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_BooleanModuleGet_Evaluate_Sequence().add(
						arduino_BooleanModuleGet_EvaluateInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_ModuleAssignment_Execute arduino_ModuleAssignment_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_ModuleAssignment_Execute();
				arduino_ModuleAssignment_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_ModuleAssignment_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_ModuleAssignment_ExecuteInstance);
				}
				toPush = arduino_ModuleAssignment_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v1 = params.get(k);
							if (v1 instanceof org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment)
								arduino_ModuleAssignment_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment) v1);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_ModuleAssignment_Execute_Sequence().add(
						arduino_ModuleAssignment_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.While.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_While_Execute arduino_While_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_While_Execute();
				arduino_While_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_While_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_While_ExecuteInstance);
				}
				toPush = arduino_While_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v2 = params.get(k);
							if (v2 instanceof org.gemoc.arduino.melange.arduinomt.arduino.While)
								arduino_While_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.While) v2);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_While_Execute_Sequence().add(arduino_While_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.Utilities.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Utilities_Execute arduino_Utilities_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Utilities_Execute();
				arduino_Utilities_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Utilities_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Utilities_ExecuteInstance);
				}
				toPush = arduino_Utilities_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v3 = params.get(k);
							if (v3 instanceof org.gemoc.arduino.melange.arduinomt.arduino.Utilities)
								arduino_Utilities_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.Utilities) v3);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Utilities_Execute_Sequence().add(arduino_Utilities_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.Delay.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Delay_Execute arduino_Delay_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Delay_Execute();
				arduino_Delay_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Delay_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Delay_ExecuteInstance);
				}
				toPush = arduino_Delay_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v4 = params.get(k);
							if (v4 instanceof org.gemoc.arduino.melange.arduinomt.arduino.Delay)
								arduino_Delay_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.Delay) v4);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Delay_Execute_Sequence().add(arduino_Delay_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.If.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_If_Execute arduino_If_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_If_Execute();
				arduino_If_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_If_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_If_ExecuteInstance);
				}
				toPush = arduino_If_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v5 = params.get(k);
							if (v5 instanceof org.gemoc.arduino.melange.arduinomt.arduino.If)
								arduino_If_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.If) v5);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_If_Execute_Sequence().add(arduino_If_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.VariableDeclaration.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_VariableDeclaration_Execute arduino_VariableDeclaration_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_VariableDeclaration_Execute();
				arduino_VariableDeclaration_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_VariableDeclaration_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_VariableDeclaration_ExecuteInstance);
				}
				toPush = arduino_VariableDeclaration_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v6 = params.get(k);
							if (v6 instanceof org.gemoc.arduino.melange.arduinomt.arduino.VariableDeclaration)
								arduino_VariableDeclaration_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.VariableDeclaration) v6);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_VariableDeclaration_Execute_Sequence().add(
						arduino_VariableDeclaration_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.VariableAssignment.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_VariableAssignment_Execute arduino_VariableAssignment_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_VariableAssignment_Execute();
				arduino_VariableAssignment_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_VariableAssignment_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_VariableAssignment_ExecuteInstance);
				}
				toPush = arduino_VariableAssignment_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v7 = params.get(k);
							if (v7 instanceof org.gemoc.arduino.melange.arduinomt.arduino.VariableAssignment)
								arduino_VariableAssignment_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.VariableAssignment) v7);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_VariableAssignment_Execute_Sequence().add(
						arduino_VariableAssignment_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.Repeat.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Repeat_Execute arduino_Repeat_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Repeat_Execute();
				arduino_Repeat_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Repeat_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Repeat_ExecuteInstance);
				}
				toPush = arduino_Repeat_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v8 = params.get(k);
							if (v8 instanceof org.gemoc.arduino.melange.arduinomt.arduino.Repeat)
								arduino_Repeat_ExecuteInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.Repeat) v8);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Repeat_Execute_Sequence().add(arduino_Repeat_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("aorg.gemoc.arduino.melange.arduinomt.rduino.IntegerModuleGet.evaluate")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate arduino_IntegerModuleGet_EvaluateInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_IntegerModuleGet_Evaluate();
				arduino_IntegerModuleGet_EvaluateInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_IntegerModuleGet_EvaluateInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_IntegerModuleGet_EvaluateInstance);
				}
				toPush = arduino_IntegerModuleGet_EvaluateInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v9 = params.get(k);
							if (v9 instanceof org.gemoc.arduino.melange.arduinomt.arduino.IntegerModuleGet)
								arduino_IntegerModuleGet_EvaluateInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.IntegerModuleGet) v9);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_IntegerModuleGet_Evaluate_Sequence().add(
						arduino_IntegerModuleGet_EvaluateInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.BooleanConstant.evaluate")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate arduino_BooleanConstant_EvaluateInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_BooleanConstant_Evaluate();
				arduino_BooleanConstant_EvaluateInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_BooleanConstant_EvaluateInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_BooleanConstant_EvaluateInstance);
				}
				toPush = arduino_BooleanConstant_EvaluateInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v10 = params.get(k);
							if (v10 instanceof org.gemoc.arduino.melange.arduinomt.arduino.BooleanConstant)
								arduino_BooleanConstant_EvaluateInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.BooleanConstant) v10);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_BooleanConstant_Evaluate_Sequence().add(
						arduino_BooleanConstant_EvaluateInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment.call")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_ModuleAssignment_Call arduino_ModuleAssignment_CallInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_ModuleAssignment_Call();
				arduino_ModuleAssignment_CallInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_ModuleAssignment_CallInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_ModuleAssignment_CallInstance);
				}
				toPush = arduino_ModuleAssignment_CallInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v11 = params.get(k);
							if (v11 instanceof org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment)
								arduino_ModuleAssignment_CallInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment) v11);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_ModuleAssignment_Call_Sequence().add(arduino_ModuleAssignment_CallInstance);
			} else

			if (stepRule.equalsIgnoreCase("org.gemoc.arduino.melange.arduinomt.arduino.IntegerConstant.evaluate")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate arduino_IntegerConstant_EvaluateInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_IntegerConstant_Evaluate();
				arduino_IntegerConstant_EvaluateInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_IntegerConstant_EvaluateInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_IntegerConstant_EvaluateInstance);
				}
				toPush = arduino_IntegerConstant_EvaluateInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v12 = params.get(k);
							if (v12 instanceof org.gemoc.arduino.melange.arduinomt.arduino.IntegerConstant)
								arduino_IntegerConstant_EvaluateInstance.setThis((org.gemoc.arduino.melange.arduinomt.arduino.IntegerConstant) v12);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_IntegerConstant_Evaluate_Sequence().add(
						arduino_IntegerConstant_EvaluateInstance);
			}
		}

		context.push(toPush);

	}

	@Override
	public void endStep(String stepRule, Object returnValue) {
		arduinoTrace.Steps.Step popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void goTo(EObject state) {

		if (state instanceof arduinoTrace.States.State) {
			arduinoTrace.States.State stateToGo = (arduinoTrace.States.State) state;

			for (arduinoTrace.States.Pin_level_Value value : stateToGo.getPin_level_Values()) {

				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedAnalogPin) {
					arduinoTrace.States.arduino.TracedAnalogPin parent_cast = (arduinoTrace.States.arduino.TracedAnalogPin) value
							.getParent();
					java.lang.Integer toset = value.getLevel();
					java.lang.Integer current = ((org.gemoc.arduino.melange.arduinomt.arduino.Pin) parent_cast.getOriginalObject()).getLevel();
					if (current != toset)
						((org.gemoc.arduino.melange.arduinomt.arduino.Pin) parent_cast.getOriginalObject()).setLevel(toset);

				}
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedDigitalPin) {
					arduinoTrace.States.arduino.TracedDigitalPin parent_cast = (arduinoTrace.States.arduino.TracedDigitalPin) value
							.getParent();
					java.lang.Integer toset = value.getLevel();
					java.lang.Integer current = ((org.gemoc.arduino.melange.arduinomt.arduino.Pin) parent_cast.getOriginalObject()).getLevel();
					if (current != toset)
						((org.gemoc.arduino.melange.arduinomt.arduino.Pin) parent_cast.getOriginalObject()).setLevel(toset);

				}

			}

			for (arduinoTrace.States.IntegerVariable_value_Value value : stateToGo.getIntegerVariable_value_Values()) {

				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedIntegerVariable) {
					arduinoTrace.States.arduino.TracedIntegerVariable parent_cast = (arduinoTrace.States.arduino.TracedIntegerVariable) value
							.getParent();
					java.lang.Integer toset = value.getValue();
					java.lang.Integer current = ((org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable) parent_cast.getOriginalObject()).getValue();
					if (current != toset)
						((org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable) parent_cast.getOriginalObject()).setValue(toset);

				}

			}

			for (arduinoTrace.States.BooleanVariable_value_Value value : stateToGo.getBooleanVariable_value_Values()) {

				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedBooleanVariable) {
					arduinoTrace.States.arduino.TracedBooleanVariable parent_cast = (arduinoTrace.States.arduino.TracedBooleanVariable) value
							.getParent();
					java.lang.Boolean toset = value.getValue();
					java.lang.Boolean current = ((org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable) parent_cast.getOriginalObject()).getValue();
					if (current != toset)
						((org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable) parent_cast.getOriginalObject()).setValue(toset);

				}

			}

		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		arduinoTrace.States.State stateToGo = traceRoot.getStatesTrace().get(stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof arduinoTrace.States.State) {
					goTo((arduinoTrace.States.State) state);
				}
			}
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = arduinoTrace.ArduinoTraceFactory.eINSTANCE.createTrace();

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		// Initializing the map exeobject -> tracedobject
		this.exeToTraced = new HashMap<EObject, EObject>();
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		arduinoTrace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getPin_level_Values().isEmpty())
			result.append("\nLevel values:");
		for (arduinoTrace.States.Pin_level_Value currenState : gs.getPin_level_Values()) {
			result.append("\n\t" + currenState.getLevel());
		}

		if (!gs.getIntegerVariable_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.States.IntegerVariable_value_Value currenState : gs.getIntegerVariable_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getBooleanVariable_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.States.BooleanVariable_value_Value currenState : gs.getBooleanVariable_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getStartedSteps().isEmpty()) {
			result.append("\n\nStarting steps: ");
			for (arduinoTrace.Steps.Step m : gs.getStartedSteps()) {
				result.append("\n\t" + m.eClass().getName());
				if (m.getEndingState() != null) {
					result.append(" (ends at state " + traceRoot.getStatesTrace().indexOf(m.getEndingState()) + ")");
				}
			}
		}

		result.deleteCharAt(0);
		return result.toString();
	}

	@Override
	public String getDescriptionOfValue(EObject eObject) {
		if (eObject instanceof arduinoTrace.States.Pin_level_Value) {
			return "arduinoTrace.States.Pin_level_Value: " + ((arduinoTrace.States.Pin_level_Value) eObject).getLevel();
		} else if (eObject instanceof arduinoTrace.States.IntegerVariable_value_Value) {
			return "arduinoTrace.States.IntegerVariable_value_Value: "
					+ ((arduinoTrace.States.IntegerVariable_value_Value) eObject).getValue();
		} else if (eObject instanceof arduinoTrace.States.BooleanVariable_value_Value) {
			return "arduinoTrace.States.BooleanVariable_value_Value: "
					+ ((arduinoTrace.States.BooleanVariable_value_Value) eObject).getValue();
		} else
			return "ERROR";
	}

	private void storeAsTracedObject(org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedIntegerVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedIntegerVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedIntegerVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedAnalogPin tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedAnalogPin();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedAnalogPins().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getLevelSequence(), this));
		}
	}

	private void storeAsTracedObject(org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedBooleanVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedBooleanVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedBooleanVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedDigitalPin tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedDigitalPin();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedDigitalPins().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getLevelSequence(), this));
		}
	}

	private void storeAsTracedObject(EObject o) {

		if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin)
			storeAsTracedObject((org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin) o);
		else

		if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable)
			storeAsTracedObject((org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable) o);
		else

		if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin)
			storeAsTracedObject((org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin) o);
		else

		if (o instanceof org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable)
			storeAsTracedObject((org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable) o);

	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			storeAsTracedObject(exeObject);
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		for (EObject key : exeToTraced.keySet()) {
			if (exeToTraced.get(key) == tracedObject)
				return key;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private static void emfAdd(EObject o, String property, Object value) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
				Object coll = o.eGet(r);
				if (coll instanceof Collection) {
					((Collection<Object>) coll).add(value);
					return;
				}
			}
		}
	}

	private static Object emfGet(EObject o, String property) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
				return o.eGet(r);
			}
		}
		return null;
	}

	@Override
	public EObject getExecutionState(int index) {
		return traceRoot.getStatesTrace().get(index);
	}

	@Override
	public int getTraceSize() {
		return traceRoot.getStatesTrace().size();
	}

	@Override
	public int getNumberOfValueTraces() {
		return getAllValueTraces().size();
	}

	@Override
	public Set<EObject> getAllCurrentValues(int stateIndex) {
		arduinoTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getPin_level_Values());
			currentValues.addAll(currentState.getIntegerVariable_value_Values());
			currentValues.addAll(currentState.getBooleanVariable_value_Values());
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public int getStateIndex(EObject state) {
		return traceRoot.getStatesTrace().indexOf(state);
	}

	@Override
	public boolean isBigStep(String string) {
		return bigSteps.contains(string);
	}

	@Override
	public String currentBigStep() {
		if (!context.isEmpty() && context.getFirst() != null)
			return context.getFirst().eClass().getName();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardAfterState(int stateIndex) {
		List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<fr.inria.diverse.trace.api.IStep>();
		arduinoTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the forward stack, and we go downward
		arduinoTrace.Steps.Step itStep = currentState.getStartedSteps().get(0);
		while (itStep != null) {
			arduinoTrace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof arduinoTrace.Steps.Step) {
				result.add(createGenericStep((arduinoTrace.Steps.Step) itStep));
				List<arduinoTrace.Steps.Step> subSteps = (List<arduinoTrace.Steps.Step>) emfGet(itStep, "subSteps");
				if (subSteps != null) {
					itStep = subSteps.get(0);
				}
			}

			// If we didn't find anything new, we stop
			if (itStep == itStep_prev)
				itStep = null;
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackBackward(int stateIndex) {
		List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<fr.inria.diverse.trace.api.IStep>();
		arduinoTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the backward stack, and we go downward
		arduinoTrace.Steps.Step itStep = currentState.getEndedSteps().get(0);
		while (itStep != null) {
			arduinoTrace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof arduinoTrace.Steps.Step) {
				result.add(createGenericStep((arduinoTrace.Steps.Step) itStep));
				List<arduinoTrace.Steps.Step> subSteps = (List<arduinoTrace.Steps.Step>) emfGet(itStep, "subSteps");
				if (subSteps != null) {
					itStep = subSteps.get(subSteps.size() - 1);
				}
			}

			// If we didn't find anything new, we stop
			if (itStep == itStep_prev)
				itStep = null;
		}
		return result;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardBeforeState(int stateIndex) {
		LinkedList<fr.inria.diverse.trace.api.IStep> result = new LinkedList<fr.inria.diverse.trace.api.IStep>();
		arduinoTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		arduinoTrace.Steps.Step endedStep = currentState.getEndedSteps().get(0);
		if (endedStep.getStartingState() != currentState) {
			result.addFirst(createGenericStep(endedStep));
		}
		EObject itStep = currentState.getStartedSteps().get(0).eContainer();
		while (itStep != null) {
			if (itStep instanceof arduinoTrace.Steps.Step) {
				arduinoTrace.Steps.Step step = (arduinoTrace.Steps.Step) itStep;
				if (step.getStartingState() != currentState) {
					result.addFirst(createGenericStep(step));
				}
				itStep = itStep.eContainer();
			} else {
				itStep = null;
			}
		}
		return result;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep.StepEvent> getEventsForState(int stateIndex) {
		final Map<arduinoTrace.Steps.Step, fr.inria.diverse.trace.api.IStep> step2IStep = new HashMap<>();
	
		final arduinoTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
	
		final List<fr.inria.diverse.trace.api.IStep> endedSteps = currentState.getEndedSteps().stream().map(s -> {
			return step2IStep.computeIfAbsent(s, k -> createGenericStep(k));
		}).collect(Collectors.toList());
	
		final List<fr.inria.diverse.trace.api.IStep> startedSteps = currentState.getStartedSteps().stream().map(s -> {
			return step2IStep.computeIfAbsent(s, k -> createGenericStep(k));
		}).collect(Collectors.toList());
	
		final List<fr.inria.diverse.trace.api.IStep.StepEvent> events = new ArrayList<>();
		final LinkedList<fr.inria.diverse.trace.api.IStep> virtualStack = new LinkedList<>();
	
		final Iterator<fr.inria.diverse.trace.api.IStep> itEnding = endedSteps.iterator();
		final Iterator<fr.inria.diverse.trace.api.IStep> itStarting = startedSteps.iterator();
	
		while (itEnding.hasNext()) {
			// As long as we have ending steps
			final fr.inria.diverse.trace.api.IStep endedIStep = itEnding.next();
			if (endedIStep.getStartingIndex() != stateIndex) {
				events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
			} else {
				if (virtualStack.peek() == endedIStep) {
					// A start event on this step has already been treated,
					// we thus can treat this end event.
					events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
					virtualStack.pop();
				} else {
					while (virtualStack.peek() != endedIStep && itStarting.hasNext()) {
						// Pushing steps that start onto the stack until we pushed the one
						// we are trying to pop or we run out of steps.
						final fr.inria.diverse.trace.api.IStep startedIStep = itStarting.next();
						virtualStack.push(startedIStep);
						events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(startedIStep, true));
					}
					if (virtualStack.peek() == endedIStep) {
						// We try again.
						events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
						virtualStack.pop();
					} else {
						// If it failed again, throw an exception. Not supposed to happen.
						throw new IllegalStateException();
					}
				}
			}
		}
		
		while (itStarting.hasNext()) {
			final fr.inria.diverse.trace.api.IStep startedIStep = itStarting.next();
			events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(startedIStep, true));
		}
	
		return events;
	}

	private fr.inria.diverse.trace.api.IStep generateStep(arduinoTrace.Steps.Step step) {
		fr.inria.diverse.trace.api.IStep result = null;

		fr.inria.diverse.trace.api.IStep parentStep = null;
		if (step.eContainer() instanceof arduinoTrace.Steps.Step) {
			parentStep = createGenericStep((arduinoTrace.Steps.Step) step.eContainer());
		}

		if (step instanceof arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate) {
			arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate step_cast = (arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet", "evaluate",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) {
			arduinoTrace.Steps.Arduino_ModuleAssignment_Execute step_cast = (arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment", "execute", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_While_Execute) {
			arduinoTrace.Steps.Arduino_While_Execute step_cast = (arduinoTrace.Steps.Arduino_While_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.While", "execute", startIndex, endIndex,
					parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Utilities_Execute) {
			arduinoTrace.Steps.Arduino_Utilities_Execute step_cast = (arduinoTrace.Steps.Arduino_Utilities_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.Utilities", "execute", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Delay_Execute) {
			arduinoTrace.Steps.Arduino_Delay_Execute step_cast = (arduinoTrace.Steps.Arduino_Delay_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.Delay", "execute", startIndex, endIndex,
					parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_If_Execute) {
			arduinoTrace.Steps.Arduino_If_Execute step_cast = (arduinoTrace.Steps.Arduino_If_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.If", "execute", startIndex, endIndex,
					parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_VariableDeclaration_Execute) {
			arduinoTrace.Steps.Arduino_VariableDeclaration_Execute step_cast = (arduinoTrace.Steps.Arduino_VariableDeclaration_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.VariableDeclaration", "execute",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_VariableAssignment_Execute) {
			arduinoTrace.Steps.Arduino_VariableAssignment_Execute step_cast = (arduinoTrace.Steps.Arduino_VariableAssignment_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.VariableAssignment", "execute",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Repeat_Execute) {
			arduinoTrace.Steps.Arduino_Repeat_Execute step_cast = (arduinoTrace.Steps.Arduino_Repeat_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.Repeat", "execute", startIndex, endIndex,
					parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate) {
			arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate step_cast = (arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("aorg.gemoc.arduino.melange.arduinomt.rduino.IntegerModuleGet", "evaluate",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate) {
			arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate step_cast = (arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.BooleanConstant", "evaluate", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_ModuleAssignment_Call) {
			arduinoTrace.Steps.Arduino_ModuleAssignment_Call step_cast = (arduinoTrace.Steps.Arduino_ModuleAssignment_Call) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment", "call", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate) {
			arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate step_cast = (arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("org.gemoc.arduino.melange.arduinomt.arduino.IntegerConstant", "evaluate", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(arduinoTrace.Steps.Step step) {
		return new fr.inria.diverse.trace.api.impl.LazyGenericStep(() -> {
			return generateStep(step);
		});
		
	}
}
