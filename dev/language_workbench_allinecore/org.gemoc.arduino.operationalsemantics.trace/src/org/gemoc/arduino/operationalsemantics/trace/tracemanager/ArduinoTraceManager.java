package org.gemoc.arduino.operationalsemantics.trace.tracemanager;

import fr.inria.diverse.trace.api.ITraceManager;
import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.io.IOException;
import java.util.ArrayDeque;
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
	private arduinoTrace.Traced.TracedObjects tracedObjects;
	private arduinoTrace.Steps.Steps events;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private arduinoTrace.State lastState;
	private arduinoTrace.State currentState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<arduinoTrace.Steps.BigStep> context = new ArrayDeque<arduinoTrace.Steps.BigStep>();
	private static final List<String> macroEvents = Arrays.asList(
			"Arduino_Utilities_Call", "Arduino_While_Execute",
			"Arduino_FunctionCall_Execute", "Arduino_Repeat_Execute",
			"Arduino_If_Execute", "Arduino_Level_Execute",
			"Arduino_Status_Call", "Arduino_Project_Setup",
			"Arduino_Status_Execute", "Arduino_Set_Execute");

	public ArduinoTraceManager(Resource exeModel, Resource traceResource) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.traces = new ArrayList<IValueTrace>();
	}

	private Collection<? extends EObject> getExeToTraced(
			Collection<? extends EObject> exeObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			storeAsTracedObject(exeObject);
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	private Collection<? extends EObject> getTracedToExe(
			Collection<? extends EObject> tracedObjects) {
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

	private void storeAsTracedObject(fr.obeo.dsl.arduino.DigitalPin o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.Traced.arduino.TracedDigitalPin tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.Traced.arduino.ArduinoFactory.eINSTANCE
					.createTracedDigitalPin();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getArduino_tracedDigitalPins().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getLevelTrace(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.AnalogPin o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.Traced.arduino.TracedAnalogPin tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.Traced.arduino.ArduinoFactory.eINSTANCE
					.createTracedAnalogPin();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getArduino_tracedAnalogPins().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getLevelTrace(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.Variable o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.Traced.arduino.TracedVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.Traced.arduino.ArduinoFactory.eINSTANCE
					.createTracedVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getArduino_tracedVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.NumberValue o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.Traced.arduino.TracedNumberValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.Traced.arduino.ArduinoFactory.eINSTANCE
					.createTracedNumberValue();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getArduino_tracedNumberValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.StringValue o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.Traced.arduino.TracedStringValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.Traced.arduino.ArduinoFactory.eINSTANCE
					.createTracedStringValue();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getArduino_tracedStringValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
		}
	}

	private void storeAsTracedObject(fr.obeo.dsl.arduino.BooleanValue o) {

		// First we find the traced object, and we create it if required
		arduinoTrace.Traced.arduino.TracedBooleanValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = arduinoTrace.Traced.arduino.ArduinoFactory.eINSTANCE
					.createTracedBooleanValue();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getArduino_tracedBooleanValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
		}
	}

	private void storeAsTracedObject(EObject o) {

		if (o instanceof fr.obeo.dsl.arduino.BooleanValue)
			storeAsTracedObject((fr.obeo.dsl.arduino.BooleanValue) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.StringValue)
			storeAsTracedObject((fr.obeo.dsl.arduino.StringValue) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.NumberValue)
			storeAsTracedObject((fr.obeo.dsl.arduino.NumberValue) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.Variable)
			storeAsTracedObject((fr.obeo.dsl.arduino.Variable) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.AnalogPin)
			storeAsTracedObject((fr.obeo.dsl.arduino.AnalogPin) o);
		else

		if (o instanceof fr.obeo.dsl.arduino.DigitalPin)
			storeAsTracedObject((fr.obeo.dsl.arduino.DigitalPin) o);

	}

	@SuppressWarnings("unchecked")
	private boolean addState(boolean onlyIfChange) {

		arduinoTrace.State newState = arduinoTrace.ArduinoTraceFactory.eINSTANCE
				.createState();
		boolean changed = false;

		// We look at each object instance of a class with mutable properties
		// Each of these objects should eventually become a traced object

		Set<Resource> resources = org.gemoc.commons.eclipse.emf.EMFResource
				.getRelatedResources(executedModel);
		for (Resource resource : resources) {
			for (TreeIterator<EObject> i = resource.getAllContents(); i
					.hasNext();) {
				EObject o = i.next();

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.BooleanValue
				 * object
				 */
				if (o instanceof fr.obeo.dsl.arduino.BooleanValue) {

					fr.obeo.dsl.arduino.BooleanValue o_cast = (fr.obeo.dsl.arduino.BooleanValue) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.Traced.arduino.TracedBooleanValue tracedObject = (arduinoTrace.Traced.arduino.TracedBooleanValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last
					// stored value
					// If same value, we create no local state and we refer to
					// the previous
					List<arduinoTrace.Values.BooleanValue_value_Value> localTrace1 = tracedObject
							.getValueTrace();
					arduinoTrace.Values.BooleanValue_value_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1
								.get(localTrace1.size() - 1);

					boolean content1 = o_cast.isValue();

					boolean noChange1 = previousValue1 != null
							&& previousValue1.isValue() == content1;

					if (noChange1) {
						newState.getBooleanValue_value_Values().add(
								previousValue1);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.Values.BooleanValue_value_Value newValue = arduinoTrace.Values.ValuesFactory.eINSTANCE
								.createBooleanValue_value_Value();

						newValue.setValue(content1);

						tracedObject.getValueTrace().add(newValue);
						newState.getBooleanValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.StringValue object
				 */
				if (o instanceof fr.obeo.dsl.arduino.StringValue) {

					fr.obeo.dsl.arduino.StringValue o_cast = (fr.obeo.dsl.arduino.StringValue) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.Traced.arduino.TracedStringValue tracedObject = (arduinoTrace.Traced.arduino.TracedStringValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last
					// stored value
					// If same value, we create no local state and we refer to
					// the previous
					List<arduinoTrace.Values.StringValue_value_Value> localTrace2 = tracedObject
							.getValueTrace();
					arduinoTrace.Values.StringValue_value_Value previousValue2 = null;
					if (!localTrace2.isEmpty())
						previousValue2 = localTrace2
								.get(localTrace2.size() - 1);

					java.lang.String content2 = o_cast.getValue();

					boolean noChange2 = previousValue2 != null
							&& previousValue2.getValue() == content2;

					if (noChange2) {
						newState.getStringValue_value_Values().add(
								previousValue2);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.Values.StringValue_value_Value newValue = arduinoTrace.Values.ValuesFactory.eINSTANCE
								.createStringValue_value_Value();

						newValue.setValue(content2);

						tracedObject.getValueTrace().add(newValue);
						newState.getStringValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.NumberValue object
				 */
				if (o instanceof fr.obeo.dsl.arduino.NumberValue) {

					fr.obeo.dsl.arduino.NumberValue o_cast = (fr.obeo.dsl.arduino.NumberValue) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.Traced.arduino.TracedNumberValue tracedObject = (arduinoTrace.Traced.arduino.TracedNumberValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last
					// stored value
					// If same value, we create no local state and we refer to
					// the previous
					List<arduinoTrace.Values.NumberValue_value_Value> localTrace3 = tracedObject
							.getValueTrace();
					arduinoTrace.Values.NumberValue_value_Value previousValue3 = null;
					if (!localTrace3.isEmpty())
						previousValue3 = localTrace3
								.get(localTrace3.size() - 1);

					int content3 = o_cast.getValue();

					boolean noChange3 = previousValue3 != null
							&& previousValue3.getValue() == content3;

					if (noChange3) {
						newState.getNumberValue_value_Values().add(
								previousValue3);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.Values.NumberValue_value_Value newValue = arduinoTrace.Values.ValuesFactory.eINSTANCE
								.createNumberValue_value_Value();

						newValue.setValue(content3);

						tracedObject.getValueTrace().add(newValue);
						newState.getNumberValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.Variable object
				 */
				if (o instanceof fr.obeo.dsl.arduino.Variable) {

					fr.obeo.dsl.arduino.Variable o_cast = (fr.obeo.dsl.arduino.Variable) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.Traced.arduino.TracedVariable tracedObject = (arduinoTrace.Traced.arduino.TracedVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last
					// stored value
					// If same value, we create no local state and we refer to
					// the previous
					List<arduinoTrace.Values.Variable_value_Value> localTrace4 = tracedObject
							.getValueTrace();
					arduinoTrace.Values.Variable_value_Value previousValue4 = null;
					if (!localTrace4.isEmpty())
						previousValue4 = localTrace4
								.get(localTrace4.size() - 1);

					storeAsTracedObject(o_cast.getValue());

					arduinoTrace.Traced.arduino.TracedValue content4 = null;
					if (o_cast.getValue() != null)
						content4 = ((arduinoTrace.Traced.arduino.TracedValue) exeToTraced
								.get(o_cast.getValue()));

					boolean noChange4 = previousValue4 != null
							&& previousValue4.getValue() == content4;

					if (noChange4) {
						newState.getVariable_value_Values().add(previousValue4);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.Values.Variable_value_Value newValue = arduinoTrace.Values.ValuesFactory.eINSTANCE
								.createVariable_value_Value();

						newValue.setValue(content4);

						tracedObject.getValueTrace().add(newValue);
						newState.getVariable_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.AnalogPin object
				 */
				if (o instanceof fr.obeo.dsl.arduino.AnalogPin) {

					fr.obeo.dsl.arduino.AnalogPin o_cast = (fr.obeo.dsl.arduino.AnalogPin) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.Traced.arduino.TracedAnalogPin tracedObject = (arduinoTrace.Traced.arduino.TracedAnalogPin) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last
					// stored value
					// If same value, we create no local state and we refer to
					// the previous
					List<arduinoTrace.Values.Pin_level_Value> localTrace5 = tracedObject
							.getLevelTrace();
					arduinoTrace.Values.Pin_level_Value previousValue5 = null;
					if (!localTrace5.isEmpty())
						previousValue5 = localTrace5
								.get(localTrace5.size() - 1);

					int content5 = o_cast.getLevel();

					boolean noChange5 = previousValue5 != null
							&& previousValue5.getLevel() == content5;

					if (noChange5) {
						newState.getPin_level_Values().add(previousValue5);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.Values.Pin_level_Value newValue = arduinoTrace.Values.ValuesFactory.eINSTANCE
								.createPin_level_Value();

						newValue.setLevel(content5);

						tracedObject.getLevelTrace().add(newValue);
						newState.getPin_level_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a fr.obeo.dsl.arduino.DigitalPin object
				 */
				if (o instanceof fr.obeo.dsl.arduino.DigitalPin) {

					fr.obeo.dsl.arduino.DigitalPin o_cast = (fr.obeo.dsl.arduino.DigitalPin) o;

					storeAsTracedObject(o_cast);

					arduinoTrace.Traced.arduino.TracedDigitalPin tracedObject = (arduinoTrace.Traced.arduino.TracedDigitalPin) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last
					// stored value
					// If same value, we create no local state and we refer to
					// the previous
					List<arduinoTrace.Values.Pin_level_Value> localTrace6 = tracedObject
							.getLevelTrace();
					arduinoTrace.Values.Pin_level_Value previousValue6 = null;
					if (!localTrace6.isEmpty())
						previousValue6 = localTrace6
								.get(localTrace6.size() - 1);

					int content6 = o_cast.getLevel();

					boolean noChange6 = previousValue6 != null
							&& previousValue6.getLevel() == content6;

					if (noChange6) {
						newState.getPin_level_Values().add(previousValue6);

					} // Else we create one
					else {
						changed = true;
						arduinoTrace.Values.Pin_level_Value newValue = arduinoTrace.Values.ValuesFactory.eINSTANCE
								.createPin_level_Value();

						newValue.setLevel(content6);

						tracedObject.getLevelTrace().add(newValue);
						newState.getPin_level_Values().add(newValue);
					}

				}
			}
		}
		boolean createNewState = lastState == null
				|| (!onlyIfChange || changed);
		if (createNewState) {
			lastState = newState;
			currentState = lastState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedBigSteps().clear();
			newState.getEndedBigSteps().clear();
			newState.setFollowingStep(null);

			newState.getVariable_value_Values().clear();
			newState.getPin_level_Values().clear();
			newState.getNumberValue_value_Values().clear();
			newState.getStringValue_value_Values().clear();
			newState.getBooleanValue_value_Values().clear();
		}

		return createNewState;

	}

	@SuppressWarnings("unchecked")
	@Override
	public void goTo(EObject state) {

		if (state instanceof arduinoTrace.State) {
			arduinoTrace.State stateToGo = (arduinoTrace.State) state;

			for (arduinoTrace.Values.Variable_value_Value value : stateToGo
					.getVariable_value_Values()) {

				if (value.getParent() instanceof arduinoTrace.Traced.arduino.TracedVariable) {
					arduinoTrace.Traced.arduino.TracedVariable parent_cast = (arduinoTrace.Traced.arduino.TracedVariable) value
							.getParent();
					fr.obeo.dsl.arduino.Value toset = ((fr.obeo.dsl.arduino.Value) getTracedToExe(value
							.getValue()));
					fr.obeo.dsl.arduino.Value current = ((fr.obeo.dsl.arduino.Variable) parent_cast
							.getOriginalObject()).getValue();
					if (current != toset)
						((fr.obeo.dsl.arduino.Variable) parent_cast
								.getOriginalObject()).setValue(toset);

				}

			}

			for (arduinoTrace.Values.Pin_level_Value value : stateToGo
					.getPin_level_Values()) {

				if (value.getParent() instanceof arduinoTrace.Traced.arduino.TracedDigitalPin) {
					arduinoTrace.Traced.arduino.TracedDigitalPin parent_cast = (arduinoTrace.Traced.arduino.TracedDigitalPin) value
							.getParent();
					int toset = value.getLevel();
					int current = ((fr.obeo.dsl.arduino.Pin) parent_cast
							.getOriginalObject()).getLevel();
					if (current != toset)
						((fr.obeo.dsl.arduino.Pin) parent_cast
								.getOriginalObject()).setLevel(toset);

				}
				if (value.getParent() instanceof arduinoTrace.Traced.arduino.TracedAnalogPin) {
					arduinoTrace.Traced.arduino.TracedAnalogPin parent_cast = (arduinoTrace.Traced.arduino.TracedAnalogPin) value
							.getParent();
					int toset = value.getLevel();
					int current = ((fr.obeo.dsl.arduino.Pin) parent_cast
							.getOriginalObject()).getLevel();
					if (current != toset)
						((fr.obeo.dsl.arduino.Pin) parent_cast
								.getOriginalObject()).setLevel(toset);

				}

			}

			for (arduinoTrace.Values.NumberValue_value_Value value : stateToGo
					.getNumberValue_value_Values()) {

				fr.obeo.dsl.arduino.NumberValue exeObject = (fr.obeo.dsl.arduino.NumberValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (arduinoTrace.Values.StringValue_value_Value value : stateToGo
					.getStringValue_value_Values()) {

				fr.obeo.dsl.arduino.StringValue exeObject = (fr.obeo.dsl.arduino.StringValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (arduinoTrace.Values.BooleanValue_value_Value value : stateToGo
					.getBooleanValue_value_Values()) {

				fr.obeo.dsl.arduino.BooleanValue exeObject = (fr.obeo.dsl.arduino.BooleanValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.isValue());

			}

			currentState = stateToGo;
		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		arduinoTrace.State stateToGo = traceRoot.getStatesTrace().get(
				stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof arduinoTrace.State) {
					goTo((arduinoTrace.State) state);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void emfAdd(EObject o, String property, Object value) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equals(property)) {
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
			if (r.getName().equals(property)) {
				return o.eGet(r);
			}
		}
		return null;
	}

	@Override
	public void retroAddEvent(String eventName, Map<String, Object> params) {
		addEvent(eventName, params, this.getTraceSize() - 2);

	}

	@Override
	public void addEvent(String eventName, Map<String, Object> params) {
		addEvent(eventName, params, this.getTraceSize() - 1);
	}

	private void addEvent(String eventName, Map<String, Object> params,
			int stateIndex) {

		if (stateIndex >= 0) {

			arduinoTrace.State state = this.traceRoot.getStatesTrace().get(
					stateIndex);

			switch (eventName) {

			case "Arduino_Status_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Status_Execute_FillStep arduino_Status_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Status_Execute_FillStep();
				arduino_Status_Execute_FillStepInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Status_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Status_Execute_FillStep_Trace().add(
						arduino_Status_Execute_FillStepInstance);
				break;

			case "Arduino_Utilities_Call":

				// First we create the event
				arduinoTrace.Steps.Arduino_Utilities_Call arduino_Utilities_CallInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Utilities_Call();
				arduino_Utilities_CallInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Utilities_CallInstance);
				}
				context.push(arduino_Utilities_CallInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Utilities)
								arduino_Utilities_CallInstance
										.setThis((fr.obeo.dsl.arduino.Utilities) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Utilities_Call_Trace().add(
						arduino_Utilities_CallInstance);
				break;

			case "Arduino_While_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_While_Execute arduino_While_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_While_Execute();
				arduino_While_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_While_ExecuteInstance);
				}
				context.push(arduino_While_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.While)
								arduino_While_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.While) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_While_Execute_Trace().add(
						arduino_While_ExecuteInstance);
				break;

			case "Arduino_Project_Setup_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Project_Setup_FillStep arduino_Project_Setup_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Project_Setup_FillStep();
				arduino_Project_Setup_FillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Project_Setup_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Project_Setup_FillStep_Trace().add(
						arduino_Project_Setup_FillStepInstance);
				break;

			case "Arduino_Utilities_Call_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Utilities_Call_FillStep arduino_Utilities_Call_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Utilities_Call_FillStep();
				arduino_Utilities_Call_FillStepInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Utilities_Call_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Utilities_Call_FillStep_Trace().add(
						arduino_Utilities_Call_FillStepInstance);
				break;

			case "Arduino_Utilities_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_Utilities_Execute arduino_Utilities_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Utilities_Execute();
				arduino_Utilities_ExecuteInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Utilities_ExecuteInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Utilities)
								arduino_Utilities_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.Utilities) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Utilities_Execute_Trace().add(
						arduino_Utilities_ExecuteInstance);
				break;

			case "Arduino_Level_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Level_Execute_FillStep arduino_Level_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Level_Execute_FillStep();
				arduino_Level_Execute_FillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Level_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Level_Execute_FillStep_Trace().add(
						arduino_Level_Execute_FillStepInstance);
				break;

			case "Arduino_FunctionCall_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep arduino_FunctionCall_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_FunctionCall_Execute_FillStep();
				arduino_FunctionCall_Execute_FillStepInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_FunctionCall_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_FunctionCall_Execute_FillStep_Trace()
						.add(arduino_FunctionCall_Execute_FillStepInstance);
				break;

			case "Arduino_Status_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_Status_Execute arduino_Status_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Status_Execute();
				arduino_Status_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Status_ExecuteInstance);
				}
				context.push(arduino_Status_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Status)
								arduino_Status_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.Status) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Status_Execute_Trace().add(
						arduino_Status_ExecuteInstance);
				break;

			case "Arduino_Delay_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_Delay_Execute arduino_Delay_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Delay_Execute();
				arduino_Delay_ExecuteInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Delay_ExecuteInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Delay)
								arduino_Delay_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.Delay) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Delay_Execute_Trace().add(
						arduino_Delay_ExecuteInstance);
				break;

			case "Arduino_While_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_While_Execute_FillStep arduino_While_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_While_Execute_FillStep();
				arduino_While_Execute_FillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_While_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_While_Execute_FillStep_Trace().add(
						arduino_While_Execute_FillStepInstance);
				break;

			case "FillStep":

				// First we create the event
				arduinoTrace.Steps.FillStep fillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createFillStep();
				fillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps", fillStepInstance);
				}

				// Then we add it to its trace
				this.events.getFillStep_Trace().add(fillStepInstance);
				break;

			case "Arduino_FunctionCall_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_FunctionCall_Execute arduino_FunctionCall_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_FunctionCall_Execute();
				arduino_FunctionCall_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_FunctionCall_ExecuteInstance);
				}
				context.push(arduino_FunctionCall_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.FunctionCall)
								arduino_FunctionCall_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.FunctionCall) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_FunctionCall_Execute_Trace().add(
						arduino_FunctionCall_ExecuteInstance);
				break;

			case "Arduino_Repeat_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_Repeat_Execute arduino_Repeat_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Repeat_Execute();
				arduino_Repeat_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Repeat_ExecuteInstance);
				}
				context.push(arduino_Repeat_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Repeat)
								arduino_Repeat_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.Repeat) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Repeat_Execute_Trace().add(
						arduino_Repeat_ExecuteInstance);
				break;

			case "Arduino_If_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_If_Execute arduino_If_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_If_Execute();
				arduino_If_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_If_ExecuteInstance);
				}
				context.push(arduino_If_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.If)
								arduino_If_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.If) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_If_Execute_Trace().add(
						arduino_If_ExecuteInstance);
				break;

			case "Arduino_Level_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_Level_Execute arduino_Level_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Level_Execute();
				arduino_Level_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Level_ExecuteInstance);
				}
				context.push(arduino_Level_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Level)
								arduino_Level_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.Level) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Level_Execute_Trace().add(
						arduino_Level_ExecuteInstance);
				break;

			case "Arduino_Status_Call":

				// First we create the event
				arduinoTrace.Steps.Arduino_Status_Call arduino_Status_CallInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Status_Call();
				arduino_Status_CallInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Status_CallInstance);
				}
				context.push(arduino_Status_CallInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Status)
								arduino_Status_CallInstance
										.setThis((fr.obeo.dsl.arduino.Status) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Status_Call_Trace().add(
						arduino_Status_CallInstance);
				break;

			case "Arduino_Set_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Set_Execute_FillStep arduino_Set_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Set_Execute_FillStep();
				arduino_Set_Execute_FillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Set_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Set_Execute_FillStep_Trace().add(
						arduino_Set_Execute_FillStepInstance);
				break;

			case "Arduino_Repeat_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep arduino_Repeat_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Repeat_Execute_FillStep();
				arduino_Repeat_Execute_FillStepInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Repeat_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Repeat_Execute_FillStep_Trace().add(
						arduino_Repeat_Execute_FillStepInstance);
				break;

			case "Arduino_If_Execute_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_If_Execute_FillStep arduino_If_Execute_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_If_Execute_FillStep();
				arduino_If_Execute_FillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_If_Execute_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_If_Execute_FillStep_Trace().add(
						arduino_If_Execute_FillStepInstance);
				break;

			case "Arduino_Project_Setup":

				// First we create the event
				arduinoTrace.Steps.Arduino_Project_Setup arduino_Project_SetupInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Project_Setup();
				arduino_Project_SetupInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Project_SetupInstance);
				}
				context.push(arduino_Project_SetupInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Project)
								arduino_Project_SetupInstance
										.setThis((fr.obeo.dsl.arduino.Project) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Project_Setup_Trace().add(
						arduino_Project_SetupInstance);
				break;

			case "Arduino_Status_Call_FillStep":

				// First we create the event
				arduinoTrace.Steps.Arduino_Status_Call_FillStep arduino_Status_Call_FillStepInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Status_Call_FillStep();
				arduino_Status_Call_FillStepInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Status_Call_FillStepInstance);
				}

				// Then we add it to its trace
				this.events.getArduino_Status_Call_FillStep_Trace().add(
						arduino_Status_Call_FillStepInstance);
				break;

			case "Arduino_Set_Execute":

				// First we create the event
				arduinoTrace.Steps.Arduino_Set_Execute arduino_Set_ExecuteInstance = arduinoTrace.Steps.StepsFactory.eINSTANCE
						.createArduino_Set_Execute();
				arduino_Set_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							arduino_Set_ExecuteInstance);
				}
				context.push(arduino_Set_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof fr.obeo.dsl.arduino.Set)
								arduino_Set_ExecuteInstance
										.setThis((fr.obeo.dsl.arduino.Set) v);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getArduino_Set_Execute_Trace().add(
						arduino_Set_ExecuteInstance);
				break;
			}

		}
	}

	@Override
	public void endEvent(String eventName, Object returnValue) {
		if (isMacro(eventName)) {
			context.pop().setEndingState(lastState);
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = arduinoTrace.ArduinoTraceFactory.eINSTANCE
				.createTrace();

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		// Create objects storage
		this.tracedObjects = arduinoTrace.Traced.TracedFactory.eINSTANCE
				.createTracedObjects();
		this.traceRoot.setTracedObjects(tracedObjects);

		// Create events storage
		this.events = arduinoTrace.Steps.StepsFactory.eINSTANCE.createSteps();
		this.traceRoot.setSteps(events);

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
	public EObject getExecutionState(int index) {
		return traceRoot.getStatesTrace().get(index);
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		arduinoTrace.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getVariable_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.Values.Variable_value_Value currenState : gs
				.getVariable_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getPin_level_Values().isEmpty())
			result.append("\nLevel values:");
		for (arduinoTrace.Values.Pin_level_Value currenState : gs
				.getPin_level_Values()) {
			result.append("\n\t" + currenState.getLevel());
		}

		if (!gs.getNumberValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.Values.NumberValue_value_Value currenState : gs
				.getNumberValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getStringValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.Values.StringValue_value_Value currenState : gs
				.getStringValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getBooleanValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (arduinoTrace.Values.BooleanValue_value_Value currenState : gs
				.getBooleanValue_value_Values()) {
			result.append("\n\t" + currenState.isValue());
		}

		if (gs.getFollowingStep() != null)
			result.append("\n\nFollowing small step: "
					+ gs.getFollowingStep().eClass().getName());
		if (!gs.getEndedBigSteps().isEmpty()) {
			result.append("\n\nFinished big steps: ");
			for (arduinoTrace.Steps.BigStep m : gs.getEndedBigSteps()) {
				result.append("\n\t" + m.eClass().getName());
				result.append(" (began at state "
						+ traceRoot.getStatesTrace().indexOf(
								m.getStartingState()) + ")");
			}
		}
		if (!gs.getStartedBigSteps().isEmpty()) {
			result.append("\n\nStarting big steps: ");
			for (arduinoTrace.Steps.BigStep m : gs.getStartedBigSteps()) {
				result.append("\n\t" + m.eClass().getName());
				if (m.getEndingState() != null) {
					result.append(" (ends at state "
							+ traceRoot.getStatesTrace().indexOf(
									m.getEndingState()) + ")");
				}
			}
		}

		result.deleteCharAt(0);
		return result.toString();
	}

	@Override
	public int getTraceSize() {
		return traceRoot.getStatesTrace().size();
	}

	@Override
	public boolean isMacro(String string) {
		return macroEvents.contains(string);
	}

	@Override
	public boolean addStateIfChanged() {
		return addState(true);
	}

	@Override
	public void addState() {
		addState(false);
	}

	@Override
	public String currentMacro() {
		if (!context.isEmpty())
			return context.getFirst().eClass().getName();
		else
			return null;
	}

	@Override
	public int getNumberOfValueTraces() {
		return getAllValueTraces().size();
	}

	@Override
	public Set<EObject> getAllCurrentValues() {
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getVariable_value_Values());
			currentValues.addAll(currentState.getPin_level_Values());
			currentValues.addAll(currentState.getNumberValue_value_Values());
			currentValues.addAll(currentState.getStringValue_value_Values());
			currentValues.addAll(currentState.getBooleanValue_value_Values());
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public String getDescriptionOfValue(EObject eObject) {
		if (eObject instanceof arduinoTrace.Values.Variable_value_Value) {
			return "arduinoTrace.Values.Variable_value_Value: "
					+ ((arduinoTrace.Values.Variable_value_Value) eObject)
							.getValue();
		} else if (eObject instanceof arduinoTrace.Values.Pin_level_Value) {
			return "arduinoTrace.Values.Pin_level_Value: "
					+ ((arduinoTrace.Values.Pin_level_Value) eObject)
							.getLevel();
		} else if (eObject instanceof arduinoTrace.Values.NumberValue_value_Value) {
			return "arduinoTrace.Values.NumberValue_value_Value: "
					+ ((arduinoTrace.Values.NumberValue_value_Value) eObject)
							.getValue();
		} else if (eObject instanceof arduinoTrace.Values.StringValue_value_Value) {
			return "arduinoTrace.Values.StringValue_value_Value: "
					+ ((arduinoTrace.Values.StringValue_value_Value) eObject)
							.getValue();
		} else if (eObject instanceof arduinoTrace.Values.BooleanValue_value_Value) {
			return "arduinoTrace.Values.BooleanValue_value_Value: "
					+ ((arduinoTrace.Values.BooleanValue_value_Value) eObject)
							.isValue();
		} else
			return "ERROR";
	}

	@Override
	public int getCurrentIndex() {
		return traceRoot.getStatesTrace().indexOf(currentState);
	}

}
