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
	private static final List<String> bigSteps = Arrays.asList("Arduino_Utilities_Call", "Arduino_If_Execute",
			"Arduino_While_Execute", "Arduino_Repeat_Execute", "Arduino_FunctionCall_Execute", "Arduino_Status_Call");

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
				 * Storing the state of a fr.obeo.dsl.arduino.AnalogPin object
				 */
				if (o instanceof fr.obeo.dsl.arduino.AnalogPin) {

					fr.obeo.dsl.arduino.AnalogPin o_cast = (fr.obeo.dsl.arduino.AnalogPin) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedAnalogPin tracedObject = (arduinoTrace.States.arduino.TracedAnalogPin) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.Pin_level_Value> localTrace1 = tracedObject.getLevelSequence();
					arduinoTrace.States.Pin_level_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1.get(localTrace1.size() - 1);

					int content1 = o_cast.getLevel();

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
				 * Storing the state of a fr.obeo.dsl.arduino.DigitalPin object
				 */
				if (o instanceof fr.obeo.dsl.arduino.DigitalPin) {

					fr.obeo.dsl.arduino.DigitalPin o_cast = (fr.obeo.dsl.arduino.DigitalPin) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedDigitalPin tracedObject = (arduinoTrace.States.arduino.TracedDigitalPin) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.Pin_level_Value> localTrace2 = tracedObject.getLevelSequence();
					arduinoTrace.States.Pin_level_Value previousValue2 = null;
					if (!localTrace2.isEmpty())
						previousValue2 = localTrace2.get(localTrace2.size() - 1);

					int content2 = o_cast.getLevel();

					boolean noChange2 = previousValue2 != null && previousValue2.getLevel() == content2;

					if (noChange2) {
						newState.getPin_level_Values().add(previousValue2);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.Pin_level_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createPin_level_Value();

						newValue.setLevel(content2);

						tracedObject.getLevelSequence().add(newValue);
						newState.getPin_level_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.StringValue object
				 */
				if (o instanceof fr.obeo.dsl.arduino.StringValue) {

					fr.obeo.dsl.arduino.StringValue o_cast = (fr.obeo.dsl.arduino.StringValue) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedStringValue tracedObject = (arduinoTrace.States.arduino.TracedStringValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.StringValue_value_Value> localTrace3 = tracedObject.getValueSequence();
					arduinoTrace.States.StringValue_value_Value previousValue3 = null;
					if (!localTrace3.isEmpty())
						previousValue3 = localTrace3.get(localTrace3.size() - 1);

					java.lang.String content3 = o_cast.getValue();

					boolean noChange3 = previousValue3 != null && previousValue3.getValue() == content3;

					if (noChange3) {
						newState.getStringValue_value_Values().add(previousValue3);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.StringValue_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createStringValue_value_Value();

						newValue.setValue(content3);

						tracedObject.getValueSequence().add(newValue);
						newState.getStringValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.BooleanValue object
				 */
				if (o instanceof fr.obeo.dsl.arduino.BooleanValue) {

					fr.obeo.dsl.arduino.BooleanValue o_cast = (fr.obeo.dsl.arduino.BooleanValue) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedBooleanValue tracedObject = (arduinoTrace.States.arduino.TracedBooleanValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.BooleanValue_value_Value> localTrace4 = tracedObject.getValueSequence();
					arduinoTrace.States.BooleanValue_value_Value previousValue4 = null;
					if (!localTrace4.isEmpty())
						previousValue4 = localTrace4.get(localTrace4.size() - 1);

					boolean content4 = o_cast.isValue();

					boolean noChange4 = previousValue4 != null && previousValue4.isValue() == content4;

					if (noChange4) {
						newState.getBooleanValue_value_Values().add(previousValue4);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.BooleanValue_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createBooleanValue_value_Value();

						newValue.setValue(content4);

						tracedObject.getValueSequence().add(newValue);
						newState.getBooleanValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.NumberValue object
				 */
				if (o instanceof fr.obeo.dsl.arduino.NumberValue) {

					fr.obeo.dsl.arduino.NumberValue o_cast = (fr.obeo.dsl.arduino.NumberValue) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedNumberValue tracedObject = (arduinoTrace.States.arduino.TracedNumberValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.NumberValue_value_Value> localTrace5 = tracedObject.getValueSequence();
					arduinoTrace.States.NumberValue_value_Value previousValue5 = null;
					if (!localTrace5.isEmpty())
						previousValue5 = localTrace5.get(localTrace5.size() - 1);

					int content5 = o_cast.getValue();

					boolean noChange5 = previousValue5 != null && previousValue5.getValue() == content5;

					if (noChange5) {
						newState.getNumberValue_value_Values().add(previousValue5);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.NumberValue_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createNumberValue_value_Value();

						newValue.setValue(content5);

						tracedObject.getValueSequence().add(newValue);
						newState.getNumberValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.Variable object
				 */
				if (o instanceof fr.obeo.dsl.arduino.Variable) {

					fr.obeo.dsl.arduino.Variable o_cast = (fr.obeo.dsl.arduino.Variable) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.States.arduino.TracedVariable tracedObject = (arduinoTrace.States.arduino.TracedVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<arduinoTrace.States.Variable_value_Value> localTrace6 = tracedObject.getValueSequence();
					arduinoTrace.States.Variable_value_Value previousValue6 = null;
					if (!localTrace6.isEmpty())
						previousValue6 = localTrace6.get(localTrace6.size() - 1);

					storeAsTracedObject(o_cast.getValue());

					arduinoTrace.States.arduino.TracedValue content6 = null;
					if (o_cast.getValue() != null)
						content6 = ((arduinoTrace.States.arduino.TracedValue) exeToTraced.get(o_cast.getValue()));

					boolean noChange6 = previousValue6 != null && previousValue6.getValue() == content6;

					if (noChange6) {
						newState.getVariable_value_Values().add(previousValue6);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.States.Variable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
								.createVariable_value_Value();

						newValue.setValue(content6);

						tracedObject.getValueSequence().add(newValue);
						newState.getVariable_value_Values().add(newValue);
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
			newState.getVariable_value_Values().clear();
			newState.getNumberValue_value_Values().clear();
			newState.getBooleanValue_value_Values().clear();
			newState.getStringValue_value_Values().clear();
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

			if (stepRule.equalsIgnoreCase("arduino.If.execute")) {

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
							Object v0 = params.get(k);
							if (v0 instanceof fr.obeo.dsl.arduino.If)
								arduino_If_ExecuteInstance.setThis((fr.obeo.dsl.arduino.If) v0);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_If_Execute_Sequence().add(arduino_If_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Level.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Level_Execute arduino_Level_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Level_Execute();
				arduino_Level_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Level_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Level_ExecuteInstance);
				}
				toPush = arduino_Level_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v1 = params.get(k);
							if (v1 instanceof fr.obeo.dsl.arduino.Level)
								arduino_Level_ExecuteInstance.setThis((fr.obeo.dsl.arduino.Level) v1);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Level_Execute_Sequence().add(arduino_Level_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Status.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Status_Execute arduino_Status_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Status_Execute();
				arduino_Status_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Status_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Status_ExecuteInstance);
				}
				toPush = arduino_Status_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v2 = params.get(k);
							if (v2 instanceof fr.obeo.dsl.arduino.Status)
								arduino_Status_ExecuteInstance.setThis((fr.obeo.dsl.arduino.Status) v2);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Status_Execute_Sequence().add(arduino_Status_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Set.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Set_Execute arduino_Set_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Set_Execute();
				arduino_Set_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Set_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Set_ExecuteInstance);
				}
				toPush = arduino_Set_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v3 = params.get(k);
							if (v3 instanceof fr.obeo.dsl.arduino.Set)
								arduino_Set_ExecuteInstance.setThis((fr.obeo.dsl.arduino.Set) v3);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Set_Execute_Sequence().add(arduino_Set_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Utilities.execute")) {

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
							Object v4 = params.get(k);
							if (v4 instanceof fr.obeo.dsl.arduino.Utilities)
								arduino_Utilities_ExecuteInstance.setThis((fr.obeo.dsl.arduino.Utilities) v4);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Utilities_Execute_Sequence().add(arduino_Utilities_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Delay.execute")) {

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
							Object v5 = params.get(k);
							if (v5 instanceof fr.obeo.dsl.arduino.Delay)
								arduino_Delay_ExecuteInstance.setThis((fr.obeo.dsl.arduino.Delay) v5);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Delay_Execute_Sequence().add(arduino_Delay_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Status.call")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Status_Call arduino_Status_CallInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Status_Call();
				arduino_Status_CallInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Status_CallInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Status_CallInstance);
				}
				toPush = arduino_Status_CallInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v6 = params.get(k);
							if (v6 instanceof fr.obeo.dsl.arduino.Status)
								arduino_Status_CallInstance.setThis((fr.obeo.dsl.arduino.Status) v6);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Status_Call_Sequence().add(arduino_Status_CallInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Repeat.execute")) {

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
							Object v7 = params.get(k);
							if (v7 instanceof fr.obeo.dsl.arduino.Repeat)
								arduino_Repeat_ExecuteInstance.setThis((fr.obeo.dsl.arduino.Repeat) v7);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Repeat_Execute_Sequence().add(arduino_Repeat_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Project.setup")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Project_Setup arduino_Project_SetupInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Project_Setup();
				arduino_Project_SetupInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Project_SetupInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Project_SetupInstance);
				}
				toPush = arduino_Project_SetupInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v8 = params.get(k);
							if (v8 instanceof fr.obeo.dsl.arduino.Project)
								arduino_Project_SetupInstance.setThis((fr.obeo.dsl.arduino.Project) v8);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Project_Setup_Sequence().add(arduino_Project_SetupInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.Utilities.call")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_Utilities_Call arduino_Utilities_CallInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Utilities_Call();
				arduino_Utilities_CallInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_Utilities_CallInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_Utilities_CallInstance);
				}
				toPush = arduino_Utilities_CallInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v9 = params.get(k);
							if (v9 instanceof fr.obeo.dsl.arduino.Utilities)
								arduino_Utilities_CallInstance.setThis((fr.obeo.dsl.arduino.Utilities) v9);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_Utilities_Call_Sequence().add(arduino_Utilities_CallInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.FunctionCall.execute")) {

				// First we create the step
				arduinoTrace.Steps.Arduino_FunctionCall_Execute arduino_FunctionCall_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_FunctionCall_Execute();
				arduino_FunctionCall_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", arduino_FunctionCall_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(arduino_FunctionCall_ExecuteInstance);
				}
				toPush = arduino_FunctionCall_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v10 = params.get(k);
							if (v10 instanceof fr.obeo.dsl.arduino.FunctionCall)
								arduino_FunctionCall_ExecuteInstance.setThis((fr.obeo.dsl.arduino.FunctionCall) v10);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_FunctionCall_Execute_Sequence().add(arduino_FunctionCall_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("arduino.While.execute")) {

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
							Object v11 = params.get(k);
							if (v11 instanceof fr.obeo.dsl.arduino.While)
								arduino_While_ExecuteInstance.setThis((fr.obeo.dsl.arduino.While) v11);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getArduino_While_Execute_Sequence().add(arduino_While_ExecuteInstance);
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

				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedDigitalPin) {
					arduinoTrace.States.arduino.TracedDigitalPin parent_cast = (arduinoTrace.States.arduino.TracedDigitalPin) value
							.getParent();
					int toset = value.getLevel();
					int current = ((fr.obeo.dsl.arduino.Pin) parent_cast.getOriginalObject()).getLevel();
					if (current != toset)
						((fr.obeo.dsl.arduino.Pin) parent_cast.getOriginalObject()).setLevel(toset);

				}
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedAnalogPin) {
					arduinoTrace.States.arduino.TracedAnalogPin parent_cast = (arduinoTrace.States.arduino.TracedAnalogPin) value
							.getParent();
					int toset = value.getLevel();
					int current = ((fr.obeo.dsl.arduino.Pin) parent_cast.getOriginalObject()).getLevel();
					if (current != toset)
						((fr.obeo.dsl.arduino.Pin) parent_cast.getOriginalObject()).setLevel(toset);

				}

			}

			for (arduinoTrace.States.Variable_value_Value value : stateToGo.getVariable_value_Values()) {

				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedVariable) {
					arduinoTrace.States.arduino.TracedVariable parent_cast = (arduinoTrace.States.arduino.TracedVariable) value
							.getParent();
					fr.obeo.dsl.arduino.Value toset = ((fr.obeo.dsl.arduino.Value) getTracedToExe(value.getValue()));
					fr.obeo.dsl.arduino.Value current = ((fr.obeo.dsl.arduino.Variable) parent_cast.getOriginalObject())
							.getValue();
					if (current != toset)
						((fr.obeo.dsl.arduino.Variable) parent_cast.getOriginalObject()).setValue(toset);

				}

			}

			for (arduinoTrace.States.NumberValue_value_Value value : stateToGo.getNumberValue_value_Values()) {

				fr.obeo.dsl.arduino.NumberValue exeObject = (fr.obeo.dsl.arduino.NumberValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (arduinoTrace.States.BooleanValue_value_Value value : stateToGo.getBooleanValue_value_Values()) {

				fr.obeo.dsl.arduino.BooleanValue exeObject = (fr.obeo.dsl.arduino.BooleanValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.isValue());

			}

			for (arduinoTrace.States.StringValue_value_Value value : stateToGo.getStringValue_value_Values()) {

				fr.obeo.dsl.arduino.StringValue exeObject = (fr.obeo.dsl.arduino.StringValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

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

		if (!gs.getVariable_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.States.Variable_value_Value currenState : gs.getVariable_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getNumberValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.States.NumberValue_value_Value currenState : gs.getNumberValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getBooleanValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.States.BooleanValue_value_Value currenState : gs.getBooleanValue_value_Values()) {
			result.append("\n\t" + currenState.isValue());
		}

		if (!gs.getStringValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.States.StringValue_value_Value currenState : gs.getStringValue_value_Values()) {
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
		} else if (eObject instanceof arduinoTrace.States.Variable_value_Value) {
			return "arduinoTrace.States.Variable_value_Value: "
					+ ((arduinoTrace.States.Variable_value_Value) eObject).getValue();
		} else if (eObject instanceof arduinoTrace.States.NumberValue_value_Value) {
			return "arduinoTrace.States.NumberValue_value_Value: "
					+ ((arduinoTrace.States.NumberValue_value_Value) eObject).getValue();
		} else if (eObject instanceof arduinoTrace.States.BooleanValue_value_Value) {
			return "arduinoTrace.States.BooleanValue_value_Value: "
					+ ((arduinoTrace.States.BooleanValue_value_Value) eObject).isValue();
		} else if (eObject instanceof arduinoTrace.States.StringValue_value_Value) {
			return "arduinoTrace.States.StringValue_value_Value: "
					+ ((arduinoTrace.States.StringValue_value_Value) eObject).getValue();
		} else
			return "ERROR";
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.Variable o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.NumberValue o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedNumberValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedNumberValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedNumberValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.BooleanValue o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedBooleanValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedBooleanValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedBooleanValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.StringValue o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.States.arduino.TracedStringValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE.createTracedStringValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getArduino_tracedStringValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.DigitalPin o) {

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

	private void storeAsTracedObject(fr.obeo.dsl.arduino.AnalogPin o) {

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

	private void storeAsTracedObject(EObject o) {

		if (o instanceof fr.obeo.dsl.arduino.AnalogPin)
			storeAsTracedObject((fr.obeo.dsl.arduino.AnalogPin) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.DigitalPin)
			storeAsTracedObject((fr.obeo.dsl.arduino.DigitalPin) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.StringValue)
			storeAsTracedObject((fr.obeo.dsl.arduino.StringValue) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.BooleanValue)
			storeAsTracedObject((fr.obeo.dsl.arduino.BooleanValue) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.NumberValue)
			storeAsTracedObject((fr.obeo.dsl.arduino.NumberValue) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.Variable)
			storeAsTracedObject((fr.obeo.dsl.arduino.Variable) o);

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
			currentValues.addAll(currentState.getVariable_value_Values());
			currentValues.addAll(currentState.getNumberValue_value_Values());
			currentValues.addAll(currentState.getBooleanValue_value_Values());
			currentValues.addAll(currentState.getStringValue_value_Values());
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

	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardBeforeState(int stateIndex) {
		LinkedList<fr.inria.diverse.trace.api.IStep> result = new LinkedList<fr.inria.diverse.trace.api.IStep>();
		arduinoTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the top of the forward stack, and we go upward
		EObject itStep = currentState.getStartedSteps().get(0).eContainer();
		while (itStep != null) {
			if (itStep instanceof arduinoTrace.Steps.Step) {
				result.addFirst(createGenericStep((arduinoTrace.Steps.Step) itStep));
				itStep = itStep.eContainer();
			} else {
				itStep = null;
			}

		}
		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(arduinoTrace.Steps.Step step) {
		fr.inria.diverse.trace.api.IStep result = null;

		if (step instanceof arduinoTrace.Steps.Arduino_If_Execute) {
			arduinoTrace.Steps.Arduino_If_Execute step_cast = (arduinoTrace.Steps.Arduino_If_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.If", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Level_Execute) {
			arduinoTrace.Steps.Arduino_Level_Execute step_cast = (arduinoTrace.Steps.Arduino_Level_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Level", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Status_Execute) {
			arduinoTrace.Steps.Arduino_Status_Execute step_cast = (arduinoTrace.Steps.Arduino_Status_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Status", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Set_Execute) {
			arduinoTrace.Steps.Arduino_Set_Execute step_cast = (arduinoTrace.Steps.Arduino_Set_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Set", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Utilities_Execute) {
			arduinoTrace.Steps.Arduino_Utilities_Execute step_cast = (arduinoTrace.Steps.Arduino_Utilities_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Utilities", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Delay_Execute) {
			arduinoTrace.Steps.Arduino_Delay_Execute step_cast = (arduinoTrace.Steps.Arduino_Delay_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Delay", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Status_Call) {
			arduinoTrace.Steps.Arduino_Status_Call step_cast = (arduinoTrace.Steps.Arduino_Status_Call) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Status", "call");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Repeat_Execute) {
			arduinoTrace.Steps.Arduino_Repeat_Execute step_cast = (arduinoTrace.Steps.Arduino_Repeat_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Repeat", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Project_Setup) {
			arduinoTrace.Steps.Arduino_Project_Setup step_cast = (arduinoTrace.Steps.Arduino_Project_Setup) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Project", "setup");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_Utilities_Call) {
			arduinoTrace.Steps.Arduino_Utilities_Call step_cast = (arduinoTrace.Steps.Arduino_Utilities_Call) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.Utilities", "call");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_FunctionCall_Execute) {
			arduinoTrace.Steps.Arduino_FunctionCall_Execute step_cast = (arduinoTrace.Steps.Arduino_FunctionCall_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.FunctionCall", "execute");

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof arduinoTrace.Steps.Arduino_While_Execute) {
			arduinoTrace.Steps.Arduino_While_Execute step_cast = (arduinoTrace.Steps.Arduino_While_Execute) step;
			result = new fr.inria.diverse.trace.api.impl.GenericStep("arduino.While", "execute");

			result.addParameter("this", (step_cast.getThis()));

		}

		return result;
	}
}
