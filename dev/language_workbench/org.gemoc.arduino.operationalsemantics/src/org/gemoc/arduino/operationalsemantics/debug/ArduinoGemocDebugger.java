package org.gemoc.arduino.operationalsemantics.debug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiPredicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Value_EvaluableAspect;
import org.gemoc.execution.engine.core.EngineStoppedException;
import org.gemoc.execution.engine.debug.AbstractGemocDebugger;
import org.gemoc.execution.engine.debug.IGemocDebugger;
import org.gemoc.execution.engine.debug.ui.breakpoint.GemocBreakpoint;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.LogicalStep;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.MSEOccurrence;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.ISequentialExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.engine_addon.IEngineAddon;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ModelSpecificEvent;
import fr.obeo.dsl.arduino.ArduinoUtils;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Value;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;


public class ArduinoGemocDebugger extends AbstractGemocDebugger implements IEngineAddon, IGemocDebugger {

	/**
	 * Is the hardware stack frame pushed yet.
	 */
	private boolean hardwareFramePushed;

	/**
	 * {@link Pin} delta values.
	 */
	private Map<Pin, Integer> lastSuspendPins = new HashMap<Pin, Integer>();

	/**
	 * {@link Pin} delta values.
	 */
	private Map<Pin, Integer> nextSuspendPins = new HashMap<Pin, Integer>();

	/**
	 * {@link Value} delta values.
	 */
	private Map<Variable, Object> lastSuspendVariables = new HashMap<Variable, Object>();

	/**
	 * {@link Value} delta values.
	 */
	private Map<Variable, Object> nextSuspendVariables = new HashMap<Variable, Object>();
	
	
	/**
	 * A fake instruction to prevent the stepping return to stop on each event.
	 */
	private static final EObject FAKE_INSTRUCTION = EcorePackage.eINSTANCE;

	/**
	 * The {@link NonDeterministicExecutionEngine} to debug.
	 */
	private final ISequentialExecutionEngine engine;
	
	private static ArduinoGemocDebugger debugger;
	
	public static ArduinoGemocDebugger getCurrent(){return debugger;}

	public ArduinoGemocDebugger(IDSLDebugEventProcessor target, ISequentialExecutionEngine engine) {
		super(target);
		this.engine = engine;
		debugger = this;
	}

	@Override
	/*
	 * This method is eventually called within a new engine thread.
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.debug.ide.IDSLDebugger#start()
	 */
	public void start() {
		engine.start();
	}

	@Override
	public void disconnect() {
		return;
	}

	@Override
	/*
	 * For this debugger, instructions should only be MSEOcurrences
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.debug.ide.IDSLDebugger#canStepInto(java.lang.String,
	 * org.eclipse.emf.ecore.EObject)
	 */
	public boolean canStepInto(String threadName, EObject instruction) {
		// TODO generate code to test small/big step
		return true;
	}

	@Override
	public void steppingOver(String threadName) {
		// To send notifications, but probably useless
		super.steppingOver(threadName);

		// We add a future break as soon as the step is over
		addPredicateBreak(new BiPredicate<IBasicExecutionEngine, MSEOccurrence>() {

			// The operation we want to step over
			private MSEOccurrence steppedOver = engine.getCurrentMSEOccurrence();

			@Override
			public boolean test(IBasicExecutionEngine t, MSEOccurrence u) {
				// We finished stepping over once the mseoccurrence is not there
				// anymore
				return !engine.getCurrentStack().contains(steppedOver);
			}
		});
	}

	@Override
	public void steppingInto(String threadName) {
		// To send notifications, but probably useless
		super.steppingInto(threadName);

		// We add a future break asap
		addPredicateBreak(new BiPredicate<IBasicExecutionEngine, MSEOccurrence>() {
			@Override
			public boolean test(IBasicExecutionEngine t, MSEOccurrence u) {
				// We finished stepping as soon as we encounter a new step
				return true;
			}
		});

	}

//	boolean initFakeStackFrame = false;
//	String threadName = "a6tIIuOOz8Ir1ppWaAxAtKKoH";

	@Override
	/*
	 * This operation is called lots of time to update the stackframe view. We
	 * have to call "pushStackFrame" and "popStackFrame" to construct the
	 * stackframe.
	 * 
	 * TODO When using "pushStackFrame", we give the big step MSEOcc as
	 * the context, and the small step MSEOcc as the currentInstruction
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.debug.ide.IDSLDebugger#updateData(java.lang.String,
	 * org.eclipse.emf.ecore.EObject)
	 */
	public void updateData(String threadName, EObject instruction) {
		
		
		
		if (!hardwareFramePushed) {
			pushStackFrame(Thread.currentThread().getName(),
					lookForProject().getHardware().getName(),
					lookForProject().getHardware(), instruction);
			hardwareFramePushed = true;
		} else {
			setCurrentInstruction(Thread.currentThread().getName(), instruction);
		}
		for (Entry<Variable, Object> entry : nextSuspendVariables.entrySet()) {
			variable(threadName,
					lookForProject().getHardware().getName(), "variable",
					entry.getKey().getName(), entry.getValue(), true);
		}
		if (!nextSuspendVariables.isEmpty()) {
			lastSuspendVariables = nextSuspendVariables;
			nextSuspendVariables = new HashMap<Variable, Object>();
		}
		for (Entry<Pin, Integer> entry : nextSuspendPins.entrySet()) {
			variable(threadName,
					lookForProject().getHardware().getName(), "pin",
					"pin " + String.valueOf(entry.getKey().getId()),
					entry.getValue(), true);
		}
		if (!nextSuspendPins.isEmpty()) {
			lastSuspendPins = nextSuspendPins;
			nextSuspendPins = new HashMap<Pin, Integer>();
		}
		
		for (ToPushPop m : toPushPop) {
			if (m.push) {
				pushStackFrame(threadName, m.mseOccurrence.getMse().getName(), m.mseOccurrence, m.mseOccurrence);
			} else {
				popStackFrame(threadName);
			}
		}

		toPushPop.clear();

	}
	
	public void variableChanged(Variable variable, Object value) {
		final Object lastValue = lastSuspendVariables.get(variable);
		if ((lastValue == null && value != null)
				|| (lastValue != null && !lastValue.equals(value))) {
			nextSuspendVariables.put(variable, value);
		} else {
			nextSuspendVariables.remove(variable);
		}
	}

	public void pinChanged(Pin pin, Integer level) {
		final Integer lastLevel = lastSuspendPins.get(pin);
		if ((lastLevel == null && level != null) || !lastLevel.equals(level)) {
			nextSuspendPins.put(pin, level);
		} else {
			nextSuspendPins.remove(pin);
		}
	}
	
	private Project lookForProject() {
		EObject eObject = engine.getCurrentMSEOccurrence().getMse().getCaller();
		return ArduinoUtils.getContainingProject(eObject);
	}
	
	private Pin lookForPin(String variableName) {
		Pin pin = null;
		String pinNumber = variableName.replace("pin ", "");
		

		for (Connector connector : lookForProject().getSketch()
				.getHardware().getConnectors()) {
			if (String.valueOf(connector.getPin().getId()).equals(pinNumber)) {
				pin = connector.getPin();
				break;
			}
		}

		return pin;
	}

	private Variable lookForVariable(String variableName) {
		Variable variable = null;

		final Iterator<EObject> it = lookForProject().getSketch()
				.eAllContents();
		while (it.hasNext()) {
			final EObject eObj = it.next();
			if (eObj instanceof Variable
					&& ((Variable) eObj).getName().equals(variableName)) {
				variable = (Variable) eObj;
				break;
			}
		}

		return variable;
	}

	@Override
	public boolean shouldBreak(EObject instruction) {
		if (instruction instanceof MSEOccurrence) {
			return shouldBreakMSEOccurence((MSEOccurrence) instruction);
		}
		return false;
	}

	private boolean hasRegularBreakpointTrue(EObject o) {
		return super.shouldBreak(o)
				&& (Boolean.valueOf((String) getBreakpointAttributes(o, GemocBreakpoint.BREAK_ON_LOGICAL_STEP)) || Boolean
						.valueOf((String) getBreakpointAttributes(o, GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE)));

	}

	private boolean shouldBreakMSEOccurence(MSEOccurrence mseOccurrence) {

		if (shouldBreakPredicates(engine, mseOccurrence))
			return true;

		// If still no break yet, we look at regular breakpoints on MSE
		ModelSpecificEvent mse = mseOccurrence.getMse();
		if (hasRegularBreakpointTrue(mse)) {
			return true;
		}

		// If still no break yet, we look at regular breakpoints on MSE's caller
		EObject caller = mseOccurrence.getMse().getCaller();
		if (hasRegularBreakpointTrue(caller)) {
			return true;
		}

		return false;

	}

	@Override
	public EObject getNextInstruction(String threadName, EObject currentInstruction, Stepping stepping) {
		// We always return fakeinstruction to make sure to not stop and to
		// handle everything with shouldBreak
		return FAKE_INSTRUCTION;
	}

	@Override
	public void engineStarted(IBasicExecutionEngine executionEngine) {
		spawnRunningThread(Thread.currentThread().getName(), engine.getExecutionContext().getResourceModel()
				.getContents().get(0));
	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) {
		if (!isTerminated(Thread.currentThread().getName())) {
			terminated(Thread.currentThread().getName());
		}
	}

	@Override
	public void aboutToExecuteLogicalStep(IBasicExecutionEngine executionEngine, LogicalStep logicalStepToApply) {
		if (!control(Thread.currentThread().getName(), logicalStepToApply)) {
			throw new EngineStoppedException("Debug thread has stopped for "+executionEngine.getName());
		}
	}

	@Override
	public void aboutToExecuteMSEOccurrence(IBasicExecutionEngine executionEngine, MSEOccurrence mseOccurrence) {
		ToPushPop aaa = new ToPushPop(mseOccurrence, true);
		toPushPop.add(aaa);
		if (!control(Thread.currentThread().getName(), mseOccurrence)) {
			throw new EngineStoppedException("Debug thread has stopped for "+executionEngine.getName());
		}
	}
	
	@Override
	public void mseOccurrenceExecuted(IBasicExecutionEngine engine, MSEOccurrence mseOccurrence) {
		ToPushPop aaa = new ToPushPop(mseOccurrence, false);
		toPushPop.add(aaa);
	}

	@Override
	public void terminate() {
		super.terminate();
		engine.stop();
	}

	@Override
	public boolean validateVariableValue(String threadName, String variableName, String value) {
		final boolean res;

		final Pin pin = lookForPin(variableName);
		if (pin != null) {
			Integer level = null;
			try {
				level = Integer.valueOf(value);
			} catch (Exception e) {
				// nothing to do here.
			}
			res = level != null;
		} else {
			final Variable variable = lookForVariable(variableName);
			res = getValue(variable, value) != null;
		}

		return res;
	}

	private Object getValue(Variable variable, String value) {
		final Object res;

		final Object currentValue = Value_EvaluableAspect.evaluate(variable);
		
		if (currentValue instanceof String) {
			res = value;
		} else if (currentValue instanceof Integer) {
			Integer integerValue = null;
			try {
				integerValue = Integer.decode(value);
			} catch (Exception e) {
				// nothing to do here
			}
			res = integerValue;
		} else if (currentValue instanceof Double) {
			Double doubleValue = null;
			try {
				doubleValue = Double.parseDouble(value);
			} catch (Exception e) {
				// nothing to do here
			}
			res = doubleValue;
		} else if (currentValue instanceof Boolean) {
			res = Boolean.valueOf(value);
		} else {
			res = null;
		}

		return res;
	}
	
	@Override
	public Object getVariableValue(String threadName, String stackName, String variableName, String value) {
		final Object res;

		final Pin pin = lookForPin(variableName);
		if (pin != null) {
			Integer level = Integer.valueOf(value);
			res = level;
		} else {
			final Variable variable = lookForVariable(variableName);
			final Object valueObject = getValue(variable, value);
			res = valueObject;
		}

		return res;
	}

	@Override
	public void setVariableValue(String threadName, String stackName, String variableName, Object value) {
		final Pin pin = lookForPin(variableName);
		if (pin != null) {
			Pin_EvaluableAspect.setLevel(pin, (Integer) value);
		} else {
			final Variable variable = lookForVariable(variableName);
			Value_EvaluableAspect.setValue(variable, value);
		}
	}

	private static class ToPushPop {
		public MSEOccurrence mseOccurrence;
		public boolean push;

		ToPushPop(MSEOccurrence mseOccurrence, boolean push) {
			this.mseOccurrence = mseOccurrence;
			this.push = push;
		}
	}

	List<ToPushPop> toPushPop = new ArrayList<>();

	@Override
	public void engineAboutToStart(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineAboutToStop(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineAboutToDispose(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aboutToSelectLogicalStep(IBasicExecutionEngine engine,
			Collection<LogicalStep> logicalSteps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proposedLogicalStepsChanged(IBasicExecutionEngine engine,
			Collection<LogicalStep> logicalSteps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logicalStepSelected(IBasicExecutionEngine engine,
			LogicalStep selectedLogicalStep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logicalStepExecuted(IBasicExecutionEngine engine,
			LogicalStep logicalStepExecuted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineStatusChanged(IBasicExecutionEngine engine,
			RunStatus newStatus) {
		// TODO Auto-generated method stub
		
	}

}
