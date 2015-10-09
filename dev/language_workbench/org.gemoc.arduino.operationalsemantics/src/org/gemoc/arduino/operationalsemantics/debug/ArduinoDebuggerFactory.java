package org.gemoc.arduino.operationalsemantics.debug;

import org.gemoc.execution.engine.debug.AbstractGemocDebugger;
import org.gemoc.execution.engine.debug.AbstractGemocDebuggerFactory;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.ISequentialExecutionEngine;

import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;

public class ArduinoDebuggerFactory extends AbstractGemocDebuggerFactory{

	@Override
	public AbstractGemocDebugger createDebugger(IDSLDebugEventProcessor target, IBasicExecutionEngine engine) {
		return new ArduinoGemocDebugger(target, (ISequentialExecutionEngine) engine);
	}

}
